package org.adempiere.web.client.model;

import java.util.List;

public class ADProcessModel implements ADExchangeModel {
	private Integer					aDProcessID;
	private Integer					aDFormID;
	private Integer					aDPrintFormatID;
	private Integer					aDReportViewID;
	private Integer					aDWorkFlowID;
	private String					className;
	private Boolean					copyFromProcess;
	private Boolean					active;
	private Boolean					directPrint;
	private Boolean					report;
	private Boolean					serverProcess;
	private String					jasperReport;
	private String					name;
	private String					description;
	private String					procedureName;
	private String					value;
	private String					workflowValue;
	private List<ADProcessArgModel>	paramList;
	private ADFormModel				formModel;

	public ADFormModel getFormModel() {
		return formModel;
	}

	public void setFormModel(ADFormModel formModel) {
		this.formModel = formModel;
	}

	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer adProcessId) {
		this.aDProcessID = adProcessId;
	}

	public Integer getADFormID() {
		return aDFormID;
	}

	public void setADFormID(Integer adFormId) {
		this.aDFormID = adFormId;
	}

	public Integer getADPrintformatID() {
		return aDPrintFormatID;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean isactive) {
		this.active = isactive;
	}

	public Boolean isDirectPrint() {
		return directPrint;
	}

	public void setDirectPrint(Boolean isdirectprint) {
		this.directPrint = isdirectprint;
	}

	public Boolean isReport() {
		return report;
	}

	public void setReport(Boolean isreport) {
		this.report = isreport;
	}

	public Boolean isServerProcess() {
		return serverProcess;
	}

	public void setServerProcess(Boolean isserverprocess) {
		this.serverProcess = isserverprocess;
	}

	public void setADPrintFormatID(Integer adPrintformatId) {
		this.aDPrintFormatID = adPrintformatId;
	}

	public Integer getADReportViewID() {
		return aDReportViewID;
	}

	public void setADReportViewID(Integer adReportviewId) {
		this.aDReportViewID = adReportviewId;
	}

	public Integer getADWorkFlowID() {
		return aDWorkFlowID;
	}

	public void setADWorkFlowID(Integer adWorkflowId) {
		this.aDWorkFlowID = adWorkflowId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String classname) {
		this.className = classname;
	}

	public Boolean isCopyFromProcess() {
		return copyFromProcess;
	}

	public void setCopyFromProcess(Boolean copyfromprocess) {
		this.copyFromProcess = copyfromprocess;
	}

	public String getJasperReport() {
		return jasperReport;
	}

	public void setJasperReport(String jasperreport) {
		this.jasperReport = jasperreport;
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

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedurename) {
		this.procedureName = procedurename;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWorkflowValue() {
		return workflowValue;
	}

	public void setWorkflowValue(String workflowvalue) {
		this.workflowValue = workflowvalue;
	}

	public List<ADProcessArgModel> getParamList() {
		return paramList;
	}

	public void setParamList(List<ADProcessArgModel> paramList) {
		this.paramList = paramList;
	}

}
