package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_revenuerecognition_run database table.
 * 
 */
@Entity
@Table(name="c_revenuerecognition_run")
@NamedQuery(name="CRevenuerecognitionRun.findAll", query="SELECT c FROM CRevenuerecognitionRun c")
public class CRevenuerecognitionRun extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRevenuerecognitionRunId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRevenuerecognitionPlanId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal glJournalId;
	private String isactive;
	private BigDecimal recognizedamt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRevenuerecognitionRun() {
	}


	@Id
	@Column(name="C_REVENUERECOGNITION_RUN_ID")
	public long getCRevenuerecognitionRunId() {
		return this.cRevenuerecognitionRunId;
	}

	public void setCRevenuerecognitionRunId(long cRevenuerecognitionRunId) {
		this.cRevenuerecognitionRunId = cRevenuerecognitionRunId;
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


	@Column(name="C_REVENUERECOGNITION_PLAN_ID")
	public BigDecimal getCRevenuerecognitionPlanId() {
		return this.cRevenuerecognitionPlanId;
	}

	public void setCRevenuerecognitionPlanId(BigDecimal cRevenuerecognitionPlanId) {
		this.cRevenuerecognitionPlanId = cRevenuerecognitionPlanId;
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


	@Column(name="GL_JOURNAL_ID")
	public BigDecimal getGlJournalId() {
		return this.glJournalId;
	}

	public void setGlJournalId(BigDecimal glJournalId) {
		this.glJournalId = glJournalId;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getRecognizedamt() {
		return this.recognizedamt;
	}

	public void setRecognizedamt(BigDecimal recognizedamt) {
		this.recognizedamt = recognizedamt;
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