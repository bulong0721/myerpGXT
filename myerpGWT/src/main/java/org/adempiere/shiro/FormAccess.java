package org.adempiere.shiro;

import org.adempiere.model.ADFormAccess;

public class FormAccess extends RolePermission<ADFormAccess> {

	public FormAccess(int roleID, ACLProvider<ADFormAccess> provider) {
		super(roleID, provider);
	}

	public FormAccess(int roleID, long resourceId) {
		super(roleID, resourceId, 0);
	}

	@Override
	protected int getTarget() {
		return TARGET_FORM;
	}

	@Override
	protected boolean doImply(ADFormAccess authz, int accessType) {
		return authz.isReadWrite();
	}

}
