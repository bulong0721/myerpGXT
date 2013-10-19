package com.deppon.foss.client.event;

public interface WindowToolListener {
	/**
	 * Ignore user changes
	 */
	public void onIgnore();

	/**
	 * Create new record
	 */
	public void onNew();

	/**
	 * Navigate to first record
	 */
	public void onFirst();

	/**
	 * Navigate to last record
	 */
	public void onLast();

	/**
	 * Navigate to next record
	 */
	public void onNext();

	/**
	 * Navigate to previous record
	 */
	public void onPrevious();

	/**
	 * Navigate to parent record, i.e previous tab
	 */
	public void onParentRecord();

	/**
	 * Navigate to detail record, i.e next tab
	 */
	public void onDetailRecord();

	/**
	 * Refresh current record
	 */
	public void onRefresh();

	/**
	 * Print document
	 */
	public void onPrint();

	/**
	 * View available report for current tab
	 */
	public void onReport();

	/**
	 * Toggle record presentation between free form and tabular
	 */
	public void onToggle();

	/**
	 * Open the help window
	 */
	public void onHelp();

	/**
	 * Delete current record
	 */
	public void onDelete();

	/**
	 * Delete current record
	 */
	public void onDeleteSelection();

	/**
	 * Copy current record
	 */
	public void onCopy();

	/**
	 * Save current record
	 */
	public void onSave();

	/**
	 * Open the find/search dialog
	 */
	public void onFind();

	/**
	 * Open the attachment dialog
	 */
	public void onAttachment();

	/**
	 * Open the history dialog
	 */
	public void onHistoryRecords();

	/**
	 * Show active workflow for current record
	 */
	public void onActiveWorkflows();

	/**
	 * Open the request menu where user can view available request or create a
	 * new request
	 */
	public void onRequests();
}
