package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_jobassignment database table.
 * 
 */
@Entity
@Table(name="c_jobassignment")
@NamedQuery(name="CJobassignment.findAll", query="SELECT c FROM CJobassignment c")
public class CJobassignment extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cJobassignmentId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adUserId;
	private BigDecimal cJobId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;
	private Date validto;

	public CJobassignment() {
	}


	@Id
	@Column(name="C_JOBASSIGNMENT_ID")
	public long getCJobassignmentId() {
		return this.cJobassignmentId;
	}

	public void setCJobassignmentId(long cJobassignmentId) {
		this.cJobassignmentId = cJobassignmentId;
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


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="C_JOB_ID")
	public BigDecimal getCJobId() {
		return this.cJobId;
	}

	public void setCJobId(BigDecimal cJobId) {
		this.cJobId = cJobId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidto() {
		return this.validto;
	}

	public void setValidto(Date validto) {
		this.validto = validto;
	}

}