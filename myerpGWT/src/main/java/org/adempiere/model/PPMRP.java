package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_mrp")
public class PPMRP extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String active;
	private Boolean available;
	private Integer cBPartnerID;
	private Integer cOrderID;
	private Integer cOrderLineID;
	private String created;
	private Integer createdBy;
	private Integer dDOrderID;
	private Integer dDOrderLineID;
	private String dateConfirm;
	private String dateFinishSchedule;
	private String dateOrdered;
	private String datePromised;
	private String dateSimulation;
	private String dateStart;
	private String dateStartSchedule;
	private String description;
	private String docStatus;
	private Integer mForecastID;
	private Integer mForecastLineID;
	private Integer mProductID;
	private Integer mRequisitionID;
	private Integer mRequisitionLineID;
	private Integer mWarehouseID;
	private String name;
	private String orderType;
	private Integer pPMRPID;
	private Integer pPOrderBOMLineID;
	private Integer pPOrderID;
	private Integer plannerID;
	private String priority;
	private BigDecimal qty;
	private Integer sResourceID;
	private String typeMRP;
	private String updated;
	private Integer updatedBy;
	private String value;
	private BigDecimal version;

	public PPMRP() {
	}

	public PPMRP(Integer pPMRPID) {
		this.pPMRPID = pPMRPID;
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
	@Column(name="ISACTIVE", nullable=false, length=1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Basic
	@Column(name="ISAVAILABLE")
	public Boolean isAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
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
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
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
	@Column(name="DD_ORDER_ID", columnDefinition="INT")
	public Integer getDDOrderID() {
		return dDOrderID;
	}

	public void setDDOrderID(Integer dDOrderID) {
		this.dDOrderID = dDOrderID;
	}

	@Basic
	@Column(name="DD_ORDERLINE_ID", columnDefinition="INT")
	public Integer getDDOrderLineID() {
		return dDOrderLineID;
	}

	public void setDDOrderLineID(Integer dDOrderLineID) {
		this.dDOrderLineID = dDOrderLineID;
	}

	@Basic
	public String getDateConfirm() {
		return dateConfirm;
	}

	public void setDateConfirm(String dateConfirm) {
		this.dateConfirm = dateConfirm;
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
	public String getDateSimulation() {
		return dateSimulation;
	}

	public void setDateSimulation(String dateSimulation) {
		this.dateSimulation = dateSimulation;
	}

	@Basic
	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	@Basic
	public String getDateStartSchedule() {
		return dateStartSchedule;
	}

	public void setDateStartSchedule(String dateStartSchedule) {
		this.dateStartSchedule = dateStartSchedule;
	}

	@Basic
	@Column(length=1020)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2)
	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	@Basic
	@Column(name="M_FORECAST_ID", columnDefinition="INT")
	public Integer getMForecastID() {
		return mForecastID;
	}

	public void setMForecastID(Integer mForecastID) {
		this.mForecastID = mForecastID;
	}

	@Basic
	@Column(name="M_FORECASTLINE_ID", columnDefinition="INT")
	public Integer getMForecastLineID() {
		return mForecastLineID;
	}

	public void setMForecastLineID(Integer mForecastLineID) {
		this.mForecastLineID = mForecastLineID;
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
	@Column(name="M_REQUISITION_ID", columnDefinition="INT")
	public Integer getMRequisitionID() {
		return mRequisitionID;
	}

	public void setMRequisitionID(Integer mRequisitionID) {
		this.mRequisitionID = mRequisitionID;
	}

	@Basic
	@Column(name="M_REQUISITIONLINE_ID", columnDefinition="INT")
	public Integer getMRequisitionLineID() {
		return mRequisitionLineID;
	}

	public void setMRequisitionLineID(Integer mRequisitionLineID) {
		this.mRequisitionLineID = mRequisitionLineID;
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
	@Column(length=120)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=3)
	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Id
	@Column(name="PP_MRP_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53040", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PP_MRP", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53040")
	public Integer getPPMRPID() {
		return pPMRPID;
	}

	public void setPPMRPID(Integer pPMRPID) {
		this.pPMRPID = pPMRPID;
	}

	@Basic
	@Column(name="PP_ORDER_BOMLINE_ID", columnDefinition="INT")
	public Integer getPPOrderBOMLineID() {
		return pPOrderBOMLineID;
	}

	public void setPPOrderBOMLineID(Integer pPOrderBOMLineID) {
		this.pPOrderBOMLineID = pPOrderBOMLineID;
	}

	@Basic
	@Column(name="PP_ORDER_ID", columnDefinition="INT")
	public Integer getPPOrderID() {
		return pPOrderID;
	}

	public void setPPOrderID(Integer pPOrderID) {
		this.pPOrderID = pPOrderID;
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
	@Column(length=10)
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", columnDefinition="INT")
	public Integer getSResourceID() {
		return sResourceID;
	}

	public void setSResourceID(Integer sResourceID) {
		this.sResourceID = sResourceID;
	}

	@Basic
	@Column(length=1)
	public String getTypeMRP() {
		return typeMRP;
	}

	public void setTypeMRP(String typeMRP) {
		this.typeMRP = typeMRP;
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
	@Column(nullable=false, length=80)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}
}