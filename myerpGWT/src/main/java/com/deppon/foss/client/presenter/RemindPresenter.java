package com.deppon.foss.client.presenter;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.IRemindView;
import com.deppon.foss.client.presenter.interfaces.IRemindView.IRemindPresenter;
import com.deppon.foss.client.view.RemindView;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = RemindView.class)
public class RemindPresenter extends BasePresenter<IRemindView, MyerpEventBus> implements IRemindPresenter {
}
