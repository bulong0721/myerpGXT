package org.adempiere.util;

import java.util.Collections;
import java.util.List;

import org.adempiere.model.ADUser;
import org.adempiere.model.ADUserRoles;
import org.adempiere.security.FormAccess;
import org.adempiere.security.ProcessAccess;
import org.adempiere.security.WindowAccess;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;

public class PermissionUtil {
	private PermissionUtil() {
	}

	public static synchronized Subject getSubject() {
		Subject subject = SecurityUtils.getSubject();
		return subject;
	}

	public static ADUser getCurrentUser() {
		return (ADUser) getSubject().getPrincipal();
	}

	public static List<Integer> getCurrentRoles() {
		ADUser user = (ADUser) getSubject().getPrincipal();
		if (null == user || null == user.getADUserRoles()) {
			return Collections.emptyList();
		}
		return ImmutableList.copyOf(Collections2.transform(
				user.getADUserRoles(), new Function<ADUserRoles, Integer>() {
					@Override
					public Integer apply(ADUserRoles input) {
						return input.getADRoleID();
					}
				}));
	}

	public static boolean isPermittedForm(int resourceID) {
		for (Integer userRole : getCurrentRoles()) {
			FormAccess access = new FormAccess(userRole, resourceID);
			if (getSubject().isPermitted(access)) {
				return true;
			}
		}
		return false;
	}

	public static void checkFormAccess(int resourceID)
			throws AuthorizationException {
		if (!isPermittedForm(resourceID)) {
			throw new AuthorizationException(
					"Not authorized to access the form");
		}
	}

	public static boolean isPermittedWindow(int resourceID) {
		for (Integer userRole : getCurrentRoles()) {
			WindowAccess access = new WindowAccess(userRole, resourceID);
			if (getSubject().isPermitted(access)) {
				return true;
			}
		}
		return false;
	}

	public static void checkWindowAccess(int resourceID)
			throws AuthorizationException {
		if (!isPermittedWindow(resourceID)) {
			throw new AuthorizationException(
					"Not authorized to access the window");
		}
	}

	public static boolean isPermittedProcess(int resourceID) {
		for (Integer userRole : getCurrentRoles()) {
			ProcessAccess access = new ProcessAccess(userRole, resourceID);
			if (getSubject().isPermitted(access)) {
				return true;
			}
		}
		return false;
	}

	public static void checkProcessAccess(int resourceID)
			throws AuthorizationException {
		if (!isPermittedProcess(resourceID)) {
			throw new AuthorizationException(
					"Not authorized to access the window");
		}
	}
}
