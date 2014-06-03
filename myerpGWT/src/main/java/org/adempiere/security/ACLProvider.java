package org.adempiere.security;

import java.util.Map;

public interface ACLProvider<A> {

	Map<Integer, A> getAccessList(int roleID);
}
