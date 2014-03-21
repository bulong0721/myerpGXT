package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdTabVTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdTabVtPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdTabVTrl"); }
		catch(Exception e) {}
	}

	public Integer aDLanguageID;
	public Integer aDTabID;

	public AdTabVtPK() {
	}

	public AdTabVtPK(String str) {
		fromString(str);
	}

	public Integer getADLanguageID() {
		return aDLanguageID;
	}

	public void setADLanguageID(Integer aDLanguageID) {
		this.aDLanguageID = aDLanguageID;
	}

	public Integer getADTabID() {
		return aDTabID;
	}

	public void setADTabID(Integer aDTabID) {
		this.aDTabID = aDTabID;
	}

	public String toString() {
		return String.valueOf(aDLanguageID)
			+ "::" + String.valueOf(aDTabID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguageID == null) ? 0 : aDLanguageID.hashCode());
		rs = rs * 37 + ((aDTabID == null) ? 0 : aDTabID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdTabVtPK other = (AdTabVtPK) obj;
		return ((aDLanguageID == null && other.aDLanguageID == null)
			|| (aDLanguageID != null && aDLanguageID.equals(other.aDLanguageID)))
			&& ((aDTabID == null && other.aDTabID == null)
			|| (aDTabID != null && aDTabID.equals(other.aDTabID)));
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
			aDTabID = null;
		else
			aDTabID = new Integer(str);
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