package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_projectissue")
public class CProjectissue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cProjectId;
	private Integer cProjectissueId;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private Integer line;
	private Integer mAttributesetinstanceId;
	private Integer mInoutlineId;
	private Integer mLocatorId;
	private Integer mProductId;
	private String movementdate;
	private BigDecimal movementqty;
	private String posted;
	private String processed;
	private Long processedon;
	private String processing;
	private Integer sTimeexpenselineId;
	private String updated;
	private Integer updatedby;

	public CProjectissue() {
	}

	public CProjectissue(Integer cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
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
	@Column(name="C_PROJECT_ID", nullable=false)
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Id
	@Column(name="C_PROJECTISSUE_ID")
	public Integer getCProjectissueId() {
		return cProjectissueId;
	}

	public void setCProjectissueId(Integer cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID")
	public Integer getMInoutlineId() {
		return mInoutlineId;
	}

	public void setMInoutlineId(Integer mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", nullable=false)
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(nullable=false)
	public String getMovementdate() {
		return movementdate;
	}

	public void setMovementdate(String movementdate) {
		this.movementdate = movementdate;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementqty() {
		return movementqty;
	}

	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
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
	public Long getProcessedon() {
		return processedon;
	}

	public void setProcessedon(Long processedon) {
		this.processedon = processedon;
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
	@Column(name="S_TIMEEXPENSELINE_ID")
	public Integer getSTimeexpenselineId() {
		return sTimeexpenselineId;
	}

	public void setSTimeexpenselineId(Integer sTimeexpenselineId) {
		this.sTimeexpenselineId = sTimeexpenselineId;
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