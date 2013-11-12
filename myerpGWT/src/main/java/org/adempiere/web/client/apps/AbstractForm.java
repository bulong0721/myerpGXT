package org.adempiere.web.client.apps;

import org.adempiere.web.client.model.AdProcessModel;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractForm implements IsWidget {
	protected AdProcessModel	processInfo;
	protected int				adFormId;
	protected int				windowNo;
	protected String			name;
	private Widget				widget;

	protected void init(int adFormId, String name) {
		this.adFormId = adFormId;
		this.name = name;
		this.asWidget();
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = initForm();
		}
		return widget;
	}

	protected abstract Widget initForm();

	public static AbstractForm create(int adFormId) {
		return null;
	}

	public AdProcessModel getProcessInfo() {
		return processInfo;
	}

	public void setProcessInfo(AdProcessModel processInfo) {
		this.processInfo = processInfo;
	}

	public int getAdFormId() {
		return adFormId;
	}

	public int getWindowNo() {
		return windowNo;
	}

	public String getName() {
		return name;
	}
}
