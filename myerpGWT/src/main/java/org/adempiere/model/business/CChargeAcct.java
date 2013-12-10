package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_charge_acct database table.
 * 
 */
@Entity
@Table(name="c_charge_acct")
@NamedQuery(name="CChargeAcct.findAll", query="SELECT c FROM CChargeAcct c")
public class CChargeAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CChargeAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal chExpenseAcct;
	private BigDecimal chRevenueAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CChargeAcct() {
	}


	@EmbeddedId
	public CChargeAcctPK getId() {
		return this.id;
	}

	public void setId(CChargeAcctPK id) {
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


	@Column(name="CH_EXPENSE_ACCT")
	public BigDecimal getChExpenseAcct() {
		return this.chExpenseAcct;
	}

	public void setChExpenseAcct(BigDecimal chExpenseAcct) {
		this.chExpenseAcct = chExpenseAcct;
	}


	@Column(name="CH_REVENUE_ACCT")
	public BigDecimal getChRevenueAcct() {
		return this.chRevenueAcct;
	}

	public void setChRevenueAcct(BigDecimal chRevenueAcct) {
		this.chRevenueAcct = chRevenueAcct;
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