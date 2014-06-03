package org.adempiere.security;

import org.adempiere.model.ADUser;
import org.adempiere.model.ADUserRoles;
import org.adempiere.persist.PersistContext;
import org.adempiere.util.POUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class ADUserRealm extends AuthorizingRealm {
	private PersistContext	pCtx	= new PersistContext();

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		ADUser user = (ADUser) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		if (null != user.getADUserRoles()) {
			for (ADUserRoles role : user.getADUserRoles()) {
				authorizationInfo.addObjectPermission(ACLProviders.createProcessAccess(role.getADRoleID()));
				authorizationInfo.addObjectPermission(ACLProviders.createWindowAccess(role.getADRoleID()));
				authorizationInfo.addObjectPermission(ACLProviders.createFormAccess(role.getADRoleID()));
			}
		}
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();
		ADUser user = POUtil.queryUserByName(pCtx, userName);
		if (null == user) {
			throw new UnknownAccountException("该用户不存在");
		}
		if (!user.isActive()) {
			throw new LockedAccountException("该用户已经被锁定");
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
		return authenticationInfo;
	}

}
