package org.adempiere.model.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.adempiere.model.common.AdEntityBase;


/**
 * The persistent class for the M_RMALINE database table.
 * 
 */
@Entity
@Table(name="M_RMALINE")
public class MRmaline extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long mRmalineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amt;
	private BigDecimal cChargeId;
	private Date created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private BigDecimal line;
	private BigDecimal linenetamt;
	private BigDecimal mInoutlineId;
	private BigDecimal mRmaId;
	private String processed;
	private BigDecimal qty;
	private BigDecimal qtydelivered;
	private BigDecimal qtyinvoiced;
	private BigDecimal refRmalineId;
	private Date updated;
	private BigDecimal updatedby;

	public MRmaline() {
	}


	@Id
	@Column(name="M_RMALINE_ID")
	public long getMRmalineId() {
		return this.mRmalineId;
	}

	public void setMRmalineId(long mRmalineId) {
		this.mRmalineId = mRmalineId;
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


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Temporal(TemporalType.DATE)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public BigDecimal getLinenetamt() {
		return this.linenetamt;
	}

	public void setLinenetamt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}


	@Column(name="M_INOUTLINE_ID")
	public BigDecimal getMInoutlineId() {
		return this.mInoutlineId;
	}

	public void setMInoutlineId(BigDecimal mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}


	@Column(name="M_RMA_ID")
	public BigDecimal getMRmaId() {
		return this.mRmaId;
	}

	public void setMRmaId(BigDecimal mRmaId) {
		this.mRmaId = mRmaId;
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


	public BigDecimal getQtydelivered() {
		return this.qtydelivered;
	}

	public void setQtydelivered(BigDecimal qtydelivered) {
		this.qtydelivered = qtydelivered;
	}


	public BigDecimal getQtyinvoiced() {
		return this.qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}


	@Column(name="REF_RMALINE_ID")
	public BigDecimal getRefRmalineId() {
		return this.refRmalineId;
	}

	public void setRefRmalineId(BigDecimal refRmalineId) {
		this.refRmalineId = refRmalineId;
	}


	@Temporal(TemporalType.DATE)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}