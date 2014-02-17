package org.adempiere.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.TypedQuery;

import org.adempiere.common.ADEntityBase;
import org.adempiere.model.AdAttachment;
import org.adempiere.model.AdColumn;
import org.adempiere.model.AdElement;
import org.adempiere.model.AdField;
import org.adempiere.model.AdTab;
import org.adempiere.model.AdTable;
import org.adempiere.persist.PersistContext;
import org.adempiere.web.client.util.StringUtil;

public final class POUtil {

	public static <T extends ADEntityBase> T find(PersistContext pCtx, Class<T> clazz, Object id) {
		EntityManager em = pCtx.begin();
		try {
			T entity = em.find(clazz, id);
			pCtx.commit();
			return entity;
		} catch (Exception e) {
			pCtx.rollback();
			e.printStackTrace();
			return null;
		}
	}

	public static AdTable findByTableName(PersistContext pCtx, String tableName) {
		if (StringUtil.isNullOrEmpty(tableName)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("tablename", tableName);
		return selectOne(pCtx, "queryTableByTableName", AdTable.class, paramMap);
	}

	public static AdElement findElementByColumn(PersistContext pCtx, String column) {
		if (StringUtil.isNullOrEmpty(column)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("columnname", column);
		return selectOne(pCtx, "queryElementByColumn", AdElement.class, paramMap);
	}

	public static Object getIdentifier(PersistContext pCtx, Object entity) {
		PersistenceUnitUtil puu = pCtx.getUnit().getPersistenceUnitUtil();
		return puu.getIdentifier(entity);
	}

	public static Map<String, Object> toMap(String pName, Object pValue) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(pName, pValue);
		return paramMap;
	}

	public static <T extends ADEntityBase> T selectOne(PersistContext pCtx, String queryName, Class<T> clazz) {
		return selectOne(pCtx, queryName, clazz, null);
	}

	public static <T extends ADEntityBase> T selectOne(PersistContext pCtx, String queryName, Class<T> clazz, Map<String, Object> paramMap) {
		EntityManager em = pCtx.begin();
		try {
			TypedQuery<T> query = em.createNamedQuery(queryName, clazz);
			if (null != paramMap) {
				for (Entry<String, Object> pEntry : paramMap.entrySet()) {
					query.setParameter(pEntry.getKey(), pEntry.getValue());
				}
			}
			T entity = query.getSingleResult();
			pCtx.commit();
			return entity;
		} catch (Exception ex) {
			// ex.printStackTrace();
			return null;
		}
	}

	public static <T extends ADEntityBase> List<T> selectList(PersistContext pCtx, String queryName, Class<T> clazz) {
		return selectList(pCtx, queryName, clazz, null);
	}

	public static <T extends ADEntityBase> List<T> selectList(PersistContext pCtx, String queryName, Class<T> clazz,
			Map<String, Object> paramMap) {
		EntityManager em = pCtx.begin();
		try {
			TypedQuery<T> query = em.createNamedQuery(queryName, clazz);
			if (null != paramMap) {
				for (Entry<String, Object> pEntry : paramMap.entrySet()) {
					query.setParameter(pEntry.getKey(), pEntry.getValue());
				}
			}
			List<T> list = query.getResultList();
			pCtx.commit();
			return list;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static List<AdColumn> queryColumnsByTable(PersistContext pCtx, int tableId) {
		Map<String, Object> paramMap = toMap("adTableId", tableId);
		return selectList(pCtx, "queryColumnsByTable", AdColumn.class, paramMap);
	}

	public static List<AdColumn> queryUnMappedColumns(PersistContext pCtx, int tableId, int tabId) {
		Map<String, Object> paramMap = toMap("adTableId", tableId);
		paramMap.put("adTabId", tabId);
		return selectList(pCtx, "queryUnMappedColumns", AdColumn.class, paramMap);
	}

	public static List<AdTab> queryTabsByWindow(PersistContext pCtx, int windowId) {
		Map<String, Object> paramMap = toMap("adWindowId", windowId);
		return selectList(pCtx, "queryTabsByWindowId", AdTab.class, paramMap);
	}

	public static List<AdField> queryFieldsByTabId(PersistContext pCtx, int tabId) {
		Map<String, Object> paramMap = toMap("adTabId", tabId);
		return selectList(pCtx, "queryFieldsByTabId", AdField.class, paramMap);
	}

	public static boolean persist(PersistContext pCtx, Object entity) {
		try {
			EntityManager em = pCtx.begin();
			initADEntity(entity);
			em.persist(entity);
			pCtx.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
			return false;
		}
	}

	public static Object merge(PersistContext pCtx, Object entity) throws Exception {
		try {
			EntityManager em = pCtx.begin();
			initADEntity(entity);
			Object newEntity = em.merge(entity);
			pCtx.commit();
			return newEntity;
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
			throw e;
		}
	}

	public static boolean persistAll(PersistContext pCtx, List<?> list) {
		try {
			EntityManager em = pCtx.begin();
			for (Object entity : list) {
				initADEntity(entity);
				em.persist(entity);
			}
			pCtx.commit();
			return true;
		} catch (Exception e) {
			pCtx.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public static void initADEntity(Object entity) {
		if (entity instanceof ADEntityBase) {
			ADEntityBase adEntity = (ADEntityBase) entity;
			if (null == adEntity.getCreatedby()) {
				adEntity.setCreatedby(Env.getUser());
				adEntity.setCreated(Env.currentTimestamp());
				adEntity.setIsactive(true);
			}
			adEntity.setUpdatedby(Env.getUser());
			adEntity.setUpdated(Env.currentTimestamp());
		}
	}

	public static AdAttachment getAttachment(int formatTableId, long aD_PrintFormatItem_ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
