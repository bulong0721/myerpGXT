package org.adempiere.util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.adempiere.model.ADUser;

public final class EnvUtil {

	public static final BigDecimal ZERO = new BigDecimal(0);
	public static final BigDecimal ONE = new BigDecimal(1);
	public static final String LANGUAGE = "Language";

	public static String getAdempiereHome() {
		// TODO Auto-generated method stub
		return "d:/adempiere_home/";
	}

	public static String getReportPath(String path) {
		return getAdempiereHome() + "reports/" + path;
	}

	public static Integer getUser() {
		ADUser user = PermissionUtil.getCurrentUser();
		if (null != user) {
			return user.getADUserID();
		}
		return 0;
	}

	static SimpleDateFormat fullFormat = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	public static String currentTimestamp() {
		return fullFormat.format(new Date());
	}

	public static boolean isBaseLanguage(String aD_Language) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int getLanguageID(String languageName) {
		return 187;
	}

	public static int getADClientID() {
		ADUser user = PermissionUtil.getCurrentUser();
		if (null != user) {
			return user.getADClientID();
		}
		return 0;
	}

	public static String getProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Properties context;

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
