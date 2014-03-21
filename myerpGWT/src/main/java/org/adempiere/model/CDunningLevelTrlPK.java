package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CDunningLevelTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CDunningLevelTrlPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CDunningLevelTrl"); }
		catch(Exception e) {}
	}

	public String aDLanguage;
	public Integer cDunningLevelID;

	public CDunningLevelTrlPK() {
	}

	public CDunningLevelTrlPK(String str) {
		fromString(str);
	}

	public String getADLanguage() {
		return aDLanguage;
	}

	public void setADLanguage(String aDLanguage) {
		this.aDLanguage = aDLanguage;
	}

	public Integer getCDunningLevelID() {
		return cDunningLevelID;
	}

	public void setCDunningLevelID(Integer cDunningLevelID) {
		this.cDunningLevelID = cDunningLevelID;
	}

	public String toString() {
		return aDLanguage
			+ "::" + String.valueOf(cDunningLevelID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguage == null) ? 0 : aDLanguage.hashCode());
		rs = rs * 37 + ((cDunningLevelID == null) ? 0 : cDunningLevelID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CDunningLevelTrlPK other = (CDunningLevelTrlPK) obj;
		return ((aDLanguage == null && other.aDLanguage == null)
			|| (aDLanguage != null && aDLanguage.equals(other.aDLanguage)))
			&& ((cDunningLevelID == null && other.cDunningLevelID == null)
			|| (cDunningLevelID != null && cDunningLevelID.equals(other.cDunningLevelID)));
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
			cDunningLevelID = null;
		else
			cDunningLevelID = new Integer(str);
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