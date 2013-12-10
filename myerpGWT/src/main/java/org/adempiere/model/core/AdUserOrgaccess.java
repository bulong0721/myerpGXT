package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_user_orgaccess database table.
 * 
 */
@Entity
@Table(name="ad_user_orgaccess")
@NamedQuery(name="AdUserOrgaccess.findAll", query="SELECT a FROM AdUserOrgaccess a")
public class AdUserOrgaccess extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private AdUserOrgaccessPK id;
	private BigDecimal adClientId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String isreadonly;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserOrgaccess() {
	}


	@EmbeddedId
	public AdUserOrgaccessPK getId() {
		return this.id;
	}

	public void setId(AdUserOrgaccessPK id) {
		this.id = id;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
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