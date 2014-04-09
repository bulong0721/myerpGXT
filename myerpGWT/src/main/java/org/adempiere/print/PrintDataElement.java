package org.adempiere.print;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.adempiere.common.DisplayType;
import org.adempiere.common.KeyNamePair;
import org.adempiere.common.Language;
import org.adempiere.common.NamePair;
import org.adempiere.print.model.PrintLocation;
import org.adempiere.util.EnvUtil;

public class PrintDataElement {
	public static final String	XML_TAG				= "element";
	public static final String	XML_ATTRIBUTE_NAME	= "name";
	public static final String	XML_ATTRIBUTE_KEY	= "key";
	private String				columnName;
	private Object				value;
	private DisplayType			displayType;
	private boolean				isPKey;
	private boolean				isPageBreak;
	private String				formatPattern;

	/**
	 * Get Name
	 * 
	 * @return name
	 */
	public String getColumnName() {
		return columnName;
	} // getName

	/**
	 * Get Node Value
	 * 
	 * @return value
	 */
	public Object getValue() {
		return value;
	} // getValue

	/**
	 * Get Function Value
	 * 
	 * @return length or numeric value
	 */
	public BigDecimal getFunctionValue() {
		if (value == null)
			return EnvUtil.ZERO;
		// Numbers - return number value
		if (value instanceof BigDecimal)
			return (BigDecimal) value;
		if (value instanceof Number)
			return new BigDecimal(((Number) value).doubleValue());
		// Boolean - return 1 for true 0 for false
		if (value instanceof Boolean) {
			if (((Boolean) value).booleanValue())
				return EnvUtil.ONE;
			else
				return EnvUtil.ZERO;
		}
		// Return Length
		String s = value.toString();
		return new BigDecimal(s.length());
	} // getFunctionValue

	/**
	 * Get Node Value Display
	 * 
	 * @param language optional language - if null numbers/dates are not
	 *            formatted
	 * @return display value optionally formatted
	 */
	public String getValueDisplay(Language language) {
		if (value == null)
			return "";
		String retValue = value.toString();
		if (displayType == DisplayType.Location)
			return getValueDisplay_Location();
		// ID columns should be printed as ID numbers - teo_sarca [ 1673363 ]
		else if (DisplayType.ID == displayType && value instanceof KeyNamePair)
			return ((KeyNamePair) value).getID();
		else if (columnName.equals("C_BPartner_Location_ID") || columnName.equals("Bill_Location_ID"))
			return getValueDisplay_BPLocation();
		else if (displayType.getValue() == 0 || value instanceof String || value instanceof NamePair)
			;
		else if (language != null) // Optional formatting of Numbers and Dates
		{
			// if (m_displayType.isNumeric()) {
			// retValue = DisplayType.getNumberFormat(m_displayType, language,
			// m_formatPattern).format(m_value);
			// } else if (m_displayType.isDate())
			// retValue = DisplayType.getDateFormat(m_displayType, language,
			// m_formatPattern).format(m_value);
			retValue = value.toString();
		}
		return retValue;
	} // getValueDisplay

	/**
	 * Get Node Data Value as String
	 * 
	 * @return data value
	 */
	public String getValueAsString() {
		if (value == null)
			return "";
		String retValue = value.toString();
		if (value instanceof NamePair)
			retValue = ((NamePair) value).getID();
		return retValue;
	} // getValueDisplay

	/**
	 * Return Address String not just name
	 * 
	 * @return Address String
	 */
	private String getValueDisplay_BPLocation() {
		try {
			int C_BPartner_Location_ID = Integer.parseInt(getValueKey());
			if (C_BPartner_Location_ID != 0) {
				PrintLocation loc = PrintUtil.getPrintLocation(C_BPartner_Location_ID);
				if (loc != null)
					return loc.toStringCR();
			}
		} catch (Exception ex) {
		}
		return value.toString();
	} // getValueDisplay_BPLocation

