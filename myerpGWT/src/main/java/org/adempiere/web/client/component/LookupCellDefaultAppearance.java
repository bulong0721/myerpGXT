package org.adempiere.web.client.component;

import org.adempiere.web.client.component.LookupField.LookupCellAppearance;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance;

public class LookupCellDefaultAppearance extends TriggerFieldDefaultAppearance implements LookupCellAppearance {

    public interface LookupCellResources extends TriggerFieldResources, ClientBundle {

        @Source({ "ValueBaseField.css", "TextField.css", "TriggerField.css" })
        LookupCellStyle css();

        @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
        ImageResource textBackground();

        @Source("lookupArrow.png")
        ImageResource triggerArrow();

        @Source("lookupArrowOver.png")
        ImageResource triggerArrowOver();

        @Source("lookupArrowClick.png")
        ImageResource triggerArrowClick();

        @Source("lookupArrowFocus.png")
        ImageResource triggerArrowFocus();

        ImageResource triggerArrowFocusOver();

        ImageResource triggerArrowFocusClick();
    }

    public interface LookupCellStyle extends TriggerFieldStyle {

    }

    public LookupCellDefaultAppearance(){
        this(GWT.<LookupCellResources> create(LookupCellResources.class));
    }

    public LookupCellDefaultAppearance(LookupCellResources resources){
        super(resources);
    }

}
