package org.adempiere.web.client.apps;

import org.adempiere.web.client.component.ModalDialog;
import org.adempiere.web.client.model.FieldModel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;

public class InfoPanel extends ModalDialog {

    private static InfoPanelUiBinder uiBinder = GWT.create(InfoPanelUiBinder.class);

    interface InfoPanelUiBinder extends UiBinder<Widget, InfoPanel> {
    }

    private Widget widget = null;

    @Override
    public Widget asWidget() {
        if (null == widget) {
            widget = uiBinder.createAndBindUi(this);
        }
        return widget;
    }

    public static InfoPanel create(FieldModel field) {
        // TODO Auto-generated method stub
        return null;
    }

}
