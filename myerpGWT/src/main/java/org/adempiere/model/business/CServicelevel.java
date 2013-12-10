package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_servicelevel database table.
 * 
 */
@Entity
@Table(name="c_servicelevel")
@NamedQuery(name="CServicelevel.findAll", query="SELECT c FROM CServicelevel c")
public class CServicelevel extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cServicelevelId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRevenuerecognitionPlanId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private BigDecimal mProductId;
	private String processed;
	private String processing;
	private BigDecimal servicelevelinvoiced;
	private BigDecimal servicelevelprovided;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CServicelevel() {
	}


	@Id
	@Column(name="C_SERVICELEVEL_ID")
	public long getCServicelevelId() {
		return this.cServicelevelId;
	}

	public void setCServicelevelId(long cServicelevelId) {
		this.cServicelevelId = cServicelevelId;
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


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
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


	public BigDecimal getServicelevelinvoiced() {
		return this.servicelevelinvoiced;
	}

	public void setServicelevelinvoiced(BigDecimal servicelevelinvoiced) {
		this.servicelevelinvoiced = servicelevelinvoiced;
	}


	public BigDecimal getServicelevelprovided() {
		return this.servicelevelprovided;
	}

	public void setServicelevelprovided(BigDecimal servicelevelprovided) {
		this.servicelevelprovided = servicelevelprovided;
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