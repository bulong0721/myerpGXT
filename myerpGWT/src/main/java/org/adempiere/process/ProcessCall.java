package org.adempiere.process;


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
	boolean startProcess(ProcessContext ctx);
}
