package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_imp_backup")
public class ADPackageImpBackup extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDColumnID;
	private Integer aDOrgID;
	private Integer aDPackageImpBackupID;
	private String aDPackageImpBckDir;
	private Integer aDPackageImpDetailID;
	private Integer aDPackageImpID;
	private String aDPackageImpOrgDir;
	private Integer aDReferenceID;
	private Integer aDTableID;
	private Boolean active;
	private String colValue;
	private String created;
	private Integer createdBy;
	private Boolean uninstall;
	private String updated;
	private Integer updatedBy;

	public ADPackageImpBackup() {
	}

	public ADPackageImpBackup(Integer aDPackageImpBackupID) {
		this.aDPackageImpBackupID = aDPackageImpBackupID;
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
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Id
	@Column(name="AD_PACKAGE_IMP_BACKUP_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_50001", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Package_Imp_Backup", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_50001")
	public Integer getADPackageImpBackupID() {
		return aDPackageImpBackupID;
	}

	public void setADPackageImpBackupID(Integer aDPackageImpBackupID) {
		this.aDPackageImpBackupID = aDPackageImpBackupID;
	}

	@Basic
	@Column(name="AD_PACKAGE_IMP_BCK_DIR")
	public String getADPackageImpBckDir() {
		return aDPackageImpBckDir;
	}

	public void setADPackageImpBckDir(String aDPackageImpBckDir) {
		this.aDPackageImpBckDir = aDPackageImpBckDir;
	}

	@Basic
	@Column(name="AD_PACKAGE_IMP_DETAIL_ID", columnDefinition="INT", nullable=false)
	public Integer getADPackageImpDetailID() {
		return aDPackageImpDetailID;
	}

	public void setADPackageImpDetailID(Integer aDPackageImpDetailID) {
		this.aDPackageImpDetailID = aDPackageImpDetailID;
	}

	@Basic
	@Column(name="AD_PACKAGE_IMP_ID", columnDefinition="INT", nullable=false)
	public Integer getADPackageImpID() {
		return aDPackageImpID;
	}

	public void setADPackageImpID(Integer aDPackageImpID) {
		this.aDPackageImpID = aDPackageImpID;
	}

	@Basic
	@Column(name="AD_PACKAGE_IMP_ORG_DIR")
	public String getADPackageImpOrgDir() {
		return aDPackageImpOrgDir;
	}

	public void setADPackageImpOrgDir(String aDPackageImpOrgDir) {
		this.aDPackageImpOrgDir = aDPackageImpOrgDir;
	}

	@Basic
	@Column(name="AD_REFERENCE_ID", columnDefinition="INT")
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
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

	@Basic
	@Column(length=2000)
	public String getColValue() {
		return colValue;
	}

	public void setColValue(String colValue) {
		this.colValue = colValue;
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
	public Boolean isUninstall() {
		return uninstall;
	}

	public void setUninstall(Boolean uninstall) {
		this.uninstall = uninstall;
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