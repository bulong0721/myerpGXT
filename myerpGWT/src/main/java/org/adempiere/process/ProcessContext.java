package org.adempiere.process;

import java.sql.Connection;
import java.util.Collections;
import java.util.Map;

import org.adempiere.util.PersistContext;
import org.adempiere.web.client.model.ADProcessModel;

@SuppressWarnings("serial")
public class ProcessContext extends PersistContext {
	private ADProcessModel		processModel;
	private Map<String, Object>	paramMap;
	private Map<String, Object>	rowMap;

	public ProcessContext() {
		this(null, Collections.<String, Object> emptyMap(), Collections.<String, Object> emptyMap());
	}

	public ProcessContext(ADProcessModel pModel, Map<String, Object> rowMap, Map<String, Object> paramMap) {
		this.processModel = pModel;
		this.paramMap = paramMap;
		this.rowMap = rowMap;
	}

	public Connection getConnection() {
		return getEntityManager().unwrap(Connection.class);
	}

	public ADProcessModel getProcessModel() {
		return processModel;
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

	public Map<String, Object> getRowMap() {
		return rowMap;
	}

	public String getClassName() {
		if (null != processModel) {
			return processModel.getClassname();
		}
		return null;
	}

	public void setClassName(String jasperStarterClass) {
		if (null != processModel) {
			processModel.setClassname(jasperStarterClass);
		}
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		// TODO Auto-generated method stub

	}

	public void setReportingProcess(boolean b) {
		// TODO Auto-generated method stub

	}

}
