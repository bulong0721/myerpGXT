package org.adempiere.common;

import java.io.Serializable;

public class AdempiereUserError extends Exception implements Serializable {

	private static final long	serialVersionUID	= 1L;

	public AdempiereUserError(String message) {
		super(message);
	}
}
