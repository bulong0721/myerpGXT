package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_invoiceschedule database table.
 * 
 */
@Entity
@Table(name="c_invoiceschedule")
@NamedQuery(name="CInvoiceschedule.findAll", query="SELECT c FROM CInvoiceschedule c")
public class CInvoiceschedule extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoicescheduleId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal amt;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String eveninvoiceweek;
	private BigDecimal invoiceday;
	private BigDecimal invoicedaycutoff;
	private String invoicefrequency;
	private String invoiceweekday;
	private String invoiceweekdaycutoff;
	private String isactive;
	private String isamount;
	private String isdefault;
	private String name;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CInvoiceschedule() {
	}


	@Id
	@Column(name="C_INVOICESCHEDULE_ID")
	public long getCInvoicescheduleId() {
		return this.cInvoicescheduleId;
	}

	public void setCInvoicescheduleId(long cInvoicescheduleId) {
		this.cInvoicescheduleId = cInvoicescheduleId;
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


	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
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


	public String getEveninvoiceweek() {
		return this.eveninvoiceweek;
	}

	public void setEveninvoiceweek(String eveninvoiceweek) {
		this.eveninvoiceweek = eveninvoiceweek;
	}


	public BigDecimal getInvoiceday() {
		return this.invoiceday;
	}

	public void setInvoiceday(BigDecimal invoiceday) {
		this.invoiceday = invoiceday;
	}


	public BigDecimal getInvoicedaycutoff() {
		return this.invoicedaycutoff;
	}

	public void setInvoicedaycutoff(BigDecimal invoicedaycutoff) {
		this.invoicedaycutoff = invoicedaycutoff;
	}


	public String getInvoicefrequency() {
		return this.invoicefrequency;
	}

	public void setInvoicefrequency(String invoicefrequency) {
		this.invoicefrequency = invoicefrequency;
	}


	public String getInvoiceweekday() {
		return this.invoiceweekday;
	}

	public void setInvoiceweekday(String invoiceweekday) {
		this.invoiceweekday = invoiceweekday;
	}


	public String getInvoiceweekdaycutoff() {
		return this.invoiceweekdaycutoff;
	}

	public void setInvoiceweekdaycutoff(String invoiceweekdaycutoff) {
		this.invoiceweekdaycutoff = invoiceweekdaycutoff;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsamount() {
		return this.isamount;
	}

	public void setIsamount(String isamount) {
		this.isamount = isamount;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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