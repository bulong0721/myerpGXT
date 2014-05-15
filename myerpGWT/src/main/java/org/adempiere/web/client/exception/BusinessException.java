package org.adempiere.web.client.exception;

import org.adempiere.common.AdempiereException;

public class BusinessException extends AdempiereException {
	private static final long	serialVersionUID	= 1L;

	public BusinessException(String message) {
		super(message);
	}

}
