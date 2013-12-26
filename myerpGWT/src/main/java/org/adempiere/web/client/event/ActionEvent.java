package org.adempiere.web.client.event;

public class ActionEvent {
	protected Object	source;

	public ActionEvent() {
	}

	public ActionEvent(Object source) {
		super();
		this.source = source;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

}
