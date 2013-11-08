package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_process_access database table.
 * 
 */
@Embeddable
public class AdProcessAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adProcessId;
	private long adRoleId;

	public AdProcessAccessPK() {
	}

	@Column(name="AD_PROCESS_ID", insertable=false, updatable=false)
	public long getAdProcessId() {
		return this.adProcessId;
	}
	public void setAdProcessId(long adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Column(name="AD_ROLE_ID", insertable=false, updatable=false)
	public long getAdRoleId() {
		return this.adRoleId;
	}
	public void setAdRoleId(long adRoleId) {
		this.adRoleId = adRoleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdProcessAccessPK)) {
			return false;
		}
		AdProcessAccessPK castOther = (AdProcessAccessPK)other;
		return 
			(this.adProcessId == castOther.adProcessId)
			&& (this.adRoleId == castOther.adRoleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adProcessId ^ (this.adProcessId >>> 32)));
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		
		return hash;
	}
}