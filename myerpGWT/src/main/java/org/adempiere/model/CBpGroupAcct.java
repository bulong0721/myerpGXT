package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_group_acct")
@IdClass(org.adempiere.model.CBpGroupAcctPK.class)
public class CBpGroupAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cBpGroupId;
	private Integer cPrepaymentAcct;
	private Integer cReceivableAcct;
	private Integer cReceivableServicesAcct;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer notinvoicedreceiptsAcct;
	private Integer notinvoicedreceivablesAcct;
	private Integer notinvoicedrevenueAcct;
	private Integer paydiscountExpAcct;
	private Integer paydiscountRevAcct;
	private Boolean processing;
	private Integer unearnedrevenueAcct;
	private String updated;
	private Integer updatedby;
	private Integer vLiabilityAcct;
	private Integer vLiabilityServicesAcct;
	private Integer vPrepaymentAcct;
	private Integer writeoffAcct;

	public CBpGroupAcct() {
	}

	public CBpGroupAcct(Integer cAcctschemaId, Integer cBpGroupId) {
		this.cAcctschemaId = cAcctschemaId;
		this.cBpGroupId = cBpGroupId;
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

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Id
	@Column(name="C_BP_GROUP_ID", columnDefinition="INT")
	public Integer getCBpGroupId() {
		return cBpGroupId;
	}

	public void setCBpGroupId(Integer cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}

	@Basic
	@Column(name="C_PREPAYMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCPrepaymentAcct() {
		return cPrepaymentAcct;
	}

	public void setCPrepaymentAcct(Integer cPrepaymentAcct) {
		this.cPrepaymentAcct = cPrepaymentAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCReceivableAcct() {
		return cReceivableAcct;
	}

	public void setCReceivableAcct(Integer cReceivableAcct) {
		this.cReceivableAcct = cReceivableAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_SERVICES_ACCT", columnDefinition="INT")
	public Integer getCReceivableServicesAcct() {
		return cReceivableServicesAcct;
	}

	public void setCReceivableServicesAcct(Integer cReceivableServicesAcct) {
		this.cReceivableServicesAcct = cReceivableServicesAcct;
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
	@Column(name="NOTINVOICEDRECEIPTS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotinvoicedreceiptsAcct() {
		return notinvoicedreceiptsAcct;
	}

	public void setNotinvoicedreceiptsAcct(Integer notinvoicedreceiptsAcct) {
		this.notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
	}

	@Basic
	@Column(name="NOTINVOICEDRECEIVABLES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotinvoicedreceivablesAcct() {
		return notinvoicedreceivablesAcct;
	}

	public void setNotinvoicedreceivablesAcct(Integer notinvoicedreceivablesAcct) {
		this.notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
	}

	@Basic
	@Column(name="NOTINVOICEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotinvoicedrevenueAcct() {
		return notinvoicedrevenueAcct;
	}

	public void setNotinvoicedrevenueAcct(Integer notinvoicedrevenueAcct) {
		this.notinvoicedrevenueAcct = notinvoicedrevenueAcct;
	}

	@Basic
	@Column(name="PAYDISCOUNT_EXP_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPaydiscountExpAcct() {
		return paydiscountExpAcct;
	}

	public void setPaydiscountExpAcct(Integer paydiscountExpAcct) {
		this.paydiscountExpAcct = paydiscountExpAcct;
	}

	@Basic
	@Column(name="PAYDISCOUNT_REV_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPaydiscountRevAcct() {
		return paydiscountRevAcct;
	}

	public void setPaydiscountRevAcct(Integer paydiscountRevAcct) {
		this.paydiscountRevAcct = paydiscountRevAcct;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="UNEARNEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnearnedrevenueAcct() {
		return unearnedrevenueAcct;
	}

	public void setUnearnedrevenueAcct(Integer unearnedrevenueAcct) {
		this.unearnedrevenueAcct = unearnedrevenueAcct;
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

	@Basic
	@Column(name="V_LIABILITY_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVLiabilityAcct() {
		return vLiabilityAcct;
	}

	public void setVLiabilityAcct(Integer vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}

	@Basic
	@Column(name="V_LIABILITY_SERVICES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVLiabilityServicesAcct() {
		return vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(Integer vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}

	@Basic
	@Column(name="V_PREPAYMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVPrepaymentAcct() {
		return vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(Integer vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}

	@Basic
	@Column(name="WRITEOFF_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWriteoffAcct() {
		return writeoffAcct;
	}

	public void setWriteoffAcct(Integer writeoffAcct) {
		this.writeoffAcct = writeoffAcct;
	}
}