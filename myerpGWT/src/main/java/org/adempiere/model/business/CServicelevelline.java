package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_servicelevelline database table.
 * 
 */
@Entity
@Table(name="c_servicelevelline")
@NamedQuery(name="CServicelevelline.findAll", query="SELECT c FROM CServicelevelline c")
public class CServicelevelline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cServicelevellineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cServicelevelId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String processed;
	private Date servicedate;
	private BigDecimal servicelevelprovided;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CServicelevelline() {
	}


	@Id
	@Column(name="C_SERVICELEVELLINE_ID")
	public long getCServicelevellineId() {
		return this.cServicelevellineId;
	}

	public void setCServicelevellineId(long cServicelevellineId) {
		this.cServicelevellineId = cServicelevellineId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="C_SERVICELEVEL_ID")
	public BigDecimal getCServicelevelId() {
		return this.cServicelevelId;
	}

	public void setCServicelevelId(BigDecimal cServicelevelId) {
		this.cServicelevelId = cServicelevelId;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getServicedate() {
		return this.servicedate;
	}

	public void setServicedate(Date servicedate) {
		this.servicedate = servicedate;
	}


	public BigDecimal getServicelevelprovided() {
		return this.servicelevelprovided;
	}

	public void setServicelevelprovided(BigDecimal servicelevelprovided) {
		this.servicelevelprovided = servicelevelprovided;
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