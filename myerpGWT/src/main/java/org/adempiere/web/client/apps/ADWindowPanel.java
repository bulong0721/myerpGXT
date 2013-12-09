package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.web.client.component.ADTabContainer;
import org.adempiere.web.client.component.ADTabContainer.TabItemConfig;
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
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Component;

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
	ADTabContainer					tabSet;

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
	void onTabSelection(ValueChangeEvent<Object> event) {
		ADTabPanel tabPanel = (ADTabPanel) tabSet.getActiveTag();
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
				tabSet.setMaxLevel(getMaxLevel(windowModel.getTabList()));
				for (AdTabModel tabModel : windowModel.getTabList()) {
					ADTabPanel tabPanel = new ADTabPanel(windowModel, tabModel, toolBar);
					TabItemConfig itemCfg = new TabItemConfig(tabModel.getName(), tabPanel, tabModel.getTablevel());
					tabSet.add(tabPanel, itemCfg);
					if (null == currentTab) {
						currentTab = tabPanel;
					}
				}
				tabSet.setActiveIndex(0);
			}

			private int getMaxLevel(List<AdTabModel> tabs) {
				int level = 0;
				for (AdTabModel tabModel : tabs) {
					if (tabModel.getTablevel() > level) {
						level = tabModel.getTablevel();
					}
				}
				return level;
			}
		};
		adempiereService.getADWindowModel(adWindowId, callback);
	}

	public ADTabPanel getParentTab(ADTabPanel tabPanel) {
		int index = tabSet.getIndex(Widget.asWidgetOrNull(tabPanel));
		int level = tabPanel.getTabModel().getTablevel();
		if (0 >= index || 0 >= level) {
			return null;
		}
		for (int i = index - 1; i >= 0; i--) {
			int rhs = windowModel.getTabList().get(index).getTablevel();
			if (rhs == level - 1) {
				return (ADTabPanel) tabSet.getTagByIndex(i);
			}
		}
		return null;
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
		return tabSet.getActiveIndex();
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
		return tabSet.getActiveIndex();
	}

	private boolean setActiveTab(int newTabIndex) {
		tabSet.setActiveIndex(newTabIndex);
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
