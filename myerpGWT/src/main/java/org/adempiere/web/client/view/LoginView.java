package org.adempiere.web.client.view;

import org.adempiere.common.ADUserContext;
import org.adempiere.common.LookupValue;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.presenter.interfaces.ILoginView;
import org.adempiere.web.client.presenter.interfaces.ILoginView.ILoginPresenter;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.CommonUtil;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.client.widget.ConfirmToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;

@Singleton
public class LoginView extends BaseReverseView<ILoginPresenter> implements ILoginView, ConfirmToolListener {

	private static LoginViewUiBinder	uiBinder			= GWT.create(LoginViewUiBinder.class);
	protected AdempiereServiceAsync		adempiereService	= GWT.create(AdempiereService.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField(provided = true)
	ComboBox<LookupValue>	roleCombo, orgCombo, clientCombo;
	@UiField(provided = true)
	ComboBox<LookupValue>	warehouseCombo, printerCombo, langCombo;
	@UiField(provided = true)
	Images					images	= ResourcesFactory.getImages();
	@UiField
	TabItemConfig			connectionConfig, defaultConfig;
	@UiField
	TabPanel				tabContainer;
	@UiField
	TextField				userId;
	@UiField
	PasswordField			password;
	@UiField
	ConfirmToolBar			toolBar;

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
		langStore.add(new LookupValue("en", "English"));
		langStore.add(new LookupValue("zh_CN", "简体中文 (CN)"));
		langCombo = createComboBox(langStore, labelProvider);
		LookupValue initValue = langStore.findModelWithKey(Cookies.getCookie("lang"));
		langCombo.setValue(initValue, false);

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
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	@UiHandler({ "langCombo" })
	void onLangChanged(SelectionEvent<LookupValue> event) {
		String curValue = Cookies.getCookie("lang");
		String selValue = event.getSelectedItem().getValue();
		if (!StringUtil.equals(curValue, selValue)) {
			Cookies.setCookie("lang", selValue);
			Window.Location.reload();
		}
	}

	@Override
	public void onHelp() {

	}

	@Override
	public void onOK() {
		if (connectionConfig.isEnabled()) {
			if (vaildate()) {
				login();	
			}
		} else if (defaultConfig.isEnabled()) {
			BasePresenter<ILoginView, MyerpEventBus> presenter = getBasePresenter();
			presenter.getEventBus().goApplication();
		}
	}
	
	boolean vaildate() {
		return userId.validate() && password.validate();
	}
	
	void goDefaultCfg(ADUserContext userContext) {
		connectionConfig.setEnabled(false);
		defaultConfig.setEnabled(true);
		Widget defaultTab = tabContainer.getWidget(1);
		tabContainer.update(defaultTab, defaultConfig);
		tabContainer.setActiveWidget(defaultTab);
	}

	void login() {
		String username = this.userId.getValue();
		String password = this.password.getValue();
		AsyncSuccessCallback<ADUserContext> callback = new AsyncSuccessCallback<ADUserContext>() {
			@Override
			public void onSuccess(ADUserContext result) {
				goDefaultCfg(result);
			}
		};
		adempiereService.login(username, password, callback);
	}

	void updateContext() {

	}

	@Override
	public void onCancel() {

	}

}
