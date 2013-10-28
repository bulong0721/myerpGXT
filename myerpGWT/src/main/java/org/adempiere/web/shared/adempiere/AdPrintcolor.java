package org.adempiere.web.shared.adempiere;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the ad_printcolor database table.
 * 
 */
@Entity
@Table(name = "ad_printcolor")
public class AdPrintcolor extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adPrintcolorId;
	private Long				adClientId;
	private Long				adOrgId;
	private String				code;
	private String				created;
	private Long				createdby;
	private String				isactive;
	private String				isdefault;
	private String				name;
	private String				updated;
	private Long				updatedby;

	public AdPrintcolor() {
	}

	@Id
	@Column(name = "AD_PRINTCOLOR_ID")
	public long getAdPrintcolorId() {
		return this.adPrintcolorId;
	}

	public void setAdPrintcolorId(long adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
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

}