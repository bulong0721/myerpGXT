package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_interorg_acct database table.
 * 
 */
@Embeddable
public class CInterorgAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private long adOrgId;
	private long adOrgtoId;

	public CInterorgAcctPK() {
	}

	@Column(name="C_ACCTSCHEMA_ID", insertable=false, updatable=false)
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}
	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Column(name="AD_ORG_ID", insertable=false, updatable=false)
	public long getAdOrgId() {
		return this.adOrgId;
	}
	public void setAdOrgId(long adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Column(name="AD_ORGTO_ID", insertable=false, updatable=false)
	public long getAdOrgtoId() {
		return this.adOrgtoId;
	}
	public void setAdOrgtoId(long adOrgtoId) {
		this.adOrgtoId = adOrgtoId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CInterorgAcctPK)) {
			return false;
		}
		CInterorgAcctPK castOther = (CInterorgAcctPK)other;
		return 
			(this.cAcctschemaId == castOther.cAcctschemaId)
			&& (this.adOrgId == castOther.adOrgId)
			&& (this.adOrgtoId == castOther.adOrgtoId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cAcctschemaId ^ (this.cAcctschemaId >>> 32)));
		hash = hash * prime + ((int) (this.adOrgId ^ (this.adOrgId >>> 32)));
		hash = hash * prime + ((int) (this.adOrgtoId ^ (this.adOrgtoId >>> 32)));
		
		return hash;
	}
}