package com.deppon.foss.shared.adempiere;

import java.io.Serializable;
import javax.persistence.*;

import com.deppon.foss.shared.AdEntityBase;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_window database table.
 * 
 */
@Entity
@Table(name="ad_window")
public class AdWindow extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adWindowId;
	private BigDecimal adClientId;
	private BigDecimal adColorId;
	private BigDecimal adImageId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String entitytype;
	private String help;
	private String isactive;
	private String isbetafunctionality;
	private String isdefault;
	private String issotrx;
	private String name;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String windowtype;
	private BigDecimal winheight;
	private BigDecimal winwidth;

	public AdWindow() {
	}


	@Id
	@Column(name="AD_WINDOW_ID")
	public long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(long adWindowId) {
		this.adWindowId = adWindowId;
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


	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
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


	public String getIsbetafunctionality() {
		return this.isbetafunctionality;
	}

	public void setIsbetafunctionality(String isbetafunctionality) {
		this.isbetafunctionality = isbetafunctionality;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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


	public String getWindowtype() {
		return this.windowtype;
	}

	public void setWindowtype(String windowtype) {
		this.windowtype = windowtype;
	}


	public BigDecimal getWinheight() {
		return this.winheight;
	}

	public void setWinheight(BigDecimal winheight) {
		this.winheight = winheight;
	}


	public BigDecimal getWinwidth() {
		return this.winwidth;
	}

	public void setWinwidth(BigDecimal winwidth) {
		this.winwidth = winwidth;
	}

}