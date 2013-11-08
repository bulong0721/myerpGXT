package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_window_access database table.
 * 
 */
@Embeddable
public class AdWindowAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adWindowId;
	private long adRoleId;

	public AdWindowAccessPK() {
	}

	@Column(name="AD_WINDOW_ID", insertable=false, updatable=false)
	public long getAdWindowId() {
		return this.adWindowId;
	}
	public void setAdWindowId(long adWindowId) {
		this.adWindowId = adWindowId;
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
		if (!(other instanceof AdWindowAccessPK)) {
			return false;
		}
		AdWindowAccessPK castOther = (AdWindowAccessPK)other;
		return 
			(this.adWindowId == castOther.adWindowId)
			&& (this.adRoleId == castOther.adRoleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adWindowId ^ (this.adWindowId >>> 32)));
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		
		return hash;
	}
}