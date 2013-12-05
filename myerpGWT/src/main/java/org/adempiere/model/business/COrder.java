package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_order database table.
 * 
 */
@Entity
@Table(name="c_order")
@NamedQuery(name="COrder.findAll", query="SELECT c FROM COrder c")
public class COrder extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cOrderId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal adUserId;
	private BigDecimal amountrefunded;
	private BigDecimal amounttendered;
	private BigDecimal billBpartnerId;
	private BigDecimal billLocationId;
	private BigDecimal billUserId;
	private BigDecimal cActivityId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cCampaignId;
	private BigDecimal cCashlineId;
	private BigDecimal cChargeId;
	private BigDecimal cConversiontypeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cDoctypeId;
	private BigDecimal cDoctypetargetId;
	private BigDecimal cOrdersourceId;
	private BigDecimal cPaymentId;
	private BigDecimal cPaymenttermId;
	private BigDecimal cPosId;
	private BigDecimal cProjectId;
	private BigDecimal chargeamt;
	private String copyfrom;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateacct;
	private Date dateordered;
	private Date dateprinted;
	private Date datepromised;
	private String deliveryrule;
	private String deliveryviarule;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private BigDecimal dropshipBpartnerId;
	private BigDecimal dropshipLocationId;
	private BigDecimal dropshipUserId;
	private BigDecimal freightamt;
	private String freightcostrule;
	private BigDecimal grandtotal;
	private String invoicerule;
	private String isactive;
	private String isapproved;
	private String iscreditapproved;
	private String isdelivered;
	private String isdiscountprinted;
	private String isdropship;
	private String isinvoiced;
	private String isprinted;
	private String isselected;
	private String isselfservice;
	private String issotrx;
	private String istaxincluded;
	private String istransferred;
	private BigDecimal linkOrderId;
	private BigDecimal mFreightcategoryId;
	private BigDecimal mPricelistId;
	private BigDecimal mShipperId;
	private BigDecimal mWarehouseId;
	private String ordertype;
	private BigDecimal payBpartnerId;
	private BigDecimal payLocationId;
	private String paymentrule;
	private String poreference;
	private String posted;
	private String priorityrule;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private String promotioncode;
	private BigDecimal refOrderId;
	private BigDecimal salesrepId;
	private String sendemail;
	private BigDecimal totallines;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;
	private BigDecimal volume;
	private BigDecimal weight;

	public COrder() {
	}


	@Id
	@Column(name="C_ORDER_ID")
	public long getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(long cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_ORGTRX_ID")
	public BigDecimal getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	public BigDecimal getAmountrefunded() {
		return this.amountrefunded;
	}

	public void setAmountrefunded(BigDecimal amountrefunded) {
		this.amountrefunded = amountrefunded;
	}


	public BigDecimal getAmounttendered() {
		return this.amounttendered;
	}

	public void setAmounttendered(BigDecimal amounttendered) {
		this.amounttendered = amounttendered;
	}


	@Column(name="BILL_BPARTNER_ID")
	public BigDecimal getBillBpartnerId() {
		return this.billBpartnerId;
	}

	public void setBillBpartnerId(BigDecimal billBpartnerId) {
		this.billBpartnerId = billBpartnerId;
	}


	@Column(name="BILL_LOCATION_ID")
	public BigDecimal getBillLocationId() {
		return this.billLocationId;
	}

	public void setBillLocationId(BigDecimal billLocationId) {
		this.billLocationId = billLocationId;
	}


	@Column(name="BILL_USER_ID")
	public BigDecimal getBillUserId() {
		return this.billUserId;
	}

	public void setBillUserId(BigDecimal billUserId) {
		this.billUserId = billUserId;
	}


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_CASHLINE_ID")
	public BigDecimal getCCashlineId() {
		return this.cCashlineId;
	}

	public void setCCashlineId(BigDecimal cCashlineId) {
		this.cCashlineId = cCashlineId;
	}


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Column(name="C_CONVERSIONTYPE_ID")
	public BigDecimal getCConversiontypeId() {
		return this.cConversiontypeId;
	}

	public void setCConversiontypeId(BigDecimal cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_DOCTYPE_ID")
	public BigDecimal getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(BigDecimal cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="C_DOCTYPETARGET_ID")
	public BigDecimal getCDoctypetargetId() {
		return this.cDoctypetargetId;
	}

	public void setCDoctypetargetId(BigDecimal cDoctypetargetId) {
		this.cDoctypetargetId = cDoctypetargetId;
	}


	@Column(name="C_ORDERSOURCE_ID")
	public BigDecimal getCOrdersourceId() {
		return this.cOrdersourceId;
	}

	public void setCOrdersourceId(BigDecimal cOrdersourceId) {
		this.cOrdersourceId = cOrdersourceId;
	}


	@Column(name="C_PAYMENT_ID")
	public BigDecimal getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(BigDecimal cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	@Column(name="C_PAYMENTTERM_ID")
	public BigDecimal getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(BigDecimal cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}


	@Column(name="C_POS_ID")
	public BigDecimal getCPosId() {
		return this.cPosId;
	}

	public void setCPosId(BigDecimal cPosId) {
		this.cPosId = cPosId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
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


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateordered() {
		return this.dateordered;
	}

	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateprinted() {
		return this.dateprinted;
	}

	public void setDateprinted(Date dateprinted) {
		this.dateprinted = dateprinted;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatepromised() {
		return this.datepromised;
	}

	public void setDatepromised(Date datepromised) {
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


	@Column(name="DROPSHIP_BPARTNER_ID")
	public BigDecimal getDropshipBpartnerId() {
		return this.dropshipBpartnerId;
	}

	public void setDropshipBpartnerId(BigDecimal dropshipBpartnerId) {
		this.dropshipBpartnerId = dropshipBpartnerId;
	}


	@Column(name="DROPSHIP_LOCATION_ID")
	public BigDecimal getDropshipLocationId() {
		return this.dropshipLocationId;
	}

	public void setDropshipLocationId(BigDecimal dropshipLocationId) {
		this.dropshipLocationId = dropshipLocationId;
	}


	@Column(name="DROPSHIP_USER_ID")
	public BigDecimal getDropshipUserId() {
		return this.dropshipUserId;
	}

	public void setDropshipUserId(BigDecimal dropshipUserId) {
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


	@Column(name="LINK_ORDER_ID")
	public BigDecimal getLinkOrderId() {
		return this.linkOrderId;
	}

	public void setLinkOrderId(BigDecimal linkOrderId) {
		this.linkOrderId = linkOrderId;
	}


	@Column(name="M_FREIGHTCATEGORY_ID")
	public BigDecimal getMFreightcategoryId() {
		return this.mFreightcategoryId;
	}

	public void setMFreightcategoryId(BigDecimal mFreightcategoryId) {
		this.mFreightcategoryId = mFreightcategoryId;
	}


	@Column(name="M_PRICELIST_ID")
	public BigDecimal getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(BigDecimal mPricelistId) {
		this.mPricelistId = mPricelistId;
	}


	@Column(name="M_SHIPPER_ID")
	public BigDecimal getMShipperId() {
		return this.mShipperId;
	}

	public void setMShipperId(BigDecimal mShipperId) {
		this.mShipperId = mShipperId;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	public String getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}


	@Column(name="PAY_BPARTNER_ID")
	public BigDecimal getPayBpartnerId() {
		return this.payBpartnerId;
	}

	public void setPayBpartnerId(BigDecimal payBpartnerId) {
		this.payBpartnerId = payBpartnerId;
	}


	@Column(name="PAY_LOCATION_ID")
	public BigDecimal getPayLocationId() {
		return this.payLocationId;
	}

	public void setPayLocationId(BigDecimal payLocationId) {
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


	public BigDecimal getProcessedon() {
		return this.processedon;
	}

	public void setProcessedon(BigDecimal processedon) {
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


	@Column(name="REF_ORDER_ID")
	public BigDecimal getRefOrderId() {
		return this.refOrderId;
	}

	public void setRefOrderId(BigDecimal refOrderId) {
		this.refOrderId = refOrderId;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
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


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}


	@Column(name="USER1_ID")
	public BigDecimal getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(BigDecimal user1Id) {
		this.user1Id = user1Id;
	}


	@Column(name="USER2_ID")
	public BigDecimal getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(BigDecimal user2Id) {
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