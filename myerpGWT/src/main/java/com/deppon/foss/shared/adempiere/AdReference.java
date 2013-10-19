package com.deppon.foss.shared.adempiere;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the ad_reference database table.
 * 
 */
@Entity
@Table(name = "ad_reference")
public class AdReference extends com.deppon.foss.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adReferenceId;
	private Long				adClientId;
	private Long				adOrgId;
	private String				created;
	private Long				createdby;
	private String				description;
	private String				entitytype;
	private String				help;
	private String				isactive;
	private String				isorderbyvalue;
	private String				name;
	private String				updated;
	private Long				updatedby;
	private String				validationtype;
	private String				vformat;
	private List<AdRefList>		adRefLists;
	private AdRefTable			adRefTable;

	public AdReference() {
	}

	@Id
	@Column(name = "AD_REFERENCE_ID")
	public long getAdReferenceId() {
		return this.adReferenceId;
	}

	public void setAdReferenceId(long adReferenceId) {
		this.adReferenceId = adReferenceId;
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

	public String getIsorderbyvalue() {
		return this.isorderbyvalue;
	}

	public void setIsorderbyvalue(String isorderbyvalue) {
		this.isorderbyvalue = isorderbyvalue;
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

	public String getValidationtype() {
		return this.validationtype;
	}

	public void setValidationtype(String validationtype) {
		this.validationtype = validationtype;
	}

	public String getVformat() {
		return this.vformat;
	}

	public void setVformat(String vformat) {
		this.vformat = vformat;
	}

	// bi-directional many-to-one association to AdRefList
	@OneToMany(mappedBy = "adReference")
	public List<AdRefList> getAdRefLists() {
		return this.adRefLists;
	}

	public void setAdRefLists(List<AdRefList> adRefLists) {
		this.adRefLists = adRefLists;
	}

	public AdRefList addAdRefList(AdRefList adRefList) {
		getAdRefLists().add(adRefList);
		adRefList.setAdReference(this);

		return adRefList;
	}

	public AdRefList removeAdRefList(AdRefList adRefList) {
		getAdRefLists().remove(adRefList);
		adRefList.setAdReference(null);

		return adRefList;
	}

	// bi-directional one-to-one association to AdRefTable
	@OneToOne(mappedBy = "adReference", fetch = FetchType.LAZY)
	public AdRefTable getAdRefTable() {
		return this.adRefTable;
	}

	public void setAdRefTable(AdRefTable adRefTable) {
		this.adRefTable = adRefTable;
	}

}