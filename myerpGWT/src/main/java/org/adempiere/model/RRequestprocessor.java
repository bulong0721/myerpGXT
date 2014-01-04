package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestprocessor")
public class RRequestprocessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String datelastrun;
	private String datenextrun;
	private String description;
	private Integer frequency;
	private String frequencytype;
	private Integer inactivityalertdays;
	private String isactive;
	private Integer keeplogdays;
	private String name;
	private Integer overduealertdays;
	private Integer overdueassigndays;
	private String processing;
	private Integer rRequestprocessorId;
	private Integer rRequesttypeId;
	private Integer reminddays;
	private Integer supervisorId;
	private String updated;
	private Integer updatedby;

	public RRequestprocessor() {
	}

	public RRequestprocessor(Integer rRequestprocessorId) {
		this.rRequestprocessorId = rRequestprocessorId;
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
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
	}

	@Basic
	public String getDatenextrun() {
		return datenextrun;
	}

	public void setDatenextrun(String datenextrun) {
		this.datenextrun = datenextrun;
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
	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFrequencytype() {
		return frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
	}

	@Basic
	@Column(nullable=false)
	public Integer getInactivityalertdays() {
		return inactivityalertdays;
	}

	public void setInactivityalertdays(Integer inactivityalertdays) {
		this.inactivityalertdays = inactivityalertdays;
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
	public Integer getKeeplogdays() {
		return keeplogdays;
	}

	public void setKeeplogdays(Integer keeplogdays) {
		this.keeplogdays = keeplogdays;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(nullable=false)
	public Integer getOverduealertdays() {
		return overduealertdays;
	}

	public void setOverduealertdays(Integer overduealertdays) {
		this.overduealertdays = overduealertdays;
	}

	@Basic
	@Column(nullable=false)
	public Integer getOverdueassigndays() {
		return overdueassigndays;
	}

	public void setOverdueassigndays(Integer overdueassigndays) {
		this.overdueassigndays = overdueassigndays;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Id
	@Column(name="R_REQUESTPROCESSOR_ID")
	public Integer getRRequestprocessorId() {
		return rRequestprocessorId;
	}

	public void setRRequestprocessorId(Integer rRequestprocessorId) {
		this.rRequestprocessorId = rRequestprocessorId;
	}

	@Basic
	@Column(name="R_REQUESTTYPE_ID")
	public Integer getRRequesttypeId() {
		return rRequesttypeId;
	}

	public void setRRequesttypeId(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
	}

	@Basic
	@Column(nullable=false)
	public Integer getReminddays() {
		return reminddays;
	}

	public void setReminddays(Integer reminddays) {
		this.reminddays = reminddays;
	}

	@Basic
	@Column(name="SUPERVISOR_ID", nullable=false)
	public Integer getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Integer supervisorId) {
		this.supervisorId = supervisorId;
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