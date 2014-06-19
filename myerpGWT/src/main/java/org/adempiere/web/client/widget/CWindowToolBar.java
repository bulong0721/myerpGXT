package org.adempiere.web.client.widget;

import org.adempiere.web.client.event.WindowToolListener;
import org.adempiere.web.client.util.WidgetUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

public class CWindowToolBar implements IsWidget {

	private static AToolBarUiBinder	uiBinder	= GWT.create(AToolBarUiBinder.class);

	interface AToolBarUiBinder extends UiBinder<Widget, CWindowToolBar> {
	}

	@UiField
	ToolBar						toolBar;
	@UiField(provided = true)
	IconButton					btnUndoChange;
	@UiField(provided = true)
	IconButton					btnHelp, btnNew, btnCopy, btnDelete, btnSave;
	@UiField(provided = true)
	IconButton					btnRefresh, btnFind, btnChat, btnAttachment;
	@UiField(provided = true)
	IconButton					btnGridToggle;
	@UiField(provided = true)
	IconButton					btnHistoryRecords, btnParentRecord, btnDetailRecord;
	@UiField(provided = true)
	IconButton					btnFirst, btnPrevious, btnNext, btnLast;
	@UiField(provided = true)
	IconButton					btnReport, btnPrint;
	@UiField(provided = true)
	IconButton					btnActiveWorkflows, btnRequests;

	private WindowToolListener	listener;
	private Widget				widget;

	public void addToolbarListener(WindowToolListener listener) {
		this.listener = listener;
	}

	private void checkListener() {
		if (null == listener) {
			throw new IllegalArgumentException();
		}
	}

	@UiHandler({ "btnHelp" })
	void onHelpSelected(SelectEvent event) {
		checkListener();
		listener.onHelp();
	}

	@UiHandler({ "btnUndoChange", "btnNew", "btnCopy", "btnDelete", "btnSave" })
	void onEditSelected(SelectEvent event) {
		checkListener();
		if (btnUndoChange == event.getSource()) {
			listener.onIgnore();
		} else if (btnNew == event.getSource()) {
			listener.onNew();
		} else if (btnCopy == event.getSource()) {
			listener.onCopy();
		} else if (btnDelete == event.getSource()) {
			listener.onDelete();
		} else if (btnSave == event.getSource()) {
			listener.onSave();
		}
	}

	@UiHandler({ "btnRefresh", "btnFind", "btnChat", "btnAttachment" })
	void onMiscSelected(SelectEvent event) {
		checkListener();
		if (btnRefresh == event.getSource()) {
			listener.onRefresh();
		} else if (btnFind == event.getSource()) {
			listener.onFind();
		} else if (btnChat == event.getSource()) {

		} else if (btnAttachment == event.getSource()) {
			listener.onAttachment();
		}
	}

	@UiHandler({ "btnGridToggle" })
	void onToggleSelected(SelectEvent event) {
		checkListener();
		listener.onToggle();
	}

	@UiHandler({ "btnHistoryRecords", "btnParentRecord", "btnDetailRecord" })
	void onRecordSelected(SelectEvent event) {
		checkListener();
		if (btnHistoryRecords == event.getSource()) {
			listener.onHistoryRecords();
		} else if (btnParentRecord == event.getSource()) {
			listener.onParentRecord();
		} else if (btnDetailRecord == event.getSource()) {
			listener.onDetailRecord();
		}
	}

	@UiHandler({ "btnFirst", "btnPrevious", "btnNext", "btnLast" })
	void onNavgateSelected(SelectEvent event) {
		checkListener();
		if (btnFirst == event.getSource()) {
			listener.onFirst();
		} else if (btnPrevious == event.getSource()) {
			listener.onPrevious();
		} else if (btnNext == event.getSource()) {
			listener.onNext();
		} else if (btnLast == event.getSource()) {
			listener.onLast();
		}
	}

	@UiHandler({ "btnReport", "btnPrint" })
	void onReportSelected(SelectEvent event) {
		checkListener();
		if (btnReport == event.getSource()) {
			listener.onReport();
		} else if (btnPrint == event.getSource()) {
			listener.onPrint();
		}
	}

