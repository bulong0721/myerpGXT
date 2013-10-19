package com.deppon.foss.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SelectDialog extends Composite {

	private static SDialogUiBinder	uiBinder	= GWT.create(SDialogUiBinder.class);

	interface SDialogUiBinder extends UiBinder<Widget, SelectDialog> {
	}

	public SelectDialog() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
