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
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPinstanceId;
	private Integer cBpartnerId;
	private Integer cDoctypeId;
	private BigDecimal levelMax;
	private BigDecimal levelMin;
	private Integer mProductId;
	private Integer mWarehouseId;
	private Integer mWarehousesourceId;
	private BigDecimal orderMin;
	private BigDecimal orderPack;
	private BigDecimal qtyonhand;
	private BigDecimal qtyordered;
	private BigDecimal qtyreserved;
	private BigDecimal qtytoorder;
	private String replenishmentcreate;
	private String replenishtype;
	private String updated;
	private Integer updatedby;

	public TReplenish() {
	}

	public TReplenish(Integer adPinstanceId, Integer mProductId, Integer mWarehouseId) {
		this.adPinstanceId = adPinstanceId;
		this.mProductId = mProductId;
		this.mWarehouseId = mWarehouseId;
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

	@Id
	@Column(name="AD_PINSTANCE_ID")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID")
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
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
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Id
	@Column(name="M_WAREHOUSE_ID")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(name="M_WAREHOUSESOURCE_ID")
	public Integer getMWarehousesourceId() {
		return mWarehousesourceId;
	}

	public void setMWarehousesourceId(Integer mWarehousesourceId) {
		this.mWarehousesourceId = mWarehousesourceId;
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
	public BigDecimal getQtyonhand() {
		return qtyonhand;
	}

	public void setQtyonhand(BigDecimal qtyonhand) {
		this.qtyonhand = qtyonhand;
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
	@Column(nullable=false)
	public BigDecimal getQtyreserved() {
		return qtyreserved;
	}

	public void setQtyreserved(BigDecimal qtyreserved) {
		this.qtyreserved = qtyreserved;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtytoorder() {
		return qtytoorder;
	}

	public void setQtytoorder(BigDecimal qtytoorder) {
		this.qtytoorder = qtytoorder;
	}

	@Basic
	@Column(length=3)
	public String getReplenishmentcreate() {
		return replenishmentcreate;
	}

	public void setReplenishmentcreate(String replenishmentcreate) {
		this.replenishmentcreate = replenishmentcreate;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getReplenishtype() {
		return replenishtype;
	}

	public void setReplenishtype(String replenishtype) {
		this.replenishtype = replenishtype;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}