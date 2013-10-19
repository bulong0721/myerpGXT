package com.deppon.foss.client.util;

import java.util.logging.Logger;

public class LoggingUtil {
	private static Logger	logger	= Logger.getLogger("adempiere");

	public static void info(String message) {
		logger.info(message);
	}
}
