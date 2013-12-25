package org.adempiere.model.util;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.core.AdFieldV;
import org.adempiere.model.core.AdForm;
import org.adempiere.model.core.AdProcess;
import org.adempiere.model.core.AdProcessPara;
import org.adempiere.model.core.AdTabV;
import org.adempiere.model.core.AdTreenodemm;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADProcessArgModel;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.util.StringUtil;

public class DTOUtil {
	public static ADFieldModel toFieldModel(AdFieldV entity) {
		ADFieldModel model = new ADFieldModel();
		model.setAdFieldId(entity.getAdFieldId());
		model.setAdProcessId(entity.getAdProcessId());
		model.setAdReferenceId(entity.getAdReferenceId());
		model.setAdReferenceValueId(entity.getAdReferenceValueId());
		model.setCallout(entity.getCallout());
		model.setColumnname(entity.getColumnname());
		model.setDefaultvalue(entity.getDefaultvalue());
		model.setFieldgroup(entity.getFieldgroup());
		model.setFieldgrouptype(entity.getFieldgrouptype());
		model.setFieldlength(entity.getFieldlength());
		model.setIsdisplayed(StringUtil.isYes(entity.getIsdisplayed()));
		model.setIsencryptedcolumn(StringUtil.isYes(entity.getIsencryptedcolumn()));
		model.setIsencryptedfield(StringUtil.isYes(entity.getIsencryptedfield()));
		model.setIsfieldonly(StringUtil.isYes(entity.getIsfieldonly()));
		model.setIskey(StringUtil.isYes(entity.getIskey()));
		model.setIsmandatory(StringUtil.isYes(entity.getIsmandatory()));
		model.setIsparent(StringUtil.isYes(entity.getIsparent()));
		model.setIsreadonly(StringUtil.isYes(entity.getIsreadonly()));
		model.setIsselectioncolumn(StringUtil.isYes(entity.getIsselectioncolumn()));
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadonlylogic());
		model.setSeqno(entity.getSeqno());
		model.setSortno(entity.getSortno());
		model.setTablename(entity.getTablename());
		model.setValidationcode(entity.getValidationcode());
		model.setValuemax(entity.getValuemax());
		model.setValuemin(entity.getValuemin());
		model.setVformat(entity.getVformat());
		return model;
	}

	public static List<ADFieldModel> toFieldModels(List<AdFieldV> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<ADFieldModel> resultList = new ArrayList<ADFieldModel>(size);
		if (null != fieldList) {
			for (AdFieldV fieldEntity : fieldList) {
				resultList.add(toFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public static ADMenuModel toMenuModel(AdTreenodemm entity) {
		ADMenuModel model = new ADMenuModel();
		model.setIsactive(entity.getIsactive());
		model.setAdMenuId(entity.getId().getNodeId());
		model.setParentId(entity.getParentId());
		model.setSeqno(entity.getSeqno());
		if (null != entity.getAdMenu()) {
			model.setName(entity.getAdMenu().getName());
			model.setAdFormId(entity.getAdMenu().getAdFormId());
			model.setAdProcessId(entity.getAdMenu().getAdProcessId());
			model.setAdTaskId(entity.getAdMenu().getAdTaskId());
			model.setAdWindowId(entity.getAdMenu().getAdWindowId());
			model.setAdWorkbenchId(entity.getAdMenu().getAdWorkbenchId());
			model.setAdWorkflowId(entity.getAdMenu().getAdWorkflowId());
			model.setAction(entity.getAdMenu().getAction());
		}
		return model;
	}

	public static ADProcessModel toProcessModel(AdProcess entity) {
		ADProcessModel model = new ADProcessModel();
		model.setAdProcessId(entity.getAdProcessId());
		model.setAdFormId(entity.getAdFormId());
		model.setAdPrintformatId(entity.getAdPrintformatId());
		model.setAdReportviewId(entity.getAdReportviewId());
		model.setAdWorkflowId(entity.getAdWorkflowId());
		model.setClassname(entity.getClassname());
		model.setCopyfromprocess(entity.getCopyfromprocess());
		model.setIsactive(StringUtil.isYes(entity.getIsactive()));
		model.setIsdirectprint(StringUtil.isYes(entity.getIsdirectprint()));
		model.setIsreport(StringUtil.isYes(entity.getIsreport()));
		model.setIsserverprocess(StringUtil.isYes(entity.getIsserverprocess()));
		model.setJasperreport(entity.getJasperreport());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setProcedurename(entity.getProcedurename());
		model.setValue(entity.getValue());
		model.setWorkflowvalue(entity.getWorkflowvalue());
		if (null != entity.getAdProcessParas()) {
			model.setParamList(toProcessParameters(entity.getAdProcessParas()));
		}
		return model;
	}

	public static List<ADProcessModel> toProcessModels(List<AdProcess> list) {
		int size = null == list ? 0 : list.size();
		List<ADProcessModel> resultList = new ArrayList<ADProcessModel>(size);
		if (null != list) {
			for (AdProcess entity : list) {
				resultList.add(toProcessModel(entity));
			}
		}
		return resultList;
	}

	public static ADProcessArgModel toProcessParameter(AdProcessPara entity) {
		ADProcessArgModel model = new ADProcessArgModel();
		model.setAdProcessParaId(entity.getAdProcessParaId());
		model.setAdReferenceId(entity.getAdReferenceId());
		model.setAdReferenceValueId(entity.getAdReferenceValueId());
		model.setAdValRuleId(entity.getAdValRuleId());
		model.setColumnname(entity.getColumnname());
		model.setDefaultvalue(entity.getDefaultvalue());
		model.setDisplaylogic(entity.getDisplaylogic());
		model.setFieldlength(entity.getFieldlength());
		model.setIsactive(entity.getIsactive());
		model.setIscentrallymaintained(entity.getIscentrallymaintained());
		model.setIsmandatory(entity.getIsmandatory());
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadonlylogic());
		model.setSeqno(entity.getSeqno());
		model.setValuemax(entity.getValuemax());
		model.setValuemin(entity.getValuemin());
		model.setVformat(entity.getVformat());
		return model;
	}

	public static List<ADProcessArgModel> toProcessParameters(List<AdProcessPara> list) {
		int size = null == list ? 0 : list.size();
		List<ADProcessArgModel> resultList = new ArrayList<ADProcessArgModel>(size);
		if (null != list) {
			for (AdProcessPara entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static ADTabModel toTabModel(AdTabV entity) {
		ADTabModel model = new ADTabModel();
		model.setAdTabId(entity.getAdTabId());
		model.setAdColumnId(entity.getAdColumnId());
		model.setAdTableId(entity.getAdTableId());
		model.setParentColumnId(entity.getParentColumnId());
		model.setSeqno(entity.getSeqno());
		model.setTablevel(entity.getTablevel());
		model.setIsinfotab(StringUtil.isYes(entity.getIsinfotab()));
		model.setIsreadonly(StringUtil.isYes(entity.getIsreadonly()));
		model.setIssinglerow(StringUtil.isYes(entity.getIssinglerow()));
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadonlylogic());
		model.setTablename(entity.getTablename());
		model.setHasTree(StringUtil.isYes(entity.getHastree()));
		model.setIsSortTab(StringUtil.isYes(entity.getIssorttab()));
		model.setIsHighVolume(StringUtil.isYes(entity.getIshighvolume()));
		return model;
	}

	public static List<ADTabModel> toTabModels(List<AdTabV> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<ADTabModel> resultList = new ArrayList<ADTabModel>(size);
		if (null != tabList) {
			for (AdTabV tabEntity : tabList) {
				resultList.add(toTabModel(tabEntity));
			}
		}
		return resultList;
	}

	public static ADFormModel toFormModel(AdForm entity) {
		ADFormModel model = new ADFormModel();
		model.setAdFormId(entity.getAdFormId());
		model.setAccesslevel(entity.getAccesslevel());
		model.setAdClientId(entity.getAdClientId());
		model.setAdOrgId(entity.getAdOrgId());
		model.setClassname(entity.getClassname());
		model.setDescription(entity.getDescription());
		model.setHelp(entity.getHelp());
		model.setIsActive(StringUtil.isYes(entity.getIsactive()));
		model.setIsBetafunctionality(StringUtil.isYes(entity.getIsbetafunctionality()));
		model.setJspurl(entity.getJspurl());
		model.setName(entity.getName());
		return model;
	}

	public static List<ADFormModel> toFormModels(List<AdForm> formList) {
		int size = null == formList ? 0 : formList.size();
		List<ADFormModel> resultList = new ArrayList<ADFormModel>(size);
		if (null != formList) {
			for (AdForm formEntity : formList) {
				resultList.add(toFormModel(formEntity));
			}
		}
		return resultList;
	}
}
