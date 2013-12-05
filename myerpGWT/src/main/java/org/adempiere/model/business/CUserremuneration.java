package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_userremuneration database table.
 * 
 */
@Entity
@Table(name="c_userremuneration")
@NamedQuery(name="CUserremuneration.findAll", query="SELECT c FROM CUserremuneration c")
public class CUserremuneration extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cUserremunerationId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cRemunerationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal grossramt;
	private BigDecimal grossrcost;
	private String isactive;
	private BigDecimal overtimeamt;
	private BigDecimal overtimecost;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;
	private Date validto;

	public CUserremuneration() {
	}


	@Id
	@Column(name="C_USERREMUNERATION_ID")
	public long getCUserremunerationId() {
		return this.cUserremunerationId;
	}

	public void setCUserremunerationId(long cUserremunerationId) {
		this.cUserremunerationId = cUserremunerationId;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="C_REMUNERATION_ID")
	public BigDecimal getCRemunerationId() {
		return this.cRemunerationId;
	}

	public void setCRemunerationId(BigDecimal cRemunerationId) {
		this.cRemunerationId = cRemunerationId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}

}