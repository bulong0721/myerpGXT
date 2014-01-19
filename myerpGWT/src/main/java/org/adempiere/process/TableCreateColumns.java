package org.adempiere.process;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.List;

import org.adempiere.common.DisplayType;
import org.adempiere.model.AdColumn;
import org.adempiere.model.AdElement;
import org.adempiere.model.AdTable;
import org.adempiere.util.Env;
import org.adempiere.util.POUtil;
import org.adempiere.web.client.util.StringUtil;

public class TableCreateColumns extends ServerProcess {
	private boolean	putAllTables	= false;
	private int		count;
	private int		tableId;

	@Override
	protected void preProcess(ProcessContext ctx) {
		tableId = (Integer) ctx.getRowMap().get("adTableId");
	}

	@Override
	protected String doIt() throws Exception {
		Connection conn = null;
		try {
			conn = context.getConnection();
			DatabaseMetaData md = conn.getMetaData();
			String catalog = conn.getCatalog();
			String schema = null;

			if (putAllTables)
				addTable(md, catalog, schema);
			else {
				AdTable table = POUtil.find(context.getEntityManager(), AdTable.class, tableId);
				String tableName = table.getTablename();
				ResultSet rs = md.getColumns(catalog, schema, tableName, null);
				addTableColumn(rs, table);
			}

			return "#" + count;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}

	private void addTable(DatabaseMetaData dmd, String catalog, String schema) throws Exception {
		ResultSet rs = dmd.getTables(catalog, schema, null, null);
		while (rs.next()) {
			String tableName = rs.getString("TABLE_NAME");
			// Try to find
			AdTable table = POUtil.findByTableName(context.getEntityManager(), tableName);
			// Create new ?
			if (table == null) {
				String tn = tableName.toUpperCase();
				if (tn.startsWith("T_SELECTION") // temp table
						|| tn.endsWith("_VT") // print trl views
						|| tn.endsWith("_V") // views
						|| tn.endsWith("_V1") // views
						|| tn.startsWith("A_A") // asset tables not yet
						|| tn.startsWith("A_D") // asset tables not yet
						|| tn.indexOf('$') != -1 // oracle system tables
						|| tn.indexOf("EXPLAIN") != -1 // explain plan
				) {
					continue;
				}

				// Create New
				table = new AdTable();
				// table.setEntityType(p_EntityType);
				table.setName(tableName);
				table.setTablename(tableName);
				table.setIsview(false);
				if (!POUtil.save(context.getEntityManager(), table)) {
					continue;
				}
			}
			ResultSet rsC = dmd.getColumns(catalog, schema, tableName, null);
			addTableColumn(rsC, table);
		}
	} // addTable

	private void addTableColumn(ResultSet rs, AdTable table) throws Exception {
		String tableName = table.getTablename();
		List<AdColumn> columnList = POUtil.queryColumnsByTable(context.getEntityManager(), table.getAdTableId());
		while (rs.next()) {
			String tn = rs.getString("TABLE_NAME");
			if (!tableName.equalsIgnoreCase(tn))
				continue;
			String columnName = rs.getString("COLUMN_NAME");
			AdColumn column = getColumn(columnList, columnName);
			if (column != null)
				continue;
			int dataType = rs.getInt("DATA_TYPE");
			String typeName = rs.getString("TYPE_NAME");
			int size = rs.getInt("COLUMN_SIZE");
			//
			column = createColumn(table);
			column.setEntitytype("D");
			//
			AdElement element = POUtil.findElementByColumn(context.getEntityManager(), columnName);
			if (element == null) {
				element = createElement(column);
				if (columnName.equalsIgnoreCase(table.getTablename() + "_ID")) {
					element.setColumnname(table.getTablename() + "_ID");
					element.setName(table.getName());
					element.setPrintname(table.getName());
				}
				// TODO
//				POUtil.save(context.getEntityManager(), element);
			}
			column.setColumnname(element.getColumnname());
			column.setName(element.getName());
			column.setDescription(element.getDescription());
			column.setHelp(element.getHelp());
			column.setAdElementId(element.getAdElementId());
			column.setIsmandatory(false);
			if (columnName.equalsIgnoreCase(tableName + "_ID")) {
				column.setIskey(true);
				column.setAdReferenceId(DisplayType.ID);
				column.setIsupdateable(false);
			} else if (columnName.toUpperCase().endsWith("_ACCT") && size == 10)
				column.setAdReferenceId(DisplayType.Account);
			else if (columnName.equalsIgnoreCase("C_Location_ID"))
				column.setAdReferenceId(DisplayType.Location);
			else if (columnName.equalsIgnoreCase("M_AttributeSetInstance_ID"))
				column.setAdReferenceId(DisplayType.PAttribute);
			else if (columnName.equalsIgnoreCase("SalesRep_ID")) {
				column.setAdReferenceId(DisplayType.Table);
				column.setAdReferenceValueId(190);
			} else if (columnName.toUpperCase().endsWith("_ID"))
				column.setAdReferenceId(DisplayType.TableDir);
			else if (dataType == Types.DATE || dataType == Types.TIME || dataType == Types.TIMESTAMP
					|| columnName.equalsIgnoreCase("Created") || columnName.equalsIgnoreCase("Updated"))
				column.setAdReferenceId(DisplayType.DateTime);
			else if (columnName.equalsIgnoreCase("CreatedBy") || columnName.equalsIgnoreCase("UpdatedBy")) {
				column.setAdReferenceId(DisplayType.Table);
				column.setAdReferenceValueId(110);
				column.setIsupdateable(false);
			} else if (columnName.equalsIgnoreCase("EntityType")) {
				column.setAdReferenceId(DisplayType.Table);
				column.setAdReferenceValueId(389);
			} else if (dataType == Types.CLOB)
				column.setAdReferenceId(DisplayType.TextLong);
			else if (dataType == Types.BLOB)
				column.setAdReferenceId(DisplayType.Binary);
			else if (columnName.toUpperCase().indexOf("AMT") != -1)
				column.setAdReferenceId(DisplayType.Amount);
			else if (columnName.toUpperCase().indexOf("QTY") != -1)
				column.setAdReferenceId(DisplayType.Quantity);
			else if (size == 1 && (columnName.toUpperCase().startsWith("IS") || dataType == Types.CHAR))
				column.setAdReferenceId(DisplayType.YesNo);
			else if (size < 4 && dataType == Types.CHAR)
				column.setAdReferenceId(DisplayType.List);
			else if (columnName.equalsIgnoreCase("Name") || columnName.equals("DocumentNo")) {
				column.setAdReferenceId(DisplayType.String);
				column.setIsidentifier(true);
				column.setSeqno(1);
			} else if (dataType == Types.CHAR || dataType == Types.VARCHAR || typeName.startsWith("NVAR") || typeName.startsWith("NCHAR")) {
				if (typeName.startsWith("N"))
					size /= 2;
				if (size > 255)
					column.setAdReferenceId(DisplayType.Text);
				else
					column.setAdReferenceId(DisplayType.String);
			} else if (dataType == Types.INTEGER || dataType == Types.SMALLINT || dataType == Types.DECIMAL || dataType == Types.NUMERIC) {
				if (size == 10)
					column.setAdReferenceId(DisplayType.Integer);
				else
					column.setAdReferenceId(DisplayType.Number);
			} else
				column.setAdReferenceId(DisplayType.String);
			column.setFieldlength(size);
			if (/*
				 * column.getIsupdateable() &&
				 */(/*
					 * table.getIsview() ||
					 */
			columnName.equalsIgnoreCase("AD_Client_ID") || columnName.equalsIgnoreCase("AD_Org_ID")
					|| columnName.toUpperCase().startsWith("CREATED") || columnName.toUpperCase().equals("UPDATED"))) {
				column.setIsupdateable(false);
			}
			// Done
			if (POUtil.save(context.getEntityManager(), column)) {
				count++;
			}
		} // while columns

	} // addTableColumn

	private AdElement createElement(AdColumn column) {
		AdElement element = new AdElement();
		return element;
	}

	private AdColumn createColumn(AdTable table) {
		AdColumn column = new AdColumn();
		column.setAdClientId(table.getAdClientId());
		column.setAdOrgId(table.getAdOrgId());
		column.setAdTableId(table.getAdTableId());
		column.setEntitytype(table.getEntitytype());

		column.setIsalwaysupdateable(false); // N
		column.setIsencrypted(false);
		column.setIsidentifier(false);
		column.setIskey(false);
		column.setIsmandatory(false);
		column.setIsparent(false);
		column.setIsselectioncolumn(false);
		column.setIstranslated(false);
		column.setIsupdateable(true); // Y
		column.setVersion(Env.ZERO);
		return column;
	}

	private AdColumn getColumn(List<AdColumn> columnList, String columnName) {
		for (AdColumn column : columnList) {
			if (columnName.equalsIgnoreCase(column.getColumnname())) {
				return column;
			}
		}
		return null;
	}

}
