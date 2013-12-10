package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ad_system database table.
 * 
 */
@Entity
@Table(name="ad_system")
@NamedQuery(name="AdSystem.findAll", query="SELECT a FROM AdSystem a")
public class AdSystem extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private AdSystemPK id;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String customprefix;
	private String dbaddress;
	private String dbinstance;
	private String description;
	private String encryptionkey;
	private BigDecimal idrangeend;
	private BigDecimal idrangestart;
	private String info;
	private String isactive;
	private String isallowstatistics;
	private String isautoerrorreport;
	private String isfailonbuilddiffer;
	private String isfailonmissingmodelvalidator;
	private String isjustmigrated;
	private String lastbuildinfo;
	private String ldapdomain;
	private String ldaphost;
	private String name;
	private BigDecimal noprocessors;
	private String oldname;
	private String password;
	private String processing;
	private String profileinfo;
	private BigDecimal recordId;
	private String releaseno;
	private String replicationtype;
	private String statisticsinfo;
	private String summary;
	private String supportemail;
	private Date supportexpdate;
	private BigDecimal supportunits;
	private String systemstatus;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String username;
	private String version;

	public AdSystem() {
	}


	@EmbeddedId
	public AdSystemPK getId() {
		return this.id;
	}

	public void setId(AdSystemPK id) {
		this.id = id;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
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


	public String getCustomprefix() {
		return this.customprefix;
	}

	public void setCustomprefix(String customprefix) {
		this.customprefix = customprefix;
	}


	public String getDbaddress() {
		return this.dbaddress;
	}

	public void setDbaddress(String dbaddress) {
		this.dbaddress = dbaddress;
	}


	public String getDbinstance() {
		return this.dbinstance;
	}

	public void setDbinstance(String dbinstance) {
		this.dbinstance = dbinstance;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getEncryptionkey() {
		return this.encryptionkey;
	}

	public void setEncryptionkey(String encryptionkey) {
		this.encryptionkey = encryptionkey;
	}


	public BigDecimal getIdrangeend() {
		return this.idrangeend;
	}

	public void setIdrangeend(BigDecimal idrangeend) {
		this.idrangeend = idrangeend;
	}


	public BigDecimal getIdrangestart() {
		return this.idrangestart;
	}

	public void setIdrangestart(BigDecimal idrangestart) {
		this.idrangestart = idrangestart;
	}


	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsallowstatistics() {
		return this.isallowstatistics;
	}

	public void setIsallowstatistics(String isallowstatistics) {
		this.isallowstatistics = isallowstatistics;
	}


	public String getIsautoerrorreport() {
		return this.isautoerrorreport;
	}

	public void setIsautoerrorreport(String isautoerrorreport) {
		this.isautoerrorreport = isautoerrorreport;
	}


	public String getIsfailonbuilddiffer() {
		return this.isfailonbuilddiffer;
	}

	public void setIsfailonbuilddiffer(String isfailonbuilddiffer) {
		this.isfailonbuilddiffer = isfailonbuilddiffer;
	}


	public String getIsfailonmissingmodelvalidator() {
		return this.isfailonmissingmodelvalidator;
	}

	public void setIsfailonmissingmodelvalidator(String isfailonmissingmodelvalidator) {
		this.isfailonmissingmodelvalidator = isfailonmissingmodelvalidator;
	}


	public String getIsjustmigrated() {
		return this.isjustmigrated;
	}

	public void setIsjustmigrated(String isjustmigrated) {
		this.isjustmigrated = isjustmigrated;
	}


	public String getLastbuildinfo() {
		return this.lastbuildinfo;
	}

	public void setLastbuildinfo(String lastbuildinfo) {
		this.lastbuildinfo = lastbuildinfo;
	}


	public String getLdapdomain() {
		return this.ldapdomain;
	}

	public void setLdapdomain(String ldapdomain) {
		this.ldapdomain = ldapdomain;
	}


	public String getLdaphost() {
		return this.ldaphost;
	}

	public void setLdaphost(String ldaphost) {
		this.ldaphost = ldaphost;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getNoprocessors() {
		return this.noprocessors;
	}

	public void setNoprocessors(BigDecimal noprocessors) {
		this.noprocessors = noprocessors;
	}


	public String getOldname() {
		return this.oldname;
	}

	public void setOldname(String oldname) {
		this.oldname = oldname;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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


	@Column(name="RECORD_ID")
	public BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
	}


	public String getReleaseno() {
		return this.releaseno;
	}

	public void setReleaseno(String releaseno) {
		this.releaseno = releaseno;
	}


	public String getReplicationtype() {
		return this.replicationtype;
	}

	public void setReplicationtype(String replicationtype) {
		this.replicationtype = replicationtype;
	}


	public String getStatisticsinfo() {
		return this.statisticsinfo;
	}

	public void setStatisticsinfo(String statisticsinfo) {
		this.statisticsinfo = statisticsinfo;
	}


	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getSupportemail() {
		return this.supportemail;
	}

	public void setSupportemail(String supportemail) {
		this.supportemail = supportemail;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getSupportexpdate() {
		return this.supportexpdate;
	}

	public void setSupportexpdate(Date supportexpdate) {
		this.supportexpdate = supportexpdate;
	}


	public BigDecimal getSupportunits() {
		return this.supportunits;
	}

	public void setSupportunits(BigDecimal supportunits) {
		this.supportunits = supportunits;
	}


	public String getSystemstatus() {
		return this.systemstatus;
	}

	public void setSystemstatus(String systemstatus) {
		this.systemstatus = systemstatus;
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