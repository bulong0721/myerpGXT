package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_uom_conversion database table.
 * 
 */
@Entity
@Table(name="c_uom_conversion")
@NamedQuery(name="CUomConversion.findAll", query="SELECT c FROM CUomConversion c")
public class CUomConversion extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cUomConversionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cUomId;
	private BigDecimal cUomToId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal dividerate;
	private String isactive;
	private BigDecimal mProductId;
	private BigDecimal multiplyrate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CUomConversion() {
	}


	@Id
	@Column(name="C_UOM_CONVERSION_ID")
	public long getCUomConversionId() {
		return this.cUomConversionId;
	}

	public void setCUomConversionId(long cUomConversionId) {
		this.cUomConversionId = cUomConversionId;
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


	@Column(name="C_UOM_ID")
	public BigDecimal getCUomId() {
		return this.cUomId;
	}

	public void setCUomId(BigDecimal cUomId) {
		this.cUomId = cUomId;
	}


	@Column(name="C_UOM_TO_ID")
	public BigDecimal getCUomToId() {
		return this.cUomToId;
	}

	public void setCUomToId(BigDecimal cUomToId) {
		this.cUomToId = cUomToId;
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


	public BigDecimal getDividerate() {
		return this.dividerate;
	}

	public void setDividerate(BigDecimal dividerate) {
		this.dividerate = dividerate;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public BigDecimal getMultiplyrate() {
		return this.multiplyrate;
	}

	public void setMultiplyrate(BigDecimal multiplyrate) {
		this.multiplyrate = multiplyrate;
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