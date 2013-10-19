package com.deppon.foss.client.presenter.interfaces;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;
import com.sencha.gxt.widget.core.client.TabPanel;

public interface IContentView extends ReverseViewInterface<IContentView.IContentPresenter>, IsWidget {

	public interface IContentPresenter {

		public abstract void createWindow(String name, Long iWindowId);

		public abstract void createReport(String name, Long iProcessId);

		public abstract void createWorkflow(String name, Long iWorkflowId);

		public abstract void createTask(String name, Long iTaskId);

		public abstract void createPorcess(String name, Long iProcessId);

	}

	TabPanel getTabSet();
}
