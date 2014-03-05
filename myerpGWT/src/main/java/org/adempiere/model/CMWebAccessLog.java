package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_webaccesslog")
public class CMWebAccessLog extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private String acceptLanguage;
	private String active;
	private Integer cMBroadcastServerID;
	private Integer cMMediaID;
	private Integer cMWebAccessLogID;
	private Integer cMWebProjectID;
	private String created;
	private Integer createdBy;
	private BigDecimal fileSize;
	private String hyphen;
	private String iPAddress;
	private String logType;
	private String pageURL;
	private String protocol;
	private String referrer;
	private String remoteAddr;
	private String remoteHost;
	private String requestType;
	private Integer statusCode;
	private String updated;
	private Integer updatedBy;
	private String userAgent;
	private String webSession;

	public CMWebAccessLog() {
	}

	public CMWebAccessLog(Integer cMWebAccessLogID) {
		this.cMWebAccessLogID = cMWebAccessLogID;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	@Basic
	@Column(length=60)
	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false, length=1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Basic
	@Column(name="CM_BROADCASTSERVER_ID", columnDefinition="INT")
	public Integer getCMBroadcastServerID() {
		return cMBroadcastServerID;
	}

	public void setCMBroadcastServerID(Integer cMBroadcastServerID) {
		this.cMBroadcastServerID = cMBroadcastServerID;
	}

	@Basic
	@Column(name="CM_MEDIA_ID", columnDefinition="INT")
	public Integer getCMMediaID() {
		return cMMediaID;
	}

	public void setCMMediaID(Integer cMMediaID) {
		this.cMMediaID = cMMediaID;
	}

	@Id
	@Column(name="CM_WEBACCESSLOG_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1280", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "CM_WebAccessLog", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1280")
	public Integer getCMWebAccessLogID() {
		return cMWebAccessLogID;
	}

	public void setCMWebAccessLogID(Integer cMWebAccessLogID) {
		this.cMWebAccessLogID = cMWebAccessLogID;
	}

	@Basic
	@Column(name="CM_WEBPROJECT_ID", columnDefinition="INT")
	public Integer getCMWebProjectID() {
		return cMWebProjectID;
	}

	public void setCMWebProjectID(Integer cMWebProjectID) {
		this.cMWebProjectID = cMWebProjectID;
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
	public BigDecimal getFileSize() {
		return fileSize;
	}

	public void setFileSize(BigDecimal fileSize) {
		this.fileSize = fileSize;
	}

	@Basic
	@Column(length=20)
	public String getHyphen() {
		return hyphen;
	}

	public void setHyphen(String hyphen) {
		this.hyphen = hyphen;
	}

	@Basic
	@Column(name="IP_ADDRESS", nullable=false, length=20)
	public String getIPAddress() {
		return iPAddress;
	}

	public void setIPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	@Basic
	@Column(length=120)
	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Basic
	@Column(length=120)
	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	@Basic
	@Column(name="REMOTE_ADDR", length=60)
	public String getRemoteAddr() {
		return remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	@Basic
	@Column(name="REMOTE_HOST", length=120)
	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	@Basic
	@Column(nullable=false, length=4)
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
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
	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	@Basic
	@Column(length=40)
	public String getWebSession() {
		return webSession;
	}

	public void setWebSession(String webSession) {
		this.webSession = webSession;
	}
}