package org.adempiere.web.client.apps;

import java.util.Collection;
import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.common.CalloutResult;
import org.adempiere.web.client.Messages;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.component.EntryReader;
import org.adempiere.web.client.component.TabBuilder;
import org.adempiere.web.client.component.TabDriver;
import org.adempiere.web.client.component.TabEditor;
import org.adempiere.web.client.event.ActionListener;
import org.adempiere.web.client.event.FieldEvent;
import org.adempiere.web.client.form.AbstractForm;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.JSOEntry;
import org.adempiere.web.client.model.JsonResult;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.model.MapEntry.EntryKeyProvider;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.util.ClassUtil;
import org.adempiere.web.client.util.ContextUtil;
import org.adempiere.web.client.util.ExceptionUtil;
import org.adempiere.web.client.util.ExceptionUtil.RPCError;
import org.adempiere.web.client.util.JSOUtil;
import org.adempiere.web.client.util.StringUtil;
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
import com.sencha.gxt.data.shared.loader.LoadEvent;
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
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class SimpleTabPanel extends AbstractTabPanel implements ActionListener {

    private static Messages                               i18n     = GWT.create(Messages.class);
    private static SimpleTabPanelUiBinder                 uiBinder = GWT.create(SimpleTabPanelUiBinder.class);
    PagingLoader<PageRequest, PagingLoadResult<MapEntry>> loader   = null;

    interface SimpleTabPanelUiBinder extends UiBinder<Widget, SimpleTabPanel> {
    }

    private MapEntry              newRecord;
    private ColumnModel<MapEntry> cm;
    private ListStore<MapEntry>   store;
    private TabBuilder            tabBuilder;
    private GridEditing<MapEntry> gridEditing;
    private TabDriver             adModelDriver;
    private EntryKeyProvider      keyProvider;
    private TreePanel             treePanel;
    @UiField(provided = true)
    Grid<MapEntry>                grid;
    @UiField(provided = true)
    PagingToolBar                 pageToolBar;
    @UiField(provided = true)
    TabEditor                     formEditing;
    @UiField
    CardLayoutContainer           layoutContainer;
    @UiField(provided = true)
    ContentPanel                  treeContainer;
    @UiField(provided = true)
    HorizontalLayoutData          treeLayoutData;

    public SimpleTabPanel(WindowPanel windowPanel, TabModel tabModel, CWindowToolBar toolBar){
        super(windowPanel, tabModel, toolBar);
        this.tabBuilder = new TabBuilder(tabModel.getFieldList());
        this.tabBuilder.setFieldListener(this);
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
        btnStates.enableSave = tabModel.IsInsertRecord() && hasChanges();
        btnStates.enableNew = tabModel.IsInsertRecord() && !hasChanges();
        btnStates.enableCopy = tabModel.IsInsertRecord() && !hasChanges();
        btnStates.enableDelete = tabModel.IsInsertRecord() && !hasChanges();
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
        EntryReader reader = new EntryReader();
        loader = new PagingLoader<PageRequest, PagingLoadResult<MapEntry>>(proxy, reader);
        loader.addLoadExceptionHandler(new LoadExceptionHandler<PageRequest>() {

            @Override
            public void onLoadException(LoadExceptionEvent<PageRequest> event) {
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
        loader.addLoadHandler(new LoadHandler<PageRequest, PagingLoadResult<MapEntry>>() {

            @Override
            public void onLoad(LoadEvent<PageRequest, PagingLoadResult<MapEntry>> event) {
                grid.getView().getHeader().refresh();
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
        loader.addLoadHandler(loadHandler);
        cm = tabBuilder.createColumnModel(selectModel);
        grid = new Grid<MapEntry>(store, cm);
        grid.setLoader(loader);
        grid.setSelectionModel(selectModel);
        grid.getView().setStripeRows(true);
        grid.getView().setColumnLines(true);
        
        gridEditing = tabBuilder.createGridEditing(grid);
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

    public boolean isFormMode() {
        return !isGridMode();
    }

    private void createForm() {
        formEditing = new TabEditor(tabBuilder);
        formEditing.asWidget();
    }

    private void createTree() {
        treeContainer = new ContentPanel();
        if (tabModel.isHasTree()) {
            treeContainer.setBodyBorder(true);
            treeContainer.setHeadingText(i18n.tabPanel_Tree());
            treeLayoutData = new HorizontalLayoutData(220d, 1d);
            treePanel = new TreePanel(MenuModel.TREE_ID);
            treePanel.enableDnD();
            treeContainer.add(treePanel);
        } else {
            treeLayoutData = new HorizontalLayoutData(0d, 1);
        }
    }

    public void toggleMode() {
        if (null == adModelDriver) {
            adModelDriver = GWT.create(TabDriver.class);
            adModelDriver.initialize(formEditing);
        }
        if (isFormMode() && !mergeFormChanges()) {
            return;
        }
        WidgetUtil.activeNext(layoutContainer);
        if (isGridMode()) {
            refreshToolBar();
        } else {
            editCurrent();
        }
    }

    private void editCurrent() {
        if (isGridMode()) {
            return;
        }
        MapEntry editRecord = grid.getSelectionModel().getSelectedItem();
        if (null == editRecord) {
            newRecord();
        }
        mergeGridChanges();
    }

    private void mergeGridChanges() {
        MapEntry editRecord = grid.getSelectionModel().getSelectedItem();
        if (null == editRecord) {
            return;
        }
        MapEntry cloneData = editRecord.deepClone();
        Collection<Change<MapEntry, ?>> changes = store.getRecord(editRecord).getChanges();
        for (Change<MapEntry, ?> change : changes) {
            change.modify(cloneData);
        }
        adModelDriver.edit(cloneData);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private boolean mergeFormChanges() {
        if (null != formEditing.getValue()) {
            if (!formEditing.validate()) {
                WidgetUtil.setStatusLine(i18n.tabEditor_hasErrors(), true);
                return false;
            }
            MapEntry editRecord = grid.getSelectionModel().getSelectedItem();
            Record record = store.getRecord(editRecord);
            MapEntry data = adModelDriver.flush();
            for (ColumnConfig<MapEntry, ?> cfg : cm.getColumns()) {
                ValueProvider<? super MapEntry, ?> vp = cfg.getValueProvider();
                record.addChange(vp, vp.getValue(data));
            }
            grid.getView().refresh(false);
            adModelDriver.edit(data);
        }
        return true;
    }

    public void saveOrUpdateRecord() {
        if (!this.mergeFormChanges()) {
            return;
        }
        if (tabModel.isHasTree()) {
            // Set<NodeModel> changes = treePanel.getChanges();
        }
        AsyncCallback<Void> callback = new AsyncSuccessCallback<Void>() {

            @Override
            public void onSuccess(Void result) {
                store.commitChanges();
                SimpleTabPanel.this.newRecord = null;
                SimpleTabPanel.this.refreshToolBar();
                WidgetUtil.setStatusLine(i18n.tabPanel_UpdateSuccess(), false);
            }
        };
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
        final List<MapEntry> items = grid.getSelectionModel().getSelectedItems();
        if (null == items || items.isEmpty()) {
            WidgetUtil.setStatusLine("Select the row you want to delete", true);
            return;
        }

        JavaScriptObject array = JavaScriptObject.createArray();
        int index = 0;
        for (MapEntry item : items) {
            JSOUtil.arraySet(array, index, ((JSOEntry) item).getJso());
            index++;
        }
        String json = JSOUtil.toString(array);
        adempiereService.deleteData(json, tabModel.getTableName(), new AsyncSuccessCallback<Void>() {

            @Override
            public void onSuccess(Void result) {
                for (MapEntry item : items) {
                    store.remove(item);
                }
                store.commitChanges();
                grid.getSelectionModel().select(0, false);
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
            formEditing.setValue(null);
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
        keyProvider.setDummyKey(newRecord);
        store.add(newRecord);
        grid.getSelectionModel().select(store.size() - 1, false);
        if (!isGridMode()) {
            adModelDriver.edit(newRecord.deepClone());
        }
        refreshToolBar();
    }

    public void moveFirst() {
        grid.getSelectionModel().select(0, false);
        editCurrent();
        refreshToolBar();
    }

    public void moveLast() {
        grid.getSelectionModel().select(store.size() - 1, false);
        editCurrent();
        refreshToolBar();
    }

    public void moveNext() {
        grid.getSelectionModel().selectNext(false);
        editCurrent();
        refreshToolBar();
    }

    public void movePrevious() {
        grid.getSelectionModel().selectPrevious(false);
        editCurrent();
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
        boolean gridChanges = hasGridChanges();
        boolean formChanges = null == adModelDriver ? false : adModelDriver.isDirty();
        boolean hasNewRecord = (null != newRecord);
        return (hasNewRecord || gridChanges || formChanges);
    }

    private boolean hasGridChanges() {
        boolean gridChanges = !store.getModifiedRecords().isEmpty();
        if (gridChanges) {
            Collection<Store<MapEntry>.Record> changeRecords = store.getModifiedRecords();
            if (1 == changeRecords.size()) {
                for (Store<MapEntry>.Record record : changeRecords) {
                    MapEntry model = new JSOEntry();
                    for (Change<MapEntry, ?> change : record.getChanges()) {
                        change.modify(model);
                    }
                    if ("{}".equals(model.toString())) {
                        return false;
                    }
                }
            }
        }
        return gridChanges;
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
    public void actionPerformed(FieldEvent event) {
        FieldModel field = (FieldModel) event.getField();
        if (event.getAction().isButtionClick() && 0 != field.getADProcessID()) {
            if (hasChanges()) {
                WidgetUtil.showMessageBox("Adempiere", "Data has changes, please reload data!");
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
                        ProcessPanel processPanel = new ProcessPanel(pair);
                        MapEntry row = grid.getSelectionModel().getSelectedItem();
                        processPanel.setRowJSONString(row.toString());
                        processPanel.setWindow(WidgetUtil.createWindow("", 600, 400));
                        processPanel.show();
                    }
                }
            };
            adempiereService.getProcessWithFormModel(field.getADProcessID(), callback);
        } else if (event.getAction().isValueChange()) {
            if (null != field.getCallout() && !formEditing.isFilling()) {
                processCallout(field);
            }
        }

    }

    private void processCallout(final FieldModel field) {
        AsyncCallback<CalloutResult> callback = new AsyncSuccessCallback<CalloutResult>() {

            @Override
            public void onSuccess(CalloutResult result) {
                if (!result.isSuccess()) {
                    return;
                }
                String json = result.getOverWriteData();
                if (!StringUtil.isNullOrEmpty(json)) {
                    JavaScriptObject jso = JSOUtil.eval(json);
                    formEditing.overWrite(jso);
                }
            }
        };
        MapEntry row = grid.getSelectionModel().getSelectedItem();
        adempiereService.processCallout(field, row.toString(), callback);
    }

}
