package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_paymentprocessor")
public class CPaymentprocessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Boolean acceptamex;
	private Boolean acceptatm;
	private Boolean acceptcheck;
	private Boolean acceptcorporate;
	private Boolean acceptdiners;
	private Boolean acceptdirectdebit;
	private Boolean acceptdirectdeposit;
	private Boolean acceptdiscover;
	private Boolean acceptmc;
	private Boolean acceptvisa;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adSequenceId;
	private Integer cBankaccountId;
	private Integer cCurrencyId;
	private Integer cPaymentprocessorId;
	private BigDecimal commission;
	private BigDecimal costpertrx;
	private String created;
	private Integer createdby;
	private String description;
	private String hostaddress;
	private Integer hostport;
	private Boolean isactive;
	private BigDecimal minimumamt;
	private String name;
	private String partnerid;
	private String password;
	private String payprocessorclass;
	private String proxyaddress;
	private String proxylogon;
	private String proxypassword;
	private Integer proxyport;
	private Boolean requirevv;
	private String updated;
	private Integer updatedby;
	private String userid;
	private String vendorid;

	public CPaymentprocessor() {
	}

	public CPaymentprocessor(Integer cPaymentprocessorId) {
		this.cPaymentprocessorId = cPaymentprocessorId;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptamex() {
		return acceptamex;
	}

	public void setAcceptamex(Boolean acceptamex) {
		this.acceptamex = acceptamex;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptatm() {
		return acceptatm;
	}

	public void setAcceptatm(Boolean acceptatm) {
		this.acceptatm = acceptatm;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptcheck() {
		return acceptcheck;
	}

	public void setAcceptcheck(Boolean acceptcheck) {
		this.acceptcheck = acceptcheck;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptcorporate() {
		return acceptcorporate;
	}

	public void setAcceptcorporate(Boolean acceptcorporate) {
		this.acceptcorporate = acceptcorporate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptdiners() {
		return acceptdiners;
	}

	public void setAcceptdiners(Boolean acceptdiners) {
		this.acceptdiners = acceptdiners;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptdirectdebit() {
		return acceptdirectdebit;
	}

	public void setAcceptdirectdebit(Boolean acceptdirectdebit) {
		this.acceptdirectdebit = acceptdirectdebit;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptdirectdeposit() {
		return acceptdirectdeposit;
	}

	public void setAcceptdirectdeposit(Boolean acceptdirectdeposit) {
		this.acceptdirectdeposit = acceptdirectdeposit;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptdiscover() {
		return acceptdiscover;
	}

	public void setAcceptdiscover(Boolean acceptdiscover) {
		this.acceptdiscover = acceptdiscover;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptmc() {
		return acceptmc;
	}

	public void setAcceptmc(Boolean acceptmc) {
		this.acceptmc = acceptmc;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptvisa() {
		return acceptvisa;
	}

	public void setAcceptvisa(Boolean acceptvisa) {
		this.acceptvisa = acceptvisa;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_SEQUENCE_ID", columnDefinition="INT")
	public Integer getAdSequenceId() {
		return adSequenceId;
	}

	public void setAdSequenceId(Integer adSequenceId) {
		this.adSequenceId = adSequenceId;
	}

	@Basic
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT", nullable=false)
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Id
	@Column(name="C_PAYMENTPROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_335", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_PaymentProcessor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_335")
	public Integer getCPaymentprocessorId() {
		return cPaymentprocessorId;
	}

	public void setCPaymentprocessorId(Integer cPaymentprocessorId) {
		this.cPaymentprocessorId = cPaymentprocessorId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCostpertrx() {
		return costpertrx;
	}

	public void setCostpertrx(BigDecimal costpertrx) {
		this.costpertrx = costpertrx;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=60)
	public String getHostaddress() {
		return hostaddress;
	}

	public void setHostaddress(String hostaddress) {
		this.hostaddress = hostaddress;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getHostport() {
		return hostport;
	}

	public void setHostport(Integer hostport) {
		this.hostport = hostport;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	public BigDecimal getMinimumamt() {
		return minimumamt;
	}

	public void setMinimumamt(BigDecimal minimumamt) {
		this.minimumamt = minimumamt;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=60)
	public String getPartnerid() {
		return partnerid;
	}

	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}

	@Basic
	@Column(length=60)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(length=60)
	public String getPayprocessorclass() {
		return payprocessorclass;
	}

	public void setPayprocessorclass(String payprocessorclass) {
		this.payprocessorclass = payprocessorclass;
	}

	@Basic
	@Column(length=60)
	public String getProxyaddress() {
		return proxyaddress;
	}

	public void setProxyaddress(String proxyaddress) {
		this.proxyaddress = proxyaddress;
	}

	@Basic
	@Column(length=60)
	public String getProxylogon() {
		return proxylogon;
	}

	public void setProxylogon(String proxylogon) {
		this.proxylogon = proxylogon;
	}

	@Basic
	@Column(length=60)
	public String getProxypassword() {
		return proxypassword;
	}

	public void setProxypassword(String proxypassword) {
		this.proxypassword = proxypassword;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getProxyport() {
		return proxyport;
	}

	public void setProxyport(Integer proxyport) {
		this.proxyport = proxyport;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isRequirevv() {
		return requirevv;
	}

	public void setRequirevv(Boolean requirevv) {
		this.requirevv = requirevv;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(length=60)
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Basic
	@Column(length=60)
	public String getVendorid() {
		return vendorid;
	}

	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
}