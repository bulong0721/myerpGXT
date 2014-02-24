package org.adempiere.web.client.apps;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADTreeNode;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;
import org.adempiere.web.client.util.LoggingUtil;

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
	StoreFilterField<ADTreeNode>		filter;
	@UiField(provided = true)
	Tree<ADTreeNode, String>			tree;
	@UiField
	CheckBox							chkExpandAll;
	private TreeStore<ADTreeNode>		store;
	private AdempiereServiceAsync		adempiereService	= GWT.create(AdempiereService.class);
	private TreeLoader<ADTreeNode>		loader;
	private Widget						widget;
	private int							treeId;
	private TreeDragSource<ADTreeNode>	dragSource;
	private TreeDropTarget<ADTreeNode>	dropTarget;
	private Set<ADTreeNode>				changes;

	public ADTreePanel(int treeId) {
		super();
		this.treeId = treeId;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.filter = new ADTreeNode.NameFilterField();
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
		RpcProxy<ADTreeNode, List<ADTreeNode>> proxy = new RpcProxy<ADTreeNode, List<ADTreeNode>>() {
			@Override
			public void load(ADTreeNode loadConfig, AsyncCallback<List<ADTreeNode>> callback) {
				adempiereService.getAdMenuModels(callback);
			}
		};
		store = CommonUtil.createTreeStore();
		loader = new TreeLoader<ADTreeNode>(proxy) {
			@Override
			public boolean hasChildren(ADTreeNode parent) {
				return parent.hasChildren();
			}
		};
		loader.addLoadHandler(new ADTreeNode.TreeStoreBinding(store));
		ValueProvider<ADTreeNode, String> valueProvider = new ADTreeNode.TreeValueProvider();
		tree = new Tree<ADTreeNode, String>(store, valueProvider);
		IconProvider<ADTreeNode> iconProvider = createIconProvider(treeId);
		tree.setIconProvider(iconProvider);
		tree.setLoader(loader);
		Images images = ResourcesFactory.createImages();
		tree.getStyle().setNodeOpenIcon(images.mOpen());
		tree.getStyle().setNodeCloseIcon(images.mClosed());
		filter.bind(store);
	}

	public void loadTree() {
		this.loader.load();
	}

	private IconProvider<ADTreeNode> createIconProvider(int adTreeId) {
		return ADMenuModel.createIconProvider();
	}

	public Tree<ADTreeNode, String> getTree() {
		return tree;
	}

	public void enableDnD() {
		this.asWidget();
		if (null == dragSource) {
			dragSource = new TreeDragSource<ADTreeNode>(tree);
			dropTarget = new TreeDropTarget<ADTreeNode>(tree);
			dropTarget.setAllowSelfAsSource(true);
			dropTarget.setFeedback(Feedback.BOTH);
			dropTarget.addDropHandler(new DndDropHandler() {
				@Override
				public void onDrop(DndDropEvent event) {
					@SuppressWarnings("unchecked")
					List<TreeNode<ADTreeNode>> selectedNodes = (List<TreeNode<ADTreeNode>>) event.getData();
					if (null != selectedNodes) {
						TreeNode<ADTreeNode> node = selectedNodes.get(0);
						ADTreeNode parent = tree.getStore().getParent(node.getData());
						for (TreeNode<ADTreeNode> selectNode : selectedNodes) {
							ADTreeNode selectData = selectNode.getData();
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

	public Set<ADTreeNode> getChanges() {
		if (null == changes) {
			changes = new HashSet<ADTreeNode>();
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
