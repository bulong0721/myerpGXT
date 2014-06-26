package org.adempiere.common;

import java.io.Serializable;
import java.util.List;

public class ProcessResult implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private boolean				success				= true;
	private String				title;
	private String				pdfUrl;
	private List<String>		logs;
	private String				summary;

	public String getTitle() {
		return title;
	}

	public void setPDFReport(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getPDFReport() {
		return pdfUrl;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}

	public String[] getLogs() {
		if (null != logs && logs.size() > 0) {
			String[] array = new String[logs.size()];
			return logs.toArray(array);
		}
		return null;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	} // setSummary

	/**
	 * Method getSummary
	 * 
	 * @return String
	 */
	public String getSummary() {
		return this.summary;
	} // getSummary

	/**
	 * Method setSummary
	 * 
	 * @param translatedSummary String
	 * @param error boolean
	 */
	public void setSummary(String translatedSummary, boolean error) {
		setSummary(translatedSummary);
		setSuccess(error);
	} // setSummary

}
