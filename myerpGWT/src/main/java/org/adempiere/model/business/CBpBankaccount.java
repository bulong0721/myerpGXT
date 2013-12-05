package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_bankaccount database table.
 * 
 */
@Entity
@Table(name="c_bp_bankaccount")
@NamedQuery(name="CBpBankaccount.findAll", query="SELECT c FROM CBpBankaccount c")
public class CBpBankaccount extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpBankaccountId;
	private String aCity;
	private String aCountry;
	private String aEmail;
	private String aIdentDl;
	private String aIdentSsn;
	private String aName;
	private String aState;
	private String aStreet;
	private String aZip;
	private String accountno;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private String bankaccounttype;
	private String bpbankacctuse;
	private BigDecimal cBankId;
	private BigDecimal cBpartnerId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal creditcardexpmm;
	private BigDecimal creditcardexpyy;
	private String creditcardnumber;
	private String creditcardtype;
	private String creditcardvv;
	private String isach;
	private String isactive;
	private String rAvsaddr;
	private String rAvszip;
	private String routingno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpBankaccount() {
	}


	@Id
	@Column(name="C_BP_BANKACCOUNT_ID")
	public long getCBpBankaccountId() {
		return this.cBpBankaccountId;
	}

	public void setCBpBankaccountId(long cBpBankaccountId) {
		this.cBpBankaccountId = cBpBankaccountId;
	}


	@Column(name="A_CITY")
	public String getACity() {
		return this.aCity;
	}

	public void setACity(String aCity) {
		this.aCity = aCity;
	}


	@Column(name="A_COUNTRY")
	public String getACountry() {
		return this.aCountry;
	}

	public void setACountry(String aCountry) {
		this.aCountry = aCountry;
	}


	@Column(name="A_EMAIL")
	public String getAEmail() {
		return this.aEmail;
	}

	public void setAEmail(String aEmail) {
		this.aEmail = aEmail;
	}


	@Column(name="A_IDENT_DL")
	public String getAIdentDl() {
		return this.aIdentDl;
	}

	public void setAIdentDl(String aIdentDl) {
		this.aIdentDl = aIdentDl;
	}


	@Column(name="A_IDENT_SSN")
	public String getAIdentSsn() {
		return this.aIdentSsn;
	}

	public void setAIdentSsn(String aIdentSsn) {
		this.aIdentSsn = aIdentSsn;
	}


	@Column(name="A_NAME")
	public String getAName() {
		return this.aName;
	}

	public void setAName(String aName) {
		this.aName = aName;
	}


	@Column(name="A_STATE")
	public String getAState() {
		return this.aState;
	}

	public void setAState(String aState) {
		this.aState = aState;
	}


	@Column(name="A_STREET")
	public String getAStreet() {
		return this.aStreet;
	}

	public void setAStreet(String aStreet) {
		this.aStreet = aStreet;
	}


	@Column(name="A_ZIP")
	public String getAZip() {
		return this.aZip;
	}

	public void setAZip(String aZip) {
		this.aZip = aZip;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	public String getBankaccounttype() {
		return this.bankaccounttype;
	}

	public void setBankaccounttype(String bankaccounttype) {
		this.bankaccounttype = bankaccounttype;
	}


	public String getBpbankacctuse() {
		return this.bpbankacctuse;
	}

	public void setBpbankacctuse(String bpbankacctuse) {
		this.bpbankacctuse = bpbankacctuse;
	}


	@Column(name="C_BANK_ID")
	public BigDecimal getCBankId() {
		return this.cBankId;
	}

	public void setCBankId(BigDecimal cBankId) {
		this.cBankId = cBankId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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


	public BigDecimal getCreditcardexpmm() {
		return this.creditcardexpmm;
	}

	public void setCreditcardexpmm(BigDecimal creditcardexpmm) {
		this.creditcardexpmm = creditcardexpmm;
	}


	public BigDecimal getCreditcardexpyy() {
		return this.creditcardexpyy;
	}

	public void setCreditcardexpyy(BigDecimal creditcardexpyy) {
		this.creditcardexpyy = creditcardexpyy;
	}


	public String getCreditcardnumber() {
		return this.creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}


	public String getCreditcardtype() {
		return this.creditcardtype;
	}

	public void setCreditcardtype(String creditcardtype) {
		this.creditcardtype = creditcardtype;
	}


	public String getCreditcardvv() {
		return this.creditcardvv;
	}

	public void setCreditcardvv(String creditcardvv) {
		this.creditcardvv = creditcardvv;
	}


	public String getIsach() {
		return this.isach;
	}

	public void setIsach(String isach) {
		this.isach = isach;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="R_AVSADDR")
	public String getRAvsaddr() {
		return this.rAvsaddr;
	}

	public void setRAvsaddr(String rAvsaddr) {
		this.rAvsaddr = rAvsaddr;
	}


	@Column(name="R_AVSZIP")
	public String getRAvszip() {
		return this.rAvszip;
	}

	public void setRAvszip(String rAvszip) {
		this.rAvszip = rAvszip;
	}


	public String getRoutingno() {
		return this.routingno;
	}

	public void setRoutingno(String routingno) {
		this.routingno = routingno;
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