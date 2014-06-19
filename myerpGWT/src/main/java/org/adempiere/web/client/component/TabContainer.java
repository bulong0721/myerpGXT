package org.adempiere.web.client.component;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.ToggleGroup;
import com.sencha.gxt.widget.core.client.Composite;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.CardLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.VBoxLayoutContainer;

public class TabContainer extends Composite implements HasValueChangeHandlers<Object> {

	private static TabpanelUiBinder	uiBinder	= GWT.create(TabpanelUiBinder.class);

	private final class TabChangetHandler implements ValueChangeHandler<HasValue<Boolean>> {
		@Override
		public void onValueChange(ValueChangeEvent<HasValue<Boolean>> event) {
			PushButton widget = (PushButton) event.getValue();
			int index = tabContainer.getWidgetIndex(widget);
			Widget content = bodyContainer.getWidget(index);
			bodyContainer.setActiveWidget(content);
			ValueChangeEvent.fire(TabContainer.this, getActiveTag());
		}
	}

	interface TabpanelUiBinder extends UiBinder<Widget, TabContainer> {
	}

	interface ADTabpanelStyle extends CssResource {
		String pushButton();
	}

	class PushButton extends ToggleButton implements HasValue<Boolean> {
		private Object	tag;

		public PushButton(Object tag) {
			super();
			this.tag = tag;
		}

		public Object getTag() {
			return tag;
		}

		@Override
		protected void onClick(Event event) {
			int index = tabContainer.getWidgetIndex(this);
			if (index == getActiveIndex()) {
				setValue(true, true);
			}
		}

	}

	public static class TabItemConfig {
		private String	text;
		private Object	tag;
		private int		level;

		public TabItemConfig(String text, int level) {
			this(text, null, level);
		}

		public TabItemConfig(String text, Object tag, int level) {
			super();
			this.text = text;
			this.tag = tag;
			this.level = level;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Object getTag() {
			return tag;
		}

		public void setTag(Object tag) {
			this.tag = tag;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

	}

	@UiField
	HorizontalLayoutContainer			container;
	@UiField
	CardLayoutContainer					bodyContainer;
	@UiField
	VBoxLayoutContainer					tabContainer;
	@UiField
	HorizontalLayoutData				bodyLayoutData;
	@UiField
	BoxLayoutData						barLayoutData;
	@UiField
	HorizontalLayoutData				tabLayoutData;
	@UiField
	ADTabpanelStyle						panelStyle;
	private Map<Widget, TabItemConfig>	configMap	= new HashMap<Widget, TabItemConfig>();
	private ToggleGroup					tabGroup	= new ToggleGroup();
	private TabChangetHandler			handler		= new TabChangetHandler();
	private static final int			BAR_STEP	= 15;
	private static final int			INIT_SIZE	= 100;
	private int							maxLevel;

	public TabContainer() {
		initWidget(uiBinder.createAndBindUi(this));
		tabGroup.addValueChangeHandler(handler);
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<Object> handler) {
		return addHandler(handler, ValueChangeEvent.getType());
	}

	public void add(IsWidget widget, TabItemConfig config) {
		add(widget.asWidget(), config);
	}

	public void add(Widget widget, TabItemConfig config) {
		configMap.put(widget, config);
		PushButton tabButton = createButton(config.getText(), config.getTag(), config.getLevel());
		tabContainer.add(tabButton);
		tabGroup.add(tabButton);
		bodyContainer.add(widget);
		bodyContainer.syncSize();
		tabContainer.syncSize();
	}

	public Widget getActiveWidget() {
		return bodyContainer.getActiveWidget();
	}

	public int getActiveIndex() {
		Widget widget = getActiveWidget();
		return bodyContainer.getWidgetIndex(widget);
	}

	public int getIndex(Widget widget) {
		return bodyContainer.getWidgetIndex(widget);
	}

	private PushButton getActiveButton() {
		int index = getActiveIndex();
		return (PushButton) tabContainer.getWidget(index);
	}

	public Object getActiveTag() {
		PushButton activeButton = getActiveButton();
		return activeButton.getTag();
	}
	
	public Object getTagByIndex(int index) {
		PushButton button = (PushButton) tabContainer.getWidget(index);
		return button.getTag();
	}

	public void setTabVisable(boolean visable) {
		tabContainer.setVisible(visable);
	}

	public void setActiveIndex(int index) {
		PushButton button = (PushButton) tabContainer.getWidget(index);
		button.setValue(true, true);
	}

	private PushButton createButton(String text, Object tag, int level) {
		PushButton pButton = new PushButton(tag);
		pButton.addStyleName(panelStyle.pushButton());
		pButton.setLayoutData(barLayoutData);
		pButton.setText(text);
		pButton.setWidth(INIT_SIZE + (maxLevel - level) * BAR_STEP);
		return pButton;
	}

	public int getWidgetCount() {
		return bodyContainer.getWidgetCount();
	}
	
	public void trimWhenSingleTab() {
		if (1 == getWidgetCount()) {
			container.remove(tabContainer);
		}
	}
}
