package com.deppon.foss.client.presenter;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.IRootView;
import com.deppon.foss.client.presenter.interfaces.IRootView.IRootPresenter;
import com.deppon.foss.client.view.RootView;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = RootView.class)
public class RootPresenter extends BasePresenter<IRootView, MyerpEventBus> implements IRootPresenter {

	public void onStart() {
		getEventBus().goLogin();
	}

	public void onSetBody(IsWidget widget) {
		getView().setWidget(widget);
	}
}
