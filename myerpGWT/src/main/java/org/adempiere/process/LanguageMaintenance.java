package org.adempiere.process;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.ADColumn;
import org.adempiere.model.ADLanguage;
import org.adempiere.model.ADTable;
import org.adempiere.util.POUtil;

import com.google.common.collect.Lists;

public class LanguageMaintenance extends ServerProcess {
	/** Maintenance Mode */
	private String			maintenanceMode				= null;
	/** Add */
	public static String	MAINTENANCEMODE_Add			= "A";
	/** Delete */
	public static String	MAINTENANCEMODE_Delete		= "D";
	/** Re-Create */
	public static String	MAINTENANCEMODE_ReCreate	= "R";
	/** The Language */
	private ADLanguage		language					= null;
	private List<ADTable>	targetTables				= null;

	@Override
	protected void preProcess(ProcessContext ctx) {
		targetTables = prepareTargetTable();
		maintenanceMode = MAINTENANCEMODE_Add;
		language = new ADLanguage(187);
		language.setBaseLanguage(false);
		language.setSystemLanguage(true);
	}

	ArrayList<ADTable> prepareTargetTable() {
		ArrayList<ADTable> ADTables = Lists.newArrayList();
		ADTables.add(new ADTable(101, "AD_Column"));
		ADTables.add(new ADTable(276, "AD_Element"));
		ADTables.add(new ADTable(107, "AD_Field"));
		ADTables.add(new ADTable(414, "AD_FieldGroup"));
		ADTables.add(new ADTable(376, "AD_Form"));
		ADTables.add(new ADTable(116, "AD_Menu"));
		ADTables.add(new ADTable(109, "AD_Message"));
		ADTables.add(new ADTable(284, "AD_Process"));
		ADTables.add(new ADTable(285, "AD_Process_Para"));
		ADTables.add(new ADTable(104, "AD_Ref_List"));
		ADTables.add(new ADTable(106, "AD_Tab"));
		ADTables.add(new ADTable(100, "AD_Table"));
		ADTables.add(new ADTable(118, "AD_Task"));
		ADTables.add(new ADTable(105, "AD_Window"));
		ADTables.add(new ADTable(117, "AD_Workflow"));
		return ADTables;
	}

	@Override
	protected String doIt() throws Exception {
		if (language.isBaseLanguage())
			throw new Exception("Base Language has no Translations");
		int deleteNo = 0;
		int insertNo = 0;
		// Delete
		if (MAINTENANCEMODE_Delete.equals(maintenanceMode) || MAINTENANCEMODE_ReCreate.equals(maintenanceMode)) {
			deleteNo = maintain(language, false);
		}
		// Add
		if (MAINTENANCEMODE_Add.equals(maintenanceMode) || MAINTENANCEMODE_ReCreate.equals(maintenanceMode)) {
			if (language.isActive() && language.isSystemLanguage()) {
				insertNo = maintain(language, true);
			} else
				throw new Exception("Language not active System Language");
		}
		// Delete
		if (MAINTENANCEMODE_Delete.equals(maintenanceMode)) {
			if (language.isSystemLanguage()) {
				language.setSystemLanguage(false);
			}
		}
		return "@Deleted@=" + deleteNo + " - @Inserted@=" + insertNo;
	}

	int maintain(ADLanguage language, boolean add) {
		for (ADTable adTable : targetTables) {
			if (add) {
				addByLanguage(adTable, language);
			} else {
				delByLanguage(adTable, language);
			}
		}
		return 0;
	}

	private void delByLanguage(ADTable adTable, ADLanguage language) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("DELETE FROM ").append(adTable.getTableName().replace("_", "") + "Trl");
		buffer.append(" trl WHERE trl.aDLanguageID = ");
		buffer.append(language.getADLanguageID());
		POUtil.executeQuery(context, buffer.toString(), null);
	}

	private void addByLanguage(ADTable table, ADLanguage language) {
		List<ADColumn> columnList = POUtil.queryColumnsByTable(context, table.getADTableID());
		StringBuffer insertBuffer = new StringBuffer();
		String srcTable = table.getTableName();
		String desTable = srcTable + "_Trl";
		String keyColumn = srcTable + "_ID";
		if ("AD_Menu".equalsIgnoreCase(srcTable)) {
			keyColumn = "Node_ID";
		}
		insertBuffer.append("INSERT INTO ").append(desTable).append(" (");
		StringBuffer selectBuffer = new StringBuffer();
		selectBuffer.append("SELECT ");
		for (ADColumn adColumn : columnList) {
			if (adColumn.isTranslated()) {
				insertBuffer.append(adColumn.getColumnName()).append(",");
				selectBuffer.append(adColumn.getColumnName()).append(",");
			}
		}
		insertBuffer.append(keyColumn).append(",AD_Language_ID,IsTranslated,AD_Client_ID,AD_Org_ID,Createdby,Created,UpdatedBy) ");
		selectBuffer.append(keyColumn).append(",").append(language.getADLanguageID()).append(",false");
		selectBuffer.append(",AD_Client_ID,AD_Org_ID,Createdby,Created,UpdatedBy");
		selectBuffer.append(" FROM ").append(srcTable).append(" WHERE NOT EXISTS (SELECT ");
		selectBuffer.append(keyColumn).append(" FROM ").append(desTable);
		selectBuffer.append(" WHERE AD_Language_ID=").append(language.getADLanguageID());
		selectBuffer.append(" AND ").append(keyColumn).append("=").append(srcTable).append(".").append(keyColumn).append(")");

		insertBuffer.append(selectBuffer).append(";");
		// System.out.println(insertBuffer.toString());
		POUtil.executeNativeQuery(context, insertBuffer.toString(), null);
	}
}
