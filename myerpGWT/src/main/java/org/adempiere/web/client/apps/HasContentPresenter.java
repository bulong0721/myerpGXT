package org.adempiere.web.client.apps;

import org.adempiere.web.client.presenter.interfaces.IContentView.IContentPresenter;

public interface HasContentPresenter {
	
	/**
	 * @return
	 */
	IContentPresenter getContentPresenter();

	/**
	 * @param p
	 */
	void setContentPresenter(IContentPresenter p);
}
