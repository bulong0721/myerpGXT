package org.adempiere.security;

import javax.servlet.ServletContext;

import org.apache.shiro.guice.web.ShiroWebModule;

import com.google.inject.Inject;

public class ADShiroModule extends ShiroWebModule {

	@Inject
	public ADShiroModule(ServletContext servletContext) {
		super(servletContext);
	}

	@Override
	protected void configureShiroWeb() {
		bindRealm().to(ADUserRealm.class).asEagerSingleton();
	}

}
