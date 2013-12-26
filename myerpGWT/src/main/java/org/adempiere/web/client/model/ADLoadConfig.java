package org.adempiere.web.client.model;

import org.adempiere.model.common.ADExpression;
import org.adempiere.model.common.ADModelKey;

import com.sencha.gxt.data.shared.loader.PagingLoadConfigBean;

public class ADLoadConfig extends PagingLoadConfigBean implements IsADRPCModel {
	private static final long	serialVersionUID	= 1L;
	private String				tableName;
	private ADModelKey			parentKey;
	private ADExpression		expr;

	public ADLoadConfig() {
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

}
