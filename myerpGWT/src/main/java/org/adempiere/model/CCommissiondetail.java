package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_commissiondetail")
public class CCommissiondetail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private BigDecimal actualamt;
	private BigDecimal actualqty;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cCommissionamtId;
	private Integer cCommissiondetailId;
	private Integer cCurrencyId;
	private Integer cInvoicelineId;
	private Integer cOrderlineId;
	private BigDecimal convertedamt;
	private String created;
	private Integer createdby;
	private String info;
	private String isactive;
	private String reference;
	private String updated;
	private Integer updatedby;

	public CCommissiondetail() {
	}

	public CCommissiondetail(Integer cCommissiondetailId) {
		this.cCommissiondetailId = cCommissiondetailId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getActualamt() {
		return actualamt;
	}

	public void setActualamt(BigDecimal actualamt) {
		this.actualamt = actualamt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getActualqty() {
		return actualqty;
	}

	public void setActualqty(BigDecimal actualqty) {
		this.actualqty = actualqty;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="C_COMMISSIONAMT_ID", nullable=false)
	public Integer getCCommissionamtId() {
		return cCommissionamtId;
	}

	public void setCCommissionamtId(Integer cCommissionamtId) {
		this.cCommissionamtId = cCommissionamtId;
	}

	@Id
	@Column(name="C_COMMISSIONDETAIL_ID")
	public Integer getCCommissiondetailId() {
		return cCommissiondetailId;
	}

	public void setCCommissiondetailId(Integer cCommissiondetailId) {
		this.cCommissiondetailId = cCommissiondetailId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID")
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}

	@Basic
	@Column(name="C_ORDERLINE_ID")
	public Integer getCOrderlineId() {
		return cOrderlineId;
	}

	public void setCOrderlineId(Integer cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getConvertedamt() {
		return convertedamt;
	}

	public void setConvertedamt(BigDecimal convertedamt) {
		this.convertedamt = convertedamt;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=60)
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=60)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}