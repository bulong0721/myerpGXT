package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_revenuerecognition database table.
 * 
 */
@Entity
@Table(name="c_revenuerecognition")
@NamedQuery(name="CRevenuerecognition.findAll", query="SELECT c FROM CRevenuerecognition c")
public class CRevenuerecognition extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRevenuerecognitionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String istimebased;
	private String name;
	private BigDecimal nomonths;
	private String recognitionfrequency;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRevenuerecognition() {
	}


	@Id
	@Column(name="C_REVENUERECOGNITION_ID")
	public long getCRevenuerecognitionId() {
		return this.cRevenuerecognitionId;
	}

	public void setCRevenuerecognitionId(long cRevenuerecognitionId) {
		this.cRevenuerecognitionId = cRevenuerecognitionId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIstimebased() {
		return this.istimebased;
	}

	public void setIstimebased(String istimebased) {
		this.istimebased = istimebased;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getNomonths() {
		return this.nomonths;
	}

	public void setNomonths(BigDecimal nomonths) {
		this.nomonths = nomonths;
	}


	public String getRecognitionfrequency() {
		return this.recognitionfrequency;
	}

	public void setRecognitionfrequency(String recognitionfrequency) {
		this.recognitionfrequency = recognitionfrequency;
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