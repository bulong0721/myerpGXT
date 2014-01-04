package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_newsitem")
public class CmNewsitem extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String author;
	private Integer cmNewschannelId;
	private Integer cmNewsitemId;
	private String contenthtml;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String linkurl;
	private String pubdate;
	private String title;
	private String updated;
	private Integer updatedby;

	public CmNewsitem() {
	}

	public CmNewsitem(Integer cmNewsitemId) {
		this.cmNewsitemId = cmNewsitemId;
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
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Basic
	@Column(name="CM_NEWSCHANNEL_ID", nullable=false)
	public Integer getCmNewschannelId() {
		return cmNewschannelId;
	}

	public void setCmNewschannelId(Integer cmNewschannelId) {
		this.cmNewschannelId = cmNewschannelId;
	}

	@Id
	@Column(name="CM_NEWSITEM_ID")
	public Integer getCmNewsitemId() {
		return cmNewsitemId;
	}

	public void setCmNewsitemId(Integer cmNewsitemId) {
		this.cmNewsitemId = cmNewsitemId;
	}

	@Basic
	@Column(columnDefinition="LONGTEXT")
	public String getContenthtml() {
		return contenthtml;
	}

	public void setContenthtml(String contenthtml) {
		this.contenthtml = contenthtml;
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
	@Column(length=120)
	public String getLinkurl() {
		return linkurl;
	}

	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}

	@Basic
	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	@Basic
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