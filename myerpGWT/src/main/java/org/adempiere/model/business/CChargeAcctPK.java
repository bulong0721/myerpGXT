package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_charge_acct database table.
 * 
 */
@Embeddable
public class CChargeAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cChargeId;
	private long cAcctschemaId;

	public CChargeAcctPK() {
	}

	@Column(name="C_CHARGE_ID", insertable=false, updatable=false)
	public long getCChargeId() {
		return this.cChargeId;
	}
	public void setCChargeId(long cChargeId) {
		this.cChargeId = cChargeId;
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
		if (!(other instanceof CChargeAcctPK)) {
			return false;
		}
		CChargeAcctPK castOther = (CChargeAcctPK)other;
		return 
			(this.cChargeId == castOther.cChargeId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cChargeId ^ (this.cChargeId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}