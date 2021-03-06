package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_allocationhdr")
public class CAllocationHdr extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private BigDecimal approvalAmt;
	private Boolean approved;
	private Integer cAllocationHdrID;
	private Integer cCurrencyID;
	private String created;
	private Integer createdBy;
	private String dateAcct;
	private String dateTrx;
	private String description;
	private String docAction;
	private String docStatus;
	private String documentNo;
	private Boolean manual;
	private Boolean posted;
	private Boolean processed;
	private Long processedOn;
	private Boolean processing;
	private String updated;
	private Integer updatedBy;

	public CAllocationHdr() {
	}

	public CAllocationHdr(Integer cAllocationHdrID) {
		this.cAllocationHdrID = cAllocationHdrID;
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

	@Basic
	@Column(nullable=false)
	public BigDecimal getApprovalAmt() {
		return approvalAmt;
	}

	public void setApprovalAmt(BigDecimal approvalAmt) {
		this.approvalAmt = approvalAmt;
	}

	@Basic
	@Column(name="ISAPPROVED", nullable=false)
	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	@Id
	@Column(name="C_ALLOCATIONHDR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_966", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_AllocationHdr", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_966")
	public Integer getCAllocationHdrID() {
		return cAllocationHdrID;
	}

	public void setCAllocationHdrID(Integer cAllocationHdrID) {
		this.cAllocationHdrID = cAllocationHdrID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
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
	@Column(nullable=false)
	public String getDateAcct() {
		return dateAcct;
	}

	public void setDateAcct(String dateAcct) {
		this.dateAcct = dateAcct;
	}

	@Basic
	@Column(nullable=false)
	public String getDateTrx() {
		return dateTrx;
	}

	public void setDateTrx(String dateTrx) {
		this.dateTrx = dateTrx;
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
	public String getDocAction() {
		return docAction;
	}

	public void setDocAction(String docAction) {
		this.docAction = docAction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	@Column(name="ISMANUAL", nullable=false)
	public Boolean isManual() {
		return manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isPosted() {
		return posted;
	}

	public void setPosted(Boolean posted) {
		this.posted = posted;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Long getProcessedOn() {
		return processedOn;
	}

	public void setProcessedOn(Long processedOn) {
		this.processedOn = processedOn;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}