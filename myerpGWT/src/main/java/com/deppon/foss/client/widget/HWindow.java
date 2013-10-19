package com.deppon.foss.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

public class HWindow implements IsWidget {

	private static HWindowUiBinder	uiBinder	= GWT.create(HWindowUiBinder.class);

	interface HWindowUiBinder extends UiBinder<Widget, HWindow> {
	}

	public static interface HistoryLoader {
		void loadData(History history);
	}

	public static enum History {
		Day(0), Week(1), Month(2), Year(3), All(4);

		@SuppressWarnings("unused")
		private int	value;

		History(int value) {
			this.value = value;
		}

		public static History fromInteger(int value) {
			switch (value) {
			case 0:
				return Day;
			case 1:
				return Week;
			case 2:
				return Month;
			case 3:
				return Year;
			case 4:
				return All;
			default:
				return All;
			}
		}
	}

	@UiField
	Window					window;
	@UiField
	TextButton				dayButton;
	@UiField
	TextButton				weekButton;
	@UiField
	TextButton				monthButton;
	@UiField
	TextButton				yearButton;
	@UiField
	TextButton				allButton;
	private HistoryLoader	loader;
	private Widget			widget;
	private static HWindow	instance;

	public static HWindow instance(HistoryLoader loader) {
		if (null == instance) {
			instance = new HWindow();
		}
		instance.setLoader(loader);
		return instance;
	}

	private HWindow() {
		super();
	}

	public void show() {
		this.asWidget();
		this.window.show();
	}

	public void setLoader(HistoryLoader loader) {
		this.loader = loader;
	}

	@UiHandler({ "dayButton", "weekButton", "monthButton", "yearButton", "allButton" })
	public void onButtonSelected(SelectEvent event) {
		if (null == loader) {
			return;
		}
		TextButton sourceButton = (TextButton) event.getSource();
		int index = window.getButtonBar().getWidgetIndex(sourceButton);
		History history = History.fromInteger(index);
		loader.loadData(history);
		window.hide();
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

}
