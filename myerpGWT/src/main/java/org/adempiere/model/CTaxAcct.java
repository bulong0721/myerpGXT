package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_tax_acct")
@IdClass(org.adempiere.model.CTaxAcctPK.class)
public class CTaxAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cTaxId;
	private String created;
	private Integer createdby;
	private String isactive;
	private Integer tCreditAcct;
	private Integer tDueAcct;
	private Integer tExpenseAcct;
	private Integer tLiabilityAcct;
	private Integer tReceivablesAcct;
	private String updated;
	private Integer updatedby;

	public CTaxAcct() {
	}

	public CTaxAcct(Integer cAcctschemaId, Integer cTaxId) {
		this.cAcctschemaId = cAcctschemaId;
		this.cTaxId = cTaxId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Id
	@Column(name="C_TAX_ID")
	public Integer getCTaxId() {
		return cTaxId;
	}

	public void setCTaxId(Integer cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="T_CREDIT_ACCT", nullable=false)
	public Integer getTCreditAcct() {
		return tCreditAcct;
	}

	public void setTCreditAcct(Integer tCreditAcct) {
		this.tCreditAcct = tCreditAcct;
	}

	@Basic
	@Column(name="T_DUE_ACCT", nullable=false)
	public Integer getTDueAcct() {
		return tDueAcct;
	}

	public void setTDueAcct(Integer tDueAcct) {
		this.tDueAcct = tDueAcct;
	}

	@Basic
	@Column(name="T_EXPENSE_ACCT", nullable=false)
	public Integer getTExpenseAcct() {
		return tExpenseAcct;
	}

	public void setTExpenseAcct(Integer tExpenseAcct) {
		this.tExpenseAcct = tExpenseAcct;
	}

	@Basic
	@Column(name="T_LIABILITY_ACCT", nullable=false)
	public Integer getTLiabilityAcct() {
		return tLiabilityAcct;
	}

	public void setTLiabilityAcct(Integer tLiabilityAcct) {
		this.tLiabilityAcct = tLiabilityAcct;
	}

	@Basic
	@Column(name="T_RECEIVABLES_ACCT", nullable=false)
	public Integer getTReceivablesAcct() {
		return tReceivablesAcct;
	}

	public void setTReceivablesAcct(Integer tReceivablesAcct) {
		this.tReceivablesAcct = tReceivablesAcct;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}