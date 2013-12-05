package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_acctprocessorlog database table.
 * 
 */
@Embeddable
public class CAcctprocessorlogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cAcctprocessorId;
	private long cAcctprocessorlogId;

	public CAcctprocessorlogPK() {
	}

	@Column(name="C_ACCTPROCESSOR_ID", insertable=false, updatable=false)
	public long getCAcctprocessorId() {
		return this.cAcctprocessorId;
	}
	public void setCAcctprocessorId(long cAcctprocessorId) {
		this.cAcctprocessorId = cAcctprocessorId;
	}

	@Column(name="C_ACCTPROCESSORLOG_ID")
	public long getCAcctprocessorlogId() {
		return this.cAcctprocessorlogId;
	}
	public void setCAcctprocessorlogId(long cAcctprocessorlogId) {
		this.cAcctprocessorlogId = cAcctprocessorlogId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CAcctprocessorlogPK)) {
			return false;
		}
		CAcctprocessorlogPK castOther = (CAcctprocessorlogPK)other;
		return 
			(this.cAcctprocessorId == castOther.cAcctprocessorId)
			&& (this.cAcctprocessorlogId == castOther.cAcctprocessorlogId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cAcctprocessorId ^ (this.cAcctprocessorId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctprocessorlogId ^ (this.cAcctprocessorlogId >>> 32)));
		
		return hash;
	}
}