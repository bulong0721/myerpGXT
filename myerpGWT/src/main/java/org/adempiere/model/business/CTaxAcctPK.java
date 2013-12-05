package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_tax_acct database table.
 * 
 */
@Embeddable
public class CTaxAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cTaxId;
	private long cAcctschemaId;

	public CTaxAcctPK() {
	}

	@Column(name="C_TAX_ID", insertable=false, updatable=false)
	public long getCTaxId() {
		return this.cTaxId;
	}
	public void setCTaxId(long cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Column(name="C_ACCTSCHEMA_ID", insertable=false, updatable=false)
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}
	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CTaxAcctPK)) {
			return false;
		}
		CTaxAcctPK castOther = (CTaxAcctPK)other;
		return 
			(this.cTaxId == castOther.cTaxId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cTaxId ^ (this.cTaxId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}