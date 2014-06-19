package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.common.ProcessResult;
import org.adempiere.web.client.component.TabBuilder;
import org.adempiere.web.client.component.ModalDialog;
import org.adempiere.web.client.component.TabDriver;
import org.adempiere.web.client.component.ReportViewer;
import org.adempiere.web.client.component.TabEditor;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.model.JSOEntry;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.model.ProcessArgModel;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.WidgetUtil;
import org.adempiere.web.client.widget.ConfirmToolBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.resources.ThemeStyles.Styles;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;

public class ProcessPanel extends ModalDialog implements ConfirmToolListener {

	private static ADProcessPanelUiBinder	uiBinder	= GWT.create(ADProcessPanelUiBinder.class);

	interface ADProcessPanelUiBinder extends UiBinder<Widget, ProcessPanel> {
	}

	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	@UiField(provided = true)
	Styles							themeStyles			= ThemeStyles.get().style();
	@UiField(provided = true)
	ReportViewer					reportViewer;
	@UiField(provided = true)
	Label							nameLabel, descLabel;
	@UiField(provided = true)
	TabEditor					prarmEditor;
	@UiField
	ConfirmToolBar					toolBar;
	@UiField
	CardLayoutContainer				layoutContainer;
	private Widget					widget;
	private ProcessModel			processModel;
	private MapEntry				paramData;
	private TabDriver			adModelDriver;
	private String					rowJSONString;

	public ProcessPanel(ProcessModel process) {
		super();
		this.processModel = process;
		this.paramData = new JSOEntry();
	}

	public ProcessModel getProcessModel() {
		return processModel;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			initWindow(processModel);
			widget = uiBinder.createAndBindUi(this);
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	private void initWindow(ProcessModel processModel) {
		nameLabel = new Label(processModel.getName());
		descLabel = new Label(processModel.getDescription(), true);
		List<ProcessArgModel> fieldList = processModel.getParamList();
		TabBuilder formStrategy = new TabBuilder(fieldList);
		formStrategy.setCreateGridEditor(false);
		prarmEditor = new TabEditor(formStrategy);
		prarmEditor.setLayoutWidth(0.52d);
		adModelDriver = GWT.create(TabDriver.class);
		adModelDriver.initialize(prarmEditor);
		adModelDriver.edit(paramData);
		reportViewer = new ReportViewer(processModel.getADProcessID());
	}

	@Override
	public void onHelp() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onOK() {
		WidgetUtil.mask(widget, "process on server...");
		AsyncCallback<ProcessResult> callback = new AsyncCallback<ProcessResult>() {
			@Override
			public void onFailure(Throwable caught) {
				WidgetUtil.unmask(widget);
			}

			@Override
			public void onSuccess(ProcessResult result) {
				WidgetUtil.unmask(widget);
				if (processModel.isReport()) {
					layoutContainer.setActiveWidget(reportViewer);
					reportViewer.setReportURL(result.getPDFReport());
				}
				hide();
			}
		};
		MapEntry data = adModelDriver.flush();
		adempiereService.executeProcess(processModel, rowJSONString, data.toString(), callback);
	}

	@Override
	public void onCancel() {
		hide();
	}

	public void setRowJSONString(String json) {
		this.rowJSONString = json;
	}

}
