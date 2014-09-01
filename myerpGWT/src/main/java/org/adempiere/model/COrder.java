package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_order")
public class COrder extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Integer aDUserID;
	private Boolean active;
	private Long amountRefunded;
	private Long amountTendered;
	private Boolean approved;
	private Integer billBPartnerID;
	private Integer billLocationID;
	private Integer billUserID;
	private Integer cActivityID;
	private Integer cBPartnerID;
	private Integer cBPartnerLocationID;
	private Integer cCampaignID;
	private Integer cCashLineID;
	private Integer cChargeID;
	private Integer cConversionTypeID;
	private Integer cCurrencyID;
	private Integer cDocTypeID;
	private Integer cDocTypeTargetID;
	private Integer cOrderID;
	private Integer cOrderSourceID;
	private Integer cPOSID;
	private Integer cPaymentID;
	private Integer cPaymentTermID;
	private Integer cProjectID;
	private BigDecimal chargeAmt;
	private Boolean copyFrom;
	private String created;
	private Integer createdBy;
	private Boolean creditApproved;
	private String dateAcct;
	private String dateOrdered;
	private String datePrinted;
	private String datePromised;
	private Boolean delivered;
	private String deliveryRule;
	private String deliveryViaRule;
	private String description;
	private Boolean discountPrinted;
	private String docAction;
	private String docStatus;
	private String documentNo;
	private Boolean dropShip;
	private Integer dropShipBPartnerID;
	private Integer dropShipLocationID;
	private Integer dropShipUserID;
	private BigDecimal freightAmt;
	private String freightCostRule;
	private BigDecimal grandTotal;
	private String invoiceRule;
	private Boolean invoiced;
	private Integer linkOrderID;
	private Integer mFreightCategoryID;
	private Integer mPriceListID;
	private Integer mShipperID;
	private Integer mWarehouseID;
	private String orderType;
	private String pOReference;
	private Integer payBPartnerID;
	private Integer payLocationID;
	private String paymentRule;
	private Boolean posted;
	private Boolean printed;
	private String priorityRule;
	private Boolean processed;
	private Long processedOn;
	private Boolean processing;
	private String promotionCode;
	private Integer refOrderID;
	private Boolean sOTrx;
	private Integer salesRepID;
	private Boolean selected;
	private Boolean selfService;
	private Boolean sendEMail;
	private Boolean taxIncluded;
	private BigDecimal totalLines;
	private Boolean transferred;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;
	private BigDecimal volume;
	private BigDecimal weight;

	public COrder() {
	}

	public COrder(Integer cOrderID) {
		this.cOrderID = cOrderID;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
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
	public Long getAmountRefunded() {
		return amountRefunded;
	}

	public void setAmountRefunded(Long amountRefunded) {
		this.amountRefunded = amountRefunded;
	}

	@Basic
	public Long getAmountTendered() {
		return amountTendered;
	}

	public void setAmountTendered(Long amountTendered) {
		this.amountTendered = amountTendered;
	}

	@Basic
	@Column(name="ISAPPROVED", nullable=false)
	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	@Basic
	@Column(name="BILL_BPARTNER_ID", columnDefinition="INT")
	public Integer getBillBPartnerID() {
		return billBPartnerID;
	}

	public void setBillBPartnerID(Integer billBPartnerID) {
		this.billBPartnerID = billBPartnerID;
	}

	@Basic
	@Column(name="BILL_LOCATION_ID", columnDefinition="INT")
	public Integer getBillLocationID() {
		return billLocationID;
	}

	public void setBillLocationID(Integer billLocationID) {
		this.billLocationID = billLocationID;
	}

	@Basic
	@Column(name="BILL_USER_ID", columnDefinition="INT")
	public Integer getBillUserID() {
		return billUserID;
	}

	public void setBillUserID(Integer billUserID) {
		this.billUserID = billUserID;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerLocationID() {
		return cBPartnerLocationID;
	}

	public void setCBPartnerLocationID(Integer cBPartnerLocationID) {
		this.cBPartnerLocationID = cBPartnerLocationID;
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
	@Column(name="C_CASHLINE_ID", columnDefinition="INT")
	public Integer getCCashLineID() {
		return cCashLineID;
	}

	public void setCCashLineID(Integer cCashLineID) {
		this.cCashLineID = cCashLineID;
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
	@Column(name="C_CONVERSIONTYPE_ID", columnDefinition="INT")
	public Integer getCConversionTypeID() {
		return cConversionTypeID;
	}

	public void setCConversionTypeID(Integer cConversionTypeID) {
		this.cConversionTypeID = cConversionTypeID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
	}

	@Basic
	@Column(name="C_DOCTYPETARGET_ID", columnDefinition="INT", nullable=false)
	public Integer getCDocTypeTargetID() {
		return cDocTypeTargetID;
	}

	public void setCDocTypeTargetID(Integer cDocTypeTargetID) {
		this.cDocTypeTargetID = cDocTypeTargetID;
	}

	@Id
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_232", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Order", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_232")
	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
	}

	@Basic
	@Column(name="C_ORDERSOURCE_ID", columnDefinition="INT")
	public Integer getCOrderSourceID() {
		return cOrderSourceID;
	}

	public void setCOrderSourceID(Integer cOrderSourceID) {
		this.cOrderSourceID = cOrderSourceID;
	}

	@Basic
	@Column(name="C_POS_ID", columnDefinition="INT")
	public Integer getCPOSID() {
		return cPOSID;
	}

	public void setCPOSID(Integer cPOSID) {
		this.cPOSID = cPOSID;
	}

	@Basic
	@Column(name="C_PAYMENT_ID", columnDefinition="INT")
	public Integer getCPaymentID() {
		return cPaymentID;
	}

	public void setCPaymentID(Integer cPaymentID) {
		this.cPaymentID = cPaymentID;
	}

	@Basic
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT", nullable=false)
	public Integer getCPaymentTermID() {
		return cPaymentTermID;
	}

	public void setCPaymentTermID(Integer cPaymentTermID) {
		this.cPaymentTermID = cPaymentTermID;
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
	public BigDecimal getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(BigDecimal chargeAmt) {
		this.chargeAmt = chargeAmt;
	}

	@Basic
	public Boolean isCopyFrom() {
		return copyFrom;
	}

	public void setCopyFrom(Boolean copyFrom) {
		this.copyFrom = copyFrom;
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
	@Column(name="ISCREDITAPPROVED", nullable=false)
	public Boolean isCreditApproved() {
		return creditApproved;
	}

	public void setCreditApproved(Boolean creditApproved) {
		this.creditApproved = creditApproved;
	}

	@Basic
	@Column(nullable=false)
	public String getDateAcct() {
		return dateAcct;
	}

	public void setDateAcct(String dateAcct) {
		this.dateAcct = dateAcct;
	}

	@Basic
	@Column(nullable=false)
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Basic
	public String getDatePrinted() {
		return datePrinted;
	}

	public void setDatePrinted(String datePrinted) {
		this.datePrinted = datePrinted;
	}

	@Basic
	public String getDatePromised() {
		return datePromised;
	}

	public void setDatePromised(String datePromised) {
		this.datePromised = datePromised;
	}

	@Basic
	@Column(name="ISDELIVERED", nullable=false)
	public Boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDeliveryRule() {
		return deliveryRule;
	}

	public void setDeliveryRule(String deliveryRule) {
		this.deliveryRule = deliveryRule;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDeliveryViaRule() {
		return deliveryViaRule;
	}

	public void setDeliveryViaRule(String deliveryViaRule) {
		this.deliveryViaRule = deliveryViaRule;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISDISCOUNTPRINTED", nullable=false)
	public Boolean isDiscountPrinted() {
		return discountPrinted;
	}

	public void setDiscountPrinted(Boolean discountPrinted) {
		this.discountPrinted = discountPrinted;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocAction() {
		return docAction;
	}

	public void setDocAction(String docAction) {
		this.docAction = docAction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	@Column(name="ISDROPSHIP", nullable=false)
	public Boolean isDropShip() {
		return dropShip;
	}

	public void setDropShip(Boolean dropShip) {
		this.dropShip = dropShip;
	}

	@Basic
	@Column(name="DROPSHIP_BPARTNER_ID", columnDefinition="INT")
	public Integer getDropShipBPartnerID() {
		return dropShipBPartnerID;
	}

	public void setDropShipBPartnerID(Integer dropShipBPartnerID) {
		this.dropShipBPartnerID = dropShipBPartnerID;
	}

	@Basic
	@Column(name="DROPSHIP_LOCATION_ID", columnDefinition="INT")
	public Integer getDropShipLocationID() {
		return dropShipLocationID;
	}

	public void setDropShipLocationID(Integer dropShipLocationID) {
		this.dropShipLocationID = dropShipLocationID;
	}

	@Basic
	@Column(name="DROPSHIP_USER_ID", columnDefinition="INT")
	public Integer getDropShipUserID() {
		return dropShipUserID;
	}

	public void setDropShipUserID(Integer dropShipUserID) {
		this.dropShipUserID = dropShipUserID;
	}

	@Basic
	public BigDecimal getFreightAmt() {
		return freightAmt;
	}

	public void setFreightAmt(BigDecimal freightAmt) {
		this.freightAmt = freightAmt;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFreightCostRule() {
		return freightCostRule;
	}

	public void setFreightCostRule(String freightCostRule) {
		this.freightCostRule = freightCostRule;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getInvoiceRule() {
		return invoiceRule;
	}

	public void setInvoiceRule(String invoiceRule) {
		this.invoiceRule = invoiceRule;
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
	@Column(name="LINK_ORDER_ID", columnDefinition="INT")
	public Integer getLinkOrderID() {
		return linkOrderID;
	}

	public void setLinkOrderID(Integer linkOrderID) {
		this.linkOrderID = linkOrderID;
	}

	@Basic
	@Column(name="M_FREIGHTCATEGORY_ID", columnDefinition="INT")
	public Integer getMFreightCategoryID() {
		return mFreightCategoryID;
	}

	public void setMFreightCategoryID(Integer mFreightCategoryID) {
		this.mFreightCategoryID = mFreightCategoryID;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT", nullable=false)
	public Integer getMPriceListID() {
		return mPriceListID;
	}

	public void setMPriceListID(Integer mPriceListID) {
		this.mPriceListID = mPriceListID;
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
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseID() {
		return mWarehouseID;
	}

	public void setMWarehouseID(Integer mWarehouseID) {
		this.mWarehouseID = mWarehouseID;
	}

	@Basic
	@Column(length=510)
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Basic
	@Column(length=20)
	public String getPOReference() {
		return pOReference;
	}

	public void setPOReference(String pOReference) {
		this.pOReference = pOReference;
	}

	@Basic
	@Column(name="PAY_BPARTNER_ID", columnDefinition="INT")
	public Integer getPayBPartnerID() {
		return payBPartnerID;
	}

	public void setPayBPartnerID(Integer payBPartnerID) {
		this.payBPartnerID = payBPartnerID;
	}

	@Basic
	@Column(name="PAY_LOCATION_ID", columnDefinition="INT")
	public Integer getPayLocationID() {
		return payLocationID;
	}

	public void setPayLocationID(Integer payLocationID) {
		this.payLocationID = payLocationID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPaymentRule() {
		return paymentRule;
	}

	public void setPaymentRule(String paymentRule) {
		this.paymentRule = paymentRule;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isPosted() {
		return posted;
	}

	public void setPosted(Boolean posted) {
		this.posted = posted;
	}

	@Basic
	@Column(name="ISPRINTED", nullable=false)
	public Boolean isPrinted() {
		return printed;
	}

	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPriorityRule() {
		return priorityRule;
	}

	public void setPriorityRule(String priorityRule) {
		this.priorityRule = priorityRule;
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
	public Long getProcessedOn() {
		return processedOn;
	}

	public void setProcessedOn(Long processedOn) {
		this.processedOn = processedOn;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=30)
	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	@Basic
	@Column(name="REF_ORDER_ID", columnDefinition="INT")
	public Integer getRefOrderID() {
		return refOrderID;
	}

	public void setRefOrderID(Integer refOrderID) {
		this.refOrderID = refOrderID;
	}

	@Basic
	@Column(name="ISSOTRX", nullable=false)
	public Boolean isSOTrx() {
		return sOTrx;
	}

	public void setSOTrx(Boolean sOTrx) {
		this.sOTrx = sOTrx;
	}

	@Basic
	@Column(name="SALESREP_ID", columnDefinition="INT")
	public Integer getSalesRepID() {
		return salesRepID;
	}

	public void setSalesRepID(Integer salesRepID) {
		this.salesRepID = salesRepID;
	}

	@Basic
	@Column(name="ISSELECTED", nullable=false)
	public Boolean isSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	@Basic
	@Column(name="ISSELFSERVICE", nullable=false)
	public Boolean isSelfService() {
		return selfService;
	}

	public void setSelfService(Boolean selfService) {
		this.selfService = selfService;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isSendEMail() {
		return sendEMail;
	}

	public void setSendEMail(Boolean sendEMail) {
		this.sendEMail = sendEMail;
	}

	@Basic
	@Column(name="ISTAXINCLUDED", nullable=false)
	public Boolean isTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTotalLines() {
		return totalLines;
	}

	public void setTotalLines(BigDecimal totalLines) {
		this.totalLines = totalLines;
	}

	@Basic
	@Column(name="ISTRANSFERRED", nullable=false)
	public Boolean isTransferred() {
		return transferred;
	}

	public void setTransferred(Boolean transferred) {
		this.transferred = transferred;
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

	@Basic
	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Basic
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
}