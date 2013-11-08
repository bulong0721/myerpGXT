package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_userdef_tab database table.
 * 
 */
@Entity
@Table(name="ad_userdef_tab")
@NamedQuery(name="AdUserdefTab.findAll", query="SELECT a FROM AdUserdefTab a")
public class AdUserdefTab extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adUserdefTabId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTabId;
	private BigDecimal adUserdefWinId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String ismultirowonly;
	private String isreadonly;
	private String issinglerow;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdUserdefTab() {
	}


	@Id
	@Column(name="AD_USERDEF_TAB_ID")
	public long getAdUserdefTabId() {
		return this.adUserdefTabId;
	}

	public void setAdUserdefTabId(long adUserdefTabId) {
		this.adUserdefTabId = adUserdefTabId;
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


	@Column(name="AD_TAB_ID")
	public BigDecimal getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(BigDecimal adTabId) {
		this.adTabId = adTabId;
	}


	@Column(name="AD_USERDEF_WIN_ID")
	public BigDecimal getAdUserdefWinId() {
		return this.adUserdefWinId;
	}

	public void setAdUserdefWinId(BigDecimal adUserdefWinId) {
		this.adUserdefWinId = adUserdefWinId;
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


	public String getIsmultirowonly() {
		return this.ismultirowonly;
	}

	public void setIsmultirowonly(String ismultirowonly) {
		this.ismultirowonly = ismultirowonly;
	}


	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}


	public String getIssinglerow() {
		return this.issinglerow;
	}

	public void setIssinglerow(String issinglerow) {
		this.issinglerow = issinglerow;
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