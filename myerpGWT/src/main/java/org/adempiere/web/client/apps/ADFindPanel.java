package org.adempiere.web.client.apps;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Window;

public class ADFindPanel implements IsWidget {

	private static FindPanelUiBinder	uiBinder	= GWT.create(FindPanelUiBinder.class);

	interface FindPanelUiBinder extends UiBinder<Widget, ADFindPanel> {
	}

	private Widget	widget	= null;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}
	
	public static Window getFindWindow() {
		Window dialog = new Window();
		return dialog;
	}

}
