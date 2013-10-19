package com.deppon.foss.client.presenter;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.IApplicationView;
import com.deppon.foss.client.presenter.interfaces.IApplicationView.IApplicationPresenter;
import com.deppon.foss.client.view.ApplicationView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ApplicationView.class)
public class ApplicationPresenter extends BasePresenter<IApplicationView, MyerpEventBus> implements IApplicationPresenter {

	public void onGoApplication() {
		getEventBus().setBody(getView());
		getEventBus().loadMenu();
	}
}
