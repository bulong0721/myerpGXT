package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_subscription_delivery database table.
 * 
 */
@Entity
@Table(name="c_subscription_delivery")
@NamedQuery(name="CSubscriptionDelivery.findAll", query="SELECT c FROM CSubscriptionDelivery c")
public class CSubscriptionDelivery extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cSubscriptionDeliveryId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cSubscriptionId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CSubscriptionDelivery() {
	}


	@Id
	@Column(name="C_SUBSCRIPTION_DELIVERY_ID")
	public long getCSubscriptionDeliveryId() {
		return this.cSubscriptionDeliveryId;
	}

	public void setCSubscriptionDeliveryId(long cSubscriptionDeliveryId) {
		this.cSubscriptionDeliveryId = cSubscriptionDeliveryId;
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


	@Column(name="C_SUBSCRIPTION_ID")
	public BigDecimal getCSubscriptionId() {
		return this.cSubscriptionId;
	}

	public void setCSubscriptionId(BigDecimal cSubscriptionId) {
		this.cSubscriptionId = cSubscriptionId;
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