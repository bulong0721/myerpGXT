package org.adempiere.common;

/**
 * (String) Value Name Pair
 * 
 * @author Jorg Janke
 * @version $Id: ValueNamePair.java,v 1.2 2006/07/30 00:52:23 jjanke Exp $
 */
public final class ValueNamePair extends NamePair {
	/**
	 * 
	 */
	private static final long			serialVersionUID	= -8315081335749462163L;

	public static final ValueNamePair	EMPTY				= new ValueNamePair("", "");

	/**
	 * Construct KeyValue Pair
	 * 
	 * @param value value
	 * @param name string representation
	 */
	public ValueNamePair(String value, String name) {
		super(name);
		m_value = value;
		if (m_value == null)
			m_value = "";
	} // ValueNamePair

	/** The Value */
	private String	m_value	= null;

	/**
	 * Get Value
	 * 
	 * @return Value
	 */
	public String getValue() {
		return m_value;
	} // getValue

	/**
	 * Get ID
	 * 
	 * @return Value
	 */
	public String getID() {
		return m_value;
	} // getID

	/**
	 * Equals
	 * 
	 * @param obj Object
	 * @return true, if equal
	 */
	public boolean equals(Object obj) {
		if (obj instanceof ValueNamePair) {
			ValueNamePair pp = (ValueNamePair) obj;
			if (pp.getName() != null && pp.getValue() != null && pp.getName().equals(getName())
					&& pp.getValue().equals(m_value))
				return true;
			return false;
		}
		return false;
	} // equals

	/**
	 * Return Hashcode of value
	 * 
	 * @return hascode
	 */
	public int hashCode() {
		return m_value.hashCode();
	} // hashCode

} // KeyValuePair

