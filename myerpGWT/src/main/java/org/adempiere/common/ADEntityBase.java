package org.adempiere.common;

import java.io.Serializable;

public abstract class ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;

	public void setAdOrgId(Integer adOrgId) {
	}

	public void setAdClientId(Integer adClientId) {
	}

	public void setCreated(String created) {
	}

	public Integer getCreatedby() {
		return null;
	}

	public void setCreatedby(Integer createdby) {
	}

	public void setUpdated(String updated) {
	}

	public void setUpdatedby(Integer updatedby) {
	}

	public void setIsactive(Boolean isactive) {
	}

}
