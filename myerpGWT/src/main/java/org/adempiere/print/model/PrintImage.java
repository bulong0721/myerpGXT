package org.adempiere.print.model;

import java.awt.Image;

import org.adempiere.model.ADImage;

public class PrintImage extends ADImage {
	private static final long	serialVersionUID	= 1L;

	public PrintImage() {
	}

	public PrintImage(ADImage raw) {
		setADClientID(raw.getADClientID());
		setADImageID(raw.getADImageID());
		setADOrgID(raw.getADOrgID());
		setActive(raw.isActive());
		setBinaryData(raw.getBinaryData());
		setCreated(raw.getCreated());
		setCreatedBy(raw.getCreatedBy());
		setDescription(raw.getDescription());
		setEntityType(raw.getEntityType());
		setImageURL(raw.getImageURL());
		setName(raw.getName());
		setUpdated(raw.getUpdated());
		setUpdatedBy(raw.getUpdatedBy());

	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
