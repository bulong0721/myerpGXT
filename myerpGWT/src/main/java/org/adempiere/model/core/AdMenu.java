package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.model.common.AdEntityBase;


import java.sql.Timestamp;


/**
 * The persistent class for the ad_menu database table.
 * 
 */
@Entity
@Table(name="ad_menu")
public class AdMenu extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adMenuId;
	private String action;
	private Long adClientId;
	private Long adFormId;
	private Long adOrgId;
	private Long adProcessId;
	private Long adTaskId;
	private Long adWindowId;
	private Long adWorkbenchId;
	private Long adWorkflowId;
	private String created;
	private Long createdby;
	private String description;
	private String entitytype;
	private String isactive;
	private String iscentrallymaintained;
	private String isreadonly;
	private String issotrx;
	private String issummary;
	private String name;
	private Timestamp updated;
	private Long updatedby;

	public AdMenu() {
	}


	@Id
	@Column(name="AD_MENU_ID")
	public long getAdMenuId() {
		return this.adMenuId;
	}

	public void setAdMenuId(long adMenuId) {
		this.adMenuId = adMenuId;
	}


	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}


	@Column(name="AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_FORM_ID")
	public Long getAdFormId() {
		return this.adFormId;
	}

	public void setAdFormId(Long adFormId) {
		this.adFormId = adFormId;
	}


	@Column(name="AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_PROCESS_ID")
	public Long getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}


	@Column(name="AD_TASK_ID")
	public Long getAdTaskId() {
		return this.adTaskId;
	}

	public void setAdTaskId(Long adTaskId) {
		this.adTaskId = adTaskId;
	}


	@Column(name="AD_WINDOW_ID")
	public Long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
		this.adWindowId = adWindowId;
	}


	@Column(name="AD_WORKBENCH_ID")
	public Long getAdWorkbenchId() {
		return this.adWorkbenchId;
	}

	public void setAdWorkbenchId(Long adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}


	@Column(name="AD_WORKFLOW_ID")
	public Long getAdWorkflowId() {
		return this.adWorkflowId;
	}

	public void setAdWorkflowId(Long adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}


	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}


	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscentrallymaintained() {
		return this.iscentrallymaintained;
	}

	public void setIscentrallymaintained(String iscentrallymaintained) {
		this.iscentrallymaintained = iscentrallymaintained;
	}


	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

}