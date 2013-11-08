package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_form_access database table.
 * 
 */
@Embeddable
public class AdFormAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adFormId;
	private long adRoleId;

	public AdFormAccessPK() {
	}

	@Column(name="AD_FORM_ID", insertable=false, updatable=false)
	public long getAdFormId() {
		return this.adFormId;
	}
	public void setAdFormId(long adFormId) {
		this.adFormId = adFormId;
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
		if (!(other instanceof AdFormAccessPK)) {
			return false;
		}
		AdFormAccessPK castOther = (AdFormAccessPK)other;
		return 
			(this.adFormId == castOther.adFormId)
			&& (this.adRoleId == castOther.adRoleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adFormId ^ (this.adFormId >>> 32)));
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		
		return hash;
	}
}