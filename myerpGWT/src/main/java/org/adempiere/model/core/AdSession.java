package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ad_session database table.
 * 
 */
@Entity
@Table(name="ad_session")
@NamedQuery(name="AdSession.findAll", query="SELECT a FROM AdSession a")
public class AdSession extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adSessionId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adRoleId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private Date logindate;
	private String processed;
	private String remoteAddr;
	private String remoteHost;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String websession;

	public AdSession() {
	}


	@Id
	@Column(name="AD_SESSION_ID")
	public long getAdSessionId() {
		return this.adSessionId;
	}

	public void setAdSessionId(long adSessionId) {
		this.adSessionId = adSessionId;
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


	@Column(name="AD_ROLE_ID")
	public BigDecimal getAdRoleId() {
		return this.adRoleId;
	}

	public void setAdRoleId(BigDecimal adRoleId) {
		this.adRoleId = adRoleId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLogindate() {
		return this.logindate;
	}

	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	@Column(name="REMOTE_ADDR")
	public String getRemoteAddr() {
		return this.remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}


	@Column(name="REMOTE_HOST")
	public String getRemoteHost() {
		return this.remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
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


	public String getWebsession() {
		return this.websession;
	}

	public void setWebsession(String websession) {
		this.websession = websession;
	}

}