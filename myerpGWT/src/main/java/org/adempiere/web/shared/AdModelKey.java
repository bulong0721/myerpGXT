package org.adempiere.web.shared;

import java.io.Serializable;

public class AdModelKey implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				keyField;
	private Integer				keyValue;

	public AdModelKey(String keyField, Integer keyValue) {
		super();
		this.keyField = keyField;
		this.keyValue = keyValue;
	}

	public AdModelKey() {
	}

	public String getKeyField() {
		return keyField;
	}

	public void setKeyField(String keyField) {
		this.keyField = keyField;
	}

	public Integer getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(Integer keyValue) {
		this.keyValue = keyValue;
	}

}
