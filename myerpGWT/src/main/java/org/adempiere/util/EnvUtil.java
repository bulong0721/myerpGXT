package org.adempiere.util;

import java.math.BigDecimal;
import java.util.Properties;

public final class EnvUtil {

	public static final BigDecimal	ZERO	= new BigDecimal(0);
	public static final BigDecimal	ONE		= new BigDecimal(1);
	public static final String	LANGUAGE	= "Language";

	public static String getAdempiereHome() {
		// TODO Auto-generated method stub
		return "d:/adempiere_home/";
	}

	public static String getReportPath(String path) {
		return getAdempiereHome() + "reports/" + path;
	}

	public static Integer getUser() {
		// TODO Auto-generated method stub
		return 100;
	}

	public static String currentTimestamp() {
		// TODO Auto-generated method stub
		return "2014-02-11 10:29:45";
	}

	public static boolean isBaseLanguage(String aD_Language) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int getLanguageID(String languageName) {
		return 187;
	}

	public static int getADClientID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Properties	context;

	public static Properties getCtx() {
		if (null == context) {
			context = new Properties();
		}
		return context;
	}

	public static void setContext(Properties ctxt, String key, String value) {
		// TODO Auto-generated method stub
		
	}

	public static String getHeader(Properties m_printCtx, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
