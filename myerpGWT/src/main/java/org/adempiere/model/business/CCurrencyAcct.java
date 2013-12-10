package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_currency_acct database table.
 * 
 */
@Entity
@Table(name="c_currency_acct")
@NamedQuery(name="CCurrencyAcct.findAll", query="SELECT c FROM CCurrencyAcct c")
public class CCurrencyAcct extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CCurrencyAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal realizedgainAcct;
	private BigDecimal realizedlossAcct;
	private BigDecimal unrealizedgainAcct;
	private BigDecimal unrealizedlossAcct;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCurrencyAcct() {
	}


	@EmbeddedId
	public CCurrencyAcctPK getId() {
		return this.id;
	}

	public void setId(CCurrencyAcctPK id) {
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


	@Column(name="REALIZEDGAIN_ACCT")
	public BigDecimal getRealizedgainAcct() {
		return this.realizedgainAcct;
	}

	public void setRealizedgainAcct(BigDecimal realizedgainAcct) {
		this.realizedgainAcct = realizedgainAcct;
	}


	@Column(name="REALIZEDLOSS_ACCT")
	public BigDecimal getRealizedlossAcct() {
		return this.realizedlossAcct;
	}

	public void setRealizedlossAcct(BigDecimal realizedlossAcct) {
		this.realizedlossAcct = realizedlossAcct;
	}


	@Column(name="UNREALIZEDGAIN_ACCT")
	public BigDecimal getUnrealizedgainAcct() {
		return this.unrealizedgainAcct;
	}

	public void setUnrealizedgainAcct(BigDecimal unrealizedgainAcct) {
		this.unrealizedgainAcct = unrealizedgainAcct;
	}


	@Column(name="UNREALIZEDLOSS_ACCT")
	public BigDecimal getUnrealizedlossAcct() {
		return this.unrealizedlossAcct;
	}

	public void setUnrealizedlossAcct(BigDecimal unrealizedlossAcct) {
		this.unrealizedlossAcct = unrealizedlossAcct;
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