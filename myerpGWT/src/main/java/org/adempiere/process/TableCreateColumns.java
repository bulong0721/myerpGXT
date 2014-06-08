package org.adempiere.process;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.List;

import org.adempiere.common.DisplayType;
import org.adempiere.model.ADColumn;
import org.adempiere.model.ADElement;
import org.adempiere.model.ADTable;
import org.adempiere.util.EnvUtil;
import org.adempiere.util.POUtil;

public class TableCreateColumns extends ServerProcess {
	private boolean	putAllTables	= false;
	private int		count;
	private int		tableId;

	@Override
	protected void preProcess(ProcessContext ctx) {
		tableId = (Integer) ctx.getRowMap().get("aDTableID");
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
				ADTable table = POUtil.find(context, ADTable.class, tableId);
				String tableName = table.getTableName();
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
			ADTable table = POUtil.findByTableName(context, tableName);
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
				table = new ADTable();
				// table.setEntityType(p_EntityType);
				table.setName(tableName);
				table.setTableName(tableName);
				table.setView(false);
				if (!POUtil.persist(context, table)) {
					continue;
				}
			}
			ResultSet rsC = dmd.getColumns(catalog, schema, tableName, null);
			addTableColumn(rsC, table);
		}
	} // addTable

	private void addTableColumn(ResultSet rs, ADTable table) throws Exception {
		String tableName = table.getTableName();
		List<ADColumn> columnList = POUtil.queryColumnsByTable(context, table.getADTableID());
		while (rs.next()) {
			String tn = rs.getString("TABLE_NAME");
			if (!tableName.equalsIgnoreCase(tn))
				continue;
			String columnName = rs.getString("COLUMN_NAME");
			ADColumn column = getColumn(columnList, columnName);
			if (column != null)
				continue;
			int dataType = rs.getInt("DATA_TYPE");
			String typeName = rs.getString("TYPE_NAME");
			int size = rs.getInt("COLUMN_SIZE");
			//
			column = createColumn(table, columnName);
			column.setEntityType("D");
			//
			ADElement element = POUtil.findElementByColumn(context, columnName);
			if (element == null) {
				element = createElement(column);

				if (columnName.equalsIgnoreCase(table.getTableName() + "_ID")) {
					element.setColumnName(table.getTableName() + "_ID");
					element.setName(table.getName());
					element.setPrintName(table.getName());
				}
				// TODO
				POUtil.persist(context, element);
			}
			column.setColumnName(element.getColumnName());
			column.setPropertyName(element.getColumnName());
			column.setName(element.getName());
			column.setDescription(element.getDescription());
			column.setHelp(element.getHelp());
			column.setADElementID(element.getADElementID());
			column.setMandatory(false);
			if (columnName.equalsIgnoreCase(tableName + "_ID")) {
				column.setKey(true);
				column.setADReferenceID(DisplayType.ID);
				column.setAlwaysUpdateable(false);
			} else if (columnName.toUpperCase().endsWith("_ACCT") && size == 10)
				column.setADReferenceID(DisplayType.Account);
			else if (columnName.equalsIgnoreCase("C_Location_ID"))
				column.setADReferenceID(DisplayType.Location);
			else if (columnName.equalsIgnoreCase("M_AttributeSetInstance_ID"))
				column.setADReferenceID(DisplayType.PAttribute);
			else if (columnName.equalsIgnoreCase("SalesRep_ID")) {
				column.setADReferenceID(DisplayType.Table);
				column.setADReferenceValueID(190);
			} else if (columnName.toUpperCase().endsWith("_ID"))
				column.setADReferenceID(DisplayType.TableDir);
			else if (dataType == Types.DATE || dataType == Types.TIME || dataType == Types.TIMESTAMP
					|| columnName.equalsIgnoreCase("Created") || columnName.equalsIgnoreCase("Updated"))
				column.setADReferenceID(DisplayType.DateTime);
			else if (columnName.equalsIgnoreCase("CreatedBy") || columnName.equalsIgnoreCase("UpdatedBy")) {
				column.setADReferenceID(DisplayType.Table);
				column.setADReferenceValueID(110);
				column.setAlwaysUpdateable(false);
			} else if (columnName.equalsIgnoreCase("EntityType")) {
				column.setADReferenceID(DisplayType.Table);
				column.setADReferenceValueID(389);
			} else if (dataType == Types.CLOB)
				column.setADReferenceID(DisplayType.TextLong);
			else if (dataType == Types.BLOB)
				column.setADReferenceID(DisplayType.Binary);
			else if (columnName.toUpperCase().indexOf("AMT") != -1)
				column.setADReferenceID(DisplayType.Amount);
			else if (columnName.toUpperCase().indexOf("QTY") != -1)
				column.setADReferenceID(DisplayType.Quantity);
			else if (size == 1 && (columnName.toUpperCase().startsWith("IS") || dataType == Types.CHAR))
				column.setADReferenceID(DisplayType.YesNo);
			else if (size < 4 && dataType == Types.CHAR)
				column.setADReferenceID(DisplayType.List);
			else if (columnName.equalsIgnoreCase("Name") || columnName.equals("DocumentNo")) {
				column.setADReferenceID(DisplayType.String);
				column.setIdentifier(true);
				column.setSeqNo(1);
			} else if (dataType == Types.CHAR || dataType == Types.VARCHAR || typeName.startsWith("NVAR") || typeName.startsWith("NCHAR")) {
				if (typeName.startsWith("N"))
					size /= 2;
				if (size > 255)
					column.setADReferenceID(DisplayType.Text);
				else
					column.setADReferenceID(DisplayType.String);
			} else if (dataType == Types.INTEGER || dataType == Types.SMALLINT || dataType == Types.DECIMAL || dataType == Types.NUMERIC) {
				if (size == 10)
					column.setADReferenceID(DisplayType.Integer);
				else
					column.setADReferenceID(DisplayType.Number);
			} else
				column.setADReferenceID(DisplayType.String);
			column.setFieldLength(size);
			if ((columnName.equalsIgnoreCase("AD_Client_ID") || columnName.equalsIgnoreCase("AD_Org_ID")
					|| columnName.toUpperCase().startsWith("CREATED") || columnName.toUpperCase().equals("UPDATED"))) {
				column.setAlwaysUpdateable(false);
			}
			// Done
			if (POUtil.persist(context, column)) {
				count++;
			}
		} // while columns

	} // addTableColumn

	private ADElement createElement(ADColumn column) {
		ADElement element = new ADElement();
		element.setName(column.getName());
		element.setPrintName(column.getName());
		element.setColumnName(column.getColumnName());
		element.setADClientID(column.getADClientID());
		element.setADOrgID(column.getADOrgID());
		element.setEntityType("D");
		return element;
	}

	private ADColumn createColumn(ADTable table, String columnName) {
		ADColumn column = new ADColumn();
		column.setADClientID(table.getADClientID());
		column.setADOrgID(table.getADOrgID());
		column.setADTableID(table.getADTableID());
		column.setEntityType(table.getEntityType());
		column.setColumnName(columnName);
		column.setName(columnName);

		column.setUpdateable(true);
		column.setAlwaysUpdateable(false); // N
		column.setAutocomplete(false);
		column.setEncrypted(false);
		column.setIdentifier(false);
		column.setKey(false);
		column.setMandatory(false);
		column.setParent(false);
		column.setSelectionColumn(false);
		column.setTranslated(false);
		column.setAlwaysUpdateable(true); // Y
		column.setVersion(EnvUtil.ZERO);
		return column;
	}

	private ADColumn getColumn(List<ADColumn> columnList, String columnName) {
		for (ADColumn column : columnList) {
			if (columnName.equalsIgnoreCase(column.getColumnName())) {
				return column;
			}
		}
		return null;
	}

}
