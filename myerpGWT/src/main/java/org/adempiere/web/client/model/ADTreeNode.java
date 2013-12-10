package org.adempiere.web.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.loader.LoadEvent;
import com.sencha.gxt.data.shared.loader.LoadHandler;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;

public interface ADTreeNode extends Serializable {

	String getName();

	Long getID();

	Long getParentID();

	boolean hasChildren();

	public static class TreeStoreBinding implements LoadHandler<ADTreeNode, List<ADTreeNode>> {
		private final TreeStore<ADTreeNode>	store;

		public TreeStoreBinding(TreeStore<ADTreeNode> store) {
			this.store = store;
		}

		@Override
		public void onLoad(LoadEvent<ADTreeNode, List<ADTreeNode>> event) {
			ADTreeNode parent = event.getLoadConfig();
			List<ADTreeNode> loadResult = event.getLoadResult();
			List<ADTreeNode> children = getChildren(parent, loadResult);
			if (null == parent) {
				//TODO 当前只计算了一层结构，需要遍历到最后一层
				store.add(children);
			} else {
				store.replaceChildren(parent, children);
			}
		}

		protected List<ADTreeNode> getChildren(ADTreeNode parent, List<ADTreeNode> loadResult) {
			List<ADTreeNode> children = new ArrayList<ADTreeNode>();
			Long parentId = null == parent ? 0L : parent.getID();
			for (ADTreeNode model : loadResult) {
				if (parentId.equals(model.getParentID())) {
					children.add(model);
				}
			}
			return children;
		}

	}

	public static class NameFilterField extends StoreFilterField<ADTreeNode> {
		@Override
		protected boolean doSelect(Store<ADTreeNode> store, ADTreeNode parent, ADTreeNode item, String filter) {
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

	public static class TreeKeyProvider implements ModelKeyProvider<ADTreeNode> {
		@Override
		public String getKey(ADTreeNode item) {
			return String.valueOf(item.getID());
		}
	}

	public static class TreeValueProvider implements ValueProvider<ADTreeNode, String> {

		@Override
		public String getValue(ADTreeNode model) {
			return model.getName();
		}

		@Override
		public void setValue(ADTreeNode object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}