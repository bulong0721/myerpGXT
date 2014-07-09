package org.adempiere.web.client.presenter;

import org.adempiere.common.MenuActionType;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.desktop.TabbedDesktop;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.presenter.interfaces.IContentView;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.view.ContentView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ContentView.class)
public class ContentPresenter extends BasePresenter<IContentView, MyerpEventBus> implements IContentPresenter {

    public void onShowPage(MenuModel node) {
        MenuActionType action = MenuActionType.fromString(node.getAction());
        if (action.isWindow()) {
            WidgetUtil.getDesktop().openWindow(node.getName(), node.getAdWindowId());
        } else if (action.isReport()) {
            WidgetUtil.getDesktop().openReport(node.getName(), node.getAdProcessId());
        } else if (action.isProcess()) {
            WidgetUtil.getDesktop().openPorcess(node.getName(), node.getAdProcessId());
        } else if (action.isForm()) {
            WidgetUtil.getDesktop().openForm(node.getName(), node.getAdFormId());
        }
    }

}
