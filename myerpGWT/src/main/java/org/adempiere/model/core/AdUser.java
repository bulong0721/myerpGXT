package org.adempiere.model.core;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.adempiere.model.common.AdEntityBase;


/**
 * The persistent class for the ad_user database table.
 * 
 */
@Entity
@Table(name="ad_user")
public class AdUser extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private Date birthday;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cGreetingId;
	private BigDecimal cJobId;
	private String comments;
	private String connectionprofile;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String email;
	private String emailuser;
	private String emailuserpw;
	private String emailverify;
	private Date emailverifydate;
	private String fax;
	private String isactive;
	private String isfullbpaccess;
	private String isinpayroll;
	private Date lastcontact;
	private String lastresult;
	private String ldapuser;
	private String name;
	private String notificationtype;
	private String password;
	private String phone;
	private String phone2;
	private String processing;
	private BigDecimal supervisorId;
	private String title;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String userpin;
	private String value;

	public AdUser() {
	}


	@Id
	@Column(name="AD_USER_ID")
	public long getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(long adUserId) {
		this.adUserId = adUserId;
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


	@Column(name="AD_ORGTRX_ID")
	public BigDecimal getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_GREETING_ID")
	public BigDecimal getCGreetingId() {
		return this.cGreetingId;
	}

	public void setCGreetingId(BigDecimal cGreetingId) {
		this.cGreetingId = cGreetingId;
	}


	@Column(name="C_JOB_ID")
	public BigDecimal getCJobId() {
		return this.cJobId;
	}

	public void setCJobId(BigDecimal cJobId) {
		this.cJobId = cJobId;
	}


	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getConnectionprofile() {
		return this.connectionprofile;
	}

	public void setConnectionprofile(String connectionprofile) {
		this.connectionprofile = connectionprofile;
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


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmailuser() {
		return this.emailuser;
	}

	public void setEmailuser(String emailuser) {
		this.emailuser = emailuser;
	}


	public String getEmailuserpw() {
		return this.emailuserpw;
	}

	public void setEmailuserpw(String emailuserpw) {
		this.emailuserpw = emailuserpw;
	}


	public String getEmailverify() {
		return this.emailverify;
	}

	public void setEmailverify(String emailverify) {
		this.emailverify = emailverify;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEmailverifydate() {
		return this.emailverifydate;
	}

	public void setEmailverifydate(Date emailverifydate) {
		this.emailverifydate = emailverifydate;
	}


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsfullbpaccess() {
		return this.isfullbpaccess;
	}

	public void setIsfullbpaccess(String isfullbpaccess) {
		this.isfullbpaccess = isfullbpaccess;
	}


	public String getIsinpayroll() {
		return this.isinpayroll;
	}

	public void setIsinpayroll(String isinpayroll) {
		this.isinpayroll = isinpayroll;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastcontact() {
		return this.lastcontact;
	}

	public void setLastcontact(Date lastcontact) {
		this.lastcontact = lastcontact;
	}


	public String getLastresult() {
		return this.lastresult;
	}

	public void setLastresult(String lastresult) {
		this.lastresult = lastresult;
	}


	public String getLdapuser() {
		return this.ldapuser;
	}

	public void setLdapuser(String ldapuser) {
		this.ldapuser = ldapuser;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getNotificationtype() {
		return this.notificationtype;
	}

	public void setNotificationtype(String notificationtype) {
		this.notificationtype = notificationtype;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="SUPERVISOR_ID")
	public BigDecimal getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(BigDecimal supervisorId) {
		this.supervisorId = supervisorId;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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


	public String getUserpin() {
		return this.userpin;
	}

	public void setUserpin(String userpin) {
		this.userpin = userpin;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}