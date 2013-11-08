package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_workbenchwindow database table.
 * 
 */
@Entity
@Table(name="ad_workbenchwindow")
@NamedQuery(name="AdWorkbenchwindow.findAll", query="SELECT a FROM AdWorkbenchwindow a")
public class AdWorkbenchwindow extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adWorkbenchwindowId;
	private BigDecimal adClientId;
	private BigDecimal adFormId;
	private BigDecimal adOrgId;
	private BigDecimal adProcessId;
	private BigDecimal adTaskId;
	private BigDecimal adWindowId;
	private BigDecimal adWorkbenchId;
	private Timestamp created;
	private BigDecimal createdby;
	private String entitytype;
	private String isactive;
	private String isprimary;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public AdWorkbenchwindow() {
	}


	@Id
	@Column(name="AD_WORKBENCHWINDOW_ID")
	public long getAdWorkbenchwindowId() {
		return this.adWorkbenchwindowId;
	}

	public void setAdWorkbenchwindowId(long adWorkbenchwindowId) {
		this.adWorkbenchwindowId = adWorkbenchwindowId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_FORM_ID")
	public BigDecimal getAdFormId() {
		return this.adFormId;
	}

	public void setAdFormId(BigDecimal adFormId) {
		this.adFormId = adFormId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_PROCESS_ID")
	public BigDecimal getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(BigDecimal adProcessId) {
		this.adProcessId = adProcessId;
	}


	@Column(name="AD_TASK_ID")
	public BigDecimal getAdTaskId() {
		return this.adTaskId;
	}

	public void setAdTaskId(BigDecimal adTaskId) {
		this.adTaskId = adTaskId;
	}


	@Column(name="AD_WINDOW_ID")
	public BigDecimal getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(BigDecimal adWindowId) {
		this.adWindowId = adWindowId;
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


	public String getIsprimary() {
		return this.isprimary;
	}

	public void setIsprimary(String isprimary) {
		this.isprimary = isprimary;
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