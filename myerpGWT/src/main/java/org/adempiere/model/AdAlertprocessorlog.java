package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_alertprocessorlog")
@IdClass(org.adempiere.model.AdAlertprocessorlogPK.class)
public class AdAlertprocessorlog extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adAlertprocessorId;
	private Integer adAlertprocessorlogId;
	private Integer adClientId;
	private Integer adOrgId;
	private byte[] binarydata;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String iserror;
	private String reference;
	private String summary;
	private String textmsg;
	private String updated;
	private Integer updatedby;

	public AdAlertprocessorlog() {
	}

	public AdAlertprocessorlog(Integer adAlertprocessorId, Integer adAlertprocessorlogId) {
		this.adAlertprocessorId = adAlertprocessorId;
		this.adAlertprocessorlogId = adAlertprocessorlogId;
	}

	@Id
	@Column(name="AD_ALERTPROCESSOR_ID")
	public Integer getAdAlertprocessorId() {
		return adAlertprocessorId;
	}

	public void setAdAlertprocessorId(Integer adAlertprocessorId) {
		this.adAlertprocessorId = adAlertprocessorId;
	}

	@Id
	@Column(name="AD_ALERTPROCESSORLOG_ID")
	public Integer getAdAlertprocessorlogId() {
		return adAlertprocessorlogId;
	}

	public void setAdAlertprocessorlogId(Integer adAlertprocessorlogId) {
		this.adAlertprocessorlogId = adAlertprocessorlogId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(columnDefinition="LONGBLOB")
	public byte[] getBinarydata() {
		return binarydata;
	}

	public void setBinarydata(byte[] binarydata) {
		this.binarydata = binarydata;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIserror() {
		return iserror;
	}

	public void setIserror(String iserror) {
		this.iserror = iserror;
	}

	@Basic
	@Column(length=60)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Basic
	@Column(length=2000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Basic
	@Column(length=2000)
	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}