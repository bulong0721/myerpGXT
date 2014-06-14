package org.adempiere.web.client.util;

import java.math.BigDecimal;

import org.adempiere.common.ADUserContext;
import org.adempiere.common.DisplayType;
import org.adempiere.web.client.model.FieldModel;

public final class ContextUtil {

	private static ADUserContext	userContext;

	private ContextUtil() {
	}

	public static ADUserContext getUserContext() {
		return userContext;
	}

	public static void setUserContext(ADUserContext userContext) {
		ContextUtil.userContext = userContext;
	}

	/**
	 * @param field
	 * @return
	 */
	public static Object getDefaultValue(FieldModel field) {
		// TODO undone
		String defaultString = field.getDefaultValue();
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
			return getUserContext().getADClientID();
		} else if ("AD_Client_Name".equalsIgnoreCase(varName)) {
			return "System";
		} else if ("AD_Org_ID".equalsIgnoreCase(varName)) {
			return getUserContext().getADOrgID();
		} else if ("AD_User_ID".equalsIgnoreCase(varName)) {
			return getUserContext().getADUserID();
		} else if ("AD_User_Name".equalsIgnoreCase(varName)) {
			return getUserContext().getName();
		}
		LoggingUtil.info("xxxxxxxxxxxxxxVariable is null:" + varName);
		return null;
	}

}
