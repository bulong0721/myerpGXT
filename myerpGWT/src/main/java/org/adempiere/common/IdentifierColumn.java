package org.adempiere.common;

import java.io.Serializable;

public class IdentifierColumn implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private Integer	aDColumnID;
	private String	columnName;
	private String	propertyName;

	public IdentifierColumn() {
	}

	public IdentifierColumn(Integer aDColumnID, String columnName, String propertyName) {
		super();
		this.aDColumnID = aDColumnID;
		this.columnName = columnName;
		this.propertyName = propertyName;
	}

	public Integer getaDColumnID() {
		return aDColumnID;
	}

	public void setaDColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

}
