package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ad_treenodemm database table.
 * 
 */
@Embeddable
public class AdTreenodemmPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long adTreeId;
	private long nodeId;

	public AdTreenodemmPK() {
	}

	@Column(name="AD_TREE_ID")
	public long getAdTreeId() {
		return this.adTreeId;
	}
	public void setAdTreeId(long adTreeId) {
		this.adTreeId = adTreeId;
	}

	@Column(name="NODE_ID")
	public long getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdTreenodemmPK)) {
			return false;
		}
		AdTreenodemmPK castOther = (AdTreenodemmPK)other;
		return 
			(this.adTreeId == castOther.adTreeId)
			&& (this.nodeId == castOther.nodeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adTreeId ^ (this.adTreeId >>> 32)));
		hash = hash * prime + ((int) (this.nodeId ^ (this.nodeId >>> 32)));
		
		return hash;
	}
}