package org.adempiere.web.client.view;

import org.adempiere.web.client.presenter.interfaces.IContentView;
import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.sencha.gxt.widget.core.client.TabPanel;

@Singleton
public class ContentView extends BaseReverseView<IContentPresenter> implements IContentView {

	private static ContentViewUiBinder	uiBinder	= GWT.create(ContentViewUiBinder.class);

	interface ContentViewUiBinder extends UiBinder<Widget, ContentView> {
	}

	@UiField
	TabPanel		tabPanel;
	private Widget	widget;

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

	@Override
	public TabPanel getTabPanel() {
		return tabPanel;
	}

}
