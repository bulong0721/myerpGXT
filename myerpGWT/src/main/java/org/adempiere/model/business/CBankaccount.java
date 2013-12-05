package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bankaccount database table.
 * 
 */
@Entity
@Table(name="c_bankaccount")
@NamedQuery(name="CBankaccount.findAll", query="SELECT c FROM CBankaccount c")
public class CBankaccount extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankaccountId;
	private String accountno;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String bankaccounttype;
	private String bban;
	private BigDecimal cBankId;
	private BigDecimal cCurrencyId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal creditlimit;
	private BigDecimal currentbalance;
	private String description;
	private String iban;
	private String isactive;
	private String isdefault;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBankaccount() {
	}


	@Id
	@Column(name="C_BANKACCOUNT_ID")
	public long getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(long cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}


	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
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


	public String getBankaccounttype() {
		return this.bankaccounttype;
	}

	public void setBankaccounttype(String bankaccounttype) {
		this.bankaccounttype = bankaccounttype;
	}


	public String getBban() {
		return this.bban;
	}

	public void setBban(String bban) {
		this.bban = bban;
	}


	@Column(name="C_BANK_ID")
	public BigDecimal getCBankId() {
		return this.cBankId;
	}

	public void setCBankId(BigDecimal cBankId) {
		this.cBankId = cBankId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
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


	public BigDecimal getCreditlimit() {
		return this.creditlimit;
	}

	public void setCreditlimit(BigDecimal creditlimit) {
		this.creditlimit = creditlimit;
	}


	public BigDecimal getCurrentbalance() {
		return this.currentbalance;
	}

	public void setCurrentbalance(BigDecimal currentbalance) {
		this.currentbalance = currentbalance;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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