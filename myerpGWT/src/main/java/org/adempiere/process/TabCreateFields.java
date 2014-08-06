package org.adempiere.process;

import java.util.List;

import org.adempiere.common.AdempiereUserError;
import org.adempiere.common.ProcessResult;
import org.adempiere.model.ADColumn;
import org.adempiere.model.ADField;
import org.adempiere.util.POUtil;

public class TabCreateFields extends ServerProcess {

    private Integer adTableId;
    private Integer adTabId;

    @Override
    protected void preProcess(ProcessContext ctx) {
        adTableId = (Integer) ctx.getRowMap().get("aDTableID");
        adTabId = (Integer) ctx.getRowMap().get("aDTabID");
    }

    @Override
    protected boolean doIt(ProcessResult pResult) throws Exception {
        if (null == adTableId) throw new AdempiereUserError("@NotFound@ (table->) @AD_Window_ID@");
        if (null == adTabId) throw new AdempiereUserError("@NotFound@ (tab<-) @AD_Window_ID@");
        int count = 0;
        List<ADColumn> unMappedColumns = POUtil.queryUnMappedColumns(context, adTableId, adTabId);
        for (ADColumn column : unMappedColumns) {
            ADField field = createField(column);
            if (POUtil.persist(context, field)) {
                count++;
            }
        }
        pResult.setSummary("@Created@ #" + count);
        return true;
    }

    private ADField createField(ADColumn column) {
        ADField field = new ADField();
        field.setADClientID(column.getADClientID());
        field.setADOrgID(column.getADOrgID());
        field.setADTabID(adTabId);
        field.setADColumnID(column.getADColumnID());
        field.setName(column.getName());

        field.setEntityType("U");
        field.setCentrallyMaintained(true);
        field.setDisplayed(true); // Y
        field.setEncrypted(false);
        field.setFieldOnly(false);
        field.setHeading(false);
        field.setReadOnly(false);
        field.setSameLine(false);

        if (column.isKey()) field.setDisplayed(false);
        return field;
    }

}
