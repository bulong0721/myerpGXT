package org.adempiere.web.client.view;

import org.adempiere.web.client.presenter.interfaces.IApplicationView;
import org.adempiere.web.client.presenter.interfaces.IApplicationView.IApplicationPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ApplicationView extends BaseReverseView<IApplicationPresenter> implements IApplicationView {

	private static ApplicationViewUiBinder	uiBinder	= GWT.create(ApplicationViewUiBinder.class);

	interface ApplicationViewUiBinder extends UiBinder<Widget, ApplicationView> {
	}

//	@UiField(provided = true)
//	RemindView		remindView;
	@UiField(provided = true)
	BannerView		bannerView;
	@UiField(provided = true)
	NavigationView	navView;
	@UiField(provided = true)
	ContentView		contentView;

	@Inject
	public ApplicationView(BannerView bannerView, NavigationView navView, ContentView contentView/*, RemindView remindView*/) {
		this.bannerView = bannerView;
		this.navView = navView;
		this.contentView = contentView;
//		this.remindView = remindView;
	}

	@Override
	public Widget asWidget() {
		if (null == widget) {
			widget = uiBinder.createAndBindUi(this);
		}
		return widget;
	}

}
