package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_record_access")
@IdClass(org.adempiere.model.AdRecordAccessPK.class)
public class AdRecordAccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adRoleId;
	private Integer adTableId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String isdependententities;
	private String isexclude;
	private String isreadonly;
	private Integer recordId;
	private String updated;
	private Integer updatedby;

	public AdRecordAccess() {
	}

	public AdRecordAccess(Integer adRoleId, Integer adTableId, Integer recordId) {
		this.adRoleId = adRoleId;
		this.adTableId = adTableId;
		this.recordId = recordId;
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

	@Id
	@Column(name="AD_ROLE_ID")
	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Id
	@Column(name="AD_TABLE_ID")
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
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
	@Column(nullable=false, length=1)
	public String getIsdependententities() {
		return isdependententities;
	}

	public void setIsdependententities(String isdependententities) {
		this.isdependententities = isdependententities;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsexclude() {
		return isexclude;
	}

	public void setIsexclude(String isexclude) {
		this.isexclude = isexclude;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Id
	@Column(name="RECORD_ID")
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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