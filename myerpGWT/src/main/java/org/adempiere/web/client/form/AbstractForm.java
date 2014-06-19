package org.adempiere.web.client.form;

import org.adempiere.web.client.component.ModalDialog;
import org.adempiere.web.client.model.ProcessModel;

import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractForm extends ModalDialog {
	protected ProcessModel	processInfo;
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

	public ProcessModel getProcessInfo() {
		return processInfo;
	}

	public void setProcessInfo(ProcessModel processInfo) {
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
