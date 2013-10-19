package com.deppon.foss.client.presenter;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.ILoginView;
import com.deppon.foss.client.presenter.interfaces.ILoginView.ILoginPresenter;
import com.deppon.foss.client.view.LoginView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = LoginView.class)
public class LoginPresenter extends BasePresenter<ILoginView, MyerpEventBus> implements ILoginPresenter {

	public void onGoLogin() {
		getEventBus().setBody(getView());
	}
}
