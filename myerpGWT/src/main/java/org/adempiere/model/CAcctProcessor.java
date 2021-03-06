package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_acctprocessor")
public class CAcctProcessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTableID;
	private Boolean active;
	private Integer cAcctProcessorID;
	private Integer cAcctSchemaID;
	private String created;
	private Integer createdBy;
	private String dateLastRun;
	private String dateNextRun;
	private String description;
	private Integer frequency;
	private String frequencyType;
	private Integer keepLogDays;
	private String name;
	private Boolean processing;
	private Integer supervisorID;
	private String updated;
	private Integer updatedBy;

	public CAcctProcessor() {
	}

	public CAcctProcessor(Integer cAcctProcessorID) {
		this.cAcctProcessorID = cAcctProcessorID;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT")
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Id
	@Column(name="C_ACCTPROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_870", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_AcctProcessor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_870")
	public Integer getCAcctProcessorID() {
		return cAcctProcessorID;
	}

	public void setCAcctProcessorID(Integer cAcctProcessorID) {
		this.cAcctProcessorID = cAcctProcessorID;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="SUPERVISOR_ID", columnDefinition="INT", nullable=false)
	public Integer getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(Integer supervisorID) {
		this.supervisorID = supervisorID;
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
}