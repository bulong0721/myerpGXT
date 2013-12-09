package org.adempiere.web.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.util.LoggingUtil;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.loader.LoadEvent;
import com.sencha.gxt.data.shared.loader.LoadHandler;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;

public interface IAdTreeNode extends Serializable {

	String getName();

	Long getID();

	Long getParentID();

	boolean hasChildren();

	public static class TreeStoreBinding implements LoadHandler<IAdTreeNode, List<IAdTreeNode>> {
		private final TreeStore<IAdTreeNode>	store;

		public TreeStoreBinding(TreeStore<IAdTreeNode> store) {
			this.store = store;
		}

		@Override
		public void onLoad(LoadEvent<IAdTreeNode, List<IAdTreeNode>> event) {
			IAdTreeNode parent = event.getLoadConfig();
			List<IAdTreeNode> loadResult = event.getLoadResult();
			List<IAdTreeNode> children = getChildren(parent, loadResult);
			if (null == parent) {
				LoggingUtil.info("xxxxxxxxxxxxxxxxxxxx");
				store.add(children);
			} else {
				LoggingUtil.info("yyyyyyyyyyyyyyyyyyyy");
				store.replaceChildren(parent, children);
			}
		}

		protected List<IAdTreeNode> getChildren(IAdTreeNode parent, List<IAdTreeNode> loadResult) {
			List<IAdTreeNode> children = new ArrayList<IAdTreeNode>();
			Long parentId = null == parent ? 0L : parent.getID();
			for (IAdTreeNode model : loadResult) {
				if (parentId.equals(model.getParentID())) {
					children.add(model);
				}
			}
			return children;
		}

	}

	public static class NameFilterField extends StoreFilterField<IAdTreeNode> {
		@Override
		protected boolean doSelect(Store<IAdTreeNode> store, IAdTreeNode parent, IAdTreeNode item, String filter) {
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

	public static class TreeKeyProvider implements ModelKeyProvider<IAdTreeNode> {
		@Override
		public String getKey(IAdTreeNode item) {
			return String.valueOf(item.getID());
		}
	}

	public static class TreeValueProvider implements ValueProvider<IAdTreeNode, String> {

		@Override
		public String getValue(IAdTreeNode model) {
			return model.getName();
		}

		@Override
		public void setValue(IAdTreeNode object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}