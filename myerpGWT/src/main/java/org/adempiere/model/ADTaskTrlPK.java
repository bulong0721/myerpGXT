package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADTaskTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADTaskTrlPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADTaskTrl"); }
		catch(Exception e) {}
	}

	public Integer aDLanguageID;
	public Integer aDTaskID;

	public ADTaskTrlPK() {
	}

	public ADTaskTrlPK(String str) {
		fromString(str);
	}

	public Integer getADLanguageID() {
		return aDLanguageID;
	}

	public void setADLanguageID(Integer aDLanguageID) {
		this.aDLanguageID = aDLanguageID;
	}

	public Integer getADTaskID() {
		return aDTaskID;
	}

	public void setADTaskID(Integer aDTaskID) {
		this.aDTaskID = aDTaskID;
	}

	public String toString() {
		return String.valueOf(aDLanguageID)
			+ "::" + String.valueOf(aDTaskID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguageID == null) ? 0 : aDLanguageID.hashCode());
		rs = rs * 37 + ((aDTaskID == null) ? 0 : aDTaskID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADTaskTrlPK other = (ADTaskTrlPK) obj;
		return ((aDLanguageID == null && other.aDLanguageID == null)
			|| (aDLanguageID != null && aDLanguageID.equals(other.aDLanguageID)))
			&& ((aDTaskID == null && other.aDTaskID == null)
			|| (aDTaskID != null && aDTaskID.equals(other.aDTaskID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDLanguageID = null;
		else
			aDLanguageID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDTaskID = null;
		else
			aDTaskID = new Integer(str);
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