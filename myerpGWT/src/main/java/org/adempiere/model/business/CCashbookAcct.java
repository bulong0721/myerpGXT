package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_cashbook_acct database table.
 * 
 */
@Entity
@Table(name="c_cashbook_acct")
@NamedQuery(name="CCashbookAcct.findAll", query="SELECT c FROM CCashbookAcct c")
public class CCashbookAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CCashbookAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cbAssetAcct;
	private BigDecimal cbCashtransferAcct;
	private BigDecimal cbDifferencesAcct;
	private BigDecimal cbExpenseAcct;
	private BigDecimal cbReceiptAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCashbookAcct() {
	}


	@EmbeddedId
	public CCashbookAcctPK getId() {
		return this.id;
	}

	public void setId(CCashbookAcctPK id) {
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


	@Column(name="CB_ASSET_ACCT")
	public BigDecimal getCbAssetAcct() {
		return this.cbAssetAcct;
	}

	public void setCbAssetAcct(BigDecimal cbAssetAcct) {
		this.cbAssetAcct = cbAssetAcct;
	}


	@Column(name="CB_CASHTRANSFER_ACCT")
	public BigDecimal getCbCashtransferAcct() {
		return this.cbCashtransferAcct;
	}

	public void setCbCashtransferAcct(BigDecimal cbCashtransferAcct) {
		this.cbCashtransferAcct = cbCashtransferAcct;
	}


	@Column(name="CB_DIFFERENCES_ACCT")
	public BigDecimal getCbDifferencesAcct() {
		return this.cbDifferencesAcct;
	}

	public void setCbDifferencesAcct(BigDecimal cbDifferencesAcct) {
		this.cbDifferencesAcct = cbDifferencesAcct;
	}


	@Column(name="CB_EXPENSE_ACCT")
	public BigDecimal getCbExpenseAcct() {
		return this.cbExpenseAcct;
	}

	public void setCbExpenseAcct(BigDecimal cbExpenseAcct) {
		this.cbExpenseAcct = cbExpenseAcct;
	}


	@Column(name="CB_RECEIPT_ACCT")
	public BigDecimal getCbReceiptAcct() {
		return this.cbReceiptAcct;
	}

	public void setCbReceiptAcct(BigDecimal cbReceiptAcct) {
		this.cbReceiptAcct = cbReceiptAcct;
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