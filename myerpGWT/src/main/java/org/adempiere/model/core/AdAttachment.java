package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_attachment database table.
 * 
 */
@Entity
@Table(name="ad_attachment")
public class AdAttachment extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adAttachmentId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTableId;
	private byte[] binarydata;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal recordId;
	private String textmsg;
	private String title;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdAttachment() {
	}


	@Id
	@Column(name="AD_ATTACHMENT_ID")
	public long getAdAttachmentId() {
		return this.adAttachmentId;
	}

	public void setAdAttachmentId(long adAttachmentId) {
		this.adAttachmentId = adAttachmentId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_TABLE_ID")
	public BigDecimal getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(BigDecimal adTableId) {
		this.adTableId = adTableId;
	}


	@Lob
	public byte[] getBinarydata() {
		return this.binarydata;
	}

	public void setBinarydata(byte[] binarydata) {
		this.binarydata = binarydata;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	@Column(name="RECORD_ID")
	public BigDecimal getRecordId() {
		return this.recordId;
	}

	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
	}


	public String getTextmsg() {
		return this.textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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