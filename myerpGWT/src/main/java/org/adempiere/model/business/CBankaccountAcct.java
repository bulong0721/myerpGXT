package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bankaccount_acct database table.
 * 
 */
@Entity
@Table(name="c_bankaccount_acct")
@NamedQuery(name="CBankaccountAcct.findAll", query="SELECT c FROM CBankaccountAcct c")
public class CBankaccountAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBankaccountAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal bAssetAcct;
	private BigDecimal bExpenseAcct;
	private BigDecimal bInterestexpAcct;
	private BigDecimal bInterestrevAcct;
	private BigDecimal bIntransitAcct;
	private BigDecimal bPaymentselectAcct;
	private BigDecimal bRevaluationgainAcct;
	private BigDecimal bRevaluationlossAcct;
	private BigDecimal bSettlementgainAcct;
	private BigDecimal bSettlementlossAcct;
	private BigDecimal bUnallocatedcashAcct;
	private BigDecimal bUnidentifiedAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBankaccountAcct() {
	}


	@EmbeddedId
	public CBankaccountAcctPK getId() {
		return this.id;
	}

	public void setId(CBankaccountAcctPK id) {
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


	@Column(name="B_ASSET_ACCT")
	public BigDecimal getBAssetAcct() {
		return this.bAssetAcct;
	}

	public void setBAssetAcct(BigDecimal bAssetAcct) {
		this.bAssetAcct = bAssetAcct;
	}


	@Column(name="B_EXPENSE_ACCT")
	public BigDecimal getBExpenseAcct() {
		return this.bExpenseAcct;
	}

	public void setBExpenseAcct(BigDecimal bExpenseAcct) {
		this.bExpenseAcct = bExpenseAcct;
	}


	@Column(name="B_INTERESTEXP_ACCT")
	public BigDecimal getBInterestexpAcct() {
		return this.bInterestexpAcct;
	}

	public void setBInterestexpAcct(BigDecimal bInterestexpAcct) {
		this.bInterestexpAcct = bInterestexpAcct;
	}


	@Column(name="B_INTERESTREV_ACCT")
	public BigDecimal getBInterestrevAcct() {
		return this.bInterestrevAcct;
	}

	public void setBInterestrevAcct(BigDecimal bInterestrevAcct) {
		this.bInterestrevAcct = bInterestrevAcct;
	}


	@Column(name="B_INTRANSIT_ACCT")
	public BigDecimal getBIntransitAcct() {
		return this.bIntransitAcct;
	}

	public void setBIntransitAcct(BigDecimal bIntransitAcct) {
		this.bIntransitAcct = bIntransitAcct;
	}


	@Column(name="B_PAYMENTSELECT_ACCT")
	public BigDecimal getBPaymentselectAcct() {
		return this.bPaymentselectAcct;
	}

	public void setBPaymentselectAcct(BigDecimal bPaymentselectAcct) {
		this.bPaymentselectAcct = bPaymentselectAcct;
	}


	@Column(name="B_REVALUATIONGAIN_ACCT")
	public BigDecimal getBRevaluationgainAcct() {
		return this.bRevaluationgainAcct;
	}

	public void setBRevaluationgainAcct(BigDecimal bRevaluationgainAcct) {
		this.bRevaluationgainAcct = bRevaluationgainAcct;
	}


	@Column(name="B_REVALUATIONLOSS_ACCT")
	public BigDecimal getBRevaluationlossAcct() {
		return this.bRevaluationlossAcct;
	}

	public void setBRevaluationlossAcct(BigDecimal bRevaluationlossAcct) {
		this.bRevaluationlossAcct = bRevaluationlossAcct;
	}


	@Column(name="B_SETTLEMENTGAIN_ACCT")
	public BigDecimal getBSettlementgainAcct() {
		return this.bSettlementgainAcct;
	}

	public void setBSettlementgainAcct(BigDecimal bSettlementgainAcct) {
		this.bSettlementgainAcct = bSettlementgainAcct;
	}


	@Column(name="B_SETTLEMENTLOSS_ACCT")
	public BigDecimal getBSettlementlossAcct() {
		return this.bSettlementlossAcct;
	}

	public void setBSettlementlossAcct(BigDecimal bSettlementlossAcct) {
		this.bSettlementlossAcct = bSettlementlossAcct;
	}


	@Column(name="B_UNALLOCATEDCASH_ACCT")
	public BigDecimal getBUnallocatedcashAcct() {
		return this.bUnallocatedcashAcct;
	}

	public void setBUnallocatedcashAcct(BigDecimal bUnallocatedcashAcct) {
		this.bUnallocatedcashAcct = bUnallocatedcashAcct;
	}


	@Column(name="B_UNIDENTIFIED_ACCT")
	public BigDecimal getBUnidentifiedAcct() {
		return this.bUnidentifiedAcct;
	}

	public void setBUnidentifiedAcct(BigDecimal bUnidentifiedAcct) {
		this.bUnidentifiedAcct = bUnidentifiedAcct;
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