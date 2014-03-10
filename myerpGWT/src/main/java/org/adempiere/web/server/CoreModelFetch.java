package org.adempiere.web.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.adempiere.model.ADForm;
import org.adempiere.model.ADFormVTrl;
import org.adempiere.model.ADMenu;
import org.adempiere.model.ADMenuVTrl;
import org.adempiere.model.ADProcess;
import org.adempiere.model.ADProcessVTrl;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdFieldVTrl;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTabVTrl;
import org.adempiere.persist.PersistContext;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.model.IsTreeNode;

public final class CoreModelFetch {
	
	public static boolean isBaseLanguage(int languageId) {
		return 0 == languageId;
	}

	public static ADWindowModel getADWindow4BaseLanguage(PersistContext pCtx, Integer windowId) {
		ADWindowModel windowModel = new ADWindowModel();
		try {
			windowModel.setAdWindowId(windowId);
			List<AdTabV> tabVList = POUtil.queryTabvsByWindowId(pCtx, windowId);
			List<ADTabModel> tabList = DTOUtil.toTabModels(tabVList);
			windowModel.setTabList(tabList);
			for (ADTabModel tabModel : tabList) {
				List<AdFieldV> fieldVList = POUtil.queryFieldvsByTabId(pCtx, tabModel.getAdTabId());
				List<ADFieldModel> fieldList = DTOUtil.toFieldModels(fieldVList);
				tabModel.setFieldList(fieldList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windowModel;
	}

	public static ADWindowModel getADWindowByLanguage(PersistContext pCtx, Integer windowId, int languageId) {
		if (isBaseLanguage(languageId)) {
			return getADWindow4BaseLanguage(pCtx, windowId);
		}
		ADWindowModel windowModel = new ADWindowModel();
		try {
			windowModel.setAdWindowId(windowId);
			List<AdTabVTrl> tabVList = POUtil.queryTabVTrlsByWindowId(pCtx, windowId, languageId);
			List<ADTabModel> tabList = DTOUtil.toTabTrlModels(tabVList);
			windowModel.setTabList(tabList);
			for (ADTabModel tabModel : tabList) {
				List<AdFieldVTrl> fieldVList = POUtil.queryFieldVTrlsByTabId(pCtx, tabModel.getAdTabId(), languageId);
				List<ADFieldModel> fieldList = DTOUtil.toFieldTrlModels(fieldVList);
				tabModel.setFieldList(fieldList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return windowModel;
	}

	public static ADProcessModel getADProcess4BaseLanguage(PersistContext pCtx, Integer processId) {
		ADProcessModel processModel = null;
		try {
			ADProcess process = POUtil.queryProcessWithParamsByProcessId(pCtx, processId);
			processModel = DTOUtil.toProcessModel(process);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return processModel;
	}

	public static ADProcessModel getADProcessByLanguage(PersistContext pCtx, Integer processId, int languageId) {
		if (isBaseLanguage(languageId)) {
			return getADProcess4BaseLanguage(pCtx, processId);
		}
		ADProcessModel processModel = null;
		try {
			ADProcessVTrl process = POUtil.queryProcessTrlWithParamsByProcessId(pCtx, processId, languageId);
			processModel = DTOUtil.toProcessTrlModel(process);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return processModel;
	}

	public static ADFormModel getADForm4BaseLanguage(PersistContext pCtx, Integer formId) {
		ADFormModel formModel = null;
		try {
			ADForm form = POUtil.find(pCtx, ADForm.class, formId);
			formModel = DTOUtil.toFormModel(form);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return formModel;
	}

	public static ADFormModel getADFormByLanguage(PersistContext pCtx, Integer formId, int languageId) {
		if (isBaseLanguage(languageId)) {
			return getADForm4BaseLanguage(pCtx, formId);
		}
		ADFormModel formModel = null;
		try {
			ADFormVTrl form = POUtil.queryFormByLanguage(pCtx, formId, languageId);
			formModel = DTOUtil.toFormModel(form);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return formModel;
	}

	public static List<IsTreeNode> getADMenuList4BaseLanguage(PersistContext pCtx) {
		try {
			List<ADMenu> menuList = POUtil.queryMainMenuNodes(pCtx);
			List<IsTreeNode> resultList = new ArrayList<IsTreeNode>(menuList.size());
			for (ADMenu nodeMM : menuList) {
				resultList.add(DTOUtil.toMenuModel(nodeMM));
			}
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public static List<IsTreeNode> getADMenuListByLanguage(PersistContext pCtx, int languageId) {
		if (isBaseLanguage(languageId)) {
			return getADMenuList4BaseLanguage(pCtx);
		}
		try {
			List<ADMenuVTrl> menuList = POUtil.queryMainMenuByLanguage(pCtx, languageId);
			List<IsTreeNode> resultList = new ArrayList<IsTreeNode>(menuList.size());
			for (ADMenuVTrl nodeMM : menuList) {
				resultList.add(DTOUtil.toMenuModel(nodeMM));
			}
			return resultList;
		} catch (Exception e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}
