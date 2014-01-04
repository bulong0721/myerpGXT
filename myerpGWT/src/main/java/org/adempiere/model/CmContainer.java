package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_container")
public class CmContainer extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cmContainerId;
	private Integer cmContainerlinkId;
	private Integer cmTemplateId;
	private Integer cmWebprojectId;
	private String containerlinkurl;
	private String containertype;
	private String containerxml;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private String isactive;
	private String isindexed;
	private String issecure;
	private String issummary;
	private String isvalid;
	private String metaAuthor;
	private String metaContent;
	private String metaCopyright;
	private String metaDescription;
	private String metaKeywords;
	private String metaLanguage;
	private String metaPublisher;
	private String metaRobotstag;
	private String name;
	private String notice;
	private Integer priority;
	private String relativeurl;
	private String structurexml;
	private String title;
	private String updated;
	private Integer updatedby;

	public CmContainer() {
	}

	public CmContainer(Integer cmContainerId) {
		this.cmContainerId = cmContainerId;
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

	@Id
	@Column(name="CM_CONTAINER_ID")
	public Integer getCmContainerId() {
		return cmContainerId;
	}

	public void setCmContainerId(Integer cmContainerId) {
		this.cmContainerId = cmContainerId;
	}

	@Basic
	@Column(name="CM_CONTAINERLINK_ID")
	public Integer getCmContainerlinkId() {
		return cmContainerlinkId;
	}

	public void setCmContainerlinkId(Integer cmContainerlinkId) {
		this.cmContainerlinkId = cmContainerlinkId;
	}

	@Basic
	@Column(name="CM_TEMPLATE_ID")
	public Integer getCmTemplateId() {
		return cmTemplateId;
	}

	public void setCmTemplateId(Integer cmTemplateId) {
		this.cmTemplateId = cmTemplateId;
	}

	@Basic
	@Column(name="CM_WEBPROJECT_ID", nullable=false)
	public Integer getCmWebprojectId() {
		return cmWebprojectId;
	}

	public void setCmWebprojectId(Integer cmWebprojectId) {
		this.cmWebprojectId = cmWebprojectId;
	}

	@Basic
	@Column(length=60)
	public String getContainerlinkurl() {
		return containerlinkurl;
	}

	public void setContainerlinkurl(String containerlinkurl) {
		this.containerlinkurl = containerlinkurl;
	}

	@Basic
	@Column(length=1)
	public String getContainertype() {
		return containertype;
	}

	public void setContainertype(String containertype) {
		this.containertype = containertype;
	}

	@Basic
	public String getContainerxml() {
		return containerxml;
	}

	public void setContainerxml(String containerxml) {
		this.containerxml = containerxml;
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
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
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
	public String getIsindexed() {
		return isindexed;
	}

	public void setIsindexed(String isindexed) {
		this.isindexed = isindexed;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssecure() {
		return issecure;
	}

	public void setIssecure(String issecure) {
		this.issecure = issecure;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssummary() {
		return issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	@Basic
	@Column(name="META_AUTHOR")
	public String getMetaAuthor() {
		return metaAuthor;
	}

	public void setMetaAuthor(String metaAuthor) {
		this.metaAuthor = metaAuthor;
	}

	@Basic
	@Column(name="META_CONTENT")
	public String getMetaContent() {
		return metaContent;
	}

	public void setMetaContent(String metaContent) {
		this.metaContent = metaContent;
	}

	@Basic
	@Column(name="META_COPYRIGHT")
	public String getMetaCopyright() {
		return metaCopyright;
	}

	public void setMetaCopyright(String metaCopyright) {
		this.metaCopyright = metaCopyright;
	}

	@Basic
	@Column(name="META_DESCRIPTION")
	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	@Basic
	@Column(name="META_KEYWORDS")
	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Basic
	@Column(name="META_LANGUAGE", length=2)
	public String getMetaLanguage() {
		return metaLanguage;
	}

	public void setMetaLanguage(String metaLanguage) {
		this.metaLanguage = metaLanguage;
	}

	@Basic
	@Column(name="META_PUBLISHER")
	public String getMetaPublisher() {
		return metaPublisher;
	}

	public void setMetaPublisher(String metaPublisher) {
		this.metaPublisher = metaPublisher;
	}

	@Basic
	@Column(name="META_ROBOTSTAG")
	public String getMetaRobotstag() {
		return metaRobotstag;
	}

	public void setMetaRobotstag(String metaRobotstag) {
		this.metaRobotstag = metaRobotstag;
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
	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	@Basic
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Basic
	@Column(length=120)
	public String getRelativeurl() {
		return relativeurl;
	}

	public void setRelativeurl(String relativeurl) {
		this.relativeurl = relativeurl;
	}

	@Basic
	public String getStructurexml() {
		return structurexml;
	}

	public void setStructurexml(String structurexml) {
		this.structurexml = structurexml;
	}

	@Basic
	@Column(length=60)
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