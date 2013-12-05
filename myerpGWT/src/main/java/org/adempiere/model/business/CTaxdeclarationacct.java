package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_taxdeclarationacct database table.
 * 
 */
@Entity
@Table(name="c_taxdeclarationacct")
@NamedQuery(name="CTaxdeclarationacct.findAll", query="SELECT c FROM CTaxdeclarationacct c")
public class CTaxdeclarationacct extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxdeclarationacctId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cAcctschemaId;
	private BigDecimal cTaxdeclarationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal factAcctId;
	private String isactive;
	private BigDecimal line;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CTaxdeclarationacct() {
	}


	@Id
	@Column(name="C_TAXDECLARATIONACCT_ID")
	public long getCTaxdeclarationacctId() {
		return this.cTaxdeclarationacctId;
	}

	public void setCTaxdeclarationacctId(long cTaxdeclarationacctId) {
		this.cTaxdeclarationacctId = cTaxdeclarationacctId;
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


	@Column(name="C_ACCTSCHEMA_ID")
	public BigDecimal getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(BigDecimal cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}


	@Column(name="C_TAXDECLARATION_ID")
	public BigDecimal getCTaxdeclarationId() {
		return this.cTaxdeclarationId;
	}

	public void setCTaxdeclarationId(BigDecimal cTaxdeclarationId) {
		this.cTaxdeclarationId = cTaxdeclarationId;
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


	@Column(name="FACT_ACCT_ID")
	public BigDecimal getFactAcctId() {
		return this.factAcctId;
	}

	public void setFactAcctId(BigDecimal factAcctId) {
		this.factAcctId = factAcctId;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
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