package org.adempiere.shiro;

import org.apache.shiro.guice.ShiroModule;

public class ADShiroModule extends ShiroModule {

	@Override
	protected void configureShiro() {
		bindRealm().to(ADUserRealm.class).asEagerSingleton();
	}

}
