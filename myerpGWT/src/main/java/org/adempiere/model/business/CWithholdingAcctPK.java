package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_withholding_acct database table.
 * 
 */
@Embeddable
public class CWithholdingAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cWithholdingId;
	private long cAcctschemaId;

	public CWithholdingAcctPK() {
	}

	@Column(name="C_WITHHOLDING_ID", insertable=false, updatable=false)
	public long getCWithholdingId() {
		return this.cWithholdingId;
	}
	public void setCWithholdingId(long cWithholdingId) {
		this.cWithholdingId = cWithholdingId;
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
		if (!(other instanceof CWithholdingAcctPK)) {
			return false;
		}
		CWithholdingAcctPK castOther = (CWithholdingAcctPK)other;
		return 
			(this.cWithholdingId == castOther.cWithholdingId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cWithholdingId ^ (this.cWithholdingId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}