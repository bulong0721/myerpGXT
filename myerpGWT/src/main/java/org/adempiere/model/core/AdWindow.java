package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.AdEntityBase;


/**
 * The persistent class for the ad_window database table.
 * 
 */
@Entity
@Table(name="ad_window")
public class AdWindow extends AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adWindowId;
	private Long adClientId;
	private Long adColorId;
	private Long adImageId;
	private Long adOrgId;
	private String created;
	private Long createdby;
	private String description;
	private String entitytype;
	private String help;
	private String isactive;
	private String isbetafunctionality;
	private String isdefault;
	private String issotrx;
	private String name;
	private String processing;
	private String updated;
	private Long updatedby;
	private String windowtype;
	private Integer winheight;
	private Integer winwidth;

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
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLOR_ID")
	public Long getAdColorId() {
		return this.adColorId;
	}

	public void setAdColorId(Long adColorId) {
		this.adColorId = adColorId;
	}


	@Column(name="AD_IMAGE_ID")
	public Long getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(Long adImageId) {
		this.adImageId = adImageId;
	}


	@Column(name="AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}


	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}


	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
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


	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}


	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}


	public String getWindowtype() {
		return this.windowtype;
	}

	public void setWindowtype(String windowtype) {
		this.windowtype = windowtype;
	}


	public Integer getWinheight() {
		return this.winheight;
	}

	public void setWinheight(Integer winheight) {
		this.winheight = winheight;
	}


	public Integer getWinwidth() {
		return this.winwidth;
	}

	public void setWinwidth(Integer winwidth) {
		this.winwidth = winwidth;
	}

}