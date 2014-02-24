package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_issue")
public class AdIssue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetId;
	private Integer adClientId;
	private Integer adFormId;
	private Integer adIssueId;
	private Integer adOrgId;
	private Integer adProcessId;
	private Integer adWindowId;
	private String comments;
	private String created;
	private Integer createdby;
	private String databaseinfo;
	private String dbaddress;
	private String errortrace;
	private Boolean isactive;
	private String isreproducible;
	private String issuesource;
	private String issuesummary;
	private String isvanillasystem;
	private String javainfo;
	private Integer lineno;
	private String localHost;
	private String loggername;
	private String name;
	private String operatingsysteminfo;
	private Boolean processed;
	private Boolean processing;
	private String profileinfo;
	private Integer rIssueknownId;
	private Integer rIssueprojectId;
	private Integer rIssuesystemId;
	private Integer rIssueuserId;
	private Integer rRequestId;
	private Integer recordId;
	private String releaseno;
	private String releasetag;
	private String remoteAddr;
	private String remoteHost;
	private String requestdocumentno;
	private String responsetext;
	private String sourceclassname;
	private String sourcemethodname;
	private String stacktrace;
	private String statisticsinfo;
	private String supportemail;
	private String systemstatus;
	private String updated;
	private Integer updatedby;
	private String username;
	private String version;

	public AdIssue() {
	}

	public AdIssue(Integer adIssueId) {
		this.adIssueId = adIssueId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
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
	@Column(name="AD_FORM_ID", columnDefinition="INT")
	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	@Id
	@Column(name="AD_ISSUE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1191", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_Issue", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1191")
	public Integer getAdIssueId() {
		return adIssueId;
	}

	public void setAdIssueId(Integer adIssueId) {
		this.adIssueId = adIssueId;
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
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT")
	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	@Basic
	@Column(length=2000)
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
	public String getDatabaseinfo() {
		return databaseinfo;
	}

	public void setDatabaseinfo(String databaseinfo) {
		this.databaseinfo = databaseinfo;
	}

	@Basic
	public String getDbaddress() {
		return dbaddress;
	}

	public void setDbaddress(String dbaddress) {
		this.dbaddress = dbaddress;
	}

	@Basic
	@Column(length=2000)
	public String getErrortrace() {
		return errortrace;
	}

	public void setErrortrace(String errortrace) {
		this.errortrace = errortrace;
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
	@Column(length=1)
	public String getIsreproducible() {
		return isreproducible;
	}

	public void setIsreproducible(String isreproducible) {
		this.isreproducible = isreproducible;
	}

	@Basic
	@Column(length=1)
	public String getIssuesource() {
		return issuesource;
	}

	public void setIssuesource(String issuesource) {
		this.issuesource = issuesource;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getIssuesummary() {
		return issuesummary;
	}

	public void setIssuesummary(String issuesummary) {
		this.issuesummary = issuesummary;
	}

	@Basic
	@Column(length=1)
	public String getIsvanillasystem() {
		return isvanillasystem;
	}

	public void setIsvanillasystem(String isvanillasystem) {
		this.isvanillasystem = isvanillasystem;
	}

	@Basic
	public String getJavainfo() {
		return javainfo;
	}

	public void setJavainfo(String javainfo) {
		this.javainfo = javainfo;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLineno() {
		return lineno;
	}

	public void setLineno(Integer lineno) {
		this.lineno = lineno;
	}

	@Basic
	@Column(name="LOCAL_HOST", length=120)
	public String getLocalHost() {
		return localHost;
	}

	public void setLocalHost(String localHost) {
		this.localHost = localHost;
	}

	@Basic
	@Column(length=60)
	public String getLoggername() {
		return loggername;
	}

	public void setLoggername(String loggername) {
		this.loggername = loggername;
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
	public String getOperatingsysteminfo() {
		return operatingsysteminfo;
	}

	public void setOperatingsysteminfo(String operatingsysteminfo) {
		this.operatingsysteminfo = operatingsysteminfo;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	public String getProfileinfo() {
		return profileinfo;
	}

	public void setProfileinfo(String profileinfo) {
		this.profileinfo = profileinfo;
	}

	@Basic
	@Column(name="R_ISSUEKNOWN_ID", columnDefinition="INT")
	public Integer getRIssueknownId() {
		return rIssueknownId;
	}

	public void setRIssueknownId(Integer rIssueknownId) {
		this.rIssueknownId = rIssueknownId;
	}

	@Basic
	@Column(name="R_ISSUEPROJECT_ID", columnDefinition="INT")
	public Integer getRIssueprojectId() {
		return rIssueprojectId;
	}

	public void setRIssueprojectId(Integer rIssueprojectId) {
		this.rIssueprojectId = rIssueprojectId;
	}

	@Basic
	@Column(name="R_ISSUESYSTEM_ID", columnDefinition="INT")
	public Integer getRIssuesystemId() {
		return rIssuesystemId;
	}

	public void setRIssuesystemId(Integer rIssuesystemId) {
		this.rIssuesystemId = rIssuesystemId;
	}

	@Basic
	@Column(name="R_ISSUEUSER_ID", columnDefinition="INT")
	public Integer getRIssueuserId() {
		return rIssueuserId;
	}

	public void setRIssueuserId(Integer rIssueuserId) {
		this.rIssueuserId = rIssueuserId;
	}

	@Basic
	@Column(name="R_REQUEST_ID", columnDefinition="INT")
	public Integer getRRequestId() {
		return rRequestId;
	}

	public void setRRequestId(Integer rRequestId) {
		this.rRequestId = rRequestId;
	}

	@Basic
	@Column(name="RECORD_ID", columnDefinition="INT")
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Basic
	@Column(nullable=false, length=4)
	public String getReleaseno() {
		return releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}

	@Basic
	@Column(length=60)
	public String getReleasetag() {
		return releasetag;
	}

	public void setReleasetag(String releasetag) {
		this.releasetag = releasetag;
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
	@Column(length=30)
	public String getRequestdocumentno() {
		return requestdocumentno;
	}

	public void setRequestdocumentno(String requestdocumentno) {
		this.requestdocumentno = requestdocumentno;
	}

	@Basic
	@Column(length=2000)
	public String getResponsetext() {
		return responsetext;
	}

	public void setResponsetext(String responsetext) {
		this.responsetext = responsetext;
	}

	@Basic
	@Column(length=60)
	public String getSourceclassname() {
		return sourceclassname;
	}

	public void setSourceclassname(String sourceclassname) {
		this.sourceclassname = sourceclassname;
	}

	@Basic
	@Column(length=60)
	public String getSourcemethodname() {
		return sourcemethodname;
	}

	public void setSourcemethodname(String sourcemethodname) {
		this.sourcemethodname = sourcemethodname;
	}

	@Basic
	@Column(length=2000)
	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}

	@Basic
	public String getStatisticsinfo() {
		return statisticsinfo;
	}

	public void setStatisticsinfo(String statisticsinfo) {
		this.statisticsinfo = statisticsinfo;
	}

	@Basic
	@Column(length=60)
	public String getSupportemail() {
		return supportemail;
	}

	public void setSupportemail(String supportemail) {
		this.supportemail = supportemail;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getSystemstatus() {
		return systemstatus;
	}

	public void setSystemstatus(String systemstatus) {
		this.systemstatus = systemstatus;
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
	@Column(nullable=false, length=60)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}