package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public interface FormField extends GwtSerializable {

	Integer getADReferenceID();

	Integer getADReferenceValueID();

	String getPropertyName();

	String getDefaultValue();

	String getFieldGroup();

	Boolean isDisplayed();

	String getName();

	String getReadonlyLogic();

	Integer getSeqNo();
	
	String getValidationCode();

	String getValueMax();

	String getValueMin();

	String getVFormat();

	DisplayType getFieldType();

	Boolean isEncryptedField();

	Boolean isKey();

	Boolean isSameline();
	
	Boolean isReadOnly();
	
	Boolean isUpdatable();
	
	Boolean isMandatory();
	
	Boolean isFieldOnly();
	
	Boolean isIdentifier();

    Integer getDisplayLength();

}