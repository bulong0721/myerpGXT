package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_usermail database table.
 * 
 */
@Entity
@Table(name="ad_usermail")
@NamedQuery(name="AdUsermail.findAll", query="SELECT a FROM AdUsermail a")
public class AdUsermail extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUsermailId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private Timestamp created;
	private BigDecimal createdby;
	private String deliveryconfirmation;
	private String isactive;
	private String isdelivered;
	private String mailtext;
	private String messageid;
	private BigDecimal rMailtextId;
	private String subject;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal wMailmsgId;

	public AdUsermail() {
	}


	@Id
	@Column(name="AD_USERMAIL_ID")
	public long getAdUsermailId() {
		return this.adUsermailId;
	}

	public void setAdUsermailId(long adUsermailId) {
		this.adUsermailId = adUsermailId;
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


	public String getDeliveryconfirmation() {
		return this.deliveryconfirmation;
	}

	public void setDeliveryconfirmation(String deliveryconfirmation) {
		this.deliveryconfirmation = deliveryconfirmation;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdelivered() {
		return this.isdelivered;
	}

	public void setIsdelivered(String isdelivered) {
		this.isdelivered = isdelivered;
	}


	public String getMailtext() {
		return this.mailtext;
	}

	public void setMailtext(String mailtext) {
		this.mailtext = mailtext;
	}


	public String getMessageid() {
		return this.messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}


	@Column(name="R_MAILTEXT_ID")
	public BigDecimal getRMailtextId() {
		return this.rMailtextId;
	}

	public void setRMailtextId(BigDecimal rMailtextId) {
		this.rMailtextId = rMailtextId;
	}


	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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


	@Column(name="W_MAILMSG_ID")
	public BigDecimal getWMailmsgId() {
		return this.wMailmsgId;
	}

	public void setWMailmsgId(BigDecimal wMailmsgId) {
		this.wMailmsgId = wMailmsgId;
	}

}