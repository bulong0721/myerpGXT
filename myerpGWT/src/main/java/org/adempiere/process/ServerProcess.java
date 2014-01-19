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
		postProcess(!pInfo.hasError());
		return !pInfo.hasError();
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
			// throw new RuntimeException(e);
		}

		// transaction should rollback if there are error in process
		if ("@Error@".equals(msg))
			success = false;

		return success;
	}

	protected abstract void preProcess(ProcessContext ctx);

	protected abstract String doIt() throws Exception;

	protected void postProcess(boolean success) {
	}
}
