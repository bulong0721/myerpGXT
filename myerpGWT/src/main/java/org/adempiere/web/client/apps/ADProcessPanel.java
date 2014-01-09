package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.common.ProcessResult;
import org.adempiere.web.client.component.ADFormBuilder;
import org.adempiere.web.client.component.ADModalDialog;
import org.adempiere.web.client.component.ADReportViewer;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.model.ADModelData;
import org.adempiere.web.client.model.ADProcessArgModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.service.AdempiereService;
import org.adempiere.web.client.service.AdempiereServiceAsync;
import org.adempiere.web.client.util.LoggingUtil;
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

public class ADProcessPanel extends ADModalDialog implements ConfirmToolListener {

	private static ADProcessPanelUiBinder	uiBinder	= GWT.create(ADProcessPanelUiBinder.class);

	interface ADProcessPanelUiBinder extends UiBinder<Widget, ADProcessPanel> {
	}

	private AdempiereServiceAsync	adempiereService	= GWT.create(AdempiereService.class);
	@UiField(provided = true)
	Styles							themeStyles			= ThemeStyles.getStyle();
	@UiField(provided = true)
	ADReportViewer					reportViewer;
	@UiField(provided = true)
	Label							nameLabel, descLabel;
	@UiField(provided = true)
	AdModelEditor					prarmEditor;
	@UiField
	ConfirmToolBar					toolBar;
	@UiField
	CardLayoutContainer				layoutContainer;
	private Widget					widget;
	private ADProcessModel			processModel;
	private ADMapData				paramData;

	public ADProcessPanel(ADProcessModel process) {
		super();
		this.processModel = process;
		this.paramData = new ADModelData();
	}

	public ADProcessModel getProcessModel() {
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

	private void initWindow(ADProcessModel processModel) {
		nameLabel = new Label(processModel.getName());
		descLabel = new Label(processModel.getDescription(), true);
		List<ADProcessArgModel> fieldList = processModel.getParamList();
		ADFormBuilder formStrategy = new ADFormBuilder(fieldList);
		formStrategy.setDisableKey(false);
		formStrategy.setCreateGridEditor(false);
		prarmEditor = new AdModelEditor(formStrategy);
		prarmEditor.setLayoutWidth(0.52d);
		prarmEditor.setValue(paramData);
		reportViewer = new ADReportViewer(processModel.getAdProcessId());
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
				if (processModel.getIsreport()) {
					layoutContainer.setActiveWidget(reportViewer);
					LoggingUtil.info(result.getPDFReport());
					reportViewer.setReportURL(result.getPDFReport());
				}
				hide();
			}
		};
		adempiereService.executeProcess(processModel, paramData.toString(), callback);
	}

	@Override
	public void onCancel() {
		hide();
	}

}
