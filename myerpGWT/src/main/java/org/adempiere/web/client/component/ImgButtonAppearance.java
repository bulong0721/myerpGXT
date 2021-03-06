package org.adempiere.web.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.button.IconButton.IconButtonAppearance;

public class ImgButtonAppearance implements IconButtonAppearance {

	public interface Template extends XTemplates {
		@XTemplate(value = "<img src=\"{url}\" height=\"22\" width=\"22\" />")
		SafeHtml render(String url);
	}

	private final Template	template;
	private String			imageUrl;

	public ImgButtonAppearance(String imageUrl) {
		super();
		this.template = GWT.create(Template.class);
		this.imageUrl = imageUrl;
	}

	@Override
	public XElement getIconElem(XElement parent) {
		return parent;
	}

	@Override
	public void render(SafeHtmlBuilder sb) {
		sb.append(template.render(imageUrl));
	}

}
