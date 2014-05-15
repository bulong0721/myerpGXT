package org.adempiere.acl;

import org.adempiere.model.ADWindowAccess;

public class WindowAccess extends RolePermission<ADWindowAccess> {

	public WindowAccess(int roleID, ACLProvider<ADWindowAccess> provider) {
		super(roleID, provider);
	}

	public WindowAccess(int roleID, long resourceId) {
		super(roleID, resourceId, 0);
	}

	@Override
	protected int getTarget() {
		return TARGET_WINDOW;
	}

	@Override
	protected boolean doImply(ADWindowAccess authz, int accessType) {
		return authz.isReadWrite();
	}

}
