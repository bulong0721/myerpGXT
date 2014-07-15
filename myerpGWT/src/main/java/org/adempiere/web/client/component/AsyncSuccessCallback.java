package org.adempiere.web.client.component;

import org.adempiere.web.client.util.ExceptionUtil;
import org.adempiere.web.client.util.ExceptionUtil.RPCError;
import org.adempiere.web.client.util.WidgetUtil;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AsyncSuccessCallback<T> implements AsyncCallback<T> {

	@Override
	public void onFailure(Throwable caught) {
		RPCError error = ExceptionUtil.decode(caught);
		WidgetUtil.setStatusLine(error.getMessage(), true);
//		AlertMessageBox dialog = null;
//		if (error.isBusinessException()) {
//			dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
//			dialog.setIcon(MessageBox.ICONS.warning());
//		} else {
//			dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
//		}
//		dialog.show();
	}

}
