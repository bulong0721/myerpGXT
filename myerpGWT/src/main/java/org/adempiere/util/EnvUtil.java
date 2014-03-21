package org.adempiere.util;

import java.math.BigDecimal;
import java.util.Properties;

public final class EnvUtil {

	public static final BigDecimal	ZERO	= new BigDecimal(0);

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

	public static Properties getCtx() {
		// TODO Auto-generated method stub
		return null;
	}

}
