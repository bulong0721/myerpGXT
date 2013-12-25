package org.adempiere.web.client.form;

import org.adempiere.web.client.model.ADProcessModel;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractForm implements IsWidget {
	protected ADProcessModel	processInfo;
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

	public ADProcessModel getProcessInfo() {
		return processInfo;
	}

	public void setProcessInfo(ADProcessModel processInfo) {
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
