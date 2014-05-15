package org.adempiere.acl;

import java.util.Map;

public interface ACLProvider<A> {

	Map<Integer, A> getAccessList(int roleID);
}
