package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_message database table.
 * 
 */
@Entity
@Table(name="ad_message")
@NamedQuery(name="AdMessage.findAll", query="SELECT a FROM AdMessage a")
public class AdMessage extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adMessageId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String entitytype;
	private String isactive;
	private String msgtext;
	private String msgtip;
	private String msgtype;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public AdMessage() {
	}


	@Id
	@Column(name="AD_MESSAGE_ID")
	public long getAdMessageId() {
		return this.adMessageId;
	}

	public void setAdMessageId(long adMessageId) {
		this.adMessageId = adMessageId;
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


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getMsgtext() {
		return this.msgtext;
	}

	public void setMsgtext(String msgtext) {
		this.msgtext = msgtext;
	}


	public String getMsgtip() {
		return this.msgtip;
	}

	public void setMsgtip(String msgtip) {
		this.msgtip = msgtip;
	}


	public String getMsgtype() {
		return this.msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}