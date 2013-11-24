package org.adempiere.web.client.desktop;

public interface IDesktop {
	void openWindow(String name, long iWindowId);

	void openReport(String name, long iProcessId);

	void openWorkflow(String name, long iWorkflowId);

	void openTask(String name, long iTaskId);

	void openPorcess(String name, long iProcessId);

	void openForm(String name, long iFormId);
}
