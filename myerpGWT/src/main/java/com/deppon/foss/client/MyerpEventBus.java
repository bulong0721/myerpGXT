package com.deppon.foss.client;

import com.deppon.foss.client.model.AdMenuModel;
import com.deppon.foss.client.presenter.ApplicationPresenter;
import com.deppon.foss.client.presenter.ContentPresenter;
import com.deppon.foss.client.presenter.LoginPresenter;
import com.deppon.foss.client.presenter.NavigationPresenter;
import com.deppon.foss.client.presenter.RemindPresenter;
import com.deppon.foss.client.presenter.RootPresenter;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter = RootPresenter.class)
public interface MyerpEventBus extends EventBus {

	@Start
	@Event(handlers = { RootPresenter.class }, bind = { LoginPresenter.class, RemindPresenter.class, ContentPresenter.class })
	void start();

	@Event(handlers = { ApplicationPresenter.class })
	void goApplication();

	@Event(handlers = { LoginPresenter.class })
	void goLogin();

	@Event(handlers = { RootPresenter.class })
	void setBody(IsWidget widget);

	@Event(handlers = { ContentPresenter.class })
	void showPage(AdMenuModel model);
	
	@Event(handlers = { NavigationPresenter.class })
	void loadMenu();
}
