package org.adempiere.process;

import org.adempiere.common.ProcessResult;


/**
 * @author Administrator
 *
 */
public interface ProcessCall {
	
	/**
	 * @param ctx
	 * @param pi
	 * @return
	 */
	boolean startProcess(ProcessContext ctx, ProcessResult pInfo);
}
