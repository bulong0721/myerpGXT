package org.adempiere.web.client.presenter.interfaces;

import org.adempiere.web.client.apps.TreePanel;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface INavigationView extends ReverseViewInterface<INavigationView.INavigationPresenter>, IsWidget {

	public interface INavigationPresenter {

	}

	TreePanel getTreePanel();
}
