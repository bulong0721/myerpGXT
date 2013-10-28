package org.adempiere.web.shared.adempiere;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public enum DisplayType {
	String(10), Integer(11), Amount(12), ID(13), Text(14), Date(15), DateTime(16), List(17), Table(18), TableDir(19), YesNo(
			20), Location(21), Number(22), Binary(23), Time(24), Account(25), RowID(26), Color(27), Button(28), Quantity(
			29), Search(30), Locator(31), Image(32), Assignment(33), Memo(34), PAttribute(35), TextLong(36), CostPrice(
			37), FilePath(38), FileName(39), URL(40), PrinterName(42);

	private int	value;

	DisplayType(int value) {
		this.value = value;
	}

	static final Map<Integer, DisplayType>	valueMap	= new HashMap<Integer, DisplayType>();
	static {
		for (DisplayType dt : DisplayType.values()) {
			valueMap.put(dt.getValue(), dt);
		}
	}

	public int getValue() {
		return value;
	}

	public static DisplayType fromInteger(int value) {
		if (valueMap.containsKey(value)) {
			return valueMap.get(value);
		}
		return Text;
	}

	/**
	 * Returns true, if DisplayType is numeric (Amount, Number, Quantity,
	 * Integer). (stored as BigDecimal)
	 * 
	 * @param value Display Type
	 * @return true if numeric
	 */
	public boolean isNumeric() {
		if (value == Amount.value || value == Number.value || value == CostPrice.value || value == Integer.value
				|| value == Quantity.value)
			return true;
		return false;
	} // isNumeric

	public boolean isFloat() {
		if (value == Amount.value || value == Number.value || value == CostPrice.value || value == Quantity.value)
			return true;
		return false;
	}

	public boolean isBoolean() {
		if (value == YesNo.value)
			return true;
		return false;
	}

	public boolean isInteger() {
		if (value == Integer.value || value == ID.value)
			return true;
		return false;
	}

	/**
	 * Returns truem if DisplayType is a Date. (stored as Timestamp)
	 * 
	 * @param value Display Type
	 * @return true if date
	 */
	public boolean isDate() {
		if (value == Date.value || value == DateTime.value || value == Time.value)
			return true;
		return false;
	} // isDate

	/**
	 * Returns true, if DisplayType is text (String, Text, TextLong, Memo).
	 * 
	 * @param value Display Type
	 * @return true if text
	 */
	public boolean isText() {
		if (value == String.value || value == Text.value || value == TextLong.value || value == Memo.value
				|| value == FilePath.value || value == FileName.value || value == URL.value
				|| value == PrinterName.value)
			return true;
		return false;
	} // isText

	/**
	 * Returns true if (numeric) ID (Table, Search, Account, ..). (stored as
	 * Integer)
	 * 
	 * @param value Display Type
	 * @return true if ID
	 */
	public boolean isID() {
		if (value == ID.value || value == Table.value || value == TableDir.value || value == Search.value
				|| value == Location.value || value == Locator.value || value == Account.value
				|| value == Assignment.value || value == PAttribute.value || value == Image.value
				|| value == Color.value)
			return true;
		return false;
	} // isID

	/**
	 * Returns true if DisplayType is a Large Object
	 * 
	 * @param value Display Type
	 * @return true if LOB
	 */
	public boolean isLOB() {
		if (value == Binary.value || value == TextLong.value)
			return true;
		return false;
	} // isLOB

	/**
	 * Returns true if DisplayType is a VLookup (List, Table, TableDir, Search).
	 * (stored as Integer)
	 * 
	 * @param value Display Type
	 * @return true if Lookup
	 */
	public boolean isLookup() {
		if (value == List.value || value == Table.value || value == TableDir.value || value == Search.value)
			return true;
		return false;
	} // isLookup

	/**
	 * Return Storage Class. (used for MiniTable)
	 * 
	 * @param value Display Type
	 * @param yesNoAsBoolean - yes or no as boolean
	 * @return class Integer - BigDecimal - Timestamp - String - Boolean
	 */
	public Class<?> getClass(boolean yesNoAsBoolean) {
		if (isText() || value == List.value)
			return String.class;
		else if (isID() || value == Integer.value) // note that
													// Integer is
			// stored as BD
			return Integer.class;
		// else if (isNumeric(displayType))
		// return java.math.BigDecimal.class;
		else if (isDate())
			return java.sql.Timestamp.class;
		else if (value == YesNo.value)
			return yesNoAsBoolean ? Boolean.class : String.class;
		else if (value == Button.value)
			return String.class;
		else if (isLOB()) // CLOB is Strin
			return byte[].class;
		//
		return Object.class;
	} // getClass

	public boolean isKey() {
		if (value == ID.value)
			return true;
		return false;
	}

	public boolean isButton() {
		if (value == Button.value)
			return true;
		return false;
	}
}
