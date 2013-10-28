package org.adempiere.web.client.presenter;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.presenter.interfaces.ILoginView;
import org.adempiere.web.client.presenter.interfaces.ILoginView.ILoginPresenter;
import org.adempiere.web.client.view.LoginView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = LoginView.class)
public class LoginPresenter extends BasePresenter<ILoginView, MyerpEventBus> implements ILoginPresenter {

	public void onGoLogin() {
		getEventBus().setBody(getView());
	}
}
