package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="dd_orderline")
public class DDOrderLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Boolean active;
	private Integer cActivityID;
	private Integer cCampaignID;
	private Integer cChargeID;
	private Integer cProjectID;
	private Integer cUOMID;
	private BigDecimal confirmedQty;
	private String created;
	private Integer createdBy;
	private Integer dDOrderID;
	private Integer dDOrderLineID;
	private String dateDelivered;
	private String dateOrdered;
	private String datePromised;
	private Boolean description;
	private BigDecimal freightAmt;
	private Boolean invoiced;
	private Integer line;
	private BigDecimal lineNetAmt;
	private Integer mAttributeSetInstanceID;
	private Integer mAttributeSetInstanceToID;
	private Integer mLocatorID;
	private Integer mLocatorToID;
	private Integer mProductID;
	private Integer mShipperID;
	private BigDecimal pickedQty;
	private Boolean processed;
	private BigDecimal qtyDelivered;
	private BigDecimal qtyEntered;
	private BigDecimal qtyInTransit;
	private BigDecimal qtyOrdered;
	private BigDecimal qtyReserved;
	private BigDecimal scrappedQty;
	private BigDecimal targetQty;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;

	public DDOrderLine() {
	}

	public DDOrderLine(Integer dDOrderLineID) {
		this.dDOrderLineID = dDOrderLineID;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getADOrgTrxID() {
		return aDOrgTrxID;
	}

	public void setADOrgTrxID(Integer aDOrgTrxID) {
		this.aDOrgTrxID = aDOrgTrxID;
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
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityID() {
		return cActivityID;
	}

	public void setCActivityID(Integer cActivityID) {
		this.cActivityID = cActivityID;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignID() {
		return cCampaignID;
	}

	public void setCCampaignID(Integer cCampaignID) {
		this.cCampaignID = cCampaignID;
	}

	@Basic
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	public Integer getCChargeID() {
		return cChargeID;
	}

	public void setCChargeID(Integer cChargeID) {
		this.cChargeID = cChargeID;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
	}

	@Basic
	public BigDecimal getConfirmedQty() {
		return confirmedQty;
	}

	public void setConfirmedQty(BigDecimal confirmedQty) {
		this.confirmedQty = confirmedQty;
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
	@Column(name="DD_ORDER_ID", columnDefinition="INT", nullable=false)
	public Integer getDDOrderID() {
		return dDOrderID;
	}

	public void setDDOrderID(Integer dDOrderID) {
		this.dDOrderID = dDOrderID;
	}

	@Id
	@Column(name="DD_ORDERLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53035", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "DD_OrderLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53035")
	public Integer getDDOrderLineID() {
		return dDOrderLineID;
	}

	public void setDDOrderLineID(Integer dDOrderLineID) {
		this.dDOrderLineID = dDOrderLineID;
	}

	@Basic
	public String getDateDelivered() {
		return dateDelivered;
	}

	public void setDateDelivered(String dateDelivered) {
		this.dateDelivered = dateDelivered;
	}

	@Basic
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Basic
	public String getDatePromised() {
		return datePromised;
	}

	public void setDatePromised(String datePromised) {
		this.datePromised = datePromised;
	}

	@Basic
	@Column(name="ISDESCRIPTION", nullable=false)
	public Boolean isDescription() {
		return description;
	}

	public void setDescription(Boolean description) {
		this.description = description;
	}

	@Basic
	public BigDecimal getFreightAmt() {
		return freightAmt;
	}

	public void setFreightAmt(BigDecimal freightAmt) {
		this.freightAmt = freightAmt;
	}

	@Basic
	@Column(name="ISINVOICED", nullable=false)
	public Boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(Boolean invoiced) {
		this.invoiced = invoiced;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	public BigDecimal getLineNetAmt() {
		return lineNetAmt;
	}

	public void setLineNetAmt(BigDecimal lineNetAmt) {
		this.lineNetAmt = lineNetAmt;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCETO_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceToID() {
		return mAttributeSetInstanceToID;
	}

	public void setMAttributeSetInstanceToID(Integer mAttributeSetInstanceToID) {
		this.mAttributeSetInstanceToID = mAttributeSetInstanceToID;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorID() {
		return mLocatorID;
	}

	public void setMLocatorID(Integer mLocatorID) {
		this.mLocatorID = mLocatorID;
	}

	@Basic
	@Column(name="M_LOCATORTO_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorToID() {
		return mLocatorToID;
	}

	public void setMLocatorToID(Integer mLocatorToID) {
		this.mLocatorToID = mLocatorToID;
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
	@Column(name="M_SHIPPER_ID", columnDefinition="INT")
	public Integer getMShipperID() {
		return mShipperID;
	}

	public void setMShipperID(Integer mShipperID) {
		this.mShipperID = mShipperID;
	}

	@Basic
	public BigDecimal getPickedQty() {
		return pickedQty;
	}

	public void setPickedQty(BigDecimal pickedQty) {
		this.pickedQty = pickedQty;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public BigDecimal getQtyDelivered() {
		return qtyDelivered;
	}

	public void setQtyDelivered(BigDecimal qtyDelivered) {
		this.qtyDelivered = qtyDelivered;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyEntered() {
		return qtyEntered;
	}

	public void setQtyEntered(BigDecimal qtyEntered) {
		this.qtyEntered = qtyEntered;
	}

	@Basic
	public BigDecimal getQtyInTransit() {
		return qtyInTransit;
	}

	public void setQtyInTransit(BigDecimal qtyInTransit) {
		this.qtyInTransit = qtyInTransit;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	@Basic
	public BigDecimal getQtyReserved() {
		return qtyReserved;
	}

	public void setQtyReserved(BigDecimal qtyReserved) {
		this.qtyReserved = qtyReserved;
	}

	@Basic
	public BigDecimal getScrappedQty() {
		return scrappedQty;
	}

	public void setScrappedQty(BigDecimal scrappedQty) {
		this.scrappedQty = scrappedQty;
	}

	@Basic
	public BigDecimal getTargetQty() {
		return targetQty;
	}

	public void setTargetQty(BigDecimal targetQty) {
		this.targetQty = targetQty;
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
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1ID() {
		return user1ID;
	}

	public void setUser1ID(Integer user1ID) {
		this.user1ID = user1ID;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2ID() {
		return user2ID;
	}

	public void setUser2ID(Integer user2ID) {
		this.user2ID = user2ID;
	}
}