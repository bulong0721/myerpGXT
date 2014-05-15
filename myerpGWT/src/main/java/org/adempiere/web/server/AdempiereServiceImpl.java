package org.adempiere.web.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import javax.servlet.http.HttpSession;

import org.adempiere.common.ADExpression;
import org.adempiere.common.ADExpression.ADPredicate;
import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.DisplayType;
import org.adempiere.common.IdentifierColumn;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ProcessResult;
import org.adempiere.common.RefCriteria;
import org.adempiere.model.ADMenu;
import org.adempiere.persist.PersistContext;
import org.adempiere.process.ProcessContext;
import org.adempiere.util.CLogger;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;
import org.adempiere.util.ProcessUtil;
import org.adempiere.web.client.exception.BusinessException;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADLoginModel;
import org.adempiere.web.client.model.ADNodeModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADSequenceModel;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.util.StringUtil;

import com.alibaba.fastjson.JSON;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class AdempiereServiceImpl extends RemoteServiceServlet implements AdempiereService {
	private static CLogger	log		= CLogger.getCLogger(AdempiereServiceImpl.class);
	private PersistContext	pCtx	= new PersistContext();

	public static void main(String[] args) {
		// String json =
		// "{\"adProcessId\":173,\"classname\":\"org.adempiere.process.TableCreateColumns\",\"description\":\"Create Dictionary Columns of Table not existing as a Column but in the Database\",\"isactive\":true,\"isdirectprint\":false,\"isreport\":false,\"isserverprocess\":false,\"name\":\"Create Columns from DB\",\"paramList\":[{\"adProcessParaId\":630,\"adReferenceId\":18,\"adReferenceValueId\":389,\"columnname\":\"EntityType\",\"defaultvalue\":\"U\",\"fieldType\":\"Table\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Entity Type\",\"seqno\":10},{\"adProcessParaId\":631,\"adReferenceId\":20,\"columnname\":\"AllTables\",\"defaultvalue\":false,\"fieldType\":\"YesNo\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Check all DB Tables\",\"seqno\":20}],\"value\":\"AD_Table_CreateColumns\"}";
		// String rowJson =
		// "{\"accesslevel\":\"6\",\"adClientId\":0,\"adOrgId\":0,\"adTableId\":906,\"adWindowId\":113,\"entitytype\":\"D\",\"isactive\":true,\"iscentrallymaintained\":true,\"ischangelog\":false,\"isdeleteable\":true,\"ishighvolume\":false,\"issecurityenabled\":false,\"isview\":false,\"loadseq\":125,\"name\":\"Workflow\",\"replicationtype\":\"L\",\"tablename\":\"AD_Workflow\"}";
		// String json =
		// "{\"adWindowId\":53110,\"classname\":\"org.adempiere.process.WindowCopy\",\"description\":\"Create Dictionary Columns of Table not existing as a Column but in the Database\",\"isactive\":true,\"isdirectprint\":false,\"isreport\":false,\"isserverprocess\":false,\"name\":\"Create Columns from DB\",\"paramList\":[{\"adProcessParaId\":630,\"adReferenceId\":18,\"adReferenceValueId\":389,\"columnname\":\"EntityType\",\"defaultvalue\":\"U\",\"fieldType\":\"Table\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Entity Type\",\"seqno\":10},{\"adProcessParaId\":631,\"adReferenceId\":20,\"columnname\":\"AllTables\",\"defaultvalue\":false,\"fieldType\":\"YesNo\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Check all DB Tables\",\"seqno\":20}],\"value\":\"AD_Table_CreateColumns\"}";
		// String rowJson = "{\"adWindowId\":53110}";
		//
		String json = "{\"classname\":\"org.adempiere.process.LanguageMaintenance\"}";
		String rowJson = "";
		ADProcessModel pModel = JSON.parseObject(json, ADProcessModel.class);
		ProcessContext ctx = ProcessUtil.createContext(pModel, rowJson, "{\"adWindowId\":103}");
		ProcessResult pInfo = new ProcessResult();
		try {
			ProcessUtil.process(ctx, pInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// AdempiereServiceImpl service = new AdempiereServiceImpl();
		// // List<IsTreeNode> nodes = service.getTreeNodes(10, null);
		// // System.out.println(nodes.size());
		// List<IsTreeNode> list = service.getAdMenuModels();
		// System.out.println(list.size());
	}

	static class ServiceUtil {

		public static Class<?> toClass(String className) throws ClassNotFoundException {
			return Class.forName(className);
		}

		public static StringBuffer appendTab(StringBuffer buffer, int level) {
			for (; level > 0; level--) {
				buffer.append("\t");
			}
			return buffer;
		}

		public static Predicate buildWhere(CriteriaBuilder cb, Root<?> root, ADExpression expr) {
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

		public static Class<?> getEntityClassByTable(String tableName) throws ClassNotFoundException {
			return AdempiereServiceImpl.ServiceUtil.toClass(ServiceUtil.getEntityClassNameByTable(tableName));
		}

		public static Class<?> getEntityClassByProperty(String propertyName) throws ClassNotFoundException {
			return AdempiereServiceImpl.ServiceUtil.toClass(ServiceUtil.getEntityClassNameByProperty(propertyName));
		}

		public static String getEntityClassNameByProperty(String propertyName) {
			StringBuffer buffer = new StringBuffer("org.adempiere.model.");
			// propertyName = propertyName.replace("_", "");
			buffer.append(propertyName.substring(0, 1).toUpperCase());
			buffer.append(propertyName, 1, propertyName.length() - 2);
			return buffer.toString();
		}

		public static String getEntityClassNameByTable(String tableName) {
			StringBuffer buffer = new StringBuffer("org.adempiere.model.");
			String className = tableName.replace("_", "");
			buffer.append(className);
			return buffer.toString();
		}

		public static Predicate buildWhere(CriteriaBuilder cb, Root<?> root, ADExpression expr, ADModelKey pKey) {
			List<Predicate> predList = new ArrayList<Predicate>();
			if (null != pKey) {
				Predicate pred = cb.equal(root.get(pKey.getKeyField()), pKey.getKeyValue());
				if (null != pred) {
					predList.add(pred);
				}
			}
			if (null != expr) {
				Predicate pred = AdempiereServiceImpl.ServiceUtil.buildWhere(cb, root, expr);
				if (null != pred) {
					predList.add(pred);
				}
			}
			Predicate[] predArray = new Predicate[predList.size()];
			return cb.and(predList.toArray(predArray));
		}

		public static void toString(ADExpression expr, StringBuffer buffer, int level) {
			if (null == expr) {
				return;
			}
			if (expr.isParent()) {
				ADPredicate pred = (ADPredicate) expr;
				AdempiereServiceImpl.ServiceUtil.appendTab(buffer, level).append(pred.getBooleanOperator().getSymbol()).append(" ");
				for (ADExpression subExpr : pred.getExpressions()) {
					toString(subExpr, buffer, level + 1);
				}
			} else {
				AdempiereServiceImpl.ServiceUtil.appendTab(buffer, level).append("(");
				buffer.append(expr.getColumnName()).append(" ").append(expr.getFieldOperator().getSymbol()).append(" ")
						.append(expr.getValue1());
				buffer.append(")").append("\n");
			}
		}

		public static <T> List<T> wrapper(List<T> jpaList) {
			return new ArrayList<T>(jpaList);
		}

	}

	@Override
	public void deleteData(List<ADModelKey> keyList, String tableName) {
	}

	@Override
	public ProcessResult executeProcess(ADProcessModel pModel, String rowJson, String paramJson) {
		System.out.println("row parameter:" + rowJson);
		System.out.println("process parameter:" + paramJson);
		System.out.println("process class:" + pModel.getClassname());
		ProcessContext ctx = ProcessUtil.createContext(pModel, rowJson, paramJson);
		ProcessResult pInfo = new ProcessResult();
		try {
			ProcessUtil.process(ctx, pInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pInfo;
	}

	@Override
	public ADFormModel getADFormModel(Integer formId) {
		return CoreModelFetch.getADFormByLanguage(pCtx, formId, getLanguage());
	}

	private int getLanguage() {
		return 187;
	}

	private HttpSession getSession() {
		return getThreadLocalRequest().getSession();
	}

	@Override
	public List<ADNodeModel> getMenuNodes(int parentID) {
		return CoreModelFetch.getADMenuListByLanguage(pCtx, getLanguage(), parentID);
	}

	@Override
	public ADProcessModel getADProcessModel(Integer processId) {
		return CoreModelFetch.getADProcessByLanguage(pCtx, processId, getLanguage());
	}

	@Override
	public ADUserContext getADUserContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADWindowModel getADWindowModel(Integer windowId) {
		return CoreModelFetch.getADWindowByLanguage(pCtx, windowId, getLanguage());
	}

	@Override
	public List<LookupValue> getOptions(String propertyName, int type, Integer adRefId) {
		System.out.println("propertyName=>" + propertyName + ";type=>" + type + ";adRefId=>" + adRefId);
		if (type == DisplayType.List.getValue()) {
			return getOptionsFromList(adRefId);
		} else if (type == DisplayType.Table.getValue() || (null != adRefId && type == DisplayType.Search.getValue())) {
			return getOptionsFromTable(adRefId);
		} else if (type == DisplayType.TableDir.getValue() || type == DisplayType.Search.getValue()) {
			return getOptionsFromTableDir(propertyName);
		}
		return Collections.emptyList();
	}

	public List<LookupValue> getOptionsFromList(long adRefId) {
		try {
			EntityManager em = pCtx.begin();
			TypedQuery<LookupValue> qurey = em.createNamedQuery("queryRefList", LookupValue.class);
			qurey.setParameter("adReferenceId", adRefId);
			List<LookupValue> lvList = qurey.getResultList();
			pCtx.commit();
			return ServiceUtil.wrapper(lvList);
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
			return Collections.emptyList();
		}
	}

	public List<LookupValue> getOptionsFromTable(long adRefId) {
		try {
			RefCriteria criteria = POUtil.queryRefTable(pCtx, adRefId);
			EntityManager em = pCtx.begin();
			String tableName = ServiceUtil.getEntityClassNameByTable(criteria.getAdTable());
			String keyColumn = criteria.getKeyColumn();
			String disColumn = criteria.getDisplayColumn();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<LookupValue> cq = cb.createQuery(LookupValue.class);
			Class<?> entityClazz = ServiceUtil.toClass(tableName);
			Root<?> root = cq.from(entityClazz);
			cq.select(cb.construct(LookupValue.class, root.get(keyColumn), root.get(disColumn)));
			TypedQuery<LookupValue> tq = em.createQuery(cq);
			List<LookupValue> resultList = ServiceUtil.wrapper(tq.getResultList());
			pCtx.commit();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
			return Collections.emptyList();
		}
	}

	public List<LookupValue> getOptionsFromTableDir(String propertyName) {
		if (StringUtil.isNullOrEmpty(propertyName) || !propertyName.endsWith("ID")) {
			return Collections.emptyList();
		}
		try {
			Class<?> entityClazz = ServiceUtil.getEntityClassByProperty(propertyName);
			List<IdentifierColumn> idCols = POUtil.queryIdColumnsByClass(pCtx, entityClazz);
			EntityManager em = pCtx.begin();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery cq = cb.createQuery(entityClazz);
			Root<?> root = cq.from(entityClazz);
			cq.select(cb.construct(LookupValue.class, getSelectList(root, propertyName, idCols)));
			TypedQuery tq = em.createQuery(cq);
			List<LookupValue> resultList = ServiceUtil.wrapper(tq.getResultList());
			pCtx.commit();
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
		}
		return Collections.emptyList();
	}

	private Selection[] getSelectList(Root<?> root, String keyColumn, List<IdentifierColumn> idCols) {
		List<Selection> resultList = new ArrayList<Selection>();
		resultList.add(root.get(keyColumn));
		if (idCols.isEmpty()) {
			resultList.add(root.get("name"));
		} else {
			for (IdentifierColumn idCol : idCols) {
				resultList.add(root.get(idCol.getPropertyName()));
			}
		}
		Selection[] result = new Selection[resultList.size()];
		return resultList.toArray(result);
	}

	@Override
	public ADProcessModel getProcessWithFormModel(Integer processId) {
		ADProcessModel processModel = getADProcessModel(processId);
		ADFormModel formModel = null;
		if (null != processModel.getAdFormId()) {
			formModel = getADFormModel(processModel.getAdFormId());
			processModel.setFormModel(formModel);
		}
		return processModel;
	}

	public List<ADNodeModel> getRootNodes(int adTreeId) {
		try {
			List<ADMenu> menuList = POUtil.queryMainMenuNodes(pCtx, 0);
			List<ADNodeModel> resultList = new ArrayList<ADNodeModel>(menuList.size());
			for (ADMenu nodeMM : menuList) {
				resultList.add(DTOUtil.toMenuModel(nodeMM));
			}
			return resultList;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ADSequenceModel> getSequences(ADLoadConfig loadCfg) {
		if ("ad_field".equalsIgnoreCase(loadCfg.getTableName())) {
			int adTabId = loadCfg.getParentKey().getKeyValue();
			List<ADSequenceModel> resultList = POUtil.querySeqByTabId(pCtx, adTabId);
			return new ArrayList<ADSequenceModel>(resultList);
		}
		return Collections.EMPTY_LIST;
	}

	@Override
	public List<ADNodeModel> getTreeNodes(int adTreeId, ADNodeModel loadCfg) {
		ADTreeBuilder treeBuilder = ADTreeBuilder.createTreeBuilder(adTreeId);
		List<ADNodeModel> entityList;
		if (null == loadCfg) {
			entityList = treeBuilder.getRootNodes(pCtx, 100);
		} else {
			entityList = treeBuilder.getSubNodes(pCtx, loadCfg.getID());
		}
		System.out.println("xxxxxxxxxxgetTreeNodes:" + entityList.size());
		return treeBuilder.toModels(entityList);
	}

	@Override
	public ADJSONData getWindowTabData(ADLoadConfig loadCfg) {
		String entityClass = ServiceUtil.getEntityClassNameByTable(loadCfg.getTableName());
		System.out.println("fetchByClass1:" + entityClass);
		StringBuffer buffer = new StringBuffer();
		ServiceUtil.toString(loadCfg.getExpr(), buffer, 0);
		System.out.println(buffer.toString());
		String data = "[]";
		long totalCount = 0;
		try {
			EntityManager em = pCtx.begin();
			CriteriaBuilder cb = em.getCriteriaBuilder();
			Class<?> entityClazz = ServiceUtil.toClass(entityClass);
			CriteriaQuery cq = cb.createQuery(entityClazz);
			CriteriaQuery aq = cb.createQuery(Long.class);
			Root<?> root = cq.from(entityClazz);
			aq.from(entityClazz);
			aq.select(cb.count(root));
			ADModelKey parentKey = loadCfg.getParentKey();
			ADExpression expr = loadCfg.getExpr();
			cq.where(ServiceUtil.buildWhere(cb, root, expr, parentKey));
			aq.where(ServiceUtil.buildWhere(cb, root, expr, parentKey));
			TypedQuery<Long> countQuery = em.createQuery(aq);
			totalCount = countQuery.getSingleResult();
			if (totalCount > 0) {
				TypedQuery dataQuery = em.createQuery(cq);
				dataQuery.setFirstResult(loadCfg.getOffset());
				dataQuery.setMaxResults(loadCfg.getLimit());
				List oldList = dataQuery.getResultList();
				data = JSON.toJSONString(oldList);
			}
			pCtx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
		}
		ADJSONData jsonData = new ADJSONData(data);
		jsonData.setTotalCount(totalCount);
		System.out.println("count:" + totalCount/* + "=>data:" + data */);
		return jsonData;
	}

	@Override
	public Boolean logout() {
		try {
			HttpSession session = getSession();
			session.invalidate();
			return true;
		} catch (Exception e) {
			log.warning("Error in logout method");
			return false;
		}
	}

	@Override
	public String processCallout(ADFieldModel field, String rowJson) {
		// TODO Auto-generated method stub
		System.out.println("callout parameter:" + rowJson);
		return StringUtil.EMPTY;
	}

	@Override
	public void selectData(List<ADModelKey> keyList, String tableName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateData(String text, String tableName) {
		System.out.println(text);
		try {
			EntityManager em = pCtx.begin();
			Class<?> clazz = ServiceUtil.getEntityClassByTable(tableName);
			List<?> array = JSON.parseArray(text, clazz);
			for (Object entity : array) {
				System.out.println(entity.getClass());
				POUtil.initADEntity(entity);
				em.merge(entity);
			}
			pCtx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			pCtx.rollback();
		}
	}

	@Override
	public void updateSequences(List<ADSequenceModel> seqList, String tableName) {
		if ("ad_field".equalsIgnoreCase(tableName)) {
			boolean isSusscess = POUtil.updateFieldSequece(pCtx, seqList);
			if (!isSusscess) {
				throw new BusinessException("");
			}
		}
	}

	@Override
	public Boolean login(ADLoginModel loginModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
