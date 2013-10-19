package com.deppon.foss.client.apps;

import com.deppon.foss.client.presenter.interfaces.IContentView.IContentPresenter;

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
