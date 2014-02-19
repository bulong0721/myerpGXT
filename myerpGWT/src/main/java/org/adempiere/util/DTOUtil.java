package org.adempiere.util;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.AdField;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdForm;
import org.adempiere.model.AdMenu;
import org.adempiere.model.AdProcess;
import org.adempiere.model.AdProcessPara;
import org.adempiere.model.AdTab;
import org.adempiere.model.AdTabV;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADProcessArgModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADTabModel;

public final class DTOUtil {
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
		model.setIsdisplayed(entity.getIsdisplayed());
		model.setIsencryptedcolumn(entity.getIsencryptedcolumn());
		model.setIsencryptedfield(entity.getIsencryptedfield());
		model.setIsfieldonly(entity.getIsfieldonly());
		model.setIskey(entity.getIskey());
		model.setIsmandatory(entity.getIsmandatory());
		model.setIsparent(entity.getIsparent());
		model.setIsreadonly(entity.getIsreadonly());
		model.setIsselectioncolumn(entity.getIsselectioncolumn());
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

	public static ADMenuModel toMenuModel(AdMenu entity) {
		ADMenuModel model = new ADMenuModel();
		model.setIsactive(entity.isIsactive());
		model.setAdMenuId(entity.getNodeId());
		model.setParentId(entity.getParentId());
		model.setSeqno(entity.getSeqno());
		model.setName(entity.getName());
		model.setAdFormId(entity.getAdFormId());
		model.setAdProcessId(entity.getAdProcessId());
		model.setAdTaskId(entity.getAdTaskId());
		model.setAdWindowId(entity.getAdWindowId());
		model.setAdWorkbenchId(entity.getAdWorkbenchId());
		model.setAdWorkflowId(entity.getAdWorkflowId());
		model.setAction(entity.getAction());
		return model;
	}
	
	public static List<ADMenuModel> toMenuModels(List<AdMenu> list) {
		int size = null == list ? 0 : list.size();
		List<ADMenuModel> resultList = new ArrayList<ADMenuModel>(size);
		if (null != list) {
			for (AdMenu entity : list) {
				resultList.add(toMenuModel(entity));
			}
		}
		return resultList;
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
		model.setIsactive(entity.isIsactive());
		model.setIsdirectprint(entity.isIsdirectprint());
		model.setIsreport(entity.isIsreport());
		model.setIsserverprocess(entity.isIsserverprocess());
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
		model.setIsactive(entity.isIsactive());
		model.setIscentrallymaintained(entity.isIscentrallymaintained());
		model.setIsmandatory(entity.isIsmandatory());
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
		model.setIsinfotab(entity.getIsinfotab());
		model.setIsreadonly(entity.getIsreadonly());
		model.setIssinglerow(entity.getIssinglerow());
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadonlylogic());
		model.setTablename(entity.getTablename());
		model.setHasTree(entity.getHastree());
		model.setIsSortTab(entity.getIssorttab());
		model.setIsHighVolume(entity.getIshighvolume());
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
		model.setIsActive(entity.isIsactive());
		model.setIsBetafunctionality(entity.isIsbetafunctionality());
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

	public static AdTab copyTab(AdTab tab, Integer windowId) {
		AdTab newTab = new AdTab();
		newTab.setAdClientId(tab.getAdClientId());
		newTab.setAdColumnId(tab.getAdColumnId());
		newTab.setAdColumnsortorderId(tab.getAdColumnsortorderId());
		newTab.setAdColumnsortyesnoId(tab.getAdColumnsortyesnoId());
		newTab.setAdImageId(tab.getAdImageId());
		newTab.setAdOrgId(tab.getAdOrgId());
		newTab.setAdProcessId(tab.getAdProcessId());
		newTab.setAdTabId(tab.getAdTabId());
		newTab.setAdTableId(tab.getAdTableId());
		newTab.setAdWindowId(windowId);
		newTab.setCommitwarning(tab.getCommitwarning());
		newTab.setCreated(tab.getCreated());
		newTab.setCreatedby(tab.getCreatedby());
		newTab.setDescription(tab.getDescription());
		newTab.setDisplaylogic(tab.getDisplaylogic());
		newTab.setEntitytype(tab.getEntitytype());
		newTab.setHastree(tab.getHastree());
		newTab.setHelp(tab.getHelp());
		newTab.setImportfields(tab.getImportfields());
		newTab.setIncludedTabId(tab.getIncludedTabId());
		newTab.setIsactive(tab.isIsactive());
		newTab.setIsadvancedtab(tab.isIsadvancedtab());
		newTab.setIsinfotab(tab.isIsinfotab());
		newTab.setIsinsertrecord(tab.isIsinsertrecord());
		newTab.setIsreadonly(tab.isIsreadonly());
		newTab.setIssinglerow(tab.isIssinglerow());
		newTab.setIssorttab(tab.isIssorttab());
		newTab.setIstranslationtab(tab.isIstranslationtab());
		newTab.setName(tab.getName());
		newTab.setOrderbyclause(tab.getOrderbyclause());
		newTab.setParentColumnId(tab.getParentColumnId());
		newTab.setProcessing(tab.isProcessing());
		newTab.setReadonlylogic(tab.getReadonlylogic());
		newTab.setSeqno(tab.getSeqno());
		newTab.setTablevel(tab.getTablevel());
		newTab.setUpdated(tab.getUpdated());
		newTab.setUpdatedby(tab.getUpdatedby());
		newTab.setWhereclause(tab.getWhereclause());
		return newTab;
	}

	public static AdField copyField(AdField field, Integer tabId) {
		AdField newField = new AdField();
		newField.setAdClientId(field.getAdClientId());
		newField.setAdColumnId(field.getAdColumnId());
		newField.setAdFieldId(field.getAdFieldId());
		newField.setAdFieldgroupId(field.getAdFieldgroupId());
		newField.setAdOrgId(field.getAdOrgId());
		newField.setAdReferenceId(field.getAdReferenceId());
		newField.setAdReferenceValueId(field.getAdReferenceValueId());
		newField.setAdTabId(tabId);
		newField.setAdValRuleId(field.getAdValRuleId());
		newField.setCreated(field.getCreated());
		newField.setCreatedby(field.getCreatedby());
		newField.setDefaultvalue(field.getDefaultvalue());
		newField.setDescription(field.getDescription());
		newField.setDisplaylength(field.getDisplaylength());
		newField.setDisplaylogic(field.getDisplaylogic());
		newField.setEntitytype(field.getEntitytype());
		newField.setHelp(field.getHelp());
		newField.setIncludedTabId(field.getIncludedTabId());
		newField.setInfofactoryclass(field.getInfofactoryclass());
		newField.setIsactive(field.isIsactive());
		newField.setIscentrallymaintained(field.isIscentrallymaintained());
		newField.setIsdisplayed(field.isIsdisplayed());
		newField.setIsencrypted(field.isIsencrypted());
		newField.setIsfieldonly(field.isIsfieldonly());
		newField.setIsheading(field.isIsheading());
		newField.setIsmandatory(field.isIsmandatory());
		newField.setIsreadonly(field.isIsreadonly());
		newField.setIssameline(field.isIssameline());
		newField.setName(field.getName());
		newField.setObscuretype(field.getObscuretype());
		newField.setSeqno(field.getSeqno());
		newField.setSortno(field.getSortno());
		newField.setUpdated(field.getUpdated());
		newField.setUpdatedby(field.getUpdatedby());

		return newField;
	}
}
