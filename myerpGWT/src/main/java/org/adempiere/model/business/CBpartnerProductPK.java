package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_bpartner_product database table.
 * 
 */
@Embeddable
public class CBpartnerProductPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cBpartnerId;
	private long mProductId;

	public CBpartnerProductPK() {
	}

	@Column(name="C_BPARTNER_ID", insertable=false, updatable=false)
	public long getCBpartnerId() {
		return this.cBpartnerId;
	}
	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Column(name="M_PRODUCT_ID", insertable=false, updatable=false)
	public long getMProductId() {
		return this.mProductId;
	}
	public void setMProductId(long mProductId) {
		this.mProductId = mProductId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CBpartnerProductPK)) {
			return false;
		}
		CBpartnerProductPK castOther = (CBpartnerProductPK)other;
		return 
			(this.cBpartnerId == castOther.cBpartnerId)
			&& (this.mProductId == castOther.mProductId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cBpartnerId ^ (this.cBpartnerId >>> 32)));
		hash = hash * prime + ((int) (this.mProductId ^ (this.mProductId >>> 32)));
		
		return hash;
	}
}