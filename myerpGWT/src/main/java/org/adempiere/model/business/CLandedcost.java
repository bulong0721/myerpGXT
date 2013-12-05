package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_landedcost database table.
 * 
 */
@Entity
@Table(name="c_landedcost")
@NamedQuery(name="CLandedcost.findAll", query="SELECT c FROM CLandedcost c")
public class CLandedcost extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cLandedcostId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cInvoicelineId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String landedcostdistribution;
	private BigDecimal mCostelementId;
	private BigDecimal mInoutId;
	private BigDecimal mInoutlineId;
	private BigDecimal mProductId;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CLandedcost() {
	}


	@Id
	@Column(name="C_LANDEDCOST_ID")
	public long getCLandedcostId() {
		return this.cLandedcostId;
	}

	public void setCLandedcostId(long cLandedcostId) {
		this.cLandedcostId = cLandedcostId;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getLandedcostdistribution() {
		return this.landedcostdistribution;
	}

	public void setLandedcostdistribution(String landedcostdistribution) {
		this.landedcostdistribution = landedcostdistribution;
	}


	@Column(name="M_COSTELEMENT_ID")
	public BigDecimal getMCostelementId() {
		return this.mCostelementId;
	}

	public void setMCostelementId(BigDecimal mCostelementId) {
		this.mCostelementId = mCostelementId;
	}


	@Column(name="M_INOUT_ID")
	public BigDecimal getMInoutId() {
		return this.mInoutId;
	}

	public void setMInoutId(BigDecimal mInoutId) {
		this.mInoutId = mInoutId;
	}


	@Column(name="M_INOUTLINE_ID")
	public BigDecimal getMInoutlineId() {
		return this.mInoutlineId;
	}

	public void setMInoutlineId(BigDecimal mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
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