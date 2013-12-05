package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bp_withholding database table.
 * 
 */
@Embeddable
public class CBpWithholdingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cBpartnerId;
	private long cWithholdingId;

	public CBpWithholdingPK() {
	}

	@Column(name="C_BPARTNER_ID", insertable=false, updatable=false)
	public long getCBpartnerId() {
		return this.cBpartnerId;
	}
	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Column(name="C_WITHHOLDING_ID", insertable=false, updatable=false)
	public long getCWithholdingId() {
		return this.cWithholdingId;
	}
	public void setCWithholdingId(long cWithholdingId) {
		this.cWithholdingId = cWithholdingId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CBpWithholdingPK)) {
			return false;
		}
		CBpWithholdingPK castOther = (CBpWithholdingPK)other;
		return 
			(this.cBpartnerId == castOther.cBpartnerId)
			&& (this.cWithholdingId == castOther.cWithholdingId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cBpartnerId ^ (this.cBpartnerId >>> 32)));
		hash = hash * prime + ((int) (this.cWithholdingId ^ (this.cWithholdingId >>> 32)));
		
		return hash;
	}
}