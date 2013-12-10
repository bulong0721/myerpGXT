package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_paymentprocessor database table.
 * 
 */
@Entity
@Table(name="c_paymentprocessor")
@NamedQuery(name="CPaymentprocessor.findAll", query="SELECT c FROM CPaymentprocessor c")
public class CPaymentprocessor extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPaymentprocessorId;
	private String acceptamex;
	private String acceptatm;
	private String acceptcheck;
	private String acceptcorporate;
	private String acceptdiners;
	private String acceptdirectdebit;
	private String acceptdirectdeposit;
	private String acceptdiscover;
	private String acceptmc;
	private String acceptvisa;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adSequenceId;
	private BigDecimal cBankaccountId;
	private BigDecimal cCurrencyId;
	private BigDecimal commission;
	private BigDecimal costpertrx;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String hostaddress;
	private BigDecimal hostport;
	private String isactive;
	private BigDecimal minimumamt;
	private String name;
	private String partnerid;
	private String password;
	private String payprocessorclass;
	private String proxyaddress;
	private String proxylogon;
	private String proxypassword;
	private BigDecimal proxyport;
	private String requirevv;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String userid;
	private String vendorid;

	public CPaymentprocessor() {
	}


	@Id
	@Column(name="C_PAYMENTPROCESSOR_ID")
	public long getCPaymentprocessorId() {
		return this.cPaymentprocessorId;
	}

	public void setCPaymentprocessorId(long cPaymentprocessorId) {
		this.cPaymentprocessorId = cPaymentprocessorId;
	}


	public String getAcceptamex() {
		return this.acceptamex;
	}

	public void setAcceptamex(String acceptamex) {
		this.acceptamex = acceptamex;
	}


	public String getAcceptatm() {
		return this.acceptatm;
	}

	public void setAcceptatm(String acceptatm) {
		this.acceptatm = acceptatm;
	}


	public String getAcceptcheck() {
		return this.acceptcheck;
	}

	public void setAcceptcheck(String acceptcheck) {
		this.acceptcheck = acceptcheck;
	}


	public String getAcceptcorporate() {
		return this.acceptcorporate;
	}

	public void setAcceptcorporate(String acceptcorporate) {
		this.acceptcorporate = acceptcorporate;
	}


	public String getAcceptdiners() {
		return this.acceptdiners;
	}

	public void setAcceptdiners(String acceptdiners) {
		this.acceptdiners = acceptdiners;
	}


	public String getAcceptdirectdebit() {
		return this.acceptdirectdebit;
	}

	public void setAcceptdirectdebit(String acceptdirectdebit) {
		this.acceptdirectdebit = acceptdirectdebit;
	}


	public String getAcceptdirectdeposit() {
		return this.acceptdirectdeposit;
	}

	public void setAcceptdirectdeposit(String acceptdirectdeposit) {
		this.acceptdirectdeposit = acceptdirectdeposit;
	}


	public String getAcceptdiscover() {
		return this.acceptdiscover;
	}

	public void setAcceptdiscover(String acceptdiscover) {
		this.acceptdiscover = acceptdiscover;
	}


	public String getAcceptmc() {
		return this.acceptmc;
	}

	public void setAcceptmc(String acceptmc) {
		this.acceptmc = acceptmc;
	}


	public String getAcceptvisa() {
		return this.acceptvisa;
	}

	public void setAcceptvisa(String acceptvisa) {
		this.acceptvisa = acceptvisa;
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


	@Column(name="AD_SEQUENCE_ID")
	public BigDecimal getAdSequenceId() {
		return this.adSequenceId;
	}

	public void setAdSequenceId(BigDecimal adSequenceId) {
		this.adSequenceId = adSequenceId;
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


	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}


	public BigDecimal getCostpertrx() {
		return this.costpertrx;
	}

	public void setCostpertrx(BigDecimal costpertrx) {
		this.costpertrx = costpertrx;
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


	public String getHostaddress() {
		return this.hostaddress;
	}

	public void setHostaddress(String hostaddress) {
		this.hostaddress = hostaddress;
	}


	public BigDecimal getHostport() {
		return this.hostport;
	}

	public void setHostport(BigDecimal hostport) {
		this.hostport = hostport;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getMinimumamt() {
		return this.minimumamt;
	}

	public void setMinimumamt(BigDecimal minimumamt) {
		this.minimumamt = minimumamt;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPartnerid() {
		return this.partnerid;
	}

	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPayprocessorclass() {
		return this.payprocessorclass;
	}

	public void setPayprocessorclass(String payprocessorclass) {
		this.payprocessorclass = payprocessorclass;
	}


	public String getProxyaddress() {
		return this.proxyaddress;
	}

	public void setProxyaddress(String proxyaddress) {
		this.proxyaddress = proxyaddress;
	}


	public String getProxylogon() {
		return this.proxylogon;
	}

	public void setProxylogon(String proxylogon) {
		this.proxylogon = proxylogon;
	}


	public String getProxypassword() {
		return this.proxypassword;
	}

	public void setProxypassword(String proxypassword) {
		this.proxypassword = proxypassword;
	}


	public BigDecimal getProxyport() {
		return this.proxyport;
	}

	public void setProxyport(BigDecimal proxyport) {
		this.proxyport = proxyport;
	}


	public String getRequirevv() {
		return this.requirevv;
	}

	public void setRequirevv(String requirevv) {
		this.requirevv = requirevv;
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


	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getVendorid() {
		return this.vendorid;
	}

	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}

}