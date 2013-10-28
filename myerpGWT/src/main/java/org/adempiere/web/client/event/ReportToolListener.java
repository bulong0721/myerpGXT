package org.adempiere.web.client.event;

public interface ReportToolListener {

	void onCustomize();

	void onLookup();

	void onSendMail();

	void onAttachment();

	void onExport();

	void onRefresh();

}
