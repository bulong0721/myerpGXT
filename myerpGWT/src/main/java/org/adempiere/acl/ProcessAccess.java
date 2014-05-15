package org.adempiere.acl;

import org.adempiere.model.ADProcessAccess;

public class ProcessAccess extends RolePermission<ADProcessAccess> {

	public ProcessAccess(int roleID, ACLProvider<ADProcessAccess> provider) {
		super(roleID, provider);
	}

	public ProcessAccess(int roleID, long resourceId) {
		super(roleID, resourceId, 0);
	}

	@Override
	protected int getTarget() {
		return TARGET_PROCESS;
	}

	@Override
	protected boolean doImply(ADProcessAccess authz, int accessType) {
		return authz.isReadWrite();
	}

}
