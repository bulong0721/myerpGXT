package org.adempiere.model.common;

import java.io.Serializable;

public class ADModelKey implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				keyField;
	private Integer				keyValue;

	public ADModelKey(String keyField, Integer keyValue) {
		super();
		this.keyField = keyField;
		this.keyValue = keyValue;
	}

	public ADModelKey() {
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
