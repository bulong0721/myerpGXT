package com.deppon.foss.client.apps;

import java.util.List;

import com.deppon.foss.client.component.AdFormEditStrategy;
import com.deppon.foss.client.component.AdModelEditor;
import com.deppon.foss.client.event.ConfirmToolListener;
import com.deppon.foss.client.model.AdProcessModel;
import com.deppon.foss.client.model.AdProcessParameter;
import com.deppon.foss.client.util.LoggingUtil;
import com.deppon.foss.client.util.WidgetUtil;
import com.deppon.foss.client.widget.ConfirmToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.resources.ThemeStyles.Styles;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;

public class ADProcessPanel implements IsWidget, ConfirmToolListener {

	private static ADProcessPanelUiBinder	uiBinder	= GWT.create(ADProcessPanelUiBinder.class);

	interface ADProcessPanelUiBinder extends UiBinder<Widget, ADProcessPanel> {
	}

	@UiField(provided = true)
	Styles					themeStyles	= ThemeStyles.getStyle();
	@UiField(provided = true)
	ADReportViewer			reportViewer;
	@UiField(provided = true)
	Label					nameLabel, descLabel;
	@UiField(provided = true)
	AdModelEditor			prarmEditor;
	@UiField
	ConfirmToolBar			toolBar;
	@UiField
	CardLayoutContainer		layoutContainer;
	private Widget			widget;
	private AdProcessModel	processModel;

	public ADProcessPanel(AdProcessModel process) {
		super();
		this.processModel = process;
	}

	public AdProcessModel getProcessModel() {
		return processModel;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			initWindow(processModel);
			widget = uiBinder.createAndBindUi(this);
			toolBar.addToolbarListener(this);
			WidgetUtil.doLayout(widget);
		}
		return widget;
	}

	private void initWindow(AdProcessModel processModel) {
		nameLabel = new Label(processModel.getName());
		descLabel = new Label(processModel.getDescription(), true);
		LoggingUtil.info("" + processModel);
		List<AdProcessParameter> fieldList = processModel.getParamList();
		AdFormEditStrategy formStrategy = new AdFormEditStrategy(fieldList);
		prarmEditor = new AdModelEditor(formStrategy);
		prarmEditor.setLayoutWidth(0.52d);
		reportViewer = new ADReportViewer(processModel.getAdProcessId());
	}

	@Override
	public void onHelp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onOK() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub

	}

}
