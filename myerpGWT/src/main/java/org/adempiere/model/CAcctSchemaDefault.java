package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_acctschema_default")
public class CAcctSchemaDefault extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer bAssetAcct;
	private Integer bExpenseAcct;
	private Integer bInTransitAcct;
	private Integer bInterestExpAcct;
	private Integer bInterestRevAcct;
	private Integer bPaymentSelectAcct;
	private Integer bRevaluationGainAcct;
	private Integer bRevaluationLossAcct;
	private Integer bSettlementGainAcct;
	private Integer bSettlementLossAcct;
	private Integer bUnallocatedCashAcct;
	private Integer bUnidentifiedAcct;
	private Integer cAcctSchemaID;
	private Integer cBAssetAcct;
	private Integer cBCashTransferAcct;
	private Integer cBDifferencesAcct;
	private Integer cBExpenseAcct;
	private Integer cBReceiptAcct;
	private Integer cPrepaymentAcct;
	private Integer cReceivableAcct;
	private Integer cReceivableServicesAcct;
	private Integer chExpenseAcct;
	private Integer chRevenueAcct;
	private String created;
	private Integer createdBy;
	private Integer eExpenseAcct;
	private Integer ePrepaymentAcct;
	private Integer notInvoicedReceiptsAcct;
	private Integer notInvoicedReceivablesAcct;
	private Integer notInvoicedRevenueAcct;
	private Integer pAssetAcct;
	private Integer pAverageCostVarianceAcct;
	private Integer pBurdenAcct;
	private Integer pCOGSAcct;
	private Integer pCostAdjustmentAcct;
	private Integer pCostOfProductionAcct;
	private Integer pExpenseAcct;
	private Integer pFloorStockAcct;
	private Integer pInventoryClearingAcct;
	private Integer pInvoicePriceVarianceAcct;
	private Integer pJAssetAcct;
	private Integer pJWIPAcct;
	private Integer pLaborAcct;
	private Integer pMethodChangeVarianceAcct;
	private Integer pMixVarianceAcct;
	private Integer pOutsideProcessingAcct;
	private Integer pOverheadAcct;
	private Integer pPurchasePriceVarianceAcct;
	private Integer pRateVarianceAcct;
	private Integer pRevenueAcct;
	private Integer pScrapAcct;
	private Integer pTradeDiscountGrantAcct;
	private Integer pTradeDiscountRecAcct;
	private Integer pUsageVarianceAcct;
	private Integer pWIPAcct;
	private Integer payDiscountExpAcct;
	private Integer payDiscountRevAcct;
	private Boolean processing;
	private Integer realizedGainAcct;
	private Integer realizedLossAcct;
	private Integer tCreditAcct;
	private Integer tDueAcct;
	private Integer tExpenseAcct;
	private Integer tLiabilityAcct;
	private Integer tReceivablesAcct;
	private Integer unEarnedRevenueAcct;
	private Integer unrealizedGainAcct;
	private Integer unrealizedLossAcct;
	private String updated;
	private Integer updatedBy;
	private Integer vLiabilityAcct;
	private Integer vLiabilityServicesAcct;
	private Integer vPrepaymentAcct;
	private Integer wDifferencesAcct;
	private Integer wInvActualAdjustAcct;
	private Integer wInventoryAcct;
	private Integer wRevaluationAcct;
	private Integer withholdingAcct;
	private Integer writeOffAcct;

	public CAcctSchemaDefault() {
	}

	public CAcctSchemaDefault(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
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
	@Column(name="B_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBAssetAcct() {
		return bAssetAcct;
	}

	public void setBAssetAcct(Integer bAssetAcct) {
		this.bAssetAcct = bAssetAcct;
	}

	@Basic
	@Column(name="B_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBExpenseAcct() {
		return bExpenseAcct;
	}

	public void setBExpenseAcct(Integer bExpenseAcct) {
		this.bExpenseAcct = bExpenseAcct;
	}

	@Basic
	@Column(name="B_INTRANSIT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBInTransitAcct() {
		return bInTransitAcct;
	}

	public void setBInTransitAcct(Integer bInTransitAcct) {
		this.bInTransitAcct = bInTransitAcct;
	}

	@Basic
	@Column(name="B_INTERESTEXP_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBInterestExpAcct() {
		return bInterestExpAcct;
	}

	public void setBInterestExpAcct(Integer bInterestExpAcct) {
		this.bInterestExpAcct = bInterestExpAcct;
	}

	@Basic
	@Column(name="B_INTERESTREV_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBInterestRevAcct() {
		return bInterestRevAcct;
	}

	public void setBInterestRevAcct(Integer bInterestRevAcct) {
		this.bInterestRevAcct = bInterestRevAcct;
	}

	@Basic
	@Column(name="B_PAYMENTSELECT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBPaymentSelectAcct() {
		return bPaymentSelectAcct;
	}

	public void setBPaymentSelectAcct(Integer bPaymentSelectAcct) {
		this.bPaymentSelectAcct = bPaymentSelectAcct;
	}

	@Basic
	@Column(name="B_REVALUATIONGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBRevaluationGainAcct() {
		return bRevaluationGainAcct;
	}

	public void setBRevaluationGainAcct(Integer bRevaluationGainAcct) {
		this.bRevaluationGainAcct = bRevaluationGainAcct;
	}

	@Basic
	@Column(name="B_REVALUATIONLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBRevaluationLossAcct() {
		return bRevaluationLossAcct;
	}

	public void setBRevaluationLossAcct(Integer bRevaluationLossAcct) {
		this.bRevaluationLossAcct = bRevaluationLossAcct;
	}

	@Basic
	@Column(name="B_SETTLEMENTGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBSettlementGainAcct() {
		return bSettlementGainAcct;
	}

	public void setBSettlementGainAcct(Integer bSettlementGainAcct) {
		this.bSettlementGainAcct = bSettlementGainAcct;
	}

	@Basic
	@Column(name="B_SETTLEMENTLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBSettlementLossAcct() {
		return bSettlementLossAcct;
	}

	public void setBSettlementLossAcct(Integer bSettlementLossAcct) {
		this.bSettlementLossAcct = bSettlementLossAcct;
	}

	@Basic
	@Column(name="B_UNALLOCATEDCASH_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBUnallocatedCashAcct() {
		return bUnallocatedCashAcct;
	}

	public void setBUnallocatedCashAcct(Integer bUnallocatedCashAcct) {
		this.bUnallocatedCashAcct = bUnallocatedCashAcct;
	}

	@Basic
	@Column(name="B_UNIDENTIFIED_ACCT", columnDefinition="INT", nullable=false)
	public Integer getBUnidentifiedAcct() {
		return bUnidentifiedAcct;
	}

	public void setBUnidentifiedAcct(Integer bUnidentifiedAcct) {
		this.bUnidentifiedAcct = bUnidentifiedAcct;
	}

	@Id
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	@Basic
	@Column(name="CB_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBAssetAcct() {
		return cBAssetAcct;
	}

	public void setCBAssetAcct(Integer cBAssetAcct) {
		this.cBAssetAcct = cBAssetAcct;
	}

	@Basic
	@Column(name="CB_CASHTRANSFER_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBCashTransferAcct() {
		return cBCashTransferAcct;
	}

	public void setCBCashTransferAcct(Integer cBCashTransferAcct) {
		this.cBCashTransferAcct = cBCashTransferAcct;
	}

	@Basic
	@Column(name="CB_DIFFERENCES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBDifferencesAcct() {
		return cBDifferencesAcct;
	}

	public void setCBDifferencesAcct(Integer cBDifferencesAcct) {
		this.cBDifferencesAcct = cBDifferencesAcct;
	}

	@Basic
	@Column(name="CB_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBExpenseAcct() {
		return cBExpenseAcct;
	}

	public void setCBExpenseAcct(Integer cBExpenseAcct) {
		this.cBExpenseAcct = cBExpenseAcct;
	}

	@Basic
	@Column(name="CB_RECEIPT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCBReceiptAcct() {
		return cBReceiptAcct;
	}

	public void setCBReceiptAcct(Integer cBReceiptAcct) {
		this.cBReceiptAcct = cBReceiptAcct;
	}

	@Basic
	@Column(name="C_PREPAYMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCPrepaymentAcct() {
		return cPrepaymentAcct;
	}

	public void setCPrepaymentAcct(Integer cPrepaymentAcct) {
		this.cPrepaymentAcct = cPrepaymentAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCReceivableAcct() {
		return cReceivableAcct;
	}

	public void setCReceivableAcct(Integer cReceivableAcct) {
		this.cReceivableAcct = cReceivableAcct;
	}

	@Basic
	@Column(name="C_RECEIVABLE_SERVICES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getCReceivableServicesAcct() {
		return cReceivableServicesAcct;
	}

	public void setCReceivableServicesAcct(Integer cReceivableServicesAcct) {
		this.cReceivableServicesAcct = cReceivableServicesAcct;
	}

	@Basic
	@Column(name="CH_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getChExpenseAcct() {
		return chExpenseAcct;
	}

	public void setChExpenseAcct(Integer chExpenseAcct) {
		this.chExpenseAcct = chExpenseAcct;
	}

	@Basic
	@Column(name="CH_REVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getChRevenueAcct() {
		return chRevenueAcct;
	}

	public void setChRevenueAcct(Integer chRevenueAcct) {
		this.chRevenueAcct = chRevenueAcct;
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
	@Column(name="E_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getEExpenseAcct() {
		return eExpenseAcct;
	}

	public void setEExpenseAcct(Integer eExpenseAcct) {
		this.eExpenseAcct = eExpenseAcct;
	}

	@Basic
	@Column(name="E_PREPAYMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getEPrepaymentAcct() {
		return ePrepaymentAcct;
	}

	public void setEPrepaymentAcct(Integer ePrepaymentAcct) {
		this.ePrepaymentAcct = ePrepaymentAcct;
	}

	@Basic
	@Column(name="NOTINVOICEDRECEIPTS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotInvoicedReceiptsAcct() {
		return notInvoicedReceiptsAcct;
	}

	public void setNotInvoicedReceiptsAcct(Integer notInvoicedReceiptsAcct) {
		this.notInvoicedReceiptsAcct = notInvoicedReceiptsAcct;
	}

	@Basic
	@Column(name="NOTINVOICEDRECEIVABLES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotInvoicedReceivablesAcct() {
		return notInvoicedReceivablesAcct;
	}

	public void setNotInvoicedReceivablesAcct(Integer notInvoicedReceivablesAcct) {
		this.notInvoicedReceivablesAcct = notInvoicedReceivablesAcct;
	}

	@Basic
	@Column(name="NOTINVOICEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getNotInvoicedRevenueAcct() {
		return notInvoicedRevenueAcct;
	}

	public void setNotInvoicedRevenueAcct(Integer notInvoicedRevenueAcct) {
		this.notInvoicedRevenueAcct = notInvoicedRevenueAcct;
	}

	@Basic
	@Column(name="P_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPAssetAcct() {
		return pAssetAcct;
	}

	public void setPAssetAcct(Integer pAssetAcct) {
		this.pAssetAcct = pAssetAcct;
	}

	@Basic
	@Column(name="P_AVERAGECOSTVARIANCE_ACCT", columnDefinition="INT")
	public Integer getPAverageCostVarianceAcct() {
		return pAverageCostVarianceAcct;
	}

	public void setPAverageCostVarianceAcct(Integer pAverageCostVarianceAcct) {
		this.pAverageCostVarianceAcct = pAverageCostVarianceAcct;
	}

	@Basic
	@Column(name="P_BURDEN_ACCT", columnDefinition="INT")
	public Integer getPBurdenAcct() {
		return pBurdenAcct;
	}

	public void setPBurdenAcct(Integer pBurdenAcct) {
		this.pBurdenAcct = pBurdenAcct;
	}

	@Basic
	@Column(name="P_COGS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPCOGSAcct() {
		return pCOGSAcct;
	}

	public void setPCOGSAcct(Integer pCOGSAcct) {
		this.pCOGSAcct = pCOGSAcct;
	}

	@Basic
	@Column(name="P_COSTADJUSTMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPCostAdjustmentAcct() {
		return pCostAdjustmentAcct;
	}

	public void setPCostAdjustmentAcct(Integer pCostAdjustmentAcct) {
		this.pCostAdjustmentAcct = pCostAdjustmentAcct;
	}

	@Basic
	@Column(name="P_COSTOFPRODUCTION_ACCT", columnDefinition="INT")
	public Integer getPCostOfProductionAcct() {
		return pCostOfProductionAcct;
	}

	public void setPCostOfProductionAcct(Integer pCostOfProductionAcct) {
		this.pCostOfProductionAcct = pCostOfProductionAcct;
	}

	@Basic
	@Column(name="P_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPExpenseAcct() {
		return pExpenseAcct;
	}

	public void setPExpenseAcct(Integer pExpenseAcct) {
		this.pExpenseAcct = pExpenseAcct;
	}

	@Basic
	@Column(name="P_FLOORSTOCK_ACCT", columnDefinition="INT")
	public Integer getPFloorStockAcct() {
		return pFloorStockAcct;
	}

	public void setPFloorStockAcct(Integer pFloorStockAcct) {
		this.pFloorStockAcct = pFloorStockAcct;
	}

	@Basic
	@Column(name="P_INVENTORYCLEARING_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPInventoryClearingAcct() {
		return pInventoryClearingAcct;
	}

	public void setPInventoryClearingAcct(Integer pInventoryClearingAcct) {
		this.pInventoryClearingAcct = pInventoryClearingAcct;
	}

	@Basic
	@Column(name="P_INVOICEPRICEVARIANCE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPInvoicePriceVarianceAcct() {
		return pInvoicePriceVarianceAcct;
	}

	public void setPInvoicePriceVarianceAcct(Integer pInvoicePriceVarianceAcct) {
		this.pInvoicePriceVarianceAcct = pInvoicePriceVarianceAcct;
	}

	@Basic
	@Column(name="PJ_ASSET_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPJAssetAcct() {
		return pJAssetAcct;
	}

	public void setPJAssetAcct(Integer pJAssetAcct) {
		this.pJAssetAcct = pJAssetAcct;
	}

	@Basic
	@Column(name="PJ_WIP_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPJWIPAcct() {
		return pJWIPAcct;
	}

	public void setPJWIPAcct(Integer pJWIPAcct) {
		this.pJWIPAcct = pJWIPAcct;
	}

	@Basic
	@Column(name="P_LABOR_ACCT", columnDefinition="INT")
	public Integer getPLaborAcct() {
		return pLaborAcct;
	}

	public void setPLaborAcct(Integer pLaborAcct) {
		this.pLaborAcct = pLaborAcct;
	}

	@Basic
	@Column(name="P_METHODCHANGEVARIANCE_ACCT", columnDefinition="INT")
	public Integer getPMethodChangeVarianceAcct() {
		return pMethodChangeVarianceAcct;
	}

	public void setPMethodChangeVarianceAcct(Integer pMethodChangeVarianceAcct) {
		this.pMethodChangeVarianceAcct = pMethodChangeVarianceAcct;
	}

	@Basic
	@Column(name="P_MIXVARIANCE_ACCT", columnDefinition="INT")
	public Integer getPMixVarianceAcct() {
		return pMixVarianceAcct;
	}

	public void setPMixVarianceAcct(Integer pMixVarianceAcct) {
		this.pMixVarianceAcct = pMixVarianceAcct;
	}

	@Basic
	@Column(name="P_OUTSIDEPROCESSING_ACCT", columnDefinition="INT")
	public Integer getPOutsideProcessingAcct() {
		return pOutsideProcessingAcct;
	}

	public void setPOutsideProcessingAcct(Integer pOutsideProcessingAcct) {
		this.pOutsideProcessingAcct = pOutsideProcessingAcct;
	}

	@Basic
	@Column(name="P_OVERHEAD_ACCT", columnDefinition="INT")
	public Integer getPOverheadAcct() {
		return pOverheadAcct;
	}

	public void setPOverheadAcct(Integer pOverheadAcct) {
		this.pOverheadAcct = pOverheadAcct;
	}

	@Basic
	@Column(name="P_PURCHASEPRICEVARIANCE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPPurchasePriceVarianceAcct() {
		return pPurchasePriceVarianceAcct;
	}

	public void setPPurchasePriceVarianceAcct(Integer pPurchasePriceVarianceAcct) {
		this.pPurchasePriceVarianceAcct = pPurchasePriceVarianceAcct;
	}

	@Basic
	@Column(name="P_RATEVARIANCE_ACCT", columnDefinition="INT")
	public Integer getPRateVarianceAcct() {
		return pRateVarianceAcct;
	}

	public void setPRateVarianceAcct(Integer pRateVarianceAcct) {
		this.pRateVarianceAcct = pRateVarianceAcct;
	}

	@Basic
	@Column(name="P_REVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPRevenueAcct() {
		return pRevenueAcct;
	}

	public void setPRevenueAcct(Integer pRevenueAcct) {
		this.pRevenueAcct = pRevenueAcct;
	}

	@Basic
	@Column(name="P_SCRAP_ACCT", columnDefinition="INT")
	public Integer getPScrapAcct() {
		return pScrapAcct;
	}

	public void setPScrapAcct(Integer pScrapAcct) {
		this.pScrapAcct = pScrapAcct;
	}

	@Basic
	@Column(name="P_TRADEDISCOUNTGRANT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPTradeDiscountGrantAcct() {
		return pTradeDiscountGrantAcct;
	}

	public void setPTradeDiscountGrantAcct(Integer pTradeDiscountGrantAcct) {
		this.pTradeDiscountGrantAcct = pTradeDiscountGrantAcct;
	}

	@Basic
	@Column(name="P_TRADEDISCOUNTREC_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPTradeDiscountRecAcct() {
		return pTradeDiscountRecAcct;
	}

	public void setPTradeDiscountRecAcct(Integer pTradeDiscountRecAcct) {
		this.pTradeDiscountRecAcct = pTradeDiscountRecAcct;
	}

	@Basic
	@Column(name="P_USAGEVARIANCE_ACCT", columnDefinition="INT")
	public Integer getPUsageVarianceAcct() {
		return pUsageVarianceAcct;
	}

	public void setPUsageVarianceAcct(Integer pUsageVarianceAcct) {
		this.pUsageVarianceAcct = pUsageVarianceAcct;
	}

	@Basic
	@Column(name="P_WIP_ACCT", columnDefinition="INT")
	public Integer getPWIPAcct() {
		return pWIPAcct;
	}

	public void setPWIPAcct(Integer pWIPAcct) {
		this.pWIPAcct = pWIPAcct;
	}

	@Basic
	@Column(name="PAYDISCOUNT_EXP_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPayDiscountExpAcct() {
		return payDiscountExpAcct;
	}

	public void setPayDiscountExpAcct(Integer payDiscountExpAcct) {
		this.payDiscountExpAcct = payDiscountExpAcct;
	}

	@Basic
	@Column(name="PAYDISCOUNT_REV_ACCT", columnDefinition="INT", nullable=false)
	public Integer getPayDiscountRevAcct() {
		return payDiscountRevAcct;
	}

	public void setPayDiscountRevAcct(Integer payDiscountRevAcct) {
		this.payDiscountRevAcct = payDiscountRevAcct;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="REALIZEDGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getRealizedGainAcct() {
		return realizedGainAcct;
	}

	public void setRealizedGainAcct(Integer realizedGainAcct) {
		this.realizedGainAcct = realizedGainAcct;
	}

	@Basic
	@Column(name="REALIZEDLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getRealizedLossAcct() {
		return realizedLossAcct;
	}

	public void setRealizedLossAcct(Integer realizedLossAcct) {
		this.realizedLossAcct = realizedLossAcct;
	}

	@Basic
	@Column(name="T_CREDIT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getTCreditAcct() {
		return tCreditAcct;
	}

	public void setTCreditAcct(Integer tCreditAcct) {
		this.tCreditAcct = tCreditAcct;
	}

	@Basic
	@Column(name="T_DUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getTDueAcct() {
		return tDueAcct;
	}

	public void setTDueAcct(Integer tDueAcct) {
		this.tDueAcct = tDueAcct;
	}

	@Basic
	@Column(name="T_EXPENSE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getTExpenseAcct() {
		return tExpenseAcct;
	}

	public void setTExpenseAcct(Integer tExpenseAcct) {
		this.tExpenseAcct = tExpenseAcct;
	}

	@Basic
	@Column(name="T_LIABILITY_ACCT", columnDefinition="INT", nullable=false)
	public Integer getTLiabilityAcct() {
		return tLiabilityAcct;
	}

	public void setTLiabilityAcct(Integer tLiabilityAcct) {
		this.tLiabilityAcct = tLiabilityAcct;
	}

	@Basic
	@Column(name="T_RECEIVABLES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getTReceivablesAcct() {
		return tReceivablesAcct;
	}

	public void setTReceivablesAcct(Integer tReceivablesAcct) {
		this.tReceivablesAcct = tReceivablesAcct;
	}

	@Basic
	@Column(name="UNEARNEDREVENUE_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnEarnedRevenueAcct() {
		return unEarnedRevenueAcct;
	}

	public void setUnEarnedRevenueAcct(Integer unEarnedRevenueAcct) {
		this.unEarnedRevenueAcct = unEarnedRevenueAcct;
	}

	@Basic
	@Column(name="UNREALIZEDGAIN_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnrealizedGainAcct() {
		return unrealizedGainAcct;
	}

	public void setUnrealizedGainAcct(Integer unrealizedGainAcct) {
		this.unrealizedGainAcct = unrealizedGainAcct;
	}

	@Basic
	@Column(name="UNREALIZEDLOSS_ACCT", columnDefinition="INT", nullable=false)
	public Integer getUnrealizedLossAcct() {
		return unrealizedLossAcct;
	}

	public void setUnrealizedLossAcct(Integer unrealizedLossAcct) {
		this.unrealizedLossAcct = unrealizedLossAcct;
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
	@Column(name="V_LIABILITY_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVLiabilityAcct() {
		return vLiabilityAcct;
	}

	public void setVLiabilityAcct(Integer vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}

	@Basic
	@Column(name="V_LIABILITY_SERVICES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVLiabilityServicesAcct() {
		return vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(Integer vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}

	@Basic
	@Column(name="V_PREPAYMENT_ACCT", columnDefinition="INT", nullable=false)
	public Integer getVPrepaymentAcct() {
		return vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(Integer vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}

	@Basic
	@Column(name="W_DIFFERENCES_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWDifferencesAcct() {
		return wDifferencesAcct;
	}

	public void setWDifferencesAcct(Integer wDifferencesAcct) {
		this.wDifferencesAcct = wDifferencesAcct;
	}

	@Basic
	@Column(name="W_INVACTUALADJUST_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWInvActualAdjustAcct() {
		return wInvActualAdjustAcct;
	}

	public void setWInvActualAdjustAcct(Integer wInvActualAdjustAcct) {
		this.wInvActualAdjustAcct = wInvActualAdjustAcct;
	}

	@Basic
	@Column(name="W_INVENTORY_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWInventoryAcct() {
		return wInventoryAcct;
	}

	public void setWInventoryAcct(Integer wInventoryAcct) {
		this.wInventoryAcct = wInventoryAcct;
	}

	@Basic
	@Column(name="W_REVALUATION_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWRevaluationAcct() {
		return wRevaluationAcct;
	}

	public void setWRevaluationAcct(Integer wRevaluationAcct) {
		this.wRevaluationAcct = wRevaluationAcct;
	}

	@Basic
	@Column(name="WITHHOLDING_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWithholdingAcct() {
		return withholdingAcct;
	}

	public void setWithholdingAcct(Integer withholdingAcct) {
		this.withholdingAcct = withholdingAcct;
	}

	@Basic
	@Column(name="WRITEOFF_ACCT", columnDefinition="INT", nullable=false)
	public Integer getWriteOffAcct() {
		return writeOffAcct;
	}

	public void setWriteOffAcct(Integer writeOffAcct) {
		this.writeOffAcct = writeOffAcct;
	}
}