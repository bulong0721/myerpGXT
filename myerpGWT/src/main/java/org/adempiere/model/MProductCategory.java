package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_product_category")
public class MProductCategory extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetGroupID;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDPrintColorID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean isDefault;
	private String mMPolicy;
	private Integer mProductCategoryID;
	private Integer mProductCategoryParentID;
	private String name;
	private BigDecimal plannedMargin;
	private Boolean selfService;
	private String updated;
	private Integer updatedBy;
	private String value;

	public MProductCategory() {
	}

	public MProductCategory(Integer mProductCategoryID) {
		this.mProductCategoryID = mProductCategoryID;
	}

	@Basic
	@Column(name="A_ASSET_GROUP_ID", columnDefinition="INT")
	public Integer getAAssetGroupID() {
		return aAssetGroupID;
	}

	public void setAAssetGroupID(Integer aAssetGroupID) {
		this.aAssetGroupID = aAssetGroupID;
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
	@Column(name="AD_PRINTCOLOR_ID", columnDefinition="INT")
	public Integer getADPrintColorID() {
		return aDPrintColorID;
	}

	public void setADPrintColorID(Integer aDPrintColorID) {
		this.aDPrintColorID = aDPrintColorID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getMMPolicy() {
		return mMPolicy;
	}

	public void setMMPolicy(String mMPolicy) {
		this.mMPolicy = mMPolicy;
	}

	@Id
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_115", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_Product_Category", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_115")
	public Integer getMProductCategoryID() {
		return mProductCategoryID;
	}

	public void setMProductCategoryID(Integer mProductCategoryID) {
		this.mProductCategoryID = mProductCategoryID;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_PARENT_ID", columnDefinition="INT")
	public Integer getMProductCategoryParentID() {
		return mProductCategoryParentID;
	}

	public void setMProductCategoryParentID(Integer mProductCategoryParentID) {
		this.mProductCategoryParentID = mProductCategoryParentID;
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
	public BigDecimal getPlannedMargin() {
		return plannedMargin;
	}

	public void setPlannedMargin(BigDecimal plannedMargin) {
		this.plannedMargin = plannedMargin;
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

	@Basic
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}