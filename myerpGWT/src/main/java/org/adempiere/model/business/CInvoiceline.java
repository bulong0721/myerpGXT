package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_invoiceline database table.
 * 
 */
@Entity
@Table(name="c_invoiceline")
@NamedQuery(name="CInvoiceline.findAll", query="SELECT c FROM CInvoiceline c")
public class CInvoiceline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoicelineId;
	private BigDecimal aAssetGroupId;
	private BigDecimal aAssetId;
	private String aCapvsexp;
	private String aCreateasset;
	private String aProcessed;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal cActivityId;
	private BigDecimal cCampaignId;
	private BigDecimal cChargeId;
	private BigDecimal cInvoiceId;
	private BigDecimal cOrderlineId;
	private BigDecimal cProjectId;
	private BigDecimal cProjectphaseId;
	private BigDecimal cProjecttaskId;
	private BigDecimal cTaxId;
	private BigDecimal cUomId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isdescription;
	private String isprinted;
	private BigDecimal line;
	private BigDecimal linenetamt;
	private BigDecimal linetotalamt;
	private BigDecimal mAttributesetinstanceId;
	private BigDecimal mInoutlineId;
	private BigDecimal mProductId;
	private BigDecimal mRmalineId;
	private BigDecimal priceactual;
	private BigDecimal priceentered;
	private BigDecimal pricelimit;
	private BigDecimal pricelist;
	private String processed;
	private BigDecimal qtyentered;
	private BigDecimal qtyinvoiced;
	private BigDecimal refInvoicelineId;
	private BigDecimal rramt;
	private Date rrstartdate;
	private BigDecimal sResourceassignmentId;
	private BigDecimal taxamt;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;

	public CInvoiceline() {
	}


	@Id
	@Column(name="C_INVOICELINE_ID")
	public long getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(long cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}


	@Column(name="A_ASSET_GROUP_ID")
	public BigDecimal getAAssetGroupId() {
		return this.aAssetGroupId;
	}

	public void setAAssetGroupId(BigDecimal aAssetGroupId) {
		this.aAssetGroupId = aAssetGroupId;
	}


	@Column(name="A_ASSET_ID")
	public BigDecimal getAAssetId() {
		return this.aAssetId;
	}

	public void setAAssetId(BigDecimal aAssetId) {
		this.aAssetId = aAssetId;
	}


	@Column(name="A_CAPVSEXP")
	public String getACapvsexp() {
		return this.aCapvsexp;
	}

	public void setACapvsexp(String aCapvsexp) {
		this.aCapvsexp = aCapvsexp;
	}


	@Column(name="A_CREATEASSET")
	public String getACreateasset() {
		return this.aCreateasset;
	}

	public void setACreateasset(String aCreateasset) {
		this.aCreateasset = aCreateasset;
	}


	@Column(name="A_PROCESSED")
	public String getAProcessed() {
		return this.aProcessed;
	}

	public void setAProcessed(String aProcessed) {
		this.aProcessed = aProcessed;
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


	@Column(name="AD_ORGTRX_ID")
	public BigDecimal getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_ORDERLINE_ID")
	public BigDecimal getCOrderlineId() {
		return this.cOrderlineId;
	}

	public void setCOrderlineId(BigDecimal cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_PROJECTPHASE_ID")
	public BigDecimal getCProjectphaseId() {
		return this.cProjectphaseId;
	}

	public void setCProjectphaseId(BigDecimal cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}


	@Column(name="C_PROJECTTASK_ID")
	public BigDecimal getCProjecttaskId() {
		return this.cProjecttaskId;
	}

	public void setCProjecttaskId(BigDecimal cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}


	@Column(name="C_TAX_ID")
	public BigDecimal getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(BigDecimal cTaxId) {
		this.cTaxId = cTaxId;
	}


	@Column(name="C_UOM_ID")
	public BigDecimal getCUomId() {
		return this.cUomId;
	}

	public void setCUomId(BigDecimal cUomId) {
		this.cUomId = cUomId;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdescription() {
		return this.isdescription;
	}

	public void setIsdescription(String isdescription) {
		this.isdescription = isdescription;
	}


	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public BigDecimal getLinenetamt() {
		return this.linenetamt;
	}

	public void setLinenetamt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}


	public BigDecimal getLinetotalamt() {
		return this.linetotalamt;
	}

	public void setLinetotalamt(BigDecimal linetotalamt) {
		this.linetotalamt = linetotalamt;
	}


	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public BigDecimal getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}


	@Column(name="M_INOUTLINE_ID")
	public BigDecimal getMInoutlineId() {
		return this.mInoutlineId;
	}

	public void setMInoutlineId(BigDecimal mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	@Column(name="M_RMALINE_ID")
	public BigDecimal getMRmalineId() {
		return this.mRmalineId;
	}

	public void setMRmalineId(BigDecimal mRmalineId) {
		this.mRmalineId = mRmalineId;
	}


	public BigDecimal getPriceactual() {
		return this.priceactual;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.priceactual = priceactual;
	}


	public BigDecimal getPriceentered() {
		return this.priceentered;
	}

	public void setPriceentered(BigDecimal priceentered) {
		this.priceentered = priceentered;
	}


	public BigDecimal getPricelimit() {
		return this.pricelimit;
	}

	public void setPricelimit(BigDecimal pricelimit) {
		this.pricelimit = pricelimit;
	}


	public BigDecimal getPricelist() {
		return this.pricelist;
	}

	public void setPricelist(BigDecimal pricelist) {
		this.pricelist = pricelist;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getQtyentered() {
		return this.qtyentered;
	}

	public void setQtyentered(BigDecimal qtyentered) {
		this.qtyentered = qtyentered;
	}


	public BigDecimal getQtyinvoiced() {
		return this.qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}


	@Column(name="REF_INVOICELINE_ID")
	public BigDecimal getRefInvoicelineId() {
		return this.refInvoicelineId;
	}

	public void setRefInvoicelineId(BigDecimal refInvoicelineId) {
		this.refInvoicelineId = refInvoicelineId;
	}


	public BigDecimal getRramt() {
		return this.rramt;
	}

	public void setRramt(BigDecimal rramt) {
		this.rramt = rramt;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getRrstartdate() {
		return this.rrstartdate;
	}

	public void setRrstartdate(Date rrstartdate) {
		this.rrstartdate = rrstartdate;
	}


	@Column(name="S_RESOURCEASSIGNMENT_ID")
	public BigDecimal getSResourceassignmentId() {
		return this.sResourceassignmentId;
	}

	public void setSResourceassignmentId(BigDecimal sResourceassignmentId) {
		this.sResourceassignmentId = sResourceassignmentId;
	}


	public BigDecimal getTaxamt() {
		return this.taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
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


	@Column(name="USER1_ID")
	public BigDecimal getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(BigDecimal user1Id) {
		this.user1Id = user1Id;
	}


	@Column(name="USER2_ID")
	public BigDecimal getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(BigDecimal user2Id) {
		this.user2Id = user2Id;
	}

}