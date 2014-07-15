package org.adempiere.process;

import org.adempiere.common.ProcessResult;

public class CopyColumnsFromTable extends ServerProcess {

    private Integer srcTableId;
    private Integer desTableId;
    private int     count;

    @Override
    protected void preProcess(ProcessContext ctx) {
        srcTableId = (Integer) ctx.getRowMap().get("aDTableID");
        desTableId = (Integer) ctx.getParamMap().get("aDTableID");
    }

    @Override
    protected boolean doIt(ProcessResult pResult) throws Exception {
        // TODO Auto-generated method stub
        pResult.setSummary("#" + count);
        return true;
    }

}
