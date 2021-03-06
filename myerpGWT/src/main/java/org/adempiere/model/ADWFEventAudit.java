package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_wf_eventaudit")
public class ADWFEventAudit extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTableID;
	private Integer aDUserID;
	private Integer aDWFEventAuditID;
	private Integer aDWFNodeID;
	private Integer aDWFProcessID;
	private Integer aDWFResponsibleID;
	private Boolean active;
	private String attributeName;
	private String created;
	private Integer createdBy;
	private String description;
	private BigDecimal elapsedTimeMS;
	private String eventType;
	private String newValue;
	private String oldValue;
	private Integer recordID;
	private String textMsg;
	private String updated;
	private Integer updatedBy;
	private String wFState;

	public ADWFEventAudit() {
	}

	public ADWFEventAudit(Integer aDWFEventAuditID) {
		this.aDWFEventAuditID = aDWFEventAuditID;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
	}

	@Basic
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	@Id
	@Column(name="AD_WF_EVENTAUDIT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_824", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_WF_EventAudit", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_824")
	public Integer getADWFEventAuditID() {
		return aDWFEventAuditID;
	}

	public void setADWFEventAuditID(Integer aDWFEventAuditID) {
		this.aDWFEventAuditID = aDWFEventAuditID;
	}

	@Basic
	@Column(name="AD_WF_NODE_ID", columnDefinition="INT", nullable=false)
	public Integer getADWFNodeID() {
		return aDWFNodeID;
	}

	public void setADWFNodeID(Integer aDWFNodeID) {
		this.aDWFNodeID = aDWFNodeID;
	}

	@Basic
	@Column(name="AD_WF_PROCESS_ID", columnDefinition="INT", nullable=false)
	public Integer getADWFProcessID() {
		return aDWFProcessID;
	}

	public void setADWFProcessID(Integer aDWFProcessID) {
		this.aDWFProcessID = aDWFProcessID;
	}

	@Basic
	@Column(name="AD_WF_RESPONSIBLE_ID", columnDefinition="INT", nullable=false)
	public Integer getADWFResponsibleID() {
		return aDWFResponsibleID;
	}

	public void setADWFResponsibleID(Integer aDWFResponsibleID) {
		this.aDWFResponsibleID = aDWFResponsibleID;
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
	@Column(length=60)
	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
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
	@Column(nullable=false)
	public BigDecimal getElapsedTimeMS() {
		return elapsedTimeMS;
	}

	public void setElapsedTimeMS(BigDecimal elapsedTimeMS) {
		this.elapsedTimeMS = elapsedTimeMS;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Basic
	@Column(length=2000)
	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Basic
	@Column(length=2000)
	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	@Basic
	@Column(name="RECORD_ID", columnDefinition="INT", nullable=false)
	public Integer getRecordID() {
		return recordID;
	}

	public void setRecordID(Integer recordID) {
		this.recordID = recordID;
	}

	@Basic
	@Column(length=2000)
	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
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

	@Basic
	@Column(nullable=false, length=2)
	public String getWFState() {
		return wFState;
	}

	public void setWFState(String wFState) {
		this.wFState = wFState;
	}
}