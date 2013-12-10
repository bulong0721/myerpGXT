package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ad_registration database table.
 * 
 */
@Entity
@Table(name="ad_registration")
@NamedQuery(name="AdRegistration.findAll", query="SELECT a FROM AdRegistration a")
public class AdRegistration extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private AdRegistrationPK id;
	private BigDecimal adOrgId;
	private BigDecimal cCurrencyId;
	private BigDecimal cLocationId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String industryinfo;
	private String isactive;
	private String isallowpublish;
	private String isallowstatistics;
	private String isinproduction;
	private String isregistered;
	private BigDecimal numberemployees;
	private String platforminfo;
	private String processing;
	private BigDecimal recordId;
	private String remoteAddr;
	private String remoteHost;
	private BigDecimal salesvolume;
	private Date startproductiondate;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdRegistration() {
	}


	@EmbeddedId
	public AdRegistrationPK getId() {
		return this.id;
	}

	public void setId(AdRegistrationPK id) {
		this.id = id;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_LOCATION_ID")
	public BigDecimal getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(BigDecimal cLocationId) {
		this.cLocationId = cLocationId;
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


	public String getIndustryinfo() {
		return this.industryinfo;
	}

	public void setIndustryinfo(String industryinfo) {
		this.industryinfo = industryinfo;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsallowpublish() {
		return this.isallowpublish;
	}

	public void setIsallowpublish(String isallowpublish) {
		this.isallowpublish = isallowpublish;
	}


	public String getIsallowstatistics() {
		return this.isallowstatistics;
	}

	public void setIsallowstatistics(String isallowstatistics) {
		this.isallowstatistics = isallowstatistics;
	}


	public String getIsinproduction() {
		return this.isinproduction;
	}

	public void setIsinproduction(String isinproduction) {
		this.isinproduction = isinproduction;
	}


	public String getIsregistered() {
		return this.isregistered;
	}

	public void setIsregistered(String isregistered) {
		this.isregistered = isregistered;
	}


	public BigDecimal getNumberemployees() {
		return this.numberemployees;
	}

	public void setNumberemployees(BigDecimal numberemployees) {
		this.numberemployees = numberemployees;
	}


	public String getPlatforminfo() {
		return this.platforminfo;
	}

	public void setPlatforminfo(String platforminfo) {
		this.platforminfo = platforminfo;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="RECORD_ID")
	public BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
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


	public BigDecimal getSalesvolume() {
		return this.salesvolume;
	}

	public void setSalesvolume(BigDecimal salesvolume) {
		this.salesvolume = salesvolume;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartproductiondate() {
		return this.startproductiondate;
	}

	public void setStartproductiondate(Date startproductiondate) {
		this.startproductiondate = startproductiondate;
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

}