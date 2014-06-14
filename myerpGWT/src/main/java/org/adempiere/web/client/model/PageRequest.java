package org.adempiere.web.client.model;

import org.adempiere.common.ADExpression;
import org.adempiere.common.ADModelKey;

import com.sencha.gxt.data.shared.loader.PagingLoadConfigBean;

public class PageRequest extends PagingLoadConfigBean implements GwtSerializable {
	private static final long	serialVersionUID	= 1L;
	private long				windowID;
	private String				tableName;
	private ADModelKey			parentKey;
	private ADExpression		expr;

	public PageRequest() {
		super(0, 50);
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ADModelKey getParentKey() {
		return parentKey;
	}

	public void setParentKey(ADModelKey parentKey) {
		this.parentKey = parentKey;
	}

	public ADExpression getExpr() {
		return expr;
	}

	public void setExpr(ADExpression expr) {
		this.expr = expr;
	}

	public long getWindowID() {
		return windowID;
	}

	public void setWindowID(long windowID) {
		this.windowID = windowID;
	}

}
