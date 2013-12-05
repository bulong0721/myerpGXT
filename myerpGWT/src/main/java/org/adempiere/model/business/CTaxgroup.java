package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_taxgroup database table.
 * 
 */
@Entity
@Table(name="c_taxgroup")
@NamedQuery(name="CTaxgroup.findAll", query="SELECT c FROM CTaxgroup c")
public class CTaxgroup extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxgroupId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CTaxgroup() {
	}


	@Id
	@Column(name="C_TAXGROUP_ID")
	public long getCTaxgroupId() {
		return this.cTaxgroupId;
	}

	public void setCTaxgroupId(long cTaxgroupId) {
		this.cTaxgroupId = cTaxgroupId;
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


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}