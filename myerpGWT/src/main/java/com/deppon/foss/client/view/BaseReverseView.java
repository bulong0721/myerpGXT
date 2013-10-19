package com.deppon.foss.client.view;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.client.presenter.BasePresenter;
import com.mvp4g.client.view.ReverseViewInterface;

public abstract class BaseReverseView<T> implements ReverseViewInterface<T>, IsWidget {

	protected T			presenter;
	protected Widget	widget;

	@Override
	public void setPresenter(T presenter) {
		this.presenter = presenter;
	}

	@SuppressWarnings("unchecked")
	public <V, E extends EventBus> BasePresenter<V, E> getBasePresenter() {
		return (BasePresenter<V, E>) getPresenter();
	}

	@Override
	public T getPresenter() {
		return presenter;
	}

}
