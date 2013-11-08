package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_scheduler_para database table.
 * 
 */
@Embeddable
public class AdSchedulerParaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adSchedulerId;
	private long adProcessParaId;

	public AdSchedulerParaPK() {
	}

	@Column(name="AD_SCHEDULER_ID", insertable=false, updatable=false)
	public long getAdSchedulerId() {
		return this.adSchedulerId;
	}
	public void setAdSchedulerId(long adSchedulerId) {
		this.adSchedulerId = adSchedulerId;
	}

	@Column(name="AD_PROCESS_PARA_ID", insertable=false, updatable=false)
	public long getAdProcessParaId() {
		return this.adProcessParaId;
	}
	public void setAdProcessParaId(long adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdSchedulerParaPK)) {
			return false;
		}
		AdSchedulerParaPK castOther = (AdSchedulerParaPK)other;
		return 
			(this.adSchedulerId == castOther.adSchedulerId)
			&& (this.adProcessParaId == castOther.adProcessParaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adSchedulerId ^ (this.adSchedulerId >>> 32)));
		hash = hash * prime + ((int) (this.adProcessParaId ^ (this.adProcessParaId >>> 32)));
		
		return hash;
	}
}