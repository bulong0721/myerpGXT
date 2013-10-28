package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.model.common.AdEntityBase;


import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_fieldgroup database table.
 * 
 */
@Entity
@Table(name="ad_fieldgroup")
public class AdFieldgroup extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adFieldgroupId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String entitytype;
	private String fieldgrouptype;
	private String isactive;
	private String iscollapsedbydefault;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdFieldgroup() {
	}


	@Id
	@Column(name="AD_FIELDGROUP_ID")
	public long getAdFieldgroupId() {
		return this.adFieldgroupId;
	}

	public void setAdFieldgroupId(long adFieldgroupId) {
		this.adFieldgroupId = adFieldgroupId;
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


	public String getFieldgrouptype() {
		return this.fieldgrouptype;
	}

	public void setFieldgrouptype(String fieldgrouptype) {
		this.fieldgrouptype = fieldgrouptype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscollapsedbydefault() {
		return this.iscollapsedbydefault;
	}

	public void setIscollapsedbydefault(String iscollapsedbydefault) {
		this.iscollapsedbydefault = iscollapsedbydefault;
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