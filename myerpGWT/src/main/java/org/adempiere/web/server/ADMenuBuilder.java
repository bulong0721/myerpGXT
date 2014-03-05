package org.adempiere.web.server;

import org.adempiere.model.ADMenu;
import org.adempiere.util.DTOUtil;
import org.adempiere.web.client.model.IsTreeNode;

public class ADMenuBuilder extends ADTreeBuilder<ADMenu> {

	public ADMenuBuilder(int adTreeId) {
		super(adTreeId);
	}

	@Override
	public IsTreeNode toModel(ADMenu entity) {
		return DTOUtil.toMenuModel(entity);
	}

}
