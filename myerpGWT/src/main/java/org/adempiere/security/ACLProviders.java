package org.adempiere.security;

import java.util.List;
import java.util.Map;

import org.adempiere.model.ADFormAccess;
import org.adempiere.model.ADProcessAccess;
import org.adempiere.model.ADWindowAccess;
import org.adempiere.model.ADWorkflowAccess;
import org.adempiere.persist.PersistContext;
import org.adempiere.util.POUtil;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Maps;

public class ACLProviders {
	private final static Cache<Integer, Map<Integer, ADProcessAccess>>	processCache;
	private final static Cache<Integer, Map<Integer, ADWindowAccess>>	windowCache;
	private final static Cache<Integer, Map<Integer, ADFormAccess>>		formCache;
	private final static Cache<Integer, Map<Integer, ADWorkflowAccess>>	workflowCache;

	private final static WorkflowProvider								workflowProvider;
	private final static ProcessProvider								processProvider;
	private final static WindowProvider									windowProvider;
	private final static FormProvider									formProvider;

	static {
		workflowCache = CacheBuilder.newBuilder().build();
		processCache = CacheBuilder.newBuilder().build();
		windowCache = CacheBuilder.newBuilder().build();
		formCache = CacheBuilder.newBuilder().build();

		workflowProvider = new WorkflowProvider();
		processProvider = new ProcessProvider();
		windowProvider = new WindowProvider();
		formProvider = new FormProvider();
	}

	public static ACLProvider<ADWorkflowAccess> getWorkflowProvider() {
		return workflowProvider;
	}
	
	public static ACLProvider<ADProcessAccess> getProcessProvider() {
		return processProvider;
	}

	public static ACLProvider<ADWindowAccess> getWindowProvider() {
		return windowProvider;
	}

	public static ACLProvider<ADFormAccess> getFormProvider() {
		return formProvider;
	}

	public static ProcessAccess createProcessAccess(int roleID) {
		ACLProvider<ADProcessAccess> provider = getProcessProvider();
		return new ProcessAccess(roleID, provider);
	}

	public static WindowAccess createWindowAccess(int roleID) {
		ACLProvider<ADWindowAccess> provider = getWindowProvider();
		return new WindowAccess(roleID, provider);
	}

	public static FormAccess createFormAccess(int roleID) {
		ACLProvider<ADFormAccess> provider = getFormProvider();
		return new FormAccess(roleID, provider);
	}

	static class WorkflowProvider implements ACLProvider<ADWorkflowAccess> {

		private PersistContext	pCtx	= new PersistContext();

		@Override
		public Map<Integer, ADWorkflowAccess> getAccessList(int roleID) {
			Map<Integer, ADWorkflowAccess> resultMap = workflowCache.getIfPresent(roleID);
			if (null == resultMap) {
				resultMap = Maps.newHashMap();
				List<ADWorkflowAccess> accessList = POUtil.queryWorkflowAccessByRole(pCtx, roleID);
				for (ADWorkflowAccess access : accessList) {
					resultMap.put(access.getADWorkflowID(), access);
				}
				workflowCache.put(roleID, resultMap);
			}
			return resultMap;
		}
	}

	static class ProcessProvider implements ACLProvider<ADProcessAccess> {

		private PersistContext	pCtx	= new PersistContext();

		@Override
		public Map<Integer, ADProcessAccess> getAccessList(int roleID) {
			Map<Integer, ADProcessAccess> resultMap = processCache.getIfPresent(roleID);
			if (null == resultMap) {
				resultMap = Maps.newHashMap();
				List<ADProcessAccess> accessList = POUtil.queryProcessAccessByRole(pCtx, roleID);
				for (ADProcessAccess access : accessList) {
					resultMap.put(access.getADProcessID(), access);
				}
				processCache.put(roleID, resultMap);
			}
			return resultMap;
		}
	}

	static class WindowProvider implements ACLProvider<ADWindowAccess> {

		private PersistContext	pCtx	= new PersistContext();

		@Override
		public Map<Integer, ADWindowAccess> getAccessList(int roleID) {
			Map<Integer, ADWindowAccess> resultMap = windowCache.getIfPresent(roleID);
			if (null == resultMap) {
				resultMap = Maps.newHashMap();
				List<ADWindowAccess> accessList = POUtil.queryWindowAccessByRole(pCtx, roleID);
				for (ADWindowAccess access : accessList) {
					resultMap.put(access.getADWindowID(), access);
				}
				windowCache.put(roleID, resultMap);
			}
			return resultMap;
		}
	}

	static class FormProvider implements ACLProvider<ADFormAccess> {
		private PersistContext	pCtx	= new PersistContext();

		@Override
		public Map<Integer, ADFormAccess> getAccessList(int roleID) {
			Map<Integer, ADFormAccess> resultMap = formCache.getIfPresent(roleID);
			if (null == resultMap) {
				resultMap = Maps.newHashMap();
				List<ADFormAccess> accessList = POUtil.queryFormAccessByRole(pCtx, roleID);
				for (ADFormAccess access : accessList) {
					resultMap.put(access.getADFormID(), access);
				}
				formCache.put(roleID, resultMap);
			}
			return resultMap;
		}
	}
}
