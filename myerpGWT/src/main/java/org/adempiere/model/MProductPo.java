package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_product_po")
@IdClass(org.adempiere.model.MProductPoPK.class)
public class MProductPo extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpartnerId;
	private Integer cCurrencyId;
	private Integer cUomId;
	private BigDecimal costperorder;
	private String created;
	private Integer createdby;
	private Integer deliverytimeActual;
	private Integer deliverytimePromised;
	private String discontinued;
	private String discontinuedat;
	private String discontinuedby;
	private Boolean isactive;
	private Boolean iscurrentvendor;
	private Integer mProductId;
	private String manufacturer;
	private BigDecimal orderMin;
	private BigDecimal orderPack;
	private String priceeffective;
	private BigDecimal pricelastinv;
	private BigDecimal pricelastpo;
	private BigDecimal pricelist;
	private BigDecimal pricepo;
	private BigDecimal qualityrating;
	private BigDecimal royaltyamt;
	private String upc;
	private String updated;
	private Integer updatedby;
	private String vendorcategory;
	private String vendorproductno;

	public MProductPo() {
	}

	public MProductPo(Integer cBpartnerId, Integer mProductId) {
		this.cBpartnerId = cBpartnerId;
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	public BigDecimal getCostperorder() {
		return costperorder;
	}

	public void setCostperorder(BigDecimal costperorder) {
		this.costperorder = costperorder;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(name="DELIVERYTIME_ACTUAL", columnDefinition="INT")
	public Integer getDeliverytimeActual() {
		return deliverytimeActual;
	}

	public void setDeliverytimeActual(Integer deliverytimeActual) {
		this.deliverytimeActual = deliverytimeActual;
	}

	@Basic
	@Column(name="DELIVERYTIME_PROMISED", columnDefinition="INT")
	public Integer getDeliverytimePromised() {
		return deliverytimePromised;
	}

	public void setDeliverytimePromised(Integer deliverytimePromised) {
		this.deliverytimePromised = deliverytimePromised;
	}

	@Basic
	@Column(length=1)
	public String getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(String discontinued) {
		this.discontinued = discontinued;
	}

	@Basic
	public String getDiscontinuedat() {
		return discontinuedat;
	}

	public void setDiscontinuedat(String discontinuedat) {
		this.discontinuedat = discontinuedat;
	}

	@Basic
	public String getDiscontinuedby() {
		return discontinuedby;
	}

	public void setDiscontinuedby(String discontinuedby) {
		this.discontinuedby = discontinuedby;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIscurrentvendor() {
		return iscurrentvendor;
	}

	public void setIscurrentvendor(Boolean iscurrentvendor) {
		this.iscurrentvendor = iscurrentvendor;
	}

	@Id
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(length=30)
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Basic
	@Column(name="ORDER_MIN")
	public BigDecimal getOrderMin() {
		return orderMin;
	}

	public void setOrderMin(BigDecimal orderMin) {
		this.orderMin = orderMin;
	}

	@Basic
	@Column(name="ORDER_PACK")
	public BigDecimal getOrderPack() {
		return orderPack;
	}

	public void setOrderPack(BigDecimal orderPack) {
		this.orderPack = orderPack;
	}

	@Basic
	public String getPriceeffective() {
		return priceeffective;
	}

	public void setPriceeffective(String priceeffective) {
		this.priceeffective = priceeffective;
	}

	@Basic
	public BigDecimal getPricelastinv() {
		return pricelastinv;
	}

	public void setPricelastinv(BigDecimal pricelastinv) {
		this.pricelastinv = pricelastinv;
	}

	@Basic
	public BigDecimal getPricelastpo() {
		return pricelastpo;
	}

	public void setPricelastpo(BigDecimal pricelastpo) {
		this.pricelastpo = pricelastpo;
	}

	@Basic
	public BigDecimal getPricelist() {
		return pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}

	@Basic
	public BigDecimal getPricepo() {
		return pricepo;
	}

	public void setPricepo(BigDecimal pricepo) {
		this.pricepo = pricepo;
	}

	@Basic
	public BigDecimal getQualityrating() {
		return qualityrating;
	}

	public void setQualityrating(BigDecimal qualityrating) {
		this.qualityrating = qualityrating;
	}

	@Basic
	public BigDecimal getRoyaltyamt() {
		return royaltyamt;
	}

	public void setRoyaltyamt(BigDecimal royaltyamt) {
		this.royaltyamt = royaltyamt;
	}

	@Basic
	@Column(length=20)
	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=30)
	public String getVendorcategory() {
		return vendorcategory;
	}

	public void setVendorcategory(String vendorcategory) {
		this.vendorcategory = vendorcategory;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getVendorproductno() {
		return vendorproductno;
	}

	public void setVendorproductno(String vendorproductno) {
		this.vendorproductno = vendorproductno;
	}
}