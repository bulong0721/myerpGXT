package org.adempiere.process;

public class CopyColumnsFromTable extends ServerProcess {
	private Integer	srcTableId;
	private Integer	desTableId;
	private int		count;

	@Override
	protected void preProcess(ProcessContext ctx) {
		srcTableId = (Integer) ctx.getRowMap().get("adTableId");
		desTableId = (Integer) ctx.getParamMap().get("adTableId");
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		return "#" + count;
	}

}
