package org.adempiere.web.client.model;

import org.adempiere.common.DisplayType;

public interface ADFormField extends IsADRPCModel {

	Integer getAdReferenceId();

	Integer getAdReferenceValueId();

	String getColumnname();

	String getDefaultvalue();

	String getFieldgroup();

	Boolean getIsdisplayed();

	String getName();

	String getReadonlylogic();

	Integer getSeqno();

	String getValuemax();

	String getValuemin();

	String getVformat();

	DisplayType getFieldType();

	Boolean getIsencryptedfield();

	Boolean getIskey();

	Boolean getIssameline();

}