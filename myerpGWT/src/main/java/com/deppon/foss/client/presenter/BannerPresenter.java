package com.deppon.foss.client.presenter;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.IBannerView;
import com.deppon.foss.client.presenter.interfaces.IBannerView.IBannerPresenter;
import com.deppon.foss.client.view.BannerView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = BannerView.class)
public class BannerPresenter extends BasePresenter<IBannerView, MyerpEventBus> implements IBannerPresenter {

}
