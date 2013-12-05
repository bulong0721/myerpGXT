package org.adempiere.model.business;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the c_taxcategory database table.
 * 
 */
@Entity
@Table(name = "c_taxcategory")
@NamedQuery(name = "CTaxcategory.findAll", query = "SELECT c FROM CTaxcategory c")
public class CTaxcategory extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				cTaxcategoryId;
	private BigDecimal			adClientId;
	private BigDecimal			adOrgId;
	private String				commoditycode;
	private Timestamp			created;
	private BigDecimal			createdby;
	private String				description;
	private String				isactive;
	private String				isdefault;
	private String				name;
	private Timestamp			updated;
	private BigDecimal			updatedby;

	public CTaxcategory() {
	}

	@Id
	@Column(name = "C_TAXCATEGORY_ID")
	public long getCTaxcategoryId() {
		return this.cTaxcategoryId;
	}

	public void setCTaxcategoryId(long cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
	}

	@Column(name = "AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}

	public String getCommoditycode() {
		return this.commoditycode;
	}

	public void setCommoditycode(String commoditycode) {
		this.commoditycode = commoditycode;
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

	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}