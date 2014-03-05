package org.adempiere.model;

import java.io.Serializable;

import javax.persistence.*;

import org.adempiere.common.ADEntityBase;

/**
 * The persistent class for the ad_field_v database table.
 * 
 */
@Entity
@Table(name = "ad_field_v")
public class AdFieldV extends ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer aDColumnID;
	private Integer aDFieldID;
	private Integer aDProcessID;
	private Integer aDReferenceID;
	private Integer aDReferenceValueID;
	private Integer aDTabID;
	private Integer aDTableID;
	private Integer aDValRuleID;
	private Integer aDWindowID;
	private Boolean alwaysUpdateable;
	private Boolean autocomplete;
	private String callout;
	private Boolean collapsedByDefault;
	private String columnName;
	private String columnSQL;
	private String defaultValue;
	private String description;
	private Integer displayLength;
	private String displayLogic;
	private Boolean displayed;
	private String fieldGroupType;
	private Integer fieldLength;
	private Boolean fieldOnly;
	private String fieldGroup;
	private Boolean heading;
	private String help;
	private Boolean identifier;
	private Integer includedTabID;
	private String infoFactoryClass;
	private Boolean encryptedColumn;
	private Boolean encryptedField;
	private Boolean key;
	private Boolean mandatory;
	private String mandatoryLogic;
	private String name;
	private String obscureType;
	private Boolean parent;
	private String propertyName;
	private Boolean readOnly;
	private String readOnlyLogic;
	private Boolean sameLine;
	private Boolean selectionColumn;
	private Integer seqNo;
	private Integer sortNo;
	private String tableName;
	private Boolean translated;
	private Boolean updateable;
	private String vFormat;
	private String validationCode;
	private String valueMax;
	private String valueMin;

	@Basic
	@Column(name="AD_COLUMN_ID", columnDefinition="INT")
	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	@Id
	@Column(name="AD_FIELD_ID", columnDefinition="INT")
	public Integer getADFieldID() {
		return aDFieldID;
	}

	public void setADFieldID(Integer aDFieldID) {
		this.aDFieldID = aDFieldID;
	}

	@Basic
	@Column(name="AD_PROCESS_ID", columnDefinition="INT")
	public Integer getADProcessID() {
		return aDProcessID;
	}

	public void setADProcessID(Integer aDProcessID) {
		this.aDProcessID = aDProcessID;
	}

	@Basic
	@Column(name="AD_REFERENCE_ID")
	public Integer getADReferenceID() {
		return aDReferenceID;
	}

	public void setADReferenceID(Integer aDReferenceID) {
		this.aDReferenceID = aDReferenceID;
	}

	@Basic
	@Column(name="AD_REFERENCE_VALUE_ID")
	public Integer getADReferenceValueID() {
		return aDReferenceValueID;
	}

	public void setADReferenceValueID(Integer aDReferenceValueID) {
		this.aDReferenceValueID = aDReferenceValueID;
	}

	@Basic
	@Column(name="AD_TAB_ID", columnDefinition="INT", nullable=false)
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
	@Column(name="AD_VAL_RULE_ID")
	public Integer getADValRuleID() {
		return aDValRuleID;
	}

	public void setADValRuleID(Integer aDValRuleID) {
		this.aDValRuleID = aDValRuleID;
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
	@Column(name="ISALWAYSUPDATEABLE")
	public Boolean isAlwaysUpdateable() {
		return alwaysUpdateable;
	}

	public void setAlwaysUpdateable(Boolean alwaysUpdateable) {
		this.alwaysUpdateable = alwaysUpdateable;
	}

	@Basic
	@Column(name="ISAUTOCOMPLETE")
	public Boolean isAutocomplete() {
		return autocomplete;
	}

	public void setAutocomplete(Boolean autocomplete) {
		this.autocomplete = autocomplete;
	}

	@Basic
	public String getCallout() {
		return callout;
	}

	public void setCallout(String callout) {
		this.callout = callout;
	}

	@Basic
	@Column(name="ISCOLLAPSEDBYDEFAULT")
	public Boolean isCollapsedByDefault() {
		return collapsedByDefault;
	}

	public void setCollapsedByDefault(Boolean collapsedByDefault) {
		this.collapsedByDefault = collapsedByDefault;
	}

	@Basic
	@Column(length=30)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Basic
	@Column(length=2000)
	public String getColumnSQL() {
		return columnSQL;
	}

	public void setColumnSQL(String columnSQL) {
		this.columnSQL = columnSQL;
	}

	@Basic
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getDisplayLength() {
		return displayLength;
	}

	public void setDisplayLength(Integer displayLength) {
		this.displayLength = displayLength;
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
	@Column(name="ISDISPLAYED", nullable=false)
	public Boolean isDisplayed() {
		return displayed;
	}

	public void setDisplayed(Boolean displayed) {
		this.displayed = displayed;
	}

	@Basic
	@Column(length=1)
	public String getFieldGroupType() {
		return fieldGroupType;
	}

	public void setFieldGroupType(String fieldGroupType) {
		this.fieldGroupType = fieldGroupType;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	@Basic
	@Column(name="ISFIELDONLY", nullable=false)
	public Boolean isFieldOnly() {
		return fieldOnly;
	}

	public void setFieldOnly(Boolean fieldOnly) {
		this.fieldOnly = fieldOnly;
	}

	@Basic
	@Column(length=60)
	public String getFieldGroup() {
		return fieldGroup;
	}

	public void setFieldGroup(String fieldGroup) {
		this.fieldGroup = fieldGroup;
	}

	@Basic
	@Column(name="ISHEADING", nullable=false)
	public Boolean isHeading() {
		return heading;
	}

	public void setHeading(Boolean heading) {
		this.heading = heading;
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
	@Column(name="ISIDENTIFIER")
	public Boolean isIdentifier() {
		return identifier;
	}

	public void setIdentifier(Boolean identifier) {
		this.identifier = identifier;
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
	public String getInfoFactoryClass() {
		return infoFactoryClass;
	}

	public void setInfoFactoryClass(String infoFactoryClass) {
		this.infoFactoryClass = infoFactoryClass;
	}

	@Basic
	@Column(name="ISENCRYPTEDCOLUMN")
	public Boolean isEncryptedColumn() {
		return encryptedColumn;
	}

	public void setEcryptedColumn(Boolean encryptedColumn) {
		this.encryptedColumn = encryptedColumn;
	}

	@Basic
	@Column(name="ISENCRYPTEDFIELD", nullable=false)
	public Boolean isEncryptedField() {
		return encryptedField;
	}

	public void setEncryptedField(Boolean encryptedField) {
		this.encryptedField = encryptedField;
	}

	@Basic
	@Column(name="ISKEY")
	public Boolean isKey() {
		return key;
	}

	public void setKey(Boolean key) {
		this.key = key;
	}

	@Basic
	@Column(name="ISMANDATORY")
	public Boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	@Basic
	@Column(length=2000)
	public String getMandatoryLogic() {
		return mandatoryLogic;
	}

	public void setMandatoryLogic(String mandatoryLogic) {
		this.mandatoryLogic = mandatoryLogic;
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
	@Column(length=3)
	public String getObscureType() {
		return obscureType;
	}

	public void setObscureType(String obscureType) {
		this.obscureType = obscureType;
	}

	@Basic
	@Column(name="ISPARENT")
	public Boolean isParent() {
		return parent;
	}

	public void setParent(Boolean parent) {
		this.parent = parent;
	}

	@Basic
	@Column(length=30)
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
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
	@Column(name="ISSAMELINE", nullable=false)
	public Boolean isSameLine() {
		return sameLine;
	}

	public void setSameLine(Boolean sameLine) {
		this.sameLine = sameLine;
	}

	@Basic
	@Column(name="ISSELECTIONCOLUMN")
	public Boolean isSelectionColumn() {
		return selectionColumn;
	}

	public void setSelectionColumn(Boolean selectionColumn) {
		this.selectionColumn = selectionColumn;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSortNo() {
		return sortNo;
	}

	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
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
	@Column(name="ISTRANSLATED")
	public Boolean isTranslated() {
		return translated;
	}

	public void setTranslated(Boolean translated) {
		this.translated = translated;
	}

	@Basic
	@Column(name="ISUPDATEABLE")
	public Boolean isUpdateable() {
		return updateable;
	}

	public void setUpdateable(Boolean updateable) {
		this.updateable = updateable;
	}

	@Basic
	@Column(length=60)
	public String getVFormat() {
		return vFormat;
	}

	public void setVFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	@Basic
	@Column(length=2000)
	public String getValidationCode() {
		return validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

	@Basic
	@Column(length=20)
	public String getValueMax() {
		return valueMax;
	}

	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	@Basic
	@Column(length=20)
	public String getValueMin() {
		return valueMin;
	}

	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

}