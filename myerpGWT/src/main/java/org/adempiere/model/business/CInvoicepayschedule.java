package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_invoicepayschedule database table.
 * 
 */
@Entity
@Table(name="c_invoicepayschedule")
@NamedQuery(name="CInvoicepayschedule.findAll", query="SELECT c FROM CInvoicepayschedule c")
public class CInvoicepayschedule extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoicepayscheduleId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cInvoiceId;
	private BigDecimal cPayscheduleId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal discountamt;
	private Date discountdate;
	private BigDecimal dueamt;
	private Date duedate;
	private String isactive;
	private String isvalid;
	private String processed;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CInvoicepayschedule() {
	}


	@Id
	@Column(name="C_INVOICEPAYSCHEDULE_ID")
	public long getCInvoicepayscheduleId() {
		return this.cInvoicepayscheduleId;
	}

	public void setCInvoicepayscheduleId(long cInvoicepayscheduleId) {
		this.cInvoicepayscheduleId = cInvoicepayscheduleId;
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


	@Column(name="C_PAYSCHEDULE_ID")
	public BigDecimal getCPayscheduleId() {
		return this.cPayscheduleId;
	}

	public void setCPayscheduleId(BigDecimal cPayscheduleId) {
		this.cPayscheduleId = cPayscheduleId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDiscountdate() {
		return this.discountdate;
	}

	public void setDiscountdate(Date discountdate) {
		this.discountdate = discountdate;
	}


	public BigDecimal getDueamt() {
		return this.dueamt;
	}

	public void setDueamt(BigDecimal dueamt) {
		this.dueamt = dueamt;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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