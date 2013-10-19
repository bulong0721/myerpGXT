package com.deppon.foss.client.widget;

import com.deppon.foss.client.event.ConfirmToolListener;
import com.deppon.foss.client.util.WidgetUtil;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

public class ConfirmToolBar implements IsWidget {

	private static ConfirmToolBarUiBinder	uiBinder	= GWT.create(ConfirmToolBarUiBinder.class);

	interface ConfirmToolBarUiBinder extends UiBinder<Widget, ConfirmToolBar> {
	}

	@UiField(provided = true)
	IconButton						btnOK;
	@UiField(provided = true)
	IconButton						btnHelp;
	@UiField(provided = true)
	IconButton						btnCancel;
	private Widget					widget;
	private ConfirmToolListener	listener;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			initWidget();
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	private void initWidget() {
		btnHelp = WidgetUtil.createIconButton("images/icons/Help24.png");
		btnOK = WidgetUtil.createIconButton("images/icons/Ok24.png");
		btnCancel = WidgetUtil.createIconButton("images/icons/Cancel24.png");
	}

	public void addToolbarListener(ConfirmToolListener listener) {
		this.listener = listener;
	}

	private void checkListener() {
		if (null == listener) {
			throw new IllegalArgumentException();
		}
	}

	@UiHandler({ "btnHelp", "btnOK", "btnCancel" })
	void onButtonSelected(SelectEvent event) {
		checkListener();
		if (btnHelp == event.getSource()) {
			listener.onHelp();
		} else if (btnOK == event.getSource()) {
			listener.onOK();
		} else if (btnCancel == event.getSource()) {
			listener.onCancel();
		}

	}

}
