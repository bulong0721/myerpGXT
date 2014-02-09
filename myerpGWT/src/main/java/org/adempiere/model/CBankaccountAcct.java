package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bankaccount_acct")
@IdClass(org.adempiere.model.CBankaccountAcctPK.class)
public class CBankaccountAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer bAssetAcct;
	private Integer bExpenseAcct;
	private Integer bInterestexpAcct;
	private Integer bInterestrevAcct;
	private Integer bIntransitAcct;
	private Integer bPaymentselectAcct;
	private Integer bRevaluationgainAcct;
	private Integer bRevaluationlossAcct;
	private Integer bSettlementgainAcct;
	private Integer bSettlementlossAcct;
	private Integer bUnallocatedcashAcct;
	private Integer bUnidentifiedAcct;
	private Integer cAcctschemaId;
	private Integer cBankaccountId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;

	public CBankaccountAcct() {
	}

	public CBankaccountAcct(Integer cAcctschemaId, Integer cBankaccountId) {
		this.cAcctschemaId = cAcctschemaId;
		this.cBankaccountId = cBankaccountId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="B_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBAssetAcct() {
		return bAssetAcct;
	}

	public void setBAssetAcct(Integer bAssetAcct) {
		this.bAssetAcct = bAssetAcct;
	}

	@Basic
	@Column(name="B_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBExpenseAcct() {
		return bExpenseAcct;
	}

	public void setBExpenseAcct(Integer bExpenseAcct) {
		this.bExpenseAcct = bExpenseAcct;
	}

	@Basic
	@Column(name="B_INTERESTEXP_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBInterestexpAcct() {
		return bInterestexpAcct;
	}

	public void setBInterestexpAcct(Integer bInterestexpAcct) {
		this.bInterestexpAcct = bInterestexpAcct;
	}

	@Basic
	@Column(name="B_INTERESTREV_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBInterestrevAcct() {
		return bInterestrevAcct;
	}

	public void setBInterestrevAcct(Integer bInterestrevAcct) {
		this.bInterestrevAcct = bInterestrevAcct;
	}

	@Basic
	@Column(name="B_INTRANSIT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBIntransitAcct() {
		return bIntransitAcct;
	}

	public void setBIntransitAcct(Integer bIntransitAcct) {
		this.bIntransitAcct = bIntransitAcct;
	}

	@Basic
	@Column(name="B_PAYMENTSELECT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBPaymentselectAcct() {
		return bPaymentselectAcct;
	}

	public void setBPaymentselectAcct(Integer bPaymentselectAcct) {
		this.bPaymentselectAcct = bPaymentselectAcct;
	}

	@Basic
	@Column(name="B_REVALUATIONGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBRevaluationgainAcct() {
		return bRevaluationgainAcct;
	}

	public void setBRevaluationgainAcct(Integer bRevaluationgainAcct) {
		this.bRevaluationgainAcct = bRevaluationgainAcct;
	}

	@Basic
	@Column(name="B_REVALUATIONLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBRevaluationlossAcct() {
		return bRevaluationlossAcct;
	}

	public void setBRevaluationlossAcct(Integer bRevaluationlossAcct) {
		this.bRevaluationlossAcct = bRevaluationlossAcct;
	}

	@Basic
	@Column(name="B_SETTLEMENTGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBSettlementgainAcct() {
		return bSettlementgainAcct;
	}

	public void setBSettlementgainAcct(Integer bSettlementgainAcct) {
		this.bSettlementgainAcct = bSettlementgainAcct;
	}

	@Basic
	@Column(name="B_SETTLEMENTLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBSettlementlossAcct() {
		return bSettlementlossAcct;
	}

	public void setBSettlementlossAcct(Integer bSettlementlossAcct) {
		this.bSettlementlossAcct = bSettlementlossAcct;
	}

	@Basic
	@Column(name="B_UNALLOCATEDCASH_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBUnallocatedcashAcct() {
		return bUnallocatedcashAcct;
	}

	public void setBUnallocatedcashAcct(Integer bUnallocatedcashAcct) {
		this.bUnallocatedcashAcct = bUnallocatedcashAcct;
	}

	@Basic
	@Column(name="B_UNIDENTIFIED_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBUnidentifiedAcct() {
		return bUnidentifiedAcct;
	}

	public void setBUnidentifiedAcct(Integer bUnidentifiedAcct) {
		this.bUnidentifiedAcct = bUnidentifiedAcct;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Id
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT")
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}