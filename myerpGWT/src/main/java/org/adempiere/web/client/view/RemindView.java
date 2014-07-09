package org.adempiere.web.client.view;

import org.adempiere.web.client.presenter.interfaces.IRemindView;
import org.adempiere.web.client.presenter.interfaces.IRemindView.IRemindPresenter;
import org.adempiere.web.client.util.WidgetUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.sencha.gxt.widget.core.client.Status;

@Singleton
public class RemindView extends BaseReverseView<IRemindPresenter> implements IRemindView {

    private static RemindViewUiBinder uiBinder = GWT.create(RemindViewUiBinder.class);

    interface RemindViewUiBinder extends UiBinder<Widget, RemindView> {
    }

    @UiField
    Status majorLabel;
    @UiField
    Status minorLabel;

    @Override
    public Widget asWidget() {
        if (null == widget) {
            widget = uiBinder.createAndBindUi(this);
            WidgetUtil.getDesktop().setStatusBar(this);
        }
        return widget;
    }

    @Override
    public Status getMajorLabel() {
        return majorLabel;
    }

    @Override
    public Status getMinorLabel() {
        return minorLabel;
    }

}
