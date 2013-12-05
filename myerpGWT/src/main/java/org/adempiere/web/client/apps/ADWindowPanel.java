package org.adempiere.web.client.apps;

import org.adempiere.web.client.component.AdTabItemConfig;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.event.WindowToolListener;
import org.adempiere.web.client.model.AdTabModel;
import org.adempiere.web.client.model.AdWindowModel;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.WindowStatus;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Component;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

public class ADWindowPanel implements IsWidget, WindowStatus, WindowToolListener {

	private static ADWindowPanelUiBinder	uiBinder	= GWT.create(ADWindowPanelUiBinder.class);

	interface ADWindowPanelUiBinder extends UiBinder<Widget, ADWindowPanel> {
	}

	public ADWindowPanel() {
	}

	public ADWindowPanel(Long adWindowId) {
		this.adWindowId = adWindowId;
	}

	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	private IContentPresenter		contentPresenter;
	private Long					adWindowId;
	private Widget					widget;
	private AdWindowModel			windowModel;
	private ADTabPanel				currentTab;
	private IDesktop				desktop;
	@UiField
	CWindowToolBar					toolBar;
	@UiField
	TabPanel						tabSet;
	@UiField
	ToolBar							statusBar;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			Component container = (Component) widget;
			container.show();
			toolBar.addToolbarListener(this);
			initWindow(adWindowId);
		}
		return widget;
	}

	@UiHandler("tabSet")
	void onSelection(SelectionEvent<Widget> event) {
		Widget tabWidget = event.getSelectedItem();
		AdTabItemConfig tabConfig = (AdTabItemConfig) tabSet.getConfig(tabWidget);
		ADTabPanel tabPanel = (ADTabPanel) tabConfig.getAttachment();
		windowModel.setActiveTabId(tabPanel.getTabModel().getAdTabId());
		toolBar.setWindowState(this);
		toolBar.setTabState(tabPanel);
		currentTab = tabPanel;
	}

	private void initWindow(Long adWindowId) {
		AsyncCallback<AdWindowModel> callback = new AsyncSuccessCallback<AdWindowModel>() {
			@Override
			public void onSuccess(AdWindowModel windowModel) {
				ADWindowPanel.this.windowModel = windowModel;
				for (AdTabModel tabModel : windowModel.getTabList()) {
					ADTabPanel tabPanel = new ADTabPanel(windowModel, tabModel, toolBar);
					AdTabItemConfig tabConfig = new AdTabItemConfig(tabModel.getName());
					tabConfig.setAttachment(tabPanel);
					tabSet.add(tabPanel, tabConfig);
					if (null == currentTab) {
						currentTab = tabPanel;
					}
				}
			}
		};
		adempiereService.getADWindowModel(adWindowId, callback);
	}

	public Long getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
		this.adWindowId = adWindowId;
	}

	@Override
	public int getTotalCount() {
		return tabSet.getWidgetCount();
	}

	@Override
	public int getCurrentIndex() {
		Widget activeWidget = tabSet.getActiveWidget();
		return tabSet.getWidgetIndex(activeWidget);
	}

	@Override
	public void onIgnore() {
		currentTab.undoChange();
	}

	@Override
	public void onNew() {
		currentTab.newRecord();
	}

	@Override
	public void onFirst() {
		currentTab.moveFirst();
	}

	@Override
	public void onLast() {
		currentTab.moveLast();
	}

	@Override
	public void onNext() {
		currentTab.moveNext();
	}

	@Override
	public void onPrevious() {
		currentTab.movePrevious();
	}

	@Override
	public void onParentRecord() {
		setActiveTab(getCurrentTabIndex() - 1);
	}

	@Override
	public void onDetailRecord() {
		setActiveTab(getCurrentTabIndex() + 1);
	}

	private int getCurrentTabIndex() {
		Widget activeWidget = tabSet.getActiveWidget();
		return tabSet.getWidgetIndex(activeWidget);
	}

	private boolean setActiveTab(int newTabIndex) {
		Widget nextWidget = tabSet.getWidget(newTabIndex);
		tabSet.setActiveWidget(nextWidget);
		return true;
	}

	@Override
	public void onRefresh() {
		currentTab.refreshRecord();
	}

	@Override
	public void onPrint() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onReport() {
		String name = "Report:" + currentTab.getTabModel().getName();
		if (null != contentPresenter) {
			// TODO 使用iTabId代替iProcessId
			desktop.openReport(name, 0L);
		}
	}

	@Override
	public void onToggle() {
		currentTab.toggleMode();
	}

	@Override
	public void onHelp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDelete() {
		currentTab.deleteRecord();
	}

	@Override
	public void onDeleteSelection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCopy() {
		currentTab.copyRecord();
	}

	@Override
	public void onSave() {
		currentTab.saveOrUpdateRecord();
	}

	@Override
	public void onFind() {
		ADFindPanel findPanel = new ADFindPanel(currentTab.getTabModel(), currentTab);
		findPanel.show();
	}

	@Override
	public void onAttachment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHistoryRecords() {
		currentTab.loadHistory();
	}

	@Override
	public void onActiveWorkflows() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRequests() {
		// TODO Auto-generated method stub

	}

	public void setDesktop(IDesktop desktop) {
		this.desktop = desktop;
	}

}
