package org.adempiere.web.client.presenter.interfaces;

import org.adempiere.web.client.apps.ADTreePanel;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface INavigationView extends ReverseViewInterface<INavigationView.INavigationPresenter>, IsWidget {

	public interface INavigationPresenter {

	}

	// Tree<IAdTreeNode, String> getMenuTree();
	//
	// TreeStore<AdMenuModel> getTreeStore();

	ADTreePanel getTreePanel();
}
