package org.adempiere.process;

import org.adempiere.common.ProcessResult;
import org.adempiere.service.CacheManager;

public class CacheReset extends ServerProcess {

    @Override
    protected void preProcess(ProcessContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    protected boolean doIt(ProcessResult pResult) throws Exception {
        CacheManager.invalidateAll();
        return true;
    }

}
