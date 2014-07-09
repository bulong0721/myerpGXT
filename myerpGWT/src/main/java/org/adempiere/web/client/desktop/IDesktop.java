package org.adempiere.web.client.desktop;

import org.adempiere.web.client.widget.HasStatusBar;

import com.sencha.gxt.widget.core.client.TabPanel;

public interface IDesktop {
	void openWindow(String name, Integer iWindowId);

	void openReport(String name, Integer iProcessId);

	void openWorkflow(String name, Integer iWorkflowId);

	void openTask(String name, Integer iTaskId);

	void openPorcess(String name, Integer iProcessId);

	void openForm(String name, Integer iFormId);
	
	HasStatusBar getStatusBar();
	void setStatusBar(HasStatusBar statusBar);
	
	TabPanel getTabPanel();
	void setTabPanel(TabPanel tabPanel);
	
	void setMajorStatusHtml(String html);
	void setMinorStatusHtml(String html);
}
