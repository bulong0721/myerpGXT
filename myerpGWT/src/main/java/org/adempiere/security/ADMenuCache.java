package org.adempiere.security;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.adempiere.common.MenuActionType;
import org.adempiere.util.PermissionUtil;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADNodeModel;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class ADMenuCache {
	private Map<Integer, Map<Integer, List<ADMenuModel>>>	roleMap	= Maps.newHashMap();
	private List<ADMenuModel>								menuList;

	public ADMenuCache(List<ADMenuModel> menuList) {
		this.menuList = menuList;
	}

	public List<ADNodeModel> getNodes(int parentID) {
		Comparator<ADMenuModel> comparator = new Comparator<ADMenuModel>() {
			@Override
			public int compare(ADMenuModel o1, ADMenuModel o2) {
				return o1.getSeqno().compareTo(o2.getSeqno());
			}
		};
		Set<ADMenuModel> nodeSet = Sets.newTreeSet(comparator);
		for (Integer userRole : PermissionUtil.getCurrentRoles()) {
			Map<Integer, List<ADMenuModel>> menuMap = roleMap.get(userRole);
			if (null == menuMap) {
				synchronized (this) {
					menuMap = buildTree4Role(menuList, userRole);
					roleMap.put(userRole, menuMap);
				}
			}
			List<ADMenuModel> children = menuMap.get(parentID);
			if (null != children) {
				nodeSet.addAll(children);
			}
		}
		return Lists.newArrayList(Collections2.transform(nodeSet, new Function<ADMenuModel, ADNodeModel>() {
			@Override
			public ADNodeModel apply(ADMenuModel input) {
				return input;
			}
		}));
	}

	private Map<Integer, List<ADMenuModel>> buildTree4Role(List<ADMenuModel> resultList, int roleID) {
		Map<Integer, List<ADMenuModel>> leafMap = Maps.newHashMap();
		for (ADMenuModel node : resultList) {
			if (!hasPermission(node, roleID)) {
				continue;
			}
			List<ADMenuModel> nodeList = leafMap.get(node.getParentID());
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
			ADMenuModel elem = itr.next();
			if (elem.isSummary() && !itr.hasChildren(elem)) {
				itr.removeFromParent(elem);
			}
		}
	}

	private boolean hasPermission(ADMenuModel node, int roleID) {
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

	static class PostOrderItr implements Iterator<ADMenuModel> {
		protected Map<Integer, List<ADMenuModel>>	tree;
		protected Stack<ADMenuModel>				stack;

		public PostOrderItr(Map<Integer, List<ADMenuModel>> tree) {
			this.tree = tree;
			this.stack = new Stack<ADMenuModel>();
			this.pushPostOrder(tree.get(0));
		}

		public void removeFromParent(ADMenuModel elem) {
			List<ADMenuModel> nodes = tree.get(elem.getParentID());
			if (null != nodes) {
				nodes.remove(elem);
			}
		}

		public boolean hasChildren(ADMenuModel elem) {
			List<ADMenuModel> children = tree.get(elem.getID());
			if (null != children) {
				return !children.isEmpty();
			}
			return false;
		}

		private void pushPostOrder(List<ADMenuModel> children) {
			for (ADMenuModel node : children) {
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
		public ADMenuModel next() {
			return stack.pop();
		}

		@Override
		public void remove() {
		}
	}
}
