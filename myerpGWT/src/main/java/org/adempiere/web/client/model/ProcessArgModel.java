package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public class ProcessArgModel implements ExchangeModel, FormField {
	private Integer	ADProcessParaID;
	private Integer	ADReferenceID;
	private Integer	ADReferenceValueID;
	private Integer	ADValRuleID;
	private String	defaultValue;
	private String	displayLogic;
	private Integer	fieldLength;
	private Boolean	active;
	private Boolean	centrallyMaintained;
	private Boolean	mandatory;
	private String	name;
	private String	readonlyLogic;
	private Integer	seqNo;
	private String	valueMax;
	private String	valueMin;
	private String	VFormat;
	private String	propertyName;

	public Integer getADProcessParaID() {
		return ADProcessParaID;
	}

	public void setADProcessParaID(Integer aDProcessParaID) {
		ADProcessParaID = aDProcessParaID;
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

	public Integer getADValRuleID() {
		return ADValRuleID;
	}

	public void setADValRuleID(Integer aDValRuleID) {
		ADValRuleID = aDValRuleID;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDisplayLogic() {
		return displayLogic;
	}

	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isCentrallyMaintained() {
		return centrallyMaintained;
	}

	public void setCentrallyMaintained(Boolean centrallyMaintained) {
		this.centrallyMaintained = centrallyMaintained;
	}

	public Boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
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
		return VFormat;
	}

	public void setVFormat(String vFormat) {
		VFormat = vFormat;
	}

	@Override
	public DisplayType getFieldType() {
		return DisplayType.fromInteger(ADReferenceID);
	}

	@Override
	public String getFieldGroup() {
		return null;
	}

	@Override
	public Boolean isDisplayed() {
		return true;
	}

	@Override
	public Boolean isEncryptedField() {
		return false;
	}

	@Override
	public Boolean isKey() {
		return false;
	}

	@Override
	public Boolean isSameline() {
		return false;
	}

	@Override
	public Boolean isReadOnly() {
		return false;
	}

	@Override
	public Boolean isUpdatable() {
		return true;
	}
	
	

}
