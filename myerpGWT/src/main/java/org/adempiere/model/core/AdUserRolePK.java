package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_user_roles database table.
 * 
 */
@Embeddable
public class AdUserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adUserId;
	private long adRoleId;

	public AdUserRolePK() {
	}

	@Column(name="AD_USER_ID", insertable=false, updatable=false)
	public long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(long adUserId) {
		this.adUserId = adUserId;
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
		if (!(other instanceof AdUserRolePK)) {
			return false;
		}
		AdUserRolePK castOther = (AdUserRolePK)other;
		return 
			(this.adUserId == castOther.adUserId)
			&& (this.adRoleId == castOther.adRoleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adUserId ^ (this.adUserId >>> 32)));
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		
		return hash;
	}
}