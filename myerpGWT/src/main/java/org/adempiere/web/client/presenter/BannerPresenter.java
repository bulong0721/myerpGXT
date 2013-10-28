package org.adempiere.web.client.presenter;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.presenter.interfaces.IBannerView;
import org.adempiere.web.client.presenter.interfaces.IBannerView.IBannerPresenter;
import org.adempiere.web.client.view.BannerView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = BannerView.class)
public class BannerPresenter extends BasePresenter<IBannerView, MyerpEventBus> implements IBannerPresenter {

}
