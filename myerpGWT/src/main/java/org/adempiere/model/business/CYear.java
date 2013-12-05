package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_year database table.
 * 
 */
@Entity
@Table(name="c_year")
@NamedQuery(name="CYear.findAll", query="SELECT c FROM CYear c")
public class CYear extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cYearId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCalendarId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String fiscalyear;
	private String isactive;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CYear() {
	}


	@Id
	@Column(name="C_YEAR_ID")
	public long getCYearId() {
		return this.cYearId;
	}

	public void setCYearId(long cYearId) {
		this.cYearId = cYearId;
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


	@Column(name="C_CALENDAR_ID")
	public BigDecimal getCCalendarId() {
		return this.cCalendarId;
	}

	public void setCCalendarId(BigDecimal cCalendarId) {
		this.cCalendarId = cCalendarId;
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


	public String getFiscalyear() {
		return this.fiscalyear;
	}

	public void setFiscalyear(String fiscalyear) {
		this.fiscalyear = fiscalyear;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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