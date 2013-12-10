package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_rfqlineqty database table.
 * 
 */
@Entity
@Table(name="c_rfqlineqty")
@NamedQuery(name="CRfqlineqty.findAll", query="SELECT c FROM CRfqlineqty c")
public class CRfqlineqty extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cRfqlineqtyId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal benchmarkprice;
	private BigDecimal bestresponseamt;
	private BigDecimal cRfqlineId;
	private BigDecimal cUomId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String isofferqty;
	private String ispurchaseqty;
	private String isrfqqty;
	private BigDecimal margin;
	private BigDecimal offeramt;
	private BigDecimal qty;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CRfqlineqty() {
	}


	@Id
	@Column(name="C_RFQLINEQTY_ID")
	public long getCRfqlineqtyId() {
		return this.cRfqlineqtyId;
	}

	public void setCRfqlineqtyId(long cRfqlineqtyId) {
		this.cRfqlineqtyId = cRfqlineqtyId;
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


	public BigDecimal getBenchmarkprice() {
		return this.benchmarkprice;
	}

	public void setBenchmarkprice(BigDecimal benchmarkprice) {
		this.benchmarkprice = benchmarkprice;
	}


	public BigDecimal getBestresponseamt() {
		return this.bestresponseamt;
	}

	public void setBestresponseamt(BigDecimal bestresponseamt) {
		this.bestresponseamt = bestresponseamt;
	}


	@Column(name="C_RFQLINE_ID")
	public BigDecimal getCRfqlineId() {
		return this.cRfqlineId;
	}

	public void setCRfqlineId(BigDecimal cRfqlineId) {
		this.cRfqlineId = cRfqlineId;
	}


	@Column(name="C_UOM_ID")
	public BigDecimal getCUomId() {
		return this.cUomId;
	}

	public void setCUomId(BigDecimal cUomId) {
		this.cUomId = cUomId;
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


	public String getIsofferqty() {
		return this.isofferqty;
	}

	public void setIsofferqty(String isofferqty) {
		this.isofferqty = isofferqty;
	}


	public String getIspurchaseqty() {
		return this.ispurchaseqty;
	}

	public void setIspurchaseqty(String ispurchaseqty) {
		this.ispurchaseqty = ispurchaseqty;
	}


	public String getIsrfqqty() {
		return this.isrfqqty;
	}

	public void setIsrfqqty(String isrfqqty) {
		this.isrfqqty = isrfqqty;
	}


	public BigDecimal getMargin() {
		return this.margin;
	}

	public void setMargin(BigDecimal margin) {
		this.margin = margin;
	}


	public BigDecimal getOfferamt() {
		return this.offeramt;
	}

	public void setOfferamt(BigDecimal offeramt) {
		this.offeramt = offeramt;
	}


	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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