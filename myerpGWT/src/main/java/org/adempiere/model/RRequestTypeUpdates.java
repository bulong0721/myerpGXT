package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requesttypeupdates")
@IdClass(org.adempiere.model.RRequestTypeUpdatesPK.class)
public class RRequestTypeUpdates extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Integer rRequestTypeID;
	private Boolean selfService;
	private String updated;
	private Integer updatedBy;

	public RRequestTypeUpdates() {
	}

	public RRequestTypeUpdates(Integer aDUserID, Integer rRequestTypeID) {
		this.aDUserID = aDUserID;
		this.rRequestTypeID = rRequestTypeID;
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

	@Id
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
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

	@Id
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	public Integer getRRequestTypeID() {
		return rRequestTypeID;
	}

	public void setRRequestTypeID(Integer rRequestTypeID) {
		this.rRequestTypeID = rRequestTypeID;
	}

	@Basic
	@Column(name="ISSELFSERVICE", nullable=false)
	public Boolean isSelfService() {
		return selfService;
	}

	public void setSelfService(Boolean selfService) {
		this.selfService = selfService;
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