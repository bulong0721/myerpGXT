package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_bankstatementloader database table.
 * 
 */
@Entity
@Table(name="c_bankstatementloader")
@NamedQuery(name="CBankstatementloader.findAll", query="SELECT c FROM CBankstatementloader c")
public class CBankstatementloader extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBankstatementloaderId;
	private String accountno;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String branchid;
	private BigDecimal cBankaccountId;
	private Timestamp created;
	private BigDecimal createdby;
	private String dateformat;
	private Date datelastrun;
	private String description;
	private String filename;
	private String financialinstitutionid;
	private String hostaddress;
	private BigDecimal hostport;
	private String isactive;
	private String name;
	private String password;
	private String pin;
	private String proxyaddress;
	private String proxylogon;
	private String proxypassword;
	private BigDecimal proxyport;
	private String stmtloaderclass;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String userid;

	public CBankstatementloader() {
	}


	@Id
	@Column(name="C_BANKSTATEMENTLOADER_ID")
	public long getCBankstatementloaderId() {
		return this.cBankstatementloaderId;
	}

	public void setCBankstatementloaderId(long cBankstatementloaderId) {
		this.cBankstatementloaderId = cBankstatementloaderId;
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


	public String getBranchid() {
		return this.branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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


	public String getDateformat() {
		return this.dateformat;
	}

	public void setDateformat(String dateformat) {
		this.dateformat = dateformat;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDatelastrun() {
		return this.datelastrun;
	}

	public void setDatelastrun(Date datelastrun) {
		this.datelastrun = datelastrun;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}


	public String getFinancialinstitutionid() {
		return this.financialinstitutionid;
	}

	public void setFinancialinstitutionid(String financialinstitutionid) {
		this.financialinstitutionid = financialinstitutionid;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
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


	public String getStmtloaderclass() {
		return this.stmtloaderclass;
	}

	public void setStmtloaderclass(String stmtloaderclass) {
		this.stmtloaderclass = stmtloaderclass;
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

}