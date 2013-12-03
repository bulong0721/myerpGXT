package org.adempiere.web.client.component;

import java.util.List;

import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.IAdTreeNode;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.loader.TreeLoader;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;
import com.sencha.gxt.widget.core.client.tree.Tree;

public class ADTreePanel implements IsWidget {

	private static ADTreePanelUiBinder	uiBinder	= GWT.create(ADTreePanelUiBinder.class);

	interface ADTreePanelUiBinder extends UiBinder<Widget, ADTreePanel> {
	}

	@UiField(provided = true)
	StoreFilterField<IAdTreeNode>	filter				= new IAdTreeNode.NameFilterField();
	@UiField(provided = true)
	Tree<IAdTreeNode, String>		tree;
	private TreeStore<IAdTreeNode>	store;
	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	private TreeLoader<IAdTreeNode>	loader;
	private Widget					widget;
	private int						treeId;

	public ADTreePanel(int treeId) {
		super();
		this.treeId = treeId;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.createTree();
			this.widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	private void createTree() {
		RpcProxy<IAdTreeNode, List<IAdTreeNode>> proxy = new RpcProxy<IAdTreeNode, List<IAdTreeNode>>() {
			@Override
			public void load(IAdTreeNode loadConfig, AsyncCallback<List<IAdTreeNode>> callback) {
				adempiereService.getAdMenuModels(callback);
			}
		};
		store = CommonUtil.createTreeStore();
		loader = new TreeLoader<IAdTreeNode>(proxy) {
			@Override
			public boolean hasChildren(IAdTreeNode parent) {
				return parent.hasChildren();
			}
		};
		loader.addLoadHandler(new IAdTreeNode.TreeStoreBinding(store));
		ValueProvider<IAdTreeNode, String> valueProvider = new IAdTreeNode.TreeValueProvider();
		tree = new Tree<IAdTreeNode, String>(store, valueProvider);
		IconProvider<IAdTreeNode> iconProvider = createIconProvider(treeId);
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
	
	private IconProvider<IAdTreeNode> createIconProvider(int adTreeId) {
		return AdMenuModel.createIconProvider();
	}

	public Tree<IAdTreeNode, String> getTree() {
		return tree;
	}

	public void expandAll() {

	}

	public void collapseAll() {

	}
}
