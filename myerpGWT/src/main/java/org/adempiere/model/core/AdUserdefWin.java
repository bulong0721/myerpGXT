package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_userdef_win database table.
 * 
 */
@Entity
@Table(name="ad_userdef_win")
@NamedQuery(name="AdUserdefWin.findAll", query="SELECT a FROM AdUserdefWin a")
public class AdUserdefWin extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserdefWinId;
	private BigDecimal adClientId;
	private String adLanguage;
	private BigDecimal adOrgId;
	private BigDecimal adRoleId;
	private BigDecimal adUserId;
	private BigDecimal adWindowId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String isdefault;
	private String isreadonly;
	private String isuserupdateable;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserdefWin() {
	}


	@Id
	@Column(name="AD_USERDEF_WIN_ID")
	public long getAdUserdefWinId() {
		return this.adUserdefWinId;
	}

	public void setAdUserdefWinId(long adUserdefWinId) {
		this.adUserdefWinId = adUserdefWinId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_LANGUAGE")
	public String getAdLanguage() {
		return this.adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_ROLE_ID")
	public BigDecimal getAdRoleId() {
		return this.adRoleId;
	}

	public void setAdRoleId(BigDecimal adRoleId) {
		this.adRoleId = adRoleId;
	}


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="AD_WINDOW_ID")
	public BigDecimal getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(BigDecimal adWindowId) {
		this.adWindowId = adWindowId;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}


	public String getIsuserupdateable() {
		return this.isuserupdateable;
	}

	public void setIsuserupdateable(String isuserupdateable) {
		this.isuserupdateable = isuserupdateable;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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