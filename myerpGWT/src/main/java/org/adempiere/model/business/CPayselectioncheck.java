package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_payselectioncheck database table.
 * 
 */
@Entity
@Table(name="c_payselectioncheck")
@NamedQuery(name="CPayselectioncheck.findAll", query="SELECT c FROM CPayselectioncheck c")
public class CPayselectioncheck extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPayselectioncheckId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpBankaccountId;
	private BigDecimal cBpartnerId;
	private BigDecimal cPaymentId;
	private BigDecimal cPayselectionId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal discountamt;
	private String documentno;
	private String isactive;
	private String isgenerateddraft;
	private String isprinted;
	private String isreceipt;
	private BigDecimal payamt;
	private String paymentrule;
	private String processed;
	private BigDecimal qty;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPayselectioncheck() {
	}


	@Id
	@Column(name="C_PAYSELECTIONCHECK_ID")
	public long getCPayselectioncheckId() {
		return this.cPayselectioncheckId;
	}

	public void setCPayselectioncheckId(long cPayselectioncheckId) {
		this.cPayselectioncheckId = cPayselectioncheckId;
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


	@Column(name="C_PAYMENT_ID")
	public BigDecimal getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(BigDecimal cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	@Column(name="C_PAYSELECTION_ID")
	public BigDecimal getCPayselectionId() {
		return this.cPayselectionId;
	}

	public void setCPayselectionId(BigDecimal cPayselectionId) {
		this.cPayselectionId = cPayselectionId;
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


	public BigDecimal getDiscountamt() {
		return this.discountamt;
	}

	public void setDiscountamt(BigDecimal discountamt) {
		this.discountamt = discountamt;
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


	public String getIsgenerateddraft() {
		return this.isgenerateddraft;
	}

	public void setIsgenerateddraft(String isgenerateddraft) {
		this.isgenerateddraft = isgenerateddraft;
	}


	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}


	public String getIsreceipt() {
		return this.isreceipt;
	}

	public void setIsreceipt(String isreceipt) {
		this.isreceipt = isreceipt;
	}


	public BigDecimal getPayamt() {
		return this.payamt;
	}

	public void setPayamt(BigDecimal payamt) {
		this.payamt = payamt;
	}


	public String getPaymentrule() {
		return this.paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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

}