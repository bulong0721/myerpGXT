package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_system database table.
 * 
 */
@Embeddable
public class AdSystemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adSystemId;
	private long adClientId;

	public AdSystemPK() {
	}

	@Column(name="AD_SYSTEM_ID")
	public long getAdSystemId() {
		return this.adSystemId;
	}
	public void setAdSystemId(long adSystemId) {
		this.adSystemId = adSystemId;
	}

	@Column(name="AD_CLIENT_ID")
	public long getAdClientId() {
		return this.adClientId;
	}
	public void setAdClientId(long adClientId) {
		this.adClientId = adClientId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdSystemPK)) {
			return false;
		}
		AdSystemPK castOther = (AdSystemPK)other;
		return 
			(this.adSystemId == castOther.adSystemId)
			&& (this.adClientId == castOther.adClientId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adSystemId ^ (this.adSystemId >>> 32)));
		hash = hash * prime + ((int) (this.adClientId ^ (this.adClientId >>> 32)));
		
		return hash;
	}
}