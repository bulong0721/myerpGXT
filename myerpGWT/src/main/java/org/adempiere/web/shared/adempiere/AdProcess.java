package org.adempiere.web.shared.adempiere;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the AD_PROCESS database table.
 * 
 */
@Entity
@Table(name = "AD_PROCESS")
public class AdProcess extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adProcessId;
	private String				accesslevel;
	private Long				adClientId;
	private Long				adFormId;
	private Long				adOrgId;
	private Long				adPrintformatId;
	private Long				adReportviewId;
	private Long				adWorkflowId;
	private String				classname;
	private String				copyfromprocess;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				entitytype;
	private String				help;
	private String				isactive;
	private String				isbetafunctionality;
	private String				isdirectprint;
	private String				isreport;
	private String				isserverprocess;
	private String				jasperreport;
	private String				name;
	private String				procedurename;
	private String				showhelp;
	private Long				statisticCount;
	private Long				statisticSeconds;
	private String				updated;
	private Long				updatedby;
	private String				value;
	private String				workflowvalue;
	private List<AdProcessPara>	adProcessParas;

	public AdProcess() {
	}

	@Id
	@Column(name = "AD_PROCESS_ID")
	public long getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(long adProcessId) {
		this.adProcessId = adProcessId;
	}

	public String getAccesslevel() {
		return this.accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_FORM_ID")
	public Long getAdFormId() {
		return this.adFormId;
	}

	public void setAdFormId(Long adFormId) {
		this.adFormId = adFormId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_PRINTFORMAT_ID")
	public Long getAdPrintformatId() {
		return this.adPrintformatId;
	}

	public void setAdPrintformatId(Long adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}

	@Column(name = "AD_REPORTVIEW_ID")
	public Long getAdReportviewId() {
		return this.adReportviewId;
	}

	public void setAdReportviewId(Long adReportviewId) {
		this.adReportviewId = adReportviewId;
	}

	@Column(name = "AD_WORKFLOW_ID")
	public Long getAdWorkflowId() {
		return this.adWorkflowId;
	}

	public void setAdWorkflowId(Long adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getCopyfromprocess() {
		return this.copyfromprocess;
	}

	public void setCopyfromprocess(String copyfromprocess) {
		this.copyfromprocess = copyfromprocess;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	@Column(name = "HELP")
	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsbetafunctionality() {
		return this.isbetafunctionality;
	}

	public void setIsbetafunctionality(String isbetafunctionality) {
		this.isbetafunctionality = isbetafunctionality;
	}

	public String getIsdirectprint() {
		return this.isdirectprint;
	}

	public void setIsdirectprint(String isdirectprint) {
		this.isdirectprint = isdirectprint;
	}

	public String getIsreport() {
		return this.isreport;
	}

	public void setIsreport(String isreport) {
		this.isreport = isreport;
	}

	public String getIsserverprocess() {
		return this.isserverprocess;
	}

	public void setIsserverprocess(String isserverprocess) {
		this.isserverprocess = isserverprocess;
	}

	public String getJasperreport() {
		return this.jasperreport;
	}

	public void setJasperreport(String jasperreport) {
		this.jasperreport = jasperreport;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcedurename() {
		return this.procedurename;
	}

	public void setProcedurename(String procedurename) {
		this.procedurename = procedurename;
	}

	public String getShowhelp() {
		return this.showhelp;
	}

	public void setShowhelp(String showhelp) {
		this.showhelp = showhelp;
	}

	@Column(name = "STATISTIC_COUNT")
	public Long getStatisticCount() {
		return this.statisticCount;
	}

	public void setStatisticCount(Long statisticCount) {
		this.statisticCount = statisticCount;
	}

	@Column(name = "STATISTIC_SECONDS")
	public Long getStatisticSeconds() {
		return this.statisticSeconds;
	}

	public void setStatisticSeconds(Long statisticSeconds) {
		this.statisticSeconds = statisticSeconds;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	@Column(name = "VALUE")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWorkflowvalue() {
		return this.workflowvalue;
	}

	public void setWorkflowvalue(String workflowvalue) {
		this.workflowvalue = workflowvalue;
	}

	// bi-directional many-to-one association to AdProcessPara
	@OneToMany(mappedBy = "adProcess")
	public List<AdProcessPara> getAdProcessParas() {
		return this.adProcessParas;
	}

	public void setAdProcessParas(List<AdProcessPara> adProcessParas) {
		this.adProcessParas = adProcessParas;
	}

	public AdProcessPara addAdProcessPara(AdProcessPara adProcessPara) {
		getAdProcessParas().add(adProcessPara);
		adProcessPara.setAdProcess(this);

		return adProcessPara;
	}

	public AdProcessPara removeAdProcessPara(AdProcessPara adProcessPara) {
		getAdProcessParas().remove(adProcessPara);
		adProcessPara.setAdProcess(null);

		return adProcessPara;
	}

}