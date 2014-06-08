package org.adempiere.persist;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContextType;

public class PersistContext implements Serializable {
	private static final long				serialVersionUID	= 1L;
	private final EntityManagerFactory		emf;
	private final String					unitName;
	private final boolean					isManaged;
	private final PersistenceContextType	scope;

	static ThreadLocal<EntityManager>		thread				= new ThreadLocal<EntityManager>();
	protected ReentrantLock					lock				= new ReentrantLock();

	public PersistContext() {
		this.unitName = "adempiere";
		this.emf = Persistence.createEntityManagerFactory(unitName);
		this.isManaged = false;
		this.scope = PersistenceContextType.TRANSACTION;
	}

	public PersistContext(boolean isManaged) {
		this.unitName = "adempiere";
		this.emf = Persistence.createEntityManagerFactory(unitName);
		this.isManaged = isManaged;
		this.scope = PersistenceContextType.TRANSACTION;
	}

	public PersistContext(String unit, EntityManagerFactory emf, boolean managed, PersistenceContextType scope) {
		this.unitName = unit;
		this.emf = emf;
		this.isManaged = managed;
		this.scope = scope;
	}

	public final EntityManagerFactory getUnit() {
		return emf;
	}

	public final String getUnitName() {
		return unitName;
	}

	public final boolean isManaged() {
		return isManaged;
	}

	public final PersistenceContextType getContextType() {
		return scope;
	}

	/**
	 * Gets an entity manager associated with the current thread. If the current
	 * thread is not associated with any entity manager or the associated entity
	 * manager has been closed, creates a new entity manager and associates with
	 * the current thread.
	 * 
	 * @return an entity manager associated with the current thread.
	 */
	protected EntityManager getEntityManager() {
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

	/**
	 * Creates a new entity manager. The entity manager is not associated with
	 * the current thread.
	 */
	protected EntityManager newEntityManager() {
		return emf.createEntityManager();
	}

	/**
	 * Begins a transaction on the current thread. If the thread is associated
	 * with a persistence context, then a transaction is started if necessary.
	 * If the thread is not associated with a persistence context, then a new
	 * context is created, associated with the thread, new transaction is
	 * started.
	 * 
	 * @see #getEntityManager()
	 */
	public EntityManager begin() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			if (isManaged) {
//				em.joinTransaction();
				if (!em.getTransaction().isActive()) {
					em.getTransaction().begin();
				}
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

	/**
	 * Commits a transaction on the current thread.
	 */
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
			if (scope == PersistenceContextType.TRANSACTION) {
				em.clear();
			}
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Rolls back a transaction on the current thread.
	 */
	public void rollback() {
		try {
			lock.lock();
			EntityManager em = getEntityManager();
			if (isManaged) {

			} else {
				em.getTransaction().rollback();
			}
			if (scope == PersistenceContextType.TRANSACTION) {
				em.clear();
			}
		} finally {
			lock.unlock();
		}
	}

	/**
	 * Assert current thread is associated with an active transaction.
	 */
	protected void assertActive() {
		EntityManager em = thread.get();
		String thread = Thread.currentThread().getName();
		assertTrue("No persistent context is associated with " + thread, em != null);
		assertTrue("Persistent context " + em + " associated with " + thread + " has been closed", em.isOpen());
		if (!isManaged) {
			assertTrue("Persistent context " + em + " associated with " + thread + " has no active transaction", em.getTransaction()
					.isActive());
		}
	}

	protected void assertTrue(String s, boolean p) {
		if (!p) {
			System.err.println(s);
			throw new RuntimeException(s);
		}
	}
}