	/**
	 * Return Address String not just City
	 * 
	 * @return Address String
	 */
	private String getValueDisplay_Location() {
		try {
			int C_Location_ID = Integer.parseInt(getValueKey());
			if (C_Location_ID != 0) {
				PrintLocation loc = PrintUtil.getPrintLocation(C_Location_ID);
				if (loc != null)
					return loc.toStringCR();
			}
		} catch (Exception ex) {
		}
		return value.toString();
	} // getValueDisplay_Location

	/**
	 * Get Node Value Key
	 * 
	 * @return key
	 */
	public String getValueKey() {
		if (value == null)
			return "";
		if (value instanceof NamePair)
			return ((NamePair) value).getID();
		return "";
	} // getValueKey

	/**
	 * Is Value Null
	 * 
	 * @return true if value is null
	 */
	public boolean isNull() {
		return value == null;
	} // isNull

	/*************************************************************************/

	/**
	 * Get Display Type
	 * 
	 * @return Display Type
	 */
	public DisplayType getDisplayType() {
		return displayType;
	} // getDisplayType

	/**
	 * Is Value numeric
	 * 
	 * @return true if value is a numeric
	 */
	public boolean isNumeric() {
		if (displayType.getValue() == 0)
			return value instanceof BigDecimal;
		return displayType.isNumeric();
	} // isNumeric

	/**
	 * Is Value a date
	 * 
	 * @return true if value is a date
	 */
	public boolean isDate() {
		if (displayType.getValue() == 0)
			return value instanceof Timestamp;
		return displayType.isDate();
	} // isDate

	/**
	 * Is Value an ID
	 * 
	 * @return true if value is an ID
	 */
	public boolean isID() {
		// ID columns are considered numbers - teo_sarca [ 1673363 ]
		if (DisplayType.ID == displayType)
			return false;
		return displayType.isID();
	} // isID

	/**
	 * Is Value boolean
	 * 
	 * @return true if value is a boolean
	 */
	public boolean isYesNo() {
		if (displayType.getValue() == 0)
			return value instanceof Boolean;
		return DisplayType.YesNo == displayType;
	} // isYesNo

	/**
	 * Is Value the primary key of row
	 * 
	 * @return true if value is the PK
	 */
	public boolean isPKey() {
		return isPKey;
	} // isPKey

	/**
	 * Column value forces page break
	 * 
	 * @return true if page break
	 */
	public boolean isPageBreak() {
		return isPageBreak;
	} // isPageBreak

	/*************************************************************************/

	/**
	 * HashCode
	 * 
	 * @return hash code
	 */
	public int hashCode() {
		if (value == null)
			return columnName.hashCode();
		return columnName.hashCode() + value.hashCode();
	} // hashCode

	/**
	 * Equals
	 * 
	 * @param compare compare object
	 * @return true if equals
	 */
	public boolean equals(Object compare) {
		if (compare instanceof PrintDataElement) {
			PrintDataElement pde = (PrintDataElement) compare;
			if (pde.getColumnName().equals(columnName)) {
				if (pde.getValue() != null && pde.getValue().equals(value))
					return true;
				if (pde.getValue() == null && value == null)
					return true;
			}
		}
		return false;
	} // equals

	/**
	 * String representation
	 * 
	 * @return info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer(columnName).append("=").append(value);
		if (isPKey)
			sb.append("(PK)");
		return sb.toString();
	} // toString

	/**
	 * Value Has Key
	 * 
	 * @return true if value has a key
	 */
	public boolean hasKey() {
		return value instanceof NamePair;
	} // hasKey

	/**
	 * String representation with key info
	 * 
	 * @return info
	 */
	public String toStringX() {
		if (value instanceof NamePair) {
			NamePair pp = (NamePair) value;
			StringBuffer sb = new StringBuffer(columnName);
			sb.append("(").append(pp.getID()).append(")").append("=").append(pp.getName());
			if (isPKey)
				sb.append("(PK)");
			return sb.toString();
		} else
			return toString();
	} // toStringX

	public String getM_formatPattern() {
		return formatPattern;
	}

	public void setM_formatPattern(String pattern) {
		formatPattern = pattern;
	}

}
