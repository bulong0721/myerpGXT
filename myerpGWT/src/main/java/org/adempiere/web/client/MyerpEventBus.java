package org.adempiere.web.client;

import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.presenter.ApplicationPresenter;
import org.adempiere.web.client.presenter.ContentPresenter;
import org.adempiere.web.client.presenter.LoginPresenter;
import org.adempiere.web.client.presenter.NavigationPresenter;
import org.adempiere.web.client.presenter.RemindPresenter;
import org.adempiere.web.client.presenter.RootPresenter;

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