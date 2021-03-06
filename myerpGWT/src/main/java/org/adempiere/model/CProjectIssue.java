package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_projectissue")
public class CProjectIssue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cProjectID;
	private Integer cProjectIssueID;
	private String created;
	private Integer createdBy;
	private String description;
	private Integer line;
	private Integer mAttributeSetInstanceID;
	private Integer mInOutLineID;
	private Integer mLocatorID;
	private Integer mProductID;
	private String movementDate;
	private BigDecimal movementQty;
	private Boolean posted;
	private Boolean processed;
	private Long processedOn;
	private Boolean processing;
	private Integer sTimeExpenseLineID;
	private String updated;
	private Integer updatedBy;

	public CProjectIssue() {
	}

	public CProjectIssue(Integer cProjectIssueID) {
		this.cProjectIssueID = cProjectIssueID;
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
	@Column(name="C_PROJECT_ID", columnDefinition="INT", nullable=false)
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
	}

	@Id
	@Column(name="C_PROJECTISSUE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_792", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_ProjectIssue", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_792")
	public Integer getCProjectIssueID() {
		return cProjectIssueID;
	}

	public void setCProjectIssueID(Integer cProjectIssueID) {
		this.cProjectIssueID = cProjectIssueID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInOutLineID() {
		return mInOutLineID;
	}

	public void setMInOutLineID(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorID() {
		return mLocatorID;
	}

	public void setMLocatorID(Integer mLocatorID) {
		this.mLocatorID = mLocatorID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Basic
	@Column(nullable=false)
	public String getMovementDate() {
		return movementDate;
	}

	public void setMovementDate(String movementDate) {
		this.movementDate = movementDate;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementQty() {
		return movementQty;
	}

	public void setMovementQty(BigDecimal movementQty) {
		this.movementQty = movementQty;
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
	@Column(name="S_TIMEEXPENSELINE_ID", columnDefinition="INT")
	public Integer getSTimeExpenseLineID() {
		return sTimeExpenseLineID;
	}

	public void setSTimeExpenseLineID(Integer sTimeExpenseLineID) {
		this.sTimeExpenseLineID = sTimeExpenseLineID;
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