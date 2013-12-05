package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_acctschema_default database table.
 * 
 */
@Entity
@Table(name="c_acctschema_default")
@NamedQuery(name="CAcctschemaDefault.findAll", query="SELECT c FROM CAcctschemaDefault c")
public class CAcctschemaDefault extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal bAssetAcct;
	private BigDecimal bExpenseAcct;
	private BigDecimal bInterestexpAcct;
	private BigDecimal bInterestrevAcct;
	private BigDecimal bIntransitAcct;
	private BigDecimal bPaymentselectAcct;
	private BigDecimal bRevaluationgainAcct;
	private BigDecimal bRevaluationlossAcct;
	private BigDecimal bSettlementgainAcct;
	private BigDecimal bSettlementlossAcct;
	private BigDecimal bUnallocatedcashAcct;
	private BigDecimal bUnidentifiedAcct;
	private BigDecimal cPrepaymentAcct;
	private BigDecimal cReceivableAcct;
	private BigDecimal cReceivableServicesAcct;
	private BigDecimal cbAssetAcct;
	private BigDecimal cbCashtransferAcct;
	private BigDecimal cbDifferencesAcct;
	private BigDecimal cbExpenseAcct;
	private BigDecimal cbReceiptAcct;
	private BigDecimal chExpenseAcct;
	private BigDecimal chRevenueAcct;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal eExpenseAcct;
	private BigDecimal ePrepaymentAcct;
	private String isactive;
	private BigDecimal notinvoicedreceiptsAcct;
	private BigDecimal notinvoicedreceivablesAcct;
	private BigDecimal notinvoicedrevenueAcct;
	private BigDecimal pAssetAcct;
	private BigDecimal pAveragecostvarianceAcct;
	private BigDecimal pBurdenAcct;
	private BigDecimal pCogsAcct;
	private BigDecimal pCostadjustmentAcct;
	private BigDecimal pCostofproductionAcct;
	private BigDecimal pExpenseAcct;
	private BigDecimal pFloorstockAcct;
	private BigDecimal pInventoryclearingAcct;
	private BigDecimal pInvoicepricevarianceAcct;
	private BigDecimal pLaborAcct;
	private BigDecimal pMethodchangevarianceAcct;
	private BigDecimal pMixvarianceAcct;
	private BigDecimal pOutsideprocessingAcct;
	private BigDecimal pOverheadAcct;
	private BigDecimal pPurchasepricevarianceAcct;
	private BigDecimal pRatevarianceAcct;
	private BigDecimal pRevenueAcct;
	private BigDecimal pScrapAcct;
	private BigDecimal pTradediscountgrantAcct;
	private BigDecimal pTradediscountrecAcct;
	private BigDecimal pUsagevarianceAcct;
	private BigDecimal pWipAcct;
	private BigDecimal paydiscountExpAcct;
	private BigDecimal paydiscountRevAcct;
	private BigDecimal pjAssetAcct;
	private BigDecimal pjWipAcct;
	private String processing;
	private BigDecimal realizedgainAcct;
	private BigDecimal realizedlossAcct;
	private BigDecimal tCreditAcct;
	private BigDecimal tDueAcct;
	private BigDecimal tExpenseAcct;
	private BigDecimal tLiabilityAcct;
	private BigDecimal tReceivablesAcct;
	private BigDecimal unearnedrevenueAcct;
	private BigDecimal unrealizedgainAcct;
	private BigDecimal unrealizedlossAcct;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal vLiabilityAcct;
	private BigDecimal vLiabilityServicesAcct;
	private BigDecimal vPrepaymentAcct;
	private BigDecimal wDifferencesAcct;
	private BigDecimal wInvactualadjustAcct;
	private BigDecimal wInventoryAcct;
	private BigDecimal wRevaluationAcct;
	private BigDecimal withholdingAcct;
	private BigDecimal writeoffAcct;

	public CAcctschemaDefault() {
	}


	@Id
	@Column(name="C_ACCTSCHEMA_ID")
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="B_ASSET_ACCT")
	public BigDecimal getBAssetAcct() {
		return this.bAssetAcct;
	}

	public void setBAssetAcct(BigDecimal bAssetAcct) {
		this.bAssetAcct = bAssetAcct;
	}


	@Column(name="B_EXPENSE_ACCT")
	public BigDecimal getBExpenseAcct() {
		return this.bExpenseAcct;
	}

	public void setBExpenseAcct(BigDecimal bExpenseAcct) {
		this.bExpenseAcct = bExpenseAcct;
	}


	@Column(name="B_INTERESTEXP_ACCT")
	public BigDecimal getBInterestexpAcct() {
		return this.bInterestexpAcct;
	}

	public void setBInterestexpAcct(BigDecimal bInterestexpAcct) {
		this.bInterestexpAcct = bInterestexpAcct;
	}


	@Column(name="B_INTERESTREV_ACCT")
	public BigDecimal getBInterestrevAcct() {
		return this.bInterestrevAcct;
	}

	public void setBInterestrevAcct(BigDecimal bInterestrevAcct) {
		this.bInterestrevAcct = bInterestrevAcct;
	}


	@Column(name="B_INTRANSIT_ACCT")
	public BigDecimal getBIntransitAcct() {
		return this.bIntransitAcct;
	}

	public void setBIntransitAcct(BigDecimal bIntransitAcct) {
		this.bIntransitAcct = bIntransitAcct;
	}


	@Column(name="B_PAYMENTSELECT_ACCT")
	public BigDecimal getBPaymentselectAcct() {
		return this.bPaymentselectAcct;
	}

	public void setBPaymentselectAcct(BigDecimal bPaymentselectAcct) {
		this.bPaymentselectAcct = bPaymentselectAcct;
	}


	@Column(name="B_REVALUATIONGAIN_ACCT")
	public BigDecimal getBRevaluationgainAcct() {
		return this.bRevaluationgainAcct;
	}

	public void setBRevaluationgainAcct(BigDecimal bRevaluationgainAcct) {
		this.bRevaluationgainAcct = bRevaluationgainAcct;
	}


	@Column(name="B_REVALUATIONLOSS_ACCT")
	public BigDecimal getBRevaluationlossAcct() {
		return this.bRevaluationlossAcct;
	}

	public void setBRevaluationlossAcct(BigDecimal bRevaluationlossAcct) {
		this.bRevaluationlossAcct = bRevaluationlossAcct;
	}


	@Column(name="B_SETTLEMENTGAIN_ACCT")
	public BigDecimal getBSettlementgainAcct() {
		return this.bSettlementgainAcct;
	}

	public void setBSettlementgainAcct(BigDecimal bSettlementgainAcct) {
		this.bSettlementgainAcct = bSettlementgainAcct;
	}


	@Column(name="B_SETTLEMENTLOSS_ACCT")
	public BigDecimal getBSettlementlossAcct() {
		return this.bSettlementlossAcct;
	}

	public void setBSettlementlossAcct(BigDecimal bSettlementlossAcct) {
		this.bSettlementlossAcct = bSettlementlossAcct;
	}


	@Column(name="B_UNALLOCATEDCASH_ACCT")
	public BigDecimal getBUnallocatedcashAcct() {
		return this.bUnallocatedcashAcct;
	}

	public void setBUnallocatedcashAcct(BigDecimal bUnallocatedcashAcct) {
		this.bUnallocatedcashAcct = bUnallocatedcashAcct;
	}


	@Column(name="B_UNIDENTIFIED_ACCT")
	public BigDecimal getBUnidentifiedAcct() {
		return this.bUnidentifiedAcct;
	}

	public void setBUnidentifiedAcct(BigDecimal bUnidentifiedAcct) {
		this.bUnidentifiedAcct = bUnidentifiedAcct;
	}


	@Column(name="C_PREPAYMENT_ACCT")
	public BigDecimal getCPrepaymentAcct() {
		return this.cPrepaymentAcct;
	}

	public void setCPrepaymentAcct(BigDecimal cPrepaymentAcct) {
		this.cPrepaymentAcct = cPrepaymentAcct;
	}


	@Column(name="C_RECEIVABLE_ACCT")
	public BigDecimal getCReceivableAcct() {
		return this.cReceivableAcct;
	}

	public void setCReceivableAcct(BigDecimal cReceivableAcct) {
		this.cReceivableAcct = cReceivableAcct;
	}


	@Column(name="C_RECEIVABLE_SERVICES_ACCT")
	public BigDecimal getCReceivableServicesAcct() {
		return this.cReceivableServicesAcct;
	}

	public void setCReceivableServicesAcct(BigDecimal cReceivableServicesAcct) {
		this.cReceivableServicesAcct = cReceivableServicesAcct;
	}


	@Column(name="CB_ASSET_ACCT")
	public BigDecimal getCbAssetAcct() {
		return this.cbAssetAcct;
	}

	public void setCbAssetAcct(BigDecimal cbAssetAcct) {
		this.cbAssetAcct = cbAssetAcct;
	}


	@Column(name="CB_CASHTRANSFER_ACCT")
	public BigDecimal getCbCashtransferAcct() {
		return this.cbCashtransferAcct;
	}

	public void setCbCashtransferAcct(BigDecimal cbCashtransferAcct) {
		this.cbCashtransferAcct = cbCashtransferAcct;
	}


	@Column(name="CB_DIFFERENCES_ACCT")
	public BigDecimal getCbDifferencesAcct() {
		return this.cbDifferencesAcct;
	}

	public void setCbDifferencesAcct(BigDecimal cbDifferencesAcct) {
		this.cbDifferencesAcct = cbDifferencesAcct;
	}


	@Column(name="CB_EXPENSE_ACCT")
	public BigDecimal getCbExpenseAcct() {
		return this.cbExpenseAcct;
	}

	public void setCbExpenseAcct(BigDecimal cbExpenseAcct) {
		this.cbExpenseAcct = cbExpenseAcct;
	}


	@Column(name="CB_RECEIPT_ACCT")
	public BigDecimal getCbReceiptAcct() {
		return this.cbReceiptAcct;
	}

	public void setCbReceiptAcct(BigDecimal cbReceiptAcct) {
		this.cbReceiptAcct = cbReceiptAcct;
	}


	@Column(name="CH_EXPENSE_ACCT")
	public BigDecimal getChExpenseAcct() {
		return this.chExpenseAcct;
	}

	public void setChExpenseAcct(BigDecimal chExpenseAcct) {
		this.chExpenseAcct = chExpenseAcct;
	}


	@Column(name="CH_REVENUE_ACCT")
	public BigDecimal getChRevenueAcct() {
		return this.chRevenueAcct;
	}

	public void setChRevenueAcct(BigDecimal chRevenueAcct) {
		this.chRevenueAcct = chRevenueAcct;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	@Column(name="E_EXPENSE_ACCT")
	public BigDecimal getEExpenseAcct() {
		return this.eExpenseAcct;
	}

	public void setEExpenseAcct(BigDecimal eExpenseAcct) {
		this.eExpenseAcct = eExpenseAcct;
	}


	@Column(name="E_PREPAYMENT_ACCT")
	public BigDecimal getEPrepaymentAcct() {
		return this.ePrepaymentAcct;
	}

	public void setEPrepaymentAcct(BigDecimal ePrepaymentAcct) {
		this.ePrepaymentAcct = ePrepaymentAcct;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="NOTINVOICEDRECEIPTS_ACCT")
	public BigDecimal getNotinvoicedreceiptsAcct() {
		return this.notinvoicedreceiptsAcct;
	}

	public void setNotinvoicedreceiptsAcct(BigDecimal notinvoicedreceiptsAcct) {
		this.notinvoicedreceiptsAcct = notinvoicedreceiptsAcct;
	}


	@Column(name="NOTINVOICEDRECEIVABLES_ACCT")
	public BigDecimal getNotinvoicedreceivablesAcct() {
		return this.notinvoicedreceivablesAcct;
	}

	public void setNotinvoicedreceivablesAcct(BigDecimal notinvoicedreceivablesAcct) {
		this.notinvoicedreceivablesAcct = notinvoicedreceivablesAcct;
	}


	@Column(name="NOTINVOICEDREVENUE_ACCT")
	public BigDecimal getNotinvoicedrevenueAcct() {
		return this.notinvoicedrevenueAcct;
	}

	public void setNotinvoicedrevenueAcct(BigDecimal notinvoicedrevenueAcct) {
		this.notinvoicedrevenueAcct = notinvoicedrevenueAcct;
	}


	@Column(name="P_ASSET_ACCT")
	public BigDecimal getPAssetAcct() {
		return this.pAssetAcct;
	}

	public void setPAssetAcct(BigDecimal pAssetAcct) {
		this.pAssetAcct = pAssetAcct;
	}


	@Column(name="P_AVERAGECOSTVARIANCE_ACCT")
	public BigDecimal getPAveragecostvarianceAcct() {
		return this.pAveragecostvarianceAcct;
	}

	public void setPAveragecostvarianceAcct(BigDecimal pAveragecostvarianceAcct) {
		this.pAveragecostvarianceAcct = pAveragecostvarianceAcct;
	}


	@Column(name="P_BURDEN_ACCT")
	public BigDecimal getPBurdenAcct() {
		return this.pBurdenAcct;
	}

	public void setPBurdenAcct(BigDecimal pBurdenAcct) {
		this.pBurdenAcct = pBurdenAcct;
	}


	@Column(name="P_COGS_ACCT")
	public BigDecimal getPCogsAcct() {
		return this.pCogsAcct;
	}

	public void setPCogsAcct(BigDecimal pCogsAcct) {
		this.pCogsAcct = pCogsAcct;
	}


	@Column(name="P_COSTADJUSTMENT_ACCT")
	public BigDecimal getPCostadjustmentAcct() {
		return this.pCostadjustmentAcct;
	}

	public void setPCostadjustmentAcct(BigDecimal pCostadjustmentAcct) {
		this.pCostadjustmentAcct = pCostadjustmentAcct;
	}


	@Column(name="P_COSTOFPRODUCTION_ACCT")
	public BigDecimal getPCostofproductionAcct() {
		return this.pCostofproductionAcct;
	}

	public void setPCostofproductionAcct(BigDecimal pCostofproductionAcct) {
		this.pCostofproductionAcct = pCostofproductionAcct;
	}


	@Column(name="P_EXPENSE_ACCT")
	public BigDecimal getPExpenseAcct() {
		return this.pExpenseAcct;
	}

	public void setPExpenseAcct(BigDecimal pExpenseAcct) {
		this.pExpenseAcct = pExpenseAcct;
	}


	@Column(name="P_FLOORSTOCK_ACCT")
	public BigDecimal getPFloorstockAcct() {
		return this.pFloorstockAcct;
	}

	public void setPFloorstockAcct(BigDecimal pFloorstockAcct) {
		this.pFloorstockAcct = pFloorstockAcct;
	}


	@Column(name="P_INVENTORYCLEARING_ACCT")
	public BigDecimal getPInventoryclearingAcct() {
		return this.pInventoryclearingAcct;
	}

	public void setPInventoryclearingAcct(BigDecimal pInventoryclearingAcct) {
		this.pInventoryclearingAcct = pInventoryclearingAcct;
	}


	@Column(name="P_INVOICEPRICEVARIANCE_ACCT")
	public BigDecimal getPInvoicepricevarianceAcct() {
		return this.pInvoicepricevarianceAcct;
	}

	public void setPInvoicepricevarianceAcct(BigDecimal pInvoicepricevarianceAcct) {
		this.pInvoicepricevarianceAcct = pInvoicepricevarianceAcct;
	}


	@Column(name="P_LABOR_ACCT")
	public BigDecimal getPLaborAcct() {
		return this.pLaborAcct;
	}

	public void setPLaborAcct(BigDecimal pLaborAcct) {
		this.pLaborAcct = pLaborAcct;
	}


	@Column(name="P_METHODCHANGEVARIANCE_ACCT")
	public BigDecimal getPMethodchangevarianceAcct() {
		return this.pMethodchangevarianceAcct;
	}

	public void setPMethodchangevarianceAcct(BigDecimal pMethodchangevarianceAcct) {
		this.pMethodchangevarianceAcct = pMethodchangevarianceAcct;
	}


	@Column(name="P_MIXVARIANCE_ACCT")
	public BigDecimal getPMixvarianceAcct() {
		return this.pMixvarianceAcct;
	}

	public void setPMixvarianceAcct(BigDecimal pMixvarianceAcct) {
		this.pMixvarianceAcct = pMixvarianceAcct;
	}


	@Column(name="P_OUTSIDEPROCESSING_ACCT")
	public BigDecimal getPOutsideprocessingAcct() {
		return this.pOutsideprocessingAcct;
	}

	public void setPOutsideprocessingAcct(BigDecimal pOutsideprocessingAcct) {
		this.pOutsideprocessingAcct = pOutsideprocessingAcct;
	}


	@Column(name="P_OVERHEAD_ACCT")
	public BigDecimal getPOverheadAcct() {
		return this.pOverheadAcct;
	}

	public void setPOverheadAcct(BigDecimal pOverheadAcct) {
		this.pOverheadAcct = pOverheadAcct;
	}


	@Column(name="P_PURCHASEPRICEVARIANCE_ACCT")
	public BigDecimal getPPurchasepricevarianceAcct() {
		return this.pPurchasepricevarianceAcct;
	}

	public void setPPurchasepricevarianceAcct(BigDecimal pPurchasepricevarianceAcct) {
		this.pPurchasepricevarianceAcct = pPurchasepricevarianceAcct;
	}


	@Column(name="P_RATEVARIANCE_ACCT")
	public BigDecimal getPRatevarianceAcct() {
		return this.pRatevarianceAcct;
	}

	public void setPRatevarianceAcct(BigDecimal pRatevarianceAcct) {
		this.pRatevarianceAcct = pRatevarianceAcct;
	}


	@Column(name="P_REVENUE_ACCT")
	public BigDecimal getPRevenueAcct() {
		return this.pRevenueAcct;
	}

	public void setPRevenueAcct(BigDecimal pRevenueAcct) {
		this.pRevenueAcct = pRevenueAcct;
	}


	@Column(name="P_SCRAP_ACCT")
	public BigDecimal getPScrapAcct() {
		return this.pScrapAcct;
	}

	public void setPScrapAcct(BigDecimal pScrapAcct) {
		this.pScrapAcct = pScrapAcct;
	}


	@Column(name="P_TRADEDISCOUNTGRANT_ACCT")
	public BigDecimal getPTradediscountgrantAcct() {
		return this.pTradediscountgrantAcct;
	}

	public void setPTradediscountgrantAcct(BigDecimal pTradediscountgrantAcct) {
		this.pTradediscountgrantAcct = pTradediscountgrantAcct;
	}


	@Column(name="P_TRADEDISCOUNTREC_ACCT")
	public BigDecimal getPTradediscountrecAcct() {
		return this.pTradediscountrecAcct;
	}

	public void setPTradediscountrecAcct(BigDecimal pTradediscountrecAcct) {
		this.pTradediscountrecAcct = pTradediscountrecAcct;
	}


	@Column(name="P_USAGEVARIANCE_ACCT")
	public BigDecimal getPUsagevarianceAcct() {
		return this.pUsagevarianceAcct;
	}

	public void setPUsagevarianceAcct(BigDecimal pUsagevarianceAcct) {
		this.pUsagevarianceAcct = pUsagevarianceAcct;
	}


	@Column(name="P_WIP_ACCT")
	public BigDecimal getPWipAcct() {
		return this.pWipAcct;
	}

	public void setPWipAcct(BigDecimal pWipAcct) {
		this.pWipAcct = pWipAcct;
	}


	@Column(name="PAYDISCOUNT_EXP_ACCT")
	public BigDecimal getPaydiscountExpAcct() {
		return this.paydiscountExpAcct;
	}

	public void setPaydiscountExpAcct(BigDecimal paydiscountExpAcct) {
		this.paydiscountExpAcct = paydiscountExpAcct;
	}


	@Column(name="PAYDISCOUNT_REV_ACCT")
	public BigDecimal getPaydiscountRevAcct() {
		return this.paydiscountRevAcct;
	}

	public void setPaydiscountRevAcct(BigDecimal paydiscountRevAcct) {
		this.paydiscountRevAcct = paydiscountRevAcct;
	}


	@Column(name="PJ_ASSET_ACCT")
	public BigDecimal getPjAssetAcct() {
		return this.pjAssetAcct;
	}

	public void setPjAssetAcct(BigDecimal pjAssetAcct) {
		this.pjAssetAcct = pjAssetAcct;
	}


	@Column(name="PJ_WIP_ACCT")
	public BigDecimal getPjWipAcct() {
		return this.pjWipAcct;
	}

	public void setPjWipAcct(BigDecimal pjWipAcct) {
		this.pjWipAcct = pjWipAcct;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="REALIZEDGAIN_ACCT")
	public BigDecimal getRealizedgainAcct() {
		return this.realizedgainAcct;
	}

	public void setRealizedgainAcct(BigDecimal realizedgainAcct) {
		this.realizedgainAcct = realizedgainAcct;
	}


	@Column(name="REALIZEDLOSS_ACCT")
	public BigDecimal getRealizedlossAcct() {
		return this.realizedlossAcct;
	}

	public void setRealizedlossAcct(BigDecimal realizedlossAcct) {
		this.realizedlossAcct = realizedlossAcct;
	}


	@Column(name="T_CREDIT_ACCT")
	public BigDecimal getTCreditAcct() {
		return this.tCreditAcct;
	}

	public void setTCreditAcct(BigDecimal tCreditAcct) {
		this.tCreditAcct = tCreditAcct;
	}


	@Column(name="T_DUE_ACCT")
	public BigDecimal getTDueAcct() {
		return this.tDueAcct;
	}

	public void setTDueAcct(BigDecimal tDueAcct) {
		this.tDueAcct = tDueAcct;
	}


	@Column(name="T_EXPENSE_ACCT")
	public BigDecimal getTExpenseAcct() {
		return this.tExpenseAcct;
	}

	public void setTExpenseAcct(BigDecimal tExpenseAcct) {
		this.tExpenseAcct = tExpenseAcct;
	}


	@Column(name="T_LIABILITY_ACCT")
	public BigDecimal getTLiabilityAcct() {
		return this.tLiabilityAcct;
	}

	public void setTLiabilityAcct(BigDecimal tLiabilityAcct) {
		this.tLiabilityAcct = tLiabilityAcct;
	}


	@Column(name="T_RECEIVABLES_ACCT")
	public BigDecimal getTReceivablesAcct() {
		return this.tReceivablesAcct;
	}

	public void setTReceivablesAcct(BigDecimal tReceivablesAcct) {
		this.tReceivablesAcct = tReceivablesAcct;
	}


	@Column(name="UNEARNEDREVENUE_ACCT")
	public BigDecimal getUnearnedrevenueAcct() {
		return this.unearnedrevenueAcct;
	}

	public void setUnearnedrevenueAcct(BigDecimal unearnedrevenueAcct) {
		this.unearnedrevenueAcct = unearnedrevenueAcct;
	}


	@Column(name="UNREALIZEDGAIN_ACCT")
	public BigDecimal getUnrealizedgainAcct() {
		return this.unrealizedgainAcct;
	}

	public void setUnrealizedgainAcct(BigDecimal unrealizedgainAcct) {
		this.unrealizedgainAcct = unrealizedgainAcct;
	}


	@Column(name="UNREALIZEDLOSS_ACCT")
	public BigDecimal getUnrealizedlossAcct() {
		return this.unrealizedlossAcct;
	}

	public void setUnrealizedlossAcct(BigDecimal unrealizedlossAcct) {
		this.unrealizedlossAcct = unrealizedlossAcct;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}


	@Column(name="V_LIABILITY_ACCT")
	public BigDecimal getVLiabilityAcct() {
		return this.vLiabilityAcct;
	}

	public void setVLiabilityAcct(BigDecimal vLiabilityAcct) {
		this.vLiabilityAcct = vLiabilityAcct;
	}


	@Column(name="V_LIABILITY_SERVICES_ACCT")
	public BigDecimal getVLiabilityServicesAcct() {
		return this.vLiabilityServicesAcct;
	}

	public void setVLiabilityServicesAcct(BigDecimal vLiabilityServicesAcct) {
		this.vLiabilityServicesAcct = vLiabilityServicesAcct;
	}


	@Column(name="V_PREPAYMENT_ACCT")
	public BigDecimal getVPrepaymentAcct() {
		return this.vPrepaymentAcct;
	}

	public void setVPrepaymentAcct(BigDecimal vPrepaymentAcct) {
		this.vPrepaymentAcct = vPrepaymentAcct;
	}


	@Column(name="W_DIFFERENCES_ACCT")
	public BigDecimal getWDifferencesAcct() {
		return this.wDifferencesAcct;
	}

	public void setWDifferencesAcct(BigDecimal wDifferencesAcct) {
		this.wDifferencesAcct = wDifferencesAcct;
	}


	@Column(name="W_INVACTUALADJUST_ACCT")
	public BigDecimal getWInvactualadjustAcct() {
		return this.wInvactualadjustAcct;
	}

	public void setWInvactualadjustAcct(BigDecimal wInvactualadjustAcct) {
		this.wInvactualadjustAcct = wInvactualadjustAcct;
	}


	@Column(name="W_INVENTORY_ACCT")
	public BigDecimal getWInventoryAcct() {
		return this.wInventoryAcct;
	}

	public void setWInventoryAcct(BigDecimal wInventoryAcct) {
		this.wInventoryAcct = wInventoryAcct;
	}


	@Column(name="W_REVALUATION_ACCT")
	public BigDecimal getWRevaluationAcct() {
		return this.wRevaluationAcct;
	}

	public void setWRevaluationAcct(BigDecimal wRevaluationAcct) {
		this.wRevaluationAcct = wRevaluationAcct;
	}


	@Column(name="WITHHOLDING_ACCT")
	public BigDecimal getWithholdingAcct() {
		return this.withholdingAcct;
	}

	public void setWithholdingAcct(BigDecimal withholdingAcct) {
		this.withholdingAcct = withholdingAcct;
	}


	@Column(name="WRITEOFF_ACCT")
	public BigDecimal getWriteoffAcct() {
		return this.writeoffAcct;
	}

	public void setWriteoffAcct(BigDecimal writeoffAcct) {
		this.writeoffAcct = writeoffAcct;
	}

}