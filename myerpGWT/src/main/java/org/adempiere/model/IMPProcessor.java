package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="imp_processor")
public class IMPProcessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String account;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String dateLastRun;
	private String dateNextRun;
	private String description;
	private Integer frequency;
	private String frequencyType;
	private String help;
	private String host;
	private Integer iMPProcessorID;
	private Integer iMPProcessorTypeID;
	private Integer keepLogDays;
	private String name;
	private String passwordInfo;
	private Integer port;
	private String processing;
	private String updated;
	private Integer updatedBy;
	private String value;

	public IMPProcessor() {
	}

	public IMPProcessor(Integer iMPProcessorID) {
		this.iMPProcessorID = iMPProcessorID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	public String getDateLastRun() {
		return dateLastRun;
	}

	public void setDateLastRun(String dateLastRun) {
		this.dateLastRun = dateLastRun;
	}

	@Basic
	public String getDateNextRun() {
		return dateNextRun;
	}

	public void setDateNextRun(String dateNextRun) {
		this.dateNextRun = dateNextRun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFrequencyType() {
		return frequencyType;
	}

	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Id
	@Column(name="IMP_PROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53094", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "IMP_Processor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53094")
	public Integer getIMPProcessorID() {
		return iMPProcessorID;
	}

	public void setIMPProcessorID(Integer iMPProcessorID) {
		this.iMPProcessorID = iMPProcessorID;
	}

	@Basic
	@Column(name="IMP_PROCESSOR_TYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getIMPProcessorTypeID() {
		return iMPProcessorTypeID;
	}

	public void setIMPProcessorTypeID(Integer iMPProcessorTypeID) {
		this.iMPProcessorTypeID = iMPProcessorTypeID;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getKeepLogDays() {
		return keepLogDays;
	}

	public void setKeepLogDays(Integer keepLogDays) {
		this.keepLogDays = keepLogDays;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	public String getPasswordInfo() {
		return passwordInfo;
	}

	public void setPasswordInfo(String passwordInfo) {
		this.passwordInfo = passwordInfo;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}