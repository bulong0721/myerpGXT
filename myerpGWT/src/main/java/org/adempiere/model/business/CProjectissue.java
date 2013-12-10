package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_projectissue database table.
 * 
 */
@Entity
@Table(name="c_projectissue")
@NamedQuery(name="CProjectissue.findAll", query="SELECT c FROM CProjectissue c")
public class CProjectissue extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cProjectissueId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cProjectId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private BigDecimal line;
	private BigDecimal mAttributesetinstanceId;
	private BigDecimal mInoutlineId;
	private BigDecimal mLocatorId;
	private BigDecimal mProductId;
	private Date movementdate;
	private BigDecimal movementqty;
	private String posted;
	private String processed;
	private BigDecimal processedon;
	private String processing;
	private BigDecimal sTimeexpenselineId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CProjectissue() {
	}


	@Id
	@Column(name="C_PROJECTISSUE_ID")
	public long getCProjectissueId() {
		return this.cProjectissueId;
	}

	public void setCProjectissueId(long cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
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


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
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


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	@Column(name="M_ATTRIBUTESETINSTANCE_ID")
	public BigDecimal getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}


	@Column(name="M_INOUTLINE_ID")
	public BigDecimal getMInoutlineId() {
		return this.mInoutlineId;
	}

	public void setMInoutlineId(BigDecimal mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}


	@Column(name="M_LOCATOR_ID")
	public BigDecimal getMLocatorId() {
		return this.mLocatorId;
	}

	public void setMLocatorId(BigDecimal mLocatorId) {
		this.mLocatorId = mLocatorId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getMovementdate() {
		return this.movementdate;
	}

	public void setMovementdate(Date movementdate) {
		this.movementdate = movementdate;
	}


	public BigDecimal getMovementqty() {
		return this.movementqty;
	}

	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
	}


	public String getPosted() {
		return this.posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getProcessedon() {
		return this.processedon;
	}

	public void setProcessedon(BigDecimal processedon) {
		this.processedon = processedon;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="S_TIMEEXPENSELINE_ID")
	public BigDecimal getSTimeexpenselineId() {
		return this.sTimeexpenselineId;
	}

	public void setSTimeexpenselineId(BigDecimal sTimeexpenselineId) {
		this.sTimeexpenselineId = sTimeexpenselineId;
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