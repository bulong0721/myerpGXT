package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_alert")
public class ADAlert extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDAlertID;
	private Integer aDAlertProcessorID;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String alertMessage;
	private String alertSubject;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean enforceClientSecurity;
	private Boolean enforceRoleSecurity;
	private String help;
	private String name;
	private String updated;
	private Integer updatedBy;
	private Boolean valid;

	public ADAlert() {
	}

	public ADAlert(Integer aDAlertID) {
		this.aDAlertID = aDAlertID;
	}

	@Id
	@Column(name="AD_ALERT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_749", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Alert", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_749")
	public Integer getADAlertID() {
		return aDAlertID;
	}

	public void setADAlertID(Integer aDAlertID) {
		this.aDAlertID = aDAlertID;
	}

	@Basic
	@Column(name="AD_ALERTPROCESSOR_ID", columnDefinition="INT")
	public Integer getADAlertProcessorID() {
		return aDAlertProcessorID;
	}

	public void setADAlertProcessorID(Integer aDAlertProcessorID) {
		this.aDAlertProcessorID = aDAlertProcessorID;
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
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getAlertSubject() {
		return alertSubject;
	}

	public void setAlertSubject(String alertSubject) {
		this.alertSubject = alertSubject;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isEnforceClientSecurity() {
		return enforceClientSecurity;
	}

	public void setEnforceClientSecurity(Boolean enforceClientSecurity) {
		this.enforceClientSecurity = enforceClientSecurity;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isEnforceRoleSecurity() {
		return enforceRoleSecurity;
	}

	public void setEnforceRoleSecurity(Boolean enforceRoleSecurity) {
		this.enforceRoleSecurity = enforceRoleSecurity;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	@Column(name="ISVALID", nullable=false)
	public Boolean isValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
}