package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_payselectionline database table.
 * 
 */
@Entity
@Table(name="c_payselectionline")
@NamedQuery(name="CPayselectionline.findAll", query="SELECT c FROM CPayselectionline c")
public class CPayselectionline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPayselectionlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cInvoiceId;
	private BigDecimal cPayselectionId;
	private BigDecimal cPayselectioncheckId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal differenceamt;
	private BigDecimal discountamt;
	private String isactive;
	private String ismanual;
	private String issotrx;
	private BigDecimal line;
	private BigDecimal openamt;
	private BigDecimal payamt;
	private String paymentrule;
	private String processed;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPayselectionline() {
	}


	@Id
	@Column(name="C_PAYSELECTIONLINE_ID")
	public long getCPayselectionlineId() {
		return this.cPayselectionlineId;
	}

	public void setCPayselectionlineId(long cPayselectionlineId) {
		this.cPayselectionlineId = cPayselectionlineId;
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


	@Column(name="C_PAYSELECTION_ID")
	public BigDecimal getCPayselectionId() {
		return this.cPayselectionId;
	}

	public void setCPayselectionId(BigDecimal cPayselectionId) {
		this.cPayselectionId = cPayselectionId;
	}


	@Column(name="C_PAYSELECTIONCHECK_ID")
	public BigDecimal getCPayselectioncheckId() {
		return this.cPayselectioncheckId;
	}

	public void setCPayselectioncheckId(BigDecimal cPayselectioncheckId) {
		this.cPayselectioncheckId = cPayselectioncheckId;
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


	public BigDecimal getDifferenceamt() {
		return this.differenceamt;
	}

	public void setDifferenceamt(BigDecimal differenceamt) {
		this.differenceamt = differenceamt;
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


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public BigDecimal getOpenamt() {
		return this.openamt;
	}

	public void setOpenamt(BigDecimal openamt) {
		this.openamt = openamt;
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