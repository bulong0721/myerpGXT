package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_infocolumn database table.
 * 
 */
@Entity
@Table(name="ad_infocolumn")
@NamedQuery(name="AdInfocolumn.findAll", query="SELECT a FROM AdInfocolumn a")
public class AdInfocolumn extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adInfocolumnId;
	private BigDecimal adClientId;
	private BigDecimal adElementId;
	private BigDecimal adInfowindowId;
	private BigDecimal adOrgId;
	private BigDecimal adReferenceId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String help;
	private String isactive;
	private String isdisplayed;
	private String isquerycriteria;
	private String name;
	private String selectclause;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdInfocolumn() {
	}


	@Id
	@Column(name="AD_INFOCOLUMN_ID")
	public long getAdInfocolumnId() {
		return this.adInfocolumnId;
	}

	public void setAdInfocolumnId(long adInfocolumnId) {
		this.adInfocolumnId = adInfocolumnId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ELEMENT_ID")
	public BigDecimal getAdElementId() {
		return this.adElementId;
	}

	public void setAdElementId(BigDecimal adElementId) {
		this.adElementId = adElementId;
	}


	@Column(name="AD_INFOWINDOW_ID")
	public BigDecimal getAdInfowindowId() {
		return this.adInfowindowId;
	}

	public void setAdInfowindowId(BigDecimal adInfowindowId) {
		this.adInfowindowId = adInfowindowId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_REFERENCE_ID")
	public BigDecimal getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(BigDecimal adReferenceId) {
		this.adReferenceId = adReferenceId;
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


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdisplayed() {
		return this.isdisplayed;
	}

	public void setIsdisplayed(String isdisplayed) {
		this.isdisplayed = isdisplayed;
	}


	public String getIsquerycriteria() {
		return this.isquerycriteria;
	}

	public void setIsquerycriteria(String isquerycriteria) {
		this.isquerycriteria = isquerycriteria;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSelectclause() {
		return this.selectclause;
	}

	public void setSelectclause(String selectclause) {
		this.selectclause = selectclause;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
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