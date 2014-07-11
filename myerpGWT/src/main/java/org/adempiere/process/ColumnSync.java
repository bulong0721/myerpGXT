package org.adempiere.process;

import org.adempiere.common.ProcessResult;


/**
 * 从AdColumn表中进行验证数据表是否存在，并创建该字段（暂不实装）
 * @author Administrator
 * 
 */
public class ColumnSync extends ServerProcess {
//	private Integer	adColumnId;

	@Override
	protected void preProcess(ProcessContext ctx) {
//		adColumnId = (Integer) ctx.getRowMap().get("adColumnId");
	}

	@Override
	protected boolean doIt(ProcessResult pResult) throws Exception {
//		Connection conn = null;
//		try {
//			conn = context.getConnection();
//			DatabaseMetaData md = conn.getMetaData();
//			String catalog = conn.getCatalog();
//			String schema = null;
//			AdColumn column = POUtil.find(context, AdColumn.class, adColumnId);
//
			return true;
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (Exception e) {
//				}
//			}
//		}
	}

}
