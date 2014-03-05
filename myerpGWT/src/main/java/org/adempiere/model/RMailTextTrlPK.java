package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.RMailTextTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class RMailTextTrlPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.RMailTextTrl"); }
		catch(Exception e) {}
	}

	public String aDLanguage;
	public Integer rMailTextID;

	public RMailTextTrlPK() {
	}

	public RMailTextTrlPK(String str) {
		fromString(str);
	}

	public String getADLanguage() {
		return aDLanguage;
	}

	public void setADLanguage(String aDLanguage) {
		this.aDLanguage = aDLanguage;
	}

	public Integer getRMailTextID() {
		return rMailTextID;
	}

	public void setRMailTextID(Integer rMailTextID) {
		this.rMailTextID = rMailTextID;
	}

	public String toString() {
		return aDLanguage
			+ "::" + String.valueOf(rMailTextID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguage == null) ? 0 : aDLanguage.hashCode());
		rs = rs * 37 + ((rMailTextID == null) ? 0 : rMailTextID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		RMailTextTrlPK other = (RMailTextTrlPK) obj;
		return ((aDLanguage == null && other.aDLanguage == null)
			|| (aDLanguage != null && aDLanguage.equals(other.aDLanguage)))
			&& ((rMailTextID == null && other.rMailTextID == null)
			|| (rMailTextID != null && rMailTextID.equals(other.rMailTextID)));
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
			rMailTextID = null;
		else
			rMailTextID = new Integer(str);
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