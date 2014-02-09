package org.adempiere.web.client.util;

import java.math.BigDecimal;

import org.adempiere.common.DisplayType;
import org.adempiere.web.client.model.ADFieldModel;

public final class ContextUtil {

	/**
	 * @param field
	 * @return
	 */
	public static Object getDefaultValue(ADFieldModel field) {
		// TODO undone
		String defaultString = field.getDefaultvalue();
		if (defaultString.startsWith("@")) {
			String varName = StringUtil.strip(defaultString, "@#$");
			return getVariable(varName);
		}
		DisplayType displayType = field.getFieldType();
		if (displayType.isBoolean()) {
			return "Y".equalsIgnoreCase(defaultString);
		}
		if (displayType.isFloat()) {
			return new BigDecimal(defaultString);
		}
		if (displayType.isInteger()) {
			return Integer.valueOf(defaultString);
		}
		return defaultString;
	}

	public static Object getVariable(String varName) {
		if ("AD_Client_ID".equalsIgnoreCase(varName)) {
			return 1;
		} else if ("AD_Client_Name".equalsIgnoreCase(varName)) {
			return "System";
		} else if ("AD_Org_ID".equalsIgnoreCase(varName)) {
			return 1;
		} else if ("AD_User_ID".equalsIgnoreCase(varName)) {
			return 100;
		} else if ("AD_User_Name".equalsIgnoreCase(varName)) {
			return "SuperUser";
		}
		LoggingUtil.info("xxxxxxxxxxxxxxVariable is null:" + varName);
		return null;
	}

}
