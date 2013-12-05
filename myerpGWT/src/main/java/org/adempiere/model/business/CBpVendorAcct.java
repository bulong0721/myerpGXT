package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_vendor_acct database table.
 * 
 */
@Entity
@Table(name="c_bp_vendor_acct")
@NamedQuery(name="CBpVendorAcct.findAll", query="SELECT c FROM CBpVendorAcct c")
public class CBpVendorAcct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpVendorAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal vLiabilityAcct;
	private BigDecimal vLiabilityServicesAcct;
	private BigDecimal vPrepaymentAcct;

	public CBpVendorAcct() {
	}


	@EmbeddedId
	public CBpVendorAcctPK getId() {
		return this.id;
	}

	public void setId(CBpVendorAcctPK id) {
		this.id = id;
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


	@Column(name="V_LIABILITY_ACCT")
	public BigDecimal getVLiabilityAcct() {
		return this.vLiabilityAcct;
	}

	public void setVLiabilityAcct(BigDecimal vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}


	@Column(name="V_LIABILITY_SERVICES_ACCT")
	public BigDecimal getVLiabilityServicesAcct() {
		return this.vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(BigDecimal vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}


	@Column(name="V_PREPAYMENT_ACCT")
	public BigDecimal getVPrepaymentAcct() {
		return this.vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(BigDecimal vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}

}