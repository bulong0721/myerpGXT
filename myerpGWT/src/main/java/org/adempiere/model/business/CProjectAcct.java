package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_project_acct database table.
 * 
 */
@Entity
@Table(name="c_project_acct")
@NamedQuery(name="CProjectAcct.findAll", query="SELECT c FROM CProjectAcct c")
public class CProjectAcct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CProjectAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal pjAssetAcct;
	private BigDecimal pjWipAcct;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CProjectAcct() {
	}


	@EmbeddedId
	public CProjectAcctPK getId() {
		return this.id;
	}

	public void setId(CProjectAcctPK id) {
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


	@Column(name="PJ_ASSET_ACCT")
	public BigDecimal getPjAssetAcct() {
		return this.pjAssetAcct;
	}

	public void setPjAssetAcct(BigDecimal pjAssetAcct) {
		this.pjAssetAcct = pjAssetAcct;
	}


	@Column(name="PJ_WIP_ACCT")
	public BigDecimal getPjWipAcct() {
		return this.pjWipAcct;
	}

	public void setPjWipAcct(BigDecimal pjWipAcct) {
		this.pjWipAcct = pjWipAcct;
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