package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_pricelist")
public class IPriceList extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String bPartnerValue;
	private BigDecimal breakValue;
	private Integer cBPartnerID;
	private Integer cCurrencyID;
	private Integer cUOMID;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean enforcePriceLimit;
	private String iErrorMsg;
	private Boolean iIsImported;
	private Integer iPriceListID;
	private String iSOCode;
	private Integer mPriceListID;
	private Integer mPriceListVersionID;
	private Integer mProductID;
	private String name;
	private BigDecimal priceLimit;
	private BigDecimal priceList;
	private BigDecimal pricePrecision;
	private BigDecimal priceStd;
	private Boolean processed;
	private Boolean processing;
	private String productValue;
	private Boolean sOPriceList;
	private Boolean taxIncluded;
	private String updated;
	private Integer updatedBy;
	private String validFrom;
	private String x12DE355;

	public IPriceList() {
	}

	public IPriceList(Integer iPriceListID) {
		this.iPriceListID = iPriceListID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT")
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="BPARTNER_VALUE", length=40)
	public String getBPartnerValue() {
		return bPartnerValue;
	}

	public void setBPartnerValue(String bPartnerValue) {
		this.bPartnerValue = bPartnerValue;
	}

	@Basic
	public BigDecimal getBreakValue() {
		return breakValue;
	}

	public void setBreakValue(BigDecimal breakValue) {
		this.breakValue = breakValue;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
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
	public Boolean isEnforcePriceLimit() {
		return enforcePriceLimit;
	}

	public void setEnforcePriceLimit(Boolean enforcePriceLimit) {
		this.enforcePriceLimit = enforcePriceLimit;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrorMsg() {
		return iErrorMsg;
	}

	public void setIErrorMsg(String iErrorMsg) {
		this.iErrorMsg = iErrorMsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false)
	public Boolean isIIsImported() {
		return iIsImported;
	}

	public void setIIsImported(Boolean iIsImported) {
		this.iIsImported = iIsImported;
	}

	@Id
	@Column(name="I_PRICELIST_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53274", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "I_PriceList", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53274")
	public Integer getIPriceListID() {
		return iPriceListID;
	}

	public void setIPriceListID(Integer iPriceListID) {
		this.iPriceListID = iPriceListID;
	}

	@Basic
	@Column(name="ISO_CODE", length=3)
	public String getISOCode() {
		return iSOCode;
	}

	public void setISOCode(String iSOCode) {
		this.iSOCode = iSOCode;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT")
	public Integer getMPriceListID() {
		return mPriceListID;
	}

	public void setMPriceListID(Integer mPriceListID) {
		this.mPriceListID = mPriceListID;
	}

	@Basic
	@Column(name="M_PRICELIST_VERSION_ID", columnDefinition="INT")
	public Integer getMPriceListVersionID() {
		return mPriceListVersionID;
	}

	public void setMPriceListVersionID(Integer mPriceListVersionID) {
		this.mPriceListVersionID = mPriceListVersionID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	public BigDecimal getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(BigDecimal priceLimit) {
		this.priceLimit = priceLimit;
	}

	@Basic
	public BigDecimal getPriceList() {
		return priceList;
	}

	public void setPriceList(BigDecimal priceList) {
		this.priceList = priceList;
	}

	@Basic
	public BigDecimal getPricePrecision() {
		return pricePrecision;
	}

	public void setPricePrecision(BigDecimal pricePrecision) {
		this.pricePrecision = pricePrecision;
	}

	@Basic
	public BigDecimal getPriceStd() {
		return priceStd;
	}

	public void setPriceStd(BigDecimal priceStd) {
		this.priceStd = priceStd;
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
	public String getProductValue() {
		return productValue;
	}

	public void setProductValue(String productValue) {
		this.productValue = productValue;
	}

	@Basic
	@Column(name="ISSOPRICELIST")
	public Boolean isSOPriceList() {
		return sOPriceList;
	}

	public void setSOPriceList(Boolean sOPriceList) {
		this.sOPriceList = sOPriceList;
	}

	@Basic
	@Column(name="ISTAXINCLUDED")
	public Boolean isTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	@Basic
	@Column(length=4)
	public String getX12DE355() {
		return x12DE355;
	}

	public void setX12DE355(String x12DE355) {
		this.x12DE355 = x12DE355;
	}
}