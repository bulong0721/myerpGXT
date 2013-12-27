package org.adempiere.web.client.presenter;

import org.adempiere.model.common.MenuActionType;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.desktop.IDesktopHolder;
import org.adempiere.web.client.desktop.TabbedDesktop;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.presenter.interfaces.IContentView;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.view.ContentView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ContentView.class)
public class ContentPresenter extends BasePresenter<IContentView, MyerpEventBus> implements IContentPresenter {
	private IDesktop	desktop;

	private IDesktop getDesktop() {
		if (null == desktop) {
			desktop = new TabbedDesktop(getView().getTabPanel());
		}
		return desktop;
	}

	public void onInjectDesktop(IDesktopHolder desktopHolder) {
		desktopHolder.setDesktop(getDesktop());
	}

	public void onShowPage(ADMenuModel node) {
		MenuActionType action = MenuActionType.fromString(node.getAction());
		if (action.isWindow()) {
			getDesktop().openWindow(node.getName(), node.getAdWindowId());
		} else if (action.isReport()) {
			getDesktop().openReport(node.getName(), node.getAdProcessId());
		} else if (action.isProcess()) {
			getDesktop().openPorcess(node.getName(), node.getAdProcessId());
		} else if (action.isForm()) {
			getDesktop().openForm(node.getName(), node.getAdFormId());
		}
	}

}
