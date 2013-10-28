package org.adempiere.model.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.adempiere.model.common.AdEntityBase;


/**
 * The persistent class for the ad_treenodemm database table.
 * 
 */
@Entity
@Table(name = "ad_treenodemm")
public class AdTreenodemm extends AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private AdTreenodemmPK		id;
	private Long				adClientId;
	private Long				adOrgId;
	private String				created;
	private Long				createdby;
	private String				isactive;
	private Long				parentId;
	private Long				seqno;
	private String				updated;
	private Long				updatedby;
	private AdMenu				adMenu;

	public AdTreenodemm() {
	}

	@EmbeddedId
	public AdTreenodemmPK getId() {
		return this.id;
	}

	public void setId(AdTreenodemmPK id) {
		this.id = id;
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

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "PARENT_ID")
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
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

	// uni-directional one-to-one association to AdMenu
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NODE_ID")
	public AdMenu getAdMenu() {
		return this.adMenu;
	}

	public void setAdMenu(AdMenu adMenu) {
		this.adMenu = adMenu;
	}

}