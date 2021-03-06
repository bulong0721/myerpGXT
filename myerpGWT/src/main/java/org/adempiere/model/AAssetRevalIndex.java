package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_reval_index")
public class AAssetRevalIndex extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetRevalIndexID;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String aEffectiveDate;
	private String aRevalCode;
	private String aRevalMultiplier;
	private BigDecimal aRevalRate;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public AAssetRevalIndex() {
	}

	public AAssetRevalIndex(Integer aAssetRevalIndexID) {
		this.aAssetRevalIndexID = aAssetRevalIndexID;
	}

	@Id
	@Column(name="A_ASSET_REVAL_INDEX_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53140", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Asset_Reval_Index", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53140")
	public Integer getAAssetRevalIndexID() {
		return aAssetRevalIndexID;
	}

	public void setAAssetRevalIndexID(Integer aAssetRevalIndexID) {
		this.aAssetRevalIndexID = aAssetRevalIndexID;
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
	@Column(name="A_EFFECTIVE_DATE", nullable=false)
	public String getAEffectiveDate() {
		return aEffectiveDate;
	}

	public void setAEffectiveDate(String aEffectiveDate) {
		this.aEffectiveDate = aEffectiveDate;
	}

	@Basic
	@Column(name="A_REVAL_CODE", nullable=false, length=3)
	public String getARevalCode() {
		return aRevalCode;
	}

	public void setARevalCode(String aRevalCode) {
		this.aRevalCode = aRevalCode;
	}

	@Basic
	@Column(name="A_REVAL_MULTIPLIER", nullable=false, length=3)
	public String getARevalMultiplier() {
		return aRevalMultiplier;
	}

	public void setARevalMultiplier(String aRevalMultiplier) {
		this.aRevalMultiplier = aRevalMultiplier;
	}

	@Basic
	@Column(name="A_REVAL_RATE", nullable=false)
	public BigDecimal getARevalRate() {
		return aRevalRate;
	}

	public void setARevalRate(BigDecimal aRevalRate) {
		this.aRevalRate = aRevalRate;
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