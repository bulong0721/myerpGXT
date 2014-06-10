package org.adempiere.process;

import java.sql.Connection;
import java.util.Collections;
import java.util.Map;

import javax.persistence.EntityManager;

import org.adempiere.persist.PersistContext;
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
		super(true);
		this.processModel = pModel;
		this.paramMap = paramMap;
		this.rowMap = rowMap;
	}

	public void managedRollback() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			assertActive();
			em.getTransaction().rollback();
		} finally {
			lock.unlock();
		}
	}

	public void managedCommit() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			assertActive();
			em.getTransaction().commit();
		} finally {
			lock.unlock();
		}
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
			return processModel.getClassName();
		}
		return null;
	}

	public void setClassName(String jasperStarterClass) {
		if (null != processModel) {
			processModel.setClassName(jasperStarterClass);
		}
	}

	public void setADPinstanceID(Integer adPinstanceId) {
		// TODO Auto-generated method stub

	}

	public void setReportingProcess(boolean b) {
		// TODO Auto-generated method stub

	}

}
