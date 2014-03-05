package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_paymentprocessor")
public class CPaymentProcessor extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDSequenceID;
	private Boolean acceptAMEX;
	private Boolean acceptATM;
	private Boolean acceptCheck;
	private Boolean acceptCorporate;
	private Boolean acceptDiners;
	private Boolean acceptDirectDebit;
	private Boolean acceptDirectDeposit;
	private Boolean acceptDiscover;
	private Boolean acceptMC;
	private Boolean acceptVisa;
	private Boolean active;
	private Integer cBankAccountID;
	private Integer cCurrencyID;
	private Integer cPaymentProcessorID;
	private BigDecimal commission;
	private BigDecimal costPerTrx;
	private String created;
	private Integer createdBy;
	private String description;
	private String hostAddress;
	private Integer hostPort;
	private BigDecimal minimumAmt;
	private String name;
	private String partnerID;
	private String password;
	private String payProcessorClass;
	private String proxyAddress;
	private String proxyLogon;
	private String proxyPassword;
	private Integer proxyPort;
	private Boolean requireVV;
	private String updated;
	private Integer updatedBy;
	private String userID;
	private String vendorID;

	public CPaymentProcessor() {
	}

	public CPaymentProcessor(Integer cPaymentProcessorID) {
		this.cPaymentProcessorID = cPaymentProcessorID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="AD_SEQUENCE_ID", columnDefinition="INT")
	public Integer getADSequenceID() {
		return aDSequenceID;
	}

	public void setADSequenceID(Integer aDSequenceID) {
		this.aDSequenceID = aDSequenceID;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptAMEX() {
		return acceptAMEX;
	}

	public void setAcceptAMEX(Boolean acceptAMEX) {
		this.acceptAMEX = acceptAMEX;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptATM() {
		return acceptATM;
	}

	public void setAcceptATM(Boolean acceptATM) {
		this.acceptATM = acceptATM;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptCheck() {
		return acceptCheck;
	}

	public void setAcceptCheck(Boolean acceptCheck) {
		this.acceptCheck = acceptCheck;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptCorporate() {
		return acceptCorporate;
	}

	public void setAcceptCorporate(Boolean acceptCorporate) {
		this.acceptCorporate = acceptCorporate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptDiners() {
		return acceptDiners;
	}

	public void setAcceptDiners(Boolean acceptDiners) {
		this.acceptDiners = acceptDiners;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptDirectDebit() {
		return acceptDirectDebit;
	}

	public void setAcceptDirectDebit(Boolean acceptDirectDebit) {
		this.acceptDirectDebit = acceptDirectDebit;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptDirectDeposit() {
		return acceptDirectDeposit;
	}

	public void setAcceptDirectDeposit(Boolean acceptDirectDeposit) {
		this.acceptDirectDeposit = acceptDirectDeposit;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptDiscover() {
		return acceptDiscover;
	}

	public void setAcceptDiscover(Boolean acceptDiscover) {
		this.acceptDiscover = acceptDiscover;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptMC() {
		return acceptMC;
	}

	public void setAcceptMC(Boolean acceptMC) {
		this.acceptMC = acceptMC;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isAcceptVisa() {
		return acceptVisa;
	}

	public void setAcceptVisa(Boolean acceptVisa) {
		this.acceptVisa = acceptVisa;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT", nullable=false)
	public Integer getCBankAccountID() {
		return cBankAccountID;
	}

	public void setCBankAccountID(Integer cBankAccountID) {
		this.cBankAccountID = cBankAccountID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Id
	@Column(name="C_PAYMENTPROCESSOR_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_335", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_PaymentProcessor", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_335")
	public Integer getCPaymentProcessorID() {
		return cPaymentProcessorID;
	}

	public void setCPaymentProcessorID(Integer cPaymentProcessorID) {
		this.cPaymentProcessorID = cPaymentProcessorID;
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
	public BigDecimal getCostPerTrx() {
		return costPerTrx;
	}

	public void setCostPerTrx(BigDecimal costPerTrx) {
		this.costPerTrx = costPerTrx;
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
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
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
	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getHostPort() {
		return hostPort;
	}

	public void setHostPort(Integer hostPort) {
		this.hostPort = hostPort;
	}

	@Basic
	public BigDecimal getMinimumAmt() {
		return minimumAmt;
	}

	public void setMinimumAmt(BigDecimal minimumAmt) {
		this.minimumAmt = minimumAmt;
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
	public String getPartnerID() {
		return partnerID;
	}

	public void setPartnerID(String partnerID) {
		this.partnerID = partnerID;
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
	public String getPayProcessorClass() {
		return payProcessorClass;
	}

	public void setPayProcessorClass(String payProcessorClass) {
		this.payProcessorClass = payProcessorClass;
	}

	@Basic
	@Column(length=60)
	public String getProxyAddress() {
		return proxyAddress;
	}

	public void setProxyAddress(String proxyAddress) {
		this.proxyAddress = proxyAddress;
	}

	@Basic
	@Column(length=60)
	public String getProxyLogon() {
		return proxyLogon;
	}

	public void setProxyLogon(String proxyLogon) {
		this.proxyLogon = proxyLogon;
	}

	@Basic
	@Column(length=60)
	public String getProxyPassword() {
		return proxyPassword;
	}

	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(Integer proxyPort) {
		this.proxyPort = proxyPort;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isRequireVV() {
		return requireVV;
	}

	public void setRequireVV(Boolean requireVV) {
		this.requireVV = requireVV;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(length=60)
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Basic
	@Column(length=60)
	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
}