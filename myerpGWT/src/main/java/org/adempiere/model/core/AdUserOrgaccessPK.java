package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_user_orgaccess database table.
 * 
 */
@Embeddable
public class AdUserOrgaccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adUserId;
	private long adOrgId;

	public AdUserOrgaccessPK() {
	}

	@Column(name="AD_USER_ID", insertable=false, updatable=false)
	public long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(long adUserId) {
		this.adUserId = adUserId;
	}

	@Column(name="AD_ORG_ID", insertable=false, updatable=false)
	public long getAdOrgId() {
		return this.adOrgId;
	}
	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdUserOrgaccessPK)) {
			return false;
		}
		AdUserOrgaccessPK castOther = (AdUserOrgaccessPK)other;
		return 
			(this.adUserId == castOther.adUserId)
			&& (this.adOrgId == castOther.adOrgId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adUserId ^ (this.adUserId >>> 32)));
		hash = hash * prime + ((int) (this.adOrgId ^ (this.adOrgId >>> 32)));
		
		return hash;
	}
}