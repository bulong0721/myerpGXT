package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.model.common.AdModelKey;
import org.adempiere.web.client.component.AdFormEditStrategy;
import org.adempiere.web.client.component.AdModelDriver;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.component.AdModelReader;
import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdModelData;
import org.adempiere.web.client.model.AdModelData.AdModelKeyProvider;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.model.AdWindowModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.TabStatus;
import org.adempiere.web.client.widget.HWindow;
import org.adempiere.web.client.widget.HWindow.History;
import org.adempiere.web.client.widget.HWindow.HistoryLoader;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.Style.SelectionMode;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
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
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class ADTabPanel implements IsWidget, HistoryLoader, TabStatus {

	private static ADTabPanelUiBinder	uiBinder	= GWT.create(ADTabPanelUiBinder.class);

	interface ADTabPanelUiBinder extends UiBinder<Widget, ADTabPanel> {
	}

	PagingLoader<AdLoadConfig, PagingLoadResult<AdModelData>>	loader				= null;
	private AdempiereServiceAsync								adempiereService	= GWT.create(AdempiereService.class);
	private AdWindowModel										windowModel;
	private AdTabModel											tabModel;
	private CWindowToolBar										toolBar;
	private Widget												widget;
	private ColumnModel<AdModelData>							cm;
	private ListStore<AdModelData>								store;
	private AdFormEditStrategy									tabStrategy;
	private GridEditing<AdModelData>							gridEditing;
	private AdModelDriver										adModelDriver;
	private AdModelKeyProvider									keyProvider;
	@UiField(provided = true)
	Grid<AdModelData>											grid;
	@UiField(provided = true)
	PagingToolBar												pageToolBar;
	@UiField(provided = true)
	AdModelEditor												formEditing;
	@UiField
	CardLayoutContainer											layoutContainer;

	public ADTabPanel(AdWindowModel windowModel, AdTabModel tabModel, CWindowToolBar toolBar) {
		this.tabStrategy = new AdFormEditStrategy(tabModel.getFieldList());
		this.windowModel = windowModel;
		this.tabModel = tabModel;
		this.toolBar = toolBar;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			this.onRender();
			widget = uiBinder.createAndBindUi(this);
			WidgetUtil.doLayout(widget);
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
		loader = new PagingLoader<AdLoadConfig, PagingLoadResult<AdModelData>>(proxy, reader);
		loader.setRemoteSort(true);
		pageToolBar = new PagingToolBar(50);
		pageToolBar.bind(loader);
		keyProvider = AdModelData.createKeyProvider(tabModel);
		store = new ListStore<AdModelData>(keyProvider);
		store.addStoreDataChangeHandler(new StoreDataChangeHandler<AdModelData>() {

			@Override
			public void onDataChange(StoreDataChangeEvent<AdModelData> event) {
				grid.getSelectionModel().select(0, false);
				grid.setLoadMask(true);
			}
		});
		final LoadHandler<AdLoadConfig, PagingLoadResult<AdModelData>> loadHandler = new LoadResultListStoreBinding<AdLoadConfig, AdModelData, PagingLoadResult<AdModelData>>(
				store);
		loader.addLoadHandler(loadHandler);
		cm = tabStrategy.createColumnModel();
		grid = new Grid<AdModelData>(store, cm);
		grid.setLoader(loader);
		grid.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		grid.getSelectionModel().addSelectionChangedHandler(new SelectionChangedHandler<AdModelData>() {

			@Override
			public void onSelectionChanged(SelectionChangedEvent<AdModelData> event) {
				// TODO Auto-generated method stub

			}
		});
		gridEditing = tabStrategy.createGridEditing(grid);
		gridEditing.addCompleteEditHandler(new CompleteEditHandler<AdModelData>() {
			@Override
			public void onCompleteEdit(CompleteEditEvent<AdModelData> event) {
				toolBar.setTabState(ADTabPanel.this);
			}
		});
		gridEditing.addCancelEditHandler(new CancelEditHandler<AdModelData>() {
			@Override
			public void onCancelEdit(CancelEditEvent<AdModelData> event) {
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
			// AdModelData data = adModelDriver.flush();
			// store.update(data);
		} else {
			AdModelData selectedItem = grid.getSelectionModel().getSelectedItem();
			adModelDriver.edit(selectedItem);
		}
	}

	public void loadHistory() {
		HWindow historyWindow = HWindow.instance(ADTabPanel.this);
		historyWindow.show();
	}

	public boolean isActive() {
		return windowModel.getActiveTabId() == tabModel.getAdTabId();
	}

	public void saveOrUpdateRecord() {
		this.store.getModifiedRecords();
	}

	public void deleteRecord() {
		final AdModelData selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to delete");
			box.show();
			return;
		}
		List<AdModelKey> keys = keyProvider.getKeys(selectedData);
		adempiereService.deleteData(keys, tabModel.getTablename(), new AsyncCallback<Boolean>() {
			@Override
			public void onFailure(Throwable caught) {
				box.setMessage(caught.getMessage());
				box.show();
			}

			@Override
			public void onSuccess(Boolean result) {
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
		toolBar.setTabState(this);
	}

	public void newRecord() {
		AdModelData data = new AdModelData();
		store.add(data);
		if (!isGridMode()) {
			adModelDriver.edit(data);
		}
	}

	public void moveFirst() {

	}

	public void moveLast() {

	}

	public void moveNext() {

	}

	public void movePrevious() {

	}

	public void copyRecord() {
		final AdModelData selectedData = grid.getSelectionModel().getSelectedItem();
		final MessageBox box = new MessageBox("Error");
		if (null == selectedData) {
			box.setMessage("Select the row you want to copy");
			box.show();
			return;
		}
		AdModelData newData = selectedData.deepClone();
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
		AdModelData data = grid.getSelectionModel().getSelectedItem();
		if (null != data) {
			return store.indexOf(data);
		}
		return 0;
	}

	public void refreshRecord() {
		pageToolBar.refresh();
	}

}
