package org.adempiere.web.client.component;

import org.adempiere.web.client.exception.BusinessException;
import org.adempiere.web.client.exception.SystemException;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sencha.gxt.widget.core.client.info.Info;

public abstract class AsyncSuccessCallback<T> implements AsyncCallback<T> {
	private String	operation;

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
		if (caught instanceof SystemException) {
			Info.display(operation, caught.getMessage());
		} else if (caught instanceof BusinessException) {
			Info.display(operation, caught.getMessage());
		}
	}

}
