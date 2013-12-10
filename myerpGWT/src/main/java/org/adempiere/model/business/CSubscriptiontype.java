package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_subscriptiontype database table.
 * 
 */
@Entity
@Table(name="c_subscriptiontype")
@NamedQuery(name="CSubscriptiontype.findAll", query="SELECT c FROM CSubscriptiontype c")
public class CSubscriptiontype extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cSubscriptiontypeId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal frequency;
	private String frequencytype;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CSubscriptiontype() {
	}


	@Id
	@Column(name="C_SUBSCRIPTIONTYPE_ID")
	public long getCSubscriptiontypeId() {
		return this.cSubscriptiontypeId;
	}

	public void setCSubscriptiontypeId(long cSubscriptiontypeId) {
		this.cSubscriptiontypeId = cSubscriptiontypeId;
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


	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}


	public String getFrequencytype() {
		return this.frequencytype;
	}

	public void setFrequencytype(String frequencytype) {
		this.frequencytype = frequencytype;
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