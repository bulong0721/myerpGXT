package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_userdef_tab")
public class AdUserdefTab extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adTabId;
	private Integer adUserdefTabId;
	private Integer adUserdefWinId;
	private String created;
	private Integer createdby;
	private String description;
	private String help;
	private String isactive;
	private String ismultirowonly;
	private String isreadonly;
	private String issinglerow;
	private String name;
	private String updated;
	private Integer updatedby;

	public AdUserdefTab() {
	}

	public AdUserdefTab(Integer adUserdefTabId) {
		this.adUserdefTabId = adUserdefTabId;
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
	@Column(name="AD_TAB_ID", nullable=false)
	public Integer getAdTabId() {
		return adTabId;
	}

	public void setAdTabId(Integer adTabId) {
		this.adTabId = adTabId;
	}

	@Id
	@Column(name="AD_USERDEF_TAB_ID")
	public Integer getAdUserdefTabId() {
		return adUserdefTabId;
	}

	public void setAdUserdefTabId(Integer adUserdefTabId) {
		this.adUserdefTabId = adUserdefTabId;
	}

	@Basic
	@Column(name="AD_USERDEF_WIN_ID", nullable=false)
	public Integer getAdUserdefWinId() {
		return adUserdefWinId;
	}

	public void setAdUserdefWinId(Integer adUserdefWinId) {
		this.adUserdefWinId = adUserdefWinId;
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
	@Column(length=2000)
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
	public String getIsmultirowonly() {
		return ismultirowonly;
	}

	public void setIsmultirowonly(String ismultirowonly) {
		this.ismultirowonly = ismultirowonly;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsreadonly() {
		return isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIssinglerow() {
		return issinglerow;
	}

	public void setIssinglerow(String issinglerow) {
		this.issinglerow = issinglerow;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}