package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_taskinstance database table.
 * 
 */
@Entity
@Table(name="ad_taskinstance")
@NamedQuery(name="AdTaskinstance.findAll", query="SELECT a FROM AdTaskinstance a")
public class AdTaskinstance extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adTaskinstanceId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTaskId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdTaskinstance() {
	}


	@Id
	@Column(name="AD_TASKINSTANCE_ID")
	public long getAdTaskinstanceId() {
		return this.adTaskinstanceId;
	}

	public void setAdTaskinstanceId(long adTaskinstanceId) {
		this.adTaskinstanceId = adTaskinstanceId;
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


	@Column(name="AD_TASK_ID")
	public BigDecimal getAdTaskId() {
		return this.adTaskId;
	}

	public void setAdTaskId(BigDecimal adTaskId) {
		this.adTaskId = adTaskId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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