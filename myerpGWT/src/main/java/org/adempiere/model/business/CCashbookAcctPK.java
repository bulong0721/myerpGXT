package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_cashbook_acct database table.
 * 
 */
@Embeddable
public class CCashbookAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cCashbookId;
	private long cAcctschemaId;

	public CCashbookAcctPK() {
	}

	@Column(name="C_CASHBOOK_ID", insertable=false, updatable=false)
	public long getCCashbookId() {
		return this.cCashbookId;
	}
	public void setCCashbookId(long cCashbookId) {
		this.cCashbookId = cCashbookId;
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
		if (!(other instanceof CCashbookAcctPK)) {
			return false;
		}
		CCashbookAcctPK castOther = (CCashbookAcctPK)other;
		return 
			(this.cCashbookId == castOther.cCashbookId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cCashbookId ^ (this.cCashbookId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}