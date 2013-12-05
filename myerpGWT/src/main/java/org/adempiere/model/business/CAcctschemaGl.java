package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_acctschema_gl database table.
 * 
 */
@Entity
@Table(name="c_acctschema_gl")
@NamedQuery(name="CAcctschemaGl.findAll", query="SELECT c FROM CAcctschemaGl c")
public class CAcctschemaGl extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal commitmentoffsetAcct;
	private BigDecimal commitmentoffsetsalesAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal currencybalancingAcct;
	private BigDecimal incomesummaryAcct;
	private BigDecimal intercompanyduefromAcct;
	private BigDecimal intercompanyduetoAcct;
	private String isactive;
	private BigDecimal ppvoffsetAcct;
	private BigDecimal retainedearningAcct;
	private BigDecimal suspensebalancingAcct;
	private BigDecimal suspenseerrorAcct;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String usecurrencybalancing;
	private String usesuspensebalancing;
	private String usesuspenseerror;

	public CAcctschemaGl() {
	}


	@Id
	@Column(name="C_ACCTSCHEMA_ID")
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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


	@Column(name="COMMITMENTOFFSET_ACCT")
	public BigDecimal getCommitmentoffsetAcct() {
		return this.commitmentoffsetAcct;
	}

	public void setCommitmentoffsetAcct(BigDecimal commitmentoffsetAcct) {
		this.commitmentoffsetAcct = commitmentoffsetAcct;
	}


	@Column(name="COMMITMENTOFFSETSALES_ACCT")
	public BigDecimal getCommitmentoffsetsalesAcct() {
		return this.commitmentoffsetsalesAcct;
	}

	public void setCommitmentoffsetsalesAcct(BigDecimal commitmentoffsetsalesAcct) {
		this.commitmentoffsetsalesAcct = commitmentoffsetsalesAcct;
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


	@Column(name="CURRENCYBALANCING_ACCT")
	public BigDecimal getCurrencybalancingAcct() {
		return this.currencybalancingAcct;
	}

	public void setCurrencybalancingAcct(BigDecimal currencybalancingAcct) {
		this.currencybalancingAcct = currencybalancingAcct;
	}


	@Column(name="INCOMESUMMARY_ACCT")
	public BigDecimal getIncomesummaryAcct() {
		return this.incomesummaryAcct;
	}

	public void setIncomesummaryAcct(BigDecimal incomesummaryAcct) {
		this.incomesummaryAcct = incomesummaryAcct;
	}


	@Column(name="INTERCOMPANYDUEFROM_ACCT")
	public BigDecimal getIntercompanyduefromAcct() {
		return this.intercompanyduefromAcct;
	}

	public void setIntercompanyduefromAcct(BigDecimal intercompanyduefromAcct) {
		this.intercompanyduefromAcct = intercompanyduefromAcct;
	}


	@Column(name="INTERCOMPANYDUETO_ACCT")
	public BigDecimal getIntercompanyduetoAcct() {
		return this.intercompanyduetoAcct;
	}

	public void setIntercompanyduetoAcct(BigDecimal intercompanyduetoAcct) {
		this.intercompanyduetoAcct = intercompanyduetoAcct;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="PPVOFFSET_ACCT")
	public BigDecimal getPpvoffsetAcct() {
		return this.ppvoffsetAcct;
	}

	public void setPpvoffsetAcct(BigDecimal ppvoffsetAcct) {
		this.ppvoffsetAcct = ppvoffsetAcct;
	}


	@Column(name="RETAINEDEARNING_ACCT")
	public BigDecimal getRetainedearningAcct() {
		return this.retainedearningAcct;
	}

	public void setRetainedearningAcct(BigDecimal retainedearningAcct) {
		this.retainedearningAcct = retainedearningAcct;
	}


	@Column(name="SUSPENSEBALANCING_ACCT")
	public BigDecimal getSuspensebalancingAcct() {
		return this.suspensebalancingAcct;
	}

	public void setSuspensebalancingAcct(BigDecimal suspensebalancingAcct) {
		this.suspensebalancingAcct = suspensebalancingAcct;
	}


	@Column(name="SUSPENSEERROR_ACCT")
	public BigDecimal getSuspenseerrorAcct() {
		return this.suspenseerrorAcct;
	}

	public void setSuspenseerrorAcct(BigDecimal suspenseerrorAcct) {
		this.suspenseerrorAcct = suspenseerrorAcct;
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


	public String getUsecurrencybalancing() {
		return this.usecurrencybalancing;
	}

	public void setUsecurrencybalancing(String usecurrencybalancing) {
		this.usecurrencybalancing = usecurrencybalancing;
	}


	public String getUsesuspensebalancing() {
		return this.usesuspensebalancing;
	}

	public void setUsesuspensebalancing(String usesuspensebalancing) {
		this.usesuspensebalancing = usesuspensebalancing;
	}


	public String getUsesuspenseerror() {
		return this.usesuspenseerror;
	}

	public void setUsesuspenseerror(String usesuspenseerror) {
		this.usesuspenseerror = usesuspenseerror;
	}

}