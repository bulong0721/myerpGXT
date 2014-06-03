package org.adempiere.security;

import org.adempiere.model.ADWorkflowAccess;

public class WorkflowAccess extends RolePermission<ADWorkflowAccess> {

	public WorkflowAccess(int roleID, ACLProvider<ADWorkflowAccess> provider) {
		super(roleID, provider);
	}

	public WorkflowAccess(int roleID, int resourceId) {
		super(roleID, resourceId, 0);
	}

	@Override
	protected int getTarget() {
		return TARGET_WORKFLOW;
	}

	@Override
	protected boolean doImply(ADWorkflowAccess authz, int accessType) {
		return authz.isReadWrite();
	}

}
