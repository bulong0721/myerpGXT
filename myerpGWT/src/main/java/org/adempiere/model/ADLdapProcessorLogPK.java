package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADLdapProcessorLog
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADLdapProcessorLogPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADLdapProcessorLog"); }
		catch(Exception e) {}
	}

	public Integer aDLdapProcessorID;
	public Integer aDLdapProcessorLogID;

	public ADLdapProcessorLogPK() {
	}

	public ADLdapProcessorLogPK(String str) {
		fromString(str);
	}

	public Integer getADLdapProcessorID() {
		return aDLdapProcessorID;
	}

	public void setADLdapProcessorID(Integer aDLdapProcessorID) {
		this.aDLdapProcessorID = aDLdapProcessorID;
	}

	public Integer getADLdapProcessorLogID() {
		return aDLdapProcessorLogID;
	}

	public void setADLdapProcessorLogID(Integer aDLdapProcessorLogID) {
		this.aDLdapProcessorLogID = aDLdapProcessorLogID;
	}

	public String toString() {
		return String.valueOf(aDLdapProcessorID)
			+ "::" + String.valueOf(aDLdapProcessorLogID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLdapProcessorID == null) ? 0 : aDLdapProcessorID.hashCode());
		rs = rs * 37 + ((aDLdapProcessorLogID == null) ? 0 : aDLdapProcessorLogID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADLdapProcessorLogPK other = (ADLdapProcessorLogPK) obj;
		return ((aDLdapProcessorID == null && other.aDLdapProcessorID == null)
			|| (aDLdapProcessorID != null && aDLdapProcessorID.equals(other.aDLdapProcessorID)))
			&& ((aDLdapProcessorLogID == null && other.aDLdapProcessorLogID == null)
			|| (aDLdapProcessorLogID != null && aDLdapProcessorLogID.equals(other.aDLdapProcessorLogID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDLdapProcessorID = null;
		else
			aDLdapProcessorID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDLdapProcessorLogID = null;
		else
			aDLdapProcessorLogID = new Integer(str);
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