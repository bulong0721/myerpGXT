package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_paymentallocate database table.
 * 
 */
@Entity
@Table(name="c_paymentallocate")
@NamedQuery(name="CPaymentallocate.findAll", query="SELECT c FROM CPaymentallocate c")
public class CPaymentallocate extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPaymentallocateId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amount;
	private BigDecimal cAllocationlineId;
	private BigDecimal cInvoiceId;
	private BigDecimal cPaymentId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal discountamt;
	private BigDecimal invoiceamt;
	private String isactive;
	private BigDecimal overunderamt;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal writeoffamt;

	public CPaymentallocate() {
	}


	@Id
	@Column(name="C_PAYMENTALLOCATE_ID")
	public long getCPaymentallocateId() {
		return this.cPaymentallocateId;
	}

	public void setCPaymentallocateId(long cPaymentallocateId) {
		this.cPaymentallocateId = cPaymentallocateId;
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


	@Column(name="C_ALLOCATIONLINE_ID")
	public BigDecimal getCAllocationlineId() {
		return this.cAllocationlineId;
	}

	public void setCAllocationlineId(BigDecimal cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
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


	public BigDecimal getInvoiceamt() {
		return this.invoiceamt;
	}

	public void setInvoiceamt(BigDecimal invoiceamt) {
		this.invoiceamt = invoiceamt;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getOverunderamt() {
		return this.overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
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