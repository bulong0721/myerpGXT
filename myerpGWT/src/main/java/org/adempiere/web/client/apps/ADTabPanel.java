package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.model.common.ADModelKey;
import org.adempiere.web.client.component.ADFormEditStrategy;
import org.adempiere.web.client.component.ADModelDriver;
import org.adempiere.web.client.component.ADModelReader;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.event.FieldButtonListener;
import org.adempiere.web.client.model.ADFormField;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.model.ADMapData.AdModelKeyProvider;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.ADModelData;
import org.adempiere.web.client.model.ADResultWithError;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.LoggingUtil;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.TabStatus;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.Style.SelectionMode;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.Store.Change;
import com.sencha.gxt.data.shared.event.StoreDataChangeEvent;
import com.sencha.gxt.data.shared.event.StoreDataChangeEvent.StoreDataChangeHandler;
import com.sencha.gxt.data.shared.loader.LoadHandler;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoader;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;
import com.sencha.gxt.widget.core.client.event.CancelEditEvent;
import com.sencha.gxt.widget.core.client.event.CancelEditEvent.CancelEditHandler;
import com.sencha.gxt.widget.core.client.event.CompleteEditEvent;
import com.sencha.gxt.widget.core.client.event.CompleteEditEvent.CompleteEditHandler;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.info.Info;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class ADTabPanel implements IsWidget, FieldButtonListener, TabStatus {

	private static ADTabPanelUiBinder	uiBinder	= GWT.create(ADTabPanelUiBinder.class);

	interface ADTabPanelUiBinder extends UiBinder<Widget, ADTabPanel> {
	}

	PagingLoader<ADLoadConfig, PagingLoadResult<ADMapData>>	loader				= null;
	private AdempiereServiceAsync							adempiereService	= GWT.create(AdempiereService.class);
	private ADWindowModel									windowModel;
	private ADTabModel										tabModel;
	private CWindowToolBar									toolBar;
	private Widget											widget;
	private ColumnModel<ADMapData>							cm;
	private ListStore<ADMapData>							store;
	private ADFormEditStrategy								tabStrategy;
	private GridEditing<ADMapData>							gridEditing;
	private ADModelDriver									adModelDriver;
	private AdModelKeyProvider								keyProvider;
	@UiField(provided = true)
	Grid<ADMapData>											grid;
	@UiField(provided = true)
	PagingToolBar											pageToolBar;
	@UiField(provided = true)
	AdModelEditor											formEditing;
	@UiField
	CardLayoutContainer										layoutContainer;
	@UiField
	SimplePanel												treePlaceHolder;

	public ADTabPanel(ADWindowModel windowModel, ADTabModel tabModel, CWindowToolBar toolBar) {
		this.tabStrategy = new ADFormEditStrategy(tabModel.getFieldList());
		this.tabStrategy.setFieldButtonListener(this);
		this.windowModel = windowModel;
		this.tabModel = tabModel;
		this.toolBar = toolBar;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.onRender();
			this.widget = uiBinder.createAndBindUi(this);
			this.createTree();
			this.toolBar.setTabState(this);
		}
		return widget;
	}

	private void onRender() {
		createGrid();
		createForm();
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
				grid.setLoadMask(true);
			}
		});
		final LoadHandler<ADLoadConfig, PagingLoadResult<ADMapData>> loadHandler = new LoadResultListStoreBinding<ADLoadConfig, ADMapData, PagingLoadResult<ADMapData>>(
				store);
		loader.addLoadHandler(loadHandler);
		cm = tabStrategy.createColumnModel();
		grid = new Grid<ADMapData>(store, cm);
		grid.setLoader(loader);
		grid.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		grid.getSelectionModel().addSelectionChangedHandler(new SelectionChangedHandler<ADMapData>() {
			@Override
			public void onSelectionChanged(SelectionChangedEvent<ADMapData> event) {
				// TODO Auto-generated method stub

			}
		});
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
	}

	private void createTree() {
		if (tabModel.getHasTree()) {
			LoggingUtil.info("rander tree");
			ADTreePanel treepanel = new ADTreePanel(ADMenuModel.TREE_ID);
			treePlaceHolder.setWidget(treepanel);
			treePlaceHolder.setWidth("200");
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
			// MapAccessable data = adModelDriver.flush();
			// store.update(data);
		} else {
			ADMapData selectedItem = grid.getSelectionModel().getSelectedItem();
			adModelDriver.edit(selectedItem);
		}
	}

	public boolean isActive() {
		return windowModel.getActiveTabId() == tabModel.getAdTabId();
	}

	public void saveOrUpdateRecord() {
		AsyncCallback<ADResultWithError> callback = new AsyncSuccessCallback<ADResultWithError>() {
			@Override
			public void onSuccess(ADResultWithError result) {
				if (result.isSuccess()) {
					store.commitChanges();
					toolBar.setTabState(ADTabPanel.this);
					Info.display("adempiere", "Update Success.");
				} else {
					Info.display("adempiere", "Update Failed:" + result.getErrorMessage());
				}
			}
		};
		String json = getModifyRecords();
		// LoggingUtil.info(json);
		adempiereService.updateData(json, tabModel.getTablename(), callback);
	}

	private String getModifyRecords() {
		JavaScriptObject array = JavaScriptObject.createArray();
		int index = 0;
		for (Store<ADMapData>.Record record : store.getModifiedRecords()) {
			JSOUtil.arraySet(array, index, ((ADModelData) copyWithChange(record)).getJso());
			index++;
		}
		LoggingUtil.info(array.toString());
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
		toolBar.setTabState(this);
	}

	public void newRecord() {
		ADMapData data = new ADModelData();
		store.add(data);
		if (!isGridMode()) {
			adModelDriver.edit(data);
		}
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
		ADMapData newData = (ADMapData) selectedData.deepClone();
		keyProvider.resetKeys(newData);
		store.add(newData);
	}

	public void updateADUserContext() {

	}

	public void loadData(ADLoadConfig loadCfg) {
		loadCfg.setTableName(tabModel.getTablename());
		loader.load(loadCfg);
		toolBar.setTabState(this);
	}

	@Override
	public boolean hasChanges() {
		boolean gridChanges = !store.getModifiedRecords().isEmpty();
		boolean formChanges = null == adModelDriver ? false : adModelDriver.isDirty();
		return (gridChanges || formChanges);
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
	public void onActionButton(ADFormField field) {
		Info.display("adempiere", field.getName());
	}

}
