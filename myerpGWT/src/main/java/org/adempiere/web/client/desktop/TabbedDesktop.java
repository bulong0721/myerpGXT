package org.adempiere.web.client.desktop;

import org.adempiere.common.MenuActionType;
import org.adempiere.web.client.apps.ProcessPanel;
import org.adempiere.web.client.apps.WindowPanel;
import org.adempiere.web.client.component.AsyncSuccessCallback;
import org.adempiere.web.client.form.AbstractForm;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.WindowModel;
import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.ClassUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.info.Info;

public class TabbedDesktop implements IDesktop {
	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	private TabPanel				tabPanel;

	public TabbedDesktop(TabPanel tabPanel) {
		super();
		this.tabPanel = tabPanel;
	}

	protected boolean isAlreadyOpen(String nodeName) {
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
	public void openPorcess(final String name, Integer iProcessId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		AsyncCallback<ProcessModel> callback = new AsyncSuccessCallback<ProcessModel>() {
			@Override
			public void onSuccess(ProcessModel result) {
				ProcessPanel panel = new ProcessPanel(result);
				TabItemConfig config = new TabItemConfig(name, true);
				config.setIcon(getIcon(MenuActionType.Process));
				tabPanel.add(panel, config);
				tabPanel.setActiveWidget(panel);
			}
		};
		adempiereService.getADProcessModel(iProcessId, callback);
	}

	@Override
	public void openForm(final String name, Integer adFormId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		AsyncCallback<FormModel> callback = new AsyncSuccessCallback<FormModel>() {
			@Override
			public void onSuccess(FormModel model) {
				String modelClass = model.getClassname();
				AbstractForm form = ClassUtil.newInstance(modelClass);
				if (null != form) {
					Widget widget = form.asWidget();
					TabItemConfig config = new TabItemConfig(name, true);
					config.setIcon(getIcon(MenuActionType.Form));
					tabPanel.add(widget, config);
					tabPanel.setActiveWidget(widget);
				} else {
					Info.display("adempiere", "ClassNotFound:" + modelClass);
				}
			}
		};
		adempiereService.getADFormModel(adFormId, callback);
	}

	@Override
	public void openTask(String name, Integer iTaskId) {

	}

	@Override
	public void openWorkflow(String name, Integer iWorkflowId) {

	}

	@Override
	public void openReport(final String name, Integer iProcessId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		AsyncCallback<ProcessModel> callback = new AsyncSuccessCallback<ProcessModel>() {
			@Override
			public void onSuccess(ProcessModel result) {
				ProcessPanel panel = new ProcessPanel(result);
				TabItemConfig config = new TabItemConfig(name, true);
				config.setIcon(getIcon(MenuActionType.Report));
				tabPanel.add(panel, config);
				tabPanel.setActiveWidget(panel);
			}
		};
		adempiereService.getADProcessModel(iProcessId, callback);
//		ADReportViewer viewer = new ADReportViewer(iProcessId);
//		TabItemConfig config = new TabItemConfig(name, true);
//		config.setIcon(getIcon(MenuActionType.Report));
//		tabPanel.add(viewer, config);
//		tabPanel.setActiveWidget(viewer);
	}

	@Override
	public void openWindow(final String name, Integer iWindowId) {
		if (isAlreadyOpen(name)) {
			return;
		}
		AsyncCallback<WindowModel> callback = new AsyncSuccessCallback<WindowModel>() {
			@Override
			public void onSuccess(WindowModel windowModel) {
				WindowPanel windowPanel = new WindowPanel(windowModel);
				TabItemConfig config = new TabItemConfig(name, true);
				config.setIcon(getIcon(MenuActionType.Window));
				tabPanel.add(windowPanel, config);
				tabPanel.setActiveWidget(windowPanel);
			}
		};
		adempiereService.getADWindowModel(iWindowId, callback);
	}

	protected ImageResource getIcon(MenuActionType action) {
		Images images = ResourcesFactory.getImages();
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
