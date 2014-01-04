package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bankstatementloader")
public class CBankstatementloader extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String accountno;
	private Integer adClientId;
	private Integer adOrgId;
	private String branchid;
	private Integer cBankaccountId;
	private Integer cBankstatementloaderId;
	private String created;
	private Integer createdby;
	private String dateformat;
	private String datelastrun;
	private String description;
	private String filename;
	private String financialinstitutionid;
	private String hostaddress;
	private Integer hostport;
	private String isactive;
	private String name;
	private String password;
	private String pin;
	private String proxyaddress;
	private String proxylogon;
	private String proxypassword;
	private Integer proxyport;
	private String stmtloaderclass;
	private String updated;
	private Integer updatedby;
	private String userid;

	public CBankstatementloader() {
	}

	public CBankstatementloader(Integer cBankstatementloaderId) {
		this.cBankstatementloaderId = cBankstatementloaderId;
	}

	@Basic
	@Column(length=20)
	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(length=20)
	public String getBranchid() {
		return branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	@Basic
	@Column(name="C_BANKACCOUNT_ID", nullable=false)
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}

	@Id
	@Column(name="C_BANKSTATEMENTLOADER_ID")
	public Integer getCBankstatementloaderId() {
		return cBankstatementloaderId;
	}

	public void setCBankstatementloaderId(Integer cBankstatementloaderId) {
		this.cBankstatementloaderId = cBankstatementloaderId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=20)
	public String getDateformat() {
		return dateformat;
	}

	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}

	@Basic
	public String getDatelastrun() {
		return datelastrun;
	}

	public void setDatelastrun(String datelastrun) {
		this.datelastrun = datelastrun;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=120)
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Basic
	@Column(length=20)
	public String getFinancialinstitutionid() {
		return financialinstitutionid;
	}

	public void setFinancialinstitutionid(String financialinstitutionid) {
		this.financialinstitutionid = financialinstitutionid;
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
	public Integer getHostport() {
		return hostport;
	}

	public void setHostport(Integer hostport) {
		this.hostport = hostport;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(length=20)
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
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
	public Integer getProxyport() {
		return proxyport;
	}

	public void setProxyport(Integer proxyport) {
		this.proxyport = proxyport;
	}

	@Basic
	@Column(length=60)
	public String getStmtloaderclass() {
		return stmtloaderclass;
	}

	public void setStmtloaderclass(String stmtloaderclass) {
		this.stmtloaderclass = stmtloaderclass;
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
	@Column(nullable=false)
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
}