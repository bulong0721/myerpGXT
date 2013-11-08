package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_record_access database table.
 * 
 */
@Embeddable
public class AdRecordAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adRoleId;
	private long adTableId;
	private long recordId;

	public AdRecordAccessPK() {
	}

	@Column(name="AD_ROLE_ID", insertable=false, updatable=false)
	public long getAdRoleId() {
		return this.adRoleId;
	}
	public void setAdRoleId(long adRoleId) {
		this.adRoleId = adRoleId;
	}

	@Column(name="AD_TABLE_ID", insertable=false, updatable=false)
	public long getAdTableId() {
		return this.adTableId;
	}
	public void setAdTableId(long adTableId) {
		this.adTableId = adTableId;
	}

	@Column(name="RECORD_ID")
	public long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdRecordAccessPK)) {
			return false;
		}
		AdRecordAccessPK castOther = (AdRecordAccessPK)other;
		return 
			(this.adRoleId == castOther.adRoleId)
			&& (this.adTableId == castOther.adTableId)
			&& (this.recordId == castOther.recordId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		hash = hash * prime + ((int) (this.adTableId ^ (this.adTableId >>> 32)));
		hash = hash * prime + ((int) (this.recordId ^ (this.recordId >>> 32)));
		
		return hash;
	}
}