package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_template_ad_cat")
@IdClass(org.adempiere.model.CMTemplateAdCatPK.class)
public class CMTemplateAdCat extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cMAdCatID;
	private Integer cMTemplateID;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private String updated;
	private Integer updatedBy;

	public CMTemplateAdCat() {
	}

	public CMTemplateAdCat(Integer cMAdCatID, Integer cMTemplateID) {
		this.cMAdCatID = cMAdCatID;
		this.cMTemplateID = cMTemplateID;
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
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Id
	@Column(name="CM_AD_CAT_ID", columnDefinition="INT")
	public Integer getCMAdCatID() {
		return cMAdCatID;
	}

	public void setCMAdCatID(Integer cMAdCatID) {
		this.cMAdCatID = cMAdCatID;
	}

	@Id
	@Column(name="CM_TEMPLATE_ID", columnDefinition="INT")
	public Integer getCMTemplateID() {
		return cMTemplateID;
	}

	public void setCMTemplateID(Integer cMTemplateID) {
		this.cMTemplateID = cMTemplateID;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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