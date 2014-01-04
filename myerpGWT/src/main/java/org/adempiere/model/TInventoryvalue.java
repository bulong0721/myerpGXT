package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_inventoryvalue")
@IdClass(org.adempiere.model.TInventoryvaluePK.class)
public class TInventoryvalue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPinstanceId;
	private Integer cCurrencyId;
	private BigDecimal cost;
	private BigDecimal costamt;
	private BigDecimal coststandard;
	private BigDecimal coststandardamt;
	private String datevalue;
	private Integer mAttributesetinstanceId;
	private Integer mCostelementId;
	private Integer mPricelistVersionId;
	private Integer mProductId;
	private Integer mWarehouseId;
	private BigDecimal pricelimit;
	private BigDecimal pricelimitamt;
	private BigDecimal pricelist;
	private BigDecimal pricelistamt;
	private BigDecimal pricepo;
	private BigDecimal pricepoamt;
	private BigDecimal pricestd;
	private BigDecimal pricestdamt;
	private BigDecimal qtyonhand;

	public TInventoryvalue() {
	}

	public TInventoryvalue(Integer adPinstanceId, Integer mAttributesetinstanceId, Integer mProductId, Integer mWarehouseId) {
		this.adPinstanceId = adPinstanceId;
		this.mAttributesetinstanceId = mAttributesetinstanceId;
		this.mProductId = mProductId;
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID")
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID")
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Basic
	public BigDecimal getCostamt() {
		return costamt;
	}

	public void setCostamt(BigDecimal costamt) {
		this.costamt = costamt;
	}

	@Basic
	public BigDecimal getCoststandard() {
		return coststandard;
	}

	public void setCoststandard(BigDecimal coststandard) {
		this.coststandard = coststandard;
	}

	@Basic
	public BigDecimal getCoststandardamt() {
		return coststandardamt;
	}

	public void setCoststandardamt(BigDecimal coststandardamt) {
		this.coststandardamt = coststandardamt;
	}

	@Basic
	public String getDatevalue() {
		return datevalue;
	}

	public void setDatevalue(String datevalue) {
		this.datevalue = datevalue;
	}

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_COSTELEMENT_ID")
	public Integer getMCostelementId() {
		return mCostelementId;
	}

	public void setMCostelementId(Integer mCostelementId) {
		this.mCostelementId = mCostelementId;
	}

	@Basic
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

	@Id
	@Column(name="M_WAREHOUSE_ID")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	public BigDecimal getPricelimit() {
		return pricelimit;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}

	@Basic
	public BigDecimal getPricelimitamt() {
		return pricelimitamt;
	}

	public void setPricelimitamt(BigDecimal pricelimitamt) {
		this.pricelimitamt = pricelimitamt;
	}

	@Basic
	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	@Basic
	public BigDecimal getPricelistamt() {
		return pricelistamt;
	}

	public void setPricelistamt(BigDecimal pricelistamt) {
		this.pricelistamt = pricelistamt;
	}

	@Basic
	public BigDecimal getPricepo() {
		return pricepo;
	}

	public void setPricepo(BigDecimal pricepo) {
		this.pricepo = pricepo;
	}

	@Basic
	public BigDecimal getPricepoamt() {
		return pricepoamt;
	}

	public void setPricepoamt(BigDecimal pricepoamt) {
		this.pricepoamt = pricepoamt;
	}

	@Basic
	public BigDecimal getPricestd() {
		return pricestd;
	}

	public void setPricestd(BigDecimal pricestd) {
		this.pricestd = pricestd;
	}

	@Basic
	public BigDecimal getPricestdamt() {
		return pricestdamt;
	}

	public void setPricestdamt(BigDecimal pricestdamt) {
		this.pricestdamt = pricestdamt;
	}

	@Basic
	public BigDecimal getQtyonhand() {
		return qtyonhand;
	}

	public void setQtyonhand(BigDecimal qtyonhand) {
		this.qtyonhand = qtyonhand;
	}
}