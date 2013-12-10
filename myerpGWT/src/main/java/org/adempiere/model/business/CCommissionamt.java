package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_commissionamt database table.
 * 
 */
@Entity
@Table(name="c_commissionamt")
@NamedQuery(name="CCommissionamt.findAll", query="SELECT c FROM CCommissionamt c")
public class CCommissionamt extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCommissionamtId;
	private BigDecimal actualqty;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCommissionlineId;
	private BigDecimal cCommissionrunId;
	private BigDecimal commissionamt;
	private BigDecimal convertedamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCommissionamt() {
	}


	@Id
	@Column(name="C_COMMISSIONAMT_ID")
	public long getCCommissionamtId() {
		return this.cCommissionamtId;
	}

	public void setCCommissionamtId(long cCommissionamtId) {
		this.cCommissionamtId = cCommissionamtId;
	}


	public BigDecimal getActualqty() {
		return this.actualqty;
	}

	public void setActualqty(BigDecimal actualqty) {
		this.actualqty = actualqty;
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


	@Column(name="C_COMMISSIONLINE_ID")
	public BigDecimal getCCommissionlineId() {
		return this.cCommissionlineId;
	}

	public void setCCommissionlineId(BigDecimal cCommissionlineId) {
		this.cCommissionlineId = cCommissionlineId;
	}


	@Column(name="C_COMMISSIONRUN_ID")
	public BigDecimal getCCommissionrunId() {
		return this.cCommissionrunId;
	}

	public void setCCommissionrunId(BigDecimal cCommissionrunId) {
		this.cCommissionrunId = cCommissionrunId;
	}


	public BigDecimal getCommissionamt() {
		return this.commissionamt;
	}

	public void setCommissionamt(BigDecimal commissionamt) {
		this.commissionamt = commissionamt;
	}


	public BigDecimal getConvertedamt() {
		return this.convertedamt;
	}

	public void setConvertedamt(BigDecimal convertedamt) {
		this.convertedamt = convertedamt;
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