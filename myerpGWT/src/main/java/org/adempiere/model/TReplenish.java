package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_replenish")
@IdClass(org.adempiere.model.TReplenishPK.class)
public class TReplenish extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDPInstanceID;
	private Integer cBPartnerID;
	private Integer cDocTypeID;
	private BigDecimal levelMax;
	private BigDecimal levelMin;
	private Integer mProductID;
	private Integer mWarehouseID;
	private Integer mWarehouseSourceID;
	private BigDecimal orderMin;
	private BigDecimal orderPack;
	private BigDecimal qtyOnHand;
	private BigDecimal qtyOrdered;
	private BigDecimal qtyReserved;
	private BigDecimal qtyToOrder;
	private String replenishType;
	private String replenishmentCreate;
	private String updated;
	private Integer updatedBy;

	public TReplenish() {
	}

	public TReplenish(Integer aDPInstanceID, Integer mProductID, Integer mWarehouseID) {
		this.aDPInstanceID = aDPInstanceID;
		this.mProductID = mProductID;
		this.mWarehouseID = mWarehouseID;
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

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getADPInstanceID() {
		return aDPInstanceID;
	}

	public void setADPInstanceID(Integer aDPInstanceID) {
		this.aDPInstanceID = aDPInstanceID;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
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
	@Column(name="LEVEL_MAX", nullable=false)
	public BigDecimal getLevelMax() {
		return levelMax;
	}

	public void setLevelMax(BigDecimal levelMax) {
		this.levelMax = levelMax;
	}

	@Basic
	@Column(name="LEVEL_MIN", nullable=false)
	public BigDecimal getLevelMin() {
		return levelMin;
	}

	public void setLevelMin(BigDecimal levelMin) {
		this.levelMin = levelMin;
	}

	@Id
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Id
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT")
	public Integer getMWarehouseID() {
		return mWarehouseID;
	}

	public void setMWarehouseID(Integer mWarehouseID) {
		this.mWarehouseID = mWarehouseID;
	}

	@Basic
	@Column(name="M_WAREHOUSESOURCE_ID", columnDefinition="INT")
	public Integer getMWarehouseSourceID() {
		return mWarehouseSourceID;
	}

	public void setMWarehouseSourceID(Integer mWarehouseSourceID) {
		this.mWarehouseSourceID = mWarehouseSourceID;
	}

	@Basic
	@Column(name="ORDER_MIN", nullable=false)
	public BigDecimal getOrderMin() {
		return orderMin;
	}

	public void setOrderMin(BigDecimal orderMin) {
		this.orderMin = orderMin;
	}

	@Basic
	@Column(name="ORDER_PACK", nullable=false)
	public BigDecimal getOrderPack() {
		return orderPack;
	}

	public void setOrderPack(BigDecimal orderPack) {
		this.orderPack = orderPack;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(BigDecimal qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
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
	@Column(nullable=false)
	public BigDecimal getQtyReserved() {
		return qtyReserved;
	}

	public void setQtyReserved(BigDecimal qtyReserved) {
		this.qtyReserved = qtyReserved;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyToOrder() {
		return qtyToOrder;
	}

	public void setQtyToOrder(BigDecimal qtyToOrder) {
		this.qtyToOrder = qtyToOrder;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getReplenishType() {
		return replenishType;
	}

	public void setReplenishType(String replenishType) {
		this.replenishType = replenishType;
	}

	@Basic
	@Column(length=3)
	public String getReplenishmentCreate() {
		return replenishmentCreate;
	}

	public void setReplenishmentCreate(String replenishmentCreate) {
		this.replenishmentCreate = replenishmentCreate;
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
	@Column(columnDefinition="INT")
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}