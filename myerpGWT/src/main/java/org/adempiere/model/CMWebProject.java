package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_webproject")
public class CMWebProject extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTreeCMCID;
	private Integer aDTreeCMMID;
	private Integer aDTreeCMSID;
	private Integer aDTreeCMTID;
	private Boolean active;
	private Integer cMWebProjectID;
	private String created;
	private Integer createdBy;
	private String description;
	private String help;
	private String metaAuthor;
	private String metaContent;
	private String metaCopyright;
	private String metaPublisher;
	private String metaRobotsTag;
	private String name;
	private String updated;
	private Integer updatedBy;

	public CMWebProject() {
	}

	public CMWebProject(Integer cMWebProjectID) {
		this.cMWebProjectID = cMWebProjectID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="AD_TREECMC_ID", columnDefinition="INT", nullable=false)
	public Integer getADTreeCMCID() {
		return aDTreeCMCID;
	}

	public void setADTreeCMCID(Integer aDTreeCMCID) {
		this.aDTreeCMCID = aDTreeCMCID;
	}

	@Basic
	@Column(name="AD_TREECMM_ID", columnDefinition="INT", nullable=false)
	public Integer getADTreeCMMID() {
		return aDTreeCMMID;
	}

	public void setADTreeCMMID(Integer aDTreeCMMID) {
		this.aDTreeCMMID = aDTreeCMMID;
	}

	@Basic
	@Column(name="AD_TREECMS_ID", columnDefinition="INT", nullable=false)
	public Integer getADTreeCMSID() {
		return aDTreeCMSID;
	}

	public void setADTreeCMSID(Integer aDTreeCMSID) {
		this.aDTreeCMSID = aDTreeCMSID;
	}

	@Basic
	@Column(name="AD_TREECMT_ID", columnDefinition="INT", nullable=false)
	public Integer getADTreeCMTID() {
		return aDTreeCMTID;
	}

	public void setADTreeCMTID(Integer aDTreeCMTID) {
		this.aDTreeCMTID = aDTreeCMTID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Id
	@Column(name="CM_WEBPROJECT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1234", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "CM_WebProject", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1234")
	public Integer getCMWebProjectID() {
		return cMWebProjectID;
	}

	public void setCMWebProjectID(Integer cMWebProjectID) {
		this.cMWebProjectID = cMWebProjectID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="META_AUTHOR", nullable=false, length=2000)
	public String getMetaAuthor() {
		return metaAuthor;
	}

	public void setMetaAuthor(String metaAuthor) {
		this.metaAuthor = metaAuthor;
	}

	@Basic
	@Column(name="META_CONTENT", nullable=false, length=2000)
	public String getMetaContent() {
		return metaContent;
	}

	public void setMetaContent(String metaContent) {
		this.metaContent = metaContent;
	}

	@Basic
	@Column(name="META_COPYRIGHT", nullable=false, length=2000)
	public String getMetaCopyright() {
		return metaCopyright;
	}

	public void setMetaCopyright(String metaCopyright) {
		this.metaCopyright = metaCopyright;
	}

	@Basic
	@Column(name="META_PUBLISHER", nullable=false, length=2000)
	public String getMetaPublisher() {
		return metaPublisher;
	}

	public void setMetaPublisher(String metaPublisher) {
		this.metaPublisher = metaPublisher;
	}

	@Basic
	@Column(name="META_ROBOTSTAG", nullable=false, length=2000)
	public String getMetaRobotsTag() {
		return metaRobotsTag;
	}

	public void setMetaRobotsTag(String metaRobotsTag) {
		this.metaRobotsTag = metaRobotsTag;
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
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}