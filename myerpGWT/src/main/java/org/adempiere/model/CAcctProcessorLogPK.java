package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CAcctProcessorLog
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CAcctProcessorLogPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CAcctProcessorLog"); }
		catch(Exception e) {}
	}

	public Integer cAcctProcessorID;
	public Integer cAcctProcessorLogID;

	public CAcctProcessorLogPK() {
	}

	public CAcctProcessorLogPK(String str) {
		fromString(str);
	}

	public Integer getCAcctProcessorID() {
		return cAcctProcessorID;
	}

	public void setCAcctProcessorID(Integer cAcctProcessorID) {
		this.cAcctProcessorID = cAcctProcessorID;
	}

	public Integer getCAcctProcessorLogID() {
		return cAcctProcessorLogID;
	}

	public void setCAcctProcessorLogID(Integer cAcctProcessorLogID) {
		this.cAcctProcessorLogID = cAcctProcessorLogID;
	}

	public String toString() {
		return String.valueOf(cAcctProcessorID)
			+ "::" + String.valueOf(cAcctProcessorLogID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctProcessorID == null) ? 0 : cAcctProcessorID.hashCode());
		rs = rs * 37 + ((cAcctProcessorLogID == null) ? 0 : cAcctProcessorLogID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CAcctProcessorLogPK other = (CAcctProcessorLogPK) obj;
		return ((cAcctProcessorID == null && other.cAcctProcessorID == null)
			|| (cAcctProcessorID != null && cAcctProcessorID.equals(other.cAcctProcessorID)))
			&& ((cAcctProcessorLogID == null && other.cAcctProcessorLogID == null)
			|| (cAcctProcessorLogID != null && cAcctProcessorLogID.equals(other.cAcctProcessorLogID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctProcessorID = null;
		else
			cAcctProcessorID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctProcessorLogID = null;
		else
			cAcctProcessorLogID = new Integer(str);
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