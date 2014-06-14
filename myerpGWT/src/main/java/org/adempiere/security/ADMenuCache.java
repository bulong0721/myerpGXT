package org.adempiere.security;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.adempiere.common.MenuActionType;
import org.adempiere.util.PermissionUtil;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.NodeModel;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class ADMenuCache {
	private Map<Integer, Map<Integer, List<MenuModel>>>	roleMap	= Maps.newHashMap();
	private List<MenuModel>								menuList;

	public ADMenuCache(List<MenuModel> menuList) {
		this.menuList = menuList;
	}

	public List<NodeModel> getNodes(int parentID) {
		Comparator<MenuModel> comparator = new Comparator<MenuModel>() {
			@Override
			public int compare(MenuModel o1, MenuModel o2) {
				return o1.getSeqno().compareTo(o2.getSeqno());
			}
		};
		Set<MenuModel> nodeSet = Sets.newTreeSet(comparator);
		for (Integer userRole : PermissionUtil.getCurrentRoles()) {
			Map<Integer, List<MenuModel>> menuMap = roleMap.get(userRole);
			if (null == menuMap) {
				synchronized (this) {
					menuMap = buildTree4Role(menuList, userRole);
					roleMap.put(userRole, menuMap);
				}
			}
			List<MenuModel> children = menuMap.get(parentID);
			if (null != children) {
				nodeSet.addAll(children);
			}
		}
		return Lists.newArrayList(Collections2.transform(nodeSet, new Function<MenuModel, NodeModel>() {
			@Override
			public NodeModel apply(MenuModel input) {
				return input;
			}
		}));
	}

	private Map<Integer, List<MenuModel>> buildTree4Role(List<MenuModel> resultList, int roleID) {
		Map<Integer, List<MenuModel>> leafMap = Maps.newHashMap();
		for (MenuModel node : resultList) {
			if (!hasPermission(node, roleID)) {
				continue;
			}
			List<MenuModel> nodeList = leafMap.get(node.getParentID());
			if (null == nodeList) {
				nodeList = Lists.newArrayList();
				leafMap.put(node.getParentID(), nodeList);
			}
			nodeList.add(node);
		}
		PostOrderItr poi = new PostOrderItr(leafMap);
		trimEmptyNodes(poi);
		return leafMap;
	}

	private void trimEmptyNodes(PostOrderItr itr) {
		while (itr.hasNext()) {
			MenuModel elem = itr.next();
			if (elem.isSummary() && !itr.hasChildren(elem)) {
				itr.removeFromParent(elem);
			}
		}
	}

	private boolean hasPermission(MenuModel node, int roleID) {
		MenuActionType action = MenuActionType.fromString(node.getAction());
		if (action.isWindow()) {
			return ACLProviders.getWindowProvider().getAccessList(roleID).containsKey(node.getAdWindowId());
		} else if (action.isProcess() || action.isReport()) {
			return ACLProviders.getProcessProvider().getAccessList(roleID).containsKey(node.getAdProcessId());
		} else if (action.isForm()) {
			return ACLProviders.getFormProvider().getAccessList(roleID).containsKey(node.getAdFormId());
		} else if (action.isWorkFlow()) {
			return ACLProviders.getWorkflowProvider().getAccessList(roleID).containsKey(node.getAdWorkflowId());
		}
		return true;
	}

	static class PostOrderItr implements Iterator<MenuModel> {
		protected Map<Integer, List<MenuModel>>	tree;
		protected Stack<MenuModel>				stack;

		public PostOrderItr(Map<Integer, List<MenuModel>> tree) {
			this.tree = tree;
			this.stack = new Stack<MenuModel>();
			this.pushPostOrder(tree.get(0));
		}

		public void removeFromParent(MenuModel elem) {
			List<MenuModel> nodes = tree.get(elem.getParentID());
			if (null != nodes) {
				nodes.remove(elem);
			}
		}

		public boolean hasChildren(MenuModel elem) {
			List<MenuModel> children = tree.get(elem.getID());
			if (null != children) {
				return !children.isEmpty();
			}
			return false;
		}

		private void pushPostOrder(List<MenuModel> children) {
			for (MenuModel node : children) {
				this.stack.push(node);
				if (node.isSummary() && tree.containsKey(node.getID())) {
					pushPostOrder(tree.get(node.getID()));
				}
			}
		}

		@Override
		public boolean hasNext() {
			return !stack.empty();
		}

		@Override
		public MenuModel next() {
			return stack.pop();
		}

		@Override
		public void remove() {
		}
	}
}
