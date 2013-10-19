package com.deppon.foss.client.widget;

import java.util.ArrayList;
import java.util.List;

import com.deppon.foss.client.event.ReportToolListener;
import com.deppon.foss.client.util.CommonUtil;
import com.deppon.foss.client.util.WidgetUtil;
import com.deppon.foss.shared.LookupValue;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.ComboBox;

public class CReportToolBar implements IsWidget {

	private static CReportToolBarUiBinder	uiBinder	= GWT.create(CReportToolBarUiBinder.class);

	interface CReportToolBarUiBinder extends UiBinder<Widget, CReportToolBar> {
	}

	@UiField(provided = true)
	ComboBox<LookupValue>		cmbReportType, cmbFormat;
	@UiField
	CheckBox					chkSummary;
	@UiField(provided = true)
	IconButton					btnCustomize, btnLookup, btnSendMail;
	@UiField(provided = true)
	IconButton					btnAttachment, btnExport, btnRefresh;
	private ReportToolListener	listener;
	private Widget				widget;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			initWidget();
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	public void addToolbarListener(ReportToolListener listener) {
		this.listener = listener;
	}

	private void checkListener() {
		if (null == listener) {
			throw new IllegalArgumentException();
		}
	}

	@UiHandler({ "btnAttachment", "btnExport", "btnRefresh" })
	void onExportSelected(SelectEvent event) {
		checkListener();
		if (btnAttachment == event.getSource()) {
			listener.onAttachment();
		} else if (btnExport == event.getSource()) {
			listener.onExport();
		} else if (btnRefresh == event.getSource()) {
			listener.onRefresh();
		}
	}

	@UiHandler({ "btnCustomize", "btnLookup", "btnSendMail" })
	void onReportSelected(SelectEvent event) {
		checkListener();
		if (btnCustomize == event.getSource()) {
			listener.onCustomize();
		} else if (btnLookup == event.getSource()) {
			listener.onLookup();
		} else if (btnSendMail == event.getSource()) {
			listener.onSendMail();
		}
	}

	void initWidget() {
		btnCustomize = WidgetUtil.createIconButton("images/icons/Preference24.png");
		btnLookup = WidgetUtil.createIconButton("images/icons/Find24.png");
		btnSendMail = WidgetUtil.createIconButton("images/icons/SendMail24.png");
		btnAttachment = WidgetUtil.createIconButton("images/icons/Attachment24.png");
		btnExport = WidgetUtil.createIconButton("images/icons/Export24.png");
		btnRefresh = WidgetUtil.createIconButton("images/icons/Refresh24.png");

		LabelProvider<LookupValue> labelProvider = CommonUtil.createLabelProvider();
		List<LookupValue> reportTypes = new ArrayList<LookupValue>();
		reportTypes.add(new LookupValue("PDF", 0L));
		reportTypes.add(new LookupValue("HTML", 1L));
		reportTypes.add(new LookupValue("Excel", 2L));
		ListStore<LookupValue> reportTypeStore = CommonUtil.createDataSource(reportTypes);
		cmbReportType = createComboBox(reportTypeStore, labelProvider);
		cmbReportType.setValue(reportTypes.get(0));

		ListStore<LookupValue> formatStore = CommonUtil.createDataSource();
		cmbFormat = createComboBox(formatStore, labelProvider);
	}

	<T> ComboBox<T> createComboBox(ListStore<T> listStore, LabelProvider<T> labelProvider) {
		ComboBox<T> comboBox = new ComboBox<T>(listStore, labelProvider);
		comboBox.setEditable(false);
		comboBox.setForceSelection(true);
		comboBox.setTriggerAction(TriggerAction.ALL);
		return comboBox;
	}
}
