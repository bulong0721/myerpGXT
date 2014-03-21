package org.adempiere.common;

import java.io.Serializable;

public abstract class ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;

	public void setADOrgID(Integer adOrgId) {
	}

	public void setADClientID(Integer adClientId) {
	}

	public void setCreated(String created) {
	}

	public Integer getCreatedBy() {
		return null;
	}

	public void setCreatedBy(Integer createdby) {
	}

	public void setUpdated(String updated) {
	}

	public void setUpdatedBy(Integer updatedby) {
	}

	public void setActive(Boolean isactive) {
	}

}
