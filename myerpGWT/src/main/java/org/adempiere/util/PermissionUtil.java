package org.adempiere.util;

import org.adempiere.shiro.ADShiroModule;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PermissionUtil {
	private PermissionUtil() {
	}

	static {
		Injector in = Guice.createInjector(new ADShiroModule());
		SecurityManager securityManager = in.getInstance(SecurityManager.class);
		SecurityUtils.setSecurityManager(securityManager);
	}

	public static Subject getSubject() {
		Subject subject = SecurityUtils.getSubject();
		return subject;
	}
}
