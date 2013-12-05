package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_taxpostal database table.
 * 
 */
@Entity
@Table(name="c_taxpostal")
@NamedQuery(name="CTaxpostal.findAll", query="SELECT c FROM CTaxpostal c")
public class CTaxpostal extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxpostalId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cTaxId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String postal;
	private String postalTo;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CTaxpostal() {
	}


	@Id
	@Column(name="C_TAXPOSTAL_ID")
	public long getCTaxpostalId() {
		return this.cTaxpostalId;
	}

	public void setCTaxpostalId(long cTaxpostalId) {
		this.cTaxpostalId = cTaxpostalId;
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


	@Column(name="C_TAX_ID")
	public BigDecimal getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(BigDecimal cTaxId) {
		this.cTaxId = cTaxId;
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


	public String getPostal() {
		return this.postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}


	@Column(name="POSTAL_TO")
	public String getPostalTo() {
		return this.postalTo;
	}

	public void setPostalTo(String postalTo) {
		this.postalTo = postalTo;
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