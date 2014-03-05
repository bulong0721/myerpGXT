package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CBPWithholding
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CBPWithholdingPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CBPWithholding"); }
		catch(Exception e) {}
	}

	public Integer cBPartnerID;
	public Integer cWithholdingID;

	public CBPWithholdingPK() {
	}

	public CBPWithholdingPK(String str) {
		fromString(str);
	}

	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	public Integer getCWithholdingID() {
		return cWithholdingID;
	}

	public void setCWithholdingID(Integer cWithholdingID) {
		this.cWithholdingID = cWithholdingID;
	}

	public String toString() {
		return String.valueOf(cBPartnerID)
			+ "::" + String.valueOf(cWithholdingID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cBPartnerID == null) ? 0 : cBPartnerID.hashCode());
		rs = rs * 37 + ((cWithholdingID == null) ? 0 : cWithholdingID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CBPWithholdingPK other = (CBPWithholdingPK) obj;
		return ((cBPartnerID == null && other.cBPartnerID == null)
			|| (cBPartnerID != null && cBPartnerID.equals(other.cBPartnerID)))
			&& ((cWithholdingID == null && other.cWithholdingID == null)
			|| (cWithholdingID != null && cWithholdingID.equals(other.cWithholdingID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cBPartnerID = null;
		else
			cBPartnerID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cWithholdingID = null;
		else
			cWithholdingID = new Integer(str);
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