package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_tax_acct database table.
 * 
 */
@Entity
@Table(name="c_tax_acct")
@NamedQuery(name="CTaxAcct.findAll", query="SELECT c FROM CTaxAcct c")
public class CTaxAcct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CTaxAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal tCreditAcct;
	private BigDecimal tDueAcct;
	private BigDecimal tExpenseAcct;
	private BigDecimal tLiabilityAcct;
	private BigDecimal tReceivablesAcct;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CTaxAcct() {
	}


	@EmbeddedId
	public CTaxAcctPK getId() {
		return this.id;
	}

	public void setId(CTaxAcctPK id) {
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


	@Column(name="T_CREDIT_ACCT")
	public BigDecimal getTCreditAcct() {
		return this.tCreditAcct;
	}

	public void setTCreditAcct(BigDecimal tCreditAcct) {
		this.tCreditAcct = tCreditAcct;
	}


	@Column(name="T_DUE_ACCT")
	public BigDecimal getTDueAcct() {
		return this.tDueAcct;
	}

	public void setTDueAcct(BigDecimal tDueAcct) {
		this.tDueAcct = tDueAcct;
	}


	@Column(name="T_EXPENSE_ACCT")
	public BigDecimal getTExpenseAcct() {
		return this.tExpenseAcct;
	}

	public void setTExpenseAcct(BigDecimal tExpenseAcct) {
		this.tExpenseAcct = tExpenseAcct;
	}


	@Column(name="T_LIABILITY_ACCT")
	public BigDecimal getTLiabilityAcct() {
		return this.tLiabilityAcct;
	}

	public void setTLiabilityAcct(BigDecimal tLiabilityAcct) {
		this.tLiabilityAcct = tLiabilityAcct;
	}


	@Column(name="T_RECEIVABLES_ACCT")
	public BigDecimal getTReceivablesAcct() {
		return this.tReceivablesAcct;
	}

	public void setTReceivablesAcct(BigDecimal tReceivablesAcct) {
		this.tReceivablesAcct = tReceivablesAcct;
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