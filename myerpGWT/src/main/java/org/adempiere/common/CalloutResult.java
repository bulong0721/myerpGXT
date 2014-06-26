package org.adempiere.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CalloutResult implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private boolean				success				= true;
	private String				overWriteData;
	private List<String>		logs;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getOverWriteData() {
		return overWriteData;
	}

	public void setOverWriteData(String overWriteData) {
		this.overWriteData = overWriteData;
	}

	public List<String> getLogs() {
		return logs;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}
	
	public void addLog(String message) {
		if (null == logs) {
			logs = new ArrayList<String>();
		}
		logs.add(message);
	}

}
