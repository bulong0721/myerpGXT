package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_window_access")
@IdClass(org.adempiere.model.ADWindowAccessPK.class)
public class ADWindowAccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDRoleID;
	private Integer aDWindowID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Boolean readWrite;
	private String updated;
	private Integer updatedBy;

	public ADWindowAccess() {
	}

	public ADWindowAccess(Integer aDRoleID, Integer aDWindowID) {
		this.aDRoleID = aDRoleID;
		this.aDWindowID = aDWindowID;
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
	@Column(name="AD_ROLE_ID", columnDefinition="INT")
	public Integer getADRoleID() {
		return aDRoleID;
	}

	public void setADRoleID(Integer aDRoleID) {
		this.aDRoleID = aDRoleID;
	}

	@Id
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getADWindowID() {
		return aDWindowID;
	}

	public void setADWindowID(Integer aDWindowID) {
		this.aDWindowID = aDWindowID;
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
	@Column(name="ISREADWRITE", nullable=false)
	public Boolean isReadWrite() {
		return readWrite;
	}

	public void setReadWrite(Boolean readWrite) {
		this.readWrite = readWrite;
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