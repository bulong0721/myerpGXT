package org.adempiere.common;

import java.io.Serializable;
import java.util.List;

public class ProcessResult implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				title;
	private String				pdfUrl;
	private boolean				hasError;
	private List<String>		logs;

	public String getTitle() {
		return title;
	}

	public void setPDFReport(String pdfUrl) {
		this.pdfUrl = pdfUrl;
	}

	public String getPDFReport() {
		return pdfUrl;
	}

	public boolean hasError() {
		return hasError;
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

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

}
