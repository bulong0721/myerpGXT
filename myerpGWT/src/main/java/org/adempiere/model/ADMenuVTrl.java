package org.adempiere.model;

import javax.persistence.*;

import org.adempiere.common.ADEntityBase;

/**
 * Auto-generated by: org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name = "ad_menu_vt")
public class ADMenuVTrl extends ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDFormID;
	private Integer aDLanguageID;
	private Integer aDOrgID;
	private Integer aDProcessID;
	private Integer aDTaskID;
	private Integer aDTreeID;
	private Integer aDWindowID;
	private Integer aDWorkbenchID;
	private Integer aDWorkflowID;
	private String action;
	private Boolean active;
	private Boolean centrallyMaintained;
	private String created;
	private Integer createdBy;
	private String description;
	private String entityType;
	private String name;
	private Integer nodeID;
	private Integer parentID;
	private Boolean readOnly;
	private Boolean sOTrx;
	private Integer seqNo;
	private Boolean summary;
	private Boolean translated;
	private String updated;
	private Integer updatedBy;

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
	@Column(name="AD_LANGUAGE_ID", columnDefinition="INT")
	public Integer getADLanguageID() {
		return aDLanguageID;
	}

	public void setADLanguageID(Integer aDLanguageID) {
		this.aDLanguageID = aDLanguageID;
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
	@Column(name="AD_TREE_ID", columnDefinition="INT", nullable=false)
	public Integer getADTreeID() {
		return aDTreeID;
	}

	public void setADTreeID(Integer aDTreeID) {
		this.aDTreeID = aDTreeID;
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
	@Column(name="AD_WORKBENCH_ID", columnDefinition="INT")
	public Integer getADWorkbenchID() {
		return aDWorkbenchID;
	}

	public void setADWorkbenchID(Integer aDWorkbenchID) {
		this.aDWorkbenchID = aDWorkbenchID;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID", columnDefinition="INT")
	public Integer getADWorkflowID() {
		return aDWorkflowID;
	}

	public void setADWorkflowID(Integer aDWorkflowID) {
		this.aDWorkflowID = aDWorkflowID;
	}

	@Basic
	@Column(length=1)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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
	@Column(name="ISCENTRALLYMAINTAINED")
	public Boolean isCentrallyMaintained() {
		return centrallyMaintained;
	}

	public void setCentrallyMaintained(Boolean centrallyMaintained) {
		this.centrallyMaintained = centrallyMaintained;
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
	@Column(nullable=false, length=40)
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Basic
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="NODE_ID", columnDefinition="INT")
	public Integer getNodeID() {
		return nodeID;
	}

	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}

	@Basic
	@Column(name="PARENT_ID", columnDefinition="INT")
	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}

	@Basic
	@Column(name="ISREADONLY", nullable=false)
	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	@Basic
	@Column(name="ISSOTRX", nullable=false)
	public Boolean isSOTrx() {
		return sOTrx;
	}

	public void setSOTrx(Boolean sOTrx) {
		this.sOTrx = sOTrx;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(name="ISSUMMARY", nullable=false)
	public Boolean isSummary() {
		return summary;
	}

	public void setSummary(Boolean summary) {
		this.summary = summary;
	}

	@Basic
	@Column(name="ISTRANSLATED")
	public Boolean isTranslated() {
		return translated;
	}

	public void setTranslated(Boolean translated) {
		this.translated = translated;
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