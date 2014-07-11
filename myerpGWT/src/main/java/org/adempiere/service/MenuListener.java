package org.adempiere.service;

import javax.persistence.PostRemove;
import javax.persistence.PrePersist;

import org.adempiere.model.ADMenu;

public class MenuListener extends EntityListener<ADMenu> {

	@PrePersist
	public void onPrePersist(ADMenu entity) {
		System.out.println("Persist1:" + entity.getName());
		entity.setADTreeID(10);
		entity.setParentID(0);
		entity.setSeqNo(99);
		entity.setEntityType("D");
	}

	@PostRemove
	public void onPostRemove(ADMenu entity) {
	}

}
