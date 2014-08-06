package org.adempiere.web.client.presenter;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.presenter.interfaces.IApplicationView;
import org.adempiere.web.client.presenter.interfaces.IApplicationView.IApplicationPresenter;
import org.adempiere.web.client.view.ApplicationView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ApplicationView.class)
public class ApplicationPresenter extends BasePresenter<IApplicationView, MyerpEventBus> implements IApplicationPresenter {

	public void onGoApplication() {
		getEventBus().setBody(getView());
		getEventBus().loadNavigation();
		getEventBus().splashScreen();
	}
}
