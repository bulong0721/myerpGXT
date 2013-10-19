package com.deppon.foss.client.presenter.interfaces;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.sencha.gxt.widget.core.client.button.TextButton;

public interface IRemindView extends ReverseViewInterface<IRemindView.IRemindPresenter>, IsWidget {

	interface IRemindPresenter {

	}

	TextButton getNoticeButton();

	TextButton getRequestButton();

	TextButton getWorkflowButton();
}