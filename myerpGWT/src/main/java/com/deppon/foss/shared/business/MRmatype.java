package com.deppon.foss.shared.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the M_RMATYPE database table.
 * 
 */
@Entity
@Table(name = "M_RMATYPE")
public class MRmatype extends com.deppon.foss.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				mRmatypeId;
	private Long				adClientId;
	private Long				adOrgId;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				help;
	private String				isactive;
	private String				name;
	private String				updated;
	private Long				updatedby;

	public MRmatype() {
	}

	@Id
	@Column(name = "M_RMATYPE_ID")
	public long getMRmatypeId() {
		return this.mRmatypeId;
	}

	public void setMRmatypeId(long mRmatypeId) {
		this.mRmatypeId = mRmatypeId;
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

	@Column(name = "\"HELP\"")
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