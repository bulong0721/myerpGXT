package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_change_amt")
@IdClass(org.adempiere.model.AAssetChangeAmtPK.class)
public class AAssetChangeAmt extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetChangeId;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal assetaccumdepreciationamt;
	private BigDecimal assetbookvalueamt;
	private BigDecimal assetmarketvalueamt;
	private BigDecimal assetvalueamt;
	private Integer cAcctschemaId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String updated;
	private Integer updatedby;

	public AAssetChangeAmt() {
	}

	public AAssetChangeAmt(Integer aAssetChangeId, Integer cAcctschemaId) {
		this.aAssetChangeId = aAssetChangeId;
		this.cAcctschemaId = cAcctschemaId;
	}

	@Id
	@Column(name="A_ASSET_CHANGE_ID")
	public Integer getAAssetChangeId() {
		return aAssetChangeId;
	}

	public void setAAssetChangeId(Integer aAssetChangeId) {
		this.aAssetChangeId = aAssetChangeId;
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

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetaccumdepreciationamt() {
		return assetaccumdepreciationamt;
	}

	public void setAssetaccumdepreciationamt(BigDecimal assetaccumdepreciationamt) {
		this.assetaccumdepreciationamt = assetaccumdepreciationamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetbookvalueamt() {
		return assetbookvalueamt;
	}

	public void setAssetbookvalueamt(BigDecimal assetbookvalueamt) {
		this.assetbookvalueamt = assetbookvalueamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetmarketvalueamt() {
		return assetmarketvalueamt;
	}

	public void setAssetmarketvalueamt(BigDecimal assetmarketvalueamt) {
		this.assetmarketvalueamt = assetmarketvalueamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetvalueamt() {
		return assetvalueamt;
	}

	public void setAssetvalueamt(BigDecimal assetvalueamt) {
		this.assetvalueamt = assetvalueamt;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
}