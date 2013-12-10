package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_cashline database table.
 * 
 */
@Entity
@Table(name="c_cashline")
@NamedQuery(name="CCashline.findAll", query="SELECT c FROM CCashline c")
public class CCashline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCashlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amount;
	private BigDecimal cBankaccountId;
	private BigDecimal cCashId;
	private BigDecimal cChargeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cInvoiceId;
	private BigDecimal cPaymentId;
	private String cashtype;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal discountamt;
	private String isactive;
	private String isgenerated;
	private BigDecimal line;
	private String processed;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal writeoffamt;

	public CCashline() {
	}


	@Id
	@Column(name="C_CASHLINE_ID")
	public long getCCashlineId() {
		return this.cCashlineId;
	}

	public void setCCashlineId(long cCashlineId) {
		this.cCashlineId = cCashlineId;
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


	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}


	@Column(name="C_CASH_ID")
	public BigDecimal getCCashId() {
		return this.cCashId;
	}

	public void setCCashId(BigDecimal cCashId) {
		this.cCashId = cCashId;
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


	public String getCashtype() {
		return this.cashtype;
	}

	public void setCashtype(String cashtype) {
		this.cashtype = cashtype;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsgenerated() {
		return this.isgenerated;
	}

	public void setIsgenerated(String isgenerated) {
		this.isgenerated = isgenerated;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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


	public BigDecimal getWriteoffamt() {
		return this.writeoffamt;
	}

	public void setWriteoffamt(BigDecimal writeoffamt) {
		this.writeoffamt = writeoffamt;
	}

}