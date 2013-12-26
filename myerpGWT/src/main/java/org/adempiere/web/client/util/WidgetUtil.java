package org.adempiere.web.client.util;

import org.adempiere.web.client.component.ImageButtonAppearance;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.button.IconButton.IconConfig;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.HasLayout;

public final class WidgetUtil {

	public static IconButton createIconButton(String imageUrl) {
		ImageButtonAppearance appearance = new ImageButtonAppearance(imageUrl);
		IconConfig config = new IconConfig("iconButton");
		return new IconButton(appearance, config);
	}

	public static TextButton createTextButton(ImageResource icon, String text) {
		TextButton button = new TextButton(text);
		button.setIcon(icon);
		return button;
	}

	public static void doLayout(Widget widget) {
		HasLayout layout = (HasLayout) widget;
		if (null != layout) {
			LoggingUtil.info("forceLayout");
			layout.forceLayout();
		}
	}
	
	public static Window createWindow(String title, int width, int height) {
		Window window = new Window();
		window.setHeadingText(title);
		window.setWidth(width);
		window.setHeight(height);
		window.setModal(true);
		return window;
	}

}
