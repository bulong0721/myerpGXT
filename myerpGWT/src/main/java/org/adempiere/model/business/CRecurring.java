package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_recurring database table.
 * 
 */
@Entity
@Table(name="c_recurring")
@NamedQuery(name="CRecurring.findAll", query="SELECT c FROM CRecurring c")
public class CRecurring extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRecurringId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cInvoiceId;
	private BigDecimal cOrderId;
	private BigDecimal cPaymentId;
	private BigDecimal cProjectId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datelastrun;
	private Date datenextrun;
	private String description;
	private BigDecimal frequency;
	private String frequencytype;
	private BigDecimal glJournalbatchId;
	private String help;
	private String isactive;
	private String name;
	private String processing;
	private String recurringtype;
	private BigDecimal runsmax;
	private BigDecimal runsremaining;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRecurring() {
	}


	@Id
	@Column(name="C_RECURRING_ID")
	public long getCRecurringId() {
		return this.cRecurringId;
	}

	public void setCRecurringId(long cRecurringId) {
		this.cRecurringId = cRecurringId;
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
	public Date getDatelastrun() {
		return this.datelastrun;
	}

	public void setDatelastrun(Date datelastrun) {
		this.datelastrun = datelastrun;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatenextrun() {
		return this.datenextrun;
	}

	public void setDatenextrun(Date datenextrun) {
		this.datenextrun = datenextrun;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}


	public String getFrequencytype() {
		return this.frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
	}


	@Column(name="GL_JOURNALBATCH_ID")
	public BigDecimal getGlJournalbatchId() {
		return this.glJournalbatchId;
	}

	public void setGlJournalbatchId(BigDecimal glJournalbatchId) {
		this.glJournalbatchId = glJournalbatchId;
	}


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public String getRecurringtype() {
		return this.recurringtype;
	}

	public void setRecurringtype(String recurringtype) {
		this.recurringtype = recurringtype;
	}


	public BigDecimal getRunsmax() {
		return this.runsmax;
	}

	public void setRunsmax(BigDecimal runsmax) {
		this.runsmax = runsmax;
	}


	public BigDecimal getRunsremaining() {
		return this.runsremaining;
	}

	public void setRunsremaining(BigDecimal runsremaining) {
		this.runsremaining = runsremaining;
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