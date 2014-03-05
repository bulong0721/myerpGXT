package org.adempiere.web.client.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.loader.LoadEvent;
import com.sencha.gxt.data.shared.loader.LoadHandler;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;

public interface IsTreeNode extends IsADRPCModel {

	String getName();

	Integer getID();

	Integer getParentID();

	void setParentID(int parentId);

	boolean hasChildren();

	public static class TreeStoreBinding implements LoadHandler<IsTreeNode, List<IsTreeNode>> {
		private final TreeStore<IsTreeNode>		store;
		private Map<Integer, IsTreeNode>		parentMap;
		private Map<Integer, List<IsTreeNode>>	leafMap;

		public TreeStoreBinding(TreeStore<IsTreeNode> store) {
			this.store = store;
		}

		@Override
		public void onLoad(LoadEvent<IsTreeNode, List<IsTreeNode>> event) {
			IsTreeNode parent = event.getLoadConfig();
			List<IsTreeNode> loadResult = event.getLoadResult();
			List<IsTreeNode> children = getChildren(parent, loadResult);
			if (null == parent) {
				// TODO 当前只计算了一层结构，需要遍历到最后一层
				store.add(children);
			} else {
				store.replaceChildren(parent, children);
			}
			// buildTree(loadResult);
		}

		@SuppressWarnings("unused")
		private void buildTree(List<IsTreeNode> resultList) {
			parentMap = new HashMap<Integer, IsTreeNode>();
			leafMap = new HashMap<Integer, List<IsTreeNode>>();
			for (IsTreeNode node : resultList) {
				List<IsTreeNode> nodeList = leafMap.get(node.getParentID());
				if (null == nodeList) {
					nodeList = new ArrayList<IsTreeNode>();
					leafMap.put(node.getParentID(), nodeList);
				}
				nodeList.add(node);
				if (node.hasChildren()) {
					parentMap.put(node.getID(), node);
				}
			}
			Set<Integer> attachSet = new HashSet<Integer>();
			for (Entry<Integer, IsTreeNode> entry : parentMap.entrySet()) {
				if (attachSet.contains(entry.getKey())) {
					continue;
				}
				addChild(entry.getKey(), attachSet);
			}
		}

		private void addChild(Integer nodeId, Set<Integer> attachSet) {
			if (attachSet.contains(nodeId)) {
				return;
			}
			IsTreeNode node = parentMap.get(nodeId);
			if (node.getParentID() != 0) {
				addChild(node.getParentID(), attachSet);
			} else {
				store.add(node);
			}
			store.add(node, leafMap.get(nodeId));
			attachSet.add(nodeId);
		}

		protected List<IsTreeNode> getChildren(IsTreeNode parent, List<IsTreeNode> loadResult) {
			List<IsTreeNode> children = new ArrayList<IsTreeNode>();
			Integer parentId = null == parent ? 0 : parent.getID();
			for (IsTreeNode model : loadResult) {
				if (parentId.equals(model.getParentID())) {
					children.add(model);
				}
			}
			return children;
		}

	}

	public static class NameFilterField extends StoreFilterField<IsTreeNode> {
		@Override
		protected boolean doSelect(Store<IsTreeNode> store, IsTreeNode parent, IsTreeNode item, String filter) {
			if (null != parent && null != filter) {
				String itemName = parent.getName().toLowerCase();
				return itemName.contains(filter.toLowerCase());
			}
			if (null != item && null != filter) {
				String itemName = item.getName().toLowerCase();
				return itemName.contains(filter.toLowerCase());
			}
			return false;
		}
	}

	public static class TreeKeyProvider implements ModelKeyProvider<IsTreeNode> {
		@Override
		public String getKey(IsTreeNode item) {
			return String.valueOf(item.getID());
		}
	}

	public static class TreeValueProvider implements ValueProvider<IsTreeNode, String> {

		@Override
		public String getValue(IsTreeNode model) {
			return model.getName();
		}

		@Override
		public void setValue(IsTreeNode object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}