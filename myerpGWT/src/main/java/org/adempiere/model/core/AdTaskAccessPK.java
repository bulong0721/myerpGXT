package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_task_access database table.
 * 
 */
@Embeddable
public class AdTaskAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adTaskId;
	private long adRoleId;

	public AdTaskAccessPK() {
	}

	@Column(name="AD_TASK_ID", insertable=false, updatable=false)
	public long getAdTaskId() {
		return this.adTaskId;
	}
	public void setAdTaskId(long adTaskId) {
		this.adTaskId = adTaskId;
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
		if (!(other instanceof AdTaskAccessPK)) {
			return false;
		}
		AdTaskAccessPK castOther = (AdTaskAccessPK)other;
		return 
			(this.adTaskId == castOther.adTaskId)
			&& (this.adRoleId == castOther.adRoleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adTaskId ^ (this.adTaskId >>> 32)));
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		
		return hash;
	}
}