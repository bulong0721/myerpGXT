package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="dd_orderline")
public class DdOrderline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer cActivityId;
	private Integer cCampaignId;
	private Integer cChargeId;
	private Integer cProjectId;
	private Integer cUomId;
	private BigDecimal confirmedqty;
	private String created;
	private Integer createdby;
	private String datedelivered;
	private String dateordered;
	private String datepromised;
	private Integer ddOrderId;
	private Integer ddOrderlineId;
	private String description;
	private BigDecimal freightamt;
	private Boolean isactive;
	private Boolean isdescription;
	private Boolean isinvoiced;
	private Integer line;
	private BigDecimal linenetamt;
	private Integer mAttributesetinstanceId;
	private Integer mAttributesetinstancetoId;
	private Integer mLocatorId;
	private Integer mLocatortoId;
	private Integer mProductId;
	private Integer mShipperId;
	private BigDecimal pickedqty;
	private Boolean processed;
	private BigDecimal qtydelivered;
	private BigDecimal qtyentered;
	private BigDecimal qtyintransit;
	private BigDecimal qtyordered;
	private BigDecimal qtyreserved;
	private BigDecimal scrappedqty;
	private BigDecimal targetqty;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;

	public DdOrderline() {
	}

	public DdOrderline(Integer ddOrderlineId) {
		this.ddOrderlineId = ddOrderlineId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	public Integer getCChargeId() {
		return cChargeId;
	}

	public void setCChargeId(Integer cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	public BigDecimal getConfirmedqty() {
		return confirmedqty;
	}

	public void setConfirmedqty(BigDecimal confirmedqty) {
		this.confirmedqty = confirmedqty;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDatedelivered() {
		return datedelivered;
	}

	public void setDatedelivered(String datedelivered) {
		this.datedelivered = datedelivered;
	}

	@Basic
	public String getDateordered() {
		return dateordered;
	}

	public void setDateordered(String dateordered) {
		this.dateordered = dateordered;
	}

	@Basic
	public String getDatepromised() {
		return datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	@Basic
	@Column(name="DD_ORDER_ID", columnDefinition="INT", nullable=false)
	public Integer getDdOrderId() {
		return ddOrderId;
	}

	public void setDdOrderId(Integer ddOrderId) {
		this.ddOrderId = ddOrderId;
	}

	@Id
	@Column(name="DD_ORDERLINE_ID", columnDefinition="INT")
	public Integer getDdOrderlineId() {
		return ddOrderlineId;
	}

	public void setDdOrderlineId(Integer ddOrderlineId) {
		this.ddOrderlineId = ddOrderlineId;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public BigDecimal getFreightamt() {
		return freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdescription() {
		return isdescription;
	}

	public void setIsdescription(Boolean isdescription) {
		this.isdescription = isdescription;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsinvoiced() {
		return isinvoiced;
	}

	public void setIsinvoiced(Boolean isinvoiced) {
		this.isinvoiced = isinvoiced;
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
	public BigDecimal getLinenetamt() {
		return linenetamt;
	}

	public void setLinenetamt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCETO_ID", columnDefinition="INT")
	public Integer getMAttributesetinstancetoId() {
		return mAttributesetinstancetoId;
	}

	public void setMAttributesetinstancetoId(Integer mAttributesetinstancetoId) {
		this.mAttributesetinstancetoId = mAttributesetinstancetoId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_LOCATORTO_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatortoId() {
		return mLocatortoId;
	}

	public void setMLocatortoId(Integer mLocatortoId) {
		this.mLocatortoId = mLocatortoId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="M_SHIPPER_ID", columnDefinition="INT")
	public Integer getMShipperId() {
		return mShipperId;
	}

	public void setMShipperId(Integer mShipperId) {
		this.mShipperId = mShipperId;
	}

	@Basic
	public BigDecimal getPickedqty() {
		return pickedqty;
	}

	public void setPickedqty(BigDecimal pickedqty) {
		this.pickedqty = pickedqty;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public BigDecimal getQtydelivered() {
		return qtydelivered;
	}

	public void setQtydelivered(BigDecimal qtydelivered) {
		this.qtydelivered = qtydelivered;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyentered() {
		return qtyentered;
	}

	public void setQtyentered(BigDecimal qtyentered) {
		this.qtyentered = qtyentered;
	}

	@Basic
	public BigDecimal getQtyintransit() {
		return qtyintransit;
	}

	public void setQtyintransit(BigDecimal qtyintransit) {
		this.qtyintransit = qtyintransit;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyordered() {
		return qtyordered;
	}

	public void setQtyordered(BigDecimal qtyordered) {
		this.qtyordered = qtyordered;
	}

	@Basic
	public BigDecimal getQtyreserved() {
		return qtyreserved;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	@Basic
	public BigDecimal getScrappedqty() {
		return scrappedqty;
	}

	public void setScrappedqty(BigDecimal scrappedqty) {
		this.scrappedqty = scrappedqty;
	}

	@Basic
	public BigDecimal getTargetqty() {
		return targetqty;
	}

	public void setTargetqty(BigDecimal targetqty) {
		this.targetqty = targetqty;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}
}