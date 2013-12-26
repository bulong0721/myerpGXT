package org.adempiere.web.client.model;


public class ADResultWithError implements IsADRPCModel {
	private boolean				isSuccess;
	private String				errorMessage;

	public static ADResultWithError newSuccess() {
		ADResultWithError rs = new ADResultWithError();
		rs.isSuccess = true;
		return rs;
	}

	public static ADResultWithError newError(String error) {
		ADResultWithError rs = new ADResultWithError();
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
