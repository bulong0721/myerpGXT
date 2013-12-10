package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_group_acct database table.
 * 
 */
@Entity
@Table(name="c_bp_group_acct")
@NamedQuery(name="CBpGroupAcct.findAll", query="SELECT c FROM CBpGroupAcct c")
public class CBpGroupAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpGroupAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cPrepaymentAcct;
	private BigDecimal cReceivableAcct;
	private BigDecimal cReceivableServicesAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal notinvoicedreceiptsAcct;
	private BigDecimal notinvoicedreceivablesAcct;
	private BigDecimal notinvoicedrevenueAcct;
	private BigDecimal paydiscountExpAcct;
	private BigDecimal paydiscountRevAcct;
	private String processing;
	private BigDecimal unearnedrevenueAcct;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal vLiabilityAcct;
	private BigDecimal vLiabilityServicesAcct;
	private BigDecimal vPrepaymentAcct;
	private BigDecimal writeoffAcct;

	public CBpGroupAcct() {
	}


	@EmbeddedId
	public CBpGroupAcctPK getId() {
		return this.id;
	}

	public void setId(CBpGroupAcctPK id) {
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


	@Column(name="NOTINVOICEDRECEIPTS_ACCT")
	public BigDecimal getNotinvoicedreceiptsAcct() {
		return this.notinvoicedreceiptsAcct;
	}

	public void setNotinvoicedreceiptsAcct(BigDecimal notinvoicedreceiptsAcct) {
		this.notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
	}


	@Column(name="NOTINVOICEDRECEIVABLES_ACCT")
	public BigDecimal getNotinvoicedreceivablesAcct() {
		return this.notinvoicedreceivablesAcct;
	}

	public void setNotinvoicedreceivablesAcct(BigDecimal notinvoicedreceivablesAcct) {
		this.notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
	}


	@Column(name="NOTINVOICEDREVENUE_ACCT")
	public BigDecimal getNotinvoicedrevenueAcct() {
		return this.notinvoicedrevenueAcct;
	}

	public void setNotinvoicedrevenueAcct(BigDecimal notinvoicedrevenueAcct) {
		this.notinvoicedrevenueAcct = notinvoicedrevenueAcct;
	}


	@Column(name="PAYDISCOUNT_EXP_ACCT")
	public BigDecimal getPaydiscountExpAcct() {
		return this.paydiscountExpAcct;
	}

	public void setPaydiscountExpAcct(BigDecimal paydiscountExpAcct) {
		this.paydiscountExpAcct = paydiscountExpAcct;
	}


	@Column(name="PAYDISCOUNT_REV_ACCT")
	public BigDecimal getPaydiscountRevAcct() {
		return this.paydiscountRevAcct;
	}

	public void setPaydiscountRevAcct(BigDecimal paydiscountRevAcct) {
		this.paydiscountRevAcct = paydiscountRevAcct;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="UNEARNEDREVENUE_ACCT")
	public BigDecimal getUnearnedrevenueAcct() {
		return this.unearnedrevenueAcct;
	}

	public void setUnearnedrevenueAcct(BigDecimal unearnedrevenueAcct) {
		this.unearnedrevenueAcct = unearnedrevenueAcct;
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


	@Column(name="V_LIABILITY_ACCT")
	public BigDecimal getVLiabilityAcct() {
		return this.vLiabilityAcct;
	}

	public void setVLiabilityAcct(BigDecimal vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}


	@Column(name="V_LIABILITY_SERVICES_ACCT")
	public BigDecimal getVLiabilityServicesAcct() {
		return this.vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(BigDecimal vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}


	@Column(name="V_PREPAYMENT_ACCT")
	public BigDecimal getVPrepaymentAcct() {
		return this.vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(BigDecimal vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}


	@Column(name="WRITEOFF_ACCT")
	public BigDecimal getWriteoffAcct() {
		return this.writeoffAcct;
	}

	public void setWriteoffAcct(BigDecimal writeoffAcct) {
		this.writeoffAcct = writeoffAcct;
	}

}