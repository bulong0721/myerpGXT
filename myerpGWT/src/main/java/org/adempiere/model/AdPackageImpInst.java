package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_package_imp_inst")
public class AdPackageImpInst extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPackageImpInstId;
	private String created;
	private Integer createdby;
	private String createddate;
	private String creator;
	private String creatorcontact;
	private String description;
	private String email;
	private Boolean isactive;
	private String name;
	private String pkStatus;
	private String pkVersion;
	private Boolean processed;
	private Boolean processing;
	private String releaseno;
	private Boolean uninstall;
	private String updated;
	private Integer updatedby;
	private String updateddate;
	private String version;

	public AdPackageImpInst() {
	}

	public AdPackageImpInst(Integer adPackageImpInstId) {
		this.adPackageImpInstId = adPackageImpInstId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="AD_PACKAGE_IMP_INST_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_50003", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Package_Imp_Inst", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_50003")
	public Integer getAdPackageImpInstId() {
		return adPackageImpInstId;
	}

	public void setAdPackageImpInstId(Integer adPackageImpInstId) {
		this.adPackageImpInstId = adPackageImpInstId;
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
	@Column(columnDefinition="INT")
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=50)
	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	@Basic
	@Column(length=120)
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Basic
	@Column(length=510)
	public String getCreatorcontact() {
		return creatorcontact;
	}

	public void setCreatorcontact(String creatorcontact) {
		this.creatorcontact = creatorcontact;
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
	@Column(length=120)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=240)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="PK_STATUS", length=44)
	public String getPkStatus() {
		return pkStatus;
	}

	public void setPkStatus(String pkStatus) {
		this.pkStatus = pkStatus;
	}

	@Basic
	@Column(name="PK_VERSION", length=40)
	public String getPkVersion() {
		return pkVersion;
	}

	public void setPkVersion(String pkVersion) {
		this.pkVersion = pkVersion;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=40)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
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
	@Column(columnDefinition="INT")
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=50)
	public String getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}

	@Basic
	@Column(length=40)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}