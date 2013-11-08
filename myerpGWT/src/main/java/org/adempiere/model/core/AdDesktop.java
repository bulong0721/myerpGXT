package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_desktop database table.
 * 
 */
@Entity
@Table(name="ad_desktop")
@NamedQuery(name="AdDesktop.findAll", query="SELECT a FROM AdDesktop a")
public class AdDesktop extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adDesktopId;
	private BigDecimal adClientId;
	private BigDecimal adColorId;
	private BigDecimal adImageId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdDesktop() {
	}


	@Id
	@Column(name="AD_DESKTOP_ID")
	public long getAdDesktopId() {
		return this.adDesktopId;
	}

	public void setAdDesktopId(long adDesktopId) {
		this.adDesktopId = adDesktopId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLOR_ID")
	public BigDecimal getAdColorId() {
		return this.adColorId;
	}

	public void setAdColorId(BigDecimal adColorId) {
		this.adColorId = adColorId;
	}


	@Column(name="AD_IMAGE_ID")
	public BigDecimal getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(BigDecimal adImageId) {
		this.adImageId = adImageId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
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