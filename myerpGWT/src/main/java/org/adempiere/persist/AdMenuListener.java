package org.adempiere.persist;

import javax.persistence.PostRemove;
import javax.persistence.PrePersist;

import org.adempiere.model.AdMenu;

public class AdMenuListener extends AdEntityListener<AdMenu> {

	@PrePersist
	public void onPrePersist(AdMenu entity) {
		System.out.println("Persist1:" + entity.getName());
		entity.setAdTreeId(10);
		entity.setParentId(0);
		entity.setSeqno(99);
	}

	@PostRemove
	public void onPostRemove(AdMenu entity) {
	}

}
