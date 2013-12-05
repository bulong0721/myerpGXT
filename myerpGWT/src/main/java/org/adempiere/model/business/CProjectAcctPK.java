package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_project_acct database table.
 * 
 */
@Embeddable
public class CProjectAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cProjectId;
	private long cAcctschemaId;

	public CProjectAcctPK() {
	}

	@Column(name="C_PROJECT_ID", insertable=false, updatable=false)
	public long getCProjectId() {
		return this.cProjectId;
	}
	public void setCProjectId(long cProjectId) {
		this.cProjectId = cProjectId;
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
		if (!(other instanceof CProjectAcctPK)) {
			return false;
		}
		CProjectAcctPK castOther = (CProjectAcctPK)other;
		return 
			(this.cProjectId == castOther.cProjectId)
			&& (this.cAcctschemaId == castOther.cAcctschemaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cProjectId ^ (this.cProjectId >>> 32)));
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		
		return hash;
	}
}