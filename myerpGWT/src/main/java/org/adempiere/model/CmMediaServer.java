package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="cm_media_server")
public class CmMediaServer extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cmMediaServerId;
	private Integer cmWebprojectId;
	private String created;
	private Integer createdby;
	private String description;
	private String folder;
	private String help;
	private String ipAddress;
	private String isactive;
	private String ispassive;
	private String name;
	private String password;
	private String updated;
	private Integer updatedby;
	private String url;
	private String username;

	public CmMediaServer() {
	}

	public CmMediaServer(Integer cmMediaServerId) {
		this.cmMediaServerId = cmMediaServerId;
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
	@Column(name="CM_MEDIA_SERVER_ID")
	public Integer getCmMediaServerId() {
		return cmMediaServerId;
	}

	public void setCmMediaServerId(Integer cmMediaServerId) {
		this.cmMediaServerId = cmMediaServerId;
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
	@Column(length=60)
	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
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
	@Column(name="IP_ADDRESS", length=20)
	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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
	public String getIspassive() {
		return ispassive;
	}

	public void setIspassive(String ispassive) {
		this.ispassive = ispassive;
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
	@Column(length=40)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Basic
	@Column(length=120)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Basic
	@Column(length=40)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}