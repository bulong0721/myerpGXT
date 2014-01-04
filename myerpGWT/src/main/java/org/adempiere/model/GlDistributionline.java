package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="gl_distributionline")
public class GlDistributionline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer accountId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cLocfromId;
	private Integer cLoctoId;
	private Integer cProjectId;
	private Integer cSalesregionId;
	private String created;
	private Integer createdby;
	private String description;
	private Integer glDistributionId;
	private Integer glDistributionlineId;
	private String isactive;
	private Integer line;
	private Integer mProductId;
	private Integer orgId;
	private String overwriteacct;
	private String overwriteactivity;
	private String overwritebpartner;
	private String overwritecampaign;
	private String overwritelocfrom;
	private String overwritelocto;
	private String overwriteorg;
	private String overwriteorgtrx;
	private String overwriteproduct;
	private String overwriteproject;
	private String overwritesalesregion;
	private String overwriteuser1;
	private String overwriteuser2;
	private BigDecimal percent;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;

	public GlDistributionline() {
	}

	public GlDistributionline(Integer glDistributionlineId) {
		this.glDistributionlineId = glDistributionlineId;
	}

	@Basic
	@Column(name="ACCOUNT_ID")
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
	@Column(name="C_LOCFROM_ID")
	public Integer getCLocfromId() {
		return cLocfromId;
	}

	public void setCLocfromId(Integer cLocfromId) {
		this.cLocfromId = cLocfromId;
	}

	@Basic
	@Column(name="C_LOCTO_ID")
	public Integer getCLoctoId() {
		return cLoctoId;
	}

	public void setCLoctoId(Integer cLoctoId) {
		this.cLoctoId = cLoctoId;
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
	@Column(name="GL_DISTRIBUTION_ID", nullable=false)
	public Integer getGlDistributionId() {
		return glDistributionId;
	}

	public void setGlDistributionId(Integer glDistributionId) {
		this.glDistributionId = glDistributionId;
	}

	@Id
	@Column(name="GL_DISTRIBUTIONLINE_ID")
	public Integer getGlDistributionlineId() {
		return glDistributionlineId;
	}

	public void setGlDistributionlineId(Integer glDistributionlineId) {
		this.glDistributionlineId = glDistributionlineId;
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
	@Column(nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
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
	@Column(nullable=false, length=1)
	public String getOverwriteacct() {
		return overwriteacct;
	}

	public void setOverwriteacct(String overwriteacct) {
		this.overwriteacct = overwriteacct;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteactivity() {
		return overwriteactivity;
	}

	public void setOverwriteactivity(String overwriteactivity) {
		this.overwriteactivity = overwriteactivity;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwritebpartner() {
		return overwritebpartner;
	}

	public void setOverwritebpartner(String overwritebpartner) {
		this.overwritebpartner = overwritebpartner;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwritecampaign() {
		return overwritecampaign;
	}

	public void setOverwritecampaign(String overwritecampaign) {
		this.overwritecampaign = overwritecampaign;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwritelocfrom() {
		return overwritelocfrom;
	}

	public void setOverwritelocfrom(String overwritelocfrom) {
		this.overwritelocfrom = overwritelocfrom;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwritelocto() {
		return overwritelocto;
	}

	public void setOverwritelocto(String overwritelocto) {
		this.overwritelocto = overwritelocto;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteorg() {
		return overwriteorg;
	}

	public void setOverwriteorg(String overwriteorg) {
		this.overwriteorg = overwriteorg;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteorgtrx() {
		return overwriteorgtrx;
	}

	public void setOverwriteorgtrx(String overwriteorgtrx) {
		this.overwriteorgtrx = overwriteorgtrx;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteproduct() {
		return overwriteproduct;
	}

	public void setOverwriteproduct(String overwriteproduct) {
		this.overwriteproduct = overwriteproduct;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteproject() {
		return overwriteproject;
	}

	public void setOverwriteproject(String overwriteproject) {
		this.overwriteproject = overwriteproject;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwritesalesregion() {
		return overwritesalesregion;
	}

	public void setOverwritesalesregion(String overwritesalesregion) {
		this.overwritesalesregion = overwritesalesregion;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteuser1() {
		return overwriteuser1;
	}

	public void setOverwriteuser1(String overwriteuser1) {
		this.overwriteuser1 = overwriteuser1;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getOverwriteuser2() {
		return overwriteuser2;
	}

	public void setOverwriteuser2(String overwriteuser2) {
		this.overwriteuser2 = overwriteuser2;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
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
	@Column(name="USER1_ID")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}
}