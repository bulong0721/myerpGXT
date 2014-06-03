package org.adempiere.web.inject;

import org.adempiere.web.server.AdempiereServlet;
import org.adempiere.web.server.ReportServlet;
import org.apache.shiro.guice.web.GuiceShiroFilter;

import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;

public class ADServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		bind(String.class).annotatedWith(Names.named("systemName")).toInstance("*xxxxxxxxxxxxxxxx*");
		filter("/myerpGXT/adempiere").through(GuiceShiroFilter.class);
		serve("/myerpGXT/adempiere").with(AdempiereServlet.class);
		serve("/myerpGXT/report").with(ReportServlet.class);
	}

}
