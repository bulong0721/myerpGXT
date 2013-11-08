package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_table_access database table.
 * 
 */
@Embeddable
public class AdTableAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adRoleId;
	private long adTableId;
	private String accesstyperule;

	public AdTableAccessPK() {
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

	public String getAccesstyperule() {
		return this.accesstyperule;
	}
	public void setAccesstyperule(String accesstyperule) {
		this.accesstyperule = accesstyperule;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdTableAccessPK)) {
			return false;
		}
		AdTableAccessPK castOther = (AdTableAccessPK)other;
		return 
			(this.adRoleId == castOther.adRoleId)
			&& (this.adTableId == castOther.adTableId)
			&& this.accesstyperule.equals(castOther.accesstyperule);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adRoleId ^ (this.adRoleId >>> 32)));
		hash = hash * prime + ((int) (this.adTableId ^ (this.adTableId >>> 32)));
		hash = hash * prime + this.accesstyperule.hashCode();
		
		return hash;
	}
}