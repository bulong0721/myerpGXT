package org.adempiere.web.client.view;

import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.presenter.interfaces.INavigationView;
import org.adempiere.web.client.presenter.interfaces.INavigationView.INavigationPresenter;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;
import com.sencha.gxt.widget.core.client.tree.Tree;
import com.sencha.gxt.widget.core.client.tree.TreeSelectionModel;

@Singleton
public class NavigationView extends BaseReverseView<INavigationPresenter> implements INavigationView {

	private static NavigationViewUiBinder	uiBinder	= GWT.create(NavigationViewUiBinder.class);

	interface NavigationViewUiBinder extends UiBinder<Widget, NavigationView> {
	}

	@UiField(provided = true)
	TreeStore<AdMenuModel>				menuStore		= AdMenuModel.createTreeStore();
	@UiField(provided = true)
	ValueProvider<AdMenuModel, String>	valueProvider	= new AdMenuModel.MenuValueProvider();
	@UiField(provided = true)
	StoreFilterField<AdMenuModel>		filter			= new AdMenuModel.NameFilterField();
	@UiField
	TreeSelectionModel<AdMenuModel>		selection;
	@UiField
	Tree<AdMenuModel, String>			menuTree;

	@Override
	public Tree<AdMenuModel, String> getMenuTree() {
		return menuTree;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.widget = uiBinder.createAndBindUi(this);
			Images images = ResourcesFactory.createImages();
			this.menuTree.getStyle().setNodeOpenIcon(images.mOpen());
			this.menuTree.getStyle().setNodeCloseIcon(images.mClosed());
			this.filter.bind(menuStore);
		}
		return widget;
	}

	@Override
	public TreeStore<AdMenuModel> getTreeStore() {
		return menuStore;
	}
}
