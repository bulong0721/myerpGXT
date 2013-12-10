package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_channel database table.
 * 
 */
@Entity
@Table(name="c_channel")
@NamedQuery(name="CChannel.findAll", query="SELECT c FROM CChannel c")
public class CChannel extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cChannelId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adPrintcolorId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CChannel() {
	}


	@Id
	@Column(name="C_CHANNEL_ID")
	public long getCChannelId() {
		return this.cChannelId;
	}

	public void setCChannelId(long cChannelId) {
		this.cChannelId = cChannelId;
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


	@Column(name="AD_PRINTCOLOR_ID")
	public BigDecimal getAdPrintcolorId() {
		return this.adPrintcolorId;
	}

	public void setAdPrintcolorId(BigDecimal adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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