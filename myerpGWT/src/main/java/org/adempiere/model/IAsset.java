package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_asset")
public class IAsset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAccumdepreciationAcct;
	private BigDecimal aAccumulatedDepr;
	private Integer aAssetAcct;
	private BigDecimal aAssetCost;
	private Integer aAssetGroupID;
	private Integer aAssetID;
	private Integer aAssetLifeCurrentYear;
	private Integer aAssetLifeYears;
	private String aAssetSpreadType;
	private BigDecimal aBaseAmount;
	private BigDecimal aCalcAccumulatedDepr;
	private BigDecimal aCurrDepExp;
	private Integer aCurrentPeriod;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Integer aDepreciationAcct;
	private String aDepreciationCalcType;
	private BigDecimal aDepreciationManualAmount;
	private String aDepreciationManualPeriod;
	private Integer aDepreciationTableHeaderID;
	private BigDecimal aDepreciationVariablePerc;
	private String aDisposalLoss;
	private String aDisposalRevenue;
	private Integer aLifePeriod;
	private Integer aParentAssetID;
	private Integer aPeriodEnd;
	private Integer aPeriodPosted;
	private Integer aPeriodStart;
	private BigDecimal aPriorYearAccumulatedDepr;
	private Integer aQTYCurrent;
	private Integer aQTYOriginal;
	private String aRevalAccumdepOffsetCur;
	private String aRevalAccumdepOffsetPrior;
	private String aRevalCalMethod;
	private String aRevalCostOffset;
	private String aRevalCostOffsetPrior;
	private String aRevalDepexpOffset;
	private BigDecimal aSalvageValue;
	private BigDecimal aSplitPercent;
	private Boolean active;
	private String assetDepreciationDate;
	private String assetDisposalDate;
	private BigDecimal assetMarketValueAmt;
	private String assetServiceDate;
	private Integer cAcctSchemaID;
	private Integer cBPartnerID;
	private Integer cBPartnerLocationID;
	private Integer cLocationID;
	private String conventionType;
	private String created;
	private Integer createdBy;
	private Boolean depreciated;
	private String depreciationType;
	private String description;
	private Boolean disposed;
	private Boolean fullyDepreciated;
	private String guaranteeDate;
	private String help;
	private Integer iAssetID;
	private String iErrorMsg;
	private Boolean iIsImported;
	private Boolean inPosession;
	private Integer lifeUseUnits;
	private String locationComment;
	private String lot;
	private Integer mAttributeSetInstanceID;
	private Integer mLocatorID;
	private Integer mProductID;
	private String name;
	private Boolean owned;
	private String postingType;
	private Boolean processed;
	private Boolean processing;
	private String serNo;
	private String updated;
	private Integer updatedBy;
	private Integer useLifeMonths;
	private Integer useLifeYears;
	private Integer useUnits;
	private String value;
	private String versionNo;

	public IAsset() {
	}

	public IAsset(Integer iAssetID) {
		this.iAssetID = iAssetID;
	}

	@Basic
	@Column(name="A_ACCUMDEPRECIATION_ACCT", columnDefinition="INT")
	public Integer getAAccumdepreciationAcct() {
		return aAccumdepreciationAcct;
	}

	public void setAAccumdepreciationAcct(Integer aAccumdepreciationAcct) {
		this.aAccumdepreciationAcct = aAccumdepreciationAcct;
	}

	@Basic
	@Column(name="A_ACCUMULATED_DEPR")
	public BigDecimal getAAccumulatedDepr() {
		return aAccumulatedDepr;
	}

	public void setAAccumulatedDepr(BigDecimal aAccumulatedDepr) {
		this.aAccumulatedDepr = aAccumulatedDepr;
	}

	@Basic
	@Column(name="A_ASSET_ACCT", columnDefinition="INT")
	public Integer getAAssetAcct() {
		return aAssetAcct;
	}

	public void setAAssetAcct(Integer aAssetAcct) {
		this.aAssetAcct = aAssetAcct;
	}

	@Basic
	@Column(name="A_ASSET_COST")
	public BigDecimal getAAssetCost() {
		return aAssetCost;
	}

	public void setAAssetCost(BigDecimal aAssetCost) {
		this.aAssetCost = aAssetCost;
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
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	public Integer getAAssetID() {
		return aAssetID;
	}

	public void setAAssetID(Integer aAssetID) {
		this.aAssetID = aAssetID;
	}

	@Basic
	@Column(name="A_ASSET_LIFE_CURRENT_YEAR", columnDefinition="INT")
	public Integer getAAssetLifeCurrentYear() {
		return aAssetLifeCurrentYear;
	}

	public void setAAssetLifeCurrentYear(Integer aAssetLifeCurrentYear) {
		this.aAssetLifeCurrentYear = aAssetLifeCurrentYear;
	}

	@Basic
	@Column(name="A_ASSET_LIFE_YEARS", columnDefinition="INT")
	public Integer getAAssetLifeYears() {
		return aAssetLifeYears;
	}

	public void setAAssetLifeYears(Integer aAssetLifeYears) {
		this.aAssetLifeYears = aAssetLifeYears;
	}

	@Basic
	@Column(name="A_ASSET_SPREAD_TYPE", length=10)
	public String getAAssetSpreadType() {
		return aAssetSpreadType;
	}

	public void setAAssetSpreadType(String aAssetSpreadType) {
		this.aAssetSpreadType = aAssetSpreadType;
	}

	@Basic
	@Column(name="A_BASE_AMOUNT")
	public BigDecimal getABaseAmount() {
		return aBaseAmount;
	}

	public void setABaseAmount(BigDecimal aBaseAmount) {
		this.aBaseAmount = aBaseAmount;
	}

	@Basic
	@Column(name="A_CALC_ACCUMULATED_DEPR")
	public BigDecimal getACalcAccumulatedDepr() {
		return aCalcAccumulatedDepr;
	}

	public void setACalcAccumulatedDepr(BigDecimal aCalcAccumulatedDepr) {
		this.aCalcAccumulatedDepr = aCalcAccumulatedDepr;
	}

	@Basic
	@Column(name="A_CURR_DEP_EXP")
	public BigDecimal getACurrDepExp() {
		return aCurrDepExp;
	}

	public void setACurrDepExp(BigDecimal aCurrDepExp) {
		this.aCurrDepExp = aCurrDepExp;
	}

	@Basic
	@Column(name="A_CURRENT_PERIOD", columnDefinition="INT")
	public Integer getACurrentPeriod() {
		return aCurrentPeriod;
	}

	public void setACurrentPeriod(Integer aCurrentPeriod) {
		this.aCurrentPeriod = aCurrentPeriod;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	@Basic
	@Column(name="A_DEPRECIATION_ACCT", columnDefinition="INT")
	public Integer getADepreciationAcct() {
		return aDepreciationAcct;
	}

	public void setADepreciationAcct(Integer aDepreciationAcct) {
		this.aDepreciationAcct = aDepreciationAcct;
	}

	@Basic
	@Column(name="A_DEPRECIATION_CALC_TYPE", length=10)
	public String getADepreciationCalcType() {
		return aDepreciationCalcType;
	}

	public void setADepreciationCalcType(String aDepreciationCalcType) {
		this.aDepreciationCalcType = aDepreciationCalcType;
	}

	@Basic
	@Column(name="A_DEPRECIATION_MANUAL_AMOUNT")
	public BigDecimal getADepreciationManualAmount() {
		return aDepreciationManualAmount;
	}

	public void setADepreciationManualAmount(BigDecimal aDepreciationManualAmount) {
		this.aDepreciationManualAmount = aDepreciationManualAmount;
	}

	@Basic
	@Column(name="A_DEPRECIATION_MANUAL_PERIOD", length=2)
	public String getADepreciationManualPeriod() {
		return aDepreciationManualPeriod;
	}

	public void setADepreciationManualPeriod(String aDepreciationManualPeriod) {
		this.aDepreciationManualPeriod = aDepreciationManualPeriod;
	}

	@Basic
	@Column(name="A_DEPRECIATION_TABLE_HEADER_ID", columnDefinition="INT")
	public Integer getADepreciationTableHeaderID() {
		return aDepreciationTableHeaderID;
	}

	public void setADepreciationTableHeaderID(Integer aDepreciationTableHeaderID) {
		this.aDepreciationTableHeaderID = aDepreciationTableHeaderID;
	}

	@Basic
	@Column(name="A_DEPRECIATION_VARIABLE_PERC")
	public BigDecimal getADepreciationVariablePerc() {
		return aDepreciationVariablePerc;
	}

	public void setADepreciationVariablePerc(BigDecimal aDepreciationVariablePerc) {
		this.aDepreciationVariablePerc = aDepreciationVariablePerc;
	}

	@Basic
	@Column(name="A_DISPOSAL_LOSS", length=22)
	public String getADisposalLoss() {
		return aDisposalLoss;
	}

	public void setADisposalLoss(String aDisposalLoss) {
		this.aDisposalLoss = aDisposalLoss;
	}

	@Basic
	@Column(name="A_DISPOSAL_REVENUE", length=22)
	public String getADisposalRevenue() {
		return aDisposalRevenue;
	}

	public void setADisposalRevenue(String aDisposalRevenue) {
		this.aDisposalRevenue = aDisposalRevenue;
	}

	@Basic
	@Column(name="A_LIFE_PERIOD", columnDefinition="INT")
	public Integer getALifePeriod() {
		return aLifePeriod;
	}

	public void setALifePeriod(Integer aLifePeriod) {
		this.aLifePeriod = aLifePeriod;
	}

	@Basic
	@Column(name="A_PARENT_ASSET_ID", columnDefinition="INT")
	public Integer getAParentAssetID() {
		return aParentAssetID;
	}

	public void setAParentAssetID(Integer aParentAssetID) {
		this.aParentAssetID = aParentAssetID;
	}

	@Basic
	@Column(name="A_PERIOD_END", columnDefinition="INT")
	public Integer getAPeriodEnd() {
		return aPeriodEnd;
	}

	public void setAPeriodEnd(Integer aPeriodEnd) {
		this.aPeriodEnd = aPeriodEnd;
	}

	@Basic
	@Column(name="A_PERIOD_POSTED", columnDefinition="INT")
	public Integer getAPeriodPosted() {
		return aPeriodPosted;
	}

	public void setAPeriodPosted(Integer aPeriodPosted) {
		this.aPeriodPosted = aPeriodPosted;
	}

	@Basic
	@Column(name="A_PERIOD_START", columnDefinition="INT")
	public Integer getAPeriodStart() {
		return aPeriodStart;
	}

	public void setAPeriodStart(Integer aPeriodStart) {
		this.aPeriodStart = aPeriodStart;
	}

	@Basic
	@Column(name="A_PRIOR_YEAR_ACCUMULATED_DEPR")
	public BigDecimal getAPriorYearAccumulatedDepr() {
		return aPriorYearAccumulatedDepr;
	}

	public void setAPriorYearAccumulatedDepr(BigDecimal aPriorYearAccumulatedDepr) {
		this.aPriorYearAccumulatedDepr = aPriorYearAccumulatedDepr;
	}

	@Basic
	@Column(name="A_QTY_CURRENT", columnDefinition="INT")
	public Integer getAQTYCurrent() {
		return aQTYCurrent;
	}

	public void setAQTYCurrent(Integer aQTYCurrent) {
		this.aQTYCurrent = aQTYCurrent;
	}

	@Basic
	@Column(name="A_QTY_ORIGINAL", columnDefinition="INT")
	public Integer getAQTYOriginal() {
		return aQTYOriginal;
	}

	public void setAQTYOriginal(Integer aQTYOriginal) {
		this.aQTYOriginal = aQTYOriginal;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_CUR", length=22)
	public String getARevalAccumdepOffsetCur() {
		return aRevalAccumdepOffsetCur;
	}

	public void setARevalAccumdepOffsetCur(String aRevalAccumdepOffsetCur) {
		this.aRevalAccumdepOffsetCur = aRevalAccumdepOffsetCur;
	}

	@Basic
	@Column(name="A_REVAL_ACCUMDEP_OFFSET_PRIOR", length=22)
	public String getARevalAccumdepOffsetPrior() {
		return aRevalAccumdepOffsetPrior;
	}

	public void setARevalAccumdepOffsetPrior(String aRevalAccumdepOffsetPrior) {
		this.aRevalAccumdepOffsetPrior = aRevalAccumdepOffsetPrior;
	}

	@Basic
	@Column(name="A_REVAL_CAL_METHOD", length=3)
	public String getARevalCalMethod() {
		return aRevalCalMethod;
	}

	public void setARevalCalMethod(String aRevalCalMethod) {
		this.aRevalCalMethod = aRevalCalMethod;
	}

	@Basic
	@Column(name="A_REVAL_COST_OFFSET", length=22)
	public String getARevalCostOffset() {
		return aRevalCostOffset;
	}

	public void setARevalCostOffset(String aRevalCostOffset) {
		this.aRevalCostOffset = aRevalCostOffset;
	}

	@Basic
	@Column(name="A_REVAL_COST_OFFSET_PRIOR", length=22)
	public String getARevalCostOffsetPrior() {
		return aRevalCostOffsetPrior;
	}

	public void setARevalCostOffsetPrior(String aRevalCostOffsetPrior) {
		this.aRevalCostOffsetPrior = aRevalCostOffsetPrior;
	}

	@Basic
	@Column(name="A_REVAL_DEPEXP_OFFSET", length=22)
	public String getARevalDepexpOffset() {
		return aRevalDepexpOffset;
	}

	public void setARevalDepexpOffset(String aRevalDepexpOffset) {
		this.aRevalDepexpOffset = aRevalDepexpOffset;
	}

	@Basic
	@Column(name="A_SALVAGE_VALUE")
	public BigDecimal getASalvageValue() {
		return aSalvageValue;
	}

	public void setASalvageValue(BigDecimal aSalvageValue) {
		this.aSalvageValue = aSalvageValue;
	}

	@Basic
	@Column(name="A_SPLIT_PERCENT")
	public BigDecimal getASplitPercent() {
		return aSplitPercent;
	}

	public void setASplitPercent(BigDecimal aSplitPercent) {
		this.aSplitPercent = aSplitPercent;
	}

	@Basic
	@Column(name="ISACTIVE")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	public String getAssetDepreciationDate() {
		return assetDepreciationDate;
	}

	public void setAssetDepreciationDate(String assetDepreciationDate) {
		this.assetDepreciationDate = assetDepreciationDate;
	}

	@Basic
	public String getAssetDisposalDate() {
		return assetDisposalDate;
	}

	public void setAssetDisposalDate(String assetDisposalDate) {
		this.assetDisposalDate = assetDisposalDate;
	}

	@Basic
	public BigDecimal getAssetMarketValueAmt() {
		return assetMarketValueAmt;
	}

	public void setAssetMarketValueAmt(BigDecimal assetMarketValueAmt) {
		this.assetMarketValueAmt = assetMarketValueAmt;
	}

	@Basic
	public String getAssetServiceDate() {
		return assetServiceDate;
	}

	public void setAssetServiceDate(String assetServiceDate) {
		this.assetServiceDate = assetServiceDate;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
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
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBPartnerLocationID() {
		return cBPartnerLocationID;
	}

	public void setCBPartnerLocationID(Integer cBPartnerLocationID) {
		this.cBPartnerLocationID = cBPartnerLocationID;
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
	@Column(length=10)
	public String getConventionType() {
		return conventionType;
	}

	public void setConventionType(String conventionType) {
		this.conventionType = conventionType;
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
	@Column(columnDefinition="INT")
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(name="ISDEPRECIATED")
	public Boolean isDepreciated() {
		return depreciated;
	}

	public void setDepreciated(Boolean depreciated) {
		this.depreciated = depreciated;
	}

	@Basic
	@Column(length=10)
	public String getDepreciationType() {
		return depreciationType;
	}

	public void setDepreciationType(String depreciationType) {
		this.depreciationType = depreciationType;
	}

	@Basic
	@Column(length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISDISPOSED")
	public Boolean isDisposed() {
		return disposed;
	}

	public void setDisposed(Boolean disposed) {
		this.disposed = disposed;
	}

	@Basic
	@Column(name="ISFULLYDEPRECIATED")
	public Boolean isFullyDepreciated() {
		return fullyDepreciated;
	}

	public void setFullyDepreciated(Boolean fullyDepreciated) {
		this.fullyDepreciated = fullyDepreciated;
	}

	@Basic
	public String getGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(String guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Id
	@Column(name="I_ASSET_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53159", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "I_Asset", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53159")
	public Integer getIAssetID() {
		return iAssetID;
	}

	public void setIAssetID(Integer iAssetID) {
		this.iAssetID = iAssetID;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrorMsg() {
		return iErrorMsg;
	}

	public void setIErrorMsg(String iErrorMsg) {
		this.iErrorMsg = iErrorMsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED")
	public Boolean isIIsImported() {
		return iIsImported;
	}

	public void setIIsImported(Boolean iIsImported) {
		this.iIsImported = iIsImported;
	}

	@Basic
	@Column(name="ISINPOSESSION")
	public Boolean isInPosession() {
		return inPosession;
	}

	public void setInPosession(Boolean inPosession) {
		this.inPosession = inPosession;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLifeUseUnits() {
		return lifeUseUnits;
	}

	public void setLifeUseUnits(Integer lifeUseUnits) {
		this.lifeUseUnits = lifeUseUnits;
	}

	@Basic
	public String getLocationComment() {
		return locationComment;
	}

	public void setLocationComment(String locationComment) {
		this.locationComment = locationComment;
	}

	@Basic
	@Column(length=20)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT")
	public Integer getMLocatorID() {
		return mLocatorID;
	}

	public void setMLocatorID(Integer mLocatorID) {
		this.mLocatorID = mLocatorID;
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
	@Column(length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="ISOWNED")
	public Boolean isOwned() {
		return owned;
	}

	public void setOwned(Boolean owned) {
		this.owned = owned;
	}

	@Basic
	@Column(length=10)
	public String getPostingType() {
		return postingType;
	}

	public void setPostingType(String postingType) {
		this.postingType = postingType;
	}

	@Basic
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=20)
	public String getSerNo() {
		return serNo;
	}

	public void setSerNo(String serNo) {
		this.serNo = serNo;
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
	@Column(columnDefinition="INT")
	public Integer getUseLifeMonths() {
		return useLifeMonths;
	}

	public void setUseLifeMonths(Integer useLifeMonths) {
		this.useLifeMonths = useLifeMonths;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUseLifeYears() {
		return useLifeYears;
	}

	public void setUseLifeYears(Integer useLifeYears) {
		this.useLifeYears = useLifeYears;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUseUnits() {
		return useUnits;
	}

	public void setUseUnits(Integer useUnits) {
		this.useUnits = useUnits;
	}

	@Basic
	@Column(length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(length=20)
	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
}