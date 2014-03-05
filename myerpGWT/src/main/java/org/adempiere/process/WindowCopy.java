package org.adempiere.process;

import java.util.List;

import org.adempiere.common.AdempiereUserError;
import org.adempiere.model.ADField;
import org.adempiere.model.ADTab;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;

public class WindowCopy extends ServerProcess {
	private Integer	srcWindowId;
	private Integer	desWindowId;

	@Override
	protected void preProcess(ProcessContext ctx) {
		desWindowId = (Integer) ctx.getRowMap().get("adWindowId");
		srcWindowId = (Integer) ctx.getParamMap().get("adWindowId");
		System.out.println("desWindowId:" + desWindowId + " srcWindowId:" + srcWindowId);
	}

	@Override
	protected String doIt() throws Exception {
		if (null == srcWindowId)
			throw new AdempiereUserError("@NotFound@ (from->) @AD_Window_ID@");
		if (null == desWindowId)
			throw new AdempiereUserError("@NotFound@ (to<-) @AD_Window_ID@");
		int tabCount = 0;
		int fieldCount = 0;
		List<ADTab> srcTabs = POUtil.queryTabsByWindow(context, srcWindowId);
		for (ADTab srcTab : srcTabs) {
			ADTab newTab = DTOUtil.copyTab(srcTab, desWindowId);
			newTab.setADTabID(null);
			POUtil.persist(context, newTab);
			Integer newTabId = (Integer) POUtil.getIdentifier(context, newTab);
			List<ADField> srcFields = POUtil.queryFieldsByTabId(context, srcTab.getADTabID());
			tabCount++;
			for (ADField srcField : srcFields) {
				ADField descField = DTOUtil.copyField(srcField, newTabId);
				descField.setADFieldID(null);
				if (POUtil.persist(context, descField)) {
					fieldCount++;
				} else {
					throw new AdempiereUserError("@Error@ @AD_Field_ID@");
				}
			}
		}
		return "@Copied@ #" + tabCount + "/" + fieldCount;
	}

}
