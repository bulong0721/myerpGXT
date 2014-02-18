package org.adempiere.web.client.apps;

import java.util.Collection;
import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.web.client.component.ADFormBuilder;
import org.adempiere.web.client.component.ADModelDriver;
import org.adempiere.web.client.component.ADModelReader;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.event.ActionEvent;
import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.form.AbstractForm;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.model.ADMapData.ADModelKeyProvider;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADModelData;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADResultPair;
import org.adempiere.web.client.model.ADResultWithError;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.ClassUtil;
import org.adempiere.web.client.util.ContextUtil;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.LoggingUtil;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.TabStatus;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
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
import com.sencha.gxt.widget.core.client.grid.GridSelectionModel;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.info.Info;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class ADTabPanel implements IsWidget, ActionListener, TabStatus {

	private static ADTabPanelUiBinder						uiBinder	= GWT.create(ADTabPanelUiBinder.class);
	PagingLoader<ADLoadConfig, PagingLoadResult<ADMapData>>	loader		= null;

	interface ADTabPanelUiBinder extends UiBinder<Widget, ADTabPanel> {
	}

	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	private ADMapData				newRecord;
	private ADMapData				editRecord;
	private ADWindowPanel			windowPanel;
	private ADTabModel				tabModel;
	private CWindowToolBar			toolBar;
	private Widget					widget;
	private ColumnModel<ADMapData>	cm;
	private ListStore<ADMapData>	store;
	private ADFormBuilder			tabStrategy;
	private GridEditing<ADMapData>	gridEditing;
	private ADModelDriver			adModelDriver;
	private ADModelKeyProvider		keyProvider;
	private ADModelKey				parentModelKey;
	private ADTreePanel				treePanel;
	@UiField(provided = true)
	Grid<ADMapData>					grid;
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

	public ADTabPanel(ADWindowPanel windowPanel, ADTabModel tabModel, CWindowToolBar toolBar) {
		this.tabStrategy = new ADFormBuilder(tabModel.getFieldList());
		this.tabStrategy.setFieldButtonListener(this);
		this.windowPanel = windowPanel;
		this.tabModel = tabModel;
		this.toolBar = toolBar;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.onRender();
			this.widget = uiBinder.createAndBindUi(this);
			this.toolBar.setTabState(this);
		}
		return widget;
	}

	private void onRender() {
		createTree();
		createForm();
		createGrid();
	}

	private void createGrid() {
		RpcProxy<ADLoadConfig, ADJSONData> proxy = new RpcProxy<ADLoadConfig, ADJSONData>() {
			@Override
			public void load(ADLoadConfig loadConfig, AsyncCallback<ADJSONData> callback) {
				adempiereService.getWindowTabData(loadConfig, callback);
			}
		};
		ADModelReader reader = new ADModelReader();
		loader = new PagingLoader<ADLoadConfig, PagingLoadResult<ADMapData>>(proxy, reader);
		loader.setRemoteSort(true);
		pageToolBar = new PagingToolBar(50);
		pageToolBar.bind(loader);
		keyProvider = ADModelData.createKeyProvider(tabModel);
		store = new ListStore<ADMapData>(keyProvider);
		store.addStoreDataChangeHandler(new StoreDataChangeHandler<ADMapData>() {
			@Override
			public void onDataChange(StoreDataChangeEvent<ADMapData> event) {
				grid.getSelectionModel().select(0, false);
				toolBar.setTabState(ADTabPanel.this);
				grid.setLoadMask(true);
			}
		});
		final LoadHandler<ADLoadConfig, PagingLoadResult<ADMapData>> loadHandler;
		loadHandler = new LoadResultListStoreBinding<ADLoadConfig, ADMapData, PagingLoadResult<ADMapData>>(store);
		loader.addLoadHandler(loadHandler);
		cm = tabStrategy.createColumnModel();
		grid = new Grid<ADMapData>(store, cm);
		grid.setLoader(loader);
		GridSelectionModel<ADMapData> selectModel = new CheckBoxSelectionModel<ADMapData>();
		selectModel.setSelectionMode(SelectionMode.SINGLE);
		selectModel.addSelectionChangedHandler(new SelectionChangedHandler<ADMapData>() {
			@Override
			public void onSelectionChanged(SelectionChangedEvent<ADMapData> event) {
				// TODO Auto-generated method stub
			}
		});
		grid.setSelectionModel(selectModel);
		gridEditing = tabStrategy.createGridEditing(grid);
		gridEditing.addCompleteEditHandler(new CompleteEditHandler<ADMapData>() {
			@Override
			public void onCompleteEdit(CompleteEditEvent<ADMapData> event) {
				toolBar.setTabState(ADTabPanel.this);
			}
		});
		gridEditing.addCancelEditHandler(new CancelEditHandler<ADMapData>() {
			@Override
			public void onCancelEdit(CancelEditEvent<ADMapData> event) {
				toolBar.setTabState(ADTabPanel.this);
			}
		});
	}

	public ADTabModel getTabModel() {
		return tabModel;
	}

	public ADModelKey getSelectedKey() {
		ADMapData item = grid.getSelectionModel().getSelectedItem();
		if (null != item) {
			return keyProvider.getKeys(item).get(0);
		}
		return null;
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
		if (tabModel.getHasTree()) {
			treeContainer.setBodyBorder(true);
			treeContainer.setHeadingText("Tree");
			treeLayoutData = new HorizontalLayoutData(220d, 1d);
			treePanel = new ADTreePanel(ADMenuModel.TREE_ID);
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
			toolBar.setTabState(this);
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
		ADMapData cloneData = editRecord.deepClone();
		Collection<Change<ADMapData, ?>> changes = store.getRecord(editRecord).getChanges();
		for (Change<ADMapData, ?> change : changes) {
			change.modify(cloneData);
		}
		adModelDriver.edit(cloneData);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void mergeFormChanges() {
		if (null != editRecord) {
			ADMapData data = adModelDriver.flush();
			Record record = store.getRecord(editRecord);
			for (ColumnConfig<ADMapData, ?> cfg : cm.getColumns()) {
				ValueProvider<? super ADMapData, ?> vp = cfg.getValueProvider();
				record.addChange(vp, vp.getValue(data));
			}
			grid.getView().refresh(false);
			adModelDriver.edit(data);
		}
	}

	public void saveOrUpdateRecord() {
		AsyncCallback<ADResultWithError> callback = new AsyncSuccessCallback<ADResultWithError>() {
			@Override
			public void onSuccess(ADResultWithError result) {
				if (result.isSuccess()) {
					store.commitChanges();
					ADTabPanel.this.newRecord = null;
					toolBar.setTabState(ADTabPanel.this);
					Info.display("adempiere", "Update Success.");
				} else {
					Info.display("adempiere", "Update Failed:" + result.getErrorMessage());
				}
			}
		};
		this.mergeFormChanges();
		String json = getModifyRecords();
		adempiereService.updateData(json, tabModel.getTablename(), callback);
	}

	private String getModifyRecords() {
		JavaScriptObject array = JavaScriptObject.createArray();
		int index = 0;
		for (Store<ADMapData>.Record record : store.getModifiedRecords()) {
			JSOUtil.arraySet(array, index, ((ADModelData) copyWithChange(record)).getJso());
			index++;
		}
		return JSOUtil.toString(array);
	}

	private ADMapData copyWithChange(Store<ADMapData>.Record record) {
		ADMapData copy = record.getModel().deepClone();
		if (record.isDirty()) {
			for (Change<ADMapData, ?> c : record.getChanges()) {
				c.modify(copy);
			}
		}
		return copy;
	}

	public void deleteRecord() {
		final ADMapData selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to delete");
			box.show();
			return;
		}
		List<ADModelKey> keys = keyProvider.getKeys(selectedData);
		adempiereService.deleteData(keys, tabModel.getTablename(), new AsyncSuccessCallback<ADResultWithError>() {
			@Override
			public void onSuccess(ADResultWithError result) {
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
		toolBar.setTabState(this);
	}

	public void newRecord() {
		newRecord = new ADModelData();
		for (ADFieldModel field : tabModel.getFieldList()) {
			if (null == field.getDefaultvalue()) {
				continue;
			}
			String fieldName = StringUtil.toCamelStyle(field.getColumnname());
			newRecord.setValue(fieldName, ContextUtil.getDefaultValue(field));
		}
		LoggingUtil.info("xxxxxxxxxxxxxxNewRecord:" + newRecord.toString());
		store.add(newRecord);
		if (!isGridMode()) {
			adModelDriver.edit(newRecord);
		}
		toolBar.setTabState(this);
	}

	public void moveFirst() {
		grid.getSelectionModel().select(0, false);
		toolBar.setTabState(this);
	}

	public void moveLast() {
		grid.getSelectionModel().select(store.size() - 1, false);
		toolBar.setTabState(this);
	}

	public void moveNext() {
		grid.getSelectionModel().selectNext(false);
		toolBar.setTabState(this);
	}

	public void movePrevious() {
		grid.getSelectionModel().selectPrevious(false);
		toolBar.setTabState(this);
	}

	public void copyRecord() {
		final ADMapData selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to copy");
			box.show();
			return;
		}
		newRecord = (ADMapData) selectedData.deepClone();
		keyProvider.resetKeys(newRecord, tabModel.getTablename());
		store.add(newRecord);
		toolBar.setTabState(this);
	}

	public void updateADUserContext() {

	}

	public void loadData(ADLoadConfig loadCfg) {
		loadCfg.setTableName(tabModel.getTablename());
		if (0 != tabModel.getTablevel() && null == loadCfg.getParentKey()) {
			loadCfg.setParentKey(windowPanel.getParentTab(this).getSelectedKey());
		}
		parentModelKey = loadCfg.getParentKey();
		loader.load(loadCfg);
		newRecord = null;
		toolBar.setTabState(this);
	}

	public ADModelKey getParentModelKey() {
		return parentModelKey;
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
		ADMapData data = grid.getSelectionModel().getSelectedItem();
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
		ADFieldModel fieldModel = (ADFieldModel) event.getSource();
		AsyncCallback<ADFieldModel> callback = new AsyncSuccessCallback<ADFieldModel>() {
			@Override
			public void onSuccess(ADFieldModel field) {
				if (hasChanges()) {
					AlertMessageBox dialog = new AlertMessageBox("Adempiere", "Data has changes, please reload data!");
					dialog.show();
					return;
				}
				if (0 == field.getAdProcessId()) {
					return;
				}
				AsyncCallback<ADResultPair<ADProcessModel, ADFormModel>> callback = new AsyncSuccessCallback<ADResultPair<ADProcessModel, ADFormModel>>() {
					@Override
					public void onSuccess(ADResultPair<ADProcessModel, ADFormModel> pair) {
						ADProcessModel processModel = pair.getOne();
						ADFormModel formModel = pair.getTwo();
						if (null != formModel) {
							AbstractForm form = ClassUtil.newInstance(formModel.getClassname());
							if (null != form) {
								form.setProcessInfo(processModel);
								form.setWindow(WidgetUtil.createWindow(formModel.getName(), 600, 400));
								form.show();
							}
						} else {
							ADProcessPanel processPanel = new ADProcessPanel(pair.getOne());
							ADMapData row = grid.getSelectionModel().getSelectedItem();
							processPanel.setRowJSONString(row.toString());
							processPanel.setWindow(WidgetUtil.createWindow("", 600, 400));
							processPanel.show();
						}
					}
				};
				LoggingUtil.info("xxxxxxxxxProcessId:" + field.getAdProcessId());
				adempiereService.getProcessWithFormModel(field.getAdProcessId(), callback);
			}
		};
		processCallout(fieldModel, callback);
	}

	private void processCallout(final ADFieldModel field, final AsyncCallback<ADFieldModel> procCallback) {
		AsyncCallback<String> callback = new AsyncSuccessCallback<String>() {
			@Override
			public void onSuccess(String result) {
				if (null != procCallback) {
					procCallback.onSuccess(field);
				}
			}
		};
		ADMapData row = grid.getSelectionModel().getSelectedItem();
		adempiereService.processCallout(field, row.toString(), callback);
	}

	public void loadData() {
		ADLoadConfig loadCfg = new ADLoadConfig();
		loadData(loadCfg);
	}

	public boolean isParentSelectChanges() {
		if (0 == tabModel.getTablevel()) {
			return false;
		}
		ADModelKey parentKey = windowPanel.getParentTab(this).getSelectedKey();
		if (null == parentKey) {
			return false;
		}
		return !parentKey.equals(this.parentModelKey);
	}

}
