package org.adempiere.web.client.model;

import java.util.List;

import org.adempiere.web.client.util.StringUtil;

public class TabModel implements ExchangeModel {
	private List<FieldModel>	fieldList;
	private Integer				aDTabID;
	private Integer				aDColumnID;
	private Integer				aDTableID;
	private Integer				parentColumnID;
	private Integer				seqNo;
	private Integer				tabLevel;
	private Boolean				infoTab;
	private Boolean				insertRecord;
	private Boolean				readOnly;
	private Boolean				singleRow;
	private Boolean				sortTab;
	private Boolean				hasTree;
	private Boolean				highVolume;
	private String				name;
	private String				readOnlyLogic;
	private String				tableName;

	public List<FieldModel> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<FieldModel> fieldList) {
		this.fieldList = fieldList;
	}

	public Boolean isHasTree() {
		return hasTree;
	}

	public void setHasTree(Boolean hasTree) {
		this.hasTree = hasTree;
	}

	public Boolean isSortTab() {
		return sortTab;
	}

	public void setSortTab(Boolean isSortTab) {
		this.sortTab = isSortTab;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tablename) {
		this.tableName = tablename;
	}

	public Integer getADTabID() {
		return aDTabID;
	}

	public void setADTabID(Integer adTabId) {
		this.aDTabID = adTabId;
	}

	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer adColumnId) {
		this.aDColumnID = adColumnId;
	}

	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer adTableId) {
		this.aDTableID = adTableId;
	}

	public Integer getParentColumnID() {
		return parentColumnID;
	}

	public void setParentColumnID(Integer parentColumnId) {
		this.parentColumnID = parentColumnId;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqno) {
		this.seqNo = seqno;
	}

	public Integer getTabLevel() {
		return tabLevel;
	}

	public void setTabLevel(Integer tablevel) {
		this.tabLevel = tablevel;
	}

	public Boolean IsInfoTab() {
		return infoTab;
	}

	public void setInfoTab(Boolean isinfotab) {
		this.infoTab = isinfotab;
	}

	public Boolean IsInsertRecord() {
		return insertRecord;
	}

	public void setInsertRecord(Boolean isinsertrecord) {
		this.insertRecord = isinsertrecord;
	}

	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean isreadonly) {
		this.readOnly = isreadonly;
	}

	public Boolean isSingleRow() {
		return singleRow;
	}

	public void setSingleRow(Boolean issinglerow) {
		this.singleRow = issinglerow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	public void setReadOnlyLogic(String readonlylogic) {
		this.readOnlyLogic = readonlylogic;
	}

	public Boolean isHighVolume() {
		return highVolume;
	}

	public void setHighVolume(Boolean isHighVolume) {
		this.highVolume = isHighVolume;
	}

	public FieldModel getFieldByName(String value) {
		if (StringUtil.isNullOrEmpty(value)) {
			return null;
		}
		for (FieldModel fieldModel : fieldList) {
			if (value.equalsIgnoreCase(fieldModel.getName())) {
				return fieldModel;
			}
		}
		return null;
	}

}
