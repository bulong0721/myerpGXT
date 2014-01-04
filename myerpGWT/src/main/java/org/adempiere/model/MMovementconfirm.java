package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_movementconfirm")
public class MMovementconfirm extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal approvalamt;
	private String created;
	private Integer createdby;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private String isactive;
	private String isapproved;
	private Integer mInventoryId;
	private Integer mMovementId;
	private Integer mMovementconfirmId;
	private String processed;
	private String processing;
	private String updated;
	private Integer updatedby;

	public MMovementconfirm() {
	}

	public MMovementconfirm(Integer mMovementconfirmId) {
		this.mMovementconfirmId = mMovementconfirmId;
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

	@Basic
	public BigDecimal getApprovalamt() {
		return approvalamt;
	}

	public void setApprovalamt(BigDecimal approvalamt) {
		this.approvalamt = approvalamt;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocaction() {
		return docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
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
	@Column(nullable=false, length=1)
	public String getIsapproved() {
		return isapproved;
	}

	public void setIsapproved(String isapproved) {
		this.isapproved = isapproved;
	}

	@Basic
	@Column(name="M_INVENTORY_ID")
	public Integer getMInventoryId() {
		return mInventoryId;
	}

	public void setMInventoryId(Integer mInventoryId) {
		this.mInventoryId = mInventoryId;
	}

	@Basic
	@Column(name="M_MOVEMENT_ID", nullable=false)
	public Integer getMMovementId() {
		return mMovementId;
	}

	public void setMMovementId(Integer mMovementId) {
		this.mMovementId = mMovementId;
	}

	@Id
	@Column(name="M_MOVEMENTCONFIRM_ID")
	public Integer getMMovementconfirmId() {
		return mMovementconfirmId;
	}

	public void setMMovementconfirmId(Integer mMovementconfirmId) {
		this.mMovementconfirmId = mMovementconfirmId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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