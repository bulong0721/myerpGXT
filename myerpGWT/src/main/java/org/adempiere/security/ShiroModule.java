package org.adempiere.security;

import javax.servlet.ServletContext;

import org.apache.shiro.guice.web.ShiroWebModule;

import com.google.inject.Inject;

public class ShiroModule extends ShiroWebModule {

	@Inject
	public ShiroModule(ServletContext servletContext) {
		super(servletContext);
	}

	@Override
	protected void configureShiroWeb() {
		bindRealm().to(UserRealm.class).asEagerSingleton();
	}

}
