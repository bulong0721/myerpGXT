package org.adempiere.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.adempiere.common.ADEntityBase;
import org.adempiere.model.AdAttachment;
import org.adempiere.model.AdColumn;
import org.adempiere.model.AdElement;
import org.adempiere.model.AdTable;
import org.adempiere.web.client.util.StringUtil;

public final class POUtil {

	public static <T extends ADEntityBase> T find(EntityManager em, Class<T> clazz, int id) {
		return em.find(clazz, id);
	}

	public static <T extends ADEntityBase> T find(EntityManager em, Class<T> clazz, long id) {
		return em.find(clazz, id);
	}

	public static AdTable findByTableName(EntityManager em, String tableName) {
		if (StringUtil.isNullOrEmpty(tableName)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("tablename", tableName);
		return selectOne(em, AdTable.class, "queryTableByTableName", paramMap);
	}

	public static AdElement findElementByColumn(EntityManager em, String column) {
		if (StringUtil.isNullOrEmpty(column)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("columnname", column);
		return selectOne(em, AdElement.class, "queryElementByColumn", paramMap);
	}

	public static Map<String, Object> toMap(String pName, Object pValue) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(pName, pValue);
		return paramMap;
	}

	public static <T extends ADEntityBase> T selectOne(EntityManager em, Class<T> clazz, String queryName, Map<String, Object> paramMap) {
		try {
			TypedQuery<T> query = em.createNamedQuery(queryName, clazz);
			for (Entry<String, Object> pEntry : paramMap.entrySet()) {
				query.setParameter(pEntry.getKey(), pEntry.getValue());
			}
			return query.getSingleResult();
		} catch (Exception ex) {
//			ex.printStackTrace();
			return null;
		}
	}

	public static <T extends ADEntityBase> List<T> selectList(EntityManager em, Class<T> clazz, String queryName,
			Map<String, Object> paramMap) {
		try {
			TypedQuery<T> query = em.createNamedQuery(queryName, clazz);
			for (Entry<String, Object> pEntry : paramMap.entrySet()) {
				query.setParameter(pEntry.getKey(), pEntry.getValue());
			}
			return query.getResultList();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static List<AdColumn> queryColumnsByTable(EntityManager em, int tableId) {
		TypedQuery<AdColumn> query = em.createNamedQuery("queryColumnsByTable", AdColumn.class);
		query.setParameter("adTableId", tableId);
		return query.getResultList();
	}

	public static <T extends ADEntityBase> boolean save(EntityManager em, T entity) {
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			initADEntity(entity);
			em.merge(entity);
			tx.commit();
			return true;
		} catch (Exception e) {
			if (null != tx) {
				tx.rollback();
			}
			e.printStackTrace();
			return false;
		} 
	}

	public static void initADEntity(ADEntityBase entity) {
		if (null == entity.getCreatedby()) {
			entity.setCreatedby(Env.getUser());
			entity.setCreated(Env.nowString());
			entity.setIsactive(StringUtil.YES);
		}
		entity.setUpdatedby(Env.getUser());
		entity.setUpdated(Env.nowString());
	}

	public static AdAttachment getAttachment(int formatTableId, long aD_PrintFormatItem_ID) {
		// TODO Auto-generated method stub
		return null;
	}
}
