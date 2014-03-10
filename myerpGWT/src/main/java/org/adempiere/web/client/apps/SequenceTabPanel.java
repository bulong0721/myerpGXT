package org.adempiere.web.client.apps;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADFeedback;
import org.adempiere.web.client.model.ADSequenceModel;
import org.adempiere.web.client.model.ADTabModel;
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
	DualListField<ADSequenceModel, String>	seqField;
	private ListStore<ADSequenceModel>		fromStore		= null;
	private ListStore<ADSequenceModel>		toStore			= null;
	private boolean							observeChanges	= false;
	private String							leftString, rightString;

	interface SequenceTabPanelUiBinder extends UiBinder<Widget, SequenceTabPanel> {
	}

	public SequenceTabPanel(ADWindowPanel windowPanel, ADTabModel tabModel, CWindowToolBar toolBar) {
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

	static class SequenceValueProvider implements ValueProvider<ADSequenceModel, String> {
		private static final String	PATH_NAME	= "name";

		@Override
		public String getValue(ADSequenceModel model) {
			return model.getName();
		}

		@Override
		public void setValue(ADSequenceModel model, String value) {
			model.setName(value);
		}

		@Override
		public String getPath() {
			return PATH_NAME;
		}
	}

	static class SequenceKeyProvider implements ModelKeyProvider<ADSequenceModel> {
		@Override
		public String getKey(ADSequenceModel model) {
			return model.getName();
		}
	}

	class DataAddHandler implements StoreAddHandler<ADSequenceModel> {
		@Override
		public void onAdd(StoreAddEvent<ADSequenceModel> event) {
			if (observeChanges) {
				refreshToolBar();
			}
		}
	}

	private void createDualListField() {
		ModelKeyProvider<? super ADSequenceModel> keyProvider = new SequenceKeyProvider();
		DataAddHandler dcHandler = new DataAddHandler();
		fromStore = new ListStore<ADSequenceModel>(keyProvider);
		fromStore.addStoreAddHandler(dcHandler);
		toStore = new ListStore<ADSequenceModel>(keyProvider);
		toStore.addStoreAddHandler(dcHandler);

		ValueProvider<ADSequenceModel, String> valueProvider = new SequenceValueProvider();
		Cell<String> cell = new TextCell();
		seqField = new DualListField<ADSequenceModel, String>(fromStore, toStore, valueProvider, cell);
		seqField.setMode(Mode.INSERT);
		seqField.setEnableDnd(true);
	}

	@Override
	public void saveOrUpdateRecord() {
		AsyncCallback<ADFeedback> callback = new AsyncSuccessCallback<ADFeedback>() {
			@Override
			public void onSuccess(ADFeedback result) {
				if (result.isSuccess()) {
					SequenceTabPanel.this.commitChanges();
					SequenceTabPanel.this.refreshToolBar();
					Info.display("adempiere", "Update Success.");
				} else {
					Info.display("adempiere", "Update Failed:" + result.getErrorMessage());
				}
			}

		};
		adempiereService.updateSequences(getResult(), tabModel.getTablename(), callback);
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
	public List<ADSequenceModel> getResult() {
		List<ADSequenceModel> seqList = new ArrayList<ADSequenceModel>();
		for (int i = 0; i < fromStore.size(); i++) {
			ADSequenceModel seqModel = fromStore.get(i);
			seqModel.setSeqNo(0);
			seqList.add(seqModel);
		}
		for (int i = 0; i < toStore.size(); i++) {
			ADSequenceModel seqModel = toStore.get(i);
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
	public void loadData(final ADLoadConfig loadCfg) {
		loadCfg.setTableName(tabModel.getTablename());
		if (0 != tabModel.getTablevel() && null == loadCfg.getParentKey()) {
			loadCfg.setParentKey(windowPanel.getParentTab(this).getSelectedKey());
		}
		parentModelKey = loadCfg.getParentKey();
		observeChanges = false;
		AsyncCallback<List<ADSequenceModel>> callback = new AsyncSuccessCallback<List<ADSequenceModel>>() {
			@Override
			public void onSuccess(List<ADSequenceModel> result) {
				fromStore.clear();
				toStore.clear();
				leftString = "";
				rightString = "";
				for (ADSequenceModel seqModel : result) {
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

	private String getSeqString(ListStore<ADSequenceModel> store) {
		String seqString = "";
		for (int i = 0; i < store.size(); i++) {
			seqString += store.get(i).getSeqID() + ",";
		}
		return seqString;
	}
}
