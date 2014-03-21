package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_migrationscript")
public class ADMigrationScript extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDMigrationScriptID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean apply;
	private String created;
	private Integer createdBy;
	private String description;
	private String developerName;
	private String fileName;
	private String name;
	private String projectName;
	private String reference;
	private String releaseNo;
	private byte[] script;
	private Boolean scriptRoll;
	private String status;
	private String uRL;
	private String updated;
	private Integer updatedBy;

	public ADMigrationScript() {
	}

	public ADMigrationScript(Integer aDMigrationScriptID) {
		this.aDMigrationScriptID = aDMigrationScriptID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Id
	@Column(name="AD_MIGRATIONSCRIPT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53081", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_MigrationScript", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53081")
	public Integer getADMigrationScriptID() {
		return aDMigrationScriptID;
	}

	public void setADMigrationScriptID(Integer aDMigrationScriptID) {
		this.aDMigrationScriptID = aDMigrationScriptID;
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
	@Column(name="ISAPPLY", nullable=false)
	public Boolean isApply() {
		return apply;
	}

	public void setApply(Boolean apply) {
		this.apply = apply;
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
	@Column(length=2000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=60)
	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	@Basic
	@Column(nullable=false, length=500)
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	@Column(nullable=false, length=60)
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Basic
	@Column(length=2000)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Basic
	@Column(nullable=false, length=4)
	public String getReleaseNo() {
		return releaseNo;
	}

	public void setReleaseNo(String releaseNo) {
		this.releaseNo = releaseNo;
	}

	@Basic
	@Column(columnDefinition="LONGBLOB")
	public byte[] getScript() {
		return script;
	}

	public void setScript(byte[] script) {
		this.script = script;
	}

	@Basic
	public Boolean isScriptRoll() {
		return scriptRoll;
	}

	public void setScriptRoll(Boolean scriptRoll) {
		this.scriptRoll = scriptRoll;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Basic
	@Column(length=2000)
	public String getURL() {
		return uRL;
	}

	public void setURL(String uRL) {
		this.uRL = uRL;
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