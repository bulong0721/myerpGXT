package org.adempiere.service;

import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;

import org.adempiere.common.ADEntityBase;

public abstract class EntityListener<T extends ADEntityBase> {
	private ReentrantLock	lock	= new ReentrantLock();

	protected EntityManager getEntityManager() {
		try {
			lock.lock();
			EntityManager em = PersistContext.thread.get();
			if (em == null) {
				throw new RuntimeException("No EntityManager");
			}
			if (!em.isOpen()) {
				throw new RuntimeException("EntityManager is Close");
			}
			return em;
		} finally {
			lock.unlock();
		}
	}

}
