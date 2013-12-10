package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_reportview_col database table.
 * 
 */
@Entity
@Table(name="ad_reportview_col")
@NamedQuery(name="AdReportviewCol.findAll", query="SELECT a FROM AdReportviewCol a")
public class AdReportviewCol extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adReportviewColId;
	private BigDecimal adClientId;
	private BigDecimal adColumnId;
	private BigDecimal adOrgId;
	private BigDecimal adReportviewId;
	private Timestamp created;
	private BigDecimal createdby;
	private String functioncolumn;
	private String isactive;
	private String isgroupfunction;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdReportviewCol() {
	}


	@Id
	@Column(name="AD_REPORTVIEW_COL_ID")
	public long getAdReportviewColId() {
		return this.adReportviewColId;
	}

	public void setAdReportviewColId(long adReportviewColId) {
		this.adReportviewColId = adReportviewColId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLUMN_ID")
	public BigDecimal getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(BigDecimal adColumnId) {
		this.adColumnId = adColumnId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_REPORTVIEW_ID")
	public BigDecimal getAdReportviewId() {
		return this.adReportviewId;
	}

	public void setAdReportviewId(BigDecimal adReportviewId) {
		this.adReportviewId = adReportviewId;
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


	public String getFunctioncolumn() {
		return this.functioncolumn;
	}

	public void setFunctioncolumn(String functioncolumn) {
		this.functioncolumn = functioncolumn;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsgroupfunction() {
		return this.isgroupfunction;
	}

	public void setIsgroupfunction(String isgroupfunction) {
		this.isgroupfunction = isgroupfunction;
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