package org.adempiere.persist;

import javax.persistence.*;

import org.adempiere.model.AdMenu;
import org.adempiere.model.AdTreenode;
import org.adempiere.model.AdTreenodePK;
import org.adempiere.util.POUtil;

public class AdMenuListener extends AdEntityListener<AdMenu> {

	private static final int	MENU_TREE_ID	= 10;

	@PrePersist
	public void onPrePersist(AdMenu entity) {
		System.out.println("Persist1:" + entity.getName());
		AdTreenode node = new AdTreenode(MENU_TREE_ID, entity.getAdMenuId());
		node.setAdClientId(entity.getAdClientId());
		node.setAdOrgId(entity.getAdOrgId());
		node.setParentId(0);
		node.setSeqno(99);
		POUtil.initADEntity(node);
//		entity.setAdTreeNode(node);
	}

	@PostRemove
	public void onPostRemove(AdMenu entity) {
		AdTreenodePK nodePK = new AdTreenodePK();
		nodePK.setAdTreeId(MENU_TREE_ID);
		nodePK.setNodeId(entity.getAdMenuId());
		super.remove(AdTreenode.class, nodePK);
	}

}
