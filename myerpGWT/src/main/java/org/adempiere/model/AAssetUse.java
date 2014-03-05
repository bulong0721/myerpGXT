package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_use")
public class AAssetUse extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetID;
	private Integer aAssetUseID;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private String updated;
	private Integer updatedBy;
	private String useDate;
	private Integer useUnits;

	public AAssetUse() {
	}

	public AAssetUse(Integer aAssetUseID) {
		this.aAssetUseID = aAssetUseID;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetID() {
		return aAssetID;
	}

	public void setAAssetID(Integer aAssetID) {
		this.aAssetID = aAssetID;
	}

	@Id
	@Column(name="A_ASSET_USE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53158", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Asset_Use", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53158")
	public Integer getAAssetUseID() {
		return aAssetUseID;
	}

	public void setAAssetUseID(Integer aAssetUseID) {
		this.aAssetUseID = aAssetUseID;
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
	@Column(nullable=false)
	public String getUseDate() {
		return useDate;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUseUnits() {
		return useUnits;
	}

	public void setUseUnits(Integer useUnits) {
		this.useUnits = useUnits;
	}
}