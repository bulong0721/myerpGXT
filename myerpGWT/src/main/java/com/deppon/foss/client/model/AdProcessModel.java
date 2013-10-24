package com.deppon.foss.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.deppon.foss.client.util.StringUtil;
import com.deppon.foss.shared.adempiere.AdProcess;

public class AdProcessModel implements Serializable {
	private static final long			serialVersionUID	= 1L;
	private long						adProcessId;
	private Long						adFormId;
	private Long						adPrintformatId;
	private Long						adReportviewId;
	private Long						adWorkflowId;
	private String						classname;
	private String						copyfromprocess;
	private Boolean						isactive;
	private Boolean						isdirectprint;
	private Boolean						isreport;
	private Boolean						isserverprocess;
	private String						jasperreport;
	private String						name;
	private String						description;
	private String						procedurename;
	private String						value;
	private String						workflowvalue;
	private List<AdProcessParameter>	paramList;

	public AdProcessModel() {

	}

	public AdProcessModel(AdProcess entity) {
		adProcessId = entity.getAdProcessId();
		adFormId = entity.getAdFormId();
		adPrintformatId = entity.getAdPrintformatId();
		adReportviewId = entity.getAdReportviewId();
		adWorkflowId = entity.getAdWorkflowId();
		classname = entity.getClassname();
		copyfromprocess = entity.getCopyfromprocess();
		isactive = StringUtil.isYes(entity.getIsactive());
		isdirectprint = StringUtil.isYes(entity.getIsdirectprint());
		isreport = StringUtil.isYes(entity.getIsreport());
		isserverprocess = StringUtil.isYes(entity.getIsserverprocess());
		jasperreport = entity.getJasperreport();
		name = entity.getName();
		description = entity.getDescription();
		procedurename = entity.getProcedurename();
		value = entity.getValue();
		workflowvalue = entity.getWorkflowvalue();
		if (null != entity.getAdProcessParas()) {
			paramList = AdProcessParameter.from(entity.getAdProcessParas());
		}
	}

	public static List<AdProcessModel> from(List<AdProcess> list) {
		int size = null == list ? 0 : list.size();
		List<AdProcessModel> resultList = new ArrayList<AdProcessModel>(size);
		if (null != list) {
			for (AdProcess entity : list) {
				resultList.add(new AdProcessModel(entity));
			}
		}
		return resultList;
	}

	public long getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(long adProcessId) {
		this.adProcessId = adProcessId;
	}

	public Long getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Long adFormId) {
		this.adFormId = adFormId;
	}

	public Long getAdPrintformatId() {
		return adPrintformatId;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Boolean getIsdirectprint() {
		return isdirectprint;
	}

	public void setIsdirectprint(Boolean isdirectprint) {
		this.isdirectprint = isdirectprint;
	}

	public Boolean getIsreport() {
		return isreport;
	}

	public void setIsreport(Boolean isreport) {
		this.isreport = isreport;
	}

	public Boolean getIsserverprocess() {
		return isserverprocess;
	}

	public void setIsserverprocess(Boolean isserverprocess) {
		this.isserverprocess = isserverprocess;
	}

	public void setAdPrintformatId(Long adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	public Long getAdReportviewId() {
		return adReportviewId;
	}

	public void setAdReportviewId(Long adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	public Long getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Long adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getCopyfromprocess() {
		return copyfromprocess;
	}

	public void setCopyfromprocess(String copyfromprocess) {
		this.copyfromprocess = copyfromprocess;
	}

	public String getJasperreport() {
		return jasperreport;
	}

	public void setJasperreport(String jasperreport) {
		this.jasperreport = jasperreport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProcedurename() {
		return procedurename;
	}

	public void setProcedurename(String procedurename) {
		this.procedurename = procedurename;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWorkflowvalue() {
		return workflowvalue;
	}

	public void setWorkflowvalue(String workflowvalue) {
		this.workflowvalue = workflowvalue;
	}

	public List<AdProcessParameter> getParamList() {
		return paramList;
	}

	public void setParamList(List<AdProcessParameter> paramList) {
		this.paramList = paramList;
	}

}