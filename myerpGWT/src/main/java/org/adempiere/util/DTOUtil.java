package org.adempiere.util;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.common.ADUserContext;
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
import org.adempiere.model.ADUser;
import org.adempiere.model.AdFieldV;
import org.adempiere.model.AdFieldVt;
import org.adempiere.model.AdTabV;
import org.adempiere.model.AdTabVt;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.ProcessArgModel;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.TabModel;

public final class DTOUtil {

	public static FieldModel toFieldModel(AdFieldV entity) {
		FieldModel model = new FieldModel();
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
		model.setReadOnly(entity.isReadOnly());
		model.setAlwaysUpdateable(entity.isAlwaysUpdateable());
		model.setUpdatable(entity.isUpdateable());
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

	public static FieldModel toFieldModel(AdFieldVt entity) {
		FieldModel model = new FieldModel();
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
		model.setReadOnly(entity.isReadOnly());
		model.setAlwaysUpdateable(entity.isAlwaysUpdateable());
		model.setUpdatable(entity.isUpdateable());
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

	public static List<FieldModel> toFieldModels(List<AdFieldV> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<FieldModel> resultList = new ArrayList<FieldModel>(size);
		if (null != fieldList) {
			for (AdFieldV fieldEntity : fieldList) {
				resultList.add(toFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public static List<FieldModel> toFieldTrlModels(List<AdFieldVt> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<FieldModel> resultList = new ArrayList<FieldModel>(size);
		if (null != fieldList) {
			for (AdFieldVt fieldEntity : fieldList) {
				resultList.add(toFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public static MenuModel toMenuModel(ADMenu entity) {
		MenuModel model = new MenuModel();
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

	public static MenuModel toMenuModel(ADMenuVt entity) {
		MenuModel model = new MenuModel();
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

	public static List<MenuModel> toMenuModels(List<ADMenu> list) {
		int size = null == list ? 0 : list.size();
		List<MenuModel> resultList = new ArrayList<MenuModel>(size);
		if (null != list) {
			for (ADMenu entity : list) {
				resultList.add(toMenuModel(entity));
			}
		}
		return resultList;
	}

	public static ProcessModel toProcessModel(ADProcess entity) {
		ProcessModel model = new ProcessModel();
		model.setADProcessID(entity.getADProcessID());
		model.setADFormID(entity.getADFormID());
		model.setADPrintFormatID(entity.getADPrintFormatID());
		model.setADReportViewID(entity.getADReportViewID());
		model.setADWorkFlowID(entity.getADWorkflowID());
		model.setClassName(entity.getClassname());
		model.setCopyFromProcess(entity.isCopyFromProcess());
		model.setActive(entity.isActive());
		model.setDirectPrint(entity.isDirectPrint());
		model.setReport(entity.isReport());
		model.setServerProcess(entity.isServerProcess());
		model.setJasperReport(entity.getJasperReport());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setProcedureName(entity.getProcedureName());
		model.setValue(entity.getValue());
		model.setWorkflowValue(entity.getWorkflowValue());
		if (null != entity.getADProcessParas()) {
			model.setParamList(toProcessParameters(entity.getADProcessParas()));
		}
		return model;
	}

	public static ProcessModel toProcessTrlModel(ADProcessVt entity) {
		ProcessModel model = new ProcessModel();
		model.setADProcessID(entity.getADProcessID());
		model.setADFormID(entity.getADFormID());
		model.setADPrintFormatID(entity.getADPrintFormatID());
		model.setADReportViewID(entity.getADReportViewID());
		model.setADWorkFlowID(entity.getADWorkflowID());
		model.setClassName(entity.getClassname());
		model.setCopyFromProcess(entity.isCopyFromProcess());
		model.setActive(entity.isActive());
		model.setDirectPrint(entity.isDirectPrint());
		model.setReport(entity.isReport());
		model.setServerProcess(entity.isServerProcess());
		model.setJasperReport(entity.getJasperReport());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setProcedureName(entity.getProcedureName());
		model.setValue(entity.getValue());
		model.setWorkflowValue(entity.getWorkflowValue());
		if (null != entity.getADProcessParaVts()) {
			model.setParamList(toProcessParameterTrls(entity.getADProcessParaVts()));
		}
		return model;
	}

	public static List<ProcessModel> toProcessModels(List<ADProcess> list) {
		int size = null == list ? 0 : list.size();
		List<ProcessModel> resultList = new ArrayList<ProcessModel>(size);
		if (null != list) {
			for (ADProcess entity : list) {
				resultList.add(toProcessModel(entity));
			}
		}
		return resultList;
	}

	public static ProcessArgModel toProcessParameter(ADProcessPara entity) {
		ProcessArgModel model = new ProcessArgModel();
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

	public static ProcessArgModel toProcessParameter(ADProcessParaVt entity) {
		ProcessArgModel model = new ProcessArgModel();
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

	public static List<ProcessArgModel> toProcessParameters(List<ADProcessPara> list) {
		int size = null == list ? 0 : list.size();
		List<ProcessArgModel> resultList = new ArrayList<ProcessArgModel>(size);
		if (null != list) {
			for (ADProcessPara entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static List<ProcessArgModel> toProcessParameterTrls(List<ADProcessParaVt> list) {
		int size = null == list ? 0 : list.size();
		List<ProcessArgModel> resultList = new ArrayList<ProcessArgModel>(size);
		if (null != list) {
			for (ADProcessParaVt entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static TabModel toTabModel(AdTabVt entity) {
		TabModel model = new TabModel();
		model.setADTabID(entity.getADTabID());
		model.setADColumnID(entity.getADColumnID());
		model.setADTableID(entity.getADTableID());
		model.setParentColumnID(entity.getParentColumnID());
		model.setSeqNo(entity.getSeqNo());
		model.setTabLevel(entity.getTabLevel());
		model.setInfoTab(entity.isInfoTab());
		model.setReadOnly(entity.isReadOnly());
		model.setSingleRow(entity.isSingleRow());
		model.setInsertRecord(entity.isInsertRecord());
		model.setName(entity.getName());
		model.setReadOnlyLogic(entity.getReadOnlyLogic());
		model.setTableName(entity.getTableName());
		model.setHasTree(entity.isHasTree());
		model.setSortTab(entity.isSortTab());
		model.setHighVolume(entity.isHighVolume());
		return model;
	}

	public static TabModel toTabModel(AdTabV entity) {
		TabModel model = new TabModel();
		model.setADTabID(entity.getADTabID());
		model.setADColumnID(entity.getADColumnID());
		model.setADTableID(entity.getADTableID());
		model.setParentColumnID(entity.getParentColumnID());
		model.setSeqNo(entity.getSeqNo());
		model.setTabLevel(entity.getTabLevel());
		model.setInfoTab(entity.isInfoTab());
		model.setReadOnly(entity.isReadOnly());
		model.setSingleRow(entity.isSingleRow());
		model.setInsertRecord(entity.isInsertRecord());
		model.setName(entity.getName());
		model.setReadOnlyLogic(entity.getReadOnlyLogic());
		model.setTableName(entity.getTableName());
		model.setHasTree(entity.isHasTree());
		model.setSortTab(entity.isSortTab());
		model.setHighVolume(entity.isHighVolume());
		return model;
	}

	public static List<TabModel> toTabModels(List<AdTabV> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<TabModel> resultList = new ArrayList<TabModel>(size);
		if (null != tabList) {
			for (AdTabV tabEntity : tabList) {
				resultList.add(toTabModel(tabEntity));
			}
		}
		return resultList;
	}

	public static List<TabModel> toTabTrlModels(List<AdTabVt> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<TabModel> resultList = new ArrayList<TabModel>(size);
		if (null != tabList) {
			for (AdTabVt tabEntity : tabList) {
				resultList.add(toTabModel(tabEntity));
			}
		}
		return resultList;
	}

	public static FormModel toFormModel(ADForm entity) {
		FormModel model = new FormModel();
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

	public static List<FormModel> toFormModels(List<ADForm> formList) {
		int size = null == formList ? 0 : formList.size();
		List<FormModel> resultList = new ArrayList<FormModel>(size);
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

	public static FormModel toFormVTrlModel(ADFormVt entity) {
		FormModel model = new FormModel();
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

	public static ADUserContext toUerContext(ADUser user) {
		ADUserContext context = new ADUserContext();
		context.setADClientID(user.getADClientID());
		context.setADOrgID(user.getADOrgID());
		context.setADUserID(user.getADUserID());
		context.setBirthday(user.getBirthday());
		context.setEMail(user.getEMail());
		context.setName(user.getName());
		context.setNotificationType(user.getNotificationType());
		context.setPhone(user.getPhone());
		context.setPhone2(user.getPhone2());
		return context;
	}
}
