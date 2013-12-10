package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_customer_acct database table.
 * 
 */
@Entity
@Table(name="c_bp_customer_acct")
@NamedQuery(name="CBpCustomerAcct.findAll", query="SELECT c FROM CBpCustomerAcct c")
public class CBpCustomerAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpCustomerAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cPrepaymentAcct;
	private BigDecimal cReceivableAcct;
	private BigDecimal cReceivableServicesAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpCustomerAcct() {
	}


	@EmbeddedId
	public CBpCustomerAcctPK getId() {
		return this.id;
	}

	public void setId(CBpCustomerAcctPK id) {
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


	@Column(name="C_PREPAYMENT_ACCT")
	public BigDecimal getCPrepaymentAcct() {
		return this.cPrepaymentAcct;
	}

	public void setCPrepaymentAcct(BigDecimal cPrepaymentAcct) {
		this.cPrepaymentAcct = cPrepaymentAcct;
	}


	@Column(name="C_RECEIVABLE_ACCT")
	public BigDecimal getCReceivableAcct() {
		return this.cReceivableAcct;
	}

	public void setCReceivableAcct(BigDecimal cReceivableAcct) {
		this.cReceivableAcct = cReceivableAcct;
	}


	@Column(name="C_RECEIVABLE_SERVICES_ACCT")
	public BigDecimal getCReceivableServicesAcct() {
		return this.cReceivableServicesAcct;
	}

	public void setCReceivableServicesAcct(BigDecimal cReceivableServicesAcct) {
		this.cReceivableServicesAcct = cReceivableServicesAcct;
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

}