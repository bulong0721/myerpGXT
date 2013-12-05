package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bankaccount_acct database table.
 * 
 */
@Embeddable
public class CBankaccountAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cBankaccountId;
	private long cAcctschemaId;

	public CBankaccountAcctPK() {
	}

	@Column(name="C_BANKACCOUNT_ID", insertable=false, updatable=false)
	public long getCBankaccountId() {
		return this.cBankaccountId;
	}
	public void setCBankaccountId(long cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
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
		if (!(other instanceof CBankaccountAcctPK)) {
			return false;
		}
		CBankaccountAcctPK castOther = (CBankaccountAcctPK)other;
		return 
			(this.cBankaccountId == castOther.cBankaccountId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cBankaccountId ^ (this.cBankaccountId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}