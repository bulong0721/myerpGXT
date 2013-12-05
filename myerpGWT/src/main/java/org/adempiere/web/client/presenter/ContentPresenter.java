package org.adempiere.web.client.presenter;

import org.adempiere.model.common.MenuActionType;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.desktop.TabbedDesktop;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.presenter.interfaces.IContentView;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.view.ContentView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ContentView.class)
public class ContentPresenter extends BasePresenter<IContentView, MyerpEventBus> implements IContentPresenter {
	private IDesktop	desktop;

	public IDesktop onGetDesktop() {
		return desktop;
	}

	public void onShowPage(AdMenuModel node) {
		MenuActionType action = MenuActionType.fromString(node.getAction());
		if (null == desktop) {
			desktop = new TabbedDesktop(getView().getTabSet());
		}
		if (action.isWindow()) {
			onGetDesktop().openWindow(node.getName(), node.getAdWindowId());
		} else if (action.isReport()) {
			onGetDesktop().openReport(node.getName(), node.getAdProcessId());
		} else if (action.isProcess()) {
			onGetDesktop().openPorcess(node.getName(), node.getAdProcessId());
		} else if (action.isForm()) {
			onGetDesktop().openForm(node.getName(), node.getAdFormId());
		}
	}

}
