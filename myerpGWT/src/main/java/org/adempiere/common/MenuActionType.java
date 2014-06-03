package org.adempiere.common;

import java.util.HashMap;
import java.util.Map;

public enum MenuActionType {
	Window("W"), Task("T"), WorkFlow("F"), Process("P"), Report("R"), Form("X"), Workbench("B"), Unknow("");

	private String	value;

	MenuActionType(String value) {
		this.value = value;
	}

	static final Map<String, MenuActionType>	valueMap	= new HashMap<String, MenuActionType>();
	static {
		for (MenuActionType dt : MenuActionType.values()) {
			valueMap.put(dt.getValue(), dt);
		}
	}

	public boolean isWorkbench() {
		if (Workbench.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isForm() {
		if (Form.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isReport() {
		if (Report.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isProcess() {
		if (Process.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isWorkFlow() {
		if (WorkFlow.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isTask() {
		if (Task.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public boolean isWindow() {
		if (Window.value.equalsIgnoreCase(value)) {
			return true;
		}
		return false;
	}

	public String getValue() {
		return value;
	}

	public static MenuActionType fromString(String value) {
		if (valueMap.containsKey(value)) {
			return valueMap.get(value);
		}
		return Unknow;
	}
}
