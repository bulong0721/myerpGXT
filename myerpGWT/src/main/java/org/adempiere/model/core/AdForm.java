package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.ADEntityBase;

/**
 * The persistent class for the ad_form database table.
 * 
 */
@Entity
@Table(name = "ad_form")
public class AdForm extends ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adFormId;
	private String				accesslevel;
	private Long				adClientId;
	private Long				adOrgId;
	private String				classname;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				entitytype;
	private String				help;
	private String				isactive;
	private String				isbetafunctionality;
	private String				jspurl;
	private String				name;
	private String				updated;
	private Long				updatedby;

	public AdForm() {
	}

	@Id
	@Column(name = "AD_FORM_ID")
	public long getAdFormId() {
		return this.adFormId;
	}

	public void setAdFormId(long adFormId) {
		this.adFormId = adFormId;
	}

	public String getAccesslevel() {
		return this.accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
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

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsbetafunctionality() {
		return this.isbetafunctionality;
	}

	public void setIsbetafunctionality(String isbetafunctionality) {
		this.isbetafunctionality = isbetafunctionality;
	}

	public String getJspurl() {
		return this.jspurl;
	}

	public void setJspurl(String jspurl) {
		this.jspurl = jspurl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}