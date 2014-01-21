package org.adempiere.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.adempiere.common.ADEntityBase;
import org.adempiere.model.AdAttachment;
import org.adempiere.model.AdColumn;
import org.adempiere.model.AdElement;
import org.adempiere.model.AdTable;
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
			pCtx.rollback();
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
			pCtx.rollback();
			return null;
		}
	}

	public static List<AdColumn> queryColumnsByTable(PersistContext pCtx, int tableId) {
		Map<String, Object> paramMap = toMap("adTableId", tableId);
		return selectList(pCtx, "queryColumnsByTable", AdColumn.class, paramMap);
	}

	public static <T extends ADEntityBase> boolean save(PersistContext pCtx, T entity) {
		try {
			EntityManager em = pCtx.begin();
			initADEntity(entity);
			em.merge(entity);
			pCtx.commit();
			return true;
		} catch (Exception e) {
			pCtx.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public static <T extends ADEntityBase> boolean saveAll(PersistContext pCtx, List<T> list) {
		try {
			EntityManager em = pCtx.begin();
			for (T entity : list) {
				initADEntity(entity);
				em.merge(entity);
			}
			pCtx.commit();
			return true;
		} catch (Exception e) {
			pCtx.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public static void initADEntity(ADEntityBase entity) {
		if (null == entity.getCreatedby()) {
			entity.setCreatedby(Env.getUser());
			entity.setCreated(Env.nowString());
			entity.setIsactive(true);
		}
		entity.setUpdatedby(Env.getUser());
		entity.setUpdated(Env.nowString());
	}

	public static AdAttachment getAttachment(int formatTableId, long aD_PrintFormatItem_ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
