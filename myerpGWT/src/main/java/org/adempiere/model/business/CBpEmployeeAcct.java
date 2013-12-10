package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_employee_acct database table.
 * 
 */
@Entity
@Table(name="c_bp_employee_acct")
@NamedQuery(name="CBpEmployeeAcct.findAll", query="SELECT c FROM CBpEmployeeAcct c")
public class CBpEmployeeAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpEmployeeAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal eExpenseAcct;
	private BigDecimal ePrepaymentAcct;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpEmployeeAcct() {
	}


	@EmbeddedId
	public CBpEmployeeAcctPK getId() {
		return this.id;
	}

	public void setId(CBpEmployeeAcctPK id) {
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


	@Column(name="E_EXPENSE_ACCT")
	public BigDecimal getEExpenseAcct() {
		return this.eExpenseAcct;
	}

	public void setEExpenseAcct(BigDecimal eExpenseAcct) {
		this.eExpenseAcct = eExpenseAcct;
	}


	@Column(name="E_PREPAYMENT_ACCT")
	public BigDecimal getEPrepaymentAcct() {
		return this.ePrepaymentAcct;
	}

	public void setEPrepaymentAcct(BigDecimal ePrepaymentAcct) {
		this.ePrepaymentAcct = ePrepaymentAcct;
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