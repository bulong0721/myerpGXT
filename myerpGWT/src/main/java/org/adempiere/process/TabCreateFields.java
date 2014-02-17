package org.adempiere.process;

import java.util.List;

import org.adempiere.common.AdempiereUserError;
import org.adempiere.model.AdColumn;
import org.adempiere.model.AdField;
import org.adempiere.util.POUtil;

public class TabCreateFields extends ServerProcess {

	private Integer	adTableId;
	private Integer	adTabId;

	@Override
	protected void preProcess(ProcessContext ctx) {
		adTableId = (Integer) ctx.getRowMap().get("adTableId");
		adTabId = (Integer) ctx.getRowMap().get("adTabId");
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		if (null == adTableId)
			throw new AdempiereUserError("@NotFound@ (table->) @AD_Window_ID@");
		if (null == adTabId)
			throw new AdempiereUserError("@NotFound@ (tab<-) @AD_Window_ID@");
		int count = 0;
		List<AdColumn> unMappedColumns = POUtil.queryUnMappedColumns(context, adTableId, adTabId);
		for (AdColumn column : unMappedColumns) {
			AdField field = createField(column);
			if (POUtil.persist(context, field)) {
				count++;
			}
		}
		return "@Created@ #" + count;
	}
	
	private AdField createField(AdColumn column) {
		AdField field = new AdField();
		field.setAdClientId(column.getAdClientId());
		field.setAdOrgId(column.getAdOrgId());
		field.setAdTabId(adTabId);
		field.setAdColumnId(column.getAdColumnId());
		field.setName(column.getName());
		
		field.setEntitytype("U");		
		field.setIscentrallymaintained(true);
		field.setIsdisplayed (true);	// Y
		field.setIsencrypted (false);
		field.setIsfieldonly (false);
		field.setIsheading (false);
		field.setIsreadonly (false);
		field.setIssameline (false);
		
		if (column.isIskey())
			field.setIsdisplayed(false);
		return field;
	}

}
