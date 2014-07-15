package org.adempiere.common;

import java.io.Serializable;

public class RefCriteria implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				adTable;
	private String				keyColumn;
	private String				displayColumn;
	private Boolean				valueDisplayed;
	private String				orderByClause;
	private String				whereClause;

	public RefCriteria(String adTable, String keyColumn, String displayColumn, Boolean isvaluedisplayed,
			String orderbyclause, String whereclause) {
		super();
		this.adTable = adTable;
		this.keyColumn = keyColumn;
		this.displayColumn = displayColumn;
		this.valueDisplayed = isvaluedisplayed;
		this.orderByClause = orderbyclause;
		this.whereClause = whereclause;
	}

	public String getAdTable() {
		return adTable;
	}

	public void setAdTable(String adTable) {
		this.adTable = adTable;
	}

	public String getKeyColumn() {
		return keyColumn;
	}

	public void setKeyColumn(String keyColumn) {
		this.keyColumn = keyColumn;
	}

	public String getDisplayColumn() {
		return displayColumn;
	}

	public void setDisplayColumn(String displayColumn) {
		this.displayColumn = displayColumn;
	}

	public Boolean getIsvaluedisplayed() {
		return valueDisplayed;
	}

	public void setIsvaluedisplayed(Boolean isvaluedisplayed) {
		this.valueDisplayed = isvaluedisplayed;
	}

	public String getOrderbyclause() {
		return orderByClause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderByClause = orderbyclause;
	}

	public String getWhereclause() {
		return whereClause;
	}

	public void setWhereclause(String whereclause) {
		this.whereClause = whereclause;
	}

}
