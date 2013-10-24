package com.deppon.foss.client.component;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sencha.gxt.widget.core.client.info.Info;

public abstract class AsyncSuccessCallback<T> implements AsyncCallback<T> {
	private String	operation;

	public AsyncSuccessCallback(String operation) {
		super();
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}

	@Override
	public void onFailure(Throwable caught) {
		Info.display(operation, caught.getMessage());
	}

}
