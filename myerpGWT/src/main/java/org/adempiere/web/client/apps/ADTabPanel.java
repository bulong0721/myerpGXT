package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.model.common.AdModelKey;
import org.adempiere.model.common.Expression;
import org.adempiere.web.client.apps.ADFindPanel.ConditionLoader;
import org.adempiere.web.client.component.AdFormEditStrategy;
import org.adempiere.web.client.component.AdModelDriver;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.component.AdModelReader;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.event.FieldButtonListener;
import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdModelData;
import org.adempiere.web.client.model.AdResultWithError;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.model.AdWindowModel;
import org.adempiere.web.client.model.IAdFormField;
import org.adempiere.web.client.model.MapAccessable;
import org.adempiere.web.client.model.MapAccessable.AdModelKeyProvider;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.LoggingUtil;
import org.adempiere.web.client.widget.CHistoryWindow;
import org.adempiere.web.client.widget.CHistoryWindow.History;
import org.adempiere.web.client.widget.CHistoryWindow.HistoryLoader;
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

public class ADTabPanel implements IsWidget, FieldButtonListener, HistoryLoader, TabStatus, ConditionLoader {

	private static ADTabPanelUiBinder	uiBinder	= GWT.create(ADTabPanelUiBinder.class);

	interface ADTabPanelUiBinder extends UiBinder<Widget, ADTabPanel> {
	}

	PagingLoader<AdLoadConfig, PagingLoadResult<MapAccessable>>	loader				= null;
	private AdempiereServiceAsync								adempiereService	= GWT.create(AdempiereService.class);
	private AdWindowModel										windowModel;
	private AdTabModel											tabModel;
	private CWindowToolBar										toolBar;
	private Widget												widget;
	private ColumnModel<MapAccessable>							cm;
	private ListStore<MapAccessable>							store;
	private AdFormEditStrategy									tabStrategy;
	private GridEditing<MapAccessable>							gridEditing;
	private AdModelDriver										adModelDriver;
	private AdModelKeyProvider									keyProvider;
	@UiField(provided = true)
	Grid<MapAccessable>											grid;
	@UiField(provided = true)
	PagingToolBar												pageToolBar;
	@UiField(provided = true)
	AdModelEditor												formEditing;
	@UiField
	CardLayoutContainer											layoutContainer;
	@UiField
	SimplePanel													treePlaceHolder;

	public ADTabPanel(AdWindowModel windowModel, AdTabModel tabModel, CWindowToolBar toolBar) {
		this.tabStrategy = new AdFormEditStrategy(tabModel.getFieldList());
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
		RpcProxy<AdLoadConfig, AdJSONData> proxy = new RpcProxy<AdLoadConfig, AdJSONData>() {
			@Override
			public void load(AdLoadConfig loadConfig, AsyncCallback<AdJSONData> callback) {
				adempiereService.getWindowTabData(loadConfig, callback);
			}
		};
		AdModelReader reader = new AdModelReader();
		loader = new PagingLoader<AdLoadConfig, PagingLoadResult<MapAccessable>>(proxy, reader);
		loader.setRemoteSort(true);
		pageToolBar = new PagingToolBar(50);
		pageToolBar.bind(loader);
		keyProvider = AdModelData.createKeyProvider(tabModel);
		store = new ListStore<MapAccessable>(keyProvider);
		store.addStoreDataChangeHandler(new StoreDataChangeHandler<MapAccessable>() {
			@Override
			public void onDataChange(StoreDataChangeEvent<MapAccessable> event) {
				grid.getSelectionModel().select(0, false);
				grid.setLoadMask(true);
			}
		});
		final LoadHandler<AdLoadConfig, PagingLoadResult<MapAccessable>> loadHandler = new LoadResultListStoreBinding<AdLoadConfig, MapAccessable, PagingLoadResult<MapAccessable>>(
				store);
		loader.addLoadHandler(loadHandler);
		cm = tabStrategy.createColumnModel();
		grid = new Grid<MapAccessable>(store, cm);
		grid.setLoader(loader);
		grid.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		grid.getSelectionModel().addSelectionChangedHandler(new SelectionChangedHandler<MapAccessable>() {
			@Override
			public void onSelectionChanged(SelectionChangedEvent<MapAccessable> event) {
				// TODO Auto-generated method stub

			}
		});
		gridEditing = tabStrategy.createGridEditing(grid);
		gridEditing.addCompleteEditHandler(new CompleteEditHandler<MapAccessable>() {
			@Override
			public void onCompleteEdit(CompleteEditEvent<MapAccessable> event) {
				toolBar.setTabState(ADTabPanel.this);
			}
		});
		gridEditing.addCancelEditHandler(new CancelEditHandler<MapAccessable>() {
			@Override
			public void onCancelEdit(CancelEditEvent<MapAccessable> event) {
				toolBar.setTabState(ADTabPanel.this);
			}
		});
	}

