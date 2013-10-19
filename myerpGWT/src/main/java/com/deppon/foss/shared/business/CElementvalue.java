package com.deppon.foss.shared.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_elementvalue database table.
 * 
 */
@Entity
@Table(name="c_elementvalue")
public class CElementvalue extends com.deppon.foss.shared.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cElementvalueId;
	private String accountsign;
	private String accounttype;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBankaccountId;
	private BigDecimal cCurrencyId;
	private BigDecimal cElementId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isbankaccount;
	private String isdoccontrolled;
	private String isforeigncurrency;
	private String issummary;
	private String name;
	private String postactual;
	private String postbudget;
	private String postencumbrance;
	private String poststatistical;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;
	private Date validto;
	private String value;

	public CElementvalue() {
	}


	@Id
	@Column(name="C_ELEMENTVALUE_ID")
	public long getCElementvalueId() {
		return this.cElementvalueId;
	}

	public void setCElementvalueId(long cElementvalueId) {
		this.cElementvalueId = cElementvalueId;
	}


	public String getAccountsign() {
		return this.accountsign;
	}

	public void setAccountsign(String accountsign) {
		this.accountsign = accountsign;
	}


	public String getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
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


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_ELEMENT_ID")
	public BigDecimal getCElementId() {
		return this.cElementId;
	}

	public void setCElementId(BigDecimal cElementId) {
		this.cElementId = cElementId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbankaccount() {
		return this.isbankaccount;
	}

	public void setIsbankaccount(String isbankaccount) {
		this.isbankaccount = isbankaccount;
	}


	public String getIsdoccontrolled() {
		return this.isdoccontrolled;
	}

	public void setIsdoccontrolled(String isdoccontrolled) {
		this.isdoccontrolled = isdoccontrolled;
	}


	public String getIsforeigncurrency() {
		return this.isforeigncurrency;
	}

	public void setIsforeigncurrency(String isforeigncurrency) {
		this.isforeigncurrency = isforeigncurrency;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPostactual() {
		return this.postactual;
	}

	public void setPostactual(String postactual) {
		this.postactual = postactual;
	}


	public String getPostbudget() {
		return this.postbudget;
	}

	public void setPostbudget(String postbudget) {
		this.postbudget = postbudget;
	}


	public String getPostencumbrance() {
		return this.postencumbrance;
	}

	public void setPostencumbrance(String postencumbrance) {
		this.postencumbrance = postencumbrance;
	}


	public String getPoststatistical() {
		return this.poststatistical;
	}

	public void setPoststatistical(String poststatistical) {
		this.poststatistical = poststatistical;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}