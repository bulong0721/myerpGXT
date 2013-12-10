package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_userbpaccess database table.
 * 
 */
@Entity
@Table(name="ad_userbpaccess")
@NamedQuery(name="AdUserbpaccess.findAll", query="SELECT a FROM AdUserbpaccess a")
public class AdUserbpaccess extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserbpaccessId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private String bpaccesstype;
	private Timestamp created;
	private BigDecimal createdby;
	private String docbasetype;
	private String isactive;
	private BigDecimal rRequesttypeId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserbpaccess() {
	}


	@Id
	@Column(name="AD_USERBPACCESS_ID")
	public long getAdUserbpaccessId() {
		return this.adUserbpaccessId;
	}

	public void setAdUserbpaccessId(long adUserbpaccessId) {
		this.adUserbpaccessId = adUserbpaccessId;
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


	public String getBpaccesstype() {
		return this.bpaccesstype;
	}

	public void setBpaccesstype(String bpaccesstype) {
		this.bpaccesstype = bpaccesstype;
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


	public String getDocbasetype() {
		return this.docbasetype;
	}

	public void setDocbasetype(String docbasetype) {
		this.docbasetype = docbasetype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="R_REQUESTTYPE_ID")
	public BigDecimal getRRequesttypeId() {
		return this.rRequesttypeId;
	}

	public void setRRequesttypeId(BigDecimal rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
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