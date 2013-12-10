package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_cyclestep database table.
 * 
 */
@Entity
@Table(name="c_cyclestep")
@NamedQuery(name="CCyclestep.findAll", query="SELECT c FROM CCyclestep c")
public class CCyclestep extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCyclestepId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCycleId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String name;
	private BigDecimal relativeweight;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCyclestep() {
	}


	@Id
	@Column(name="C_CYCLESTEP_ID")
	public long getCCyclestepId() {
		return this.cCyclestepId;
	}

	public void setCCyclestepId(long cCyclestepId) {
		this.cCyclestepId = cCyclestepId;
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


	@Column(name="C_CYCLE_ID")
	public BigDecimal getCCycleId() {
		return this.cCycleId;
	}

	public void setCCycleId(BigDecimal cCycleId) {
		this.cCycleId = cCycleId;
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getRelativeweight() {
		return this.relativeweight;
	}

	public void setRelativeweight(BigDecimal relativeweight) {
		this.relativeweight = relativeweight;
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