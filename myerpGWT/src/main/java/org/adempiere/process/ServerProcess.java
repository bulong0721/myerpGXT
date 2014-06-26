package org.adempiere.process;

import org.adempiere.common.ProcessResult;

public abstract class ServerProcess implements ProcessCall {
	protected ProcessContext	context;

	@Override
	public boolean startProcess(ProcessContext ctx, ProcessResult pInfo) {
		lock();
		this.context = ctx;
		if (process(ctx)) {
		}
		unlock();
		postProcess(!pInfo.isSuccess());
		return !pInfo.isSuccess();
	}

	private void unlock() {
		// TODO Auto-generated method stub
	}

	private void lock() {
		// TODO Auto-generated method stub

	}

	private boolean process(ProcessContext ctx) {
		String msg = null;
		boolean success = true;
		try {
			preProcess(ctx);
			msg = doIt();
		} catch (Throwable e) {
			success = false;
			e.printStackTrace();
//			throw new AdempiereUserError(e.getMessage());
		}

		// transaction should rollback if there are error in process
		if (null != msg && msg.startsWith("@Error@"))
			success = false;

		return success;
	}

	protected String getSusscess() {
		return "";
	}

	protected String getError(String error) {
		return error;
	}

	protected abstract void preProcess(ProcessContext ctx);

	protected abstract String doIt() throws Exception;

	protected void postProcess(boolean success) {
	}
}
