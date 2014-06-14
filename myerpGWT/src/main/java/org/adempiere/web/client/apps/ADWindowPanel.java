package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.common.ADExpression;
import org.adempiere.web.client.component.ADModalDialog;
import org.adempiere.web.client.component.ADTabContainer;
import org.adempiere.web.client.component.ADTabContainer.TabItemConfig;
import org.adempiere.web.client.desktop.IDesktop;
import org.adempiere.web.client.event.WindowToolListener;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.model.WindowModel;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.widget.CHistoryWindow;
import org.adempiere.web.client.widget.CHistoryWindow.History;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.ButtonStates;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Component;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;

public class ADWindowPanel extends ADModalDialog implements WindowToolListener {

	private static ADWindowPanelUiBinder	uiBinder	= GWT.create(ADWindowPanelUiBinder.class);

	interface ADWindowPanelUiBinder extends UiBinder<Widget, ADWindowPanel> {
	}

	public ADWindowPanel(WindowModel windowModel) {
		this.windowModel = windowModel;
	}

	private IContentPresenter	contentPresenter;
	private Widget				widget;
	private WindowModel		windowModel;
	private AbstractTabPanel	currentTab;
	private IDesktop			desktop;
	@UiField
	CWindowToolBar				toolBar;
	@UiField
	ADTabContainer				tabSet;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
			Component container = (Component) widget;
			container.show();
			toolBar.addToolbarListener(this);
			initWindow();
		}
		return widget;
	}

	@UiHandler("tabSet")
	void onTabSelection(ValueChangeEvent<Object> event) {
		AbstractTabPanel tabPanel = (AbstractTabPanel) tabSet.getActiveTag();
		windowModel.setActiveTabId(tabPanel.getTabModel().getADTabID());
		toolBar.refreshStates(computeButtonStates());
		currentTab = tabPanel;
		if (tabPanel.isParentSelectChanges()) {
			tabPanel.loadData();
		} else {
			tabPanel.refreshToolBar();
		}
	}

	public WindowModel getWindowModel() {
		return windowModel;
	}

	protected ButtonStates computeButtonStates() {
		ButtonStates btnStates = toolBar.getButtonStates();
		btnStates.enableParentRecord = false;
		btnStates.enableDetailRecord = false;
		if (getTotalCount() > 1) {
			btnStates.enableParentRecord = getCurrentIndex() > 0;
			btnStates.enableDetailRecord = getCurrentIndex() + 1 < getTotalCount();
		}
		return btnStates;
	}

	private int getMaxLevel(List<TabModel> tabs) {
		int level = 0;
		for (TabModel tabModel : tabs) {
			if (tabModel.getTabLevel() > level) {
				level = tabModel.getTabLevel();
			}
		}
		return level;
	}

	private void initWindow() {
		tabSet.setMaxLevel(getMaxLevel(windowModel.getTabList()));
		for (TabModel tabModel : windowModel.getTabList()) {
			AbstractTabPanel tabPanel = createTabPanel(tabModel);
			TabItemConfig itemCfg = new TabItemConfig(tabModel.getName(), tabPanel, tabModel.getTabLevel());
			tabSet.add(tabPanel, itemCfg);
			if (null == currentTab) {
				currentTab = tabPanel;
			}
		}
		tabSet.setActiveIndex(0);
		tabSet.trimWhenSingleTab();
		if (currentTab.getTabModel().isHighVolume()) {
			onFind();
		} else {
			currentTab.loadData();
		}
	}

	/**
	 * @param tabModel
	 * @return
	 */
	private AbstractTabPanel createTabPanel(TabModel tabModel) {
		if (tabModel.isSortTab()) {
			return new SequenceTabPanel(ADWindowPanel.this, tabModel, toolBar);
		} else {
			return new SimpleTabPanel(ADWindowPanel.this, tabModel, toolBar);
		}
	}

	public SimpleTabPanel getParentTab(AbstractTabPanel tabPanel) {
		int index = tabSet.getIndex(Widget.asWidgetOrNull(tabPanel));
		int level = tabPanel.getTabModel().getTabLevel();
		if (0 >= index || 0 >= level) {
			return null;
		}
		for (int i = index - 1; i >= 0; i--) {
			int rhs = windowModel.getTabList().get(i).getTabLevel();
			Object tabpanel = tabSet.getTagByIndex(i);
			if (rhs == level - 1 && tabpanel instanceof SimpleTabPanel) {
				return (SimpleTabPanel) tabpanel;
			}
		}
		return null;
	}

	public int getTotalCount() {
		return tabSet.getWidgetCount();
	}

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
			desktop.openReport(name, 0);
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
