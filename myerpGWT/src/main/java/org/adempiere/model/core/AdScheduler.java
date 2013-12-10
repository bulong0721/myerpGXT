package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ad_scheduler database table.
 * 
 */
@Entity
@Table(name="ad_scheduler")
@NamedQuery(name="AdScheduler.findAll", query="SELECT a FROM AdScheduler a")
public class AdScheduler extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adSchedulerId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adProcessId;
	private Timestamp created;
	private BigDecimal createdby;
	private String cronpattern;
	private Date datelastrun;
	private Date datenextrun;
	private String description;
	private BigDecimal frequency;
	private String frequencytype;
	private String isactive;
	private String isignoreprocessingtime;
	private BigDecimal keeplogdays;
	private BigDecimal monthday;
	private String name;
	private String processing;
	private String scheduletype;
	private BigDecimal supervisorId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String weekday;

	public AdScheduler() {
	}


	@Id
	@Column(name="AD_SCHEDULER_ID")
	public long getAdSchedulerId() {
		return this.adSchedulerId;
	}

	public void setAdSchedulerId(long adSchedulerId) {
		this.adSchedulerId = adSchedulerId;
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


	@Column(name="AD_PROCESS_ID")
	public BigDecimal getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(BigDecimal adProcessId) {
		this.adProcessId = adProcessId;
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


	public String getCronpattern() {
		return this.cronpattern;
	}

	public void setCronpattern(String cronpattern) {
		this.cronpattern = cronpattern;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatelastrun() {
		return this.datelastrun;
	}

	public void setDatelastrun(Date datelastrun) {
		this.datelastrun = datelastrun;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatenextrun() {
		return this.datenextrun;
	}

	public void setDatenextrun(Date datenextrun) {
		this.datenextrun = datenextrun;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}


	public String getFrequencytype() {
		return this.frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsignoreprocessingtime() {
		return this.isignoreprocessingtime;
	}

	public void setIsignoreprocessingtime(String isignoreprocessingtime) {
		this.isignoreprocessingtime = isignoreprocessingtime;
	}


	public BigDecimal getKeeplogdays() {
		return this.keeplogdays;
	}

	public void setKeeplogdays(BigDecimal keeplogdays) {
		this.keeplogdays = keeplogdays;
	}


	public BigDecimal getMonthday() {
		return this.monthday;
	}

	public void setMonthday(BigDecimal monthday) {
		this.monthday = monthday;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public String getScheduletype() {
		return this.scheduletype;
	}

	public void setScheduletype(String scheduletype) {
		this.scheduletype = scheduletype;
	}


	@Column(name="SUPERVISOR_ID")
	public BigDecimal getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(BigDecimal supervisorId) {
		this.supervisorId = supervisorId;
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


	public String getWeekday() {
		return this.weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

}