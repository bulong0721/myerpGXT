package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_timeexpense")
public class STimeExpense extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private BigDecimal approvalAmt;
	private Boolean approved;
	private Integer cBPartnerID;
	private String created;
	private Integer createdBy;
	private String dateReport;
	private String description;
	private String docAction;
	private String docStatus;
	private String documentNo;
	private Integer mPriceListID;
	private Integer mWarehouseID;
	private Boolean processed;
	private Boolean processing;
	private Integer sTimeExpenseID;
	private String updated;
	private Integer updatedBy;

	public STimeExpense() {
	}

	public STimeExpense(Integer sTimeExpenseID) {
		this.sTimeExpenseID = sTimeExpenseID;
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

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
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
	public String getDateReport() {
		return dateReport;
	}

	public void setDateReport(String dateReport) {
		this.dateReport = dateReport;
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
	@Column(name="M_PRICELIST_ID", columnDefinition="INT", nullable=false)
	public Integer getMPriceListID() {
		return mPriceListID;
	}

	public void setMPriceListID(Integer mPriceListID) {
		this.mPriceListID = mPriceListID;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseID() {
		return mWarehouseID;
	}

	public void setMWarehouseID(Integer mWarehouseID) {
		this.mWarehouseID = mWarehouseID;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Id
	@Column(name="S_TIMEEXPENSE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_558", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "S_TimeExpense", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_558")
	public Integer getSTimeExpenseID() {
		return sTimeExpenseID;
	}

	public void setSTimeExpenseID(Integer sTimeExpenseID) {
		this.sTimeExpenseID = sTimeExpenseID;
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