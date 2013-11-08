package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_userquery database table.
 * 
 */
@Entity
@Table(name="ad_userquery")
@NamedQuery(name="AdUserquery.findAll", query="SELECT a FROM AdUserquery a")
public class AdUserquery extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserqueryId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTabId;
	private BigDecimal adTableId;
	private BigDecimal adUserId;
	private String code;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserquery() {
	}


	@Id
	@Column(name="AD_USERQUERY_ID")
	public long getAdUserqueryId() {
		return this.adUserqueryId;
	}

	public void setAdUserqueryId(long adUserqueryId) {
		this.adUserqueryId = adUserqueryId;
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


	@Column(name="AD_TAB_ID")
	public BigDecimal getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(BigDecimal adTabId) {
		this.adTabId = adTabId;
	}


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
	}


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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