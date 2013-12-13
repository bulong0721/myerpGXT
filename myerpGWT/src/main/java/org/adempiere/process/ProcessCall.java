package org.adempiere.process;

import org.adempiere.model.common.ProcessInfo;

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
	boolean startProcess(ProcessContext ctx, ProcessInfo pi);
}
