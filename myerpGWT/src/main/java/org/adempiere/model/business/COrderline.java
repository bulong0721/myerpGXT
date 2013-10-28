package org.adempiere.model.business;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.AdEntityBase;

/**
 * The persistent class for the c_orderline database table.
 * 
 */
@Entity
@Table(name = "c_orderline")
public class COrderline extends AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				cOrderlineId;
	private Long				adClientId;
	private Long				adOrgId;
	private Long				adOrgtrxId;
	private Long				cActivityId;
	private Long				cBpartnerId;
	private Long				cBpartnerLocationId;
	private Long				cCampaignId;
	private Long				cChargeId;
	private Long				cCurrencyId;
	private Long				cOrderId;
	private Long				cProjectId;
	private Long				cProjectphaseId;
	private Long				cProjecttaskId;
	private Long				cTaxId;
	private Long				cUomId;
	private String				created;
	private Long				createdby;
	private String				datedelivered;
	private String				dateinvoiced;
	private String				dateordered;
	private String				datepromised;
	private String				description;
	private BigDecimal			discount;
	private BigDecimal			freightamt;
	private String				isactive;
	private String				isdescription;
	private Long				line;
	private Long				linenetamt;
	private Long				linkOrderlineId;
	private Long				mAttributesetinstanceId;
	private Long				mProductId;
	private Long				mPromotionId;
	private Long				mShipperId;
	private Long				mWarehouseId;
	private Long				ppCostCollectorId;
	private BigDecimal			priceactual;
	private BigDecimal			pricecost;
	private BigDecimal			priceentered;
	private BigDecimal			pricelimit;
	private BigDecimal			pricelist;
	private String				processed;
	private BigDecimal			qtydelivered;
	private BigDecimal			qtyentered;
	private BigDecimal			qtyinvoiced;
	private BigDecimal			qtylostsales;
	private BigDecimal			qtyordered;
	private BigDecimal			qtyreserved;
	private Long				refOrderlineId;
	private BigDecimal			rramt;
	private String				rrstartdate;
	private Long				sResourceassignmentId;
	private String				updated;
	private Long				updatedby;
	private Long				user1Id;
	private Long				user2Id;

	public COrderline() {
	}

	@Id
	@Column(name = "C_ORDERLINE_ID")
	public long getCOrderlineId() {
		return this.cOrderlineId;
	}

	public void setCOrderlineId(long cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_ORGTRX_ID")
	public Long getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(Long adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Column(name = "C_ACTIVITY_ID")
	public Long getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(Long cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Column(name = "C_BPARTNER_ID")
	public Long getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(Long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Column(name = "C_BPARTNER_LOCATION_ID")
	public Long getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Long cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Column(name = "C_CAMPAIGN_ID")
	public Long getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(Long cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Column(name = "C_CHARGE_ID")
	public Long getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(Long cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Column(name = "C_CURRENCY_ID")
	public Long getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(Long cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Column(name = "C_ORDER_ID")
	public Long getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(Long cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Column(name = "C_PROJECT_ID")
	public Long getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(Long cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Column(name = "C_PROJECTPHASE_ID")
	public Long getCProjectphaseId() {
		return this.cProjectphaseId;
	}

	public void setCProjectphaseId(Long cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}

	@Column(name = "C_PROJECTTASK_ID")
	public Long getCProjecttaskId() {
		return this.cProjecttaskId;
	}

	public void setCProjecttaskId(Long cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}

	@Column(name = "C_TAX_ID")
	public Long getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(Long cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Column(name = "C_UOM_ID")
	public Long getCUomId() {
		return this.cUomId;
	}

	public void setCUomId(Long cUomId) {
		this.cUomId = cUomId;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDatedelivered() {
		return this.datedelivered;
	}

	public void setDatedelivered(String datedelivered) {
		this.datedelivered = datedelivered;
	}

	public String getDateinvoiced() {
		return this.dateinvoiced;
	}

	public void setDateinvoiced(String dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
	}

	public String getDateordered() {
		return this.dateordered;
	}

	public void setDateordered(String dateordered) {
		this.dateordered = dateordered;
	}

	public String getDatepromised() {
		return this.datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getFreightamt() {
		return this.freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
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

	public Long getLine() {
		return this.line;
	}

	public void setLine(Long line) {
		this.line = line;
	}

	public Long getLinenetamt() {
		return this.linenetamt;
	}

	public void setLinenetamt(Long linenetamt) {
		this.linenetamt = linenetamt;
	}

	@Column(name = "LINK_ORDERLINE_ID")
	public Long getLinkOrderlineId() {
		return this.linkOrderlineId;
	}

	public void setLinkOrderlineId(Long linkOrderlineId) {
		this.linkOrderlineId = linkOrderlineId;
	}

	@Column(name = "M_ATTRIBUTESETINSTANCE_ID")
	public Long getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Long mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Column(name = "M_PRODUCT_ID")
	public Long getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(Long mProductId) {
		this.mProductId = mProductId;
	}

	@Column(name = "M_PROMOTION_ID")
	public Long getMPromotionId() {
		return this.mPromotionId;
	}

	public void setMPromotionId(Long mPromotionId) {
		this.mPromotionId = mPromotionId;
	}

	@Column(name = "M_SHIPPER_ID")
	public Long getMShipperId() {
		return this.mShipperId;
	}

	public void setMShipperId(Long mShipperId) {
		this.mShipperId = mShipperId;
	}

	@Column(name = "M_WAREHOUSE_ID")
	public Long getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(Long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Column(name = "PP_COST_COLLECTOR_ID")
	public Long getPpCostCollectorId() {
		return this.ppCostCollectorId;
	}

	public void setPpCostCollectorId(Long ppCostCollectorId) {
		this.ppCostCollectorId = ppCostCollectorId;
	}

	public BigDecimal getPriceactual() {
		return this.priceactual;
	}

	public void setPriceactual(BigDecimal priceactual) {
		this.priceactual = priceactual;
	}

	public BigDecimal getPricecost() {
		return this.pricecost;
	}

	public void setPricecost(BigDecimal pricecost) {
		this.pricecost = pricecost;
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

	public BigDecimal getQtydelivered() {
		return this.qtydelivered;
	}

	public void setQtydelivered(BigDecimal qtydelivered) {
		this.qtydelivered = qtydelivered;
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

	public BigDecimal getQtylostsales() {
		return this.qtylostsales;
	}

	public void setQtylostsales(BigDecimal qtylostsales) {
		this.qtylostsales = qtylostsales;
	}

	public BigDecimal getQtyordered() {
		return this.qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	public BigDecimal getQtyreserved() {
		return this.qtyreserved;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	@Column(name = "REF_ORDERLINE_ID")
	public Long getRefOrderlineId() {
		return this.refOrderlineId;
	}

	public void setRefOrderlineId(Long refOrderlineId) {
		this.refOrderlineId = refOrderlineId;
	}

	public BigDecimal getRramt() {
		return this.rramt;
	}

	public void setRramt(BigDecimal rramt) {
		this.rramt = rramt;
	}

	public String getRrstartdate() {
		return this.rrstartdate;
	}

	public void setRrstartdate(String rrstartdate) {
		this.rrstartdate = rrstartdate;
	}

	@Column(name = "S_RESOURCEASSIGNMENT_ID")
	public Long getSResourceassignmentId() {
		return this.sResourceassignmentId;
	}

	public void setSResourceassignmentId(Long sResourceassignmentId) {
		this.sResourceassignmentId = sResourceassignmentId;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	@Column(name = "USER1_ID")
	public Long getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(Long user1Id) {
		this.user1Id = user1Id;
	}

	@Column(name = "USER2_ID")
	public Long getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(Long user2Id) {
		this.user2Id = user2Id;
	}

}