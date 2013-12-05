package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bp_vendor_acct database table.
 * 
 */
@Embeddable
public class CBpVendorAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private long cBpartnerId;

	public CBpVendorAcctPK() {
	}

	@Column(name="C_ACCTSCHEMA_ID", insertable=false, updatable=false)
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}
	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Column(name="C_BPARTNER_ID", insertable=false, updatable=false)
	public long getCBpartnerId() {
		return this.cBpartnerId;
	}
	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CBpVendorAcctPK)) {
			return false;
		}
		CBpVendorAcctPK castOther = (CBpVendorAcctPK)other;
		return 
			(this.cAcctschemaId == castOther.cAcctschemaId)
			&& (this.cBpartnerId == castOther.cBpartnerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		hash = hash * prime + ((int) (this.cBpartnerId ^ (this.cBpartnerId >>> 32)));
		
		return hash;
	}
}