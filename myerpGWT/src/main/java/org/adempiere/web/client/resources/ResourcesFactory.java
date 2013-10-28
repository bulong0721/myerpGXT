package org.adempiere.web.client.resources;

import com.google.gwt.core.shared.GWT;

public class ResourcesFactory {
	private static Images	images;

	public static Images createImages() {
		if (null == images) {
			images = GWT.create(Images.class);
		}
		return images;
	}
}
