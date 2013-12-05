package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_greeting database table.
 * 
 */
@Entity
@Table(name="c_greeting")
@NamedQuery(name="CGreeting.findAll", query="SELECT c FROM CGreeting c")
public class CGreeting extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cGreetingId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String greeting;
	private String isactive;
	private String isdefault;
	private String isfirstnameonly;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CGreeting() {
	}


	@Id
	@Column(name="C_GREETING_ID")
	public long getCGreetingId() {
		return this.cGreetingId;
	}

	public void setCGreetingId(long cGreetingId) {
		this.cGreetingId = cGreetingId;
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


	public String getGreeting() {
		return this.greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIsfirstnameonly() {
		return this.isfirstnameonly;
	}

	public void setIsfirstnameonly(String isfirstnameonly) {
		this.isfirstnameonly = isfirstnameonly;
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