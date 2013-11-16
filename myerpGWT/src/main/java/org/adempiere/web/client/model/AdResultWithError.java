package org.adempiere.web.client.model;

import java.io.Serializable;

public class AdResultWithError implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private boolean				isSuccess;
	private String				errorMessage;

	public static AdResultWithError newSuccess() {
		AdResultWithError rs = new AdResultWithError();
		rs.isSuccess = true;
		return rs;
	}

	public static AdResultWithError newError(String error) {
		AdResultWithError rs = new AdResultWithError();
		rs.errorMessage = error;
		rs.isSuccess = false;
		return rs;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
