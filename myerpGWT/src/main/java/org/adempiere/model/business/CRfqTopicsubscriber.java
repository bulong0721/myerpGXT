package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_rfq_topicsubscriber database table.
 * 
 */
@Entity
@Table(name="c_rfq_topicsubscriber")
@NamedQuery(name="CRfqTopicsubscriber.findAll", query="SELECT c FROM CRfqTopicsubscriber c")
public class CRfqTopicsubscriber extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqTopicsubscriberId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cRfqTopicId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Date optoutdate;
	private Date subscribedate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqTopicsubscriber() {
	}


	@Id
	@Column(name="C_RFQ_TOPICSUBSCRIBER_ID")
	public long getCRfqTopicsubscriberId() {
		return this.cRfqTopicsubscriberId;
	}

	public void setCRfqTopicsubscriberId(long cRfqTopicsubscriberId) {
		this.cRfqTopicsubscriberId = cRfqTopicsubscriberId;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_RFQ_TOPIC_ID")
	public BigDecimal getCRfqTopicId() {
		return this.cRfqTopicId;
	}

	public void setCRfqTopicId(BigDecimal cRfqTopicId) {
		this.cRfqTopicId = cRfqTopicId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getOptoutdate() {
		return this.optoutdate;
	}

	public void setOptoutdate(Date optoutdate) {
		this.optoutdate = optoutdate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getSubscribedate() {
		return this.subscribedate;
	}

	public void setSubscribedate(Date subscribedate) {
		this.subscribedate = subscribedate;
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