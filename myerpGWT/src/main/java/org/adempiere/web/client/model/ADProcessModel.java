package org.adempiere.web.client.model;

import java.util.List;

public class ADProcessModel implements IsADRPCModel {
	private Integer					adProcessId;
	private Integer					adFormId;
	private Integer					adPrintformatId;
	private Integer					adReportviewId;
	private Integer					adWorkflowId;
	private String					classname;
	private String					copyfromprocess;
	private Boolean					isactive;
	private Boolean					isdirectprint;
	private Boolean					isreport;
	private Boolean					isserverprocess;
	private String					jasperreport;
	private String					name;
	private String					description;
	private String					procedurename;
	private String					value;
	private String					workflowvalue;
	private List<ADProcessArgModel>	paramList;

	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	public Integer getAdPrintformatId() {
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

	public void setAdPrintformatId(Integer adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	public Integer getAdReportviewId() {
		return adReportviewId;
	}

	public void setAdReportviewId(Integer adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
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

	public List<ADProcessArgModel> getParamList() {
		return paramList;
	}

	public void setParamList(List<ADProcessArgModel> paramList) {
		this.paramList = paramList;
	}

}
