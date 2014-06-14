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

public interface NodeModel extends GwtSerializable {

	String getName();

	Integer getID();

	Integer getParentID();

	void setParentID(int parentId);

	boolean hasChildren();

	public static class TreeStoreBinding implements LoadHandler<NodeModel, List<NodeModel>> {
		private final TreeStore<NodeModel>		store;
		private Map<Integer, NodeModel>		parentMap;
		private Map<Integer, List<NodeModel>>	leafMap;

		public TreeStoreBinding(TreeStore<NodeModel> store) {
			this.store = store;
		}

		@Override
		public void onLoad(LoadEvent<NodeModel, List<NodeModel>> event) {
			NodeModel parent = event.getLoadConfig();
			List<NodeModel> loadResult = event.getLoadResult();
			List<NodeModel> children = getChildren(parent, loadResult);
			if (null == parent) {
				// TODO 当前只计算了一层结构，需要遍历到最后一层
				store.add(children);
			} else {
				store.replaceChildren(parent, children);
			}
			// buildTree(loadResult);
		}

		@SuppressWarnings("unused")
		private void buildTree(List<NodeModel> resultList) {
			parentMap = new HashMap<Integer, NodeModel>();
			leafMap = new HashMap<Integer, List<NodeModel>>();
			for (NodeModel node : resultList) {
				List<NodeModel> nodeList = leafMap.get(node.getParentID());
				if (null == nodeList) {
					nodeList = new ArrayList<NodeModel>();
					leafMap.put(node.getParentID(), nodeList);
				}
				nodeList.add(node);
				if (node.hasChildren()) {
					parentMap.put(node.getID(), node);
				}
			}
			Set<Integer> attachSet = new HashSet<Integer>();
			for (Entry<Integer, NodeModel> entry : parentMap.entrySet()) {
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
			NodeModel node = parentMap.get(nodeId);
			if (node.getParentID() != 0) {
				addChild(node.getParentID(), attachSet);
			} else {
				store.add(node);
			}
			store.add(node, leafMap.get(nodeId));
			attachSet.add(nodeId);
		}

		protected List<NodeModel> getChildren(NodeModel parent, List<NodeModel> loadResult) {
			List<NodeModel> children = new ArrayList<NodeModel>();
			Integer parentId = null == parent ? 0 : parent.getID();
			for (NodeModel model : loadResult) {
				if (parentId.equals(model.getParentID())) {
					children.add(model);
				}
			}
			return children;
		}

	}

	public static class NameFilterField extends StoreFilterField<NodeModel> {
		@Override
		protected boolean doSelect(Store<NodeModel> store, NodeModel parent, NodeModel item, String filter) {
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

	public static class TreeKeyProvider implements ModelKeyProvider<NodeModel> {
		@Override
		public String getKey(NodeModel item) {
			return String.valueOf(item.getID());
		}
	}

	public static class TreeValueProvider implements ValueProvider<NodeModel, String> {

		@Override
		public String getValue(NodeModel model) {
			return model.getName();
		}

		@Override
		public void setValue(NodeModel object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}