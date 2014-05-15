package org.adempiere.acl;

import java.util.Map;

import org.apache.shiro.authz.Permission;

public abstract class RolePermission<A> implements Permission {
	protected final int		TARGET_WINDOW	= 1;
	protected final int		TARGET_PROCESS	= 2;
	protected final int		TARGET_FORM		= 3;

	private int				roleID;
	private int				accessType;
	private long			resourceId;
	private ACLProvider<A>	provider;

	public RolePermission(int roleID, ACLProvider<A> provider) {
		super();
		this.roleID = roleID;
		this.provider = provider;
	}

	public RolePermission(int roleID, long resourceId, int accessType) {
		super();
		this.roleID = roleID;
		this.resourceId = resourceId;
		this.accessType = accessType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean implies(Permission p) {
		if (!(p instanceof RolePermission)) {
			return false;
		}
		RolePermission<A> rp = (RolePermission<A>) p;
		if (getTarget() != rp.getTarget() || getRoleID() != rp.getRoleID()) {
			return false;
		}
		Map<Integer, A> acl = provider.getAccessList(rp.getRoleID());
		if (acl.containsKey(rp.getResourceId())) {
			A authz = acl.get(rp.getResourceId());
			return doImply(authz, rp.getAccessType());
		}
		return false;
	}

	protected abstract int getTarget();

	protected abstract boolean doImply(A authz, int accessType);

	public int getRoleID() {
		return roleID;
	}

	public int getAccessType() {
		return accessType;
	}

	public long getResourceId() {
		return resourceId;
	}

	public ACLProvider<A> getProvider() {
		return provider;
	}

}
