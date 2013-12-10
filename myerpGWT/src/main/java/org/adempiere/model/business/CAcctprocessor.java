package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_acctprocessor database table.
 * 
 */
@Entity
@Table(name="c_acctprocessor")
@NamedQuery(name="CAcctprocessor.findAll", query="SELECT c FROM CAcctprocessor c")
public class CAcctprocessor extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAcctprocessorId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTableId;
	private BigDecimal cAcctschemaId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datelastrun;
	private Date datenextrun;
	private String description;
	private BigDecimal frequency;
	private String frequencytype;
	private String isactive;
	private BigDecimal keeplogdays;
	private String name;
	private String processing;
	private BigDecimal supervisorId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CAcctprocessor() {
	}


	@Id
	@Column(name="C_ACCTPROCESSOR_ID")
	public long getCAcctprocessorId() {
		return this.cAcctprocessorId;
	}

	public void setCAcctprocessorId(long cAcctprocessorId) {
		this.cAcctprocessorId = cAcctprocessorId;
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


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
	}


	@Column(name="C_ACCTSCHEMA_ID")
	public BigDecimal getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(BigDecimal cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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


	public BigDecimal getKeeplogdays() {
		return this.keeplogdays;
	}

	public void setKeeplogdays(BigDecimal keeplogdays) {
		this.keeplogdays = keeplogdays;
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

}