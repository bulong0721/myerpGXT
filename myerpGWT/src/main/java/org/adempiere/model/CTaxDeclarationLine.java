package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_taxdeclarationline")
public class CTaxDeclarationLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cAllocationLineID;
	private Integer cBPartnerID;
	private Integer cCurrencyID;
	private Integer cInvoiceID;
	private Integer cInvoiceLineID;
	private Integer cTaxDeclarationID;
	private Integer cTaxDeclarationLineID;
	private Integer cTaxID;
	private String created;
	private Integer createdBy;
	private String dateAcct;
	private String description;
	private Integer line;
	private Boolean manual;
	private BigDecimal taxAmt;
	private BigDecimal taxBaseAmt;
	private String updated;
	private Integer updatedBy;

	public CTaxDeclarationLine() {
	}

	public CTaxDeclarationLine(Integer cTaxDeclarationLineID) {
		this.cTaxDeclarationLineID = cTaxDeclarationLineID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="C_ALLOCATIONLINE_ID", columnDefinition="INT")
	public Integer getCAllocationLineID() {
		return cAllocationLineID;
	}

	public void setCAllocationLineID(Integer cAllocationLineID) {
		this.cAllocationLineID = cAllocationLineID;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_INVOICE_ID", columnDefinition="INT")
	public Integer getCInvoiceID() {
		return cInvoiceID;
	}

	public void setCInvoiceID(Integer cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT")
	public Integer getCInvoiceLineID() {
		return cInvoiceLineID;
	}

	public void setCInvoiceLineID(Integer cInvoiceLineID) {
		this.cInvoiceLineID = cInvoiceLineID;
	}

	@Basic
	@Column(name="C_TAXDECLARATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxDeclarationID() {
		return cTaxDeclarationID;
	}

	public void setCTaxDeclarationID(Integer cTaxDeclarationID) {
		this.cTaxDeclarationID = cTaxDeclarationID;
	}

	@Id
	@Column(name="C_TAXDECLARATIONLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1180", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_TaxDeclarationLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1180")
	public Integer getCTaxDeclarationLineID() {
		return cTaxDeclarationLineID;
	}

	public void setCTaxDeclarationLineID(Integer cTaxDeclarationLineID) {
		this.cTaxDeclarationLineID = cTaxDeclarationLineID;
	}

	@Basic
	@Column(name="C_TAX_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxID() {
		return cTaxID;
	}

	public void setCTaxID(Integer cTaxID) {
		this.cTaxID = cTaxID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(nullable=false)
	public String getDateAcct() {
		return dateAcct;
	}

	public void setDateAcct(String dateAcct) {
		this.dateAcct = dateAcct;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="ISMANUAL", nullable=false)
	public Boolean isManual() {
		return manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(BigDecimal taxAmt) {
		this.taxAmt = taxAmt;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getTaxBaseAmt() {
		return taxBaseAmt;
	}

	public void setTaxBaseAmt(BigDecimal taxBaseAmt) {
		this.taxBaseAmt = taxBaseAmt;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}