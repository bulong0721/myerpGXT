package org.adempiere.web.server;

import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public abstract class JPAServiceBase extends RemoteServiceServlet {

	protected final EntityManagerFactory	emf;
	private final boolean					isManaged	= false;
	private ThreadLocal<EntityManager>		thread		= new ThreadLocal<EntityManager>();
	private ReentrantLock					lock		= new ReentrantLock();

	public JPAServiceBase() {
		emf = Persistence.createEntityManagerFactory("gwtApp02");
	}

	public final EntityManagerFactory getUnit() {
		return emf;
	}

	public final boolean isManaged() {
		return isManaged;
	}

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

	protected EntityManager newEntityManager() {
		return emf.createEntityManager();
	}

	protected EntityManager begin() {
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

	protected void commit() {
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

	protected void rollback() {
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

	protected void assertActive() {
		EntityManager em = thread.get();
		String thread = Thread.currentThread().getName();
		assertTrue("No persistent context is associated with " + thread, em != null);
		assertTrue("Persistent context " + em + " associated with " + thread + " has been closed", em.isOpen());
		if (!isManaged) {
			assertTrue("Persistent context " + em + " associated with " + thread + " has no active transaction", em
					.getTransaction().isActive());
		}
	}

	protected void assertTrue(String s, boolean p) {
		if (!p) {
			System.err.println(s);
			throw new RuntimeException(s);
		}
	}

}