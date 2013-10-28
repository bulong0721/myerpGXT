package org.adempiere.web.client.apps;

import org.adempiere.web.client.event.ReportToolListener;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.CReportToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class ADReportViewer implements IsWidget, ReportToolListener {

	private static ADReportViewerUiBinder	uiBinder	= GWT.create(ADReportViewerUiBinder.class);

	interface ADReportViewerUiBinder extends UiBinder<Widget, ADReportViewer> {
	}

	@UiField
	CReportToolBar	toolBar;
	@UiField
	Frame			window;

	private Widget	widget	= null;
	private Long	processId;
	
	public ADReportViewer() {
		
	}

	public ADReportViewer(Long iProcessId) {
		super();
		this.processId = iProcessId;
	}

	public Long getProcessId() {
		return processId;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			toolBar.addToolbarListener(this);
			WidgetUtil.doLayout(widget);
		}
		return widget;
	}

	@Override
	public void onCustomize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLookup() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSendMail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAttachment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onExport() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub

	}

}
