package com.deppon.foss.client;

import com.deppon.foss.client.apps.ADTabPanel;
import com.deppon.foss.client.model.AdWindowModel;
import com.google.gwt.inject.client.AbstractGinModule;

public class MyerpModule extends AbstractGinModule {
	
	@Override
	protected void configure() {
		bind(AdWindowModel.class);
		bind(ADTabPanel.class);
	}
}
