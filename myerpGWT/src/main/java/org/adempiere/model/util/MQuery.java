package org.adempiere.model.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class MQuery implements Serializable {

	/**
	 * Get Zoom Column Name. Converts Synonyms like SalesRep_ID to AD_User_ID
	 * 
	 * @param columnName column name
	 * @return column name
	 */
	public static String getZoomColumnName(String columnName) {
		if (columnName == null)
			return null;
		if (columnName.equals("SalesRep_ID"))
			return "AD_User_ID";
		if (columnName.equals("C_DocTypeTarget_ID"))
			return "C_DocType_ID";
		if (columnName.equals("Bill_BPartner_ID"))
			return "C_BPartner_ID";
		if (columnName.equals("Bill_Location_ID"))
			return "C_BPartner_Location_ID";
		if (columnName.equals("Account_ID"))
			return "C_ElementValue_ID";
		if (columnName.equals("C_LocFrom_ID") || columnName.equals("C_LocTo_ID"))
			return "C_Location_ID";
		// Fix "*_To" columns
		if (columnName.toUpperCase().endsWith("TO_ID")) {
			return columnName.substring(0, columnName.length() - 5) + "_ID";
		}
		if (columnName.toUpperCase().endsWith("_TO_ID")) {
			return columnName.substring(0, columnName.length() - 6) + "_ID";
		}
		if (columnName.equals("AD_OrgBP_ID") || columnName.equals("AD_OrgTrx_ID"))
			return "AD_Org_ID";
		// See also GridTab.validateQuery
		//
		return columnName;
	} // getZoomColumnName

	/**
	 * Derive Zoom Table Name from column name. (e.g. drop _ID)
	 * 
	 * @param columnName column name
	 * @return table name
	 */
	public static String getZoomTableName(String columnName) {
		String tableName = getZoomColumnName(columnName);
		int index = tableName.lastIndexOf("_ID");
		if (index != -1)
			return tableName.substring(0, index);
		return tableName;
	} // getZoomTableName

	/*************************************************************************
	 * Create simple Equal Query. Creates columnName=value or columnName='value'
	 * 
	 * @param columnName columnName
	 * @param value value
	 * @return quary
	 */
	public static MQuery getEqualQuery(String columnName, Object value) {
		MQuery query = new MQuery();
		query.addRestriction(columnName, EQUAL, value);
		query.setRecordCount(1); // guess
		return query;
	} // getEqualQuery

	/**
	 * Create simple Equal Query. Creates columnName=value
	 * 
	 * @param columnName columnName
	 * @param value value
	 * @return query
	 */
	public static MQuery getEqualQuery(String columnName, int value) {
		MQuery query = new MQuery();
		if (columnName.endsWith("_ID"))
			query.setTableName(columnName.substring(0, columnName.length() - 3));
		query.addRestriction(columnName, EQUAL, new Integer(value));
		query.setRecordCount(1); // guess
		return query;
	} // getEqualQuery

	/**
	 * Create No Record query.
	 * 
	 * @param tableName table name
	 * @param newRecord new Record Indicator (2=3)
	 * @return query
	 */
	public static MQuery getNoRecordQuery(String tableName, boolean newRecord) {
		MQuery query = new MQuery(tableName);
		if (newRecord)
			query.addRestriction(NEWRECORD);
		else
			query.addRestriction("1=2");
		query.setRecordCount(0);
		return query;
	} // getNoRecordQuery

	/**************************************************************************
	 * Constructor w/o table name
	 */
	public MQuery() {
	} // MQuery

	/**
	 * Constructor
	 * 
	 * @param TableName Table Name
	 */
	public MQuery(String TableName) {
		m_TableName = TableName;
	} // MQuery

	/**
	 * Constructor get TableNAme from Table
	 * 
	 * @param AD_Table_ID Table_ID
	 */
	public MQuery(int AD_Table_ID) { // Use Client Context as r/o
		// m_TableName = MTable.getTableName(Env.getCtx(), AD_Table_ID);
	} // MQuery

	/** Serialization Info **/
	private static final long		serialVersionUID	= 4883859385509199306L;

	/** Table Name */
	private String					m_TableName			= "";
	/** PInstance */
	private int						m_AD_PInstance_ID	= 0;
	/** List of Restrictions */
	private ArrayList<Restriction>	m_list				= new ArrayList<Restriction>();
	/** Record Count */
	private int						m_recordCount		= 999999;
	/** New Record Query */
	private boolean					m_newRecord			= false;
	/** New Record String */
	private static final String		NEWRECORD			= "2=3";

	private String					m_zoomTable;

	private String					m_zoomColumn;

	private Object					m_zoomValue;

	/**
	 * Get Record Count
	 * 
	 * @return count - default 999999
	 */
	public int getRecordCount() {
		return m_recordCount;
	} // getRecordCount

	/**
	 * Set Record Count
	 * 
	 * @param count count
	 */
	public void setRecordCount(int count) {
		m_recordCount = count;
	} // setRecordCount

	/** Equal */
	public static final String	EQUAL			= "=";
	/** Equal - 0 */
	public static final int		EQUAL_INDEX		= 0;
	/** Not Equal */
	public static final String	NOT_EQUAL		= "!=";
	/** Not Equal - 1 */
	public static final int		NOT_EQUAL_INDEX	= 1;
	/** Like */
	public static final String	LIKE			= " LIKE ";
	/** Not Like */
	public static final String	NOT_LIKE		= " NOT LIKE ";
	/** Greater */
	public static final String	GREATER			= ">";
	/** Greater Equal */
	public static final String	GREATER_EQUAL	= ">=";
	/** Less */
	public static final String	LESS			= "<";
	/** Less Equal */
	public static final String	LESS_EQUAL		= "<=";
	/** Between */
	public static final String	BETWEEN			= " BETWEEN ";
	/** Between - 8 */
	public static final int		BETWEEN_INDEX	= 8;

	// /** Operators for Strings */
	// public static final ValueNamePair[] OPERATORS = new ValueNamePair[] {
	// new ValueNamePair(EQUAL, " = "), // 0
	// new ValueNamePair(NOT_EQUAL, " != "), new ValueNamePair(LIKE, " ~ "), new
	// ValueNamePair(NOT_LIKE, " !~ "),
	// new ValueNamePair(GREATER, " > "), new ValueNamePair(GREATER_EQUAL,
	// " >= "), // 5
	// new ValueNamePair(LESS, " < "), new ValueNamePair(LESS_EQUAL, " <= "),
	// new ValueNamePair(BETWEEN, " >-< ") // 8
	// };
	// /** Operators for IDs */
	// public static final ValueNamePair[] OPERATORS_ID = new ValueNamePair[] {
	// new ValueNamePair(EQUAL, " = "), // 0
	// new ValueNamePair(NOT_EQUAL, " != ") };
	// /** Operators for Boolean */
	// public static final ValueNamePair[] OPERATORS_YN = new ValueNamePair[] {
	// new ValueNamePair(EQUAL, " = ") };

	/*************************************************************************
	 * Add Restriction
	 * 
	 * @param ColumnName ColumnName
	 * @param Operator Operator, e.g. = != ..
	 * @param Code Code, e.g 0, All%
	 * @param InfoName Display Name
	 * @param InfoDisplay Display of Code (Lookup)
	 * @param andCondition true=and, false=or
	 * @param depth ( = no open brackets )
	 */
	public void addRestriction(String ColumnName, String Operator, Object Code, String InfoName, String InfoDisplay,
			boolean andCondition, int depth) {
		Restriction r = new Restriction(ColumnName, Operator, Code, InfoName, InfoDisplay, andCondition, depth);
		m_list.add(r);
	} // addRestriction

	/*************************************************************************
	 * Add Restriction
	 * 
	 * @param ColumnName ColumnName
	 * @param Operator Operator, e.g. = != ..
	 * @param Code Code, e.g 0, All%
	 * @param InfoName Display Name
	 * @param InfoDisplay Display of Code (Lookup)
	 */
	public void addRestriction(String ColumnName, String Operator, Object Code, String InfoName, String InfoDisplay) {
		Restriction r = new Restriction(ColumnName, Operator, Code, InfoName, InfoDisplay, true, 0);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Restriction
	 * 
	 * @param ColumnName ColumnName
	 * @param Operator Operator, e.g. = != ..
	 * @param Code Code, e.g 0, All%
	 */
	public void addRestriction(String ColumnName, String Operator, Object Code) {
		Restriction r = new Restriction(ColumnName, Operator, Code, null, null, true, 0);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Restriction
	 * 
	 * @param ColumnName ColumnName
	 * @param Operator Operator, e.g. = != ..
	 * @param Code Code, e.g 0
	 */
	public void addRestriction(String ColumnName, String Operator, int Code) {
		Restriction r = new Restriction(ColumnName, Operator, new Integer(Code), null, null, true, 0);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Range Restriction (BETWEEN)
	 * 
	 * @param ColumnName ColumnName
	 * @param Code Code, e.g 0, All%
	 * @param Code_to Code, e.g 0, All%
	 * @param InfoName Display Name
	 * @param InfoDisplay Display of Code (Lookup)
	 * @param InfoDisplay_to Display of Code (Lookup)
	 * @param andCondition true=and, false=or
	 * @param depth ( = no open brackets )
	 */
	public void addRangeRestriction(String ColumnName, Object Code, Object Code_to, String InfoName,
			String InfoDisplay, String InfoDisplay_to, boolean andCondition, int depth) {
		Restriction r = new Restriction(ColumnName, Code, Code_to, InfoName, InfoDisplay, InfoDisplay_to, andCondition,
				depth);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Range Restriction (BETWEEN)
	 * 
	 * @param ColumnName ColumnName
	 * @param Code Code, e.g 0, All%
	 * @param Code_to Code, e.g 0, All%
	 * @param InfoName Display Name
	 * @param InfoDisplay Display of Code (Lookup)
	 * @param InfoDisplay_to Display of Code (Lookup)
	 */
	public void addRangeRestriction(String ColumnName, Object Code, Object Code_to, String InfoName,
			String InfoDisplay, String InfoDisplay_to) {
		Restriction r = new Restriction(ColumnName, Code, Code_to, InfoName, InfoDisplay, InfoDisplay_to, true, 0);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Range Restriction (BETWEEN)
	 * 
	 * @param ColumnName ColumnName
	 * @param Code Code, e.g 0, All%
	 * @param Code_to Code, e.g 0, All%
	 */
	public void addRangeRestriction(String ColumnName, Object Code, Object Code_to) {
		Restriction r = new Restriction(ColumnName, Code, Code_to, null, null, null, true, 0);
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Restriction
	 * 
	 * @param r Restriction
	 */
	protected void addRestriction(Restriction r) {
		m_list.add(r);
	} // addRestriction

	/**
	 * Add Restriction
	 * 
	 * @param whereClause SQL WHERE clause
	 */
	public void addRestriction(String whereClause, boolean andCondition, int joinDepth) {
		if (whereClause == null || whereClause.trim().length() == 0)
			return;
		Restriction r = new Restriction(whereClause, andCondition, joinDepth);
		m_list.add(r);
		m_newRecord = whereClause.equals(NEWRECORD);
	} // addRestriction

	/**
	 * Add Restriction
	 * 
	 * @param whereClause SQL WHERE clause
	 */
	public void addRestriction(String whereClause) {
		if (whereClause == null || whereClause.trim().length() == 0)
			return;
		Restriction r = new Restriction(whereClause, true, 0);
		m_list.add(r);
		m_newRecord = whereClause.equals(NEWRECORD);
	} // addRestriction

	/**
	 * New Record Query
	 * 
	 * @return true if new record query
	 */
	public boolean isNewRecordQuery() {
		return m_newRecord;
	} // isNewRecord

	/**
	 * Get printable Query Info
	 * 
	 * @return info
	 */
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		int currentDepth = 0;
		if (m_TableName != null)
			sb.append(m_TableName).append(": ");
		//
		for (int i = 0; i < m_list.size(); i++) {
			Restriction r = (Restriction) m_list.get(i);
			for (; currentDepth < r.joinDepth; currentDepth++) {
				sb.append('(');
			}
			for (; currentDepth > r.joinDepth; currentDepth--) {
				sb.append(')');
			}
			if (i != 0)
				sb.append(r.andCondition ? " AND " : " OR ");
			//
			sb.append(r.getInfoName()).append(r.getInfoOperator()).append(r.getInfoDisplayAll());
		}
		// close brackets
		for (; currentDepth > 0; currentDepth--) {
			sb.append(')');
		}
		return sb.toString();
	} // getInfo

	/**
	 * Get Restriction Count
	 * 
	 * @return number of restrictions
	 */
	public int getRestrictionCount() {
		return m_list.size();
	} // getRestrictionCount

	/**
	 * Is Query Active
	 * 
	 * @return true if number of restrictions > 0
	 */
	public boolean isActive() {
		return m_list.size() != 0;
	} // isActive

	/**
	 * Get Table Name
	 * 
	 * @return Table Name
	 */
	public String getTableName() {
		return m_TableName;
	} // getTableName

	/**
	 * Set Table Name
	 * 
	 * @param TableName Table Name
	 */
	public void setTableName(String TableName) {
		m_TableName = TableName;
	} // setTableName

	/*************************************************************************
	 * Get ColumnName of index
	 * 
	 * @param index index
	 * @return ColumnName
	 */
	public String getColumnName(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.ColumnName;
	} // getColumnName

	/**
	 * Set ColumnName of index
	 * 
	 * @param index index
	 * @param ColumnName new column name
	 */
	protected void setColumnName(int index, String ColumnName) {
		if (index < 0 || index >= m_list.size())
			return;
		Restriction r = (Restriction) m_list.get(index);
		r.ColumnName = ColumnName;
	} // setColumnName

	/**
	 * Get Operator of index
	 * 
	 * @param index index
	 * @return Operator
	 */
	public String getOperator(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.Operator;
	} // getOperator

	/**
	 * Get Operator of index
	 * 
	 * @param index index
	 * @return Operator
	 */
	public Object getCode(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.Code;
	} // getCode

	/**
	 * Get Restriction Display of index
	 * 
	 * @param index index
	 * @return Restriction Display
	 */
	public String getInfoDisplay(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.InfoDisplay;
	} // getOperator

	/**
	 * Get TO Restriction Display of index
	 * 
	 * @param index index
	 * @return Restriction Display
	 */
	public String getInfoDisplay_to(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.InfoDisplay_to;
	} // getOperator

	/**
	 * Get Info Name
	 * 
	 * @param index index
	 * @return Info Name
	 */
	public String getInfoName(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.InfoName;
	} // getInfoName

	/**
	 * Get Info Operator
	 * 
	 * @param index index
	 * @return info Operator
	 */
	public String getInfoOperator(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.getInfoOperator();
	} // getInfoOperator

	/**
	 * Get Display with optional To
	 * 
	 * @param index index
	 * @return info display
	 */
	public String getInfoDisplayAll(int index) {
		if (index < 0 || index >= m_list.size())
			return null;
		Restriction r = (Restriction) m_list.get(index);
		return r.getInfoDisplayAll();
	} // getInfoDisplay

	/**
	 * Get Display Name
	 * 
	 * @param ctx context
	 * @return display Name
	 */
	public String getDisplayName(Properties ctx) {
		String keyColumn = null;
		if (m_TableName != null)
			keyColumn = m_TableName + "_ID";
		else
			keyColumn = getColumnName(0);
		String retValue = translate(ctx, keyColumn);
		if (retValue != null && retValue.length() > 0)
			return retValue;
		return m_TableName;
	} // getDisplayName

	private String translate(Properties ctx, String keyColumn) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Clone Query
	 * 
	 * @return Query
	 */
	public MQuery deepCopy() {
		MQuery newQuery = new MQuery(m_TableName);
		for (int i = 0; i < m_list.size(); i++)
			newQuery.addRestriction((Restriction) m_list.get(i));
		return newQuery;
	} // clone

	/**
	 * @return AD_PInstance_ID; this value is set if you created this query by
	 *         using {@link #get(Properties, int, String)}
	 */
	public int getAD_PInstance_ID() {
		return m_AD_PInstance_ID;
	}

	/**
	 * 
	 * @param tableName
	 */
	public void setZoomTableName(String tableName) {
		m_zoomTable = tableName;
	}

	/**
	 * 
	 * @return zoom table name
	 */
	public String getZoomTableName() {
		return m_zoomTable;
	}

	/**
	 * 
	 * @param column
	 */
	public void setZoomColumnName(String column) {
		m_zoomColumn = column;
	}

	/**
	 * 
	 * @return zoom column name
	 */
	public String getZoomColumnName() {
		return m_zoomColumn;
	}

	/**
	 * 
	 * @param value
	 */
	public void setZoomValue(Object value) {
		m_zoomValue = value;
	}

	/**
	 * 
	 * @return zoom value, usually an integer
	 */
	public Object getZoomValue() {
		return m_zoomValue;
	}
} // MQuery

/*****************************************************************************
 * Query Restriction
 */
class Restriction implements Serializable {
	/**
	 * 
	 */
	private static final long	serialVersionUID	= -4521978087587321243L;

	/**
	 * Restriction
	 * 
	 * @param columnName ColumnName
	 * @param operator Operator, e.g. = != ..
	 * @param code Code, e.g 0, All%
	 * @param infoName Display Name
	 * @param infoDisplay Display of Code (Lookup)
	 */
	Restriction(String columnName, String operator, Object code, String infoName, String infoDisplay,
			boolean andCondition, int depth) {
		this.ColumnName = columnName.trim();
		if (infoName != null)
			InfoName = infoName;
		else
			InfoName = ColumnName;

		this.andCondition = andCondition;
		this.joinDepth = depth < 0 ? 0 : depth;

		//
		this.Operator = operator;
		// Boolean
		if (code instanceof Boolean)
			Code = ((Boolean) code).booleanValue() ? "Y" : "N";
		// else if (code instanceof KeyNamePair)
		// Code = new Integer(((KeyNamePair) code).getKey());
		// else if (code instanceof ValueNamePair)
		// Code = ((ValueNamePair) code).getValue();
		else
			Code = code;
		// clean code
		if (Code instanceof String) {
			if (Code.toString().startsWith("'"))
				Code = Code.toString().substring(1);
			if (Code.toString().endsWith("'"))
				Code = Code.toString().substring(0, Code.toString().length() - 2);
		}
		if (infoDisplay != null)
			InfoDisplay = infoDisplay.trim();
		else if (code != null)
			InfoDisplay = code.toString();
	} // Restriction

	/**
	 * Range Restriction (BETWEEN)
	 * 
	 * @param columnName ColumnName
	 * @param code Code, e.g 0, All%
	 * @param code_to Code, e.g 0, All%
	 * @param infoName Display Name
	 * @param infoDisplay Display of Code (Lookup)
	 * @param infoDisplay_to Display of Code (Lookup)
	 */
	Restriction(String columnName, Object code, Object code_to, String infoName, String infoDisplay,
			String infoDisplay_to, boolean andCondition, int depth) {
		this(columnName, MQuery.BETWEEN, code, infoName, infoDisplay, andCondition, depth);

		// Code_to
		Code_to = code_to;
		if (Code_to instanceof String) {
			if (Code_to.toString().startsWith("'"))
				Code_to = Code_to.toString().substring(1);
			if (Code_to.toString().endsWith("'"))
				Code_to = Code_to.toString().substring(0, Code_to.toString().length() - 2);
		}
		// InfoDisplay_to
		if (infoDisplay_to != null)
			InfoDisplay_to = infoDisplay_to.trim();
		else if (Code_to != null)
			InfoDisplay_to = Code_to.toString();
	} // Restriction

	/**
	 * Create Restriction with direct WHERE clause
	 * 
	 * @param whereClause SQL WHERE Clause
	 */
	Restriction(String whereClause, boolean andCondition, int depth) {
		DirectWhereClause = whereClause;
		this.andCondition = andCondition;
		this.joinDepth = depth;
	} // Restriction

	/** Direct Where Clause */
	protected String	DirectWhereClause	= null;
	/** Column Name */
	protected String	ColumnName;
	/** Name */
	protected String	InfoName;
	/** Operator */
	protected String	Operator;
	/** SQL Where Code */
	protected Object	Code;
	/** Info */
	protected String	InfoDisplay;
	/** SQL Where Code To */
	protected Object	Code_to;
	/** Info To */
	protected String	InfoDisplay_to;
	/** And/Or Condition */
	protected boolean	andCondition		= true;
	/** And/Or condition nesting depth ( = number of open brackets at and/or) */
	protected int		joinDepth			= 0;

	public TypedQuery<?> getQuery(EntityManager em) {
		return null;
	}

	/**
	 * Get Info Name
	 * 
	 * @return Info Name
	 */
	public String getInfoName() {
		return InfoName;
	} // getInfoName

	/**
	 * Get Info Operator
	 * 
	 * @return info Operator
	 */
	public String getInfoOperator() {
		// TODO
		// for (int i = 0; i < MQuery.OPERATORS.length; i++) {
		// if (MQuery.OPERATORS[i].getValue().equals(Operator))
		// return MQuery.OPERATORS[i].getName();
		// }
		return Operator;
	} // getInfoOperator

	/**
	 * Get Display with optional To
	 * 
	 * @return info display
	 */
	public String getInfoDisplayAll() {
		if (InfoDisplay_to == null)
			return InfoDisplay;
		StringBuffer sb = new StringBuffer(InfoDisplay);
		sb.append(" - ").append(InfoDisplay_to);
		return sb.toString();
	} // getInfoDisplay

} // Restriction
