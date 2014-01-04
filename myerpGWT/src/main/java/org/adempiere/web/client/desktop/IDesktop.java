package org.adempiere.web.client.desktop;

public interface IDesktop {
	void openWindow(String name, Integer iWindowId);

	void openReport(String name, Integer iProcessId);

	void openWorkflow(String name, Integer iWorkflowId);

	void openTask(String name, Integer iTaskId);

	void openPorcess(String name, Integer iProcessId);

	void openForm(String name, Integer iFormId);
}
