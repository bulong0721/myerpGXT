package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_productpricevendorbreak")
public class MProductPriceVendorBreak extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private BigDecimal breakValue;
	private Integer cBPartnerID;
	private String created;
	private Integer createdBy;
	private Integer mPriceListVersionID;
	private Integer mProductID;
	private Integer mProductPriceVendorBreakID;
	private BigDecimal priceLimit;
	private BigDecimal priceList;
	private BigDecimal priceStd;
	private String updated;
	private Integer updatedBy;

	public MProductPriceVendorBreak() {
	}

	public MProductPriceVendorBreak(Integer mProductPriceVendorBreakID) {
		this.mProductPriceVendorBreakID = mProductPriceVendorBreakID;
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
	@Column(nullable=false)
	public BigDecimal getBreakValue() {
		return breakValue;
	}

	public void setBreakValue(BigDecimal breakValue) {
		this.breakValue = breakValue;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
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
	@Column(name="M_PRICELIST_VERSION_ID", columnDefinition="INT", nullable=false)
	public Integer getMPriceListVersionID() {
		return mPriceListVersionID;
	}

	public void setMPriceListVersionID(Integer mPriceListVersionID) {
		this.mPriceListVersionID = mPriceListVersionID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Id
	@Column(name="M_PRODUCTPRICEVENDORBREAK_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53273", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_ProductPriceVendorBreak", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53273")
	public Integer getMProductPriceVendorBreakID() {
		return mProductPriceVendorBreakID;
	}

	public void setMProductPriceVendorBreakID(Integer mProductPriceVendorBreakID) {
		this.mProductPriceVendorBreakID = mProductPriceVendorBreakID;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(BigDecimal priceLimit) {
		this.priceLimit = priceLimit;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPriceList() {
		return priceList;
	}

	public void setPriceList(BigDecimal priceList) {
		this.priceList = priceList;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPriceStd() {
		return priceStd;
	}

	public void setPriceStd(BigDecimal priceStd) {
		this.priceStd = priceStd;
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