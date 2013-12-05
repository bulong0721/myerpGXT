package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_uom database table.
 * 
 */
@Entity
@Table(name="c_uom")
@NamedQuery(name="CUom.findAll", query="SELECT c FROM CUom c")
public class CUom extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cUomId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal costingprecision;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isdefault;
	private String name;
	private BigDecimal stdprecision;
	private String uomsymbol;
	private String uomtype;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String x12de355;

	public CUom() {
	}


	@Id
	@Column(name="C_UOM_ID")
	public long getCUomId() {
		return this.cUomId;
	}

	public void setCUomId(long cUomId) {
		this.cUomId = cUomId;
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


	public BigDecimal getCostingprecision() {
		return this.costingprecision;
	}

	public void setCostingprecision(BigDecimal costingprecision) {
		this.costingprecision = costingprecision;
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


	public BigDecimal getStdprecision() {
		return this.stdprecision;
	}

	public void setStdprecision(BigDecimal stdprecision) {
		this.stdprecision = stdprecision;
	}


	public String getUomsymbol() {
		return this.uomsymbol;
	}

	public void setUomsymbol(String uomsymbol) {
		this.uomsymbol = uomsymbol;
	}


	public String getUomtype() {
		return this.uomtype;
	}

	public void setUomtype(String uomtype) {
		this.uomtype = uomtype;
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


	public String getX12de355() {
		return this.x12de355;
	}

	public void setX12de355(String x12de355) {
		this.x12de355 = x12de355;
	}

}