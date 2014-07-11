package org.adempiere.process;

import org.adempiere.common.ProcessResult;

public abstract class ServerProcess implements ProcessCall {

    protected ProcessContext context;

    @Override
    public boolean startProcess(ProcessContext ctx, ProcessResult pInfo) {
        lock();
        this.context = ctx;
        if (process(ctx, pInfo)) {
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

    private boolean process(ProcessContext ctx, ProcessResult pResult) {
        boolean success = true;
        try {
            preProcess(ctx);
            success = doIt(null);
        } catch (Throwable e) {
            success = false;
            e.printStackTrace();
            // throw new AdempiereUserError(e.getMessage());
        }

        return success;
    }

    protected abstract void preProcess(ProcessContext ctx);

    protected abstract boolean doIt(ProcessResult pResult) throws Exception;

    protected void postProcess(boolean success) {
    }
}
