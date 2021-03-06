package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="gl_distributionline")
public class GLDistributionLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Integer accountID;
	private Boolean active;
	private Integer cActivityID;
	private Integer cBPartnerID;
	private Integer cCampaignID;
	private Integer cLocFromID;
	private Integer cLocToID;
	private Integer cProjectID;
	private Integer cSalesRegionID;
	private String created;
	private Integer createdBy;
	private String description;
	private Integer gLDistributionID;
	private Integer gLDistributionLineID;
	private Integer line;
	private Integer mProductID;
	private Integer orgID;
	private Boolean overwriteAcct;
	private Boolean overwriteActivity;
	private Boolean overwriteBPartner;
	private Boolean overwriteCampaign;
	private Boolean overwriteLocFrom;
	private Boolean overwriteLocTo;
	private Boolean overwriteOrg;
	private Boolean overwriteOrgTrx;
	private Boolean overwriteProduct;
	private Boolean overwriteProject;
	private Boolean overwriteSalesRegion;
	private Boolean overwriteUser1;
	private Boolean overwriteUser2;
	private BigDecimal percent;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;

	public GLDistributionLine() {
	}

	public GLDistributionLine(Integer gLDistributionLineID) {
		this.gLDistributionLineID = gLDistributionLineID;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getADOrgTrxID() {
		return aDOrgTrxID;
	}

	public void setADOrgTrxID(Integer aDOrgTrxID) {
		this.aDOrgTrxID = aDOrgTrxID;
	}

	@Basic
	@Column(name="ACCOUNT_ID", columnDefinition="INT")
	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
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
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityID() {
		return cActivityID;
	}

	public void setCActivityID(Integer cActivityID) {
		this.cActivityID = cActivityID;
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
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignID() {
		return cCampaignID;
	}

	public void setCCampaignID(Integer cCampaignID) {
		this.cCampaignID = cCampaignID;
	}

	@Basic
	@Column(name="C_LOCFROM_ID", columnDefinition="INT")
	public Integer getCLocFromID() {
		return cLocFromID;
	}

	public void setCLocFromID(Integer cLocFromID) {
		this.cLocFromID = cLocFromID;
	}

	@Basic
	@Column(name="C_LOCTO_ID", columnDefinition="INT")
	public Integer getCLocToID() {
		return cLocToID;
	}

	public void setCLocToID(Integer cLocToID) {
		this.cLocToID = cLocToID;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
	}

	@Basic
	@Column(name="C_SALESREGION_ID", columnDefinition="INT")
	public Integer getCSalesRegionID() {
		return cSalesRegionID;
	}

	public void setCSalesRegionID(Integer cSalesRegionID) {
		this.cSalesRegionID = cSalesRegionID;
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
	@Column(name="GL_DISTRIBUTION_ID", columnDefinition="INT", nullable=false)
	public Integer getGLDistributionID() {
		return gLDistributionID;
	}

	public void setGLDistributionID(Integer gLDistributionID) {
		this.gLDistributionID = gLDistributionID;
	}

	@Id
	@Column(name="GL_DISTRIBUTIONLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_924", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "GL_DistributionLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_924")
	public Integer getGLDistributionLineID() {
		return gLDistributionLineID;
	}

	public void setGLDistributionLineID(Integer gLDistributionLineID) {
		this.gLDistributionLineID = gLDistributionLineID;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
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
	@Column(name="ORG_ID", columnDefinition="INT")
	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteAcct() {
		return overwriteAcct;
	}

	public void setOverwriteAcct(Boolean overwriteAcct) {
		this.overwriteAcct = overwriteAcct;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteActivity() {
		return overwriteActivity;
	}

	public void setOverwriteActivity(Boolean overwriteActivity) {
		this.overwriteActivity = overwriteActivity;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteBPartner() {
		return overwriteBPartner;
	}

	public void setOverwriteBPartner(Boolean overwriteBPartner) {
		this.overwriteBPartner = overwriteBPartner;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteCampaign() {
		return overwriteCampaign;
	}

	public void setOverwriteCampaign(Boolean overwriteCampaign) {
		this.overwriteCampaign = overwriteCampaign;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteLocFrom() {
		return overwriteLocFrom;
	}

	public void setOverwriteLocFrom(Boolean overwriteLocFrom) {
		this.overwriteLocFrom = overwriteLocFrom;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteLocTo() {
		return overwriteLocTo;
	}

	public void setOverwriteLocTo(Boolean overwriteLocTo) {
		this.overwriteLocTo = overwriteLocTo;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteOrg() {
		return overwriteOrg;
	}

	public void setOverwriteOrg(Boolean overwriteOrg) {
		this.overwriteOrg = overwriteOrg;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteOrgTrx() {
		return overwriteOrgTrx;
	}

	public void setOverwriteOrgTrx(Boolean overwriteOrgTrx) {
		this.overwriteOrgTrx = overwriteOrgTrx;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteProduct() {
		return overwriteProduct;
	}

	public void setOverwriteProduct(Boolean overwriteProduct) {
		this.overwriteProduct = overwriteProduct;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteProject() {
		return overwriteProject;
	}

	public void setOverwriteProject(Boolean overwriteProject) {
		this.overwriteProject = overwriteProject;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteSalesRegion() {
		return overwriteSalesRegion;
	}

	public void setOverwriteSalesRegion(Boolean overwriteSalesRegion) {
		this.overwriteSalesRegion = overwriteSalesRegion;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteUser1() {
		return overwriteUser1;
	}

	public void setOverwriteUser1(Boolean overwriteUser1) {
		this.overwriteUser1 = overwriteUser1;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isOverwriteUser2() {
		return overwriteUser2;
	}

	public void setOverwriteUser2(Boolean overwriteUser2) {
		this.overwriteUser2 = overwriteUser2;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1ID() {
		return user1ID;
	}

	public void setUser1ID(Integer user1ID) {
		this.user1ID = user1ID;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2ID() {
		return user2ID;
	}

	public void setUser2ID(Integer user2ID) {
		this.user2ID = user2ID;
	}
}