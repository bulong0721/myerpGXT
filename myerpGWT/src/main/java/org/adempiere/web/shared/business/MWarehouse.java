package org.adempiere.web.shared.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the m_warehouse database table.
 * 
 */
@Entity
@Table(name="m_warehouse")
public class MWarehouse extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long mWarehouseId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cLocationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isintransit;
	private BigDecimal mWarehousesourceId;
	private String name;
	private String replenishmentclass;
	private String separator;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public MWarehouse() {
	}


	@Id
	@Column(name="M_WAREHOUSE_ID")
	public long getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(long mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
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


	@Column(name="C_LOCATION_ID")
	public BigDecimal getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(BigDecimal cLocationId) {
		this.cLocationId = cLocationId;
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


	public String getIsintransit() {
		return this.isintransit;
	}

	public void setIsintransit(String isintransit) {
		this.isintransit = isintransit;
	}


	@Column(name="M_WAREHOUSESOURCE_ID")
	public BigDecimal getMWarehousesourceId() {
		return this.mWarehousesourceId;
	}

	public void setMWarehousesourceId(BigDecimal mWarehousesourceId) {
		this.mWarehousesourceId = mWarehousesourceId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getReplenishmentclass() {
		return this.replenishmentclass;
	}

	public void setReplenishmentclass(String replenishmentclass) {
		this.replenishmentclass = replenishmentclass;
	}


	@Column(name="SEPARATOR")
	public String getSeparator() {
		return this.separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}