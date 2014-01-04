package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="i_productplanning")
public class IProductplanning extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adWorkflowId;
	private String bpartnerValue;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private String datepromised;
	private Integer ddNetworkdistributionId;
	private BigDecimal deliverytimePromised;
	private String forecastvalue;
	private String iErrormsg;
	private String iIsimported;
	private Integer iProductplanningId;
	private String isactive;
	private String iscreateplan;
	private String ismps;
	private String isphantom;
	private Integer mForecastId;
	private Integer mForecastlineId;
	private Integer mProductId;
	private Integer mWarehouseId;
	private String networkdistributionvalue;
	private BigDecimal orderMax;
	private BigDecimal orderMin;
	private BigDecimal orderPack;
	private BigDecimal orderPeriod;
	private String orderPolicy;
	private BigDecimal orderQty;
	private String orgvalue;
	private Integer plannerId;
	private String plannervalue;
	private Integer ppProductBomId;
	private Integer ppProductPlanningId;
	private String processed;
	private String processing;
	private String productBomValue;
	private String productvalue;
	private BigDecimal qty;
	private String resourcevalue;
	private Integer sResourceId;
	private BigDecimal safetystock;
	private Integer salesrepId;
	private BigDecimal timefence;
	private BigDecimal transferttime;
	private String updated;
	private Integer updatedby;
	private String vendorproductno;
	private String warehousevalue;
	private BigDecimal workingtime;
	private Integer yield;

	public IProductplanning() {
	}

	public IProductplanning(Integer iProductplanningId) {
		this.iProductplanningId = iProductplanningId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_WORKFLOW_ID")
	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	@Basic
	@Column(name="BPARTNER_VALUE", length=40)
	public String getBpartnerValue() {
		return bpartnerValue;
	}

	public void setBpartnerValue(String bpartnerValue) {
		this.bpartnerValue = bpartnerValue;
	}

	@Basic
	@Column(name="C_BPARTNER_ID")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDatepromised() {
		return datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	@Basic
	@Column(name="DD_NETWORKDISTRIBUTION_ID")
	public Integer getDdNetworkdistributionId() {
		return ddNetworkdistributionId;
	}

	public void setDdNetworkdistributionId(Integer ddNetworkdistributionId) {
		this.ddNetworkdistributionId = ddNetworkdistributionId;
	}

	@Basic
	@Column(name="DELIVERYTIME_PROMISED")
	public BigDecimal getDeliverytimePromised() {
		return deliverytimePromised;
	}

	public void setDeliverytimePromised(BigDecimal deliverytimePromised) {
		this.deliverytimePromised = deliverytimePromised;
	}

	@Basic
	@Column(length=40)
	public String getForecastvalue() {
		return forecastvalue;
	}

	public void setForecastvalue(String forecastvalue) {
		this.forecastvalue = forecastvalue;
	}

	@Basic
	@Column(name="I_ERRORMSG", length=2000)
	public String getIErrormsg() {
		return iErrormsg;
	}

	public void setIErrormsg(String iErrormsg) {
		this.iErrormsg = iErrormsg;
	}

	@Basic
	@Column(name="I_ISIMPORTED", nullable=false, length=1)
	public String getIIsimported() {
		return iIsimported;
	}

	public void setIIsimported(String iIsimported) {
		this.iIsimported = iIsimported;
	}

	@Id
	@Column(name="I_PRODUCTPLANNING_ID")
	public Integer getIProductplanningId() {
		return iProductplanningId;
	}

	public void setIProductplanningId(Integer iProductplanningId) {
		this.iProductplanningId = iProductplanningId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIscreateplan() {
		return iscreateplan;
	}

	public void setIscreateplan(String iscreateplan) {
		this.iscreateplan = iscreateplan;
	}

	@Basic
	@Column(length=1)
	public String getIsmps() {
		return ismps;
	}

	public void setIsmps(String ismps) {
		this.ismps = ismps;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsphantom() {
		return isphantom;
	}

	public void setIsphantom(String isphantom) {
		this.isphantom = isphantom;
	}

	@Basic
	@Column(name="M_FORECAST_ID")
	public Integer getMForecastId() {
		return mForecastId;
	}

	public void setMForecastId(Integer mForecastId) {
		this.mForecastId = mForecastId;
	}

	@Basic
	@Column(name="M_FORECASTLINE_ID")
	public Integer getMForecastlineId() {
		return mForecastlineId;
	}

	public void setMForecastlineId(Integer mForecastlineId) {
		this.mForecastlineId = mForecastlineId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(length=40)
	public String getNetworkdistributionvalue() {
		return networkdistributionvalue;
	}

	public void setNetworkdistributionvalue(String networkdistributionvalue) {
		this.networkdistributionvalue = networkdistributionvalue;
	}

	@Basic
	@Column(name="ORDER_MAX")
	public BigDecimal getOrderMax() {
		return orderMax;
	}

	public void setOrderMax(BigDecimal orderMax) {
		this.orderMax = orderMax;
	}

	@Basic
	@Column(name="ORDER_MIN")
	public BigDecimal getOrderMin() {
		return orderMin;
	}

	public void setOrderMin(BigDecimal orderMin) {
		this.orderMin = orderMin;
	}

	@Basic
	@Column(name="ORDER_PACK")
	public BigDecimal getOrderPack() {
		return orderPack;
	}

	public void setOrderPack(BigDecimal orderPack) {
		this.orderPack = orderPack;
	}

	@Basic
	@Column(name="ORDER_PERIOD")
	public BigDecimal getOrderPeriod() {
		return orderPeriod;
	}

	public void setOrderPeriod(BigDecimal orderPeriod) {
		this.orderPeriod = orderPeriod;
	}

	@Basic
	@Column(name="ORDER_POLICY", length=3)
	public String getOrderPolicy() {
		return orderPolicy;
	}

	public void setOrderPolicy(String orderPolicy) {
		this.orderPolicy = orderPolicy;
	}

	@Basic
	@Column(name="ORDER_QTY")
	public BigDecimal getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(BigDecimal orderQty) {
		this.orderQty = orderQty;
	}

	@Basic
	@Column(length=40)
	public String getOrgvalue() {
		return orgvalue;
	}

	public void setOrgvalue(String orgvalue) {
		this.orgvalue = orgvalue;
	}

	@Basic
	@Column(name="PLANNER_ID")
	public Integer getPlannerId() {
		return plannerId;
	}

	public void setPlannerId(Integer plannerId) {
		this.plannerId = plannerId;
	}

	@Basic
	@Column(length=40)
	public String getPlannervalue() {
		return plannervalue;
	}

	public void setPlannervalue(String plannervalue) {
		this.plannervalue = plannervalue;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOM_ID")
	public Integer getPpProductBomId() {
		return ppProductBomId;
	}

	public void setPpProductBomId(Integer ppProductBomId) {
		this.ppProductBomId = ppProductBomId;
	}

	@Basic
	@Column(name="PP_PRODUCT_PLANNING_ID")
	public Integer getPpProductPlanningId() {
		return ppProductPlanningId;
	}

	public void setPpProductPlanningId(Integer ppProductPlanningId) {
		this.ppProductPlanningId = ppProductPlanningId;
	}

	@Basic
	@Column(length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	@Basic
	@Column(length=1)
	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="PRODUCT_BOM_VALUE", length=40)
	public String getProductBomValue() {
		return productBomValue;
	}

	public void setProductBomValue(String productBomValue) {
		this.productBomValue = productBomValue;
	}

	@Basic
	@Column(length=40)
	public String getProductvalue() {
		return productvalue;
	}

	public void setProductvalue(String productvalue) {
		this.productvalue = productvalue;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(length=40)
	public String getResourcevalue() {
		return resourcevalue;
	}

	public void setResourcevalue(String resourcevalue) {
		this.resourcevalue = resourcevalue;
	}

	@Basic
	@Column(name="S_RESOURCE_ID")
	public Integer getSResourceId() {
		return sResourceId;
	}

	public void setSResourceId(Integer sResourceId) {
		this.sResourceId = sResourceId;
	}

	@Basic
	public BigDecimal getSafetystock() {
		return safetystock;
	}

	public void setSafetystock(BigDecimal safetystock) {
		this.safetystock = safetystock;
	}

	@Basic
	@Column(name="SALESREP_ID")
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
	}

	@Basic
	public BigDecimal getTimefence() {
		return timefence;
	}

	public void setTimefence(BigDecimal timefence) {
		this.timefence = timefence;
	}

	@Basic
	public BigDecimal getTransferttime() {
		return transferttime;
	}

	public void setTransferttime(BigDecimal transferttime) {
		this.transferttime = transferttime;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=30)
	public String getVendorproductno() {
		return vendorproductno;
	}

	public void setVendorproductno(String vendorproductno) {
		this.vendorproductno = vendorproductno;
	}

	@Basic
	@Column(length=40)
	public String getWarehousevalue() {
		return warehousevalue;
	}

	public void setWarehousevalue(String warehousevalue) {
		this.warehousevalue = warehousevalue;
	}

	@Basic
	public BigDecimal getWorkingtime() {
		return workingtime;
	}

	public void setWorkingtime(BigDecimal workingtime) {
		this.workingtime = workingtime;
	}

	@Basic
	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}
}