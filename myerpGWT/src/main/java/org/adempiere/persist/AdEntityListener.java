package org.adempiere.persist;

import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.EntityManager;

import org.adempiere.common.ADEntityBase;
import org.adempiere.util.POUtil;

public abstract class AdEntityListener<T extends ADEntityBase> {
	private ReentrantLock				lock	= new ReentrantLock();

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
	
	protected void persist(Object entity) {
		EntityManager em = getEntityManager();
		POUtil.initADEntity(entity);
		em.persist(entity);
	}
	
	protected Object merge(Object entity) {
		EntityManager em = getEntityManager();
		POUtil.initADEntity(entity);
		return em.merge(entity);
	}
	
	protected void remove(Class<?> entityClass, Object pk) {
		EntityManager em = getEntityManager();
		Object entity = em.find(entityClass, pk);
		em.remove(entity);
	}
	
}
