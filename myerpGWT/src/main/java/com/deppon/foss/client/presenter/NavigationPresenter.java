package com.deppon.foss.client.presenter;

import java.util.ArrayList;
import java.util.List;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.model.AdMenuModel;
import com.deppon.foss.client.presenter.interfaces.INavigationView;
import com.deppon.foss.client.presenter.interfaces.INavigationView.INavigationPresenter;
import com.deppon.foss.client.service.AdempiereServiceAsync;
import com.deppon.foss.client.util.StringUtil;
import com.deppon.foss.client.view.NavigationView;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.loader.ChildTreeStoreBinding;
import com.sencha.gxt.data.shared.loader.LoadEvent;
import com.sencha.gxt.data.shared.loader.TreeLoader;
import com.sencha.gxt.widget.core.client.tree.Tree;

@Presenter(view = NavigationView.class)
public class NavigationPresenter extends BasePresenter<INavigationView, MyerpEventBus> implements INavigationPresenter {

	@Inject
	private AdempiereServiceAsync	adempiereService;
	private TreeLoader<AdMenuModel>	loader;
	private boolean					hadLoaded;

	public AdempiereServiceAsync getAdempiereServiceAsync() {
		return adempiereService;
	}

	public void onLoadMenu() {
		if (null != loader && !hadLoaded) {
			loader.load();
			hadLoaded = true;
		}
	}

	@Override
	public void bind() {
		RpcProxy<AdMenuModel, List<AdMenuModel>> proxy = new RpcProxy<AdMenuModel, List<AdMenuModel>>() {
			@Override
			public void load(AdMenuModel loadConfig, AsyncCallback<List<AdMenuModel>> callback) {
				adempiereService.getAdMenu(callback);
			}
		};
		final TreeStore<AdMenuModel> store = view.getTreeStore();
		loader = new TreeLoader<AdMenuModel>(proxy) {
			@Override
			public boolean hasChildren(AdMenuModel parent) {
				return null == parent.getAction() || 0 == parent.getAction().length();
			}
		};
		loader.addLoadHandler(new ChildTreeStoreBinding<AdMenuModel>(store) {
			@Override
			public void onLoad(LoadEvent<AdMenuModel, List<AdMenuModel>> event) {
				AdMenuModel parent = event.getLoadConfig();
				List<AdMenuModel> loadResult = event.getLoadResult();
				List<AdMenuModel> children = getChildren(parent, loadResult);
				if (null == parent) {
					store.add(children);
				} else {
					store.replaceChildren(parent, children);
				}
			}
		});
		Tree<AdMenuModel, String> menuTree = view.getMenuTree();
		IconProvider<AdMenuModel> iconProvider = AdMenuModel.createIconProvider();
		menuTree.setIconProvider(iconProvider);
		menuTree.setLoader(loader);
		menuTree.getSelectionModel().addSelectionHandler(new SelectionHandler<AdMenuModel>() {
			@Override
			public void onSelection(SelectionEvent<AdMenuModel> event) {
				AdMenuModel item = event.getSelectedItem();
				if (!StringUtil.isNullOrEmpty(item.getAction())) {
					getEventBus().showPage(item);
				}
			}
		});
	}

	List<AdMenuModel> getChildren(AdMenuModel parent, List<AdMenuModel> loadResult) {
		List<AdMenuModel> children = new ArrayList<AdMenuModel>();
		Long parentId = null == parent ? 0L : parent.getAdMenuId();
		for (AdMenuModel model : loadResult) {
			if (parentId.equals(model.getParentId())) {
				children.add(model);
			}
		}
		return children;
	}
}
