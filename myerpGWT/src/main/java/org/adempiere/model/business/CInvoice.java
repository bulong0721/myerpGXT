package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_invoice database table.
 * 
 */
@Entity
@Table(name="c_invoice")
@NamedQuery(name="CInvoice.findAll", query="SELECT c FROM CInvoice c")
public class CInvoice extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoiceId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal adUserId;
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
	private BigDecimal cDunninglevelId;
	private BigDecimal cOrderId;
	private BigDecimal cPaymentId;
	private BigDecimal cPaymenttermId;
	private BigDecimal cProjectId;
	private BigDecimal chargeamt;
	private String copyfrom;
	private Timestamp created;
	private BigDecimal createdby;
	private String createfrom;
	private Date dateacct;
	private Date dateinvoiced;
	private Date dateordered;
	private Date dateprinted;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private Date dunninggrace;
	private String generateto;
	private BigDecimal grandtotal;
	private String invoicecollectiontype;
	private String isactive;
	private String isapproved;
	private String isdiscountprinted;
	private String isindispute;
	private String ispaid;
	private String ispayschedulevalid;
	private String isprinted;
	private String isselfservice;
	private String issotrx;
	private String istaxincluded;
	private String istransferred;
	private BigDecimal mPricelistId;
	private BigDecimal mRmaId;
	private String paymentrule;
	private String poreference;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private BigDecimal refInvoiceId;
	private BigDecimal reversalId;
	private BigDecimal salesrepId;
	private String sendemail;
	private BigDecimal totallines;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;

	public CInvoice() {
	}


	@Id
	@Column(name="C_INVOICE_ID")
	public long getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(long cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
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


	@Column(name="C_DUNNINGLEVEL_ID")
	public BigDecimal getCDunninglevelId() {
		return this.cDunninglevelId;
	}

	public void setCDunninglevelId(BigDecimal cDunninglevelId) {
		this.cDunninglevelId = cDunninglevelId;
	}


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
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


	public String getCreatefrom() {
		return this.createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateinvoiced() {
		return this.dateinvoiced;
	}

	public void setDateinvoiced(Date dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDunninggrace() {
		return this.dunninggrace;
	}

	public void setDunninggrace(Date dunninggrace) {
		this.dunninggrace = dunninggrace;
	}


	public String getGenerateto() {
		return this.generateto;
	}

	public void setGenerateto(String generateto) {
		this.generateto = generateto;
	}


	public BigDecimal getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(BigDecimal grandtotal) {
		this.grandtotal = grandtotal;
	}


	public String getInvoicecollectiontype() {
		return this.invoicecollectiontype;
	}

	public void setInvoicecollectiontype(String invoicecollectiontype) {
		this.invoicecollectiontype = invoicecollectiontype;
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


	public String getIsdiscountprinted() {
		return this.isdiscountprinted;
	}

	public void setIsdiscountprinted(String isdiscountprinted) {
		this.isdiscountprinted = isdiscountprinted;
	}


	public String getIsindispute() {
		return this.isindispute;
	}

	public void setIsindispute(String isindispute) {
		this.isindispute = isindispute;
	}


	public String getIspaid() {
		return this.ispaid;
	}

	public void setIspaid(String ispaid) {
		this.ispaid = ispaid;
	}


	public String getIspayschedulevalid() {
		return this.ispayschedulevalid;
	}

	public void setIspayschedulevalid(String ispayschedulevalid) {
		this.ispayschedulevalid = ispayschedulevalid;
	}


	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
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


	@Column(name="M_PRICELIST_ID")
	public BigDecimal getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(BigDecimal mPricelistId) {
		this.mPricelistId = mPricelistId;
	}


	@Column(name="M_RMA_ID")
	public BigDecimal getMRmaId() {
		return this.mRmaId;
	}

	public void setMRmaId(BigDecimal mRmaId) {
		this.mRmaId = mRmaId;
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


	@Column(name="REF_INVOICE_ID")
	public BigDecimal getRefInvoiceId() {
		return this.refInvoiceId;
	}

	public void setRefInvoiceId(BigDecimal refInvoiceId) {
		this.refInvoiceId = refInvoiceId;
	}


	@Column(name="REVERSAL_ID")
	public BigDecimal getReversalId() {
		return this.reversalId;
	}

	public void setReversalId(BigDecimal reversalId) {
		this.reversalId = reversalId;
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

}