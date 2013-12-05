package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_projectissuema database table.
 * 
 */
@Embeddable
public class CProjectissuemaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cProjectissueId;
	private long mAttributesetinstanceId;

	public CProjectissuemaPK() {
	}

	@Column(name="C_PROJECTISSUE_ID", insertable=false, updatable=false)
	public long getCProjectissueId() {
		return this.cProjectissueId;
	}
	public void setCProjectissueId(long cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
	}

	@Column(name="M_ATTRIBUTESETINSTANCE_ID", insertable=false, updatable=false)
	public long getMAttributesetinstanceId() {
		return this.mAttributesetinstanceId;
	}
	public void setMAttributesetinstanceId(long mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CProjectissuemaPK)) {
			return false;
		}
		CProjectissuemaPK castOther = (CProjectissuemaPK)other;
		return 
			(this.cProjectissueId == castOther.cProjectissueId)
			&& (this.mAttributesetinstanceId == castOther.mAttributesetinstanceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cProjectissueId ^ (this.cProjectissueId >>> 32)));
		hash = hash * prime + ((int) (this.mAttributesetinstanceId ^ (this.mAttributesetinstanceId >>> 32)));
		
		return hash;
	}
}