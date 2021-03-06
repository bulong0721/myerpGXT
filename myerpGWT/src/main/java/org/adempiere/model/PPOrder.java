package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order")
public class PPOrder extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Integer aDWorkflowID;
	private Boolean active;
	private Boolean approved;
	private BigDecimal assay;
	private Integer cActivityID;
	private Integer cCampaignID;
	private Integer cDocTypeID;
	private Integer cDocTypeTargetID;
	private Integer cOrderLineID;
	private Integer cProjectID;
	private Integer cUOMID;
	private Boolean copyFrom;
	private String created;
	private Integer createdBy;
	private String dateConfirm;
	private String dateDelivered;
	private String dateFinish;
	private String dateFinishSchedule;
	private String dateOrdered;
	private String datePromised;
	private String dateStart;
	private String dateStartSchedule;
	private String description;
	private String docAction;
	private String docStatus;
	private String documentNo;
	private BigDecimal floatAfter;
	private BigDecimal floatBefored;
	private Integer line;
	private String lot;
	private Integer mAttributeSetInstanceID;
	private Integer mProductID;
	private Integer mWarehouseID;
	private String orderType;
	private Integer pPOrderID;
	private Integer pPProductBOMID;
	private Integer plannerID;
	private Boolean posted;
	private Boolean printed;
	private String priorityRule;
	private Boolean processed;
	private Long processedOn;
	private Boolean processing;
	private BigDecimal qtyBatchSize;
	private BigDecimal qtyBatchs;
	private BigDecimal qtyDelivered;
	private BigDecimal qtyEntered;
	private BigDecimal qtyOrdered;
	private Boolean qtyPercentage;
	private BigDecimal qtyReject;
	private BigDecimal qtyReserved;
	private BigDecimal qtyScrap;
	private Boolean sOTrx;
	private Integer sResourceID;
	private String scheduleType;
	private Boolean selected;
	private String serNo;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;
	private BigDecimal yield;

	public PPOrder() {
	}

	public PPOrder(Integer pPOrderID) {
		this.pPOrderID = pPOrderID;
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
	@Column(name="AD_WORKFLOW_ID", columnDefinition="INT", nullable=false)
	public Integer getADWorkflowID() {
		return aDWorkflowID;
	}

	public void setADWorkflowID(Integer aDWorkflowID) {
		this.aDWorkflowID = aDWorkflowID;
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
	@Column(name="ISAPPROVED", nullable=false)
	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	@Basic
	public BigDecimal getAssay() {
		return assay;
	}

	public void setAssay(BigDecimal assay) {
		this.assay = assay;
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
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignID() {
		return cCampaignID;
	}

	public void setCCampaignID(Integer cCampaignID) {
		this.cCampaignID = cCampaignID;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
	}

	@Basic
	@Column(name="C_DOCTYPETARGET_ID", columnDefinition="INT", nullable=false)
	public Integer getCDocTypeTargetID() {
		return cDocTypeTargetID;
	}

	public void setCDocTypeTargetID(Integer cDocTypeTargetID) {
		this.cDocTypeTargetID = cDocTypeTargetID;
	}

	@Basic
	@Column(name="C_ORDERLINE_ID", columnDefinition="INT")
	public Integer getCOrderLineID() {
		return cOrderLineID;
	}

	public void setCOrderLineID(Integer cOrderLineID) {
		this.cOrderLineID = cOrderLineID;
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
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
	}

	@Basic
	public Boolean isCopyFrom() {
		return copyFrom;
	}

	public void setCopyFrom(Boolean copyFrom) {
		this.copyFrom = copyFrom;
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
	public String getDateConfirm() {
		return dateConfirm;
	}

	public void setDateConfirm(String dateConfirm) {
		this.dateConfirm = dateConfirm;
	}

	@Basic
	public String getDateDelivered() {
		return dateDelivered;
	}

	public void setDateDelivered(String dateDelivered) {
		this.dateDelivered = dateDelivered;
	}

	@Basic
	public String getDateFinish() {
		return dateFinish;
	}

	public void setDateFinish(String dateFinish) {
		this.dateFinish = dateFinish;
	}

	@Basic
	public String getDateFinishSchedule() {
		return dateFinishSchedule;
	}

	public void setDateFinishSchedule(String dateFinishSchedule) {
		this.dateFinishSchedule = dateFinishSchedule;
	}

	@Basic
	@Column(nullable=false)
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Basic
	@Column(nullable=false)
	public String getDatePromised() {
		return datePromised;
	}

	public void setDatePromised(String datePromised) {
		this.datePromised = datePromised;
	}

	@Basic
	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	@Basic
	@Column(nullable=false)
	public String getDateStartSchedule() {
		return dateStartSchedule;
	}

	public void setDateStartSchedule(String dateStartSchedule) {
		this.dateStartSchedule = dateStartSchedule;
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
	@Column(nullable=false, length=2)
	public String getDocAction() {
		return docAction;
	}

	public void setDocAction(String docAction) {
		this.docAction = docAction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	public BigDecimal getFloatAfter() {
		return floatAfter;
	}

	public void setFloatAfter(BigDecimal floatAfter) {
		this.floatAfter = floatAfter;
	}

	@Basic
	public BigDecimal getFloatBefored() {
		return floatBefored;
	}

	public void setFloatBefored(BigDecimal floatBefored) {
		this.floatBefored = floatBefored;
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
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseID() {
		return mWarehouseID;
	}

	public void setMWarehouseID(Integer mWarehouseID) {
		this.mWarehouseID = mWarehouseID;
	}

	@Basic
	@Column(length=1)
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Id
	@Column(name="PP_ORDER_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53024", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PP_Order", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53024")
	public Integer getPPOrderID() {
		return pPOrderID;
	}

	public void setPPOrderID(Integer pPOrderID) {
		this.pPOrderID = pPOrderID;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOM_ID", columnDefinition="INT", nullable=false)
	public Integer getPPProductBOMID() {
		return pPProductBOMID;
	}

	public void setPPProductBOMID(Integer pPProductBOMID) {
		this.pPProductBOMID = pPProductBOMID;
	}

	@Basic
	@Column(name="PLANNER_ID", columnDefinition="INT")
	public Integer getPlannerID() {
		return plannerID;
	}

	public void setPlannerID(Integer plannerID) {
		this.plannerID = plannerID;
	}

	@Basic
	public Boolean isPosted() {
		return posted;
	}

	public void setPosted(Boolean posted) {
		this.posted = posted;
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
	@Column(nullable=false, length=1)
	public String getPriorityRule() {
		return priorityRule;
	}

	public void setPriorityRule(String priorityRule) {
		this.priorityRule = priorityRule;
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
	public Long getProcessedOn() {
		return processedOn;
	}

	public void setProcessedOn(Long processedOn) {
		this.processedOn = processedOn;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	public BigDecimal getQtyBatchSize() {
		return qtyBatchSize;
	}

	public void setQtyBatchSize(BigDecimal qtyBatchSize) {
		this.qtyBatchSize = qtyBatchSize;
	}

	@Basic
	public BigDecimal getQtyBatchs() {
		return qtyBatchs;
	}

	public void setQtyBatchs(BigDecimal qtyBatchs) {
		this.qtyBatchs = qtyBatchs;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyDelivered() {
		return qtyDelivered;
	}

	public void setQtyDelivered(BigDecimal qtyDelivered) {
		this.qtyDelivered = qtyDelivered;
	}

	@Basic
	public BigDecimal getQtyEntered() {
		return qtyEntered;
	}

	public void setQtyEntered(BigDecimal qtyEntered) {
		this.qtyEntered = qtyEntered;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	@Basic
	@Column(name="ISQTYPERCENTAGE")
	public Boolean isQtyPercentage() {
		return qtyPercentage;
	}

	public void setQtyPercentage(Boolean qtyPercentage) {
		this.qtyPercentage = qtyPercentage;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyReject() {
		return qtyReject;
	}

	public void setQtyReject(BigDecimal qtyReject) {
		this.qtyReject = qtyReject;
	}

	@Basic
	public BigDecimal getQtyReserved() {
		return qtyReserved;
	}

	public void setQtyReserved(BigDecimal qtyReserved) {
		this.qtyReserved = qtyReserved;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyScrap() {
		return qtyScrap;
	}

	public void setQtyScrap(BigDecimal qtyScrap) {
		this.qtyScrap = qtyScrap;
	}

	@Basic
	@Column(name="ISSOTRX", nullable=false)
	public Boolean isSOTrx() {
		return sOTrx;
	}

	public void setSOTrx(Boolean sOTrx) {
		this.sOTrx = sOTrx;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", columnDefinition="INT", nullable=false)
	public Integer getSResourceID() {
		return sResourceID;
	}

	public void setSResourceID(Integer sResourceID) {
		this.sResourceID = sResourceID;
	}

	@Basic
	@Column(length=1)
	public String getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	@Basic
	@Column(name="ISSELECTED", nullable=false)
	public Boolean isSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
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

	@Basic
	@Column(nullable=false)
	public BigDecimal getYield() {
		return yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}
}