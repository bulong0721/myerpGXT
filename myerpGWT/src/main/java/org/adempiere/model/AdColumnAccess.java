package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_column_access")
@IdClass(org.adempiere.model.AdColumnAccessPK.class)
public class AdColumnAccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adColumnId;
	private Integer adOrgId;
	private Integer adRoleId;
	private Integer adTableId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Boolean isexclude;
	private Boolean isreadonly;
	private String updated;
	private Integer updatedby;

	public AdColumnAccess() {
	}

	public AdColumnAccess(Integer adColumnId, Integer adRoleId) {
		this.adColumnId = adColumnId;
		this.adRoleId = adRoleId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Id
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getAdColumnId() {
		return adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Id
	@Column(name="AD_ROLE_ID", columnDefinition="INT")
	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT")
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsexclude() {
		return isexclude;
	}

	public void setIsexclude(Boolean isexclude) {
		this.isexclude = isexclude;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}