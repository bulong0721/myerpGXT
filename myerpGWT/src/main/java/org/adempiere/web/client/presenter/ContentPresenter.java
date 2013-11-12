package org.adempiere.web.client.presenter;

import org.adempiere.model.common.MenuAction;
import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.apps.ADProcessPanel;
import org.adempiere.web.client.apps.ADReportViewer;
import org.adempiere.web.client.apps.ADWindowPanel;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.model.AdMenuModel;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.presenter.interfaces.IContentView;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.view.ContentView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;

@Presenter(view = ContentView.class)
public class ContentPresenter extends BasePresenter<IContentView, MyerpEventBus> implements IContentPresenter {
	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);

	public void onShowPage(AdMenuModel node) {
		MenuAction action = MenuAction.fromString(node.getAction());
		if (action.isWindow()) {
			createWindow(node.getName(), node.getAdWindowId());
		} else if (action.isReport()) {
			createReport(node.getName(), node.getAdProcessId());
		} else if (action.isProcess()) {
			createPorcess(node.getName(), node.getAdProcessId());
		} else if (action.isForm()) {
			createForm(node.getName(), node.getAdFormId());
		}
	}

	private boolean isAlreadyOpen(String nodeName) {
		TabPanel tabPanel = getView().getTabSet();
		for (int i = 1; i < tabPanel.getWidgetCount(); i++) {
			Widget widget = tabPanel.getWidget(i);
			TabItemConfig cfg = tabPanel.getConfig(widget);
			if (nodeName.equalsIgnoreCase(cfg.getText())) {
				tabPanel.setActiveWidget(widget);
				return true;
			}
		}
		return false;
	}

	@Override
	public void createPorcess(final String name, long iProcessId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		AsyncCallback<AdProcessModel> callback = new AsyncSuccessCallback<AdProcessModel>("createPorcess") {
			@Override
			public void onSuccess(AdProcessModel result) {
				TabPanel tabPanel = getView().getTabSet();
				ADProcessPanel panel = new ADProcessPanel(result);
				TabItemConfig config = new TabItemConfig(name, true);
				config.setIcon(getIcon(MenuAction.Process));
				tabPanel.add(panel, config);
				tabPanel.setActiveWidget(panel);
			}
		};
		adempiereService.getADProcessModel(iProcessId, callback);
	}

	public void createForm(String name, Long adFormId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createTask(String name, Long iTaskId) {

	}

	@Override
	public void createWorkflow(String name, Long iWorkflowId) {

	}

	@Override
	public void createReport(String name, Long iProcessId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		TabPanel tabPanel = getView().getTabSet();
		ADReportViewer viewer = new ADReportViewer(iProcessId);
		TabItemConfig config = new TabItemConfig(name, true);
		config.setIcon(getIcon(MenuAction.Report));
		tabPanel.add(viewer, config);
		tabPanel.setActiveWidget(viewer);
	}

	@Override
	public void createWindow(String name, Long iWindowId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		TabPanel tabPanel = getView().getTabSet();
		ADWindowPanel windowPanel = new ADWindowPanel(iWindowId);
		windowPanel.setContentPresenter(this);
		TabItemConfig config = new TabItemConfig(name, true);
		config.setIcon(getIcon(MenuAction.Window));
		tabPanel.add(windowPanel, config);
		tabPanel.setActiveWidget(windowPanel);
	}

	public ImageResource getIcon(MenuAction action) {
		Images images = ResourcesFactory.createImages();
		if (action.isForm()) {
			return images.application16();
		} else if (action.isProcess()) {
			return images.process16();
		} else if (action.isReport()) {
			return images.report16();
		} else if (action.isTask()) {
			return images.assignment16();
		} else if (action.isWindow()) {
			return images.mWindow();
		} else if (action.isWorkbench()) {
			return images.preference16();
		} else if (action.isWorkFlow()) {
			return images.workFlow16();
		}
		return null;
	}

}
