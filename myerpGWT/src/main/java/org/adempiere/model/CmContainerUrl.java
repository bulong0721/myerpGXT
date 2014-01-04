package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_container_url")
public class CmContainerUrl extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String checked;
	private Integer cmContainerId;
	private Integer cmContainerUrlId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String lastResult;
	private String status;
	private String updated;
	private Integer updatedby;

	public CmContainerUrl() {
	}

	public CmContainerUrl(Integer cmContainerUrlId) {
		this.cmContainerUrlId = cmContainerUrlId;
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
	@Column(nullable=false)
	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	@Basic
	@Column(name="CM_CONTAINER_ID", nullable=false)
	public Integer getCmContainerId() {
		return cmContainerId;
	}

	public void setCmContainerId(Integer cmContainerId) {
		this.cmContainerId = cmContainerId;
	}

	@Id
	@Column(name="CM_CONTAINER_URL_ID")
	public Integer getCmContainerUrlId() {
		return cmContainerUrlId;
	}

	public void setCmContainerUrlId(Integer cmContainerUrlId) {
		this.cmContainerUrlId = cmContainerUrlId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="LAST_RESULT", nullable=false, length=2000)
	public String getLastResult() {
		return lastResult;
	}

	public void setLastResult(String lastResult) {
		this.lastResult = lastResult;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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