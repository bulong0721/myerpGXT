package org.adempiere.web.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.adempiere.common.ADExpression;
import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.DisplayType;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ADExpression.ADPredicate;
import org.adempiere.common.ProcessResult;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdForm;
import org.adempiere.model.AdProcess;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTreenodemm;
import org.adempiere.process.ProcessContext;
import org.adempiere.report.ReportStarter;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.RefTableCriteria;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADResultPair;
import org.adempiere.web.client.model.ADResultWithError;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.model.ADTreeNode;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.util.StringUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class AdempiereServiceImpl extends JPAServiceBase implements AdempiereService {

	@Override
	public List<ADTreeNode> getAdMenuModels() {
		try {
			EntityManager em = getEntityManager();
			TypedQuery<AdTreenodemm> query = em.createNamedQuery("queryMainMenuNodes", AdTreenodemm.class);
			List<AdTreenodemm> menuList = query.getResultList();
			List<ADTreeNode> resultList = new ArrayList<ADTreeNode>(menuList.size());
			for (AdTreenodemm nodeMM : menuList) {
				resultList.add(DTOUtil.toMenuModel(nodeMM));
			}
			return resultList;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ADResultWithError deleteData(List<ADModelKey> keyList, String tableName) {
		// TODO Auto-generated method stub
		return ADResultWithError.newSuccess();
	}

	@Override
	public ADResultWithError selectData(List<ADModelKey> keyList, String tableName) {
		// TODO Auto-generated method stub
		return ADResultWithError.newSuccess();
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
	public ADWindowModel getADWindowModel(Integer windowId) {
		ADWindowModel windowModel = new ADWindowModel();
		try {
			EntityManager em = getEntityManager();
			windowModel.setAdWindowId(windowId);
			TypedQuery<AdTabV> tabQuery = em.createNamedQuery("queryTabvsByWindowId", AdTabV.class);
			tabQuery.setParameter("adWindowId", windowId);
			List<ADTabModel> tabList = DTOUtil.toTabModels(tabQuery.getResultList());
			windowModel.setTabList(tabList);
			for (ADTabModel tabModel : tabList) {
				TypedQuery<AdFieldV> fieldQuery = em.createNamedQuery("queryFieldvsByTabId", AdFieldV.class);
				fieldQuery.setParameter("adTabId", tabModel.getAdTabId());
				List<ADFieldModel> fieldList = DTOUtil.toFieldModels(fieldQuery.getResultList());
				tabModel.setFieldList(fieldList);
			}
		} catch (Exception e) {
		}
		return windowModel;
	}

	@Override
	public ADJSONData getWindowTabData(ADLoadConfig loadCfg) {
		String entityClass = getEntityClassName(loadCfg.getTableName());
		System.out.println("fetchByClass1:" + entityClass);
		StringBuffer buffer = new StringBuffer();
		toString(loadCfg.getExpr(), buffer, 0);
		System.out.println(buffer.toString());
		String data = "[]";
		long totalCount = 0;
		try {
			EntityManager em = getEntityManager();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			Class<?> entityClazz = toClass(entityClass);
			CriteriaQuery cq = cb.createQuery(entityClazz);
			CriteriaQuery aq = cb.createQuery(Long.class);
			Root<?> root = cq.from(entityClazz);
			aq.from(entityClazz);
			aq.select(cb.count(root));
			ADModelKey parentKey = loadCfg.getParentKey();
			ADExpression expr = loadCfg.getExpr();
			cq.where(buildWhere(cb, root, expr, parentKey));
			aq.where(buildWhere(cb, root, expr, parentKey));
			TypedQuery<Long> countQuery = em.createQuery(aq);
			totalCount = countQuery.getSingleResult();
			if (totalCount > 0) {
				TypedQuery dataQuery = em.createQuery(cq);
				dataQuery.setFirstResult(loadCfg.getOffset());
				dataQuery.setMaxResults(loadCfg.getLimit());
				List oldList = dataQuery.getResultList();
				data = JSON.toJSONString(oldList, SerializerFeature.WriteClassName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ADJSONData jsonData = new ADJSONData(data);
		jsonData.setTotalCount(totalCount);
		System.out.println("count:" + totalCount + "=>data:" + data);
		return jsonData;
	}

	private void toString(ADExpression expr, StringBuffer buffer, int level) {
		if (null == expr) {
			return;
		}
		if (expr.isParent()) {
			ADPredicate pred = (ADPredicate) expr;
			appendTab(buffer, level).append(pred.getBooleanOperator().getSymbol()).append(" ");
			for (ADExpression subExpr : pred.getExpressions()) {
				toString(subExpr, buffer, level + 1);
			}
		} else {
			appendTab(buffer, level).append("(");
			buffer.append(expr.getColumnName()).append(" ").append(expr.getFieldOperator().getSymbol()).append(" ")
					.append(expr.getValue1());
			buffer.append(")").append("\n");
		}
	}

	StringBuffer appendTab(StringBuffer buffer, int level) {
		for (; level > 0; level--) {
			buffer.append("\t");
		}
		return buffer;
	}

	private Predicate buildWhere(CriteriaBuilder cb, Root<?> root, ADExpression expr, ADModelKey pKey) {
		List<Predicate> predList = new ArrayList<Predicate>();
		if (null != pKey) {
			Predicate pred = cb.equal(root.get(pKey.getKeyField()), pKey.getKeyValue());
			if (null != pred) {
				predList.add(pred);
			}
		}
		if (null != expr) {
			Predicate pred = buildWhere(cb, root, expr);
			if (null != pred) {
				predList.add(pred);
			}
		}
		Predicate[] predArray = new Predicate[predList.size()];
		return cb.and(predList.toArray(predArray));
	}

	private Predicate buildWhere(CriteriaBuilder cb, Root<?> root, ADExpression expr) {
		if (null == expr) {
			return null;
		}
		if (expr.isParent()) {
			ADPredicate pred = (ADPredicate) expr;
			if (null == pred.getExpressions()) {
				return null;
			}
			List<Predicate> predList = new ArrayList<Predicate>(pred.getExpressions().size());
			for (ADExpression subExpr : pred.getExpressions()) {
				Predicate subPred = buildWhere(cb, root, subExpr);
				if (null != subPred) {
					predList.add(subPred);
				}
			}
			Predicate[] predArray = new Predicate[predList.size()];
			switch (pred.getBooleanOperator()) {
			case And:
				return cb.and(predList.toArray(predArray));
			case Or:
				return cb.or(predList.toArray(predArray));
			default:
				break;
			}
		} else {
			Expression target = root.get(expr.getColumnName());
			switch (expr.getFieldOperator()) {
			case IsNull:
				return cb.isNull(target);
			case IsNotNull:
				return cb.isNotNull(target);
			case Equal:
				return cb.equal(target, expr.getValue1());
			case NotEqual:
				return cb.notEqual(target, expr.getValue1());
			case Gt:
				return cb.gt(target, StringUtil.toNumber(expr.getValue1()));
			case Ge:
				return cb.ge(target, StringUtil.toNumber(expr.getValue1()));
			case Lt:
				return cb.lt(target, StringUtil.toNumber(expr.getValue1()));
			case Le:
				return cb.le(target, StringUtil.toNumber(expr.getValue1()));
			case Between:
				return cb.between(target, StringUtil.toString(expr.getValue1()), StringUtil.toString(expr.getValue2()));
			case NotBetween:
				return cb.not(cb.between(target, StringUtil.toString(expr.getValue1()), StringUtil.toString(expr.getValue2())));
			case Like:
				return cb.like(target, StringUtil.toString(expr.getValue1()));
			case NotLike:
				return cb.notLike(target, StringUtil.toString(expr.getValue1()));
			default:
				break;
			}
		}
		return null;
	}

	private static Class<?> toClass(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}

	public static Class<?> getEntityClass(String tableName) throws ClassNotFoundException {
		return toClass(getEntityClassName(tableName));
	}

	public static String getEntityClassName(String tableName) {
		StringBuffer buffer = new StringBuffer("org.adempiere.model.");
		buffer.append(StringUtil.convertToPascal(tableName));
		return buffer.toString();
	}

	@Override
	public List<LookupValue> getOptions(String columnName, int type, Integer adRefId) {
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
			String tableName = getEntityClassName(criteria.getAdTable());
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
			Class<?> entityClazz = toClass(getEntityClassName(tableName));
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
	public ADProcessModel getADProcessModel(Integer processId) {
		ADProcessModel processModel = null;
		try {
			EntityManager em = getEntityManager();
			TypedQuery<AdProcess> query = em.createNamedQuery("queryProcessWithParamsByProcessId", AdProcess.class);
			query.setParameter("adProcessId", processId);
			processModel = DTOUtil.toProcessModel(query.getSingleResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return processModel;
	}

	@Override
	public ADResultWithError updateData(String text, String tableName) {
		EntityTransaction tx = null;
		System.out.println(text);
		try {
			EntityManager em = getEntityManager();
			Class<?> clazz = getEntityClass(tableName);
			List<?> array = JSON.parseArray(text, clazz);
			tx = em.getTransaction();
			tx.begin();
			for (Object entity : array) {
				System.out.println(entity.getClass());
				em.merge(entity);
			}
			tx.commit();
			return ADResultWithError.newSuccess();
		} catch (Exception e) {
			if (null != tx) {
				tx.rollback();
			}
			e.printStackTrace();
			return ADResultWithError.newError(e.getMessage());
		}
	}

	@Override
	public ADFormModel getADFormModel(Integer formId) {
		ADFormModel formModel = null;
		try {
			EntityManager em = getEntityManager();
			TypedQuery<AdForm> query = em.createNamedQuery("queryFormByFormId", AdForm.class);
			query.setParameter("adFormId", formId);
			formModel = DTOUtil.toFormModel(query.getSingleResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return formModel;
	}

	@Override
	public ADResultPair<ADProcessModel, ADFormModel> getProcessWithFormModel(Integer processId) {
		ADProcessModel processModel = getADProcessModel(processId);
		ADFormModel formModel = null;
		if (null != processModel.getAdFormId()) {
			formModel = getADFormModel(processModel.getAdFormId());
		}
		return new ADResultPair(processModel, formModel);
	}

	@Override
	public String processCallout(ADFieldModel field, String rowJson) {
		// TODO Auto-generated method stub
		System.out.println("parameter json:" + rowJson);
		return StringUtil.EMPTY;
	}

	@Override
	public ProcessResult executeProcess(ADProcessModel pModel, String paramJson) {
		// TODO Auto-generated method stub
		System.out.println("parameter json:" + paramJson);
		ProcessContext ctx = new ProcessContext() {
			@Override
			public Connection getConnection() {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					return DriverManager.getConnection("jdbc:mysql://localhost:3306/adempiere", "adempiere", "adempiere");
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		ReportStarter starter = new ReportStarter();
		ProcessResult pInfo = new ProcessResult();
		starter.startProcess(ctx, pInfo);
		return pInfo;
	}
}
