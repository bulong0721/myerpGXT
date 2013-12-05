package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_chargetype_doctype database table.
 * 
 */
@Embeddable
public class CChargetypeDoctypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cChargetypeId;
	private long cDoctypeId;

	public CChargetypeDoctypePK() {
	}

	@Column(name="C_CHARGETYPE_ID", insertable=false, updatable=false)
	public long getCChargetypeId() {
		return this.cChargetypeId;
	}
	public void setCChargetypeId(long cChargetypeId) {
		this.cChargetypeId = cChargetypeId;
	}

	@Column(name="C_DOCTYPE_ID", insertable=false, updatable=false)
	public long getCDoctypeId() {
		return this.cDoctypeId;
	}
	public void setCDoctypeId(long cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CChargetypeDoctypePK)) {
			return false;
		}
		CChargetypeDoctypePK castOther = (CChargetypeDoctypePK)other;
		return 
			(this.cChargetypeId == castOther.cChargetypeId)
			&& (this.cDoctypeId == castOther.cDoctypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cChargetypeId ^ (this.cChargetypeId >>> 32)));
		hash = hash * prime + ((int) (this.cDoctypeId ^ (this.cDoctypeId >>> 32)));
		
		return hash;
	}
}