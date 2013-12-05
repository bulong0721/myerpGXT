package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_invoicetax database table.
 * 
 */
@Entity
@Table(name="c_invoicetax")
@NamedQuery(name="CInvoicetax.findAll", query="SELECT c FROM CInvoicetax c")
public class CInvoicetax extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CInvoicetaxPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String isactive;
	private String istaxincluded;
	private String processed;
	private BigDecimal taxamt;
	private BigDecimal taxbaseamt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CInvoicetax() {
	}


	@EmbeddedId
	public CInvoicetaxPK getId() {
		return this.id;
	}

	public void setId(CInvoicetaxPK id) {
		this.id = id;
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


	public String getIstaxincluded() {
		return this.istaxincluded;
	}

	public void setIstaxincluded(String istaxincluded) {
		this.istaxincluded = istaxincluded;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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