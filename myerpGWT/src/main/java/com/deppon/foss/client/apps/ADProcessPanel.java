package com.deppon.foss.client.apps;

import com.deppon.foss.client.util.WidgetUtil;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class ADProcessPanel implements IsWidget {

	private static ADProcessPanelUiBinder	uiBinder	= GWT.create(ADProcessPanelUiBinder.class);

	interface ADProcessPanelUiBinder extends UiBinder<Widget, ADProcessPanel> {
	}

	private Widget	widget;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			WidgetUtil.doLayout(widget);
		}
		return widget;
	}

}
