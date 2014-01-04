package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_uom_conversion")
public class CUomConversion extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cUomConversionId;
	private Integer cUomId;
	private Integer cUomToId;
	private String created;
	private Integer createdby;
	private BigDecimal dividerate;
	private String isactive;
	private Integer mProductId;
	private BigDecimal multiplyrate;
	private String updated;
	private Integer updatedby;

	public CUomConversion() {
	}

	public CUomConversion(Integer cUomConversionId) {
		this.cUomConversionId = cUomConversionId;
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
	@Column(name="C_UOM_CONVERSION_ID")
	public Integer getCUomConversionId() {
		return cUomConversionId;
	}

	public void setCUomConversionId(Integer cUomConversionId) {
		this.cUomConversionId = cUomConversionId;
	}

	@Basic
	@Column(name="C_UOM_ID", nullable=false)
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	@Column(name="C_UOM_TO_ID", nullable=false)
	public Integer getCUomToId() {
		return cUomToId;
	}

	public void setCUomToId(Integer cUomToId) {
		this.cUomToId = cUomToId;
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
	@Column(nullable=false)
	public BigDecimal getDividerate() {
		return dividerate;
	}

	public void setDividerate(BigDecimal dividerate) {
		this.dividerate = dividerate;
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
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMultiplyrate() {
		return multiplyrate;
	}

	public void setMultiplyrate(BigDecimal multiplyrate) {
		this.multiplyrate = multiplyrate;
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