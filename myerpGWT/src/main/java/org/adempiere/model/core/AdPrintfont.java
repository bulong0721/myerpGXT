package org.adempiere.model.core;

import java.awt.Font;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.model.common.ADEntityBase;


/**
 * The persistent class for the ad_printfont database table.
 * 
 */
@Entity
@Table(name="ad_printfont")
public class AdPrintfont extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adPrintfontId;
	private Long adClientId;
	private Long adOrgId;
	private String code;
	private String created;
	private Long createdby;
	private String isactive;
	private String isdefault;
	private String name;
	private String updated;
	private Long updatedby;

	public AdPrintfont() {
	}


	@Id
	@Column(name="AD_PRINTFONT_ID")
	public long getAdPrintfontId() {
		return this.adPrintfontId;
	}

	public void setAdPrintfontId(long adPrintfontId) {
		this.adPrintfontId = adPrintfontId;
	}


	@Column(name="AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}


	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	public Font getFont() {
		// TODO Auto-generated method stub
		return null;
	}

}