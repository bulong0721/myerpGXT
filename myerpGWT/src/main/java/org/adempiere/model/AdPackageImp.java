package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_imp")
public class AdPackageImp extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPackageImpId;
	private String created;
	private Integer createdby;
	private String createddate;
	private String creator;
	private String creatorcontact;
	private String description;
	private String email;
	private String isactive;
	private String name;
	private String pkStatus;
	private String pkVersion;
	private String processed;
	private String processing;
	private String releaseno;
	private String uninstall;
	private String updated;
	private Integer updatedby;
	private String updateddate;
	private String version;

	public AdPackageImp() {
	}

	public AdPackageImp(Integer adPackageImpId) {
		this.adPackageImpId = adPackageImpId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="AD_PACKAGE_IMP_ID")
	public Integer getAdPackageImpId() {
		return adPackageImpId;
	}

	public void setAdPackageImpId(Integer adPackageImpId) {
		this.adPackageImpId = adPackageImpId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=25)
	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	@Basic
	@Column(length=60)
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Basic
	public String getCreatorcontact() {
		return creatorcontact;
	}

	public void setCreatorcontact(String creatorcontact) {
		this.creatorcontact = creatorcontact;
	}

	@Basic
	@Column(nullable=false, length=1000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=60)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	@Column(name="PK_STATUS", length=22)
	public String getPkStatus() {
		return pkStatus;
	}

	public void setPkStatus(String pkStatus) {
		this.pkStatus = pkStatus;
	}

	@Basic
	@Column(name="PK_VERSION", length=20)
	public String getPkVersion() {
		return pkVersion;
	}

	public void setPkVersion(String pkVersion) {
		this.pkVersion = pkVersion;
	}

	@Basic
	@Column(length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=20)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	@Basic
	@Column(length=1)
	public String getUninstall() {
		return uninstall;
	}

	public void setUninstall(String uninstall) {
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=25)
	public String getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}

	@Basic
	@Column(length=20)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}