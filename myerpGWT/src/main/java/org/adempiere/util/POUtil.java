package org.adempiere.util;

import javax.persistence.EntityManager;

import org.adempiere.common.ADEntityBase;
import org.adempiere.model.AdAttachment;

public class POUtil {

	public static <T extends ADEntityBase> T find(Class<T> clazz, int id) {
		EntityManager em = getEntityManager();
		return em.find(clazz, id);
	}

	public static <T extends ADEntityBase> T find(Class<T> clazz, long id) {
		EntityManager em = getEntityManager();
		return em.find(clazz, id);
	}

	private static EntityManager getEntityManager() {
		return null;
	}

	public static AdAttachment getAttachment(int formatTableId, long aD_PrintFormatItem_ID) {
		// TODO Auto-generated method stub
		return null;
	}
}
