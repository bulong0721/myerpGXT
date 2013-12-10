package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_language database table.
 * 
 */
@Entity
@Table(name="ad_language")
@NamedQuery(name="AdLanguage.findAll", query="SELECT a FROM AdLanguage a")
public class AdLanguage extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private String adLanguage;
	private BigDecimal adClientId;
	private BigDecimal adLanguageId;
	private BigDecimal adOrgId;
	private String countrycode;
	private Timestamp created;
	private BigDecimal createdby;
	private String datepattern;
	private String isactive;
	private String isbaselanguage;
	private String isdecimalpoint;
	private String issystemlanguage;
	private String languageiso;
	private String name;
	private String processing;
	private String timepattern;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdLanguage() {
	}


	@Id
	@Column(name="AD_LANGUAGE")
	public String getAdLanguage() {
		return this.adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_LANGUAGE_ID")
	public BigDecimal getAdLanguageId() {
		return this.adLanguageId;
	}

	public void setAdLanguageId(BigDecimal adLanguageId) {
		this.adLanguageId = adLanguageId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	public String getCountrycode() {
		return this.countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
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


	public String getDatepattern() {
		return this.datepattern;
	}

	public void setDatepattern(String datepattern) {
		this.datepattern = datepattern;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbaselanguage() {
		return this.isbaselanguage;
	}

	public void setIsbaselanguage(String isbaselanguage) {
		this.isbaselanguage = isbaselanguage;
	}


	public String getIsdecimalpoint() {
		return this.isdecimalpoint;
	}

	public void setIsdecimalpoint(String isdecimalpoint) {
		this.isdecimalpoint = isdecimalpoint;
	}


	public String getIssystemlanguage() {
		return this.issystemlanguage;
	}

	public void setIssystemlanguage(String issystemlanguage) {
		this.issystemlanguage = issystemlanguage;
	}


	public String getLanguageiso() {
		return this.languageiso;
	}

	public void setLanguageiso(String languageiso) {
		this.languageiso = languageiso;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	public String getTimepattern() {
		return this.timepattern;
	}

	public void setTimepattern(String timepattern) {
		this.timepattern = timepattern;
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