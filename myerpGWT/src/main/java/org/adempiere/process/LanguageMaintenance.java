package org.adempiere.process;

import org.adempiere.model.ADLanguage;

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

	@Override
	protected void preProcess(ProcessContext ctx) {
		// TODO Auto-generated method stub

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

	static int maintain(ADLanguage language, boolean add) {
		return 0;
	}

}
