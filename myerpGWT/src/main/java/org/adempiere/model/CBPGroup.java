package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bp_group")
public class CBPGroup extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDPrintColorID;
	private Boolean active;
	private Integer cBPGroupID;
	private Integer cDunningID;
	private Boolean confidentialInfo;
	private String created;
	private Integer createdBy;
	private BigDecimal creditWatchPercent;
	private String description;
	private Boolean isDefault;
	private Integer mDiscountSchemaID;
	private Integer mPriceListID;
	private String name;
	private Integer pODiscountSchemaID;
	private Integer pOPriceListID;
	private BigDecimal priceMatchTolerance;
	private String priorityBase;
	private String updated;
	private Integer updatedBy;
	private String value;

	public CBPGroup() {
	}

	public CBPGroup(Integer cBPGroupID) {
		this.cBPGroupID = cBPGroupID;
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

	@Id
	@Column(name="C_BP_GROUP_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_331", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_BP_Group", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_331")
	public Integer getCBPGroupID() {
		return cBPGroupID;
	}

	public void setCBPGroupID(Integer cBPGroupID) {
		this.cBPGroupID = cBPGroupID;
	}

	@Basic
	@Column(name="C_DUNNING_ID", columnDefinition="INT")
	public Integer getCDunningID() {
		return cDunningID;
	}

	public void setCDunningID(Integer cDunningID) {
		this.cDunningID = cDunningID;
	}

	@Basic
	@Column(name="ISCONFIDENTIALINFO", nullable=false)
	public Boolean isConfidentialInfo() {
		return confidentialInfo;
	}

	public void setConfidentialInfo(Boolean confidentialInfo) {
		this.confidentialInfo = confidentialInfo;
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
	public BigDecimal getCreditWatchPercent() {
		return creditWatchPercent;
	}

	public void setCreditWatchPercent(BigDecimal creditWatchPercent) {
		this.creditWatchPercent = creditWatchPercent;
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
	@Column(name="M_DISCOUNTSCHEMA_ID", columnDefinition="INT")
	public Integer getMDiscountSchemaID() {
		return mDiscountSchemaID;
	}

	public void setMDiscountSchemaID(Integer mDiscountSchemaID) {
		this.mDiscountSchemaID = mDiscountSchemaID;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT")
	public Integer getMPriceListID() {
		return mPriceListID;
	}

	public void setMPriceListID(Integer mPriceListID) {
		this.mPriceListID = mPriceListID;
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
	@Column(name="PO_DISCOUNTSCHEMA_ID", columnDefinition="INT")
	public Integer getPODiscountSchemaID() {
		return pODiscountSchemaID;
	}

	public void setPODiscountSchemaID(Integer pODiscountSchemaID) {
		this.pODiscountSchemaID = pODiscountSchemaID;
	}

	@Basic
	@Column(name="PO_PRICELIST_ID", columnDefinition="INT")
	public Integer getPOPriceListID() {
		return pOPriceListID;
	}

	public void setPOPriceListID(Integer pOPriceListID) {
		this.pOPriceListID = pOPriceListID;
	}

	@Basic
	public BigDecimal getPriceMatchTolerance() {
		return priceMatchTolerance;
	}

	public void setPriceMatchTolerance(BigDecimal priceMatchTolerance) {
		this.priceMatchTolerance = priceMatchTolerance;
	}

	@Basic
	@Column(length=1)
	public String getPriorityBase() {
		return priorityBase;
	}

	public void setPriorityBase(String priorityBase) {
		this.priorityBase = priorityBase;
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