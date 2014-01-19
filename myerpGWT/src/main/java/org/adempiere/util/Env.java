package org.adempiere.util;

import java.math.BigDecimal;

public final class Env {

	public static final BigDecimal	ZERO	= new BigDecimal(0);

	public static String getAdempiereHome() {
		// TODO Auto-generated method stub
		return "d:/adempiere_home/";
	}

	public static String getReportPath(String path) {
		return getAdempiereHome() + "reports/" + path;
	}

	public static Integer getUser() {
		return 100;
	}

	public static String nowString() {
		// TODO Auto-generated method stub
		return "2014-01-15 15:25:00";
	}

}
