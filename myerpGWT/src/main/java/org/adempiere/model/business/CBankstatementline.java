package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_bankstatementline database table.
 * 
 */
@Entity
@Table(name="c_bankstatementline")
@NamedQuery(name="CBankstatementline.findAll", query="SELECT c FROM CBankstatementline c")
public class CBankstatementline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankstatementlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBankstatementId;
	private BigDecimal cBpartnerId;
	private BigDecimal cChargeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cInvoiceId;
	private BigDecimal cPaymentId;
	private BigDecimal chargeamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String createpayment;
	private Date dateacct;
	private String description;
	private BigDecimal eftamt;
	private String eftcheckno;
	private String eftcurrency;
	private String eftmemo;
	private String eftpayee;
	private String eftpayeeaccount;
	private String eftreference;
	private Date eftstatementlinedate;
	private String efttrxid;
	private String efttrxtype;
	private Date eftvalutadate;
	private BigDecimal interestamt;
	private String isactive;
	private String ismanual;
	private String isreversal;
	private BigDecimal line;
	private String matchstatement;
	private String memo;
	private String processed;
	private String referenceno;
	private Date statementlinedate;
	private BigDecimal stmtamt;
	private BigDecimal trxamt;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date valutadate;

	public CBankstatementline() {
	}


	@Id
	@Column(name="C_BANKSTATEMENTLINE_ID")
	public long getCBankstatementlineId() {
		return this.cBankstatementlineId;
	}

	public void setCBankstatementlineId(long cBankstatementlineId) {
		this.cBankstatementlineId = cBankstatementlineId;
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


	@Column(name="C_BANKSTATEMENT_ID")
	public BigDecimal getCBankstatementId() {
		return this.cBankstatementId;
	}

	public void setCBankstatementId(BigDecimal cBankstatementId) {
		this.cBankstatementId = cBankstatementId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_PAYMENT_ID")
	public BigDecimal getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(BigDecimal cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	public BigDecimal getChargeamt() {
		return this.chargeamt;
	}

	public void setChargeamt(BigDecimal chargeamt) {
		this.chargeamt = chargeamt;
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


	public String getCreatepayment() {
		return this.createpayment;
	}

	public void setCreatepayment(String createpayment) {
		this.createpayment = createpayment;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getEftamt() {
		return this.eftamt;
	}

	public void setEftamt(BigDecimal eftamt) {
		this.eftamt = eftamt;
	}


	public String getEftcheckno() {
		return this.eftcheckno;
	}

	public void setEftcheckno(String eftcheckno) {
		this.eftcheckno = eftcheckno;
	}


	public String getEftcurrency() {
		return this.eftcurrency;
	}

	public void setEftcurrency(String eftcurrency) {
		this.eftcurrency = eftcurrency;
	}


	public String getEftmemo() {
		return this.eftmemo;
	}

	public void setEftmemo(String eftmemo) {
		this.eftmemo = eftmemo;
	}


	public String getEftpayee() {
		return this.eftpayee;
	}

	public void setEftpayee(String eftpayee) {
		this.eftpayee = eftpayee;
	}


	public String getEftpayeeaccount() {
		return this.eftpayeeaccount;
	}

	public void setEftpayeeaccount(String eftpayeeaccount) {
		this.eftpayeeaccount = eftpayeeaccount;
	}


	public String getEftreference() {
		return this.eftreference;
	}

	public void setEftreference(String eftreference) {
		this.eftreference = eftreference;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEftstatementlinedate() {
		return this.eftstatementlinedate;
	}

	public void setEftstatementlinedate(Date eftstatementlinedate) {
		this.eftstatementlinedate = eftstatementlinedate;
	}


	public String getEfttrxid() {
		return this.efttrxid;
	}

	public void setEfttrxid(String efttrxid) {
		this.efttrxid = efttrxid;
	}


	public String getEfttrxtype() {
		return this.efttrxtype;
	}

	public void setEfttrxtype(String efttrxtype) {
		this.efttrxtype = efttrxtype;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEftvalutadate() {
		return this.eftvalutadate;
	}

	public void setEftvalutadate(Date eftvalutadate) {
		this.eftvalutadate = eftvalutadate;
	}


	public BigDecimal getInterestamt() {
		return this.interestamt;
	}

	public void setInterestamt(BigDecimal interestamt) {
		this.interestamt = interestamt;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsmanual() {
		return this.ismanual;
	}

	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}


	public String getIsreversal() {
		return this.isreversal;
	}

	public void setIsreversal(String isreversal) {
		this.isreversal = isreversal;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public String getMatchstatement() {
		return this.matchstatement;
	}

	public void setMatchstatement(String matchstatement) {
		this.matchstatement = matchstatement;
	}


	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getReferenceno() {
		return this.referenceno;
	}

	public void setReferenceno(String referenceno) {
		this.referenceno = referenceno;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStatementlinedate() {
		return this.statementlinedate;
	}

	public void setStatementlinedate(Date statementlinedate) {
		this.statementlinedate = statementlinedate;
	}


	public BigDecimal getStmtamt() {
		return this.stmtamt;
	}

	public void setStmtamt(BigDecimal stmtamt) {
		this.stmtamt = stmtamt;
	}


	public BigDecimal getTrxamt() {
		return this.trxamt;
	}

	public void setTrxamt(BigDecimal trxamt) {
		this.trxamt = trxamt;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValutadate() {
		return this.valutadate;
	}

	public void setValutadate(Date valutadate) {
		this.valutadate = valutadate;
	}

}