package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="exp_processor")
public class EXPProcessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String account;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private Integer eXPProcessorID;
	private Integer eXPProcessorTypeID;
	private String help;
	private String host;
	private String name;
	private String passwordInfo;
	private Integer port;
	private String updated;
	private Integer updatedBy;
	private String value;

	public EXPProcessor() {
	}

	public EXPProcessor(Integer eXPProcessorID) {
		this.eXPProcessorID = eXPProcessorID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Id
	@Column(name="EXP_PROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53091", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "EXP_Processor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53091")
	public Integer getEXPProcessorID() {
		return eXPProcessorID;
	}

	public void setEXPProcessorID(Integer eXPProcessorID) {
		this.eXPProcessorID = eXPProcessorID;
	}

	@Basic
	@Column(name="EXP_PROCESSOR_TYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getEXPProcessorTypeID() {
		return eXPProcessorTypeID;
	}

	public void setEXPProcessorTypeID(Integer eXPProcessorTypeID) {
		this.eXPProcessorTypeID = eXPProcessorTypeID;
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