package org.adempiere.web.server;

import org.adempiere.model.AdMenu;
import org.adempiere.util.DTOUtil;
import org.adempiere.web.client.model.ADTreeNode;

public class ADMenuBuilder extends ADTreeBuilder<AdMenu> {

	public ADMenuBuilder(int adTreeId) {
		super(adTreeId);
	}

	@Override
	public ADTreeNode toModel(AdMenu entity) {
		return DTOUtil.toMenuModel(entity);
	}

}
