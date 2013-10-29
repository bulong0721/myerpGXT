package org.adempiere.model.util;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.core.AdFieldV;
import org.adempiere.model.core.AdProcess;
import org.adempiere.model.core.AdProcessPara;
import org.adempiere.model.core.AdTabV;
import org.adempiere.model.core.AdTreenodemm;
import org.adempiere.web.client.model.AdFieldModel;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.model.AdProcessParameter;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.util.StringUtil;

public class DTOUtil {
	public static AdFieldModel toFieldModel(AdFieldV entity) {
		AdFieldModel model = new AdFieldModel();
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

	public static List<AdFieldModel> toFieldModels(List<AdFieldV> fieldList) {
		int size = null == fieldList ? 0 : fieldList.size();
		List<AdFieldModel> resultList = new ArrayList<AdFieldModel>(size);
		if (null != fieldList) {
			for (AdFieldV fieldEntity : fieldList) {
				resultList.add(toFieldModel(fieldEntity));
			}
		}
		return resultList;
	}

	public static AdMenuModel toMenuModel(AdTreenodemm entity) {
		AdMenuModel model = new AdMenuModel();
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

	public static AdProcessModel toProcessModel(AdProcess entity) {
		AdProcessModel model = new AdProcessModel();
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

	public static List<AdProcessModel> toProcessModels(List<AdProcess> list) {
		int size = null == list ? 0 : list.size();
		List<AdProcessModel> resultList = new ArrayList<AdProcessModel>(size);
		if (null != list) {
			for (AdProcess entity : list) {
				resultList.add(toProcessModel(entity));
			}
		}
		return resultList;
	}

	public static AdProcessParameter toProcessParameter(AdProcessPara entity) {
		AdProcessParameter model = new AdProcessParameter();
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

	public static List<AdProcessParameter> toProcessParameters(List<AdProcessPara> list) {
		int size = null == list ? 0 : list.size();
		List<AdProcessParameter> resultList = new ArrayList<AdProcessParameter>(size);
		if (null != list) {
			for (AdProcessPara entity : list) {
				resultList.add(toProcessParameter(entity));
			}
		}
		return resultList;
	}

	public static AdTabModel toTabModel(AdTabV entity) {
		AdTabModel model = new AdTabModel();
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
		return model;
	}

	public static List<AdTabModel> toTabModels(List<AdTabV> tabList) {
		int size = null == tabList ? 0 : tabList.size();
		List<AdTabModel> resultList = new ArrayList<AdTabModel>(size);
		if (null != tabList) {
			for (AdTabV tabEntity : tabList) {
				resultList.add(toTabModel(tabEntity));
			}
		}
		return resultList;
	}
}
