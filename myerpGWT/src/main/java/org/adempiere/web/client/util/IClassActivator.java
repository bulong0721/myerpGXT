package org.adempiere.web.client.util;

public interface IClassActivator {

	<V> Class<V> forName(String className);

	<V> V newInstance(String className);

	<V> V newInstance(Class<V> clazz);

	void init();
}
