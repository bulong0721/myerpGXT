package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_clientinfo")
public class ADClientInfo extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTreeActivityID;
	private Integer aDTreeBPartnerID;
	private Integer aDTreeCampaignID;
	private Integer aDTreeMenuID;
	private Integer aDTreeOrgID;
	private Integer aDTreeProductID;
	private Integer aDTreeProjectID;
	private Integer aDTreeSalesRegionID;
	private Boolean active;
	private Integer cAcctSchema1ID;
	private Integer cBPartnerCashTrxID;
	private Integer cCalendarID;
	private Integer cUOMLengthID;
	private Integer cUOMTimeID;
	private Integer cUOMVolumeID;
	private Integer cUOMWeightID;
	private String created;
	private Integer createdBy;
	private Boolean discountLineAmt;
	private Integer keepLogDays;
	private Integer logoID;
	private Integer logoReportID;
	private Integer logoWebID;
	private Integer mProductFreightID;
	private String updated;
	private Integer updatedBy;

	public ADClientInfo() {
	}

	public ADClientInfo(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Id
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
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
	@Column(name="AD_TREE_ACTIVITY_ID", columnDefinition="INT")
	public Integer getADTreeActivityID() {
		return aDTreeActivityID;
	}

	public void setADTreeActivityID(Integer aDTreeActivityID) {
		this.aDTreeActivityID = aDTreeActivityID;
	}

	@Basic
	@Column(name="AD_TREE_BPARTNER_ID", columnDefinition="INT")
	public Integer getADTreeBPartnerID() {
		return aDTreeBPartnerID;
	}

	public void setADTreeBPartnerID(Integer aDTreeBPartnerID) {
		this.aDTreeBPartnerID = aDTreeBPartnerID;
	}

	@Basic
	@Column(name="AD_TREE_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getADTreeCampaignID() {
		return aDTreeCampaignID;
	}

	public void setADTreeCampaignID(Integer aDTreeCampaignID) {
		this.aDTreeCampaignID = aDTreeCampaignID;
	}

	@Basic
	@Column(name="AD_TREE_MENU_ID", columnDefinition="INT")
	public Integer getADTreeMenuID() {
		return aDTreeMenuID;
	}

	public void setADTreeMenuID(Integer aDTreeMenuID) {
		this.aDTreeMenuID = aDTreeMenuID;
	}

	@Basic
	@Column(name="AD_TREE_ORG_ID", columnDefinition="INT")
	public Integer getADTreeOrgID() {
		return aDTreeOrgID;
	}

	public void setADTreeOrgID(Integer aDTreeOrgID) {
		this.aDTreeOrgID = aDTreeOrgID;
	}

	@Basic
	@Column(name="AD_TREE_PRODUCT_ID", columnDefinition="INT")
	public Integer getADTreeProductID() {
		return aDTreeProductID;
	}

	public void setADTreeProductID(Integer aDTreeProductID) {
		this.aDTreeProductID = aDTreeProductID;
	}

	@Basic
	@Column(name="AD_TREE_PROJECT_ID", columnDefinition="INT")
	public Integer getADTreeProjectID() {
		return aDTreeProjectID;
	}

	public void setADTreeProjectID(Integer aDTreeProjectID) {
		this.aDTreeProjectID = aDTreeProjectID;
	}

	@Basic
	@Column(name="AD_TREE_SALESREGION_ID", columnDefinition="INT")
	public Integer getADTreeSalesRegionID() {
		return aDTreeSalesRegionID;
	}

	public void setADTreeSalesRegionID(Integer aDTreeSalesRegionID) {
		this.aDTreeSalesRegionID = aDTreeSalesRegionID;
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
	@Column(name="C_ACCTSCHEMA1_ID", columnDefinition="INT")
	public Integer getCAcctSchema1ID() {
		return cAcctSchema1ID;
	}

	public void setCAcctSchema1ID(Integer cAcctSchema1ID) {
		this.cAcctSchema1ID = cAcctSchema1ID;
	}

	@Basic
	@Column(name="C_BPARTNERCASHTRX_ID", columnDefinition="INT")
	public Integer getCBPartnerCashTrxID() {
		return cBPartnerCashTrxID;
	}

	public void setCBPartnerCashTrxID(Integer cBPartnerCashTrxID) {
		this.cBPartnerCashTrxID = cBPartnerCashTrxID;
	}

	@Basic
	@Column(name="C_CALENDAR_ID", columnDefinition="INT")
	public Integer getCCalendarID() {
		return cCalendarID;
	}

	public void setCCalendarID(Integer cCalendarID) {
		this.cCalendarID = cCalendarID;
	}

	@Basic
	@Column(name="C_UOM_LENGTH_ID", columnDefinition="INT")
	public Integer getCUOMLengthID() {
		return cUOMLengthID;
	}

	public void setCUOMLengthID(Integer cUOMLengthID) {
		this.cUOMLengthID = cUOMLengthID;
	}

	@Basic
	@Column(name="C_UOM_TIME_ID", columnDefinition="INT")
	public Integer getCUOMTimeID() {
		return cUOMTimeID;
	}

	public void setCUOMTimeID(Integer cUOMTimeID) {
		this.cUOMTimeID = cUOMTimeID;
	}

	@Basic
	@Column(name="C_UOM_VOLUME_ID", columnDefinition="INT")
	public Integer getCUOMVolumeID() {
		return cUOMVolumeID;
	}

	public void setCUOMVolumeID(Integer cUOMVolumeID) {
		this.cUOMVolumeID = cUOMVolumeID;
	}

	@Basic
	@Column(name="C_UOM_WEIGHT_ID", columnDefinition="INT")
	public Integer getCUOMWeightID() {
		return cUOMWeightID;
	}

	public void setCUOMWeightID(Integer cUOMWeightID) {
		this.cUOMWeightID = cUOMWeightID;
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
	@Column(name="ISDISCOUNTLINEAMT", nullable=false)
	public Boolean isDiscountLineAmt() {
		return discountLineAmt;
	}

	public void setDiscountLineAmt(Boolean discountLineAmt) {
		this.discountLineAmt = discountLineAmt;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getKeepLogDays() {
		return keepLogDays;
	}

	public void setKeepLogDays(Integer keepLogDays) {
		this.keepLogDays = keepLogDays;
	}

	@Basic
	@Column(name="LOGO_ID", columnDefinition="INT")
	public Integer getLogoID() {
		return logoID;
	}

	public void setLogoID(Integer logoID) {
		this.logoID = logoID;
	}

	@Basic
	@Column(name="LOGOREPORT_ID", columnDefinition="INT")
	public Integer getLogoReportID() {
		return logoReportID;
	}

	public void setLogoReportID(Integer logoReportID) {
		this.logoReportID = logoReportID;
	}

	@Basic
	@Column(name="LOGOWEB_ID", columnDefinition="INT")
	public Integer getLogoWebID() {
		return logoWebID;
	}

	public void setLogoWebID(Integer logoWebID) {
		this.logoWebID = logoWebID;
	}

	@Basic
	@Column(name="M_PRODUCTFREIGHT_ID", columnDefinition="INT")
	public Integer getMProductFreightID() {
		return mProductFreightID;
	}

	public void setMProductFreightID(Integer mProductFreightID) {
		this.mProductFreightID = mProductFreightID;
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