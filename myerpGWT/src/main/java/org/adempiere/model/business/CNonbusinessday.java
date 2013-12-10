package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_nonbusinessday database table.
 * 
 */
@Entity
@Table(name="c_nonbusinessday")
@NamedQuery(name="CNonbusinessday.findAll", query="SELECT c FROM CNonbusinessday c")
public class CNonbusinessday extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cNonbusinessdayId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCalendarId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date date1;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CNonbusinessday() {
	}


	@Id
	@Column(name="C_NONBUSINESSDAY_ID")
	public long getCNonbusinessdayId() {
		return this.cNonbusinessdayId;
	}

	public void setCNonbusinessdayId(long cNonbusinessdayId) {
		this.cNonbusinessdayId = cNonbusinessdayId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
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