package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_system")
@IdClass(org.adempiere.model.ADSystemPK.class)
public class ADSystem extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDSystemID;
	private Boolean active;
	private Boolean allowStatistics;
	private Boolean autoErrorReport;
	private String created;
	private Integer createdBy;
	private String customPrefix;
	private String dBAddress;
	private String dBInstance;
	private String description;
	private String encryptionKey;
	private Boolean failOnBuildDiffer;
	private Boolean failOnMissingModelValidator;
	private BigDecimal iDRangeEnd;
	private BigDecimal iDRangeStart;
	private String info;
	private Boolean justMigrated;
	private String lDAPDomain;
	private String lDAPHost;
	private String lastBuildInfo;
	private String name;
	private Integer noProcessors;
	private String oldName;
	private String password;
	private Boolean processing;
	private String profileInfo;
	private Integer recordID;
	private String releaseNo;
	private String replicationType;
	private String statisticsInfo;
	private String summary;
	private String supportEMail;
	private String supportExpDate;
	private Integer supportUnits;
	private String systemStatus;
	private String updated;
	private Integer updatedBy;
	private String userName;
	private String version;

	public ADSystem() {
	}

	public ADSystem(Integer aDClientID, Integer aDSystemID) {
		this.aDClientID = aDClientID;
		this.aDSystemID = aDSystemID;
	}

	@Id
	@Column(name="AD_CLIENT_ID", columnDefinition="INT")
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

	@Id
	@Column(name="AD_SYSTEM_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_627", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_System", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_627")
	public Integer getADSystemID() {
		return aDSystemID;
	}

	public void setADSystemID(Integer aDSystemID) {
		this.aDSystemID = aDSystemID;
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
	@Column(name="ISALLOWSTATISTICS", nullable=false)
	public Boolean isAllowStatistics() {
		return allowStatistics;
	}

	public void setAllowStatistics(Boolean allowStatistics) {
		this.allowStatistics = allowStatistics;
	}

	@Basic
	@Column(name="ISAUTOERRORREPORT", nullable=false)
	public Boolean isAutoErrorReport() {
		return autoErrorReport;
	}

	public void setAutoErrorReport(Boolean autoErrorReport) {
		this.autoErrorReport = autoErrorReport;
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
	@Column(length=60)
	public String getCustomPrefix() {
		return customPrefix;
	}

	public void setCustomPrefix(String customPrefix) {
		this.customPrefix = customPrefix;
	}

	@Basic
	public String getDBAddress() {
		return dBAddress;
	}

	public void setDBAddress(String dBAddress) {
		this.dBAddress = dBAddress;
	}

	@Basic
	@Column(length=60)
	public String getDBInstance() {
		return dBInstance;
	}

	public void setDBInstance(String dBInstance) {
		this.dBInstance = dBInstance;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	@Basic
	@Column(name="ISFAILONBUILDDIFFER", nullable=false)
	public Boolean isFailOnBuildDiffer() {
		return failOnBuildDiffer;
	}

	public void setFailOnBuildDiffer(Boolean failOnBuildDiffer) {
		this.failOnBuildDiffer = failOnBuildDiffer;
	}

	@Basic
	@Column(name="ISFAILONMISSINGMODELVALIDATOR", nullable=false)
	public Boolean isFailOnMissingModelValidator() {
		return failOnMissingModelValidator;
	}

	public void setFailOnMissingModelValidator(Boolean failOnMissingModelValidator) {
		this.failOnMissingModelValidator = failOnMissingModelValidator;
	}

	@Basic
	public BigDecimal getIDRangeEnd() {
		return iDRangeEnd;
	}

	public void setIDRangeEnd(BigDecimal iDRangeEnd) {
		this.iDRangeEnd = iDRangeEnd;
	}

	@Basic
	public BigDecimal getIDRangeStart() {
		return iDRangeStart;
	}

	public void setIDRangeStart(BigDecimal iDRangeStart) {
		this.iDRangeStart = iDRangeStart;
	}

	@Basic
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Basic
	@Column(name="ISJUSTMIGRATED")
	public Boolean isJustMigrated() {
		return justMigrated;
	}

	public void setJustMigrated(Boolean justMigrated) {
		this.justMigrated = justMigrated;
	}

	@Basic
	public String getLDAPDomain() {
		return lDAPDomain;
	}

	public void setLDAPDomain(String lDAPDomain) {
		this.lDAPDomain = lDAPDomain;
	}

	@Basic
	@Column(length=60)
	public String getLDAPHost() {
		return lDAPHost;
	}

	public void setLDAPHost(String lDAPHost) {
		this.lDAPHost = lDAPHost;
	}

	@Basic
	public String getLastBuildInfo() {
		return lastBuildInfo;
	}

	public void setLastBuildInfo(String lastBuildInfo) {
		this.lastBuildInfo = lastBuildInfo;
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
	@Column(columnDefinition="INT")
	public Integer getNoProcessors() {
		return noProcessors;
	}

	public void setNoProcessors(Integer noProcessors) {
		this.noProcessors = noProcessors;
	}

	@Basic
	@Column(length=60)
	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	@Basic
	@Column(length=20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=60)
	public String getProfileInfo() {
		return profileInfo;
	}

	public void setProfileInfo(String profileInfo) {
		this.profileInfo = profileInfo;
	}

	@Basic
	@Column(name="RECORD_ID", columnDefinition="INT")
	public Integer getRecordID() {
		return recordID;
	}

	public void setRecordID(Integer recordID) {
		this.recordID = recordID;
	}

	@Basic
	@Column(length=10)
	public String getReleaseNo() {
		return releaseNo;
	}

	public void setReleaseNo(String releaseNo) {
		this.releaseNo = releaseNo;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getReplicationType() {
		return replicationType;
	}

	public void setReplicationType(String replicationType) {
		this.replicationType = replicationType;
	}

	@Basic
	@Column(length=60)
	public String getStatisticsInfo() {
		return statisticsInfo;
	}

	public void setStatisticsInfo(String statisticsInfo) {
		this.statisticsInfo = statisticsInfo;
	}

	@Basic
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Basic
	@Column(length=60)
	public String getSupportEMail() {
		return supportEMail;
	}

	public void setSupportEMail(String supportEMail) {
		this.supportEMail = supportEMail;
	}

	@Basic
	public String getSupportExpDate() {
		return supportExpDate;
	}

	public void setSupportExpDate(String supportExpDate) {
		this.supportExpDate = supportExpDate;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSupportUnits() {
		return supportUnits;
	}

	public void setSupportUnits(Integer supportUnits) {
		this.supportUnits = supportUnits;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(String systemStatus) {
		this.systemStatus = systemStatus;
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
	@Column(nullable=false, length=60)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Basic
	@Column(length=20)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}