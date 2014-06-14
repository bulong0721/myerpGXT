package org.adempiere.web.client.apps;

import org.adempiere.common.ADModelKey;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.TabModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.widget.CWindowToolBar;
import org.adempiere.web.client.widget.CWindowToolBar.ButtonStates;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractTabPanel implements IsWidget {
	protected AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	protected Widget				widget;
	protected TabModel			tabModel;
	protected ADWindowPanel			windowPanel;
	protected CWindowToolBar		toolBar;
	protected ADModelKey			parentModelKey;

	public AbstractTabPanel(ADWindowPanel windowPanel, TabModel tabModel, CWindowToolBar toolBar) {
		this.tabModel = tabModel;
		this.windowPanel = windowPanel;
		this.toolBar = toolBar;
	}

	public ADModelKey getParentModelKey() {
		return parentModelKey;
	}

	public boolean isParentSelectChanges() {
		if (0 == tabModel.getTabLevel()) {
			return false;
		}
		ADModelKey parentKey = windowPanel.getParentTab(this).getSelectedKey();
		if (null == parentKey) {
			return false;
		}
		return !parentKey.equals(this.parentModelKey);
	}

	public void refreshToolBar() {
		ButtonStates btnStates = computeToolBarState();
		this.toolBar.refreshStates(btnStates);
	}

	protected abstract ButtonStates computeToolBarState();

	public abstract boolean hasChanges();

	public int getTotalCount() {
		return 0;
	}

	public int getCurrentIndex() {
		return 0;
	}

	public TabModel getTabModel() {
		return tabModel;
	}

	public void loadData() {
		PageRequest loadCfg = new PageRequest();
		loadData(loadCfg);
	}

	public void undoChange() {
	}

	public void newRecord() {
		// TODO Auto-generated method stub

	}

	public void moveFirst() {
		// TODO Auto-generated method stub

	}

	public void moveLast() {
		// TODO Auto-generated method stub

	}

	public void moveNext() {
		// TODO Auto-generated method stub

	}

	public void movePrevious() {
		// TODO Auto-generated method stub

	}

	public void refreshRecord() {
		// TODO Auto-generated method stub

	}

	public void toggleMode() {
		// TODO Auto-generated method stub

	}

	public abstract void loadData(PageRequest loadCfg);

	public abstract void saveOrUpdateRecord();

	public void copyRecord() {
		// TODO Auto-generated method stub

	}

	public void deleteRecord() {
		// TODO Auto-generated method stub

	}

}
