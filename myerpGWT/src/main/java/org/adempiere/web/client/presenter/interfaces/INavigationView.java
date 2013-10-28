package org.adempiere.web.client.presenter.interfaces;

import org.adempiere.web.client.model.AdMenuModel;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.tree.Tree;

public interface INavigationView extends ReverseViewInterface<INavigationView.INavigationPresenter>, IsWidget {

	public interface INavigationPresenter {

	}

	Tree<AdMenuModel, String> getMenuTree();
	
	TreeStore<AdMenuModel> getTreeStore();
}