package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_attachment")
public class AdAttachment extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adAttachmentId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTableId;
	private byte[] binarydata;
	private String created;
	private Integer createdby;
	private String isactive;
	private Integer recordId;
	private String textmsg;
	private String title;
	private String updated;
	private Integer updatedby;

	public AdAttachment() {
	}

	public AdAttachment(Integer adAttachmentId) {
		this.adAttachmentId = adAttachmentId;
	}

	@Id
	@Column(name="AD_ATTACHMENT_ID")
	public Integer getAdAttachmentId() {
		return adAttachmentId;
	}

	public void setAdAttachmentId(Integer adAttachmentId) {
		this.adAttachmentId = adAttachmentId;
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
	@Column(name="AD_TABLE_ID", nullable=false)
	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="RECORD_ID", nullable=false)
	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
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
	@Column(nullable=false, length=60)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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