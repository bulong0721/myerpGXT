package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_landedcostallocation database table.
 * 
 */
@Entity
@Table(name="c_landedcostallocation")
@NamedQuery(name="CLandedcostallocation.findAll", query="SELECT c FROM CLandedcostallocation c")
public class CLandedcostallocation extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cLandedcostallocationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amt;
	private BigDecimal base;
	private BigDecimal cInvoicelineId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal mAttributesetinstanceId;
	private BigDecimal mCostelementId;
	private BigDecimal mProductId;
	private BigDecimal qty;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CLandedcostallocation() {
	}


	@Id
	@Column(name="C_LANDEDCOSTALLOCATION_ID")
	public long getCLandedcostallocationId() {
		return this.cLandedcostallocationId;
	}

	public void setCLandedcostallocationId(long cLandedcostallocationId) {
		this.cLandedcostallocationId = cLandedcostallocationId;
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


	public BigDecimal getBase() {
		return this.base;
	}

	public void setBase(BigDecimal base) {
		this.base = base;
	}


	@Column(name="C_INVOICELINE_ID")
	public BigDecimal getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(BigDecimal cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
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


	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public BigDecimal getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}


	@Column(name="M_COSTELEMENT_ID")
	public BigDecimal getMCostelementId() {
		return this.mCostelementId;
	}

	public void setMCostelementId(BigDecimal mCostelementId) {
		this.mCostelementId = mCostelementId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
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