package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_schedulerlog database table.
 * 
 */
@Embeddable
public class AdSchedulerlogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adSchedulerId;
	private long adSchedulerlogId;

	public AdSchedulerlogPK() {
	}

	@Column(name="AD_SCHEDULER_ID", insertable=false, updatable=false)
	public long getAdSchedulerId() {
		return this.adSchedulerId;
	}
	public void setAdSchedulerId(long adSchedulerId) {
		this.adSchedulerId = adSchedulerId;
	}

	@Column(name="AD_SCHEDULERLOG_ID")
	public long getAdSchedulerlogId() {
		return this.adSchedulerlogId;
	}
	public void setAdSchedulerlogId(long adSchedulerlogId) {
		this.adSchedulerlogId = adSchedulerlogId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdSchedulerlogPK)) {
			return false;
		}
		AdSchedulerlogPK castOther = (AdSchedulerlogPK)other;
		return 
			(this.adSchedulerId == castOther.adSchedulerId)
			&& (this.adSchedulerlogId == castOther.adSchedulerlogId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adSchedulerId ^ (this.adSchedulerId >>> 32)));
		hash = hash * prime + ((int) (this.adSchedulerlogId ^ (this.adSchedulerlogId >>> 32)));
		
		return hash;
	}
}