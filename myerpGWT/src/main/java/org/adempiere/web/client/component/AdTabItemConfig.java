package org.adempiere.web.client.component;

import com.sencha.gxt.widget.core.client.TabItemConfig;

public class AdTabItemConfig extends TabItemConfig implements HasAttachment {
	private Object	attachment;

	public AdTabItemConfig() {
		super();
	}

	public AdTabItemConfig(String text, boolean close) {
		super(text, close);
	}

	public AdTabItemConfig(String text) {
		super(text);
	}

	@Override
	public Object getAttachment() {
		return attachment;
	}

	@Override
	public void setAttachment(Object attachment) {
		this.attachment = attachment;
	}

}
