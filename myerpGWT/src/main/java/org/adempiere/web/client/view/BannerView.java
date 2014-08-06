package org.adempiere.web.client.view;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.presenter.interfaces.IBannerView;
import org.adempiere.web.client.presenter.interfaces.IBannerView.IBannerPresenter;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.WidgetUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.client.presenter.BasePresenter;

@Singleton
public class BannerView extends BaseReverseView<IBannerPresenter> implements IBannerView {

    private static BannerViewUiBinder uiBinder         = GWT.create(BannerViewUiBinder.class);
    private AdempiereServiceAsync     adempiereService = GWT.create(AdempiereService.class);

    interface BannerViewUiBinder extends UiBinder<Widget, BannerView> {
    }

    @UiField
    Anchor profileLink, changeRoleLink, logoutLink;
    @UiField
    Label  userLabel;

    @Override
    public Widget asWidget() {
        if (null == widget) {
            widget = uiBinder.createAndBindUi(this);
        }
        return widget;
    }

    @UiHandler({ "profileLink" })
    void onProfileClick(ClickEvent event) {

    }

    @UiHandler({ "changeRoleLink" })
    void onChangeRoleClick(ClickEvent event) {
        try {
            BasePresenter<IBannerView, MyerpEventBus> presenter1 = getBasePresenter();
            presenter1.getEventBus().goLogin();
        } catch (Exception e) {
            WidgetUtil.setStatusLine(e.getLocalizedMessage(), true);
        }
    }

    @UiHandler({ "logoutLink" })
    void onLogoutClick(ClickEvent event) {
        AsyncSuccessCallback<Void> callback = new AsyncSuccessCallback<Void>() {

            @Override
            public void onSuccess(Void result) {
                BasePresenter<IBannerView, MyerpEventBus> presenter = getBasePresenter();
                presenter.getEventBus().goLogin();
            }
        };
        adempiereService.logout(callback);
    }

    @Override
    public HasText getUserLabel() {
        return userLabel;
    }

}
