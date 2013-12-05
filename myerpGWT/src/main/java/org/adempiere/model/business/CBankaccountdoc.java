package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bankaccountdoc database table.
 * 
 */
@Entity
@Table(name="c_bankaccountdoc")
@NamedQuery(name="CBankaccountdoc.findAll", query="SELECT c FROM CBankaccountdoc c")
public class CBankaccountdoc extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankaccountdocId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBankaccountId;
	private BigDecimal checkPrintformatId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal currentnext;
	private String description;
	private String isactive;
	private String name;
	private String paymentrule;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBankaccountdoc() {
	}


	@Id
	@Column(name="C_BANKACCOUNTDOC_ID")
	public long getCBankaccountdocId() {
		return this.cBankaccountdocId;
	}

	public void setCBankaccountdocId(long cBankaccountdocId) {
		this.cBankaccountdocId = cBankaccountdocId;
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


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}


	@Column(name="CHECK_PRINTFORMAT_ID")
	public BigDecimal getCheckPrintformatId() {
		return this.checkPrintformatId;
	}

	public void setCheckPrintformatId(BigDecimal checkPrintformatId) {
		this.checkPrintformatId = checkPrintformatId;
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


	public BigDecimal getCurrentnext() {
		return this.currentnext;
	}

	public void setCurrentnext(BigDecimal currentnext) {
		this.currentnext = currentnext;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPaymentrule() {
		return this.paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
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