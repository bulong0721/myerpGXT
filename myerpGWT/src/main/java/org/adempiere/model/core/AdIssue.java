package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

import org.adempiere.model.common.ADEntityBase;


/**
 * The persistent class for the ad_issue database table.
 * 
 */
@Entity
@Table(name = "ad_issue")
public class AdIssue extends ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adIssueId;
	private Long				aAssetId;
	private Long				adClientId;
	private Long				adFormId;
	private Long				adOrgId;
	private Long				adProcessId;
	private Long				adWindowId;
	private String				comments;
	private String				created;
	private Long				createdby;
	private String				databaseinfo;
	private String				dbaddress;
	private String				errortrace;
	private String				isactive;
	private String				isreproducible;
	private String				issuesource;
	private String				issuesummary;
	private String				isvanillasystem;
	private String				javainfo;
	private Long				lineno;
	private String				localHost;
	private String				loggername;
	private String				name;
	private String				operatingsysteminfo;
	private String				processed;
	private String				processing;
	private String				profileinfo;
	private Long				rIssueknownId;
	private Long				rIssueprojectId;
	private Long				rIssuesystemId;
	private Long				rIssueuserId;
	private Long				rRequestId;
	private Long				recordId;
	private String				releaseno;
	private String				releasetag;
	private String				remoteAddr;
	private String				remoteHost;
	private String				requestdocumentno;
	private String				responsetext;
	private String				sourceclassname;
	private String				sourcemethodname;
	private String				stacktrace;
	private String				statisticsinfo;
	private String				supportemail;
	private String				systemstatus;
	private String				updated;
	private Long				updatedby;
	private String				username;
	private String				version;

	public AdIssue() {
	}

	@Id
	@Column(name = "AD_ISSUE_ID")
	public long getAdIssueId() {
		return this.adIssueId;
	}

	public void setAdIssueId(long adIssueId) {
		this.adIssueId = adIssueId;
	}

	@Column(name = "A_ASSET_ID")
	public Long getAAssetId() {
		return this.aAssetId;
	}

	public void setAAssetId(Long aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_FORM_ID")
	public Long getAdFormId() {
		return this.adFormId;
	}

	public void setAdFormId(Long adFormId) {
		this.adFormId = adFormId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_PROCESS_ID")
	public Long getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Column(name = "AD_WINDOW_ID")
	public Long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
		this.adWindowId = adWindowId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public String getDatabaseinfo() {
		return this.databaseinfo;
	}

	public void setDatabaseinfo(String databaseinfo) {
		this.databaseinfo = databaseinfo;
	}

	public String getDbaddress() {
		return this.dbaddress;
	}

	public void setDbaddress(String dbaddress) {
		this.dbaddress = dbaddress;
	}

	public String getErrortrace() {
		return this.errortrace;
	}

	public void setErrortrace(String errortrace) {
		this.errortrace = errortrace;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsreproducible() {
		return this.isreproducible;
	}

	public void setIsreproducible(String isreproducible) {
		this.isreproducible = isreproducible;
	}

	public String getIssuesource() {
		return this.issuesource;
	}

	public void setIssuesource(String issuesource) {
		this.issuesource = issuesource;
	}

	public String getIssuesummary() {
		return this.issuesummary;
	}

	public void setIssuesummary(String issuesummary) {
		this.issuesummary = issuesummary;
	}

	public String getIsvanillasystem() {
		return this.isvanillasystem;
	}

	public void setIsvanillasystem(String isvanillasystem) {
		this.isvanillasystem = isvanillasystem;
	}

	public String getJavainfo() {
		return this.javainfo;
	}

	public void setJavainfo(String javainfo) {
		this.javainfo = javainfo;
	}

	public Long getLineno() {
		return this.lineno;
	}

	public void setLineno(Long lineno) {
		this.lineno = lineno;
	}

	@Column(name = "LOCAL_HOST")
	public String getLocalHost() {
		return this.localHost;
	}

	public void setLocalHost(String localHost) {
		this.localHost = localHost;
	}

	public String getLoggername() {
		return this.loggername;
	}

	public void setLoggername(String loggername) {
		this.loggername = loggername;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperatingsysteminfo() {
		return this.operatingsysteminfo;
	}

	public void setOperatingsysteminfo(String operatingsysteminfo) {
		this.operatingsysteminfo = operatingsysteminfo;
	}

	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getProfileinfo() {
		return this.profileinfo;
	}

	public void setProfileinfo(String profileinfo) {
		this.profileinfo = profileinfo;
	}

	@Column(name = "R_ISSUEKNOWN_ID")
	public Long getRIssueknownId() {
		return this.rIssueknownId;
	}

	public void setRIssueknownId(Long rIssueknownId) {
		this.rIssueknownId = rIssueknownId;
	}

	@Column(name = "R_ISSUEPROJECT_ID")
	public Long getRIssueprojectId() {
		return this.rIssueprojectId;
	}

	public void setRIssueprojectId(Long rIssueprojectId) {
		this.rIssueprojectId = rIssueprojectId;
	}

	@Column(name = "R_ISSUESYSTEM_ID")
	public Long getRIssuesystemId() {
		return this.rIssuesystemId;
	}

	public void setRIssuesystemId(Long rIssuesystemId) {
		this.rIssuesystemId = rIssuesystemId;
	}

	@Column(name = "R_ISSUEUSER_ID")
	public Long getRIssueuserId() {
		return this.rIssueuserId;
	}

	public void setRIssueuserId(Long rIssueuserId) {
		this.rIssueuserId = rIssueuserId;
	}

	@Column(name = "R_REQUEST_ID")
	public Long getRRequestId() {
		return this.rRequestId;
	}

	public void setRRequestId(Long rRequestId) {
		this.rRequestId = rRequestId;
	}

	@Column(name = "RECORD_ID")
	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getReleaseno() {
		return this.releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	public String getReleasetag() {
		return this.releasetag;
	}

	public void setReleasetag(String releasetag) {
		this.releasetag = releasetag;
	}

	@Column(name = "REMOTE_ADDR")
	public String getRemoteAddr() {
		return this.remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	@Column(name = "REMOTE_HOST")
	public String getRemoteHost() {
		return this.remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	public String getRequestdocumentno() {
		return this.requestdocumentno;
	}

	public void setRequestdocumentno(String requestdocumentno) {
		this.requestdocumentno = requestdocumentno;
	}

	public String getResponsetext() {
		return this.responsetext;
	}

	public void setResponsetext(String responsetext) {
		this.responsetext = responsetext;
	}

	public String getSourceclassname() {
		return this.sourceclassname;
	}

	public void setSourceclassname(String sourceclassname) {
		this.sourceclassname = sourceclassname;
	}

	public String getSourcemethodname() {
		return this.sourcemethodname;
	}

	public void setSourcemethodname(String sourcemethodname) {
		this.sourcemethodname = sourcemethodname;
	}

	public String getStacktrace() {
		return this.stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}

	public String getStatisticsinfo() {
		return this.statisticsinfo;
	}

	public void setStatisticsinfo(String statisticsinfo) {
		this.statisticsinfo = statisticsinfo;
	}

	public String getSupportemail() {
		return this.supportemail;
	}

	public void setSupportemail(String supportemail) {
		this.supportemail = supportemail;
	}

	public String getSystemstatus() {
		return this.systemstatus;
	}

	public void setSystemstatus(String systemstatus) {
		this.systemstatus = systemstatus;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}