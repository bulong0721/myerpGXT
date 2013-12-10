package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_allocationline database table.
 * 
 */
@Entity
@Table(name="c_allocationline")
@NamedQuery(name="CAllocationline.findAll", query="SELECT c FROM CAllocationline c")
public class CAllocationline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAllocationlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal allocationno;
	private BigDecimal amount;
	private BigDecimal cAllocationhdrId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCashlineId;
	private BigDecimal cInvoiceId;
	private BigDecimal cOrderId;
	private BigDecimal cPaymentId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datetrx;
	private BigDecimal discountamt;
	private String isactive;
	private String ismanual;
	private BigDecimal overunderamt;
	private String posted;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal writeoffamt;

	public CAllocationline() {
	}


	@Id
	@Column(name="C_ALLOCATIONLINE_ID")
	public long getCAllocationlineId() {
		return this.cAllocationlineId;
	}

	public void setCAllocationlineId(long cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
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


	public BigDecimal getAllocationno() {
		return this.allocationno;
	}

	public void setAllocationno(BigDecimal allocationno) {
		this.allocationno = allocationno;
	}


	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	@Column(name="C_ALLOCATIONHDR_ID")
	public BigDecimal getCAllocationhdrId() {
		return this.cAllocationhdrId;
	}

	public void setCAllocationhdrId(BigDecimal cAllocationhdrId) {
		this.cAllocationhdrId = cAllocationhdrId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CASHLINE_ID")
	public BigDecimal getCCashlineId() {
		return this.cCashlineId;
	}

	public void setCCashlineId(BigDecimal cCashlineId) {
		this.cCashlineId = cCashlineId;
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
	public Date getDatetrx() {
		return this.datetrx;
	}

	public void setDatetrx(Date datetrx) {
		this.datetrx = datetrx;
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


	public String getIsmanual() {
		return this.ismanual;
	}

	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}


	public BigDecimal getOverunderamt() {
		return this.overunderamt;
	}

	public void setOverunderamt(BigDecimal overunderamt) {
		this.overunderamt = overunderamt;
	}


	public String getPosted() {
		return this.posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
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