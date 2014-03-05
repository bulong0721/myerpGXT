package org.adempiere.common;

import java.io.Serializable;

public class LookupValue implements Serializable {
	private static final long	serialVersionUID	= 1L;

	private String				display;
	private String				value;

	public LookupValue() {
	}
	
	public LookupValue(String display, Integer value) {
		super();
		this.display = display;
		this.value = Integer.toString(value);
	}
	
	public LookupValue(Integer display, Integer value) {
		super();
		this.display = Integer.toString(display);
		this.value = Integer.toString(value);
	}
	
	public LookupValue(String display, int value) {
		super();
		this.display = display;
		this.value = Integer.toString(value);
	}

	public LookupValue(String display, String value) {
		super();
		this.display = display;
		this.value = value;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
