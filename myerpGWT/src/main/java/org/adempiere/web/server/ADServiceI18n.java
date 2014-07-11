package org.adempiere.web.server;

import java.util.List;

import org.adempiere.model.ADForm;
import org.adempiere.model.ADFormVt;
import org.adempiere.model.ADProcess;
import org.adempiere.model.ADProcessVt;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdFieldVt;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTabVt;
import org.adempiere.service.PersistContext;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.model.WindowModel;

public final class ADServiceI18n {

    public static boolean isBaseLanguage(int languageId) {
        return 0 == languageId;
    }

    public static WindowModel getADWindow4BaseLanguage(PersistContext pCtx, Integer windowId) {
        WindowModel windowModel = new WindowModel();
        try {
            windowModel.setAdWindowId(windowId);
            List<AdTabV> tabVList = POUtil.queryTabvsByWindowId(pCtx, windowId);
            List<TabModel> tabList = DTOUtil.toTabModels(tabVList);
            windowModel.setTabList(tabList);
            for (TabModel tabModel : tabList) {
                List<AdFieldV> fieldVList = POUtil.queryFieldvsByTabId(pCtx, tabModel.getADTabID());
                List<FieldModel> fieldList = DTOUtil.toFieldModels(fieldVList);
                tabModel.setFieldList(fieldList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return windowModel;
    }

    public static WindowModel getADWindowByLanguage(PersistContext pCtx, Integer windowId, int languageId) {
        if (isBaseLanguage(languageId)) {
            return getADWindow4BaseLanguage(pCtx, windowId);
        }
        WindowModel windowModel = new WindowModel();
        try {
            windowModel.setAdWindowId(windowId);
            List<AdTabVt> tabVList = POUtil.queryTabVTrlsByWindowId(pCtx, windowId, languageId);
            List<TabModel> tabList = DTOUtil.toTabTrlModels(tabVList);
            windowModel.setTabList(tabList);
            for (TabModel tabModel : tabList) {
                List<AdFieldVt> fieldVList = POUtil.queryFieldVTrlsByTabId(pCtx, tabModel.getADTabID(), languageId);
                List<FieldModel> fieldList = DTOUtil.toFieldTrlModels(fieldVList);
                tabModel.setFieldList(fieldList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return windowModel;
    }

    public static ProcessModel getADProcess4BaseLanguage(PersistContext pCtx, Integer processId) {
        ProcessModel processModel = null;
        try {
            ADProcess process = POUtil.queryProcessWithParamsByProcessId(pCtx, processId);
            processModel = DTOUtil.toProcessModel(process);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return processModel;
    }

    public static ProcessModel getADProcessByLanguage(PersistContext pCtx, Integer processId, int languageId) {
        if (isBaseLanguage(languageId)) {
            return getADProcess4BaseLanguage(pCtx, processId);
        }
        ProcessModel processModel = null;
        try {
            ADProcessVt process = POUtil.queryProcessTrlWithParamsByProcessId(pCtx, processId, languageId);
            processModel = DTOUtil.toProcessTrlModel(process);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return processModel;
    }

    public static FormModel getADForm4BaseLanguage(PersistContext pCtx, Integer formId) {
        FormModel formModel = null;
        try {
            ADForm form = POUtil.find(pCtx, ADForm.class, formId);
            formModel = DTOUtil.toFormModel(form);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formModel;
    }

    public static FormModel getADFormByLanguage(PersistContext pCtx, Integer formId, int languageId) {
        if (isBaseLanguage(languageId)) {
            return getADForm4BaseLanguage(pCtx, formId);
        }
        FormModel formModel = null;
        try {
            ADFormVt form = POUtil.queryFormByLanguage(pCtx, formId, languageId);
            formModel = DTOUtil.toFormVTrlModel(form);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return formModel;
    }

}
