package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_cyclephase database table.
 * 
 */
@Embeddable
public class CCyclephasePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cCyclestepId;
	private long cPhaseId;

	public CCyclephasePK() {
	}

	@Column(name="C_CYCLESTEP_ID", insertable=false, updatable=false)
	public long getCCyclestepId() {
		return this.cCyclestepId;
	}
	public void setCCyclestepId(long cCyclestepId) {
		this.cCyclestepId = cCyclestepId;
	}

	@Column(name="C_PHASE_ID", insertable=false, updatable=false)
	public long getCPhaseId() {
		return this.cPhaseId;
	}
	public void setCPhaseId(long cPhaseId) {
		this.cPhaseId = cPhaseId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CCyclephasePK)) {
			return false;
		}
		CCyclephasePK castOther = (CCyclephasePK)other;
		return 
			(this.cCyclestepId == castOther.cCyclestepId)
			&& (this.cPhaseId == castOther.cPhaseId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cCyclestepId ^ (this.cCyclestepId >>> 32)));
		hash = hash * prime + ((int) (this.cPhaseId ^ (this.cPhaseId >>> 32)));
		
		return hash;
	}
}