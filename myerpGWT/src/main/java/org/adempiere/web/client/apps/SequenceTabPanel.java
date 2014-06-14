package org.adempiere.web.client.apps;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.SequenceModel;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.ButtonStates;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.event.StoreAddEvent;
import com.sencha.gxt.data.shared.event.StoreAddEvent.StoreAddHandler;
import com.sencha.gxt.widget.core.client.form.DualListField;
import com.sencha.gxt.widget.core.client.form.DualListField.Mode;
import com.sencha.gxt.widget.core.client.info.Info;

public class SequenceTabPanel extends AbstractTabPanel {

	private static SequenceTabPanelUiBinder	uiBinder		= GWT.create(SequenceTabPanelUiBinder.class);
	@UiField(provided = true)
	DualListField<SequenceModel, String>	seqField;
	private ListStore<SequenceModel>		fromStore		= null;
	private ListStore<SequenceModel>		toStore			= null;
	private boolean							observeChanges	= false;
	private String							leftString, rightString;

	interface SequenceTabPanelUiBinder extends UiBinder<Widget, SequenceTabPanel> {
	}

	public SequenceTabPanel(ADWindowPanel windowPanel, TabModel tabModel, CWindowToolBar toolBar) {
		super(windowPanel, tabModel, toolBar);
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.createDualListField();
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	static class SequenceValueProvider implements ValueProvider<SequenceModel, String> {
		private static final String	PATH_NAME	= "name";

		@Override
		public String getValue(SequenceModel model) {
			return model.getName();
		}

		@Override
		public void setValue(SequenceModel model, String value) {
			model.setName(value);
		}

		@Override
		public String getPath() {
			return PATH_NAME;
		}
	}

	static class SequenceKeyProvider implements ModelKeyProvider<SequenceModel> {
		@Override
		public String getKey(SequenceModel model) {
			return model.getName();
		}
	}

	class DataAddHandler implements StoreAddHandler<SequenceModel> {
		@Override
		public void onAdd(StoreAddEvent<SequenceModel> event) {
			if (observeChanges) {
				refreshToolBar();
			}
		}
	}

	private void createDualListField() {
		ModelKeyProvider<? super SequenceModel> keyProvider = new SequenceKeyProvider();
		DataAddHandler dcHandler = new DataAddHandler();
		fromStore = new ListStore<SequenceModel>(keyProvider);
		fromStore.addStoreAddHandler(dcHandler);
		toStore = new ListStore<SequenceModel>(keyProvider);
		toStore.addStoreAddHandler(dcHandler);

		ValueProvider<SequenceModel, String> valueProvider = new SequenceValueProvider();
		Cell<String> cell = new TextCell();
		seqField = new DualListField<SequenceModel, String>(fromStore, toStore, valueProvider, cell);
		seqField.setMode(Mode.INSERT);
		seqField.setEnableDnd(true);
	}

	@Override
	public void saveOrUpdateRecord() {
		AsyncCallback<Void> callback = new AsyncSuccessCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				SequenceTabPanel.this.commitChanges();
				SequenceTabPanel.this.refreshToolBar();
				Info.display("adempiere", "Update Success.");
			}

		};
		adempiereService.updateSequences(getResult(), tabModel.getTableName(), callback);
	}

	/**
	 * 
	 */
	public void commitChanges() {
		fromStore.commitChanges();
		toStore.commitChanges();
		leftString = getSeqString(fromStore);
		rightString = getSeqString(toStore);
	}

	/**
	 * @return
	 */
	public List<SequenceModel> getResult() {
		List<SequenceModel> seqList = new ArrayList<SequenceModel>();
		for (int i = 0; i < fromStore.size(); i++) {
			SequenceModel seqModel = fromStore.get(i);
			seqModel.setSeqNo(0);
			seqList.add(seqModel);
		}
		for (int i = 0; i < toStore.size(); i++) {
			SequenceModel seqModel = toStore.get(i);
			seqModel.setSeqNo((i + 1) * 10);
			seqList.add(seqModel);
		}
		return seqList;
	}

	@Override
	protected ButtonStates computeToolBarState() {
		ButtonStates btnStates = toolBar.getButtonStates();
		btnStates.enableFirst = false;
		btnStates.enableNext = false;
		btnStates.enablePrevious = false;
		btnStates.enableLast = false;
		btnStates.enableFind = false;
		btnStates.enableActiveWorkflows = false;
		btnStates.enableGridToggle = false;
		btnStates.enableRequests = false;
		btnStates.enableReport = false;
		btnStates.enableUndoChange = hasChanges();
		btnStates.enableSave = hasChanges();
		btnStates.enableNew = false;
		btnStates.enableCopy = false;
		btnStates.enableDelete = false;
		btnStates.enableDeleteSelection = false;
		btnStates.enableRefresh = !hasChanges();
		btnStates.enableAttachment = false;
		btnStates.enableChat = !hasChanges();
		btnStates.enableHistoryRecords = false;
		btnStates.enablePrint = false;
		btnStates.enablePrintView = false;
		return btnStates;
	}

	@Override
	public void loadData(final PageRequest loadCfg) {
		loadCfg.setTableName(tabModel.getTableName());
		if (0 != tabModel.getTabLevel() && null == loadCfg.getParentKey()) {
			loadCfg.setParentKey(windowPanel.getParentTab(this).getSelectedKey());
		}
		parentModelKey = loadCfg.getParentKey();
		observeChanges = false;
		AsyncCallback<List<SequenceModel>> callback = new AsyncSuccessCallback<List<SequenceModel>>() {
			@Override
			public void onSuccess(List<SequenceModel> result) {
				fromStore.clear();
				toStore.clear();
				leftString = "";
				rightString = "";
				for (SequenceModel seqModel : result) {
					if (null == seqModel.getSeqNo() || 0 == seqModel.getSeqNo()) {
						leftString += seqModel.getSeqID() + ",";
						fromStore.add(seqModel);
					} else {
						rightString += seqModel.getSeqID() + ",";
						toStore.add(seqModel);
					}
				}
				fromStore.commitChanges();
				toStore.commitChanges();
				observeChanges = true;
				refreshToolBar();
			}
		};
		adempiereService.getSequences(loadCfg, callback);
	}

	@Override
	public void undoChange() {
		this.loadData();
	}

	@Override
	public boolean hasChanges() {
		if (!leftString.equalsIgnoreCase(getSeqString(fromStore))) {
			return true;
		}
		if (!rightString.equalsIgnoreCase(getSeqString(toStore))) {
			return true;
		}
		return false;
	}

	private String getSeqString(ListStore<SequenceModel> store) {
		String seqString = "";
		for (int i = 0; i < store.size(); i++) {
			seqString += store.get(i).getSeqID() + ",";
		}
		return seqString;
	}
}
