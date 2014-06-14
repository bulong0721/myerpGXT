package org.adempiere.web.client.apps;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.NodeModel;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.TreeStore.TreeNode;
import com.sencha.gxt.data.shared.loader.TreeLoader;
import com.sencha.gxt.dnd.core.client.DND.Feedback;
import com.sencha.gxt.dnd.core.client.DndDropEvent;
import com.sencha.gxt.dnd.core.client.DndDropEvent.DndDropHandler;
import com.sencha.gxt.dnd.core.client.TreeDragSource;
import com.sencha.gxt.dnd.core.client.TreeDropTarget;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;
import com.sencha.gxt.widget.core.client.tree.Tree;

public class ADTreePanel implements IsWidget {

	private static ADTreePanelUiBinder	uiBinder	= GWT.create(ADTreePanelUiBinder.class);

	interface ADTreePanelUiBinder extends UiBinder<Widget, ADTreePanel> {
	}

	@UiField(provided = true)
	StoreFilterField<NodeModel>		filter;
	@UiField(provided = true)
	Tree<NodeModel, String>			tree;
	@UiField
	CheckBox							chkExpandAll;
	private TreeStore<NodeModel>		store;
	private AdempiereServiceAsync		adempiereService	= GWT.create(AdempiereService.class);
	private TreeLoader<NodeModel>		loader;
	private Widget						widget;
	private int							treeId;
	private TreeDragSource<NodeModel>	dragSource;
	private TreeDropTarget<NodeModel>	dropTarget;
	private Set<NodeModel>			changes;

	public ADTreePanel(int treeId) {
		super();
		this.treeId = treeId;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.filter = new NodeModel.NameFilterField();
			this.createTree();
			this.widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	@UiHandler("chkExpandAll")
	void onExpandValueChange(ValueChangeEvent<Boolean> event) {
		if (event.getValue()) {
			this.expandAll();
		} else {
			this.collapseAll();
		}
	}

	private void createTree() {
		RpcProxy<NodeModel, List<NodeModel>> proxy = new RpcProxy<NodeModel, List<NodeModel>>() {
			@Override
			public void load(NodeModel loadConfig, AsyncCallback<List<NodeModel>> callback) {
				int parentID = null == loadConfig ? 0 : loadConfig.getID();
				adempiereService.getMenuNodes(parentID, callback);
			}
		};
		store = CommonUtil.createTreeStore();
		loader = new TreeLoader<NodeModel>(proxy) {
			@Override
			public boolean hasChildren(NodeModel parent) {
				return parent.hasChildren();
			}
		};
		loader.addLoadHandler(new NodeModel.TreeStoreBinding(store));
		ValueProvider<NodeModel, String> valueProvider = new NodeModel.TreeValueProvider();
		tree = new Tree<NodeModel, String>(store, valueProvider);
		IconProvider<NodeModel> iconProvider = createIconProvider(treeId);
		tree.setIconProvider(iconProvider);
		tree.setLoader(loader);
		Images images = ResourcesFactory.getImages();
		tree.getStyle().setNodeOpenIcon(images.mOpen());
		tree.getStyle().setNodeCloseIcon(images.mClosed());
		filter.bind(store);
	}

	public void loadTree() {
		this.loader.load();
	}

	private IconProvider<NodeModel> createIconProvider(int adTreeId) {
		return MenuModel.createIconProvider();
	}

	public Tree<NodeModel, String> getTree() {
		return tree;
	}

	public void enableDnD() {
		this.asWidget();
		if (null == dragSource) {
			dragSource = new TreeDragSource<NodeModel>(tree);
			dropTarget = new TreeDropTarget<NodeModel>(tree);
			dropTarget.setAllowSelfAsSource(true);
			dropTarget.setFeedback(Feedback.BOTH);
			dropTarget.addDropHandler(new DndDropHandler() {
				@Override
				public void onDrop(DndDropEvent event) {
					@SuppressWarnings("unchecked")
					List<TreeNode<NodeModel>> selectedNodes = (List<TreeNode<NodeModel>>) event.getData();
					if (null != selectedNodes) {
						TreeNode<NodeModel> node = selectedNodes.get(0);
						NodeModel parent = tree.getStore().getParent(node.getData());
						for (TreeNode<NodeModel> selectNode : selectedNodes) {
							NodeModel selectData = selectNode.getData();
							selectData.setParentID(parent.getID());
							getChanges().add(selectData);
						}
					}
				}
			});
		}
		dragSource.enable();
		dropTarget.enable();
	}

	public Set<NodeModel> getChanges() {
		if (null == changes) {
			changes = new HashSet<NodeModel>();
		}
		return changes;
	}

	public void acceptChanges() {
		if (null != changes) {
			changes.clear();
		}
	}

	public void disableDnD() {
		if (null != dragSource) {
			dragSource.disable();
			dropTarget.disable();
		}
	}

	public void expandAll() {
		tree.expandAll();
		chkExpandAll.setValue(true);
	}

	public void collapseAll() {
		tree.collapseAll();
		chkExpandAll.setValue(false);
	}
}
