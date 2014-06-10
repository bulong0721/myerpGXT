package org.adempiere.persist;

import javax.persistence.PostRemove;
import javax.persistence.PrePersist;

import org.adempiere.model.ADMenu;

public class AdMenuListener extends AdEntityListener<ADMenu> {

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
