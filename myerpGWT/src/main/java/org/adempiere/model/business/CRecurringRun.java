package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_recurring_run database table.
 * 
 */
@Entity
@Table(name="c_recurring_run")
@NamedQuery(name="CRecurringRun.findAll", query="SELECT c FROM CRecurringRun c")
public class CRecurringRun extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRecurringRunId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cInvoiceId;
	private BigDecimal cOrderId;
	private BigDecimal cPaymentId;
	private BigDecimal cProjectId;
	private BigDecimal cRecurringId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datedoc;
	private BigDecimal glJournalbatchId;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRecurringRun() {
	}


	@Id
	@Column(name="C_RECURRING_RUN_ID")
	public long getCRecurringRunId() {
		return this.cRecurringRunId;
	}

	public void setCRecurringRunId(long cRecurringRunId) {
		this.cRecurringRunId = cRecurringRunId;
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


	@Column(name="C_PAYMENT_ID")
	public BigDecimal getCPaymentId() {
		return this.cPaymentId;
	}

	public void setCPaymentId(BigDecimal cPaymentId) {
		this.cPaymentId = cPaymentId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_RECURRING_ID")
	public BigDecimal getCRecurringId() {
		return this.cRecurringId;
	}

	public void setCRecurringId(BigDecimal cRecurringId) {
		this.cRecurringId = cRecurringId;
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
	public Date getDatedoc() {
		return this.datedoc;
	}

	public void setDatedoc(Date datedoc) {
		this.datedoc = datedoc;
	}


	@Column(name="GL_JOURNALBATCH_ID")
	public BigDecimal getGlJournalbatchId() {
		return this.glJournalbatchId;
	}

	public void setGlJournalbatchId(BigDecimal glJournalbatchId) {
		this.glJournalbatchId = glJournalbatchId;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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