package com.deppon.foss.client.util;

public class StringUtil {

	/**
	 * @param text
	 * @return
	 */
	public static boolean isNullOrEmpty(String text) {
		return (null == text || text.length() == 0);
	}
	
	public static String trimEnd(String text, String postfix) {
		if (text.endsWith(postfix)) {
			return text.substring(0, text.lastIndexOf(postfix));
		}
		return text;
	}

	/**
	 * @param value
	 * @return
	 */
	public static boolean isYes(char value) {
		return 'Y' == value;
	}
	
	public static String toYesNo(Boolean value) {
		return value ? "Y" : "N";
	}

	/**
	 * @param value
	 * @return
	 */
	public static boolean isYes(String value) {
		return "Y".equalsIgnoreCase(value);
	}

	public static String convertToCamel(String colName) {
		if (null == colName || 0 == colName.length()) {
			return colName;
		}
		if (colName.contains("_")) {
			return toCamelStyle(colName);
		} else {
			return colName.substring(0, 1).toLowerCase() + colName.substring(1);
		}
	}

	public static String convertToPascal(String tableName) {
		if (null == tableName || 0 == tableName.length()) {
			return tableName;
		}
		if (tableName.contains("_")) {
			return toPascalStyle(tableName);
		} else {
			return tableName;
		}
	}

	public static String toPascalStyle(String name) {
		StringBuffer sb = new StringBuffer();
		String[] str = name.split("_");
		for (String temp : str) {
			sb.append(Character.toUpperCase(temp.charAt(0)));
			sb.append(temp.substring(1).toLowerCase());
		}
		return sb.toString();
	}

	public static String toCamelStyle(String name) {
		StringBuffer sb = new StringBuffer();
		String[] str = name.split("_");
		boolean firstTime = true;
		for (String temp : str) {
			if (firstTime) {
				sb.append(temp.toLowerCase());
				firstTime = false;
			} else {
				sb.append(Character.toUpperCase(temp.charAt(0)));
				sb.append(temp.substring(1).toLowerCase());
			}
		}
		return sb.toString();
	}

}
