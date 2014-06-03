package org.adempiere.web.inject;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.adempiere.security.ADShiroModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ADServletInjector extends GuiceServletContextListener {
	private ServletContext	servletContext;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("contextInitialized start");
		servletContext = servletContextEvent.getServletContext();
		super.contextInitialized(servletContextEvent);
		System.out.println("contextInitialized end");
	}

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ADShiroModule(servletContext), new ADServletModule());
	}

}
