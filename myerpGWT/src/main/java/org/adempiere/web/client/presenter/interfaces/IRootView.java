package org.adempiere.web.client.presenter.interfaces;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IRootView extends ReverseViewInterface<IRootView.IRootPresenter>, IsWidget {

	public interface IRootPresenter {

	}

	void setWidget(IsWidget widget);
}
