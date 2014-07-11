package org.adempiere.process;

import org.adempiere.common.ProcessResult;

/**
 * 原来项目中只是进行加密测试使用并取消不能加密字段的加密设置，功能暂不实装
 * @author Administrator
 *
 */
public class ColumnEncryption extends ServerProcess {

	@Override
	protected void preProcess(ProcessContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean doIt(ProcessResult pResult) throws Exception {
		return true;
	}

}
