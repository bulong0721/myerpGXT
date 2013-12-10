package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_periodcontrol database table.
 * 
 */
@Entity
@Table(name="c_periodcontrol")
@NamedQuery(name="CPeriodcontrol.findAll", query="SELECT c FROM CPeriodcontrol c")
public class CPeriodcontrol extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPeriodcontrolId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cPeriodId;
	private Timestamp created;
	private BigDecimal createdby;
	private String docbasetype;
	private String isactive;
	private String periodaction;
	private String periodstatus;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPeriodcontrol() {
	}


	@Id
	@Column(name="C_PERIODCONTROL_ID")
	public long getCPeriodcontrolId() {
		return this.cPeriodcontrolId;
	}

	public void setCPeriodcontrolId(long cPeriodcontrolId) {
		this.cPeriodcontrolId = cPeriodcontrolId;
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


	@Column(name="C_PERIOD_ID")
	public BigDecimal getCPeriodId() {
		return this.cPeriodId;
	}

	public void setCPeriodId(BigDecimal cPeriodId) {
		this.cPeriodId = cPeriodId;
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


	public String getDocbasetype() {
		return this.docbasetype;
	}

	public void setDocbasetype(String docbasetype) {
		this.docbasetype = docbasetype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getPeriodaction() {
		return this.periodaction;
	}

	public void setPeriodaction(String periodaction) {
		this.periodaction = periodaction;
	}


	public String getPeriodstatus() {
		return this.periodstatus;
	}

	public void setPeriodstatus(String periodstatus) {
		this.periodstatus = periodstatus;
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