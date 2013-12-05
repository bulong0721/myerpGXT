package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_withholding_acct database table.
 * 
 */
@Entity
@Table(name="c_withholding_acct")
@NamedQuery(name="CWithholdingAcct.findAll", query="SELECT c FROM CWithholdingAcct c")
public class CWithholdingAcct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CWithholdingAcctPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal withholdingAcct;

	public CWithholdingAcct() {
	}


	@EmbeddedId
	public CWithholdingAcctPK getId() {
		return this.id;
	}

	public void setId(CWithholdingAcctPK id) {
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


	@Column(name="WITHHOLDING_ACCT")
	public BigDecimal getWithholdingAcct() {
		return this.withholdingAcct;
	}

	public void setWithholdingAcct(BigDecimal withholdingAcct) {
		this.withholdingAcct = withholdingAcct;
	}

}