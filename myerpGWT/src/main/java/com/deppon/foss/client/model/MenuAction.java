package com.deppon.foss.client.model;

import java.util.HashMap;
import java.util.Map;

public enum MenuAction {
	Window("W"), Task("T"), WorkFlow("F"), Process("P"), Report("R"), Form("X"), Workbench("B");

	private String	value;

	MenuAction(String value) {
		this.value = value;
	}

	static final Map<String, MenuAction>	valueMap	= new HashMap<String, MenuAction>();
	static {
		for (MenuAction dt : MenuAction.values()) {
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

	public static MenuAction fromString(String value) {
		if (valueMap.containsKey(value)) {
			return valueMap.get(value);
		}
		return Window;
	}
}
