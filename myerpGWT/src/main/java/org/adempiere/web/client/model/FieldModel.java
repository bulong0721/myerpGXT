package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public class FieldModel implements GwtSerializable, FormField {

    private Integer ADProcessID;
    private Integer ADReferenceID;
    private Integer ADReferenceValueID;
    private String  callout;
    private String  columnName;
    private String  defaultValue;
    private String  fieldGroup;
    private String  fieldGroupType;
    private Integer fieldLength;
    private Boolean displayed;
    private Boolean encryptedColumn;
    private Boolean encryptedField;
    private Boolean fieldOnly;
    private Boolean key;
    private Boolean mandatory;
    private Boolean parent;
    private Boolean readonly;
    private Boolean updatable;
    private Boolean sameline;
    private Boolean selectionColumn;
    private Boolean alwaysUpdateable;
    private Boolean identifier;
    private String  name;
    private String  readonlyLogic;
    private Integer seqNo;
    private Integer sortNo;
    private String  tableName;
    private String  validationCode;
    private String  valueMax;
    private String  valueMin;
    private String  vFormat;
    private Integer ADFieldID;
    private Integer displayLength = 0;

    public Boolean isAlwaysUpdateable() {
        return alwaysUpdateable;
    }

    public void setAlwaysUpdateable(Boolean alwaysUpdateable) {
        this.alwaysUpdateable = alwaysUpdateable;
    }

    public Boolean isIdentifier() {
        return identifier;
    }

    public void setIdentifier(Boolean identifier) {
        this.identifier = identifier;
    }

    public Boolean isUpdatable() {
        return updatable;
    }

    public void setUpdatable(Boolean updatable) {
        this.updatable = updatable;
    }

    public Integer getADProcessID() {
        return ADProcessID;
    }

    public void setADProcessID(Integer aDProcessID) {
        ADProcessID = aDProcessID;
    }

    public Integer getADReferenceID() {
        return ADReferenceID;
    }

    public void setADReferenceID(Integer aDReferenceID) {
        ADReferenceID = aDReferenceID;
    }

    public Integer getADReferenceValueID() {
        return ADReferenceValueID;
    }

    public void setADReferenceValueID(Integer aDReferenceValueID) {
        ADReferenceValueID = aDReferenceValueID;
    }

    public String getCallout() {
        return callout;
    }

    public void setCallout(String callout) {
        this.callout = callout;
    }

    public String getPropertyName() {
        return columnName;
    }

    public void setPropertyName(String columnName) {
        this.columnName = columnName;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(String fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getFieldGroupType() {
        return fieldGroupType;
    }

    public void setFieldGroupType(String fieldGroupType) {
        this.fieldGroupType = fieldGroupType;
    }

    public Integer getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
    }

    public Boolean isDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean isEncryptedColumn() {
        return encryptedColumn;
    }

    public void setEncryptedColumn(Boolean encryptedColumn) {
        this.encryptedColumn = encryptedColumn;
    }

    public Boolean isEncryptedField() {
        return encryptedField;
    }

    public void setEncryptedField(Boolean encryptedField) {
        this.encryptedField = encryptedField;
    }

    public Boolean isFieldOnly() {
        return fieldOnly;
    }

    public void setFieldOnly(Boolean fieldOnly) {
        this.fieldOnly = fieldOnly;
    }

    public Boolean isKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public Boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean isParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public Boolean isReadOnly() {
        return readonly;
    }

    public void setReadOnly(Boolean readonly) {
        this.readonly = readonly;
    }

    public Boolean isSameline() {
        return sameline;
    }

    public void setSameline(Boolean sameline) {
        this.sameline = sameline;
    }

    public Boolean isSelectionColumn() {
        return selectionColumn;
    }

    public void setSelectionColumn(Boolean selectionColumn) {
        this.selectionColumn = selectionColumn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReadonlyLogic() {
        return readonlyLogic;
    }

    public void setReadonlyLogic(String readonlyLogic) {
        this.readonlyLogic = readonlyLogic;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    public String getValueMax() {
        return valueMax;
    }

    public void setValueMax(String valueMax) {
        this.valueMax = valueMax;
    }

    public String getValueMin() {
        return valueMin;
    }

    public void setValueMin(String valueMin) {
        this.valueMin = valueMin;
    }

    public String getVFormat() {
        return vFormat;
    }

    public void setVFormat(String vFormat) {
        this.vFormat = vFormat;
    }

    public Integer getADFieldID() {
        return ADFieldID;
    }

    public DisplayType getFieldType() {
        return DisplayType.fromInteger(ADReferenceID);
    }

    public void setADFieldID(Integer aDFieldID) {
        ADFieldID = aDFieldID;
    }

    public Integer getDisplayLength() {
        return displayLength;
    }

    public void setDisplayLength(Integer displayLength) {
        this.displayLength = displayLength;
    }

}
