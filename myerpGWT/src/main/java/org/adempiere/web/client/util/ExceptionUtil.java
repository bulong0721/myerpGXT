package org.adempiere.web.client.util;

import java.io.Serializable;

public final class ExceptionUtil {
	public static final int		EXCEPTION_TYPE_SYSTEM	= 1;
	public static final int		EXCEPTION_TYPE_BUSINESS	= 2;
	public static final String	EXCEPTION_HEAD_SYSTEM	= "`System`";
	public static final String	EXCEPTION_HEAD_BUSINESS	= "`Business`";

	private ExceptionUtil() {
	}

	public static RuntimeException encodeRuntimeException(int exceptionType, String message) {
		if (exceptionType == EXCEPTION_TYPE_BUSINESS) {
			return new RuntimeException(EXCEPTION_HEAD_BUSINESS + message);
		}
		return new RuntimeException(EXCEPTION_HEAD_SYSTEM + message);
	}

	public static RuntimeException encodeBusinessException(Throwable ex) {
		return encodeRuntimeException(EXCEPTION_TYPE_BUSINESS, ex.getMessage());
	}

	public static RuntimeException encodeBusinessException(String message) {
		return encodeRuntimeException(EXCEPTION_TYPE_BUSINESS, message);
	}

	public static RuntimeException encodeSystemException(Throwable ex) {
		return encodeRuntimeException(EXCEPTION_TYPE_SYSTEM, ex.getMessage());
	}

	public static RuntimeException encodeSystemException(String message) {
		return encodeRuntimeException(EXCEPTION_TYPE_SYSTEM, message);
	}

	public static RPCError decode(Throwable ex) {
		return decode(ex.getMessage());
	}

	public static RPCError decode(String message) {
		if (message.startsWith(EXCEPTION_HEAD_BUSINESS)) {
			return new RPCError(EXCEPTION_TYPE_BUSINESS, message.substring(EXCEPTION_HEAD_BUSINESS.length()));
		} else if (message.startsWith(EXCEPTION_HEAD_SYSTEM)) {
			return new RPCError(EXCEPTION_TYPE_SYSTEM, message.substring(EXCEPTION_HEAD_SYSTEM.length()));
		}
		return new RPCError(EXCEPTION_TYPE_SYSTEM, message);
	}

	public static class RPCError implements Serializable {
		private static final long	serialVersionUID	= 1L;
		private int					exceptionType;
		private String				message;

		public RPCError(int exceptionType, String message) {
			super();
			this.exceptionType = exceptionType;
			this.message = message;
		}

		public boolean isBusinessException() {
			return exceptionType == EXCEPTION_TYPE_BUSINESS;
		}

		public boolean isSystemException() {
			return exceptionType == EXCEPTION_TYPE_SYSTEM;
		}

		public int getExceptionType() {
			return exceptionType;
		}

		public String getMessage() {
			return message;
		}

	}
}
