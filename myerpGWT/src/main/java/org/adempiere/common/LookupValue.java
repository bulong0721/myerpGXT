package org.adempiere.common;

import java.io.Serializable;

public class LookupValue implements Serializable {
	private static final long	serialVersionUID	= 1L;

	private String				display;
	private String				value;

	public LookupValue() {
	}

	public LookupValue(Integer value, String display) {
		super();
		this.display = display;
		this.value = Integer.toString(value);
	}

	public LookupValue(Integer value, String segment1, String segment2) {
		super();
		this.display = join(' ', segment1, segment2);
		this.value = Integer.toString(value);
	}

	public LookupValue(Integer value, String segment1, String segment2, String segment3) {
		super();
		this.display = join(' ', segment1, segment2, segment3);
		this.value = Integer.toString(value);
	}

	public LookupValue(Integer value, String segment1, String segment2, String segment3, String segment4) {
		super();
		this.display = join(' ', segment1, segment2, segment3, segment4);
		this.value = Integer.toString(value);
	}

	public LookupValue(Integer value, Integer display) {
		super();
		this.display = Integer.toString(display);
		this.value = Integer.toString(value);
	}

	public LookupValue(int value, String display) {
		super();
		this.display = display;
		this.value = Integer.toString(value);
	}

	public LookupValue(String value, String display) {
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
	
	String join(char separator, String ... array) {
		StringBuffer buffer = new StringBuffer();
		for (String elem : array) {
			if (null != elem) {
				buffer.append(elem);
			}
			buffer.append(separator);
		}
		return buffer.toString();
	}

}
