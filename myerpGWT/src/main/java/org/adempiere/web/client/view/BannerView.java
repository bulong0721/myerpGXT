package org.adempiere.web.client.view;

import org.adempiere.web.client.presenter.interfaces.IBannerView;
import org.adempiere.web.client.presenter.interfaces.IBannerView.IBannerPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;

@Singleton
public class BannerView extends BaseReverseView<IBannerPresenter> implements IBannerView {

	private static BannerViewUiBinder	uiBinder	= GWT.create(BannerViewUiBinder.class);

	interface BannerViewUiBinder extends UiBinder<Widget, BannerView> {
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

}
