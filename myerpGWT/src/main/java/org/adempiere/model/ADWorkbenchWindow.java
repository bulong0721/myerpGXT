package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_workbenchwindow")
public class ADWorkbenchWindow extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDFormID;
	private Integer aDOrgID;
	private Integer aDProcessID;
	private Integer aDTaskID;
	private Integer aDWindowID;
	private Integer aDWorkbenchID;
	private Integer aDWorkbenchWindowID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String entityType;
	private Boolean primary;
	private Integer seqNo;
	private String updated;
	private Integer updatedBy;

	public ADWorkbenchWindow() {
	}

	public ADWorkbenchWindow(Integer aDWorkbenchWindowID) {
		this.aDWorkbenchWindowID = aDWorkbenchWindowID;
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
	@Column(name="AD_FORM_ID", columnDefinition="INT")
	public Integer getADFormID() {
		return aDFormID;
	}

	public void setADFormID(Integer aDFormID) {
		this.aDFormID = aDFormID;
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
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer aDProcessID) {
		this.aDProcessID = aDProcessID;
	}

	@Basic
	@Column(name="AD_TASK_ID", columnDefinition="INT")
	public Integer getADTaskID() {
		return aDTaskID;
	}

	public void setADTaskID(Integer aDTaskID) {
		this.aDTaskID = aDTaskID;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getADWindowID() {
		return aDWindowID;
	}

	public void setADWindowID(Integer aDWindowID) {
		this.aDWindowID = aDWindowID;
	}

	@Basic
	@Column(name="AD_WORKBENCH_ID", columnDefinition="INT", nullable=false)
	public Integer getADWorkbenchID() {
		return aDWorkbenchID;
	}

	public void setADWorkbenchID(Integer aDWorkbenchID) {
		this.aDWorkbenchID = aDWorkbenchID;
	}

	@Id
	@Column(name="AD_WORKBENCHWINDOW_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_544", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_WorkbenchWindow", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_544")
	public Integer getADWorkbenchWindowID() {
		return aDWorkbenchWindowID;
	}

	public void setADWorkbenchWindowID(Integer aDWorkbenchWindowID) {
		this.aDWorkbenchWindowID = aDWorkbenchWindowID;
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
	@Column(nullable=false, length=40)
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Basic
	@Column(name="ISPRIMARY", nullable=false)
	public Boolean isPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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