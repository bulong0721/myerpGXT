package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_payment")
public class IPayment extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String aCity;
	private String aCountry;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String aEMail;
	private String aIdentDL;
	private String aIdentSSN;
	private String aName;
	private String aState;
	private String aStreet;
	private String aZip;
	private String accountNo;
	private Boolean active;
	private Boolean approved;
	private String bPartnerValue;
	private String bankAccountNo;
	private Integer cBPartnerID;
	private Integer cBankAccountID;
	private Integer cChargeID;
	private Integer cCurrencyID;
	private Integer cDocTypeID;
	private Integer cInvoiceID;
	private Integer cPaymentID;
	private BigDecimal chargeAmt;
	private String chargeName;
	private String checkNo;
	private String created;
	private Integer createdBy;
	private Integer creditCardExpMM;
	private Integer creditCardExpYY;
	private String creditCardNumber;
	private String creditCardType;
	private String creditCardVV;
	private String dateAcct;
	private String dateTrx;
	private Boolean delayedCapture;
	private BigDecimal discountAmt;
	private String docTypeName;
	private String documentNo;
	private String iErrorMsg;
	private Boolean iIsImported;
	private Integer iPaymentID;
	private String iSOCode;
	private String invoiceDocumentNo;
	private String micr;
	private String origTrxID;
	private BigDecimal overUnderAmt;
	private Boolean overUnderPayment;
	private String pONum;
	private BigDecimal payAmt;
	private Boolean processed;
	private Boolean processing;
	private String rAuthCode;
	private String rInfo;
	private String rPnRef;
	private String rRespMsg;
	private String rResult;
	private Boolean receipt;
	private String routingNo;
	private Boolean selfService;
	private String swipe;
	private BigDecimal taxAmt;
	private String tenderType;
	private String trxType;
	private String updated;
	private Integer updatedBy;
	private String voiceAuthCode;
	private BigDecimal writeOffAmt;

	public IPayment() {
	}

	public IPayment(Integer iPaymentID) {
		this.iPaymentID = iPaymentID;
	}

	@Basic
	@Column(name="A_CITY", length=60)
	public String getACity() {
		return aCity;
	}

	public void setACity(String aCity) {
		this.aCity = aCity;
	}

	@Basic
	@Column(name="A_COUNTRY", length=40)
	public String getACountry() {
		return aCountry;
	}

	public void setACountry(String aCountry) {
		this.aCountry = aCountry;
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
	@Column(name="A_EMAIL", length=60)
	public String getAEMail() {
		return aEMail;
	}

	public void setAEMail(String aEMail) {
		this.aEMail = aEMail;
	}

	@Basic
	@Column(name="A_IDENT_DL", length=20)
	public String getAIdentDL() {
		return aIdentDL;
	}

	public void setAIdentDL(String aIdentDL) {
		this.aIdentDL = aIdentDL;
	}

	@Basic
	@Column(name="A_IDENT_SSN", length=20)
	public String getAIdentSSN() {
		return aIdentSSN;
	}

	public void setAIdentSSN(String aIdentSSN) {
		this.aIdentSSN = aIdentSSN;
	}

	@Basic
	@Column(name="A_NAME", length=60)
	public String getAName() {
		return aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}

	@Basic
	@Column(name="A_STATE", length=40)
	public String getAState() {
		return aState;
	}

	public void setAState(String aState) {
		this.aState = aState;
	}

	@Basic
	@Column(name="A_STREET", length=60)
	public String getAStreet() {
		return aStreet;
	}

	public void setAStreet(String aStreet) {
		this.aStreet = aStreet;
	}

	@Basic
	@Column(name="A_ZIP", length=20)
	public String getAZip() {
		return aZip;
	}

	public void setAZip(String aZip) {
		this.aZip = aZip;
	}

	@Basic
	@Column(length=20)
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
	@Column(name="ISAPPROVED")
	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	@Basic
	@Column(length=40)
	public String getBPartnerValue() {
		return bPartnerValue;
	}

	public void setBPartnerValue(String bPartnerValue) {
		this.bPartnerValue = bPartnerValue;
	}

	@Basic
	@Column(length=20)
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
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
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT")
	public Integer getCBankAccountID() {
		return cBankAccountID;
	}

	public void setCBankAccountID(Integer cBankAccountID) {
		this.cBankAccountID = cBankAccountID;
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
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
	}

	@Basic
	@Column(name="C_INVOICE_ID", columnDefinition="INT")
	public Integer getCInvoiceID() {
		return cInvoiceID;
	}

	public void setCInvoiceID(Integer cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
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
	public BigDecimal getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(BigDecimal chargeAmt) {
		this.chargeAmt = chargeAmt;
	}

	@Basic
	@Column(length=60)
	public String getChargeName() {
		return chargeName;
	}

	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	@Basic
	@Column(length=20)
	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
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
	@Column(columnDefinition="INT")
	public Integer getCreditCardExpMM() {
		return creditCardExpMM;
	}

	public void setCreditCardExpMM(Integer creditCardExpMM) {
		this.creditCardExpMM = creditCardExpMM;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getCreditCardExpYY() {
		return creditCardExpYY;
	}

	public void setCreditCardExpYY(Integer creditCardExpYY) {
		this.creditCardExpYY = creditCardExpYY;
	}

	@Basic
	@Column(length=20)
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Basic
	@Column(length=1)
	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	@Basic
	@Column(length=4)
	public String getCreditCardVV() {
		return creditCardVV;
	}

	public void setCreditCardVV(String creditCardVV) {
		this.creditCardVV = creditCardVV;
	}

	@Basic
	public String getDateAcct() {
		return dateAcct;
	}

	public void setDateAcct(String dateAcct) {
		this.dateAcct = dateAcct;
	}

	@Basic
	public String getDateTrx() {
		return dateTrx;
	}

	public void setDateTrx(String dateTrx) {
		this.dateTrx = dateTrx;
	}

	@Basic
	@Column(name="ISDELAYEDCAPTURE")
	public Boolean isDelayedCapture() {
		return delayedCapture;
	}

	public void setDelayedCapture(Boolean delayedCapture) {
		this.delayedCapture = delayedCapture;
	}

	@Basic
	public BigDecimal getDiscountAmt() {
		return discountAmt;
	}

	public void setDiscountAmt(BigDecimal discountAmt) {
		this.discountAmt = discountAmt;
	}

	@Basic
	@Column(length=60)
	public String getDocTypeName() {
		return docTypeName;
	}

	public void setDocTypeName(String docTypeName) {
		this.docTypeName = docTypeName;
	}

	@Basic
	@Column(length=30)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
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
	@Column(name="I_PAYMENT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_752", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "I_Payment", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_752")
	public Integer getIPaymentID() {
		return iPaymentID;
	}

	public void setIPaymentID(Integer iPaymentID) {
		this.iPaymentID = iPaymentID;
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
	@Column(length=30)
	public String getInvoiceDocumentNo() {
		return invoiceDocumentNo;
	}

	public void setInvoiceDocumentNo(String invoiceDocumentNo) {
		this.invoiceDocumentNo = invoiceDocumentNo;
	}

	@Basic
	@Column(length=20)
	public String getMicr() {
		return micr;
	}

	public void setMicr(String micr) {
		this.micr = micr;
	}

	@Basic
	@Column(name="ORIG_TRXID", length=20)
	public String getOrigTrxID() {
		return origTrxID;
	}

	public void setOrigTrxID(String origTrxID) {
		this.origTrxID = origTrxID;
	}

	@Basic
	public BigDecimal getOverUnderAmt() {
		return overUnderAmt;
	}

	public void setOverUnderAmt(BigDecimal overUnderAmt) {
		this.overUnderAmt = overUnderAmt;
	}

	@Basic
	@Column(name="ISOVERUNDERPAYMENT")
	public Boolean isOverUnderPayment() {
		return overUnderPayment;
	}

	public void setOverUnderPayment(Boolean overUnderPayment) {
		this.overUnderPayment = overUnderPayment;
	}

	@Basic
	@Column(length=60)
	public String getPONum() {
		return pONum;
	}

	public void setPONum(String pONum) {
		this.pONum = pONum;
	}

	@Basic
	public BigDecimal getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
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
	@Column(name="R_AUTHCODE", length=20)
	public String getRAuthCode() {
		return rAuthCode;
	}

	public void setRAuthCode(String rAuthCode) {
		this.rAuthCode = rAuthCode;
	}

	@Basic
	@Column(name="R_INFO", length=2000)
	public String getRInfo() {
		return rInfo;
	}

	public void setRInfo(String rInfo) {
		this.rInfo = rInfo;
	}

	@Basic
	@Column(name="R_PNREF", length=20)
	public String getRPnRef() {
		return rPnRef;
	}

	public void setRPnRef(String rPnRef) {
		this.rPnRef = rPnRef;
	}

	@Basic
	@Column(name="R_RESPMSG", length=60)
	public String getRRespMsg() {
		return rRespMsg;
	}

	public void setRRespMsg(String rRespMsg) {
		this.rRespMsg = rRespMsg;
	}

	@Basic
	@Column(name="R_RESULT", length=20)
	public String getRResult() {
		return rResult;
	}

	public void setRResult(String rResult) {
		this.rResult = rResult;
	}

	@Basic
	@Column(name="ISRECEIPT")
	public Boolean isReceipt() {
		return receipt;
	}

	public void setReceipt(Boolean receipt) {
		this.receipt = receipt;
	}

	@Basic
	@Column(length=20)
	public String getRoutingNo() {
		return routingNo;
	}

	public void setRoutingNo(String routingNo) {
		this.routingNo = routingNo;
	}

	@Basic
	@Column(name="ISSELFSERVICE")
	public Boolean isSelfService() {
		return selfService;
	}

	public void setSelfService(Boolean selfService) {
		this.selfService = selfService;
	}

	@Basic
	@Column(length=80)
	public String getSwipe() {
		return swipe;
	}

	public void setSwipe(String swipe) {
		this.swipe = swipe;
	}

	@Basic
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Basic
	@Column(length=1)
	public String getTenderType() {
		return tenderType;
	}

	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}

	@Basic
	@Column(length=1)
	public String getTrxType() {
		return trxType;
	}

	public void setTrxType(String trxType) {
		this.trxType = trxType;
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
	@Column(length=20)
	public String getVoiceAuthCode() {
		return voiceAuthCode;
	}

	public void setVoiceAuthCode(String voiceAuthCode) {
		this.voiceAuthCode = voiceAuthCode;
	}

	@Basic
	public BigDecimal getWriteOffAmt() {
		return writeOffAmt;
	}

	public void setWriteOffAmt(BigDecimal writeOffAmt) {
		this.writeOffAmt = writeOffAmt;
	}
}