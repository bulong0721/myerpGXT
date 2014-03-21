package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_cashbook_acct")
@IdClass(org.adempiere.model.CCashBookAcctPK.class)
public class CCashBookAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cAcctSchemaID;
	private Integer cBAssetAcct;
	private Integer cBCashTransferAcct;
	private Integer cBDifferencesAcct;
	private Integer cBExpenseAcct;
	private Integer cBReceiptAcct;
	private Integer cCashBookID;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public CCashBookAcct() {
	}

	public CCashBookAcct(Integer cAcctSchemaID, Integer cCashBookID) {
		this.cAcctSchemaID = cAcctSchemaID;
		this.cCashBookID = cCashBookID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	@Basic
	@Column(name="CB_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBAssetAcct() {
		return cBAssetAcct;
	}

	public void setCBAssetAcct(Integer cBAssetAcct) {
		this.cBAssetAcct = cBAssetAcct;
	}

	@Basic
	@Column(name="CB_CASHTRANSFER_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBCashTransferAcct() {
		return cBCashTransferAcct;
	}

	public void setCBCashTransferAcct(Integer cBCashTransferAcct) {
		this.cBCashTransferAcct = cBCashTransferAcct;
	}

	@Basic
	@Column(name="CB_DIFFERENCES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBDifferencesAcct() {
		return cBDifferencesAcct;
	}

	public void setCBDifferencesAcct(Integer cBDifferencesAcct) {
		this.cBDifferencesAcct = cBDifferencesAcct;
	}

	@Basic
	@Column(name="CB_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBExpenseAcct() {
		return cBExpenseAcct;
	}

	public void setCBExpenseAcct(Integer cBExpenseAcct) {
		this.cBExpenseAcct = cBExpenseAcct;
	}

	@Basic
	@Column(name="CB_RECEIPT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBReceiptAcct() {
		return cBReceiptAcct;
	}

	public void setCBReceiptAcct(Integer cBReceiptAcct) {
		this.cBReceiptAcct = cBReceiptAcct;
	}

	@Id
	@Column(name="C_CASHBOOK_ID", columnDefinition="INT")
	public Integer getCCashBookID() {
		return cCashBookID;
	}

	public void setCCashBookID(Integer cCashBookID) {
		this.cCashBookID = cCashBookID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}