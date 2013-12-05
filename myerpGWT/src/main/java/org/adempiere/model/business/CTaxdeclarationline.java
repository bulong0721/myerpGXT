package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_taxdeclarationline database table.
 * 
 */
@Entity
@Table(name="c_taxdeclarationline")
@NamedQuery(name="CTaxdeclarationline.findAll", query="SELECT c FROM CTaxdeclarationline c")
public class CTaxdeclarationline extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxdeclarationlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cAllocationlineId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCurrencyId;
	private BigDecimal cInvoiceId;
	private BigDecimal cInvoicelineId;
	private BigDecimal cTaxId;
	private BigDecimal cTaxdeclarationId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateacct;
	private String description;
	private String isactive;
	private String ismanual;
	private BigDecimal line;
	private BigDecimal taxamt;
	private BigDecimal taxbaseamt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CTaxdeclarationline() {
	}


	@Id
	@Column(name="C_TAXDECLARATIONLINE_ID")
	public long getCTaxdeclarationlineId() {
		return this.cTaxdeclarationlineId;
	}

	public void setCTaxdeclarationlineId(long cTaxdeclarationlineId) {
		this.cTaxdeclarationlineId = cTaxdeclarationlineId;
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


	@Column(name="C_ALLOCATIONLINE_ID")
	public BigDecimal getCAllocationlineId() {
		return this.cAllocationlineId;
	}

	public void setCAllocationlineId(BigDecimal cAllocationlineId) {
		this.cAllocationlineId = cAllocationlineId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_INVOICELINE_ID")
	public BigDecimal getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(BigDecimal cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}


	@Column(name="C_TAX_ID")
	public BigDecimal getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(BigDecimal cTaxId) {
		this.cTaxId = cTaxId;
	}


	@Column(name="C_TAXDECLARATION_ID")
	public BigDecimal getCTaxdeclarationId() {
		return this.cTaxdeclarationId;
	}

	public void setCTaxdeclarationId(BigDecimal cTaxdeclarationId) {
		this.cTaxdeclarationId = cTaxdeclarationId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
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


	public String getIsmanual() {
		return this.ismanual;
	}

	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public BigDecimal getTaxamt() {
		return this.taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}


	public BigDecimal getTaxbaseamt() {
		return this.taxbaseamt;
	}

	public void setTaxbaseamt(BigDecimal taxbaseamt) {
		this.taxbaseamt = taxbaseamt;
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