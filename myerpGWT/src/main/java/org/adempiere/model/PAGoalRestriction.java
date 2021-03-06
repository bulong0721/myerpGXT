package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_goalrestriction")
public class PAGoalRestriction extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPGroupID;
	private Integer cBPartnerID;
	private String created;
	private Integer createdBy;
	private String goalRestrictionType;
	private Integer mProductCategoryID;
	private Integer mProductID;
	private String name;
	private Integer orgID;
	private Integer pAGoalID;
	private Integer pAGoalRestrictionID;
	private String updated;
	private Integer updatedBy;

	public PAGoalRestriction() {
	}

	public PAGoalRestriction(Integer pAGoalRestrictionID) {
		this.pAGoalRestrictionID = pAGoalRestrictionID;
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

	@Basic
	@Column(name="C_BP_GROUP_ID", columnDefinition="INT")
	public Integer getCBPGroupID() {
		return cBPGroupID;
	}

	public void setCBPGroupID(Integer cBPGroupID) {
		this.cBPGroupID = cBPGroupID;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
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
	@Column(nullable=false, length=1)
	public String getGoalRestrictionType() {
		return goalRestrictionType;
	}

	public void setGoalRestrictionType(String goalRestrictionType) {
		this.goalRestrictionType = goalRestrictionType;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	public Integer getMProductCategoryID() {
		return mProductCategoryID;
	}

	public void setMProductCategoryID(Integer mProductCategoryID) {
		this.mProductCategoryID = mProductCategoryID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
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
	@Column(name="ORG_ID", columnDefinition="INT")
	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}

	@Basic
	@Column(name="PA_GOAL_ID", columnDefinition="INT", nullable=false)
	public Integer getPAGoalID() {
		return pAGoalID;
	}

	public void setPAGoalID(Integer pAGoalID) {
		this.pAGoalID = pAGoalID;
	}

	@Id
	@Column(name="PA_GOALRESTRICTION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1195", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PA_GoalRestriction", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1195")
	public Integer getPAGoalRestrictionID() {
		return pAGoalRestrictionID;
	}

	public void setPAGoalRestrictionID(Integer pAGoalRestrictionID) {
		this.pAGoalRestrictionID = pAGoalRestrictionID;
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