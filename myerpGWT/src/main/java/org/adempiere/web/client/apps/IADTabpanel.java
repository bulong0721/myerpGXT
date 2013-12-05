package org.adempiere.web.client.apps;

public interface IADTabpanel {
	/**
	 * @return
	 */
	public String getDisplayLogic();

	/**
	 * @return tab level
	 */
	public int getTabLevel();

	/**
	 * @return tablename
	 */
	public String getTableName();

	/**
	 * @return record ID
	 */
	public int getRecord_ID();

	/**
	 * @return true if refresh is not needed
	 */
	public boolean isCurrent();

	/**
	 * 
	 * @return title
	 */
	public String getTitle();

	/**
	 * Render the panel
	 */
	public void createUI();

	/**
	 * activate/deactivate the panel
	 * 
	 * @param b
	 */
	public void activate(boolean b);

	/**
	 * retrieve data from db
	 */
	public void query();

	/**
	 * Refresh from db
	 */
	public void refresh();

	/**
	 * retrieve data from db
	 * 
	 * @param currentRows
	 * @param currentDays
	 * @param maxRows
	 */
	public void query(boolean currentRows, int currentDays, int maxRows);

	/**
	 * Toggle between grid and form view
	 */
	public void switchRowPresentation();

	/**
	 * Dynamic update of field properties ( visibility, filter and mandatory )
	 * 
	 * @param i
	 */
	public void dynamicDisplay(int i);

	/**
	 * After save event
	 * 
	 * @param onSaveEvent
	 */
	public void afterSave(boolean onSaveEvent);

	/**
	 * Enter key event
	 * 
	 * @return true if the event is process
	 */
	public boolean onEnterKey();

	/**
	 * @return boolean
	 */
	public boolean isGridView();

	/**
	 * @return true if the panel have been activated
	 */
	public boolean isActivated();

	/**
	 * 
	 * @param detailMode
	 */
	public void setDetailPaneMode(boolean detailMode);

	/**
	 * 
	 * @return true if the panel is in detailpane node
	 */
	public boolean isDetailPaneMode();

	/**
	 * 
	 * @param rowChange
	 * @param onlyRealChange
	 * @return true if there are pending changes
	 */
	public boolean needSave(boolean rowChange, boolean onlyRealChange);

	/**
	 * @param onSaveEvent
	 * @return true if the save operation completed successfully
	 */
	public boolean dataSave(boolean onSaveEvent);

	/**
	 * 
	 * @return tab no ( ad_tab.tabno )
	 */
	public int getTabNo();

	/**
	 * reset detail data grid when parent tab current record is new and not
	 * saved yet
	 */
	public void resetDetailForNewParentRecord();
}
