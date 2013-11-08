package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_registration database table.
 * 
 */
@Embeddable
public class AdRegistrationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adRegistrationId;
	private long adClientId;
	private long adSystemId;

	public AdRegistrationPK() {
	}

	@Column(name="AD_REGISTRATION_ID")
	public long getAdRegistrationId() {
		return this.adRegistrationId;
	}
	public void setAdRegistrationId(long adRegistrationId) {
		this.adRegistrationId = adRegistrationId;
	}

	@Column(name="AD_CLIENT_ID", insertable=false, updatable=false)
	public long getAdClientId() {
		return this.adClientId;
	}
	public void setAdClientId(long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name="AD_SYSTEM_ID", insertable=false, updatable=false)
	public long getAdSystemId() {
		return this.adSystemId;
	}
	public void setAdSystemId(long adSystemId) {
		this.adSystemId = adSystemId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdRegistrationPK)) {
			return false;
		}
		AdRegistrationPK castOther = (AdRegistrationPK)other;
		return 
			(this.adRegistrationId == castOther.adRegistrationId)
			&& (this.adClientId == castOther.adClientId)
			&& (this.adSystemId == castOther.adSystemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adRegistrationId ^ (this.adRegistrationId >>> 32)));
		hash = hash * prime + ((int) (this.adClientId ^ (this.adClientId >>> 32)));
		hash = hash * prime + ((int) (this.adSystemId ^ (this.adSystemId >>> 32)));
		
		return hash;
	}
}