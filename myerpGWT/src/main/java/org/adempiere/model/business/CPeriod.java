package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_period database table.
 * 
 */
@Entity
@Table(name="c_period")
@NamedQuery(name="CPeriod.findAll", query="SELECT c FROM CPeriod c")
public class CPeriod extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPeriodId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cYearId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date enddate;
	private String isactive;
	private String name;
	private BigDecimal periodno;
	private String periodtype;
	private String processing;
	private Date startdate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPeriod() {
	}


	@Id
	@Column(name="C_PERIOD_ID")
	public long getCPeriodId() {
		return this.cPeriodId;
	}

	public void setCPeriodId(long cPeriodId) {
		this.cPeriodId = cPeriodId;
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


	@Column(name="C_YEAR_ID")
	public BigDecimal getCYearId() {
		return this.cYearId;
	}

	public void setCYearId(BigDecimal cYearId) {
		this.cYearId = cYearId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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


	public BigDecimal getPeriodno() {
		return this.periodno;
	}

	public void setPeriodno(BigDecimal periodno) {
		this.periodno = periodno;
	}


	public String getPeriodtype() {
		return this.periodtype;
	}

	public void setPeriodtype(String periodtype) {
		this.periodtype = periodtype;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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