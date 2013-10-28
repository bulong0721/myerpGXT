package org.adempiere.web.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.adempiere.web.client.model.AdFieldModel;
import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.model.AdWindowModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.shared.AdModelKey;
import org.adempiere.web.shared.LookupValue;
import org.adempiere.web.shared.adempiere.ADUserContext;
import org.adempiere.web.shared.adempiere.AdFieldV;
import org.adempiere.web.shared.adempiere.AdProcess;
import org.adempiere.web.shared.adempiere.AdTab;
import org.adempiere.web.shared.adempiere.AdTabV;
import org.adempiere.web.shared.adempiere.AdTreenodemm;
import org.adempiere.web.shared.adempiere.DisplayType;
import org.adempiere.web.shared.adempiere.RefTableCriteria;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class AdempiereServiceImpl extends JPAServiceBase implements AdempiereService {

	@Override
	public List<AdMenuModel> getAdMenu() {
		try {
			EntityManager em = getEntityManager();
			TypedQuery<AdTreenodemm> query = em.createNamedQuery("queryMainMenuNodes", AdTreenodemm.class);
			List<AdTreenodemm> menuList = query.getResultList();
			List<AdMenuModel> resultList = new ArrayList<AdMenuModel>(menuList.size());
			for (AdTreenodemm nodeMM : menuList) {
				resultList.add(new AdMenuModel(nodeMM));
			}
			return resultList;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Boolean deleteData(List<AdModelKey> keyList, String tableName) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean selectData(List<AdModelKey> keyList, String tableName) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean addNewData(AdTab tabModel) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public ADUserContext getADUserContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean logout() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public AdWindowModel getADWindowModel(long windowId) {
		AdWindowModel windowModel = new AdWindowModel();
		try {
			EntityManager em = getEntityManager();
			windowModel.setAdWindowId(windowId);
			TypedQuery<AdTabV> tabQuery = em.createNamedQuery("queryTabvsByWindowId", AdTabV.class);
			tabQuery.setParameter("adWindowId", windowId);
			List<AdTabModel> tabList = AdTabModel.from(tabQuery.getResultList());
			windowModel.setTabList(tabList);
			for (AdTabModel tabModel : tabList) {
				TypedQuery<AdFieldV> fieldQuery = em.createNamedQuery("queryFieldvsByTabId", AdFieldV.class);
				fieldQuery.setParameter("adTabId", tabModel.getAdTabId());
				List<AdFieldModel> fieldList = AdFieldModel.from(fieldQuery.getResultList());
				tabModel.setFieldList(fieldList);
			}
		} catch (Exception e) {
		}
		return windowModel;
	}

	@Override
	public AdJSONData getWindowTabData(AdLoadConfig loadCfg) {
		String entityClass = getEntityClass(loadCfg.getTableName());
		System.out.println("fetchByClass1:" + entityClass);
		String data = "";
		try {
			EntityManager em = getEntityManager();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			Class<?> entityClazz = toClass(entityClass);
			CriteriaQuery cq = cb.createQuery(entityClazz);
			Root<?> root = cq.from(entityClazz);
			AdModelKey parentKey = loadCfg.getParentKey();
			if (null != parentKey) {
				cq.where(cb.equal(root.get(parentKey.getKeyField()), parentKey.getKeyValue()));
			}
			TypedQuery tq = em.createQuery(cq);
			tq.setFirstResult(loadCfg.getOffset());
			tq.setMaxResults(loadCfg.getLimit());
			List oldList = tq.getResultList();
			data = JSON.toJSONString(oldList, SerializerFeature.WriteClassName);
			System.out.println(entityClass + " Json:" + data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new AdJSONData(data);
	}

	private Class<?> toClass(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}

	public static String getEntityClass(String tableName) {
		StringBuffer buffer = new StringBuffer();
		if (tableName.toUpperCase().startsWith("AD_")) {
			buffer.append("org.adempiere.web.shared.adempiere.");
		} else {
			buffer.append("org.adempiere.web.shared.business.");
		}
		buffer.append(StringUtil.convertToPascal(tableName));
		return buffer.toString();
	}

	@Override
	public List<LookupValue> getOptions(String columnName, int type, Long adRefId) {
		if (type == DisplayType.List.getValue()) {
			return getOptionsFromList(adRefId);
		}
		if (type == DisplayType.Table.getValue()) {
			return getOptionsFromTable(adRefId);
		}
		if (type == DisplayType.TableDir.getValue()) {
			return getOptionsFromTableDir(columnName);
		}
		return Collections.emptyList();
	}

	public List<LookupValue> getOptionsFromTable(long adRefId) {
		try {
			EntityManager em = getEntityManager();
			TypedQuery<RefTableCriteria> qurey = em.createNamedQuery("queryRefTable", RefTableCriteria.class);
			qurey.setParameter("adReferenceId", adRefId);
			RefTableCriteria criteria = qurey.getSingleResult();
			String tableName = getEntityClass(criteria.getAdTable());
			String keyColumn = StringUtil.convertToCamel(criteria.getKeyColumn());
			String disColumn = StringUtil.convertToCamel(criteria.getDisplayColumn());
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<LookupValue> cq = cb.createQuery(LookupValue.class);
			Class<?> entityClazz = toClass(tableName);
			Root<?> root = cq.from(entityClazz);
			cq.select(cb.construct(LookupValue.class, root.get(disColumn), root.get(keyColumn)));
			TypedQuery<LookupValue> tq = em.createQuery(cq);
			return wrapper(tq.getResultList());
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public List<LookupValue> getOptionsFromTableDir(String columnName) {
		if (StringUtil.isNullOrEmpty(columnName) || !columnName.endsWith("_ID")) {
			return Collections.emptyList();
		}
		try {
			String tableName = StringUtil.trimEnd(columnName, "_ID");
			EntityManager em = getEntityManager();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			Class<?> entityClazz = toClass(getEntityClass(tableName));
			CriteriaQuery cq = cb.createQuery(entityClazz);
			Root<?> root = cq.from(entityClazz);
			String keyColumn = StringUtil.toCamelStyle(columnName);
			cq.select(cb.construct(LookupValue.class, root.get("name"), root.get(keyColumn)));
			TypedQuery tq = em.createQuery(cq);
			return wrapper(tq.getResultList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<LookupValue> getOptionsFromList(long adRefId) {
		try {
			EntityManager em = getEntityManager();
			TypedQuery<LookupValue> qurey = em.createNamedQuery("queryRefList", LookupValue.class);
			qurey.setParameter("adReferenceId", adRefId);
			return wrapper(qurey.getResultList());
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	<T> List<T> wrapper(List<T> jpaList) {
		return new ArrayList<T>(jpaList);
	}

	@Override
	public AdProcessModel getADProcessModel(long processId) {
		AdProcessModel processModel = null;
		try {
			EntityManager em = getEntityManager();
			TypedQuery<AdProcess> query = em.createNamedQuery("queryProcessWithParamsByProcessId", AdProcess.class);
			query.setParameter("adProcessId", processId);
			processModel = new AdProcessModel(query.getSingleResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return processModel;
	}
}
