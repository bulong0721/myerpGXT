package org.adempiere.util;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.ADField;
import org.adempiere.model.ADForm;
import org.adempiere.model.ADFormVt;
import org.adempiere.model.ADMenu;
import org.adempiere.model.ADMenuVt;
import org.adempiere.model.ADProcess;
import org.adempiere.model.ADProcessPara;
import org.adempiere.model.ADProcessParaVt;
import org.adempiere.model.ADProcessVt;
import org.adempiere.model.ADTab;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdFieldVt;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTabVt;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADProcessArgModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADTabModel;

public final class DTOUtil {

	public static ADFieldModel toFieldModel(AdFieldV entity) {
		ADFieldModel model = new ADFieldModel();
		model.setADFieldID(entity.getADFieldID());
		model.setADProcessID(entity.getADProcessID());
		model.setADReferenceID(entity.getADReferenceID());
		model.setADReferenceValueID(entity.getADReferenceValueID());
		model.setCallout(entity.getCallout());
		model.setPropertyName(entity.getPropertyName());
		model.setDefaultValue(entity.getDefaultValue());
		model.setFieldGroup(entity.getFieldGroup());
		model.setFieldGroupType(entity.getFieldGroupType());
		model.setFieldLength(entity.getFieldLength());
		model.setDisplayed(entity.isDisplayed());
		model.setEncryptedColumn(entity.isEncryptedColumn());
		model.setEncryptedField(entity.isEncryptedField());
		model.setFieldonly(entity.isFieldOnly());
		model.setKey(entity.isKey());
		model.setMandatory(entity.isMandatory());
		model.setParent(entity.isParent());
		model.setReadonly(entity.isReadOnly());
		model.setSelectionColumn(entity.isSelectionColumn());
		model.setName(entity.getName());
		model.setReadonlyLogic(entity.getReadOnlyLogic());
		model.setSeqNo(entity.getSeqNo());
		model.setSortNo(entity.getSortNo());
		model.setTableName(entity.getTableName());
		model.setValidationCode(entity.getValidationCode());
		model.setValueMax(entity.getValueMax());
		model.setValueMin(entity.getValueMin());
		model.setVFormat(entity.getVFormat());
		return model;
	}

