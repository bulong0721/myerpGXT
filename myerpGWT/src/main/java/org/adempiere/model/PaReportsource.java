package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_reportsource")
public class PaReportsource extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cElementvalueId;
	private Integer cLocationId;
	private Integer cProjectId;
	private Integer cSalesregionId;
	private String created;
	private Integer createdby;
	private String description;
	private String elementtype;
	private String isactive;
	private String isincludenullsactivity;
	private String isincludenullsbpartner;
	private String isincludenullscampaign;
	private String isincludenullselementvalue;
	private String isincludenullslocation;
	private String isincludenullsorg;
	private String isincludenullsorgtrx;
	private String isincludenullsproduct;
	private String isincludenullsproject;
	private String isincludenullssalesregion;
	private String isincludenullsuserelement1;
	private String isincludenullsuserelement2;
	private Integer mProductId;
	private Integer orgId;
	private Integer paReportlineId;
	private Integer paReportsourceId;
	private String updated;
	private Integer updatedby;
	private Integer userelement1Id;
	private Integer userelement2Id;

	public PaReportsource() {
	}

	public PaReportsource(Integer paReportsourceId) {
		this.paReportsourceId = paReportsourceId;
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
	@Column(name="AD_ORGTRX_ID")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_ELEMENTVALUE_ID")
	public Integer getCElementvalueId() {
		return cElementvalueId;
	}

	public void setCElementvalueId(Integer cElementvalueId) {
		this.cElementvalueId = cElementvalueId;
	}

	@Basic
	@Column(name="C_LOCATION_ID")
	public Integer getCLocationId() {
		return cLocationId;
	}

	public void setCLocationId(Integer cLocationId) {
		this.cLocationId = cLocationId;
	}

	@Basic
	@Column(name="C_PROJECT_ID")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_SALESREGION_ID")
	public Integer getCSalesregionId() {
		return cSalesregionId;
	}

	public void setCSalesregionId(Integer cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getElementtype() {
		return elementtype;
	}

	public void setElementtype(String elementtype) {
		this.elementtype = elementtype;
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
	public String getIsincludenullsactivity() {
		return isincludenullsactivity;
	}

	public void setIsincludenullsactivity(String isincludenullsactivity) {
		this.isincludenullsactivity = isincludenullsactivity;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsbpartner() {
		return isincludenullsbpartner;
	}

	public void setIsincludenullsbpartner(String isincludenullsbpartner) {
		this.isincludenullsbpartner = isincludenullsbpartner;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullscampaign() {
		return isincludenullscampaign;
	}

	public void setIsincludenullscampaign(String isincludenullscampaign) {
		this.isincludenullscampaign = isincludenullscampaign;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullselementvalue() {
		return isincludenullselementvalue;
	}

	public void setIsincludenullselementvalue(String isincludenullselementvalue) {
		this.isincludenullselementvalue = isincludenullselementvalue;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullslocation() {
		return isincludenullslocation;
	}

	public void setIsincludenullslocation(String isincludenullslocation) {
		this.isincludenullslocation = isincludenullslocation;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsorg() {
		return isincludenullsorg;
	}

	public void setIsincludenullsorg(String isincludenullsorg) {
		this.isincludenullsorg = isincludenullsorg;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsorgtrx() {
		return isincludenullsorgtrx;
	}

	public void setIsincludenullsorgtrx(String isincludenullsorgtrx) {
		this.isincludenullsorgtrx = isincludenullsorgtrx;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsproduct() {
		return isincludenullsproduct;
	}

	public void setIsincludenullsproduct(String isincludenullsproduct) {
		this.isincludenullsproduct = isincludenullsproduct;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsproject() {
		return isincludenullsproject;
	}

	public void setIsincludenullsproject(String isincludenullsproject) {
		this.isincludenullsproject = isincludenullsproject;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullssalesregion() {
		return isincludenullssalesregion;
	}

	public void setIsincludenullssalesregion(String isincludenullssalesregion) {
		this.isincludenullssalesregion = isincludenullssalesregion;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsuserelement1() {
		return isincludenullsuserelement1;
	}

	public void setIsincludenullsuserelement1(String isincludenullsuserelement1) {
		this.isincludenullsuserelement1 = isincludenullsuserelement1;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsincludenullsuserelement2() {
		return isincludenullsuserelement2;
	}

	public void setIsincludenullsuserelement2(String isincludenullsuserelement2) {
		this.isincludenullsuserelement2 = isincludenullsuserelement2;
	}

	@Basic
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="ORG_ID")
	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	@Basic
	@Column(name="PA_REPORTLINE_ID", nullable=false)
	public Integer getPaReportlineId() {
		return paReportlineId;
	}

	public void setPaReportlineId(Integer paReportlineId) {
		this.paReportlineId = paReportlineId;
	}

	@Id
	@Column(name="PA_REPORTSOURCE_ID")
	public Integer getPaReportsourceId() {
		return paReportsourceId;
	}

	public void setPaReportsourceId(Integer paReportsourceId) {
		this.paReportsourceId = paReportsourceId;
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

	@Basic
	@Column(name="USERELEMENT1_ID")
	public Integer getUserelement1Id() {
		return userelement1Id;
	}

	public void setUserelement1Id(Integer userelement1Id) {
		this.userelement1Id = userelement1Id;
	}

	@Basic
	@Column(name="USERELEMENT2_ID")
	public Integer getUserelement2Id() {
		return userelement2Id;
	}

	public void setUserelement2Id(Integer userelement2Id) {
		this.userelement2Id = userelement2Id;
	}
}