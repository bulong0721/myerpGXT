package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_payment database table.
 * 
 */
@Entity
@Table(name="c_payment")
@NamedQuery(name="CPayment.findAll", query="SELECT c FROM CPayment c")
public class CPayment extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPaymentId;
	private String aCity;
	private String aCountry;
	private String aEmail;
	private String aIdentDl;
	private String aIdentSsn;
	private String aName;
	private String aState;
	private String aStreet;
	private String aZip;
	private String accountno;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal cActivityId;
	private BigDecimal cBankaccountId;
	private BigDecimal cBpBankaccountId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCampaignId;
	private BigDecimal cCashbookId;
	private BigDecimal cChargeId;
	private BigDecimal cConversiontypeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cDoctypeId;
	private BigDecimal cInvoiceId;
	private BigDecimal cOrderId;
	private BigDecimal cPaymentbatchId;
	private BigDecimal cProjectId;
	private BigDecimal chargeamt;
	private String checkno;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal creditcardexpmm;
	private BigDecimal creditcardexpyy;
	private String creditcardnumber;
	private String creditcardtype;
	private String creditcardvv;
	private Date dateacct;
	private Date datetrx;
	private String description;
	private BigDecimal discountamt;
	private String docaction;
	private String docstatus;
	private String documentno;
	private String isactive;
	private String isallocated;
	private String isapproved;
	private String isdelayedcapture;
	private String isonline;
	private String isoverunderpayment;
	private String isprepayment;
	private String isreceipt;
	private String isreconciled;
	private String isselfservice;
	private String micr;
	private String oprocessing;
	private String origTrxid;
	private BigDecimal overunderamt;
	private BigDecimal payamt;
	private String ponum;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private String rAuthcode;
	private String rAuthcodeDc;
	private String rAvsaddr;
	private String rAvszip;
	private String rCvv2match;
	private String rInfo;
	private String rPnref;
	private String rPnrefDc;
	private String rRespmsg;
	private String rResult;
	private BigDecimal refPaymentId;
	private BigDecimal reversalId;
	private String routingno;
	private String swipe;
	private BigDecimal taxamt;
	private String tendertype;
	private String trxtype;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;
	private String voiceauthcode;
	private BigDecimal writeoffamt;

	public CPayment() {
	}


	@Id
	@Column(name="C_PAYMENT_ID")
	public long getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(long cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	@Column(name="A_CITY")
	public String getACity() {
		return this.aCity;
	}

	public void setACity(String aCity) {
		this.aCity = aCity;
	}


	@Column(name="A_COUNTRY")
	public String getACountry() {
		return this.aCountry;
	}

	public void setACountry(String aCountry) {
		this.aCountry = aCountry;
	}


	@Column(name="A_EMAIL")
	public String getAEmail() {
		return this.aEmail;
	}

	public void setAEmail(String aEmail) {
		this.aEmail = aEmail;
	}


	@Column(name="A_IDENT_DL")
	public String getAIdentDl() {
		return this.aIdentDl;
	}

	public void setAIdentDl(String aIdentDl) {
		this.aIdentDl = aIdentDl;
	}


	@Column(name="A_IDENT_SSN")
	public String getAIdentSsn() {
		return this.aIdentSsn;
	}

	public void setAIdentSsn(String aIdentSsn) {
		this.aIdentSsn = aIdentSsn;
	}


	@Column(name="A_NAME")
	public String getAName() {
		return this.aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}


	@Column(name="A_STATE")
	public String getAState() {
		return this.aState;
	}

	public void setAState(String aState) {
		this.aState = aState;
	}


	@Column(name="A_STREET")
	public String getAStreet() {
		return this.aStreet;
	}

	public void setAStreet(String aStreet) {
		this.aStreet = aStreet;
	}


	@Column(name="A_ZIP")
	public String getAZip() {
		return this.aZip;
	}

	public void setAZip(String aZip) {
		this.aZip = aZip;
	}


	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
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


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}


	@Column(name="C_BP_BANKACCOUNT_ID")
	public BigDecimal getCBpBankaccountId() {
		return this.cBpBankaccountId;
	}

	public void setCBpBankaccountId(BigDecimal cBpBankaccountId) {
		this.cBpBankaccountId = cBpBankaccountId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_CASHBOOK_ID")
	public BigDecimal getCCashbookId() {
		return this.cCashbookId;
	}

	public void setCCashbookId(BigDecimal cCashbookId) {
		this.cCashbookId = cCashbookId;
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


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Column(name="C_PAYMENTBATCH_ID")
	public BigDecimal getCPaymentbatchId() {
		return this.cPaymentbatchId;
	}

	public void setCPaymentbatchId(BigDecimal cPaymentbatchId) {
		this.cPaymentbatchId = cPaymentbatchId;
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


	public String getCheckno() {
		return this.checkno;
	}

	public void setCheckno(String checkno) {
		this.checkno = checkno;
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


	public BigDecimal getCreditcardexpmm() {
		return this.creditcardexpmm;
	}

	public void setCreditcardexpmm(BigDecimal creditcardexpmm) {
		this.creditcardexpmm = creditcardexpmm;
	}


	public BigDecimal getCreditcardexpyy() {
		return this.creditcardexpyy;
	}

	public void setCreditcardexpyy(BigDecimal creditcardexpyy) {
		this.creditcardexpyy = creditcardexpyy;
	}


	public String getCreditcardnumber() {
		return this.creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}


	public String getCreditcardtype() {
		return this.creditcardtype;
	}

	public void setCreditcardtype(String creditcardtype) {
		this.creditcardtype = creditcardtype;
	}


	public String getCreditcardvv() {
		return this.creditcardvv;
	}

	public void setCreditcardvv(String creditcardvv) {
		this.creditcardvv = creditcardvv;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatetrx() {
		return this.datetrx;
	}

	public void setDatetrx(Date datetrx) {
		this.datetrx = datetrx;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getDiscountamt() {
		return this.discountamt;
	}

	public void setDiscountamt(BigDecimal discountamt) {
		this.discountamt = discountamt;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsallocated() {
		return this.isallocated;
	}

	public void setIsallocated(String isallocated) {
		this.isallocated = isallocated;
	}


	public String getIsapproved() {
		return this.isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}


	public String getIsdelayedcapture() {
		return this.isdelayedcapture;
	}

	public void setIsdelayedcapture(String isdelayedcapture) {
		this.isdelayedcapture = isdelayedcapture;
	}


	public String getIsonline() {
		return this.isonline;
	}

	public void setIsonline(String isonline) {
		this.isonline = isonline;
	}


	public String getIsoverunderpayment() {
		return this.isoverunderpayment;
	}

	public void setIsoverunderpayment(String isoverunderpayment) {
		this.isoverunderpayment = isoverunderpayment;
	}


	public String getIsprepayment() {
		return this.isprepayment;
	}

	public void setIsprepayment(String isprepayment) {
		this.isprepayment = isprepayment;
	}


	public String getIsreceipt() {
		return this.isreceipt;
	}

	public void setIsreceipt(String isreceipt) {
		this.isreceipt = isreceipt;
	}


	public String getIsreconciled() {
		return this.isreconciled;
	}

	public void setIsreconciled(String isreconciled) {
		this.isreconciled = isreconciled;
	}


	public String getIsselfservice() {
		return this.isselfservice;
	}

	public void setIsselfservice(String isselfservice) {
		this.isselfservice = isselfservice;
	}


	public String getMicr() {
		return this.micr;
	}

	public void setMicr(String micr) {
		this.micr = micr;
	}


	public String getOprocessing() {
		return this.oprocessing;
	}

	public void setOprocessing(String oprocessing) {
		this.oprocessing = oprocessing;
	}


	@Column(name="ORIG_TRXID")
	public String getOrigTrxid() {
		return this.origTrxid;
	}

	public void setOrigTrxid(String origTrxid) {
		this.origTrxid = origTrxid;
	}


	public BigDecimal getOverunderamt() {
		return this.overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
	}


	public BigDecimal getPayamt() {
		return this.payamt;
	}

	public void setPayamt(BigDecimal payamt) {
		this.payamt = payamt;
	}


	public String getPonum() {
		return this.ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
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


	@Column(name="R_AUTHCODE")
	public String getRAuthcode() {
		return this.rAuthcode;
	}

	public void setRAuthcode(String rAuthcode) {
		this.rAuthcode = rAuthcode;
	}


	@Column(name="R_AUTHCODE_DC")
	public String getRAuthcodeDc() {
		return this.rAuthcodeDc;
	}

	public void setRAuthcodeDc(String rAuthcodeDc) {
		this.rAuthcodeDc = rAuthcodeDc;
	}


	@Column(name="R_AVSADDR")
	public String getRAvsaddr() {
		return this.rAvsaddr;
	}

	public void setRAvsaddr(String rAvsaddr) {
		this.rAvsaddr = rAvsaddr;
	}


	@Column(name="R_AVSZIP")
	public String getRAvszip() {
		return this.rAvszip;
	}

	public void setRAvszip(String rAvszip) {
		this.rAvszip = rAvszip;
	}


	@Column(name="R_CVV2MATCH")
	public String getRCvv2match() {
		return this.rCvv2match;
	}

	public void setRCvv2match(String rCvv2match) {
		this.rCvv2match = rCvv2match;
	}


	@Column(name="R_INFO")
	public String getRInfo() {
		return this.rInfo;
	}

	public void setRInfo(String rInfo) {
		this.rInfo = rInfo;
	}


	@Column(name="R_PNREF")
	public String getRPnref() {
		return this.rPnref;
	}

	public void setRPnref(String rPnref) {
		this.rPnref = rPnref;
	}


	@Column(name="R_PNREF_DC")
	public String getRPnrefDc() {
		return this.rPnrefDc;
	}

	public void setRPnrefDc(String rPnrefDc) {
		this.rPnrefDc = rPnrefDc;
	}


	@Column(name="R_RESPMSG")
	public String getRRespmsg() {
		return this.rRespmsg;
	}

	public void setRRespmsg(String rRespmsg) {
		this.rRespmsg = rRespmsg;
	}


	@Column(name="R_RESULT")
	public String getRResult() {
		return this.rResult;
	}

	public void setRResult(String rResult) {
		this.rResult = rResult;
	}


	@Column(name="REF_PAYMENT_ID")
	public BigDecimal getRefPaymentId() {
		return this.refPaymentId;
	}

	public void setRefPaymentId(BigDecimal refPaymentId) {
		this.refPaymentId = refPaymentId;
	}


	@Column(name="REVERSAL_ID")
	public BigDecimal getReversalId() {
		return this.reversalId;
	}

	public void setReversalId(BigDecimal reversalId) {
		this.reversalId = reversalId;
	}


	public String getRoutingno() {
		return this.routingno;
	}

	public void setRoutingno(String routingno) {
		this.routingno = routingno;
	}


	public String getSwipe() {
		return this.swipe;
	}

	public void setSwipe(String swipe) {
		this.swipe = swipe;
	}


	public BigDecimal getTaxamt() {
		return this.taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}


	public String getTendertype() {
		return this.tendertype;
	}

	public void setTendertype(String tendertype) {
		this.tendertype = tendertype;
	}


	public String getTrxtype() {
		return this.trxtype;
	}

	public void setTrxtype(String trxtype) {
		this.trxtype = trxtype;
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


	public String getVoiceauthcode() {
		return this.voiceauthcode;
	}

	public void setVoiceauthcode(String voiceauthcode) {
		this.voiceauthcode = voiceauthcode;
	}


	public BigDecimal getWriteoffamt() {
		return this.writeoffamt;
	}

	public void setWriteoffamt(BigDecimal writeoffamt) {
		this.writeoffamt = writeoffamt;
	}

}