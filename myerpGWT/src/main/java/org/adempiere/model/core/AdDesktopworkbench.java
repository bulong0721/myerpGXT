package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_desktopworkbench database table.
 * 
 */
@Entity
@Table(name="ad_desktopworkbench")
@NamedQuery(name="AdDesktopworkbench.findAll", query="SELECT a FROM AdDesktopworkbench a")
public class AdDesktopworkbench extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adDesktopworkbenchId;
	private BigDecimal adClientId;
	private BigDecimal adDesktopId;
	private BigDecimal adOrgId;
	private BigDecimal adWorkbenchId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdDesktopworkbench() {
	}


	@Id
	@Column(name="AD_DESKTOPWORKBENCH_ID")
	public long getAdDesktopworkbenchId() {
		return this.adDesktopworkbenchId;
	}

	public void setAdDesktopworkbenchId(long adDesktopworkbenchId) {
		this.adDesktopworkbenchId = adDesktopworkbenchId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_DESKTOP_ID")
	public BigDecimal getAdDesktopId() {
		return this.adDesktopId;
	}

	public void setAdDesktopId(BigDecimal adDesktopId) {
		this.adDesktopId = adDesktopId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_WORKBENCH_ID")
	public BigDecimal getAdWorkbenchId() {
		return this.adWorkbenchId;
	}

	public void setAdWorkbenchId(BigDecimal adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
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


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
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