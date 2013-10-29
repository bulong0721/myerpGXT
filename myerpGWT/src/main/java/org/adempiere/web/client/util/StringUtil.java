package org.adempiere.web.client.util;

public class StringUtil {

	/**
	 * @param text
	 * @return
	 */
	public static boolean isNullOrEmpty(String text) {
		return (null == text || text.length() == 0);
	}

	public static boolean isNullOrEmpty(String text, boolean trimWhitespaces) {
		if (null != text && trimWhitespaces) {
			return isNullOrEmpty(text.trim());
		}
		return isNullOrEmpty(text);
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

	public static String removeCRLF(String in) {
		char[] inArray = in.toCharArray();
		StringBuffer out = new StringBuffer(inArray.length);
		for (int i = 0; i < inArray.length; i++) {
			char c = inArray[i];
			if (c == '\n' || c == '\r')
				;
			else
				out.append(c);
		}
		return out.toString();
	}

	public static int getCount(String string, char countChar) {
		if (string == null || string.length() == 0)
			return 0;
		int counter = 0;
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == countChar)
				counter++;
		}
		return counter;
	} // getCount

}
