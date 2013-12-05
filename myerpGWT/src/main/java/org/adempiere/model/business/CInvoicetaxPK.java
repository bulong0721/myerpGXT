package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_invoicetax database table.
 * 
 */
@Embeddable
public class CInvoicetaxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cTaxId;
	private long cInvoiceId;

	public CInvoicetaxPK() {
	}

	@Column(name="C_TAX_ID", insertable=false, updatable=false)
	public long getCTaxId() {
		return this.cTaxId;
	}
	public void setCTaxId(long cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Column(name="C_INVOICE_ID", insertable=false, updatable=false)
	public long getCInvoiceId() {
		return this.cInvoiceId;
	}
	public void setCInvoiceId(long cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CInvoicetaxPK)) {
			return false;
		}
		CInvoicetaxPK castOther = (CInvoicetaxPK)other;
		return 
			(this.cTaxId == castOther.cTaxId)
			&& (this.cInvoiceId == castOther.cInvoiceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cTaxId ^ (this.cTaxId >>> 32)));
		hash = hash * prime + ((int) (this.cInvoiceId ^ (this.cInvoiceId >>> 32)));
		
		return hash;
	}
}