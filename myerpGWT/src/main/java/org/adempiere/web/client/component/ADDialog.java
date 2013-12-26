package org.adempiere.web.client.component;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.IsWidget;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;

public abstract class ADDialog implements IsWidget {
	private Window	modalwindow;

	public Window getWindow() {
		return modalwindow;
	}

	public void setWindow(Window window) {
		this.modalwindow = window;
		this.modalwindow.setWidget(asWidget());
	}

	public HandlerRegistration addHideHandler(HideHandler handler) {
		Window window = getWindow();
		if (null != window) {
			window.addHideHandler(handler);
		}
		return null;
	}

	public void show() {
		Window window = getWindow();
		if (null != window) {
			window.setModal(true);
			window.show();
		}
	}

	public void hide() {
		Window window = getWindow();
		if (null != window) {
			window.hide();
		}
	}

}
