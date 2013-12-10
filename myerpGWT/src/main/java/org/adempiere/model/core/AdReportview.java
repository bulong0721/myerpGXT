package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_reportview database table.
 * 
 */
@Entity
@Table(name="ad_reportview")
@NamedQuery(name="AdReportview.findAll", query="SELECT a FROM AdReportview a")
public class AdReportview extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adReportviewId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTableId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String isactive;
	private String name;
	private String orderbyclause;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String whereclause;

	public AdReportview() {
	}


	@Id
	@Column(name="AD_REPORTVIEW_ID")
	public long getAdReportviewId() {
		return this.adReportviewId;
	}

	public void setAdReportviewId(long adReportviewId) {
		this.adReportviewId = adReportviewId;
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


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getOrderbyclause() {
		return this.orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
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


	public String getWhereclause() {
		return this.whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

}