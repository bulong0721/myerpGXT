package org.adempiere.web.client.view;

import org.adempiere.web.client.presenter.interfaces.IRootView;

import com.google.inject.Singleton;
import com.sencha.gxt.widget.core.client.container.Viewport;

@Singleton
public class RootView extends Viewport implements IRootView {

	protected IRootPresenter	presenter;

	@Override
	public void setPresenter(IRootPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public IRootPresenter getPresenter() {
		return presenter;
	}

}
