package com.deppon.foss.client.view;

import com.deppon.foss.client.MyerpEventBus;
import com.deppon.foss.client.presenter.interfaces.IRemindView;
import com.deppon.foss.client.presenter.interfaces.IRemindView.IRemindPresenter;
import com.deppon.foss.client.resources.Images;
import com.deppon.foss.client.resources.ResourcesFactory;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

@Singleton
public class RemindView extends BaseReverseView<IRemindPresenter> implements IRemindView {

	private static RemindViewUiBinder	uiBinder	= GWT.create(RemindViewUiBinder.class);

	interface RemindViewUiBinder extends UiBinder<Widget, RemindView> {
	}

	@UiField
	TextButton	noticeButton;
	@UiField
	TextButton	requestButton;
	@UiField(provided = true)
	TextButton	workflowButton	= new TextButton();
	@UiField(provided = true)
	Images		images			= ResourcesFactory.createImages();

	@Override
	public TextButton getNoticeButton() {
		return noticeButton;
	}

	@Override
	public TextButton getRequestButton() {
		return requestButton;
	}

	@Override
	public TextButton getWorkflowButton() {
		return workflowButton;
	}

	@UiHandler("workflowButton")
	public void onWorkflowSelected(SelectEvent event) {
		BasePresenter<IRemindView, MyerpEventBus> presenter = getBasePresenter();
		presenter.getEventBus().goLogin();
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

}
