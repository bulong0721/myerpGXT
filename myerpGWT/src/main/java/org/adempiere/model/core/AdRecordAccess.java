package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_record_access database table.
 * 
 */
@Entity
@Table(name="ad_record_access")
@NamedQuery(name="AdRecordAccess.findAll", query="SELECT a FROM AdRecordAccess a")
public class AdRecordAccess extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private AdRecordAccessPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String isdependententities;
	private String isexclude;
	private String isreadonly;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdRecordAccess() {
	}


	@EmbeddedId
	public AdRecordAccessPK getId() {
		return this.id;
	}

	public void setId(AdRecordAccessPK id) {
		this.id = id;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdependententities() {
		return this.isdependententities;
	}

	public void setIsdependententities(String isdependententities) {
		this.isdependententities = isdependententities;
	}


	public String getIsexclude() {
		return this.isexclude;
	}

	public void setIsexclude(String isexclude) {
		this.isexclude = isexclude;
	}


	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
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