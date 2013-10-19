package com.deppon.foss.client.view;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.event.ConfirmToolListener;
import com.deppon.foss.client.presenter.interfaces.ILoginView;
import com.deppon.foss.client.presenter.interfaces.ILoginView.ILoginPresenter;
import com.deppon.foss.client.resources.Images;
import com.deppon.foss.client.resources.ResourcesFactory;
import com.deppon.foss.client.util.CommonUtil;
import com.deppon.foss.client.util.WidgetUtil;
import com.deppon.foss.client.widget.ConfirmToolBar;
import com.deppon.foss.shared.LookupValue;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;

@Singleton
public class LoginView extends BaseReverseView<ILoginPresenter> implements ILoginView, ConfirmToolListener {

	private static LoginViewUiBinder	uiBinder	= GWT.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField(provided = true)
	ComboBox<LookupValue>	roleCombo, orgCombo, clientCombo;
	@UiField(provided = true)
	ComboBox<LookupValue>	warehouseCombo, printerCombo, langCombo;
	@UiField(provided = true)
	Images					images	= ResourcesFactory.createImages();
	@UiField
	ConfirmToolBar			toolBar;
	@UiField
	TextField				userId;

	public LoginView() {
		initWidgets();
	}

	private void initWidgets() {
		LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
		ListStore<LookupValue> roleStore = CommonUtil.createDataSource();
		roleCombo = createComboBox(roleStore, labelProvider);

		ListStore<LookupValue> orgStore = CommonUtil.createDataSource();
		orgCombo = createComboBox(orgStore, labelProvider);

		ListStore<LookupValue> langStore = CommonUtil.createDataSource();
		langCombo = createComboBox(langStore, labelProvider);

		ListStore<LookupValue> clientStore = CommonUtil.createDataSource();
		clientCombo = createComboBox(clientStore, labelProvider);

		ListStore<LookupValue> warehouseStore = CommonUtil.createDataSource();
		warehouseCombo = createComboBox(warehouseStore, labelProvider);

		ListStore<LookupValue> printerStore = CommonUtil.createDataSource();
		printerCombo = createComboBox(printerStore, labelProvider);
	}

	<T> ComboBox<T> createComboBox(ListStore<T> listStore, LabelProvider<T> labelProvider) {
		return new ComboBox<T>(listStore, labelProvider);
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			toolBar.addToolbarListener(this);
			WidgetUtil.doLayout(widget);
		}
		return widget;
	}

	@Override
	public void onHelp() {
		
	}

	@Override
	public void onOK() {
		BasePresenter<ILoginView, MyerpEventBus> presenter = getBasePresenter();
		presenter.getEventBus().goApplication();
	}

	@Override
	public void onCancel() {
		
	}

}
