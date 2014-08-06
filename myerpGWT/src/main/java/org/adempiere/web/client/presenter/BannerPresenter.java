package org.adempiere.web.client.presenter;

import org.adempiere.common.ADUserContext;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.presenter.interfaces.IBannerView;
import org.adempiere.web.client.presenter.interfaces.IBannerView.IBannerPresenter;
import org.adempiere.web.client.util.ContextUtil;
import org.adempiere.web.client.view.BannerView;

import com.google.gwt.user.client.ui.HasText;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = BannerView.class)
public class BannerPresenter extends BasePresenter<IBannerView, MyerpEventBus> implements IBannerPresenter {

    public void onSplashScreen() {
        HasText label = getView().getUserLabel();
        ADUserContext cxt = ContextUtil.getUserContext();
        String userName = cxt.getName();
        String client = cxt.getADClientID().toString();
        String org = cxt.getADOrgID().toString();
        label.setText(userName + "@" + client + "." + org);
    }

}
