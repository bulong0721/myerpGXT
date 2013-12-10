package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.ADEntityBase;

/**
 * The persistent class for the AD_CLIENT database table.
 * 
 */
@Entity
@Table(name = "AD_CLIENT")
public class AdClient extends ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adClientId;
	private String				adLanguage;
	private Long				adOrgId;
	private Long				adReplicationstrategyId;
	private String				autoarchive;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				documentdir;
	private String				emailtest;
	private String				isactive;
	private String				iscostimmediate;
	private String				ismultilingualdocument;
	private String				ispostimmediate;
	private String				isserveremail;
	private String				issmtpauthorization;
	private String				isuseasp;
	private String				isusebetafunctions;
	private String				ldapquery;
	private String				mmpolicy;
	private String				modelvalidationclasses;
	private String				name;
	private String				requestemail;
	private String				requestfolder;
	private String				requestuser;
	private String				requestuserpw;
	private String				smtphost;
	private String				storearchiveonfilesystem;
	private String				storeattachmentsonfilesystem;
	private String				unixarchivepath;
	private String				unixattachmentpath;
	private String				updated;
	private Long				updatedby;
	private String				value;
	private String				windowsarchivepath;
	private String				windowsattachmentpath;

	public AdClient() {
	}

	@Id
	@Column(name = "AD_CLIENT_ID")
	public long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_LANGUAGE")
	public String getAdLanguage() {
		return this.adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name = "AD_REPLICATIONSTRATEGY_ID")
	public Long getAdReplicationstrategyId() {
		return this.adReplicationstrategyId;
	}

	public void setAdReplicationstrategyId(Long adReplicationstrategyId) {
		this.adReplicationstrategyId = adReplicationstrategyId;
	}

	public String getAutoarchive() {
		return this.autoarchive;
	}

	public void setAutoarchive(String autoarchive) {
		this.autoarchive = autoarchive;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentdir() {
		return this.documentdir;
	}

	public void setDocumentdir(String documentdir) {
		this.documentdir = documentdir;
	}

	public String getEmailtest() {
		return this.emailtest;
	}

	public void setEmailtest(String emailtest) {
		this.emailtest = emailtest;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIscostimmediate() {
		return this.iscostimmediate;
	}

	public void setIscostimmediate(String iscostimmediate) {
		this.iscostimmediate = iscostimmediate;
	}

	public String getIsmultilingualdocument() {
		return this.ismultilingualdocument;
	}

	public void setIsmultilingualdocument(String ismultilingualdocument) {
		this.ismultilingualdocument = ismultilingualdocument;
	}

	public String getIspostimmediate() {
		return this.ispostimmediate;
	}

	public void setIspostimmediate(String ispostimmediate) {
		this.ispostimmediate = ispostimmediate;
	}

	public String getIsserveremail() {
		return this.isserveremail;
	}

	public void setIsserveremail(String isserveremail) {
		this.isserveremail = isserveremail;
	}

	public String getIssmtpauthorization() {
		return this.issmtpauthorization;
	}

	public void setIssmtpauthorization(String issmtpauthorization) {
		this.issmtpauthorization = issmtpauthorization;
	}

	public String getIsuseasp() {
		return this.isuseasp;
	}

	public void setIsuseasp(String isuseasp) {
		this.isuseasp = isuseasp;
	}

	public String getIsusebetafunctions() {
		return this.isusebetafunctions;
	}

	public void setIsusebetafunctions(String isusebetafunctions) {
		this.isusebetafunctions = isusebetafunctions;
	}

	public String getLdapquery() {
		return this.ldapquery;
	}

	public void setLdapquery(String ldapquery) {
		this.ldapquery = ldapquery;
	}

	public String getMmpolicy() {
		return this.mmpolicy;
	}

	public void setMmpolicy(String mmpolicy) {
		this.mmpolicy = mmpolicy;
	}

	public String getModelvalidationclasses() {
		return this.modelvalidationclasses;
	}

	public void setModelvalidationclasses(String modelvalidationclasses) {
		this.modelvalidationclasses = modelvalidationclasses;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestemail() {
		return this.requestemail;
	}

	public void setRequestemail(String requestemail) {
		this.requestemail = requestemail;
	}

	public String getRequestfolder() {
		return this.requestfolder;
	}

	public void setRequestfolder(String requestfolder) {
		this.requestfolder = requestfolder;
	}

	public String getRequestuser() {
		return this.requestuser;
	}

	public void setRequestuser(String requestuser) {
		this.requestuser = requestuser;
	}

	public String getRequestuserpw() {
		return this.requestuserpw;
	}

	public void setRequestuserpw(String requestuserpw) {
		this.requestuserpw = requestuserpw;
	}

	public String getSmtphost() {
		return this.smtphost;
	}

	public void setSmtphost(String smtphost) {
		this.smtphost = smtphost;
	}

	public String getStorearchiveonfilesystem() {
		return this.storearchiveonfilesystem;
	}

	public void setStorearchiveonfilesystem(String storearchiveonfilesystem) {
		this.storearchiveonfilesystem = storearchiveonfilesystem;
	}

	public String getStoreattachmentsonfilesystem() {
		return this.storeattachmentsonfilesystem;
	}

	public void setStoreattachmentsonfilesystem(String storeattachmentsonfilesystem) {
		this.storeattachmentsonfilesystem = storeattachmentsonfilesystem;
	}

	public String getUnixarchivepath() {
		return this.unixarchivepath;
	}

	public void setUnixarchivepath(String unixarchivepath) {
		this.unixarchivepath = unixarchivepath;
	}

	public String getUnixattachmentpath() {
		return this.unixattachmentpath;
	}

	public void setUnixattachmentpath(String unixattachmentpath) {
		this.unixattachmentpath = unixattachmentpath;
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

	@Column(name = "VALUE")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWindowsarchivepath() {
		return this.windowsarchivepath;
	}

	public void setWindowsarchivepath(String windowsarchivepath) {
		this.windowsarchivepath = windowsarchivepath;
	}

	public String getWindowsattachmentpath() {
		return this.windowsattachmentpath;
	}

	public void setWindowsattachmentpath(String windowsattachmentpath) {
		this.windowsattachmentpath = windowsattachmentpath;
	}

}