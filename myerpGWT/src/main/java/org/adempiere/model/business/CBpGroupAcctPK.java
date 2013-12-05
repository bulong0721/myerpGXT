package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bp_group_acct database table.
 * 
 */
@Embeddable
public class CBpGroupAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private long cBpGroupId;

	public CBpGroupAcctPK() {
	}

	@Column(name="C_ACCTSCHEMA_ID", insertable=false, updatable=false)
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}
	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Column(name="C_BP_GROUP_ID", insertable=false, updatable=false)
	public long getCBpGroupId() {
		return this.cBpGroupId;
	}
	public void setCBpGroupId(long cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CBpGroupAcctPK)) {
			return false;
		}
		CBpGroupAcctPK castOther = (CBpGroupAcctPK)other;
		return 
			(this.cAcctschemaId == castOther.cAcctschemaId)
			&& (this.cBpGroupId == castOther.cBpGroupId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		hash = hash * prime + ((int) (this.cBpGroupId ^ (this.cBpGroupId >>> 32)));
		
		return hash;
	}
}