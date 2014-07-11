package org.adempiere.process;

import org.adempiere.common.ProcessResult;

public class CopyColumnsFromTable extends ServerProcess {

    private Integer srcTableId;
    private Integer desTableId;
    private int     count;

    @Override
    protected void preProcess(ProcessContext ctx) {
        srcTableId = (Integer) ctx.getRowMap().get("adTableId");
        desTableId = (Integer) ctx.getParamMap().get("adTableId");
    }

    @Override
    protected boolean doIt(ProcessResult pResult) throws Exception {
        // TODO Auto-generated method stub
        pResult.addLog("#" + count);
        return true;
    }

}
