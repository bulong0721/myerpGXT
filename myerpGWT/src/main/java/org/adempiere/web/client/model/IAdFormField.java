package org.adempiere.web.client.model;

import org.adempiere.web.shared.adempiere.DisplayType;

public interface IAdFormField {

	Integer getAdReferenceId();

	Long getAdReferenceValueId();

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

}