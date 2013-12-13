package org.adempiere.web.client.apps;

import java.util.List;

import org.adempiere.web.client.component.ADReportViewer;
import org.adempiere.web.client.component.ADFormBuilder;
import org.adempiere.web.client.component.AdModelEditor;
import org.adempiere.web.client.event.ConfirmToolListener;
import org.adempiere.web.client.model.AdProcessModel;
import org.adempiere.web.client.model.AdProcessArgModel;
import org.adempiere.web.client.widget.ConfirmToolBar;

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
			toolBar.setToolbarListener(this);
		}
		return widget;
	}

	private void initWindow(AdProcessModel processModel) {
		nameLabel = new Label(processModel.getName());
		descLabel = new Label(processModel.getDescription(), true);
		List<AdProcessArgModel> fieldList = processModel.getParamList();
		ADFormBuilder formStrategy = new ADFormBuilder(fieldList);
		formStrategy.setDisableKey(false);
		formStrategy.setCreateGridEditor(false);
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
