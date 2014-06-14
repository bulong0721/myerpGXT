package org.adempiere.web.server;

import org.adempiere.model.ADMenu;
import org.adempiere.util.DTOUtil;
import org.adempiere.web.client.model.NodeModel;

public class ADMenuBuilder extends ADTreeBuilder<ADMenu> {

	public ADMenuBuilder(int adTreeId) {
		super(adTreeId);
	}

	@Override
	public NodeModel toModel(ADMenu entity) {
		return DTOUtil.toMenuModel(entity);
	}

}
