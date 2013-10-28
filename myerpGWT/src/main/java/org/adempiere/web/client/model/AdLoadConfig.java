package org.adempiere.web.client.model;

import org.adempiere.web.shared.AdModelKey;

import com.sencha.gxt.data.shared.loader.PagingLoadConfigBean;

public class AdLoadConfig extends PagingLoadConfigBean {
	private static final long	serialVersionUID	= 1L;
	private String				tableName;
	private AdModelKey			parentKey;

	public AdLoadConfig() {
		super(0, 50);
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public AdModelKey getParentKey() {
		return parentKey;
	}

	public void setParentKey(AdModelKey parentKey) {
		this.parentKey = parentKey;
	}

}
