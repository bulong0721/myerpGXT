package org.adempiere.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import org.adempiere.common.ADEntityBase;
import org.adempiere.common.IdentifierColumn;
import org.adempiere.common.RefCriteria;
import org.adempiere.model.ADAttachment;
import org.adempiere.model.ADColumn;
import org.adempiere.model.ADElement;
import org.adempiere.model.ADField;
import org.adempiere.model.ADFormVt;
import org.adempiere.model.ADMenu;
import org.adempiere.model.ADMenuVt;
import org.adempiere.model.ADProcess;
import org.adempiere.model.ADProcessVt;
import org.adempiere.model.ADTab;
import org.adempiere.model.ADTable;
import org.adempiere.model.ADTreeNode;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdFieldVt;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTabVt;
import org.adempiere.persist.PersistContext;
import org.adempiere.web.client.model.ADSequenceModel;
import org.adempiere.web.client.util.StringUtil;

public final class POUtil {

	/**
	 * @param pCtx
	 * @param clazz
	 * @param id
	 * @return
	 */
	public static <T> T find(PersistContext pCtx, Class<T> clazz, Object id) {
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

	/**
	 * @param pCtx
	 * @param tableName
	 * @return
	 */
	public static ADTable findByTableName(PersistContext pCtx, String tableName) {
		if (StringUtil.isNullOrEmpty(tableName)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("tablename", tableName);
		return selectOneByNamedQuery(pCtx, "queryTableByTableName", ADTable.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param column
	 * @return
	 */
	public static ADElement findElementByColumn(PersistContext pCtx, String column) {
		if (StringUtil.isNullOrEmpty(column)) {
			return null;
		}
		Map<String, Object> paramMap = toMap("columnname", column);
		return selectOneByNamedQuery(pCtx, "queryElementByColumn", ADElement.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param entity
	 * @return
	 */
	public static Object getIdentifier(PersistContext pCtx, Object entity) {
		PersistenceUnitUtil puu = pCtx.getUnit().getPersistenceUnitUtil();
		return puu.getIdentifier(entity);
	}

	/**
	 * @param pName
	 * @param pValue
	 * @return
	 */
	public static Map<String, Object> toMap(String pName, Object pValue) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(pName, pValue);
		return paramMap;
	}

	/**
	 * @param pCtx
	 * @param queryName
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unused")
	private static <T> T selectOneByNamedQuery(PersistContext pCtx, String queryName, Class<T> clazz) {
		return selectOneByNamedQuery(pCtx, queryName, clazz, null);
	}

	/**
	 * @param pCtx
	 * @param queryName
	 * @param clazz
	 * @param paramMap
	 * @return
	 */
	private static <T> T selectOneByNamedQuery(PersistContext pCtx, String queryName, Class<T> clazz, Map<String, Object> paramMap) {
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
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * @param pCtx
	 * @param queryName
	 * @param clazz
	 * @return
	 */
	private static <T> List<T> selectListByNamedQuery(PersistContext pCtx, String queryName, Class<T> clazz) {
		return selectListByNamedQuery(pCtx, queryName, clazz, null);
	}

	/**
	 * @param pCtx
	 * @param queryName
	 * @param clazz
	 * @param paramMap
	 * @return
	 */
	private static <T> List<T> selectListByNamedQuery(PersistContext pCtx, String queryName, Class<T> clazz, Map<String, Object> paramMap) {
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

	/**
	 * @param pCtx
	 * @param adRefId
	 * @return
	 */
	public static RefCriteria queryRefTable(PersistContext pCtx, long adRefId) {
		Map<String, Object> paramMap = toMap("adReferenceId", adRefId);
		return selectOneByNamedQuery(pCtx, "queryRefTable", RefCriteria.class, paramMap);

	}

	/**
	 * @param pCtx
	 * @param tableId
	 * @return
	 */
	public static List<ADColumn> queryColumnsByTable(PersistContext pCtx, int tableId) {
		Map<String, Object> paramMap = toMap("adTableId", tableId);
		return selectListByNamedQuery(pCtx, "queryColumnsByTable", ADColumn.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param tableId
	 * @param tabId
	 * @return
	 */
	public static List<ADColumn> queryUnMappedColumns(PersistContext pCtx, int tableId, int tabId) {
		Map<String, Object> paramMap = toMap("adTableId", tableId);
		paramMap.put("adTabId", tabId);
		return selectListByNamedQuery(pCtx, "queryUnMappedColumns", ADColumn.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param windowId
	 * @return
	 */
	public static List<ADTab> queryTabsByWindow(PersistContext pCtx, int windowId) {
		Map<String, Object> paramMap = toMap("adWindowId", windowId);
		return selectListByNamedQuery(pCtx, "queryTabsByWindowId", ADTab.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param tabId
	 * @return
	 */
	public static List<ADField> queryFieldsByTabId(PersistContext pCtx, int tabId) {
		Map<String, Object> paramMap = toMap("adTabId", tabId);
		return selectListByNamedQuery(pCtx, "queryFieldsByTabId", ADField.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param tabId
	 * @return
	 */
	public static List<ADSequenceModel> querySeqByTabId(PersistContext pCtx, int tabId) {
		Map<String, Object> paramMap = toMap("adTabId", tabId);
		return selectListByNamedQuery(pCtx, "querySeqByTabId", ADSequenceModel.class, paramMap);
	}

	public static boolean updateFieldSequece(PersistContext pCtx, List<ADSequenceModel> seqList) {
		try {
			List<ADField> fieldList = new ArrayList<ADField>(seqList.size());
			for (ADSequenceModel seqModel : seqList) {
				ADField field = find(pCtx, ADField.class, seqModel.getSeqID());
				if (0 == seqModel.getSeqNo()) {
					field.setDisplayed(false);
					field.setSeqNo(0);
				} else {
					field.setDisplayed(true);
					field.setSeqNo(seqModel.getSeqNo());
				}
				fieldList.add(field);
			}
			return POUtil.mergeAll(pCtx, fieldList);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * @param pCtx
	 * @param entity
	 * @return
	 */
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

	/**
	 * @param pCtx
	 * @param entity
	 * @return
	 * @throws Exception
	 */
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

	/**
	 * @param pCtx
	 * @param list
	 * @return
	 */
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

	/**
	 * @param pCtx
	 * @param list
	 * @return
	 */
	public static boolean mergeAll(PersistContext pCtx, List<?> list) {
		try {
			EntityManager em = pCtx.begin();
			for (Object entity : list) {
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

	/**
	 * @param entity
	 */
	public static void initADEntity(Object entity) {
		if (entity instanceof ADEntityBase) {
			ADEntityBase adEntity = (ADEntityBase) entity;
			if (null == adEntity.getCreatedBy()) {
				adEntity.setCreatedBy(EnvUtil.getUser());
				adEntity.setCreated(EnvUtil.currentTimestamp());
				adEntity.setActive(true);
			}
			adEntity.setUpdatedBy(EnvUtil.getUser());
			adEntity.setUpdated(EnvUtil.currentTimestamp());
		}
	}

	/**
	 * @param pCtx
	 * @param windowId
	 * @return
	 */
	public static List<AdTabV> queryTabvsByWindowId(PersistContext pCtx, Integer windowId) {
		Map<String, Object> paramMap = toMap("adWindowId", windowId);
		List<AdTabV> tabVList = selectListByNamedQuery(pCtx, "queryTabvsByWindowId", AdTabV.class, paramMap);
		return tabVList;
	}

	public static List<AdTabVt> queryTabVTrlsByWindowId(PersistContext pCtx, Integer windowId, int languageId) {
		Map<String, Object> paramMap = toMap("adWindowId", windowId);
		paramMap.put("aDLanguageID", languageId);
		return selectListByNamedQuery(pCtx, "queryTabVTrlsByWindowId", AdTabVt.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @param adTabId
	 * @return
	 */
	public static List<AdFieldV> queryFieldvsByTabId(PersistContext pCtx, int adTabId) {
		Map<String, Object> paramMap = toMap("adTabId", adTabId);
		List<AdFieldV> fieldVList = selectListByNamedQuery(pCtx, "queryFieldvsByTabId", AdFieldV.class, paramMap);
		return fieldVList;
	}

	public static List<AdFieldVt> queryFieldVTrlsByTabId(PersistContext pCtx, int adTabId, int languageId) {
		Map<String, Object> paramMap = toMap("adTabId", adTabId);
		paramMap.put("aDLanguageID", languageId);
		List<AdFieldVt> fieldVList = selectListByNamedQuery(pCtx, "queryFieldVTrlsByTabId", AdFieldVt.class, paramMap);
		return fieldVList;
	}

	public static List<IdentifierColumn> queryIdColumnsByClass(PersistContext pCtx, Class<?> entityClass) {
		String tableName = POUtil.getTableFromEntity(entityClass);
		if (null == tableName) {
			return Collections.emptyList();
		}
		return queryIdColumnsByTable(pCtx, tableName);
	}

	public static List<IdentifierColumn> queryIdColumnsByTable(PersistContext pCtx, String table) {
		Map<String, Object> paramMap = toMap("tableName", table);
		List<IdentifierColumn> resultList = selectListByNamedQuery(pCtx, "queryIdColumnsByTable", IdentifierColumn.class, paramMap);
		return resultList;
	}

	/**
	 * @return
	 */
	public static List<ADMenu> queryMainMenuNodes(PersistContext pCtx) {
		List<ADMenu> menuList = selectListByNamedQuery(pCtx, "queryMainMenuNodes", ADMenu.class);
		return menuList;
	}

	public static List<ADMenuVt> queryMainMenuByLanguage(PersistContext pCtx, int languageID) {
		Map<String, Object> paramMap = toMap("aDLanguageID", languageID);
		List<ADMenuVt> menuList = selectListByNamedQuery(pCtx, "queryMainMenuByLanguage", ADMenuVt.class, paramMap);
		return menuList;
	}

	public static <T extends ADTreeNode> List<T> queryRootNodes(PersistContext pCtx, Class<T> clazz, int adTreeId, int adUserId) {
		Map<String, Object> paramMap = toMap("adTreeId", adTreeId);
		paramMap.put("adUserId", adUserId);
		return selectListByNamedQuery(pCtx, "queryRootNodes", clazz, paramMap);
	}

	public static <T extends ADTreeNode> List<T> querySubNodes(PersistContext pCtx, Class<T> clazz, int parentId) {
		Map<String, Object> paramMap = toMap("parentId", parentId);
		return selectListByNamedQuery(pCtx, "queryRootNodes", clazz, paramMap);
	}

	/**
	 * @param processId
	 * @return
	 */
	public static ADProcess queryProcessWithParamsByProcessId(PersistContext pCtx, Integer processId) {
		Map<String, Object> paramMap = toMap("adProcessId", processId);
		ADProcess process = selectOneByNamedQuery(pCtx, "queryProcessWithParamsByProcessId", ADProcess.class, paramMap);
		return process;
	}

	public static ADProcessVt queryProcessTrlWithParamsByProcessId(PersistContext pCtx, Integer processId, int languageId) {
		Map<String, Object> paramMap = toMap("aDProcessId", processId);
		paramMap.put("aDLanguageID", languageId);
		return selectOneByNamedQuery(pCtx, "queryProcessTrlWithParamsByProcessId", ADProcessVt.class, paramMap);
	}

	public static ADAttachment getAttachment(int tableId, long pFormatId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ADFormVt queryFormByLanguage(PersistContext pCtx, Integer formId, int languageId) {
		Map<String, Object> paramMap = toMap("adFormId", formId);
		paramMap.put("aDLanguageID", languageId);
		return selectOneByNamedQuery(pCtx, "queryFormByLanguage", ADFormVt.class, paramMap);
	}

	/**
	 * @param pCtx
	 * @return
	 */
	public static List<ADTable> queryTranslateTable(PersistContext pCtx) {
		return selectListByNamedQuery(pCtx, "queryTranslateTable", ADTable.class);
	}

	public static int executeNativeQuery(PersistContext pCtx, String sql, Map<String, Object> paramMap) {
		EntityManager em = pCtx.begin();
		try {
			Query query = em.createNativeQuery(sql);
			if (null != paramMap) {
				for (Entry<String, Object> pEntry : paramMap.entrySet()) {
					query.setParameter(pEntry.getKey(), pEntry.getValue());
				}
			}
			int count = query.executeUpdate();
			pCtx.commit();
			return count;
		} catch (Exception ex) {
			ex.printStackTrace();
			return -1;
		}
	}

	public static int executeQuery(PersistContext pCtx, String sql, Map<String, Object> paramMap) {
		EntityManager em = pCtx.begin();
		try {
			Query query = em.createQuery(sql);
			if (null != paramMap) {
				for (Entry<String, Object> pEntry : paramMap.entrySet()) {
					query.setParameter(pEntry.getKey(), pEntry.getValue());
				}
			}
			int count = query.executeUpdate();
			pCtx.commit();
			return count;
		} catch (Exception ex) {
			ex.printStackTrace();
			return -1;
		}
	}

	private static SimpleDateFormat	dateFormat	= new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat	fullFormat	= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static String toString(Timestamp time, boolean dayOnly) {
		if (null == time) {
			return "";
		}
		if (dayOnly) {
			return dateFormat.format(time);
		} else {
			return fullFormat.format(time);
		}
	}

	public static String getTableFromEntity(Class<?> entityClass) {
		Table table = entityClass.getAnnotation(Table.class);
		return (null != table) ? table.name() : null;
	}

}
