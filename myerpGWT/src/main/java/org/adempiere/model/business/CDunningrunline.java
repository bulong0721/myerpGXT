package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_dunningrunline database table.
 * 
 */
@Entity
@Table(name="c_dunningrunline")
@NamedQuery(name="CDunningrunline.findAll", query="SELECT c FROM CDunningrunline c")
public class CDunningrunline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDunningrunlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amt;
	private BigDecimal cDunningrunentryId;
	private BigDecimal cInvoiceId;
	private BigDecimal cInvoicepayscheduleId;
	private BigDecimal cPaymentId;
	private BigDecimal convertedamt;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal daysdue;
	private BigDecimal feeamt;
	private BigDecimal interestamt;
	private String isactive;
	private String isindispute;
	private BigDecimal openamt;
	private String processed;
	private BigDecimal timesdunned;
	private BigDecimal totalamt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDunningrunline() {
	}


	@Id
	@Column(name="C_DUNNINGRUNLINE_ID")
	public long getCDunningrunlineId() {
		return this.cDunningrunlineId;
	}

	public void setCDunningrunlineId(long cDunningrunlineId) {
		this.cDunningrunlineId = cDunningrunlineId;
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


	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}


	@Column(name="C_DUNNINGRUNENTRY_ID")
	public BigDecimal getCDunningrunentryId() {
		return this.cDunningrunentryId;
	}

	public void setCDunningrunentryId(BigDecimal cDunningrunentryId) {
		this.cDunningrunentryId = cDunningrunentryId;
	}


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_INVOICEPAYSCHEDULE_ID")
	public BigDecimal getCInvoicepayscheduleId() {
		return this.cInvoicepayscheduleId;
	}

	public void setCInvoicepayscheduleId(BigDecimal cInvoicepayscheduleId) {
		this.cInvoicepayscheduleId = cInvoicepayscheduleId;
	}


	@Column(name="C_PAYMENT_ID")
	public BigDecimal getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(BigDecimal cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	public BigDecimal getConvertedamt() {
		return this.convertedamt;
	}

	public void setConvertedamt(BigDecimal convertedamt) {
		this.convertedamt = convertedamt;
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


	public BigDecimal getDaysdue() {
		return this.daysdue;
	}

	public void setDaysdue(BigDecimal daysdue) {
		this.daysdue = daysdue;
	}


	public BigDecimal getFeeamt() {
		return this.feeamt;
	}

	public void setFeeamt(BigDecimal feeamt) {
		this.feeamt = feeamt;
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


	public String getIsindispute() {
		return this.isindispute;
	}

	public void setIsindispute(String isindispute) {
		this.isindispute = isindispute;
	}


	public BigDecimal getOpenamt() {
		return this.openamt;
	}

	public void setOpenamt(BigDecimal openamt) {
		this.openamt = openamt;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getTimesdunned() {
		return this.timesdunned;
	}

	public void setTimesdunned(BigDecimal timesdunned) {
		this.timesdunned = timesdunned;
	}


	public BigDecimal getTotalamt() {
		return this.totalamt;
	}

	public void setTotalamt(BigDecimal totalamt) {
		this.totalamt = totalamt;
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