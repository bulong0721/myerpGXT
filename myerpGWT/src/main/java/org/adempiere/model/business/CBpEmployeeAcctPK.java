package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bp_employee_acct database table.
 * 
 */
@Embeddable
public class CBpEmployeeAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cBpartnerId;
	private long cAcctschemaId;

	public CBpEmployeeAcctPK() {
	}

	@Column(name="C_BPARTNER_ID", insertable=false, updatable=false)
	public long getCBpartnerId() {
		return this.cBpartnerId;
	}
	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
		if (!(other instanceof CBpEmployeeAcctPK)) {
			return false;
		}
		CBpEmployeeAcctPK castOther = (CBpEmployeeAcctPK)other;
		return 
			(this.cBpartnerId == castOther.cBpartnerId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cBpartnerId ^ (this.cBpartnerId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}