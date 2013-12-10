package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_dunningrun database table.
 * 
 */
@Entity
@Table(name="c_dunningrun")
@NamedQuery(name="CDunningrun.findAll", query="SELECT c FROM CDunningrun c")
public class CDunningrun extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDunningrunId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cDunningId;
	private BigDecimal cDunninglevelId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private Date dunningdate;
	private String isactive;
	private String processed;
	private String processing;
	private String sendit;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDunningrun() {
	}


	@Id
	@Column(name="C_DUNNINGRUN_ID")
	public long getCDunningrunId() {
		return this.cDunningrunId;
	}

	public void setCDunningrunId(long cDunningrunId) {
		this.cDunningrunId = cDunningrunId;
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


	@Column(name="C_DUNNING_ID")
	public BigDecimal getCDunningId() {
		return this.cDunningId;
	}

	public void setCDunningId(BigDecimal cDunningId) {
		this.cDunningId = cDunningId;
	}


	@Column(name="C_DUNNINGLEVEL_ID")
	public BigDecimal getCDunninglevelId() {
		return this.cDunninglevelId;
	}

	public void setCDunninglevelId(BigDecimal cDunninglevelId) {
		this.cDunninglevelId = cDunninglevelId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDunningdate() {
		return this.dunningdate;
	}

	public void setDunningdate(Date dunningdate) {
		this.dunningdate = dunningdate;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public String getSendit() {
		return this.sendit;
	}

	public void setSendit(String sendit) {
		this.sendit = sendit;
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