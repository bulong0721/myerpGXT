package org.adempiere.web.client.presenter.interfaces;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IBannerView extends ReverseViewInterface<IBannerView.IBannerPresenter>, IsWidget {

    interface IBannerPresenter {
    }

    HasText getUserLabel();
}
