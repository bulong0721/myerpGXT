package org.adempiere.web.client.model;

public class ADFeedback implements IsADRPCModel {
	private boolean	isSuccess;
	private String	errorMessage;
	
	public ADFeedback() {
	}

	public ADFeedback(boolean isSuccess, String errorMessage) {
		this.isSuccess = isSuccess;
		this.errorMessage = errorMessage;
	}

	public static ADFeedback newSuccess() {
		ADFeedback rs = new ADFeedback();
		rs.isSuccess = true;
		return rs;
	}

	public static ADFeedback newError(String error) {
		ADFeedback rs = new ADFeedback();
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
