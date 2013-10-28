package org.adempiere.web.shared.adempiere;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the ad_ref_table database table.
 * 
 */
@Entity
@Table(name = "ad_ref_table")
public class AdRefTable extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private long				adReferenceId;
	private Long				adClientId;
	private Long				adOrgId;
	private Long				adWindowId;
	private String				created;
	private Long				createdby;
	private String				entitytype;
	private String				isactive;
	private String				isvaluedisplayed;
	private String				orderbyclause;
	private String				updated;
	private Long				updatedby;
	private String				whereclause;
	private AdReference			adReference;

	private AdColumn			keyColumn;
	private AdColumn			displayColumn;
	private AdTable				adTable;

	public AdRefTable() {
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

	@Column(name = "AD_WINDOW_ID")
	public Long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
		this.adWindowId = adWindowId;
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

	public String getIsvaluedisplayed() {
		return this.isvaluedisplayed;
	}

	public void setIsvaluedisplayed(String isvaluedisplayed) {
		this.isvaluedisplayed = isvaluedisplayed;
	}

	public String getOrderbyclause() {
		return this.orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
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

	public String getWhereclause() {
		return this.whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

	// bi-directional one-to-one association to AdReference
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_REFERENCE_ID")
	public AdReference getAdReference() {
		return this.adReference;
	}

	public void setAdReference(AdReference adReference) {
		this.adReference = adReference;
	}

	// uni-directional one-to-one association to AdColumn
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_KEY")
	public AdColumn getKeyColumn() {
		return this.keyColumn;
	}

	public void setKeyColumn(AdColumn keyColumn) {
		this.keyColumn = keyColumn;
	}

	// uni-directional one-to-one association to AdColumn
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_DISPLAY")
	public AdColumn getDisplayColumn() {
		return this.displayColumn;
	}

	public void setDisplayColumn(AdColumn displayColumn) {
		this.displayColumn = displayColumn;
	}

	// uni-directional one-to-one association to AdTable
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AD_TABLE_ID")
	public AdTable getAdTable() {
		return this.adTable;
	}

	public void setAdTable(AdTable adTable) {
		this.adTable = adTable;
	}

}