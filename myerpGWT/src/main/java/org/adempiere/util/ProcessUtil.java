package org.adempiere.util;

import java.util.Collections;
import java.util.Map;

import org.adempiere.common.ProcessResult;
import org.adempiere.model.ADPInstance;
import org.adempiere.process.ProcessCall;
import org.adempiere.process.ProcessContext;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.util.StringUtil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public final class ProcessUtil {
	public static final String								SCRIPT_PREFIX	= "@script:";
	public static final String								JASPER_STARTER_CLASS;
	private static final TypeReference<Map<String, Object>>	MAP_TYPERE_FERENCE;
	private static final Map<String, Object>				EMPTY_MAP;

	static {
		JASPER_STARTER_CLASS = "org.adempiere.report.ReportStarter";
		MAP_TYPERE_FERENCE = new TypeReference<Map<String, Object>>() {
		};
		EMPTY_MAP = Collections.<String, Object> emptyMap();
	}

	public static Map<String, Object> toMap(String json) {
		if (StringUtil.isNullOrEmpty(json)) {
			return EMPTY_MAP;
		}
		return JSON.parseObject(json, MAP_TYPERE_FERENCE);
	}

	public static ProcessContext createContext(ADProcessModel pModel, String rowJson, String paramJson) {
		Map<String, Object> paramMap = toMap(paramJson);
		Map<String, Object> rowMap = toMap(rowJson);
		return new ProcessContext(pModel, rowMap, paramMap);
	}

	public static void process(ProcessContext ctx, ProcessResult pi) {
		ADPInstance instance = null;
		try {
			instance = createPInstance();
		} catch (Exception e) {
			pi.setSummary(e.getLocalizedMessage());
			pi.setHasError(true);
			return;
		} catch (Error e) {
			pi.setSummary(e.getLocalizedMessage());
			pi.setHasError(true);
			return;
		}
//		if (!POUtil.save(ctx.getEntityManager(), instance)) {
//			pi.setSummary("ProcessNoInstance");
//			pi.setHasError(true);
//			return;
//		}
		ctx.setAdPinstanceId(instance.getADPInstanceID());
		ProcessUtil.startProcess(ctx, pi);
	}

	private static ADPInstance createPInstance() {
		//TODO
		ADPInstance pInstance = new ADPInstance();
		return pInstance;
	}

	private static void startProcess(ProcessContext ctx, ProcessResult pi) {
		ADProcessModel pModel = ctx.getProcessModel();

		String procedureName = pModel.getProcedurename();
		/**********************************************************************
		 * Workflow
		 */
		if (null != pModel.getAdWorkflowId() && pModel.getAdWorkflowId() > 0) {
			startWorkflow(ctx, pi);
			return;
		}

		// Clear Jasper Report class if default - to be executed later
		boolean isJasper = false;
		boolean isReport = is(pModel.getIsreport(), false);
		if (!StringUtil.isNullOrEmpty(pModel.getJasperreport())) {
			isJasper = true;
		}

		/**********************************************************************
		 * Start Optional Class
		 */
		if (pModel.getClassname() != null) {
			if (isJasper) {
				ctx.setReportingProcess(true);
			}
			// Run Class
			if (!ProcessUtil.runProcess(ctx, pi)) {
				return;
			}
			// No Optional SQL procedure ... done
			if (!isReport && StringUtil.isNullOrEmpty(procedureName)) {
				return;
			}
			// No Optional Report ... done
			if (isReport && pModel.getAdReportviewId() == 0 && !isJasper) {
				return;
			}
		}

		/**********************************************************************
		 * Report submission
		 */
		// Optional Pre-Report Process
		if (isReport && !StringUtil.isNullOrEmpty(procedureName)) {
			ctx.setReportingProcess(true);
			if (!startDBProcess(procedureName)) {
				return;
			}
		} // Pre-Report

		if (isJasper) {
			ctx.setReportingProcess(true);
			ctx.setClassName(ProcessUtil.JASPER_STARTER_CLASS);
			ProcessUtil.runProcess(ctx, pi);
			return;
		}

		if (isReport) {
			ctx.setReportingProcess(true);
			// Start Report -----------------------------------------------
			boolean ok = ProcessUtil.startReport(ctx, pi);
			pi.setSummary("Report", !ok);
		}
		/**********************************************************************
		 * Process submission
		 */
		else {
			if (!startDBProcess(procedureName)) {
				return;
			}
		} // *** Process submission ***
	}
	
	static boolean is(Boolean value, boolean nullValue) {
		if (null != value) {
			return value.booleanValue();
		}
		return nullValue;
	}

	private static boolean runProcess(ProcessContext ctx, ProcessResult pi) {
		if (ctx.getClassName().toLowerCase().startsWith(SCRIPT_PREFIX)) {
			return ProcessUtil.startScriptProcess(ctx, pi);
		} else {
			return ProcessUtil.startJavaProcess(ctx, pi);
		}
	}

	public static boolean startReport(ProcessContext ctx, ProcessResult pi) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean startDBProcess(String procedureName) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param ctx
	 * @param result
	 * @return
	 */
	public static boolean startJavaProcess(ProcessContext ctx, final ProcessResult pi) {
		String className = ctx.getClassName();
		if (className == null) {
			ADProcessModel pModel = ctx.getProcessModel();
			if (pModel.getJasperreport() != null)
				className = JASPER_STARTER_CLASS;
		}
		// Get Class
		Class<?> processClass = null;
		// use context classloader if available
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null)
			classLoader = ProcessUtil.class.getClassLoader();
		try {
			processClass = classLoader.loadClass(className);
		} catch (ClassNotFoundException ex) {
			return false;
		}

		// Get Process
		ProcessCall process = null;
		try {
			process = (ProcessCall) processClass.newInstance();
		} catch (Exception ex) {
			pi.setSummary("InstanceError", true);
			return false;
		}

		boolean success = false;
		try {
			success = process.startProcess(ctx, pi);
		} catch (Exception e) {
			pi.setSummary("ProcessError " + e.getLocalizedMessage(), true);
			return false;
		}
		return success;
	}

	/**
	 * @param ctx
	 * @param result
	 * @return
	 */
	public static boolean startScriptProcess(ProcessContext ctx, final ProcessResult result) {
		// TODO
		return false;
	}

	/**
	 * @param ctx
	 * @param result
	 * @return
	 */
	public static boolean startWorkflow(ProcessContext ctx, final ProcessResult result) {
		// TODO
		return false;
	}
}
