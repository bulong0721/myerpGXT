package org.adempiere.web.client.presenter;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.presenter.interfaces.IRemindView;
import org.adempiere.web.client.presenter.interfaces.IRemindView.IRemindPresenter;
import org.adempiere.web.client.view.RemindView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = RemindView.class)
public class RemindPresenter extends BasePresenter<IRemindView, MyerpEventBus> implements IRemindPresenter {
}
