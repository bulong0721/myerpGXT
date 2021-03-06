package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADWorkbenchTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADWorkbenchTrlPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADWorkbenchTrl"); }
		catch(Exception e) {}
	}

	public String aDLanguage;
	public Integer aDWorkbenchID;

	public ADWorkbenchTrlPK() {
	}

	public ADWorkbenchTrlPK(String str) {
		fromString(str);
	}

	public String getADLanguage() {
		return aDLanguage;
	}

	public void setADLanguage(String aDLanguage) {
		this.aDLanguage = aDLanguage;
	}

	public Integer getADWorkbenchID() {
		return aDWorkbenchID;
	}

	public void setADWorkbenchID(Integer aDWorkbenchID) {
		this.aDWorkbenchID = aDWorkbenchID;
	}

	public String toString() {
		return aDLanguage
			+ "::" + String.valueOf(aDWorkbenchID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguage == null) ? 0 : aDLanguage.hashCode());
		rs = rs * 37 + ((aDWorkbenchID == null) ? 0 : aDWorkbenchID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADWorkbenchTrlPK other = (ADWorkbenchTrlPK) obj;
		return ((aDLanguage == null && other.aDLanguage == null)
			|| (aDLanguage != null && aDLanguage.equals(other.aDLanguage)))
			&& ((aDWorkbenchID == null && other.aDWorkbenchID == null)
			|| (aDWorkbenchID != null && aDWorkbenchID.equals(other.aDWorkbenchID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDLanguage = null;
		else
			aDLanguage = str;
		str = toke.nextToken();
		if("null".equals(str))
			aDWorkbenchID = null;
		else
			aDWorkbenchID = new Integer(str);
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