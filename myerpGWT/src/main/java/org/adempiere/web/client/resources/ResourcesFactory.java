package org.adempiere.web.client.resources;

import org.adempiere.web.client.Constants;
import org.adempiere.web.client.Messages;

import com.google.gwt.core.shared.GWT;

public class ResourcesFactory {
	private static Constants	constants;
	private static Images		images;
	private static Messages		messages;

	public static Images getImages() {
		if (null == images) {
			images = GWT.create(Images.class);
		}
		return images;
	}

	public static Constants getConstants() {
		if (null == constants) {
			constants = GWT.create(Constants.class);
		}
		return constants;
	}

	public static Messages getMessages() {
		if (null == messages) {
			messages = GWT.create(Messages.class);
		}
		return messages;
	}

	public static void reset() {
		constants = null;
		messages = null;
	}
}
