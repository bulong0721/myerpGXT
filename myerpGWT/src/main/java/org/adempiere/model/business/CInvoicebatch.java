package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_invoicebatch database table.
 * 
 */
@Entity
@Table(name="c_invoicebatch")
@NamedQuery(name="CInvoicebatch.findAll", query="SELECT c FROM CInvoicebatch c")
public class CInvoicebatch extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoicebatchId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cConversiontypeId;
	private BigDecimal cCurrencyId;
	private BigDecimal controlamt;
	private Timestamp created;
	private BigDecimal createdby;
	private Date datedoc;
	private String description;
	private BigDecimal documentamt;
	private String documentno;
	private String isactive;
	private String issotrx;
	private String processed;
	private String processing;
	private BigDecimal salesrepId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CInvoicebatch() {
	}


	@Id
	@Column(name="C_INVOICEBATCH_ID")
	public long getCInvoicebatchId() {
		return this.cInvoicebatchId;
	}

	public void setCInvoicebatchId(long cInvoicebatchId) {
		this.cInvoicebatchId = cInvoicebatchId;
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


	@Column(name="C_CONVERSIONTYPE_ID")
	public BigDecimal getCConversiontypeId() {
		return this.cConversiontypeId;
	}

	public void setCConversiontypeId(BigDecimal cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	public BigDecimal getControlamt() {
		return this.controlamt;
	}

	public void setControlamt(BigDecimal controlamt) {
		this.controlamt = controlamt;
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
	public Date getDatedoc() {
		return this.datedoc;
	}

	public void setDatedoc(Date datedoc) {
		this.datedoc = datedoc;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getDocumentamt() {
		return this.documentamt;
	}

	public void setDocumentamt(BigDecimal documentamt) {
		this.documentamt = documentamt;
	}


	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
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