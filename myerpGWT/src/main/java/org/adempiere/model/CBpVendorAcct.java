package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_vendor_acct")
@IdClass(org.adempiere.model.CBpVendorAcctPK.class)
public class CBpVendorAcct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private String updated;
	private Integer updatedby;
	private Integer vLiabilityAcct;
	private Integer vLiabilityServicesAcct;
	private Integer vPrepaymentAcct;

	public CBpVendorAcct() {
	}

	public CBpVendorAcct(Integer cAcctschemaId, Integer cBpartnerId) {
		this.cAcctschemaId = cAcctschemaId;
		this.cBpartnerId = cBpartnerId;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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

	@Basic
	@Column(name="V_LIABILITY_ACCT", columnDefinition="INT")
	public Integer getVLiabilityAcct() {
		return vLiabilityAcct;
	}

	public void setVLiabilityAcct(Integer vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}

	@Basic
	@Column(name="V_LIABILITY_SERVICES_ACCT", columnDefinition="INT")
	public Integer getVLiabilityServicesAcct() {
		return vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(Integer vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}

	@Basic
	@Column(name="V_PREPAYMENT_ACCT", columnDefinition="INT")
	public Integer getVPrepaymentAcct() {
		return vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(Integer vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}
}