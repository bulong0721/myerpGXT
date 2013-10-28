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
	ToolBar					toolBar;
	@UiField(provided = true)
	IconButton				btnUndoChange;
	@UiField(provided = true)
	IconButton				btnHelp, btnNew, btnCopy, btnDelete, btnDeleteSelection, btnSave;
	@UiField(provided = true)
	IconButton				btnRefresh, btnFind, btnChat, btnAttachment;
	@UiField(provided = true)
	IconButton				btnGridToggle;
	@UiField(provided = true)
	IconButton				btnHistoryRecords, btnParentRecord, btnDetailRecord;
	@UiField(provided = true)
	IconButton				btnFirst, btnPrevious, btnNext, btnLast;
	@UiField(provided = true)
	IconButton				btnReport, btnPrintView, btnPrint;
	@UiField(provided = true)
	IconButton				btnActiveWorkflows, btnRequests;

	private WindowToolListener	listener;
	private Widget			widget;

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

	@UiHandler({ "btnUndoChange", "btnNew", "btnCopy", "btnDelete", "btnDeleteSelection", "btnSave" })
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
		} else if (btnDeleteSelection == event.getSource()) {
			listener.onDeleteSelection();
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

	@UiHandler({ "btnReport", "btnPrintView", "btnPrint" })
	void onReportSelected(SelectEvent event) {
		checkListener();
		if (btnReport == event.getSource()) {
			listener.onReport();
		} else if (btnPrintView == event.getSource()) {
			listener.onPrint();
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
		btnDeleteSelection = WidgetUtil.createIconButton("images/icons/DeleteSelection24.png");
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
		btnPrintView = WidgetUtil.createIconButton("images/icons/PrintPreview24.gif");
		btnPrint = WidgetUtil.createIconButton("images/icons/Print24.png");
		btnActiveWorkflows = WidgetUtil.createIconButton("images/icons/WorkFlow24.png");
		btnRequests = WidgetUtil.createIconButton("images/icons/Request24.png");
	}

	public void setWindowState(WindowStatus ws) {
		this.btnParentRecord.setEnabled(false);
		this.btnDetailRecord.setEnabled(false);
		if (ws.getTotalCount() > 1) {
			this.btnParentRecord.setEnabled(ws.getCurrentIndex() > 0);
			this.btnDetailRecord.setEnabled(ws.getCurrentIndex() + 1 < ws.getTotalCount());
		}
	}

	public void setTabState(TabStatus ts) {
		this.btnFirst.setEnabled(false);
		this.btnNext.setEnabled(false);
		this.btnPrevious.setEnabled(false);
		this.btnLast.setEnabled(false);
		if (ts.getTotalCount() > 1) {
			this.btnFirst.setEnabled(ts.getTotalCount() > 0);
			this.btnNext.setEnabled(ts.getCurrentIndex() + 1 < ts.getTotalCount());
			this.btnPrevious.setEnabled(ts.getTotalCount() > 0);
			this.btnLast.setEnabled(ts.getCurrentIndex() + 1 < ts.getTotalCount());
		}

		this.btnUndoChange.setEnabled(ts.hasChanges());
		this.btnSave.setEnabled(ts.hasChanges());

		this.btnCopy.setEnabled(!ts.hasChanges());
		this.btnDelete.setEnabled(!ts.hasChanges());
		this.btnDeleteSelection.setEnabled(!ts.hasChanges());
	}

	public static interface WindowStatus {
		int getTotalCount();

		int getCurrentIndex();
	}

	public static interface TabStatus {
		boolean hasChanges();

		int getTotalCount();

		int getCurrentIndex();
	}

}
