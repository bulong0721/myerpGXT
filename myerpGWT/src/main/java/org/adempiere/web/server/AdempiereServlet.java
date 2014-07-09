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

import org.adempiere.common.ADExpression;
import org.adempiere.common.ADExpression.ADPredicate;
import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.CalloutResult;
import org.adempiere.common.DisplayType;
import org.adempiere.common.IdentifierColumn;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ProcessResult;
import org.adempiere.common.RefCriteria;
import org.adempiere.model.ADMenu;
import org.adempiere.model.ADUser;
import org.adempiere.persist.PersistContext;
import org.adempiere.process.ProcessContext;
import org.adempiere.util.CalloutUtil;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;
import org.adempiere.util.PermissionUtil;
import org.adempiere.util.ProcessUtil;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.JsonResult;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.NodeModel;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.SequenceModel;
import org.adempiere.web.client.model.WindowModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.util.ExceptionUtil;
import org.adempiere.web.client.util.StringUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.alibaba.fastjson.JSON;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class AdempiereServlet extends RemoteServiceServlet implements AdempiereService {

    // private static CLogger log =
    // CLogger.getCLogger(AdempiereServiceImpl.class);
    private PersistContext pCtx = new PersistContext();
    @Inject
    @Named("systemName")
    private String         name;

    static class User {

        public String name;
        public String messge = "11111";
    }

    public static void main(String[] args) {
        PersistContext pCtx = new PersistContext();
        List<ADMenu> menuList = POUtil.queryMenuNodes(pCtx);
        System.out.println(menuList.size());
        // String json = "{\"name\":\"xubulong\",\"$key\":\"-5\"}";
        // User user = JSON.parseObject(json, User.class);
        // System.out.println(user);
        // try {
        // String json =
        // "[{\"aDClientID\":0,\"aDOrgID\":0,\"active\":true,\"view\":false,\"accessLevel\":\"4\",\"replicationType\":\"L\",\"deleteable\":true,\"centrallyMaintained\":true,\"tableName\":\"l_dirver\",\"name\":\"L_Dirver\",\"description\":\"l_dirver\",\"changeLog\":false,\"highVolume\":false}]";
        // AdempiereServlet service = new AdempiereServlet();
        // service.updateData(json, "ADTable");
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // String pJson =
        // "{\"adProcessId\":173,\"classname\":\"org.adempiere.process.TableCreateColumns\"}";
        // String rowJson = "{\"aDTableID\":906}";
        // String pJson =
        // "{\"adProcessId\":174,\"classname\":\"org.adempiere.process.TabCreateFields\"}";
        // String rowJson = "{\"aDTableID\":906,\"aDTabID\":53312}";

        // String json =
        // "{\"adWindowId\":53110,\"classname\":\"org.adempiere.process.WindowCopy\",\"description\":\"Create Dictionary Columns of Table not existing as a Column but in the Database\",\"isactive\":true,\"isdirectprint\":false,\"isreport\":false,\"isserverprocess\":false,\"name\":\"Create Columns from DB\",\"paramList\":[{\"adProcessParaId\":630,\"adReferenceId\":18,\"adReferenceValueId\":389,\"columnname\":\"EntityType\",\"defaultvalue\":\"U\",\"fieldType\":\"Table\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Entity Type\",\"seqno\":10},{\"adProcessParaId\":631,\"adReferenceId\":20,\"columnname\":\"AllTables\",\"defaultvalue\":false,\"fieldType\":\"YesNo\",\"fieldlength\":0,\"isactive\":true,\"iscentrallymaintained\":true,\"isdisplayed\":true,\"isencryptedfield\":false,\"iskey\":false,\"ismandatory\":true,\"issameline\":false,\"name\":\"Check all DB Tables\",\"seqno\":20}],\"value\":\"AD_Table_CreateColumns\"}";
        // String rowJson = "{\"adWindowId\":53110}";
        //
        // String json =
        // "{\"classname\":\"org.adempiere.process.LanguageMaintenance\"}";
        // String rowJson = "";
        // ADProcessModel pModel = JSON.parseObject(pJson,
        // ADProcessModel.class);
        // ProcessContext ctx = ProcessUtil.createContext(pModel, rowJson,
        // "{\"aDTableID\":906}");
        // ProcessResult pInfo = new ProcessResult();
        // try {
        // ProcessUtil.process(ctx, pInfo);
        // ctx.managedCommit();
        // } catch (Exception e) {
        // e.printStackTrace();
        // ctx.managedRollback();
        // }
        // AdempiereServiceImpl service = new AdempiereServiceImpl();
        // // List<IsTreeNode> nodes = service.getTreeNodes(10, null);
        // // System.out.println(nodes.size());
        // List<IsTreeNode> list = service.getAdMenuModels();
        // System.out.println(list.size());
        // PersistContext pCtx = new PersistContext();
        // ADUser user = POUtil.queryUserByName(pCtx, "System");
        // List<ADUserRoles> roleList = user.getADUserRoles();
        // System.out.println(JSON.toJSONString(user));
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
                        return cb.between(target, StringUtil.toString(expr.getValue1()),
                                          StringUtil.toString(expr.getValue2()));
                    case NotBetween:
                        return cb.not(cb.between(target, StringUtil.toString(expr.getValue1()),
                                                 StringUtil.toString(expr.getValue2())));
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
            return AdempiereServlet.ServiceUtil.toClass(ServiceUtil.getEntityClassNameByTable(tableName));
        }

        public static Class<?> getEntityClassByProperty(String propertyName) throws ClassNotFoundException {
            return AdempiereServlet.ServiceUtil.toClass(ServiceUtil.getEntityClassNameByProperty(propertyName));
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
                Predicate pred = AdempiereServlet.ServiceUtil.buildWhere(cb, root, expr);
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
                AdempiereServlet.ServiceUtil.appendTab(buffer, level).append(pred.getBooleanOperator().getSymbol()).append(" ");
                for (ADExpression subExpr : pred.getExpressions()) {
                    toString(subExpr, buffer, level + 1);
                }
            } else {
                AdempiereServlet.ServiceUtil.appendTab(buffer, level).append("(");
                buffer.append(expr.getColumnName()).append(" ").append(expr.getFieldOperator().getSymbol()).append(" ").append(expr.getValue1());
                buffer.append(")").append("\n");
            }
        }

        public static <T> List<T> wrapper(List<T> jpaList) {
            return new ArrayList<T>(jpaList);
        }

    }

    @Override
    public void deleteData(List<ADModelKey> keyList, String tableName) throws RuntimeException {
    }

    @Override
    public ProcessResult executeProcess(ProcessModel pModel, String rowJson, String paramJson) throws RuntimeException {
        System.out.println("row parameter:" + rowJson);
        System.out.println("process parameter:" + paramJson);
        System.out.println("process class:" + pModel.getClassName());
        ProcessContext ctx = ProcessUtil.createContext(pModel, rowJson, paramJson);
        ProcessResult pInfo = new ProcessResult();
        try {
            ProcessUtil.process(ctx, pInfo);
            ctx.managedCommit();
        } catch (Exception e) {
            e.printStackTrace();
            ctx.managedRollback();
        }
        return pInfo;
    }

    @Override
    public FormModel getADFormModel(Integer formId) throws RuntimeException {
        return ADServiceI18n.getADFormByLanguage(pCtx, formId, getLanguage());
    }

    private int getLanguage() {
        return 0;
    }

    @Override
    public List<NodeModel> getMenuNodes(int parentID) throws RuntimeException {
        return ADServiceI18n.getADMenuListByLanguage(pCtx, getLanguage(), parentID);
    }

    @Override
    public ProcessModel getADProcessModel(Integer processId) throws RuntimeException {
        return ADServiceI18n.getADProcessByLanguage(pCtx, processId, getLanguage());
    }

    @Override
    public ADUserContext getADUserContext() throws RuntimeException {
        Subject subject = PermissionUtil.getSubject();
        ADUser user = (ADUser) subject.getPrincipal();
        return DTOUtil.toUerContext(user);
    }

    @Override
    public WindowModel getADWindowModel(Integer windowId) throws RuntimeException {
        return ADServiceI18n.getADWindowByLanguage(pCtx, windowId, getLanguage());
    }

    @Override
    public List<LookupValue> getOptions(String propertyName, int type, Integer adRefId) throws RuntimeException {
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
            cq.orderBy(cb.asc(root.get(disColumn)));
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
            Expression[] selection = getSelectList(root, propertyName, idCols);
            cq.select(cb.construct(LookupValue.class, selection));
            cq.orderBy(cb.asc(selection[1]));
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

    private Expression[] getSelectList(Root<?> root, String keyColumn, List<IdentifierColumn> idCols) {
        List<Expression> resultList = new ArrayList<Expression>();
        resultList.add(root.get(keyColumn));
        if (idCols.isEmpty()) {
            resultList.add(root.get("name"));
        } else {
            for (IdentifierColumn idCol : idCols) {
                resultList.add(root.get(idCol.getPropertyName()));
            }
        }
        Expression[] result = new Expression[resultList.size()];
        return resultList.toArray(result);
    }

    @Override
    public ProcessModel getProcessWithFormModel(Integer processId) throws RuntimeException {
        ProcessModel processModel = getADProcessModel(processId);
        FormModel formModel = null;
        if (null != processModel.getADFormID()) {
            formModel = getADFormModel(processModel.getADFormID());
            processModel.setFormModel(formModel);
        }
        return processModel;
    }

    @Override
    public List<SequenceModel> getSequences(PageRequest loadCfg) throws RuntimeException {
        if ("ad_field".equalsIgnoreCase(loadCfg.getTableName())) {
            int adTabId = loadCfg.getParentKey().getKeyValue();
            List<SequenceModel> resultList = POUtil.querySeqByTabId(pCtx, adTabId);
            return new ArrayList<SequenceModel>(resultList);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<NodeModel> getTreeNodes(int adTreeId, NodeModel loadCfg) throws RuntimeException {
        ADTreeBuilder treeBuilder = ADTreeBuilder.createTreeBuilder(adTreeId);
        List<NodeModel> entityList;
        if (null == loadCfg) {
            entityList = treeBuilder.getRootNodes(pCtx, 100);
        } else {
            entityList = treeBuilder.getSubNodes(pCtx, loadCfg.getID());
        }
        System.out.println("xxxxxxxxxxgetTreeNodes:" + entityList.size());
        return treeBuilder.toModels(entityList);
    }

    @Override
    public JsonResult getWindowTabData(PageRequest loadCfg) throws RuntimeException {
        // try {
        // PermissionUtil.checkWindowAccess((int) loadCfg.getWindowID());
        // } catch (Exception e1) {
        // throw ExceptionUtil.encodeBusinessException(e1);
        // }
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
        JsonResult jsonData = new JsonResult(data);
        jsonData.setTotalCount(totalCount);
        System.out.println("count:" + totalCount/* + "=>data:" + data */);
        return jsonData;
    }

    @Override
    public Boolean logout() throws RuntimeException {
        Subject subject = PermissionUtil.getSubject();
        subject.logout();
        return true;
    }

    @Override
    public CalloutResult processCallout(FieldModel field, String rowJson) throws RuntimeException {
        System.out.println("callout parameter:" + rowJson);
        return CalloutUtil.processCallout(pCtx, field, rowJson);
    }

    @Override
    public void updateData(String text, String tableName) throws RuntimeException {
        try {
            Class<?> clazz = ServiceUtil.getEntityClassByTable(tableName);
            List<?> array = JSON.parseArray(text, clazz);
            POUtil.mergeAll(pCtx, array);
        } catch (Exception e) {
            throw ExceptionUtil.encodeBusinessException(e);
        }
    }

    @Override
    public void updateSequences(List<SequenceModel> seqList, String tableName) throws RuntimeException {
        if ("ad_field".equalsIgnoreCase(tableName)) {
            boolean isSusscess = POUtil.updateFieldSequece(pCtx, seqList);
            if (!isSusscess) {
                throw ExceptionUtil.encodeBusinessException("");
            }
        }
    }

    @Override
    public ADUserContext login(String username, String password) throws RuntimeException {
        System.out.println(name);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            Subject subject = PermissionUtil.getSubject();
            subject.login(token);
            return getADUserContext();
        } catch (AuthenticationException e) {
            throw ExceptionUtil.encodeBusinessException(e);
        } catch (Throwable e) {
            e.printStackTrace();
            throw ExceptionUtil.encodeSystemException(e);
        }
    }

}
