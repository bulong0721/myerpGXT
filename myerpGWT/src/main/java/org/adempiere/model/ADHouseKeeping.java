package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_housekeeping")
public class ADHouseKeeping extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDHouseKeepingID;
	private Integer aDOrgID;
	private Integer aDTableID;
	private Boolean active;
	private String backupFolder;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean exportXMLBackup;
	private String help;
	private Integer lastDeleted;
	private String lastRun;
	private String name;
	private Boolean processing;
	private Boolean saveInHistoric;
	private String updated;
	private Integer updatedBy;
	private String value;
	private String whereClause;

	public ADHouseKeeping() {
	}

	public ADHouseKeeping(Integer aDHouseKeepingID) {
		this.aDHouseKeepingID = aDHouseKeepingID;
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
	@Column(name="AD_HOUSEKEEPING_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53168", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_HouseKeeping", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53168")
	public Integer getADHouseKeepingID() {
		return aDHouseKeepingID;
	}

	public void setADHouseKeepingID(Integer aDHouseKeepingID) {
		this.aDHouseKeepingID = aDHouseKeepingID;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
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

	@Basic
	public String getBackupFolder() {
		return backupFolder;
	}

	public void setBackupFolder(String backupFolder) {
		this.backupFolder = backupFolder;
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
	@Column(name="ISEXPORTXMLBACKUP")
	public Boolean isExportXMLBackup() {
		return exportXMLBackup;
	}

	public void setExportXMLBackup(Boolean exportXMLBackup) {
		this.exportXMLBackup = exportXMLBackup;
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
	@Column(columnDefinition="INT")
	public Integer getLastDeleted() {
		return lastDeleted;
	}

	public void setLastDeleted(Integer lastDeleted) {
		this.lastDeleted = lastDeleted;
	}

	@Basic
	public String getLastRun() {
		return lastRun;
	}

	public void setLastRun(String lastRun) {
		this.lastRun = lastRun;
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
	@Column(name="ISSAVEINHISTORIC")
	public Boolean isSaveInHistoric() {
		return saveInHistoric;
	}

	public void setSaveInHistoric(Boolean saveInHistoric) {
		this.saveInHistoric = saveInHistoric;
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

	@Basic
	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}
}