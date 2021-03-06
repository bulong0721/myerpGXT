package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CMTemplateAdCat
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CMTemplateAdCatPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CMTemplateAdCat"); }
		catch(Exception e) {}
	}

	public Integer cMAdCatID;
	public Integer cMTemplateID;

	public CMTemplateAdCatPK() {
	}

	public CMTemplateAdCatPK(String str) {
		fromString(str);
	}

	public Integer getCMAdCatID() {
		return cMAdCatID;
	}

	public void setCMAdCatID(Integer cMAdCatID) {
		this.cMAdCatID = cMAdCatID;
	}

	public Integer getCMTemplateID() {
		return cMTemplateID;
	}

	public void setCMTemplateID(Integer cMTemplateID) {
		this.cMTemplateID = cMTemplateID;
	}

	public String toString() {
		return String.valueOf(cMAdCatID)
			+ "::" + String.valueOf(cMTemplateID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cMAdCatID == null) ? 0 : cMAdCatID.hashCode());
		rs = rs * 37 + ((cMTemplateID == null) ? 0 : cMTemplateID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CMTemplateAdCatPK other = (CMTemplateAdCatPK) obj;
		return ((cMAdCatID == null && other.cMAdCatID == null)
			|| (cMAdCatID != null && cMAdCatID.equals(other.cMAdCatID)))
			&& ((cMTemplateID == null && other.cMTemplateID == null)
			|| (cMTemplateID != null && cMTemplateID.equals(other.cMTemplateID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cMAdCatID = null;
		else
			cMAdCatID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cMTemplateID = null;
		else
			cMTemplateID = new Integer(str);
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