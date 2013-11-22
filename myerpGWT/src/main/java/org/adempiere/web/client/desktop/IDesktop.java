package org.adempiere.web.client.desktop;

public interface IDesktop {
	void createWindow(String name, Long iWindowId);

	void createReport(String name, Long iProcessId);

	void createWorkflow(String name, Long iWorkflowId);

	void createTask(String name, Long iTaskId);

	void createPorcess(String name, Long iProcessId);

	void createForm(String name, Long iFormId);
}
