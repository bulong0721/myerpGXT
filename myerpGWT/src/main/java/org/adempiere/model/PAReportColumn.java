package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_reportcolumn")
public class PAReportColumn extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Boolean active;
	private String adhocConversion;
	private String amountType;
	private Integer cActivityID;
	private Integer cBPartnerID;
	private Integer cCampaignID;
	private Integer cCurrencyID;
	private Integer cElementValueID;
	private Integer cLocationID;
	private Integer cProjectID;
	private Integer cSalesRegionID;
	private String calculationType;
	private String columnType;
	private String created;
	private Integer createdBy;
	private String currencyType;
	private String description;
	private String elementType;
	private String factor;
	private String formatPattern;
	private Integer gLBudgetID;
	private Boolean includeNullsActivity;
	private Boolean includeNullsBPartner;
	private Boolean includeNullsCampaign;
	private Boolean includeNullsElementValue;
	private Boolean includeNullsLocation;
	private Boolean includeNullsOrg;
	private Boolean includeNullsOrgTrx;
	private Boolean includeNullsProduct;
	private Boolean includeNullsProject;
	private Boolean includeNullsSalesRegion;
	private Boolean includeNullsUserElement1;
	private Boolean includeNullsUserElement2;
	private Integer mProductID;
	private String name;
	private Integer oper1ID;
	private Integer oper2ID;
	private Integer orgID;
	private String pAAmountType;
	private String pAPeriodType;
	private Integer pAReportColumnID;
	private Integer pAReportColumnSetID;
	private String postingType;
	private Boolean printed;
	private Integer relativePeriod;
	private Integer seqNo;
	private String updated;
	private Integer updatedBy;
	private Integer userElement1ID;
	private Integer userElement2ID;

	public PAReportColumn() {
	}

	public PAReportColumn(Integer pAReportColumnID) {
		this.pAReportColumnID = pAReportColumnID;
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
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="ISADHOCCONVERSION", length=1)
	public String getAdhocConversion() {
		return adhocConversion;
	}

	public void setAdhocConversion(String adhocConversion) {
		this.adhocConversion = adhocConversion;
	}

	@Basic
	@Column(length=2)
	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
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
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_ELEMENTVALUE_ID", columnDefinition="INT")
	public Integer getCElementValueID() {
		return cElementValueID;
	}

	public void setCElementValueID(Integer cElementValueID) {
		this.cElementValueID = cElementValueID;
	}

	@Basic
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	public Integer getCLocationID() {
		return cLocationID;
	}

	public void setCLocationID(Integer cLocationID) {
		this.cLocationID = cLocationID;
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
	@Column(length=1)
	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
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
	@Column(length=1)
	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2)
	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	@Basic
	@Column(length=1)
	public String getFactor() {
		return factor;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}

	@Basic
	@Column(length=22)
	public String getFormatPattern() {
		return formatPattern;
	}

	public void setFormatPattern(String formatPattern) {
		this.formatPattern = formatPattern;
	}

	@Basic
	@Column(name="GL_BUDGET_ID", columnDefinition="INT")
	public Integer getGLBudgetID() {
		return gLBudgetID;
	}

	public void setGLBudgetID(Integer gLBudgetID) {
		this.gLBudgetID = gLBudgetID;
	}

	@Basic
	@Column(name="ISINCLUDENULLSACTIVITY", nullable=false)
	public Boolean isIncludeNullsActivity() {
		return includeNullsActivity;
	}

	public void setIncludeNullsActivity(Boolean includeNullsActivity) {
		this.includeNullsActivity = includeNullsActivity;
	}

	@Basic
	@Column(name="ISINCLUDENULLSBPARTNER", nullable=false)
	public Boolean isIncludeNullsBPartner() {
		return includeNullsBPartner;
	}

	public void setIncludeNullsBPartner(Boolean includeNullsBPartner) {
		this.includeNullsBPartner = includeNullsBPartner;
	}

	@Basic
	@Column(name="ISINCLUDENULLSCAMPAIGN", nullable=false)
	public Boolean isIncludeNullsCampaign() {
		return includeNullsCampaign;
	}

	public void setIncludeNullsCampaign(Boolean includeNullsCampaign) {
		this.includeNullsCampaign = includeNullsCampaign;
	}

	@Basic
	@Column(name="ISINCLUDENULLSELEMENTVALUE", nullable=false)
	public Boolean isIncludeNullsElementValue() {
		return includeNullsElementValue;
	}

	public void setIncludeNullsElementValue(Boolean includeNullsElementValue) {
		this.includeNullsElementValue = includeNullsElementValue;
	}

	@Basic
	@Column(name="ISINCLUDENULLSLOCATION", nullable=false)
	public Boolean isIncludeNullsLocation() {
		return includeNullsLocation;
	}

	public void setIncludeNullsLocation(Boolean includeNullsLocation) {
		this.includeNullsLocation = includeNullsLocation;
	}

	@Basic
	@Column(name="ISINCLUDENULLSORG", nullable=false)
	public Boolean isIncludeNullsOrg() {
		return includeNullsOrg;
	}

	public void setIncludeNullsOrg(Boolean includeNullsOrg) {
		this.includeNullsOrg = includeNullsOrg;
	}

	@Basic
	@Column(name="ISINCLUDENULLSORGTRX", nullable=false)
	public Boolean isIncludeNullsOrgTrx() {
		return includeNullsOrgTrx;
	}

	public void setIncludeNullsOrgTrx(Boolean includeNullsOrgTrx) {
		this.includeNullsOrgTrx = includeNullsOrgTrx;
	}

	@Basic
	@Column(name="ISINCLUDENULLSPRODUCT", nullable=false)
	public Boolean isIncludeNullsProduct() {
		return includeNullsProduct;
	}

	public void setIncludeNullsProduct(Boolean includeNullsProduct) {
		this.includeNullsProduct = includeNullsProduct;
	}

	@Basic
	@Column(name="ISINCLUDENULLSPROJECT", nullable=false)
	public Boolean isIncludeNullsProject() {
		return includeNullsProject;
	}

	public void setIncludeNullsProject(Boolean includeNullsProject) {
		this.includeNullsProject = includeNullsProject;
	}

	@Basic
	@Column(name="ISINCLUDENULLSSALESREGION", nullable=false)
	public Boolean isIncludeNullsSalesRegion() {
		return includeNullsSalesRegion;
	}

	public void setIncludeNullsSalesRegion(Boolean includeNullsSalesRegion) {
		this.includeNullsSalesRegion = includeNullsSalesRegion;
	}

	@Basic
	@Column(name="ISINCLUDENULLSUSERELEMENT1", nullable=false)
	public Boolean isIncludeNullsUserElement1() {
		return includeNullsUserElement1;
	}

	public void setIncludeNullsUserElement1(Boolean includeNullsUserElement1) {
		this.includeNullsUserElement1 = includeNullsUserElement1;
	}

	@Basic
	@Column(name="ISINCLUDENULLSUSERELEMENT2", nullable=false)
	public Boolean isIncludeNullsUserElement2() {
		return includeNullsUserElement2;
	}

	public void setIncludeNullsUserElement2(Boolean includeNullsUserElement2) {
		this.includeNullsUserElement2 = includeNullsUserElement2;
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
	@Column(name="OPER_1_ID", columnDefinition="INT")
	public Integer getOper1ID() {
		return oper1ID;
	}

	public void setOper1ID(Integer oper1ID) {
		this.oper1ID = oper1ID;
	}

	@Basic
	@Column(name="OPER_2_ID", columnDefinition="INT")
	public Integer getOper2ID() {
		return oper2ID;
	}

	public void setOper2ID(Integer oper2ID) {
		this.oper2ID = oper2ID;
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
	@Column(length=1)
	public String getPAAmountType() {
		return pAAmountType;
	}

	public void setPAAmountType(String pAAmountType) {
		this.pAAmountType = pAAmountType;
	}

	@Basic
	@Column(length=1)
	public String getPAPeriodType() {
		return pAPeriodType;
	}

	public void setPAPeriodType(String pAPeriodType) {
		this.pAPeriodType = pAPeriodType;
	}

	@Id
	@Column(name="PA_REPORTCOLUMN_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_496", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PA_ReportColumn", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_496")
	public Integer getPAReportColumnID() {
		return pAReportColumnID;
	}

	public void setPAReportColumnID(Integer pAReportColumnID) {
		this.pAReportColumnID = pAReportColumnID;
	}

	@Basic
	@Column(name="PA_REPORTCOLUMNSET_ID", columnDefinition="INT", nullable=false)
	public Integer getPAReportColumnSetID() {
		return pAReportColumnSetID;
	}

	public void setPAReportColumnSetID(Integer pAReportColumnSetID) {
		this.pAReportColumnSetID = pAReportColumnSetID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPostingType() {
		return postingType;
	}

	public void setPostingType(String postingType) {
		this.postingType = postingType;
	}

	@Basic
	@Column(name="ISPRINTED", nullable=false)
	public Boolean isPrinted() {
		return printed;
	}

	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getRelativePeriod() {
		return relativePeriod;
	}

	public void setRelativePeriod(Integer relativePeriod) {
		this.relativePeriod = relativePeriod;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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
	@Column(name="USERELEMENT1_ID", columnDefinition="INT")
	public Integer getUserElement1ID() {
		return userElement1ID;
	}

	public void setUserElement1ID(Integer userElement1ID) {
		this.userElement1ID = userElement1ID;
	}

	@Basic
	@Column(name="USERELEMENT2_ID", columnDefinition="INT")
	public Integer getUserElement2ID() {
		return userElement2ID;
	}

	public void setUserElement2ID(Integer userElement2ID) {
		this.userElement2ID = userElement2ID;
	}
}