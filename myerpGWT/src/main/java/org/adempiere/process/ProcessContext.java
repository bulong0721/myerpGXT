package org.adempiere.process;

import java.sql.Connection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.adempiere.web.client.model.ADProcessModel;

public class ProcessContext {
	protected final EntityManagerFactory	emf;
	private final boolean					isManaged	= false;
	private ThreadLocal<EntityManager>		thread		= new ThreadLocal<EntityManager>();
	private ReentrantLock					lock		= new ReentrantLock();
	private ADProcessModel					processModel;
	private Map<String, Object>				paramMap;
	private Map<String, Object>				rowMap;

	public ProcessContext() {
		this(null, Collections.<String, Object> emptyMap(), Collections.<String, Object> emptyMap());
	}

	public ProcessContext(ADProcessModel pModel, Map<String, Object> rowMap, Map<String, Object> paramMap) {
		this.emf = Persistence.createEntityManagerFactory("adempiere");
		this.processModel = pModel;
		this.paramMap = paramMap;
		this.rowMap = rowMap;
	}

	public final EntityManagerFactory getUnit() {
		return emf;
	}

	public final boolean isManaged() {
		return isManaged;
	}

	public EntityManager getEntityManager() {
		try {
			lock.lock();
			EntityManager em = thread.get();
			if (em == null || !em.isOpen()) {
				em = emf.createEntityManager();
				thread.set(em);
			}
			return em;
		} finally {
			lock.unlock();
		}
	}

	protected EntityManager newEntityManager() {
		return emf.createEntityManager();
	}

	public EntityManager begin() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			if (isManaged) {
				em.joinTransaction();
			} else {
				if (!em.getTransaction().isActive()) {
					em.getTransaction().begin();
				}
			}
			return em;
		} finally {
			lock.unlock();
		}
	}

	public void commit() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			if (isManaged) {
				em.flush();
			} else {
				assertActive();
				em.getTransaction().commit();
			}
		} finally {
			lock.unlock();
		}
	}

	public void rollback() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			if (isManaged) {

			} else {
				em.getTransaction().rollback();
			}
		} finally {
			lock.unlock();
		}
	}

	public void assertActive() {
		EntityManager em = thread.get();
		String thread = Thread.currentThread().getName();
		assertTrue("No persistent context is associated with " + thread, em != null);
		assertTrue("Persistent context " + em + " associated with " + thread + " has been closed", em.isOpen());
		if (!isManaged) {
			assertTrue("Persistent context " + em + " associated with " + thread + " has no active transaction", em.getTransaction()
					.isActive());
		}
	}

	public void assertTrue(String s, boolean p) {
		if (!p) {
			System.err.println(s);
			throw new RuntimeException(s);
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