	@UiHandler({ "btnActiveWorkflows", "btnRequests" })
	void onRequestSelected(SelectEvent event) {
		checkListener();
		if (btnActiveWorkflows == event.getSource()) {
			listener.onActiveWorkflows();
		} else if (btnRequests == event.getSource()) {
			listener.onRequests();
		}
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			initWidget();
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	void initWidget() {
		btnUndoChange = WidgetUtil.createIconButton("images/icons/Undo24.png");
		btnHelp = WidgetUtil.createIconButton("images/icons/Help24.png");
		btnNew = WidgetUtil.createIconButton("images/icons/New24.png");
		btnCopy = WidgetUtil.createIconButton("images/icons/Copy24.png");
		btnDelete = WidgetUtil.createIconButton("images/icons/Delete24.png");
		btnSave = WidgetUtil.createIconButton("images/icons/Save24.png");
		btnRefresh = WidgetUtil.createIconButton("images/icons/Refresh24.png");
		btnFind = WidgetUtil.createIconButton("images/icons/Find24.png");
		btnAttachment = WidgetUtil.createIconButton("images/icons/Attachment24.png");
		btnChat = WidgetUtil.createIconButton("images/icons/Chat24.png");
		btnGridToggle = WidgetUtil.createIconButton("images/icons/Assignment24.png");
		btnHistoryRecords = WidgetUtil.createIconButton("images/icons/History24.png");
		btnParentRecord = WidgetUtil.createIconButton("images/icons/Parent24.png");
		btnDetailRecord = WidgetUtil.createIconButton("images/icons/Detail24.png");
		btnFirst = WidgetUtil.createIconButton("images/icons/First24.png");
		btnPrevious = WidgetUtil.createIconButton("images/icons/Previous24.png");
		btnNext = WidgetUtil.createIconButton("images/icons/Next24.png");
		btnLast = WidgetUtil.createIconButton("images/icons/Last24.png");
		btnReport = WidgetUtil.createIconButton("images/icons/Report24.png");
		btnPrint = WidgetUtil.createIconButton("images/icons/Print24.png");
		btnActiveWorkflows = WidgetUtil.createIconButton("images/icons/WorkFlow24.png");
		btnRequests = WidgetUtil.createIconButton("images/icons/Request24.png");
	}

	public ButtonStates getButtonStates() {
		ButtonStates btnStates = new ButtonStates();
		btnStates.enableUndoChange = btnUndoChange.isEnabled();
		btnStates.enableHelp = btnHelp.isEnabled();
		btnStates.enableNew = btnNew.isEnabled();
		btnStates.enableCopy = btnCopy.isEnabled();
		btnStates.enableDelete = btnDelete.isEnabled();
		btnStates.enableSave = btnSave.isEnabled();
		btnStates.enableRefresh = btnRefresh.isEnabled();
		btnStates.enableFind = btnFind.isEnabled();
		btnStates.enableChat = btnChat.isEnabled();
		btnStates.enableAttachment = btnAttachment.isEnabled();
		btnStates.enableGridToggle = btnGridToggle.isEnabled();
		btnStates.enableHistoryRecords = btnHistoryRecords.isEnabled();
		btnStates.enableParentRecord = btnParentRecord.isEnabled();
		btnStates.enableDetailRecord = btnDetailRecord.isEnabled();
		btnStates.enableFirst = btnFirst.isEnabled();
		btnStates.enablePrevious = btnPrevious.isEnabled();
		btnStates.enableNext = btnNext.isEnabled();
		btnStates.enableLast = btnLast.isEnabled();
		btnStates.enableReport = btnReport.isEnabled();
		btnStates.enablePrint = btnPrint.isEnabled();
		btnStates.enableActiveWorkflows = btnActiveWorkflows.isEnabled();
		btnStates.enableRequests = btnRequests.isEnabled();
		return btnStates;
	}

	public void refreshStates(ButtonStates btnStates) {
		btnUndoChange.setEnabled(btnStates.enableUndoChange);
		btnHelp.setEnabled(btnStates.enableHelp);
		btnNew.setEnabled(btnStates.enableNew);
		btnCopy.setEnabled(btnStates.enableCopy);
		btnDelete.setEnabled(btnStates.enableDelete);
		btnSave.setEnabled(btnStates.enableSave);
		btnRefresh.setEnabled(btnStates.enableRefresh);
		btnFind.setEnabled(btnStates.enableFind);
		btnChat.setEnabled(btnStates.enableChat);
		btnAttachment.setEnabled(btnStates.enableAttachment);
		btnGridToggle.setEnabled(btnStates.enableGridToggle);
		btnHistoryRecords.setEnabled(btnStates.enableHistoryRecords);
		btnParentRecord.setEnabled(btnStates.enableParentRecord);
		btnDetailRecord.setEnabled(btnStates.enableDetailRecord);
		btnFirst.setEnabled(btnStates.enableFirst);
		btnPrevious.setEnabled(btnStates.enablePrevious);
		btnNext.setEnabled(btnStates.enableNext);
		btnLast.setEnabled(btnStates.enableLast);
		btnReport.setEnabled(btnStates.enableReport);
		btnPrint.setEnabled(btnStates.enablePrint);
		btnActiveWorkflows.setEnabled(btnStates.enableActiveWorkflows);
		btnRequests.setEnabled(btnStates.enableRequests);
	}

	public static class ButtonStates {
		public boolean	enableUndoChange;
		public boolean	enableHelp, enableNew, enableCopy, enableDelete, enableDeleteSelection, enableSave;
		public boolean	enableRefresh, enableFind, enableChat, enableAttachment;
		public boolean	enableGridToggle;
		public boolean	enableHistoryRecords, enableParentRecord, enableDetailRecord;
		public boolean	enableFirst, enablePrevious, enableNext, enableLast;
		public boolean	enableReport, enablePrintView, enablePrint;
		public boolean	enableActiveWorkflows, enableRequests;

		public static ButtonStates newAllEnable() {
			ButtonStates btnStates = new ButtonStates();
			btnStates.enableUndoChange = true;
			btnStates.enableHelp = true;
			btnStates.enableNew = true;
			btnStates.enableCopy = true;
			btnStates.enableDelete = true;
			btnStates.enableDeleteSelection = true;
			btnStates.enableSave = true;
			btnStates.enableRefresh = true;
			btnStates.enableFind = true;
			btnStates.enableChat = true;
			btnStates.enableAttachment = true;
			btnStates.enableGridToggle = true;
			btnStates.enableHistoryRecords = true;
			btnStates.enableParentRecord = true;
			btnStates.enableDetailRecord = true;
			btnStates.enableFirst = true;
			btnStates.enablePrevious = true;
			btnStates.enableNext = true;
			btnStates.enableLast = true;
			btnStates.enableReport = true;
			btnStates.enablePrintView = true;
			btnStates.enablePrint = true;
			btnStates.enableActiveWorkflows = true;
			btnStates.enableRequests = true;
			return btnStates;
		}

		public static ButtonStates newAllDisable() {
			ButtonStates btnStates = new ButtonStates();
			return btnStates;
		}
	}

}
