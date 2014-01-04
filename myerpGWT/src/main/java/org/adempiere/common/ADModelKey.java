package org.adempiere.common;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keyField == null) ? 0 : keyField.hashCode());
		result = prime * result + ((keyValue == null) ? 0 : keyValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ADModelKey other = (ADModelKey) obj;
		if (keyField == null) {
			if (other.keyField != null)
				return false;
		} else if (!keyField.equals(other.keyField))
			return false;
		if (keyValue == null) {
			if (other.keyValue != null)
				return false;
		} else if (!keyValue.equals(other.keyValue))
			return false;
		return true;
	}

}
