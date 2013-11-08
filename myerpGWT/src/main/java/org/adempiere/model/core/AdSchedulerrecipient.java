package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_schedulerrecipient database table.
 * 
 */
@Entity
@Table(name="ad_schedulerrecipient")
@NamedQuery(name="AdSchedulerrecipient.findAll", query="SELECT a FROM AdSchedulerrecipient a")
public class AdSchedulerrecipient extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adSchedulerrecipientId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adRoleId;
	private BigDecimal adSchedulerId;
	private BigDecimal adUserId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdSchedulerrecipient() {
	}


	@Id
	@Column(name="AD_SCHEDULERRECIPIENT_ID")
	public long getAdSchedulerrecipientId() {
		return this.adSchedulerrecipientId;
	}

	public void setAdSchedulerrecipientId(long adSchedulerrecipientId) {
		this.adSchedulerrecipientId = adSchedulerrecipientId;
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


	@Column(name="AD_ROLE_ID")
	public BigDecimal getAdRoleId() {
		return this.adRoleId;
	}

	public void setAdRoleId(BigDecimal adRoleId) {
		this.adRoleId = adRoleId;
	}


	@Column(name="AD_SCHEDULER_ID")
	public BigDecimal getAdSchedulerId() {
		return this.adSchedulerId;
	}

	public void setAdSchedulerId(BigDecimal adSchedulerId) {
		this.adSchedulerId = adSchedulerId;
	}


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
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