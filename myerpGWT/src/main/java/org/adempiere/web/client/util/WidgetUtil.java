package org.adempiere.web.client.util;

import org.adempiere.web.client.component.ImgButtonAppearance;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.ButtonCell.IconAlign;
import com.sencha.gxt.widget.core.client.Component;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.button.IconButton;
import com.sencha.gxt.widget.core.client.button.IconButton.IconConfig;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.HasLayout;

public final class WidgetUtil {

	public static void showMessageBox(String title, String message) {
		AlertMessageBox dialog = new AlertMessageBox(title, message);
		dialog.show();
	}

	public static IconButton createIconButton(String imageUrl) {
		ImgButtonAppearance appearance = new ImgButtonAppearance(imageUrl);
		IconConfig config = new IconConfig("iconButton");
		return new IconButton(appearance, config);
	}

	public static TextButton createTextButton(ImageResource icon, String text, IconAlign iconAlign) {
		TextButton button = new TextButton(text);
		button.setIconAlign(iconAlign);
		button.setIcon(icon);
		return button;
	}

	public static void doLayout(Widget widget) {
		HasLayout layout = (HasLayout) widget;
		if (null != layout) {
			layout.forceLayout();
		}
	}

	public static void syncSize(Widget widget) {
		Component component = (Component) widget;
		if (null != component) {
			component.syncSize();
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

	public static void mask(IsWidget widget, String message) {
		mask(Widget.asWidgetOrNull(widget), message);
	}

	public static void unmask(IsWidget widget) {
		unmask(Widget.asWidgetOrNull(widget));
	}

	public static void mask(Widget widget, String message) {
		if (widget instanceof Component) {
			Component component = (Component) widget;
			component.mask(message);
		}
	}

	public static void unmask(Widget widget) {
		if (widget instanceof Component) {
			Component component = (Component) widget;
			component.unmask();
		}

	}
}
