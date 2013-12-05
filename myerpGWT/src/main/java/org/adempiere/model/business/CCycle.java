package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_cycle database table.
 * 
 */
@Entity
@Table(name="c_cycle")
@NamedQuery(name="CCycle.findAll", query="SELECT c FROM CCycle c")
public class CCycle extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCycleId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCurrencyId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCycle() {
	}


	@Id
	@Column(name="C_CYCLE_ID")
	public long getCCycleId() {
		return this.cCycleId;
	}

	public void setCCycleId(long cCycleId) {
		this.cCycleId = cCycleId;
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


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
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