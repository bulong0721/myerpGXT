package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.PPOrderBOMTrl
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class PPOrderBOMTrlPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.PPOrderBOMTrl"); }
		catch(Exception e) {}
	}

	public String aDLanguage;
	public Integer pPOrderBOMID;

	public PPOrderBOMTrlPK() {
	}

	public PPOrderBOMTrlPK(String str) {
		fromString(str);
	}

	public String getADLanguage() {
		return aDLanguage;
	}

	public void setADLanguage(String aDLanguage) {
		this.aDLanguage = aDLanguage;
	}

	public Integer getPPOrderBOMID() {
		return pPOrderBOMID;
	}

	public void setPPOrderBOMID(Integer pPOrderBOMID) {
		this.pPOrderBOMID = pPOrderBOMID;
	}

	public String toString() {
		return aDLanguage
			+ "::" + String.valueOf(pPOrderBOMID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDLanguage == null) ? 0 : aDLanguage.hashCode());
		rs = rs * 37 + ((pPOrderBOMID == null) ? 0 : pPOrderBOMID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		PPOrderBOMTrlPK other = (PPOrderBOMTrlPK) obj;
		return ((aDLanguage == null && other.aDLanguage == null)
			|| (aDLanguage != null && aDLanguage.equals(other.aDLanguage)))
			&& ((pPOrderBOMID == null && other.pPOrderBOMID == null)
			|| (pPOrderBOMID != null && pPOrderBOMID.equals(other.pPOrderBOMID)));
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
			pPOrderBOMID = null;
		else
			pPOrderBOMID = new Integer(str);
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