package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_subscription database table.
 * 
 */
@Entity
@Table(name="c_subscription")
@NamedQuery(name="CSubscription.findAll", query="SELECT c FROM CSubscription c")
public class CSubscription extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cSubscriptionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBpartnerId;
	private BigDecimal cSubscriptiontypeId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String isdue;
	private BigDecimal mProductId;
	private String name;
	private Date paiduntildate;
	private Date renewaldate;
	private Date startdate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CSubscription() {
	}


	@Id
	@Column(name="C_SUBSCRIPTION_ID")
	public long getCSubscriptionId() {
		return this.cSubscriptionId;
	}

	public void setCSubscriptionId(long cSubscriptionId) {
		this.cSubscriptionId = cSubscriptionId;
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


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_SUBSCRIPTIONTYPE_ID")
	public BigDecimal getCSubscriptiontypeId() {
		return this.cSubscriptiontypeId;
	}

	public void setCSubscriptiontypeId(BigDecimal cSubscriptiontypeId) {
		this.cSubscriptiontypeId = cSubscriptiontypeId;
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


	public String getIsdue() {
		return this.isdue;
	}

	public void setIsdue(String isdue) {
		this.isdue = isdue;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getPaiduntildate() {
		return this.paiduntildate;
	}

	public void setPaiduntildate(Date paiduntildate) {
		this.paiduntildate = paiduntildate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getRenewaldate() {
		return this.renewaldate;
	}

	public void setRenewaldate(Date renewaldate) {
		this.renewaldate = renewaldate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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