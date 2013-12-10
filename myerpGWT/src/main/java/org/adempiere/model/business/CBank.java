package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bank database table.
 * 
 */
@Entity
@Table(name="c_bank")
@NamedQuery(name="CBank.findAll", query="SELECT c FROM CBank c")
public class CBank extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cLocationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isownbank;
	private String name;
	private String routingno;
	private String swiftcode;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBank() {
	}


	@Id
	@Column(name="C_BANK_ID")
	public long getCBankId() {
		return this.cBankId;
	}

	public void setCBankId(long cBankId) {
		this.cBankId = cBankId;
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


	public String getIsownbank() {
		return this.isownbank;
	}

	public void setIsownbank(String isownbank) {
		this.isownbank = isownbank;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getRoutingno() {
		return this.routingno;
	}

	public void setRoutingno(String routingno) {
		this.routingno = routingno;
	}


	public String getSwiftcode() {
		return this.swiftcode;
	}

	public void setSwiftcode(String swiftcode) {
		this.swiftcode = swiftcode;
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