package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.model.common.ADExpression;
import org.adempiere.web.client.component.ADTabContainer;
import org.adempiere.web.client.component.ADTabContainer.TabItemConfig;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.event.WindowToolListener;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADTabModel;
import org.adempiere.web.client.model.ADWindowModel;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.widget.CHistoryWindow;
import org.adempiere.web.client.widget.CHistoryWindow.History;
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
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;

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
	private ADWindowModel			windowModel;
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
		if (tabPanel.isParentSelectChanges()) {
			tabPanel.loadData();
		}
		windowModel.setActiveTabId(tabPanel.getTabModel().getAdTabId());
		toolBar.setWindowState(this);
		toolBar.setTabState(tabPanel);
		currentTab = tabPanel;
	}

	private void initWindow(Long adWindowId) {
		AsyncCallback<ADWindowModel> callback = new AsyncSuccessCallback<ADWindowModel>() {
			@Override
			public void onSuccess(ADWindowModel windowModel) {
				ADWindowPanel.this.windowModel = windowModel;
				tabSet.setMaxLevel(getMaxLevel(windowModel.getTabList()));
				for (ADTabModel tabModel : windowModel.getTabList()) {
					ADTabPanel tabPanel = new ADTabPanel(ADWindowPanel.this, tabModel, toolBar);
					TabItemConfig itemCfg = new TabItemConfig(tabModel.getName(), tabPanel, tabModel.getTablevel());
					tabSet.add(tabPanel, itemCfg);
					if (null == currentTab) {
						currentTab = tabPanel;
					}
				}
				tabSet.setActiveIndex(0);
				if (currentTab.getTabModel().getIsHighVolume()) {
					onFind();
				} else {
					currentTab.loadData();
				}
			}

			private int getMaxLevel(List<ADTabModel> tabs) {
				int level = 0;
				for (ADTabModel tabModel : tabs) {
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
			int rhs = windowModel.getTabList().get(i).getTablevel();
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
		final ADFindPanel findPanel = new ADFindPanel(currentTab.getTabModel());
		findPanel.addHideHandler(new HideHandler() {
			@Override
			public void onHide(HideEvent event) {
				ADExpression expr = findPanel.getCondition();
				if (null != expr) {
					ADLoadConfig loadCfg = new ADLoadConfig();
					loadCfg.setExpr(expr);
					currentTab.loadData(loadCfg);
				}
			}
		});
		findPanel.show();
	}

	@Override
	public void onAttachment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onHistoryRecords() {
		final CHistoryWindow window = new CHistoryWindow();
		window.addHideHandler(new HideHandler() {
			@Override
			public void onHide(HideEvent event) {
				History result = window.getHistory();
				if (null != result) {
					ADLoadConfig loadCfg = new ADLoadConfig();
					currentTab.loadData(loadCfg);
				}
			}
		});
		window.showDialog();
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
