package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_rfqresponselineqty database table.
 * 
 */
@Entity
@Table(name="c_rfqresponselineqty")
@NamedQuery(name="CRfqresponselineqty.findAll", query="SELECT c FROM CRfqresponselineqty c")
public class CRfqresponselineqty extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqresponselineqtyId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cRfqlineqtyId;
	private BigDecimal cRfqresponselineId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal discount;
	private String isactive;
	private BigDecimal price;
	private BigDecimal ranking;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqresponselineqty() {
	}


	@Id
	@Column(name="C_RFQRESPONSELINEQTY_ID")
	public long getCRfqresponselineqtyId() {
		return this.cRfqresponselineqtyId;
	}

	public void setCRfqresponselineqtyId(long cRfqresponselineqtyId) {
		this.cRfqresponselineqtyId = cRfqresponselineqtyId;
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


	@Column(name="C_RFQLINEQTY_ID")
	public BigDecimal getCRfqlineqtyId() {
		return this.cRfqlineqtyId;
	}

	public void setCRfqlineqtyId(BigDecimal cRfqlineqtyId) {
		this.cRfqlineqtyId = cRfqlineqtyId;
	}


	@Column(name="C_RFQRESPONSELINE_ID")
	public BigDecimal getCRfqresponselineId() {
		return this.cRfqresponselineId;
	}

	public void setCRfqresponselineId(BigDecimal cRfqresponselineId) {
		this.cRfqresponselineId = cRfqresponselineId;
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


	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public BigDecimal getRanking() {
		return this.ranking;
	}

	public void setRanking(BigDecimal ranking) {
		this.ranking = ranking;
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