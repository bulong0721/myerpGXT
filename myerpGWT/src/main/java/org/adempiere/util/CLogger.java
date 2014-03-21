package org.adempiere.util;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CLogger extends Logger implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private static CLogger		s_logger			= null;

	protected CLogger(String name, String resourceBundleName) {
		super(name, resourceBundleName);
	}

	public static synchronized CLogger getCLogger(String className) {
		// CLogMgt.initialize();
		LogManager manager = LogManager.getLogManager();
		if (className == null)
			className = "";
		Logger result = manager.getLogger(className);
		if (result != null && result instanceof CLogger)
			return (CLogger) result;
		//
		CLogger newLogger = new CLogger(className, null);
		newLogger.setLevel(Level.INFO);
		manager.addLogger(newLogger);
		return newLogger;
	} // getLogger

	public static CLogger getCLogger(Class<?> clazz) {
		if (clazz == null)
			return get();
		return getCLogger(clazz.getName());
	} // getLogger

	/**
	 * Get default Adempiere Logger. Need to be used in serialized objects
	 * 
	 * @return logger
	 */
	public static CLogger get() {
		if (s_logger == null)
			s_logger = getCLogger("org.compiere.default");
		return s_logger;
	} // get

	public static boolean isLevelFinest() {
		// TODO Auto-generated method stub
		return false;
	}
}
