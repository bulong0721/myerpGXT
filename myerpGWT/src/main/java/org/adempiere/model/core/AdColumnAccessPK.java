package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_column_access database table.
 * 
 */
@Embeddable
public class AdColumnAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adRoleId;
	private long adColumnId;

	public AdColumnAccessPK() {
	}

	@Column(name="AD_ROLE_ID", insertable=false, updatable=false)
	public long getAdRoleId() {
		return this.adRoleId;
	}
	public void setAdRoleId(long adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Column(name="AD_COLUMN_ID", insertable=false, updatable=false)
	public long getAdColumnId() {
		return this.adColumnId;
	}
	public void setAdColumnId(long adColumnId) {
		this.adColumnId = adColumnId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdColumnAccessPK)) {
			return false;
		}
		AdColumnAccessPK castOther = (AdColumnAccessPK)other;
		return 
			(this.adRoleId == castOther.adRoleId)
			&& (this.adColumnId == castOther.adColumnId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		hash = hash * prime + ((int) (this.adColumnId ^ (this.adColumnId >>> 32)));
		
		return hash;
	}
}