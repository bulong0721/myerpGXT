package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_ordertax database table.
 * 
 */
@Embeddable
public class COrdertaxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long cOrderId;
	private long cTaxId;

	public COrdertaxPK() {
	}

	@Column(name="C_ORDER_ID")
	public long getCOrderId() {
		return this.cOrderId;
	}
	public void setCOrderId(long cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Column(name="C_TAX_ID")
	public long getCTaxId() {
		return this.cTaxId;
	}
	public void setCTaxId(long cTaxId) {
		this.cTaxId = cTaxId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof COrdertaxPK)) {
			return false;
		}
		COrdertaxPK castOther = (COrdertaxPK)other;
		return 
			(this.cOrderId == castOther.cOrderId)
			&& (this.cTaxId == castOther.cTaxId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cOrderId ^ (this.cOrderId >>> 32)));
		hash = hash * prime + ((int) (this.cTaxId ^ (this.cTaxId >>> 32)));
		
		return hash;
	}
}