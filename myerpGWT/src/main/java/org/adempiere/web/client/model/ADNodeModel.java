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

public interface ADNodeModel extends ADExchangeModel {

	String getName();

	Integer getID();

	Integer getParentID();

	void setParentID(int parentId);

	boolean hasChildren();

	public static class TreeStoreBinding implements LoadHandler<ADNodeModel, List<ADNodeModel>> {
		private final TreeStore<ADNodeModel>		store;
		private Map<Integer, ADNodeModel>		parentMap;
		private Map<Integer, List<ADNodeModel>>	leafMap;

		public TreeStoreBinding(TreeStore<ADNodeModel> store) {
			this.store = store;
		}

		@Override
		public void onLoad(LoadEvent<ADNodeModel, List<ADNodeModel>> event) {
			ADNodeModel parent = event.getLoadConfig();
			List<ADNodeModel> loadResult = event.getLoadResult();
			List<ADNodeModel> children = getChildren(parent, loadResult);
			if (null == parent) {
				// TODO 当前只计算了一层结构，需要遍历到最后一层
				store.add(children);
			} else {
				store.replaceChildren(parent, children);
			}
			// buildTree(loadResult);
		}

		@SuppressWarnings("unused")
		private void buildTree(List<ADNodeModel> resultList) {
			parentMap = new HashMap<Integer, ADNodeModel>();
			leafMap = new HashMap<Integer, List<ADNodeModel>>();
			for (ADNodeModel node : resultList) {
				List<ADNodeModel> nodeList = leafMap.get(node.getParentID());
				if (null == nodeList) {
					nodeList = new ArrayList<ADNodeModel>();
					leafMap.put(node.getParentID(), nodeList);
				}
				nodeList.add(node);
				if (node.hasChildren()) {
					parentMap.put(node.getID(), node);
				}
			}
			Set<Integer> attachSet = new HashSet<Integer>();
			for (Entry<Integer, ADNodeModel> entry : parentMap.entrySet()) {
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
			ADNodeModel node = parentMap.get(nodeId);
			if (node.getParentID() != 0) {
				addChild(node.getParentID(), attachSet);
			} else {
				store.add(node);
			}
			store.add(node, leafMap.get(nodeId));
			attachSet.add(nodeId);
		}

		protected List<ADNodeModel> getChildren(ADNodeModel parent, List<ADNodeModel> loadResult) {
			List<ADNodeModel> children = new ArrayList<ADNodeModel>();
			Integer parentId = null == parent ? 0 : parent.getID();
			for (ADNodeModel model : loadResult) {
				if (parentId.equals(model.getParentID())) {
					children.add(model);
				}
			}
			return children;
		}

	}

	public static class NameFilterField extends StoreFilterField<ADNodeModel> {
		@Override
		protected boolean doSelect(Store<ADNodeModel> store, ADNodeModel parent, ADNodeModel item, String filter) {
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

	public static class TreeKeyProvider implements ModelKeyProvider<ADNodeModel> {
		@Override
		public String getKey(ADNodeModel item) {
			return String.valueOf(item.getID());
		}
	}

	public static class TreeValueProvider implements ValueProvider<ADNodeModel, String> {

		@Override
		public String getValue(ADNodeModel model) {
			return model.getName();
		}

		@Override
		public void setValue(ADNodeModel object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}