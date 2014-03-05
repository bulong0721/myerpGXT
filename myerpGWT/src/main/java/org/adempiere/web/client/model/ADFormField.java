package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public interface ADFormField extends IsADRPCModel {

	Integer getADReferenceID();

	Integer getADReferenceValueID();

	String getPropertyName();

	String getDefaultValue();

	String getFieldGroup();

	Boolean isDisplayed();

	String getName();

	String getReadonlyLogic();

	Integer getSeqNo();

	String getValueMax();

	String getValueMin();

	String getVFormat();

	DisplayType getFieldType();

	Boolean isEncryptedField();

	Boolean isKey();

	Boolean isSameline();

}