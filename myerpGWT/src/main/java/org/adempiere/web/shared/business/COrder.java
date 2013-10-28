package org.adempiere.web.shared.business;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * The persistent class for the c_order database table.
 * 
 */
@Entity
@Table(name = "c_order")
public class COrder extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				cOrderId;
	private Long				adClientId;
	private Long				adOrgId;
	private Long				adOrgtrxId;
	private Long				adUserId;
	private Long				amountrefunded;
	private Long				amounttendered;
	private Long				billBpartnerId;
	private Long				billLocationId;
	private Long				billUserId;
	private Long				cActivityId;
	private Long				cBpartnerId;
	private Long				cBpartnerLocationId;
	private Long				cCampaignId;
	private Long				cCashlineId;
	private Long				cChargeId;
	private Long				cConversiontypeId;
	private Long				cCurrencyId;
	private Long				cDoctypeId;
	private Long				cDoctypetargetId;
	private Long				cOrdersourceId;
	private Long				cPaymentId;
	private Long				cPaymenttermId;
	private Long				cPosId;
	private Long				cProjectId;
	private BigDecimal			chargeamt;
	private String				copyfrom;
	private String				created;
	private Long				createdby;
	private String				dateacct;
	private String				dateordered;
	private String				dateprinted;
	private String				datepromised;
	private String				deliveryrule;
	private String				deliveryviarule;
	private String				description;
	private String				docaction;
	private String				docstatus;
	private String				documentno;
	private Long				dropshipBpartnerId;
	private Long				dropshipLocationId;
	private Long				dropshipUserId;
	private BigDecimal			freightamt;
	private String				freightcostrule;
	private BigDecimal			grandtotal;
	private String				invoicerule;
	private String				isactive;
	private String				isapproved;
	private String				iscreditapproved;
	private String				isdelivered;
	private String				isdiscountprinted;
	private String				isdropship;
	private String				isinvoiced;
	private String				isprinted;
	private String				isselected;
	private String				isselfservice;
	private String				issotrx;
	private String				istaxincluded;
	private String				istransferred;
	private Long				linkOrderId;
	private Long				mFreightcategoryId;
	private Long				mPricelistId;
	private Long				mShipperId;
	private Long				mWarehouseId;
	private String				ordertype;
	private Long				payBpartnerId;
	private Long				payLocationId;
	private String				paymentrule;
	private String				poreference;
	private String				posted;
	private String				priorityrule;
	private String				processed;
	private Long				processedon;
	private String				processing;
	private String				promotioncode;
	private Long				refOrderId;
	private Long				salesrepId;
	private String				sendemail;
	private BigDecimal			totallines;
	private String				updated;
	private Long				updatedby;
	private Long				user1Id;
	private Long				user2Id;
	private BigDecimal			volume;
	private BigDecimal			weight;

	public COrder() {
	}

	@Id
	@Column(name = "C_ORDER_ID")
	public long getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(long cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_ORGTRX_ID")
	public Long getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(Long adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Column(name = "AD_USER_ID")
	public Long getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getAmountrefunded() {
		return this.amountrefunded;
	}

	public void setAmountrefunded(Long amountrefunded) {
		this.amountrefunded = amountrefunded;
	}

	public Long getAmounttendered() {
		return this.amounttendered;
	}

	public void setAmounttendered(Long amounttendered) {
		this.amounttendered = amounttendered;
	}

	@Column(name = "BILL_BPARTNER_ID")
	public Long getBillBpartnerId() {
		return this.billBpartnerId;
	}

	public void setBillBpartnerId(Long billBpartnerId) {
		this.billBpartnerId = billBpartnerId;
	}

	@Column(name = "BILL_LOCATION_ID")
	public Long getBillLocationId() {
		return this.billLocationId;
	}

	public void setBillLocationId(Long billLocationId) {
		this.billLocationId = billLocationId;
	}

	@Column(name = "BILL_USER_ID")
	public Long getBillUserId() {
		return this.billUserId;
	}

	public void setBillUserId(Long billUserId) {
		this.billUserId = billUserId;
	}

	@Column(name = "C_ACTIVITY_ID")
	public Long getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(Long cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Column(name = "C_BPARTNER_ID")
	public Long getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(Long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Column(name = "C_BPARTNER_LOCATION_ID")
	public Long getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Long cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Column(name = "C_CAMPAIGN_ID")
	public Long getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(Long cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Column(name = "C_CASHLINE_ID")
	public Long getCCashlineId() {
		return this.cCashlineId;
	}

	public void setCCashlineId(Long cCashlineId) {
		this.cCashlineId = cCashlineId;
	}

	@Column(name = "C_CHARGE_ID")
	public Long getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(Long cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Column(name = "C_CONVERSIONTYPE_ID")
	public Long getCConversiontypeId() {
		return this.cConversiontypeId;
	}

	public void setCConversiontypeId(Long cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}

	@Column(name = "C_CURRENCY_ID")
	public Long getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(Long cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Column(name = "C_DOCTYPE_ID")
	public Long getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(Long cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Column(name = "C_DOCTYPETARGET_ID")
	public Long getCDoctypetargetId() {
		return this.cDoctypetargetId;
	}

	public void setCDoctypetargetId(Long cDoctypetargetId) {
		this.cDoctypetargetId = cDoctypetargetId;
	}

	@Column(name = "C_ORDERSOURCE_ID")
	public Long getCOrdersourceId() {
		return this.cOrdersourceId;
	}

	public void setCOrdersourceId(Long cOrdersourceId) {
		this.cOrdersourceId = cOrdersourceId;
	}

	@Column(name = "C_PAYMENT_ID")
	public Long getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(Long cPaymentId) {
		this.cPaymentId = cPaymentId;
	}

	@Column(name = "C_PAYMENTTERM_ID")
	public Long getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(Long cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}

	@Column(name = "C_POS_ID")
	public Long getCPosId() {
		return this.cPosId;
	}

	public void setCPosId(Long cPosId) {
		this.cPosId = cPosId;
	}

	@Column(name = "C_PROJECT_ID")
	public Long getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(Long cProjectId) {
		this.cProjectId = cProjectId;
	}

	public BigDecimal getChargeamt() {
		return this.chargeamt;
	}

	public void setChargeamt(BigDecimal chargeamt) {
		this.chargeamt = chargeamt;
	}

	public String getCopyfrom() {
		return this.copyfrom;
	}

	public void setCopyfrom(String copyfrom) {
		this.copyfrom = copyfrom;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	public String getDateordered() {
		return this.dateordered;
	}

	public void setDateordered(String dateordered) {
		this.dateordered = dateordered;
	}

	public String getDateprinted() {
		return this.dateprinted;
	}

	public void setDateprinted(String dateprinted) {
		this.dateprinted = dateprinted;
	}

	public String getDatepromised() {
		return this.datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	public String getDeliveryrule() {
		return this.deliveryrule;
	}

	public void setDeliveryrule(String deliveryrule) {
		this.deliveryrule = deliveryrule;
	}

	public String getDeliveryviarule() {
		return this.deliveryviarule;
	}

	public void setDeliveryviarule(String deliveryviarule) {
		this.deliveryviarule = deliveryviarule;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocaction() {
		return this.docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	public String getDocstatus() {
		return this.docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Column(name = "DROPSHIP_BPARTNER_ID")
	public Long getDropshipBpartnerId() {
		return this.dropshipBpartnerId;
	}

	public void setDropshipBpartnerId(Long dropshipBpartnerId) {
		this.dropshipBpartnerId = dropshipBpartnerId;
	}

	@Column(name = "DROPSHIP_LOCATION_ID")
	public Long getDropshipLocationId() {
		return this.dropshipLocationId;
	}

	public void setDropshipLocationId(Long dropshipLocationId) {
		this.dropshipLocationId = dropshipLocationId;
	}

	@Column(name = "DROPSHIP_USER_ID")
	public Long getDropshipUserId() {
		return this.dropshipUserId;
	}

	public void setDropshipUserId(Long dropshipUserId) {
		this.dropshipUserId = dropshipUserId;
	}

	public BigDecimal getFreightamt() {
		return this.freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
	}

	public String getFreightcostrule() {
		return this.freightcostrule;
	}

	public void setFreightcostrule(String freightcostrule) {
		this.freightcostrule = freightcostrule;
	}

	public BigDecimal getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(BigDecimal grandtotal) {
		this.grandtotal = grandtotal;
	}

	public String getInvoicerule() {
		return this.invoicerule;
	}

	public void setInvoicerule(String invoicerule) {
		this.invoicerule = invoicerule;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsapproved() {
		return this.isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}

	public String getIscreditapproved() {
		return this.iscreditapproved;
	}

	public void setIscreditapproved(String iscreditapproved) {
		this.iscreditapproved = iscreditapproved;
	}

	public String getIsdelivered() {
		return this.isdelivered;
	}

	public void setIsdelivered(String isdelivered) {
		this.isdelivered = isdelivered;
	}

	public String getIsdiscountprinted() {
		return this.isdiscountprinted;
	}

	public void setIsdiscountprinted(String isdiscountprinted) {
		this.isdiscountprinted = isdiscountprinted;
	}

	public String getIsdropship() {
		return this.isdropship;
	}

	public void setIsdropship(String isdropship) {
		this.isdropship = isdropship;
	}

	public String getIsinvoiced() {
		return this.isinvoiced;
	}

	public void setIsinvoiced(String isinvoiced) {
		this.isinvoiced = isinvoiced;
	}

	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}

	public String getIsselected() {
		return this.isselected;
	}

	public void setIsselected(String isselected) {
		this.isselected = isselected;
	}

	public String getIsselfservice() {
		return this.isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
	}

	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}

	public String getIstaxincluded() {
		return this.istaxincluded;
	}

	public void setIstaxincluded(String istaxincluded) {
		this.istaxincluded = istaxincluded;
	}

	public String getIstransferred() {
		return this.istransferred;
	}

	public void setIstransferred(String istransferred) {
		this.istransferred = istransferred;
	}

	@Column(name = "LINK_ORDER_ID")
	public Long getLinkOrderId() {
		return this.linkOrderId;
	}

	public void setLinkOrderId(Long linkOrderId) {
		this.linkOrderId = linkOrderId;
	}

	@Column(name = "M_FREIGHTCATEGORY_ID")
	public Long getMFreightcategoryId() {
		return this.mFreightcategoryId;
	}

	public void setMFreightcategoryId(Long mFreightcategoryId) {
		this.mFreightcategoryId = mFreightcategoryId;
	}

	@Column(name = "M_PRICELIST_ID")
	public Long getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(Long mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Column(name = "M_SHIPPER_ID")
	public Long getMShipperId() {
		return this.mShipperId;
	}

	public void setMShipperId(Long mShipperId) {
		this.mShipperId = mShipperId;
	}

	@Column(name = "M_WAREHOUSE_ID")
	public Long getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(Long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	public String getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	@Column(name = "PAY_BPARTNER_ID")
	public Long getPayBpartnerId() {
		return this.payBpartnerId;
	}

	public void setPayBpartnerId(Long payBpartnerId) {
		this.payBpartnerId = payBpartnerId;
	}

	@Column(name = "PAY_LOCATION_ID")
	public Long getPayLocationId() {
		return this.payLocationId;
	}

	public void setPayLocationId(Long payLocationId) {
		this.payLocationId = payLocationId;
	}

	public String getPaymentrule() {
		return this.paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
	}

	public String getPoreference() {
		return this.poreference;
	}

	public void setPoreference(String poreference) {
		this.poreference = poreference;
	}

	public String getPosted() {
		return this.posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	public String getPriorityrule() {
		return this.priorityrule;
	}

	public void setPriorityrule(String priorityrule) {
		this.priorityrule = priorityrule;
	}

	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public Long getProcessedon() {
		return this.processedon;
	}

	public void setProcessedon(Long processedon) {
		this.processedon = processedon;
	}

	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getPromotioncode() {
		return this.promotioncode;
	}

	public void setPromotioncode(String promotioncode) {
		this.promotioncode = promotioncode;
	}

	@Column(name = "REF_ORDER_ID")
	public Long getRefOrderId() {
		return this.refOrderId;
	}

	public void setRefOrderId(Long refOrderId) {
		this.refOrderId = refOrderId;
	}

	@Column(name = "SALESREP_ID")
	public Long getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(Long salesrepId) {
		this.salesrepId = salesrepId;
	}

	public String getSendemail() {
		return this.sendemail;
	}

	public void setSendemail(String sendemail) {
		this.sendemail = sendemail;
	}

	public BigDecimal getTotallines() {
		return this.totallines;
	}

	public void setTotallines(BigDecimal totallines) {
		this.totallines = totallines;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	@Column(name = "USER1_ID")
	public Long getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(Long user1Id) {
		this.user1Id = user1Id;
	}

	@Column(name = "USER2_ID")
	public Long getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(Long user2Id) {
		this.user2Id = user2Id;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}