package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.adempiere.model.common.ADEntityBase;

/**
 * The persistent class for the ad_ref_list database table.
 * 
 */
@Entity
@Table(name = "ad_ref_list")
public class AdRefList extends ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adRefListId;
	private Long				adClientId;
	private Long				adOrgId;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				entitytype;
	private String				isactive;
	private String				name;
	private String				updated;
	private Long				updatedby;
	private String				validfrom;
	private String				validto;
	private String				value;
	private AdReference			adReference;

	public AdRefList() {
	}

	@Id
	@Column(name = "AD_REF_LIST_ID")
	public long getAdRefListId() {
		return this.adRefListId;
	}

	public void setAdRefListId(long adRefListId) {
		this.adRefListId = adRefListId;
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

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
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

	public String getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}

	public String getValidto() {
		return this.validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// bi-directional many-to-one association to AdReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_REFERENCE_ID")
	public AdReference getAdReference() {
		return this.adReference;
	}

	public void setAdReference(AdReference adReference) {
		this.adReference = adReference;
	}

}