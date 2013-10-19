package com.deppon.foss.shared;

import java.io.Serializable;

public class LookupValue implements Serializable {
	private static final long	serialVersionUID	= 1L;

	private String				display;
	private String				value;

	public LookupValue() {
	}
	
	public LookupValue(String display, Long value) {
		super();
		this.display = display;
		this.value = Long.toString(value);
	}
	
	public LookupValue(String display, long value) {
		super();
		this.display = display;
		this.value = Long.toString(value);
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
