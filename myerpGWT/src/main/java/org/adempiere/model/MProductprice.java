package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_productprice")
@IdClass(org.adempiere.model.MProductpricePK.class)
public class MProductprice extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String isactive;
	private Integer mPricelistVersionId;
	private Integer mProductId;
	private BigDecimal pricelimit;
	private BigDecimal pricelist;
	private BigDecimal pricestd;
	private String updated;
	private Integer updatedby;

	public MProductprice() {
	}

	public MProductprice(Integer mPricelistVersionId, Integer mProductId) {
		this.mPricelistVersionId = mPricelistVersionId;
		this.mProductId = mProductId;
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

	@Id
	@Column(name="M_PRICELIST_VERSION_ID")
	public Integer getMPricelistVersionId() {
		return mPricelistVersionId;
	}

	public void setMPricelistVersionId(Integer mPricelistVersionId) {
		this.mPricelistVersionId = mPricelistVersionId;
	}

	@Id
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPricelimit() {
		return pricelimit;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPricestd() {
		return pricestd;
	}

	public void setPricestd(BigDecimal pricestd) {
		this.pricestd = pricestd;
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