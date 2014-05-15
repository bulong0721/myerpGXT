package org.adempiere.common;

import java.io.Serializable;

public class AdempiereException extends RuntimeException implements Serializable {
	private static final long	serialVersionUID	= 1L;

	public AdempiereException(String message) {
		super(message);
	}

}
