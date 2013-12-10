package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_orderline database table.
 * 
 */
@Entity
@Table(name="c_orderline")
@NamedQuery(name="COrderline.findAll", query="SELECT c FROM COrderline c")
public class COrderline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cOrderlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal cActivityId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cCampaignId;
	private BigDecimal cChargeId;
	private BigDecimal cCurrencyId;
	private BigDecimal cOrderId;
	private BigDecimal cProjectId;
	private BigDecimal cProjectphaseId;
	private BigDecimal cProjecttaskId;
	private BigDecimal cTaxId;
	private BigDecimal cUomId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datedelivered;
	private Date dateinvoiced;
	private Date dateordered;
	private Date datepromised;
	private String description;
	private BigDecimal discount;
	private BigDecimal freightamt;
	private String isactive;
	private String isdescription;
	private BigDecimal line;
	private BigDecimal linenetamt;
	private BigDecimal linkOrderlineId;
	private BigDecimal mAttributesetinstanceId;
	private BigDecimal mProductId;
	private BigDecimal mPromotionId;
	private BigDecimal mShipperId;
	private BigDecimal mWarehouseId;
	private BigDecimal ppCostCollectorId;
	private BigDecimal priceactual;
	private BigDecimal pricecost;
	private BigDecimal priceentered;
	private BigDecimal pricelimit;
	private BigDecimal pricelist;
	private String processed;
	private BigDecimal qtydelivered;
	private BigDecimal qtyentered;
	private BigDecimal qtyinvoiced;
	private BigDecimal qtylostsales;
	private BigDecimal qtyordered;
	private BigDecimal qtyreserved;
	private BigDecimal refOrderlineId;
	private BigDecimal rramt;
	private Date rrstartdate;
	private BigDecimal sResourceassignmentId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;

	public COrderline() {
	}


	@Id
	@Column(name="C_ORDERLINE_ID")
	public long getCOrderlineId() {
		return this.cOrderlineId;
	}

	public void setCOrderlineId(long cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
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


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
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


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatedelivered() {
		return this.datedelivered;
	}

	public void setDatedelivered(Date datedelivered) {
		this.datedelivered = datedelivered;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateinvoiced() {
		return this.dateinvoiced;
	}

	public void setDateinvoiced(Date dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateordered() {
		return this.dateordered;
	}

	public void setDateordered(Date dateordered) {
		this.dateordered = dateordered;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatepromised() {
		return this.datepromised;
	}

	public void setDatepromised(Date datepromised) {
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


	@Column(name="LINK_ORDERLINE_ID")
	public BigDecimal getLinkOrderlineId() {
		return this.linkOrderlineId;
	}

	public void setLinkOrderlineId(BigDecimal linkOrderlineId) {
		this.linkOrderlineId = linkOrderlineId;
	}


	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public BigDecimal getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	@Column(name="M_PROMOTION_ID")
	public BigDecimal getMPromotionId() {
		return this.mPromotionId;
	}

	public void setMPromotionId(BigDecimal mPromotionId) {
		this.mPromotionId = mPromotionId;
	}


	@Column(name="M_SHIPPER_ID")
	public BigDecimal getMShipperId() {
		return this.mShipperId;
	}

	public void setMShipperId(BigDecimal mShipperId) {
		this.mShipperId = mShipperId;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	@Column(name="PP_COST_COLLECTOR_ID")
	public BigDecimal getPpCostCollectorId() {
		return this.ppCostCollectorId;
	}

	public void setPpCostCollectorId(BigDecimal ppCostCollectorId) {
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


	@Column(name="REF_ORDERLINE_ID")
	public BigDecimal getRefOrderlineId() {
		return this.refOrderlineId;
	}

	public void setRefOrderlineId(BigDecimal refOrderlineId) {
		this.refOrderlineId = refOrderlineId;
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