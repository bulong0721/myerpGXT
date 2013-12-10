package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_phase database table.
 * 
 */
@Entity
@Table(name="c_phase")
@NamedQuery(name="CPhase.findAll", query="SELECT c FROM CPhase c")
public class CPhase extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPhaseId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cProjecttypeId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private BigDecimal mProductId;
	private String name;
	private BigDecimal seqno;
	private BigDecimal standardqty;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPhase() {
	}


	@Id
	@Column(name="C_PHASE_ID")
	public long getCPhaseId() {
		return this.cPhaseId;
	}

	public void setCPhaseId(long cPhaseId) {
		this.cPhaseId = cPhaseId;
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


	@Column(name="C_PROJECTTYPE_ID")
	public BigDecimal getCProjecttypeId() {
		return this.cProjecttypeId;
	}

	public void setCProjecttypeId(BigDecimal cProjecttypeId) {
		this.cProjecttypeId = cProjecttypeId;
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


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}


	public BigDecimal getStandardqty() {
		return this.standardqty;
	}

	public void setStandardqty(BigDecimal standardqty) {
		this.standardqty = standardqty;
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