	public AdTabModel getTabModel() {
		return tabModel;
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
			ADTreePanel treepanel = new ADTreePanel(AdMenuModel.TREE_ID);
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
			adModelDriver = GWT.create(AdModelDriver.class);
			adModelDriver.initialize(formEditing);
		}
		if (isGridMode()) {
			// MapAccessable data = adModelDriver.flush();
			// store.update(data);
		} else {
			MapAccessable selectedItem = grid.getSelectionModel().getSelectedItem();
			adModelDriver.edit(selectedItem);
		}
	}

	public void loadHistory() {
		CHistoryWindow historyWindow = CHistoryWindow.instance(ADTabPanel.this);
		historyWindow.show();
	}

	public boolean isActive() {
		return windowModel.getActiveTabId() == tabModel.getAdTabId();
	}

	public void saveOrUpdateRecord() {
		AsyncCallback<AdResultWithError> callback = new AsyncSuccessCallback<AdResultWithError>() {
			@Override
			public void onSuccess(AdResultWithError result) {
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
		for (Store<MapAccessable>.Record record : store.getModifiedRecords()) {
			JSOUtil.arraySet(array, index, ((AdModelData) copyWithChange(record)).getJso());
			index++;
		}
		LoggingUtil.info(array.toString());
		return JSOUtil.toString(array);
	}

	private MapAccessable copyWithChange(Store<MapAccessable>.Record record) {
		MapAccessable copy = record.getModel().deepClone();
		if (record.isDirty()) {
			for (Change<MapAccessable, ?> c : record.getChanges()) {
				c.modify(copy);
			}
		}
		return copy;
	}

	public void deleteRecord() {
		final MapAccessable selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to delete");
			box.show();
			return;
		}
		List<AdModelKey> keys = keyProvider.getKeys(selectedData);
		adempiereService.deleteData(keys, tabModel.getTablename(), new AsyncSuccessCallback<AdResultWithError>() {
			@Override
			public void onSuccess(AdResultWithError result) {
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
		MapAccessable data = new AdModelData();
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
		final MapAccessable selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to copy");
			box.show();
			return;
		}
		MapAccessable newData = (MapAccessable) selectedData.deepClone();
		keyProvider.resetKeys(newData);
		store.add(newData);
	}

	public void updateADUserContext() {

	}

	@Override
	public void loadData(History history) {
		AdLoadConfig cfg = new AdLoadConfig();
		cfg.setTableName(tabModel.getTablename());
		loader.load(cfg);
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
		MapAccessable data = grid.getSelectionModel().getSelectedItem();
		if (null != data) {
			return store.indexOf(data);
		}
		return 0;
	}

	public void refreshRecord() {
		pageToolBar.refresh();
	}

	@Override
	public void load(Expression condition) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onActionButton(IAdFormField field) {
		Info.display("adempiere", field.getName());
	}

}
