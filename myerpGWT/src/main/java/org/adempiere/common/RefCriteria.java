package org.adempiere.common;

import java.io.Serializable;

public class RefCriteria implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				adTable;
	private String				keyColumn;
	private String				displayColumn;
	private Boolean				isvaluedisplayed;
	private String				orderbyclause;
	private String				whereclause;

	public RefCriteria(String adTable, String keyColumn, String displayColumn, Boolean isvaluedisplayed,
			String orderbyclause, String whereclause) {
		super();
		this.adTable = adTable;
		this.keyColumn = keyColumn;
		this.displayColumn = displayColumn;
		this.isvaluedisplayed = isvaluedisplayed;
		this.orderbyclause = orderbyclause;
		this.whereclause = whereclause;
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
		return isvaluedisplayed;
	}

	public void setIsvaluedisplayed(Boolean isvaluedisplayed) {
		this.isvaluedisplayed = isvaluedisplayed;
	}

	public String getOrderbyclause() {
		return orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
	}

	public String getWhereclause() {
		return whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

}