	public static ADFieldModel toFieldModel(AdFieldVt entity) {
		ADFieldModel model = new ADFieldModel();
		model.setADFieldID(entity.getADFieldID());
		model.setADProcessID(entity.getADProcessID());
		model.setADReferenceID(entity.getADReferenceID());
		model.setADReferenceValueID(entity.getADReferenceValueID());
		model.setCallout(entity.getCallout());
		model.setPropertyName(entity.getPropertyName());
		model.setDefaultValue(entity.getDefaultValue());
		model.setFieldGroup(entity.getFieldGroup());
		model.setFieldGroupType(entity.getFieldGroupType());
		model.setFieldLength(entity.getFieldLength());
		model.setDisplayed(entity.isDisplayed());
		model.setEncryptedColumn(entity.isEncryptedColumn());
		model.setEncryptedField(entity.isEncryptedField());
		model.setFieldonly(entity.isFieldOnly());
		model.setKey(entity.isKey());
		model.setMandatory(entity.isMandatory());
		model.setParent(entity.isParent());
		model.setReadonly(entity.isReadOnly());
		model.setSelectionColumn(entity.isSelectionColumn());
		model.setName(entity.getName());
		model.setReadonlyLogic(entity.getReadOnlyLogic());
		model.setSeqNo(entity.getSeqNo());
		model.setSortNo(entity.getSortNo());
		model.setTableName(entity.getTableName());
		model.setValidationCode(entity.getValidationCode());
		model.setValueMax(entity.getValueMax());
		model.setValueMin(entity.getValueMin());
		model.setVFormat(entity.getVFormat());
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

	public static List<ADFieldModel> toFieldTrlModels(List<AdFieldVt> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<ADFieldModel> resultList = new ArrayList<ADFieldModel>(size);
		if (null != fieldList) {
			for (AdFieldVt fieldEntity : fieldList) {
				resultList.add(toFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public static ADMenuModel toMenuModel(ADMenu entity) {
		ADMenuModel model = new ADMenuModel();
		model.setIsactive(entity.isActive());
		model.setSummary(entity.isSummary());
		model.setAdMenuId(entity.getNodeID());
		model.setParentId(entity.getParentID());
		model.setSeqno(entity.getSeqNo());
		model.setName(entity.getName());
		model.setAdFormId(entity.getADFormID());
		model.setAdProcessId(entity.getADProcessID());
		model.setAdTaskId(entity.getADTaskID());
		model.setAdWindowId(entity.getADWindowID());
		model.setAdWorkbenchId(entity.getADWorkbenchID());
		model.setAdWorkflowId(entity.getADWorkflowID());
		model.setAction(entity.getAction());
		return model;
	}

	public static ADMenuModel toMenuModel(ADMenuVt entity) {
		ADMenuModel model = new ADMenuModel();
		model.setIsactive(entity.isActive());
		model.setSummary(entity.isSummary());
		model.setAdMenuId(entity.getNodeID());
		model.setParentId(entity.getParentID());
		model.setSeqno(entity.getSeqNo());
		model.setName(entity.getName());
		model.setAdFormId(entity.getADFormID());
		model.setAdProcessId(entity.getADProcessID());
		model.setAdTaskId(entity.getADTaskID());
		model.setAdWindowId(entity.getADWindowID());
		model.setAdWorkbenchId(entity.getADWorkbenchID());
		model.setAdWorkflowId(entity.getADWorkflowID());
		model.setAction(entity.getAction());
		return model;
	}

	public static List<ADMenuModel> toMenuModels(List<ADMenu> list) {
		int size = null == list ? 0 : list.size();
		List<ADMenuModel> resultList = new ArrayList<ADMenuModel>(size);
		if (null != list) {
			for (ADMenu entity : list) {
				resultList.add(toMenuModel(entity));
			}
		}
		return resultList;
	}

	public static ADProcessModel toProcessModel(ADProcess entity) {
		ADProcessModel model = new ADProcessModel();
		model.setAdProcessId(entity.getADProcessID());
		model.setAdFormId(entity.getADFormID());
		model.setAdPrintformatId(entity.getADPrintFormatID());
		model.setAdReportviewId(entity.getADReportViewID());
		model.setAdWorkflowId(entity.getADWorkflowID());
		model.setClassname(entity.getClassname());
		model.setCopyfromprocess(entity.isCopyFromProcess());
		model.setIsactive(entity.isActive());
		model.setIsdirectprint(entity.isDirectPrint());
		model.setIsreport(entity.isReport());
		model.setIsserverprocess(entity.isServerProcess());
		model.setJasperreport(entity.getJasperReport());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setProcedurename(entity.getProcedureName());
		model.setValue(entity.getValue());
		model.setWorkflowvalue(entity.getWorkflowValue());
		if (null != entity.getADProcessParas()) {
			model.setParamList(toProcessParameters(entity.getADProcessParas()));
		}
		return model;
	}

	public static ADProcessModel toProcessTrlModel(ADProcessVt entity) {
		ADProcessModel model = new ADProcessModel();
		model.setAdProcessId(entity.getADProcessID());
		model.setAdFormId(entity.getADFormID());
		model.setAdPrintformatId(entity.getADPrintFormatID());
		model.setAdReportviewId(entity.getADReportViewID());
		model.setAdWorkflowId(entity.getADWorkflowID());
		model.setClassname(entity.getClassname());
		model.setCopyfromprocess(entity.isCopyFromProcess());
		model.setIsactive(entity.isActive());
		model.setIsdirectprint(entity.isDirectPrint());
		model.setIsreport(entity.isReport());
		model.setIsserverprocess(entity.isServerProcess());
		model.setJasperreport(entity.getJasperReport());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setProcedurename(entity.getProcedureName());
		model.setValue(entity.getValue());
		model.setWorkflowvalue(entity.getWorkflowValue());
		if (null != entity.getADProcessParaVts()) {
			model.setParamList(toProcessParameterTrls(entity.getADProcessParaVts()));
		}
		return model;
	}

	public static List<ADProcessModel> toProcessModels(List<ADProcess> list) {
		int size = null == list ? 0 : list.size();
		List<ADProcessModel> resultList = new ArrayList<ADProcessModel>(size);
		if (null != list) {
			for (ADProcess entity : list) {
				resultList.add(toProcessModel(entity));
			}
		}
		return resultList;
	}

	public static ADProcessArgModel toProcessParameter(ADProcessPara entity) {
		ADProcessArgModel model = new ADProcessArgModel();
		model.setADProcessParaID(entity.getADProcessParaID());
		model.setADReferenceID(entity.getADReferenceID());
		model.setADReferenceValueID(entity.getADReferenceValueID());
		model.setADValRuleID(entity.getADValRuleID());
		model.setPropertyName(entity.getPropertyName());
		model.setDefaultValue(entity.getDefaultValue());
		model.setDisplayLogic(entity.getDisplayLogic());
		model.setFieldLength(entity.getFieldLength());
		model.setActive(entity.isActive());
		model.setCentrallyMaintained(entity.isCentrallyMaintained());
		model.setMandatory(entity.isMandatory());
		model.setName(entity.getName());
		model.setReadonlyLogic(entity.getReadOnlyLogic());
		model.setSeqNo(entity.getSeqNo());
		model.setValueMax(entity.getValueMax());
		model.setValueMin(entity.getValueMin());
		model.setVFormat(entity.getVFormat());
		return model;
	}
	
	public static ADProcessArgModel toProcessParameter(ADProcessParaVt entity) {
		ADProcessArgModel model = new ADProcessArgModel();
		model.setADProcessParaID(entity.getADProcessParaID());
		model.setADReferenceID(entity.getADReferenceID());
		model.setADReferenceValueID(entity.getADReferenceValueID());
		model.setADValRuleID(entity.getADValRuleID());
		model.setPropertyName(entity.getPropertyName());
		model.setDefaultValue(entity.getDefaultValue());
		model.setDisplayLogic(entity.getDisplayLogic());
		model.setFieldLength(entity.getFieldLength());
		model.setActive(entity.isActive());
		model.setCentrallyMaintained(entity.isCentrallyMaintained());
		model.setMandatory(entity.isMandatory());
		model.setName(entity.getName());
		model.setReadonlyLogic(entity.getReadOnlyLogic());
		model.setSeqNo(entity.getSeqNo());
		model.setValueMax(entity.getValueMax());
		model.setValueMin(entity.getValueMin());
		model.setVFormat(entity.getVFormat());
		return model;
	}

	public static List<ADProcessArgModel> toProcessParameters(List<ADProcessPara> list) {
		int size = null == list ? 0 : list.size();
		List<ADProcessArgModel> resultList = new ArrayList<ADProcessArgModel>(size);
		if (null != list) {
			for (ADProcessPara entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static List<ADProcessArgModel> toProcessParameterTrls(List<ADProcessParaVt> list) {
		int size = null == list ? 0 : list.size();
		List<ADProcessArgModel> resultList = new ArrayList<ADProcessArgModel>(size);
		if (null != list) {
			for (ADProcessParaVt entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static ADTabModel toTabModel(AdTabVt entity) {
		ADTabModel model = new ADTabModel();
		model.setAdTabId(entity.getADTabID());
		model.setAdColumnId(entity.getADColumnID());
		model.setAdTableId(entity.getADTableID());
		model.setParentColumnId(entity.getParentColumnID());
		model.setSeqno(entity.getSeqNo());
		model.setTablevel(entity.getTabLevel());
		model.setIsinfotab(entity.isInfoTab());
		model.setIsreadonly(entity.isReadOnly());
		model.setIssinglerow(entity.isSingleRow());
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadOnlyLogic());
		model.setTablename(entity.getTableName());
		model.setHasTree(entity.isHasTree());
		model.setIsSortTab(entity.isSortTab());
		model.setIsHighVolume(entity.isHighVolume());
		return model;
	}

	public static ADTabModel toTabModel(AdTabV entity) {
		ADTabModel model = new ADTabModel();
		model.setAdTabId(entity.getADTabID());
		model.setAdColumnId(entity.getADColumnID());
		model.setAdTableId(entity.getADTableID());
		model.setParentColumnId(entity.getParentColumnID());
		model.setSeqno(entity.getSeqNo());
		model.setTablevel(entity.getTabLevel());
		model.setIsinfotab(entity.isInfoTab());
		model.setIsreadonly(entity.isReadOnly());
		model.setIssinglerow(entity.isSingleRow());
		model.setName(entity.getName());
		model.setReadonlylogic(entity.getReadOnlyLogic());
		model.setTablename(entity.getTableName());
		model.setHasTree(entity.isHasTree());
		model.setIsSortTab(entity.isSortTab());
		model.setIsHighVolume(entity.isHighVolume());
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

	public static List<ADTabModel> toTabTrlModels(List<AdTabVt> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<ADTabModel> resultList = new ArrayList<ADTabModel>(size);
		if (null != tabList) {
			for (AdTabVt tabEntity : tabList) {
				resultList.add(toTabModel(tabEntity));
			}
		}
		return resultList;
	}

	public static ADFormModel toFormModel(ADForm entity) {
		ADFormModel model = new ADFormModel();
		model.setAdFormId(entity.getADFormID());
		model.setAccesslevel(entity.getAccessLevel());
		model.setAdClientId(entity.getADClientID());
		model.setAdOrgId(entity.getADOrgID());
		model.setClassname(entity.getClassname());
		model.setDescription(entity.getDescription());
		model.setHelp(entity.getHelp());
		model.setIsActive(entity.isActive());
		model.setIsBetafunctionality(entity.isBetaFunctionality());
		model.setJspurl(entity.getJSPURL());
		model.setName(entity.getName());
		return model;
	}

	public static List<ADFormModel> toFormModels(List<ADForm> formList) {
		int size = null == formList ? 0 : formList.size();
		List<ADFormModel> resultList = new ArrayList<ADFormModel>(size);
		if (null != formList) {
			for (ADForm formEntity : formList) {
				resultList.add(toFormModel(formEntity));
			}
		}
		return resultList;
	}

	public static ADTab copyTab(ADTab tab, Integer windowId) {
		ADTab newTab = new ADTab();
		newTab.setADClientID(tab.getADClientID());
		newTab.setADColumnID(tab.getADColumnID());
		newTab.setADColumnSortOrderID(tab.getADColumnSortOrderID());
		newTab.setADColumnSortYesNoID(tab.getADColumnSortYesNoID());
		newTab.setADImageID(tab.getADImageID());
		newTab.setADOrgID(tab.getADOrgID());
		newTab.setADProcessID(tab.getADProcessID());
		newTab.setADTabID(tab.getADTabID());
		newTab.setADTableID(tab.getADTableID());
		newTab.setADWindowID(windowId);
		newTab.setCommitWarning(tab.getCommitWarning());
		newTab.setCreated(tab.getCreated());
		newTab.setCreatedBy(tab.getCreatedBy());
		newTab.setDescription(tab.getDescription());
		newTab.setDisplayLogic(tab.getDisplayLogic());
		newTab.setEntityType(tab.getEntityType());
		newTab.setHasTree(tab.isHasTree());
		newTab.setHelp(tab.getHelp());
		newTab.setImportFields(tab.isImportFields());
		newTab.setIncludedTabID(tab.getIncludedTabID());
		newTab.setActive(tab.isActive());
		newTab.setAdvancedTab(tab.isAdvancedTab());
		newTab.setInfoTab(tab.isInfoTab());
		newTab.setInsertRecord(tab.isInsertRecord());
		newTab.setReadOnly(tab.isReadOnly());
		newTab.setSingleRow(tab.isSingleRow());
		newTab.setSortTab(tab.isSortTab());
		newTab.setTranslationTab(tab.isTranslationTab());
		newTab.setName(tab.getName());
		newTab.setOrderByClause(tab.getOrderByClause());
		newTab.setParentColumnID(tab.getParentColumnID());
		newTab.setProcessing(tab.isProcessing());
		newTab.setReadOnlyLogic(tab.getReadOnlyLogic());
		newTab.setSeqNo(tab.getSeqNo());
		newTab.setTabLevel(tab.getTabLevel());
		newTab.setUpdated(tab.getUpdated());
		newTab.setUpdatedBy(tab.getUpdatedBy());
		newTab.setWhereClause(tab.getWhereClause());
		return newTab;
	}

	public static ADField copyField(ADField field, Integer tabId) {
		ADField newField = new ADField();
		newField.setADClientID(field.getADClientID());
		newField.setADColumnID(field.getADColumnID());
		newField.setADFieldID(field.getADFieldID());
		newField.setADFieldGroupID(field.getADFieldGroupID());
		newField.setADOrgID(field.getADOrgID());
		newField.setADReferenceID(field.getADReferenceID());
		newField.setADReferenceValueID(field.getADReferenceValueID());
		newField.setADTabID(tabId);
		newField.setADValRuleID(field.getADValRuleID());
		newField.setCreated(field.getCreated());
		newField.setCreatedBy(field.getCreatedBy());
		newField.setDefaultValue(field.getDefaultValue());
		newField.setDescription(field.getDescription());
		newField.setDisplayLength(field.getDisplayLength());
		newField.setDisplayLogic(field.getDisplayLogic());
		newField.setEntityType(field.getEntityType());
		newField.setHelp(field.getHelp());
		newField.setIncludedTabID(field.getIncludedTabID());
		newField.setInfoFactoryClass(field.getInfoFactoryClass());
		newField.setActive(field.isActive());
		newField.setCentrallyMaintained(field.isCentrallyMaintained());
		newField.setDisplayed(field.isDisplayed());
		newField.setEncrypted(field.isEncrypted());
		newField.setFieldOnly(field.isFieldOnly());
		newField.setHeading(field.isHeading());
		newField.setMandatory(field.isMandatory());
		newField.setReadOnly(field.isReadOnly());
		newField.setSameLine(field.isSameLine());
		newField.setName(field.getName());
		newField.setObscureType(field.getObscureType());
		newField.setSeqNo(field.getSortNo());
		newField.setSortNo(field.getSortNo());
		newField.setUpdated(field.getUpdated());
		newField.setUpdatedBy(field.getUpdatedBy());

		return newField;
	}

	public static ADFormModel toFormVTrlModel(ADFormVt entity) {
		ADFormModel model = new ADFormModel();
		model.setAdFormId(entity.getADFormID());
		model.setAccesslevel(entity.getAccessLevel());
		model.setAdClientId(entity.getADClientID());
		model.setAdOrgId(entity.getADOrgID());
		model.setClassname(entity.getClassname());
		model.setDescription(entity.getDescription());
		model.setHelp(entity.getHelp());
		model.setIsActive(entity.isActive());
		model.setIsBetafunctionality(entity.isBetaFunctionality());
		model.setJspurl(entity.getJSPURL());
		model.setName(entity.getName());
		return model;
	}
}
