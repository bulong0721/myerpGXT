package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADChangeLog
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADChangeLogPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADChangeLog"); }
		catch(Exception e) {}
	}

	public Integer aDChangeLogID;
	public Integer aDColumnID;
	public Integer aDSessionID;
	public Integer aDTableID;

	public ADChangeLogPK() {
	}

	public ADChangeLogPK(String str) {
		fromString(str);
	}

	public Integer getADChangeLogID() {
		return aDChangeLogID;
	}

	public void setADChangeLogID(Integer aDChangeLogID) {
		this.aDChangeLogID = aDChangeLogID;
	}

	public Integer getADColumnID() {
		return aDColumnID;
	}

	public void setADColumnID(Integer aDColumnID) {
		this.aDColumnID = aDColumnID;
	}

	public Integer getADSessionID() {
		return aDSessionID;
	}

	public void setADSessionID(Integer aDSessionID) {
		this.aDSessionID = aDSessionID;
	}

	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
	}

	public String toString() {
		return String.valueOf(aDChangeLogID)
			+ "::" + String.valueOf(aDColumnID)
			+ "::" + String.valueOf(aDSessionID)
			+ "::" + String.valueOf(aDTableID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDChangeLogID == null) ? 0 : aDChangeLogID.hashCode());
		rs = rs * 37 + ((aDColumnID == null) ? 0 : aDColumnID.hashCode());
		rs = rs * 37 + ((aDSessionID == null) ? 0 : aDSessionID.hashCode());
		rs = rs * 37 + ((aDTableID == null) ? 0 : aDTableID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADChangeLogPK other = (ADChangeLogPK) obj;
		return ((aDChangeLogID == null && other.aDChangeLogID == null)
			|| (aDChangeLogID != null && aDChangeLogID.equals(other.aDChangeLogID)))
			&& ((aDColumnID == null && other.aDColumnID == null)
			|| (aDColumnID != null && aDColumnID.equals(other.aDColumnID)))
			&& ((aDSessionID == null && other.aDSessionID == null)
			|| (aDSessionID != null && aDSessionID.equals(other.aDSessionID)))
			&& ((aDTableID == null && other.aDTableID == null)
			|| (aDTableID != null && aDTableID.equals(other.aDTableID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDChangeLogID = null;
		else
			aDChangeLogID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDColumnID = null;
		else
			aDColumnID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDSessionID = null;
		else
			aDSessionID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDTableID = null;
		else
			aDTableID = new Integer(str);
	}

	protected static class Tokenizer {
		private final String str;
		private int last;

		public Tokenizer (String str) {
			this.str = str;
		}

		public String nextToken () {
			int next = str.indexOf("::", last);
			String part;
			if(next == -1) {
				part = str.substring(last);
				last = str.length();
			} else {
				part = str.substring(last, next);
				last = next + 2;
			}
			return part;
		}
	}
}