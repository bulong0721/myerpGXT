package org.adempiere.web.client.util;

import com.google.gwt.core.client.GWT;

public class ClassUtil {
	private static IClassActivator	classActivator;

	static {
		classActivator = GWT.create(IClassActivator.class);
		classActivator.init();
	}

	public static <V> Class<V> forName(String className) {
		return classActivator.forName(className);
	}

	public static <V> V newInstance(String className) {
		return classActivator.newInstance(className);
	}

	public static <V> V newInstance(Class<V> clazz) {
		return classActivator.newInstance(clazz);
	}
}
