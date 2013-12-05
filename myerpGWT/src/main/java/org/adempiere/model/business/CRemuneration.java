package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_remuneration database table.
 * 
 */
@Entity
@Table(name="c_remuneration")
@NamedQuery(name="CRemuneration.findAll", query="SELECT c FROM CRemuneration c")
public class CRemuneration extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRemunerationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal grossramt;
	private BigDecimal grossrcost;
	private String help;
	private String isactive;
	private String name;
	private BigDecimal overtimeamt;
	private BigDecimal overtimecost;
	private String remunerationtype;
	private BigDecimal standardhours;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRemuneration() {
	}


	@Id
	@Column(name="C_REMUNERATION_ID")
	public long getCRemunerationId() {
		return this.cRemunerationId;
	}

	public void setCRemunerationId(long cRemunerationId) {
		this.cRemunerationId = cRemunerationId;
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


	public BigDecimal getGrossramt() {
		return this.grossramt;
	}

	public void setGrossramt(BigDecimal grossramt) {
		this.grossramt = grossramt;
	}


	public BigDecimal getGrossrcost() {
		return this.grossrcost;
	}

	public void setGrossrcost(BigDecimal grossrcost) {
		this.grossrcost = grossrcost;
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


	public BigDecimal getOvertimeamt() {
		return this.overtimeamt;
	}

	public void setOvertimeamt(BigDecimal overtimeamt) {
		this.overtimeamt = overtimeamt;
	}


	public BigDecimal getOvertimecost() {
		return this.overtimecost;
	}

	public void setOvertimecost(BigDecimal overtimecost) {
		this.overtimecost = overtimecost;
	}


	public String getRemunerationtype() {
		return this.remunerationtype;
	}

	public void setRemunerationtype(String remunerationtype) {
		this.remunerationtype = remunerationtype;
	}


	public BigDecimal getStandardhours() {
		return this.standardhours;
	}

	public void setStandardhours(BigDecimal standardhours) {
		this.standardhours = standardhours;
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