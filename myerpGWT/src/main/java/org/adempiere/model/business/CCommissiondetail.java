package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_commissiondetail database table.
 * 
 */
@Entity
@Table(name="c_commissiondetail")
@NamedQuery(name="CCommissiondetail.findAll", query="SELECT c FROM CCommissiondetail c")
public class CCommissiondetail extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cCommissiondetailId;
	private BigDecimal actualamt;
	private BigDecimal actualqty;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cCommissionamtId;
	private BigDecimal cCurrencyId;
	private BigDecimal cInvoicelineId;
	private BigDecimal cOrderlineId;
	private BigDecimal convertedamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String info;
	private String isactive;
	private String reference;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CCommissiondetail() {
	}


	@Id
	@Column(name="C_COMMISSIONDETAIL_ID")
	public long getCCommissiondetailId() {
		return this.cCommissiondetailId;
	}

	public void setCCommissiondetailId(long cCommissiondetailId) {
		this.cCommissiondetailId = cCommissiondetailId;
	}


	public BigDecimal getActualamt() {
		return this.actualamt;
	}

	public void setActualamt(BigDecimal actualamt) {
		this.actualamt = actualamt;
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


	@Column(name="C_COMMISSIONAMT_ID")
	public BigDecimal getCCommissionamtId() {
		return this.cCommissionamtId;
	}

	public void setCCommissionamtId(BigDecimal cCommissionamtId) {
		this.cCommissionamtId = cCommissionamtId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_INVOICELINE_ID")
	public BigDecimal getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(BigDecimal cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}


	@Column(name="C_ORDERLINE_ID")
	public BigDecimal getCOrderlineId() {
		return this.cOrderlineId;
	}

	public void setCOrderlineId(BigDecimal cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
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


	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
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