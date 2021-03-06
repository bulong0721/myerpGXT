package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADUserOrgAccess
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADUserOrgAccessPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADUserOrgAccess"); }
		catch(Exception e) {}
	}

	public Integer aDOrgID;
	public Integer aDUserID;

	public ADUserOrgAccessPK() {
	}

	public ADUserOrgAccessPK(String str) {
		fromString(str);
	}

	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	public String toString() {
		return String.valueOf(aDOrgID)
			+ "::" + String.valueOf(aDUserID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDOrgID == null) ? 0 : aDOrgID.hashCode());
		rs = rs * 37 + ((aDUserID == null) ? 0 : aDUserID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADUserOrgAccessPK other = (ADUserOrgAccessPK) obj;
		return ((aDOrgID == null && other.aDOrgID == null)
			|| (aDOrgID != null && aDOrgID.equals(other.aDOrgID)))
			&& ((aDUserID == null && other.aDUserID == null)
			|| (aDUserID != null && aDUserID.equals(other.aDUserID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDOrgID = null;
		else
			aDOrgID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDUserID = null;
		else
			aDUserID = new Integer(str);
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