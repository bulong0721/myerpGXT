package org.adempiere.web.client.view;

import org.adempiere.web.client.apps.TreePanel;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.presenter.interfaces.INavigationView;
import org.adempiere.web.client.presenter.interfaces.INavigationView.INavigationPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;

@Singleton
public class NavigationView extends BaseReverseView<INavigationPresenter> implements INavigationView {

	private static NavigationViewUiBinder	uiBinder	= GWT.create(NavigationViewUiBinder.class);

	interface NavigationViewUiBinder extends UiBinder<Widget, NavigationView> {
	}

	@UiField(provided = true)
	TreePanel	treepanel;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.treepanel = new TreePanel(MenuModel.TREE_ID);
			this.widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	@Override
	public TreePanel getTreePanel() {
		return treepanel;
	}

}
