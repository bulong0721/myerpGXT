package org.adempiere.web.client.component;

import org.adempiere.web.client.Messages;
import org.adempiere.web.client.util.ExceptionUtil;
import org.adempiere.web.client.util.ExceptionUtil.RPCError;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.box.MessageBox;

public abstract class AsyncSuccessCallback<T> implements AsyncCallback<T> {
	private static Messages	i18n	= GWT.create(Messages.class);
	private String			operation;

	public AsyncSuccessCallback() {
		this("adempiere");
	}

	public AsyncSuccessCallback(String operation) {
		super();
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}

	@Override
	public void onFailure(Throwable caught) {
		RPCError error = ExceptionUtil.decode(caught);
		AlertMessageBox dialog = null;
		if (error.isBusinessException()) {
			dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
			dialog.setIcon(MessageBox.ICONS.warning());
		} else {
			dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
		}
		dialog.show();
	}

}
