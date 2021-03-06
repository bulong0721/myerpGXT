package org.adempiere.model;

import java.io.Serializable;

import javax.persistence.*;

import org.adempiere.common.ADEntityBase;

/**
 * The persistent class for the ad_tab_v database table.
 * 
 */
@Entity
@Table(name = "ad_tab_v")
public class AdTabV extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer aDColumnID;
	private Integer aDColumnSortOrderID;
	private Integer aDColumnSortYesNoID;
	private Integer aDImageID;
	private Integer aDProcessID;
	private Integer aDTabID;
	private Integer aDTableID;
	private Integer aDWindowID;
	private String accessLevel;
	private Boolean advancedTab;
	private String commitWarning;
	private Boolean deleteable;
	private String description;
	private String displayLogic;
	private Boolean hasTree;
	private Integer hasassociation;
	private String help;
	private Boolean highVolume;
	private Integer includedTabID;
	private Boolean infoTab;
	private Boolean insertRecord;
	private String name;
	private String orderByClause;
	private Integer parentColumnID;
	private Boolean readOnly;
	private String readOnlyLogic;
	private String replicationType;
	private Boolean securityEnabled;
	private Integer seqNo;
	private Boolean singleRow;
	private Boolean sortTab;
	private Integer tabLevel;
	private String tableName;
	private Boolean translationTab;
	private Boolean view;
	private String whereClause;

	@Basic
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	@Basic
	@Column(name="AD_COLUMNSORTORDER_ID", columnDefinition="INT")
	public Integer getADColumnSortOrderID() {
		return aDColumnSortOrderID;
	}

	public void setADColumnSortOrderID(Integer aDColumnSortOrderID) {
		this.aDColumnSortOrderID = aDColumnSortOrderID;
	}

	@Basic
	@Column(name="AD_COLUMNSORTYESNO_ID", columnDefinition="INT")
	public Integer getADColumnSortYesNoID() {
		return aDColumnSortYesNoID;
	}

	public void setADColumnSortYesNoID(Integer aDColumnSortYesNoID) {
		this.aDColumnSortYesNoID = aDColumnSortYesNoID;
	}

	@Basic
	@Column(name="AD_IMAGE_ID", columnDefinition="INT")
	public Integer getADImageID() {
		return aDImageID;
	}

	public void setADImageID(Integer aDImageID) {
		this.aDImageID = aDImageID;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer aDProcessID) {
		this.aDProcessID = aDProcessID;
	}

	@Id
	@Column(name="AD_TAB_ID", columnDefinition="INT")
	public Integer getADTabID() {
		return aDTabID;
	}

	public void setADTabID(Integer aDTabID) {
		this.aDTabID = aDTabID;
	}

	@Basic
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
	}

	@Basic
	@Column(name="AD_WINDOW_ID", columnDefinition="INT", nullable=false)
	public Integer getADWindowID() {
		return aDWindowID;
	}

	public void setADWindowID(Integer aDWindowID) {
		this.aDWindowID = aDWindowID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	@Basic
	@Column(name="ISADVANCEDTAB", nullable=false)
	public Boolean isAdvancedTab() {
		return advancedTab;
	}

	public void setAdvancedTab(Boolean advancedTab) {
		this.advancedTab = advancedTab;
	}

	@Basic
	@Column(length=2000)
	public String getCommitWarning() {
		return commitWarning;
	}

	public void setCommitWarning(String commitWarning) {
		this.commitWarning = commitWarning;
	}

	@Basic
	@Column(name="ISDELETEABLE", nullable=false)
	public Boolean isDeleteable() {
		return deleteable;
	}

	public void setDeleteable(Boolean deleteable) {
		this.deleteable = deleteable;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2000)
	public String getDisplayLogic() {
		return displayLogic;
	}

	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isHasTree() {
		return hasTree;
	}

	public void setHasTree(Boolean hasTree) {
		this.hasTree = hasTree;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getHasassociation() {
		return hasassociation;
	}

	public void setHasassociation(Integer hasassociation) {
		this.hasassociation = hasassociation;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="ISHIGHVOLUME", nullable=false)
	public Boolean isHighVolume() {
		return highVolume;
	}

	public void setHighVolume(Boolean highVolume) {
		this.highVolume = highVolume;
	}

	@Basic
	@Column(name="INCLUDED_TAB_ID", columnDefinition="INT")
	public Integer getIncludedTabID() {
		return includedTabID;
	}

	public void setIncludedTabID(Integer includedTabID) {
		this.includedTabID = includedTabID;
	}

	@Basic
	@Column(name="ISINFOTAB")
	public Boolean isInfoTab() {
		return infoTab;
	}

	public void setInfoTab(Boolean infoTab) {
		this.infoTab = infoTab;
	}

	@Basic
	@Column(name="ISINSERTRECORD", nullable=false)
	public Boolean isInsertRecord() {
		return insertRecord;
	}

	public void setInsertRecord(Boolean insertRecord) {
		this.insertRecord = insertRecord;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=2000)
	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	@Basic
	@Column(name="PARENT_COLUMN_ID", columnDefinition="INT")
	public Integer getParentColumnID() {
		return parentColumnID;
	}

	public void setParentColumnID(Integer parentColumnID) {
		this.parentColumnID = parentColumnID;
	}

	@Basic
	@Column(name="ISREADONLY", nullable=false)
	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	@Basic
	@Column(length=2000)
	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	public void setReadOnlyLogic(String readOnlyLogic) {
		this.readOnlyLogic = readOnlyLogic;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getReplicationType() {
		return replicationType;
	}

	public void setReplicationType(String replicationType) {
		this.replicationType = replicationType;
	}

	@Basic
	@Column(name="ISSECURITYENABLED", nullable=false)
	public Boolean isSecurityEnabled() {
		return securityEnabled;
	}

	public void setSecurityEnabled(Boolean securityEnabled) {
		this.securityEnabled = securityEnabled;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(name="ISSINGLEROW", nullable=false)
	public Boolean isSingleRow() {
		return singleRow;
	}

	public void setSingleRow(Boolean singleRow) {
		this.singleRow = singleRow;
	}

	@Basic
	@Column(name="ISSORTTAB", nullable=false)
	public Boolean isSortTab() {
		return sortTab;
	}

	public void setSortTab(Boolean sortTab) {
		this.sortTab = sortTab;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getTabLevel() {
		return tabLevel;
	}

	public void setTabLevel(Integer tabLevel) {
		this.tabLevel = tabLevel;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Basic
	@Column(name="ISTRANSLATIONTAB", nullable=false)
	public Boolean isTranslationTab() {
		return translationTab;
	}

	public void setTranslationTab(Boolean translationTab) {
		this.translationTab = translationTab;
	}

	@Basic
	@Column(name="ISVIEW", nullable=false)
	public Boolean isView() {
		return view;
	}

	public void setView(Boolean view) {
		this.view = view;
	}

	@Basic
	@Column(length=2000)
	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

}