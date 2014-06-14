package org.adempiere.web.client.apps;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.adempiere.common.ADModelKey;
import org.adempiere.web.client.Messages;
import org.adempiere.web.client.component.ADFormBuilder;
import org.adempiere.web.client.component.ADModelDriver;
import org.adempiere.web.client.component.ADModelReader;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.event.ActionEvent;
import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.form.AbstractForm;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.JSOEntry;
import org.adempiere.web.client.model.JsonResult;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.model.MapEntry.ADModelKeyProvider;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.NodeModel;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.util.ClassUtil;
import org.adempiere.web.client.util.ContextUtil;
import org.adempiere.web.client.util.ExceptionUtil;
import org.adempiere.web.client.util.ExceptionUtil.RPCError;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.LoggingUtil;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.ButtonStates;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.Style.SelectionMode;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.Store.Change;
import com.sencha.gxt.data.shared.Store.Record;
import com.sencha.gxt.data.shared.event.StoreDataChangeEvent;
import com.sencha.gxt.data.shared.event.StoreDataChangeEvent.StoreDataChangeHandler;
import com.sencha.gxt.data.shared.loader.LoadExceptionEvent;
import com.sencha.gxt.data.shared.loader.LoadExceptionEvent.LoadExceptionHandler;
import com.sencha.gxt.data.shared.loader.LoadHandler;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoader;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.event.CancelEditEvent;
import com.sencha.gxt.widget.core.client.event.CancelEditEvent.CancelEditHandler;
import com.sencha.gxt.widget.core.client.event.CompleteEditEvent;
import com.sencha.gxt.widget.core.client.event.CompleteEditEvent.CompleteEditHandler;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.info.Info;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class SimpleTabPanel extends AbstractTabPanel implements ActionListener {
	private static Messages									i18n		= GWT.create(Messages.class);
	private static SimpleTabPanelUiBinder					uiBinder	= GWT.create(SimpleTabPanelUiBinder.class);
	PagingLoader<PageRequest, PagingLoadResult<MapEntry>>	loader		= null;

	interface SimpleTabPanelUiBinder extends UiBinder<Widget, SimpleTabPanel> {
	}

	private MapEntry				newRecord;
	private MapEntry				editRecord;
	private ColumnModel<MapEntry>	cm;
	private ListStore<MapEntry>	store;
	private ADFormBuilder			tabStrategy;
	private GridEditing<MapEntry>	gridEditing;
	private ADModelDriver			adModelDriver;
	private ADModelKeyProvider		keyProvider;
	private ADTreePanel				treePanel;
	@UiField(provided = true)
	Grid<MapEntry>					grid;
	@UiField(provided = true)
	PagingToolBar					pageToolBar;
	@UiField(provided = true)
	AdModelEditor					formEditing;
	@UiField
	CardLayoutContainer				layoutContainer;
	@UiField(provided = true)
	ContentPanel					treeContainer;
	@UiField(provided = true)
	HorizontalLayoutData			treeLayoutData;

	public SimpleTabPanel(ADWindowPanel windowPanel, TabModel tabModel, CWindowToolBar toolBar) {
		super(windowPanel, tabModel, toolBar);
		this.tabStrategy = new ADFormBuilder(tabModel.getFieldList());
		this.tabStrategy.setFieldButtonListener(this);
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.onRender();
			this.widget = uiBinder.createAndBindUi(this);
			refreshToolBar();
		}
		return widget;
	}

	private void onRender() {
		createTree();
		createForm();
		createGrid();
	}

	@Override
	protected ButtonStates computeToolBarState() {
		ButtonStates btnStates = toolBar.getButtonStates();
		btnStates.enableFirst = false;
		btnStates.enableNext = false;
		btnStates.enablePrevious = false;
		btnStates.enableLast = false;
		if (getTotalCount() > 1) {
			btnStates.enableFirst = getCurrentIndex() > 0;
			btnStates.enableNext = getCurrentIndex() + 1 < getTotalCount();
			btnStates.enablePrevious = getCurrentIndex() > 0;
			btnStates.enableLast = getCurrentIndex() + 1 < getTotalCount();
		}
		btnStates.enableUndoChange = hasChanges();
		btnStates.enableSave = hasChanges();
		btnStates.enableNew = !hasChanges();
		btnStates.enableCopy = !hasChanges();
		btnStates.enableDelete = !hasChanges();
		btnStates.enableDeleteSelection = !hasChanges();
		btnStates.enableRefresh = !hasChanges();
		btnStates.enableAttachment = !hasChanges();
		btnStates.enableChat = !hasChanges();
		btnStates.enableHistoryRecords = !hasChanges();
		btnStates.enablePrint = !hasChanges();
		btnStates.enablePrintView = !hasChanges();
		return btnStates;
	}

	private void createGrid() {
		RpcProxy<PageRequest, JsonResult> proxy = new RpcProxy<PageRequest, JsonResult>() {
			@Override
			public void load(PageRequest loadConfig, AsyncCallback<JsonResult> callback) {
				adempiereService.getWindowTabData(loadConfig, callback);
			}
		};
		ADModelReader reader = new ADModelReader();
		loader = new PagingLoader<PageRequest, PagingLoadResult<MapEntry>>(proxy, reader);
		loader.setRemoteSort(true);
		loader.addLoadExceptionHandler(new LoadExceptionHandler<PageRequest>() {
			@Override
			public void onLoadException(LoadExceptionEvent<PageRequest> event) {
				// TODO Auto-generated method stub
				RPCError error = ExceptionUtil.decode(event.getException());
				AlertMessageBox dialog = null;
				if (error.isBusinessException()) {
					dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
					dialog.setIcon(MessageBox.ICONS.warning());
				} else {
					dialog = new AlertMessageBox(i18n.adempiere_System(), error.getMessage());
				}
				dialog.show();
			}
		});
		pageToolBar = new PagingToolBar(50);
		pageToolBar.bind(loader);
		keyProvider = JSOEntry.createKeyProvider(tabModel);
		store = new ListStore<MapEntry>(keyProvider);
		store.addStoreDataChangeHandler(new StoreDataChangeHandler<MapEntry>() {
			@Override
			public void onDataChange(StoreDataChangeEvent<MapEntry> event) {
				grid.getSelectionModel().select(0, false);
				SimpleTabPanel.this.refreshToolBar();
				grid.setLoadMask(true);
			}
		});
		final LoadHandler<PageRequest, PagingLoadResult<MapEntry>> loadHandler;
		loadHandler = new LoadResultListStoreBinding<PageRequest, MapEntry, PagingLoadResult<MapEntry>>(store);
		CheckBoxSelectionModel<MapEntry> selectModel = new CheckBoxSelectionModel<MapEntry>();
		selectModel.setSelectionMode(SelectionMode.MULTI);
		selectModel.addSelectionChangedHandler(new SelectionChangedHandler<MapEntry>() {
			@Override
			public void onSelectionChanged(SelectionChangedEvent<MapEntry> event) {
				// TODO Auto-generated method stub
			}
		});
		loader.addLoadHandler(loadHandler);
		cm = tabStrategy.createColumnModel(selectModel);
		grid = new Grid<MapEntry>(store, cm);
		grid.setLoader(loader);
		grid.setSelectionModel(selectModel);
		gridEditing = tabStrategy.createGridEditing(grid);
		gridEditing.addCompleteEditHandler(new CompleteEditHandler<MapEntry>() {
			@Override
			public void onCompleteEdit(CompleteEditEvent<MapEntry> event) {
				SimpleTabPanel.this.refreshToolBar();
			}
		});
		gridEditing.addCancelEditHandler(new CancelEditHandler<MapEntry>() {
			@Override
			public void onCancelEdit(CancelEditEvent<MapEntry> event) {
				SimpleTabPanel.this.refreshToolBar();
			}
		});
	}

	public ADModelKey getSelectedKey() {
		MapEntry item = grid.getSelectionModel().getSelectedItem();
		if (null != item) {
			return keyProvider.getKeys(item).get(0);
		}
		return null;
	}

	public MapEntry getParentData() {
		SimpleTabPanel parentTab = windowPanel.getParentTab(this);
		if (null != parentTab) {
			return parentTab.getCurrentData();
		}
		return null;
	}

	public MapEntry getCurrentData() {
		return grid.getSelectionModel().getSelectedItem();
	}

	public boolean isGridMode() {
		Widget activeWidget = layoutContainer.getActiveWidget();
		int index = layoutContainer.getWidgetIndex(activeWidget);
		return (0 == index);
	}

	private void createForm() {
		formEditing = new AdModelEditor(tabStrategy);
		formEditing.asWidget();
	}

	private void createTree() {
		treeContainer = new ContentPanel();
		if (tabModel.isHasTree()) {
			treeContainer.setBodyBorder(true);
			treeContainer.setHeadingText(i18n.tabPanel_Tree());
			treeLayoutData = new HorizontalLayoutData(220d, 1d);
			treePanel = new ADTreePanel(MenuModel.TREE_ID);
			treePanel.enableDnD();
			treeContainer.add(treePanel);
		} else {
			treeLayoutData = new HorizontalLayoutData(0d, 1);
		}
	}

	public void toggleMode() {
		Widget activeWidget = layoutContainer.getActiveWidget();
		int index = layoutContainer.getWidgetIndex(activeWidget);
		int nextIndex = (index + 1) % layoutContainer.getWidgetCount();
		Widget nextWidget = layoutContainer.getWidget(nextIndex);
		layoutContainer.setActiveWidget(nextWidget);
		if (null == adModelDriver) {
			adModelDriver = GWT.create(ADModelDriver.class);
			adModelDriver.initialize(formEditing);
		}
		if (isGridMode()) {
			mergeFormChanges();
			refreshToolBar();
		} else {
			editRecord = grid.getSelectionModel().getSelectedItem();
			if (null != editRecord) {
				mergeGridChanges();
			} else {
				newRecord();
				editRecord = newRecord;
			}
		}
	}

	private void mergeGridChanges() {
		MapEntry cloneData = editRecord.deepClone();
		Collection<Change<MapEntry, ?>> changes = store.getRecord(editRecord).getChanges();
		for (Change<MapEntry, ?> change : changes) {
			change.modify(cloneData);
		}
		adModelDriver.edit(cloneData);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void mergeFormChanges() {
		if (null != editRecord) {
			MapEntry data = adModelDriver.flush();
			Record record = store.getRecord(editRecord);
			for (ColumnConfig<MapEntry, ?> cfg : cm.getColumns()) {
				ValueProvider<? super MapEntry, ?> vp = cfg.getValueProvider();
				record.addChange(vp, vp.getValue(data));
			}
			grid.getView().refresh(false);
			adModelDriver.edit(data);
		}
	}

	public void saveOrUpdateRecord() {
		if (tabModel.isHasTree()) {
			Set<NodeModel> changes = treePanel.getChanges();
		}
		AsyncCallback<Void> callback = new AsyncSuccessCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				store.commitChanges();
				SimpleTabPanel.this.newRecord = null;
				SimpleTabPanel.this.refreshToolBar();
				Info.display("adempiere", "Update Success.");
			}
		};
		this.mergeFormChanges();
		String json = getModifyRecords();
		adempiereService.updateData(json, tabModel.getTableName(), callback);
	}

	private String getModifyRecords() {
		JavaScriptObject array = JavaScriptObject.createArray();
		int index = 0;
		for (Store<MapEntry>.Record record : store.getModifiedRecords()) {
			JSOUtil.arraySet(array, index, ((JSOEntry) copyWithChange(record)).getJso());
			index++;
		}
		return JSOUtil.toString(array);
	}

	private MapEntry copyWithChange(Store<MapEntry>.Record record) {
		MapEntry copy = record.getModel().deepClone();
		if (record.isDirty()) {
			for (Change<MapEntry, ?> c : record.getChanges()) {
				c.modify(copy);
			}
		}
		return copy;
	}

	public void deleteRecord() {
		final MapEntry selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to delete");
			box.show();
			return;
		}
		List<ADModelKey> keys = keyProvider.getKeys(selectedData);
		adempiereService.deleteData(keys, tabModel.getTableName(), new AsyncSuccessCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				store.remove(selectedData);
				store.commitChanges();
				grid.getSelectionModel().select(0, false);
				// pageToolBar.refresh();
				grid.getView().refresh(false);
			}
		});
	}

	public void undoChange() {
		if (isGridMode()) {
			gridEditing.cancelEditing();
		} else {
			formEditing.cancelEditing();
		}
		store.rejectChanges();
		if (null != newRecord) {
			store.remove(newRecord);
			editRecord = null;
			newRecord = null;
		}
		refreshToolBar();
	}

	public void newRecord() {
		newRecord = new JSOEntry();
		MapEntry parentData = getParentData();
		for (FieldModel field : tabModel.getFieldList()) {
			String fieldName = field.getPropertyName();
			if (null != field.getDefaultValue()) {
				newRecord.setValue(fieldName, ContextUtil.getDefaultValue(field));
			} else if (null != parentData && field.isParent()) {
				Object parentValue = parentData.getValue(fieldName, field.getFieldType());
				newRecord.setValue(fieldName, parentValue);
			}
		}
		LoggingUtil.info("NewRecord:" + newRecord.toString());
		store.add(newRecord);
		if (!isGridMode()) {
			adModelDriver.edit(newRecord);
		}
		refreshToolBar();
	}

	public void moveFirst() {
		grid.getSelectionModel().select(0, false);
		refreshToolBar();
	}

	public void moveLast() {
		grid.getSelectionModel().select(store.size() - 1, false);
		refreshToolBar();
	}

	public void moveNext() {
		grid.getSelectionModel().selectNext(false);
		refreshToolBar();
	}

	public void movePrevious() {
		grid.getSelectionModel().selectPrevious(false);
		refreshToolBar();
	}

	public void copyRecord() {
		final MapEntry selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to copy");
			box.show();
			return;
		}
		newRecord = (MapEntry) selectedData.deepClone();
		keyProvider.resetKeys(newRecord, tabModel.getTableName());
		store.add(newRecord);
		refreshToolBar();
	}

	public void updateADUserContext() {

	}

	@Override
	public void loadData(PageRequest loadCfg) {
		loadCfg.setTableName(tabModel.getTableName());
		if (0 != tabModel.getTabLevel() && null == loadCfg.getParentKey()) {
			loadCfg.setParentKey(windowPanel.getParentTab(this).getSelectedKey());
		}
		parentModelKey = loadCfg.getParentKey();
		loader.load(loadCfg);
		newRecord = null;
		refreshToolBar();
	}

	@Override
	public boolean hasChanges() {
		boolean gridChanges = !store.getModifiedRecords().isEmpty();
		boolean formChanges = null == adModelDriver ? false : adModelDriver.isDirty();
		boolean hasNewRecord = (null != newRecord);
		return (hasNewRecord || gridChanges || formChanges);
	}

	@Override
	public int getTotalCount() {
		return store.size();
	}

	@Override
	public int getCurrentIndex() {
		MapEntry data = grid.getSelectionModel().getSelectedItem();
		if (null != data) {
			return store.indexOf(data);
		}
		return 0;
	}

	public void refreshRecord() {
		pageToolBar.refresh();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		FieldModel fieldModel = (FieldModel) event.getSource();
		AsyncCallback<FieldModel> callback = new AsyncSuccessCallback<FieldModel>() {
			@Override
			public void onSuccess(FieldModel field) {
				if (hasChanges()) {
					AlertMessageBox dialog = new AlertMessageBox("Adempiere", "Data has changes, please reload data!");
					dialog.show();
					return;
				}
				if (0 == field.getADProcessID()) {
					return;
				}
				AsyncCallback<ProcessModel> callback = new AsyncSuccessCallback<ProcessModel>() {
					@Override
					public void onSuccess(ProcessModel pair) {
						FormModel formModel = pair.getFormModel();
						if (null != formModel) {
							AbstractForm form = ClassUtil.newInstance(formModel.getClassname());
							if (null != form) {
								form.setProcessInfo(pair);
								form.setWindow(WidgetUtil.createWindow(formModel.getName(), 600, 400));
								form.show();
							}
						} else {
							ADProcessPanel processPanel = new ADProcessPanel(pair);
							MapEntry row = grid.getSelectionModel().getSelectedItem();
							processPanel.setRowJSONString(row.toString());
							processPanel.setWindow(WidgetUtil.createWindow("", 600, 400));
							processPanel.show();
						}
					}
				};
				LoggingUtil.info("ProcessId:" + field.getADProcessID());
				adempiereService.getProcessWithFormModel(field.getADProcessID(), callback);
			}
		};
		processCallout(fieldModel, callback);
	}

	private void processCallout(final FieldModel field, final AsyncCallback<FieldModel> procCallback) {
		AsyncCallback<String> callback = new AsyncSuccessCallback<String>() {
			@Override
			public void onSuccess(String result) {
				if (null != procCallback) {
					procCallback.onSuccess(field);
				}
			}
		};
		MapEntry row = grid.getSelectionModel().getSelectedItem();
		adempiereService.processCallout(field, row.toString(), callback);
	}

}
