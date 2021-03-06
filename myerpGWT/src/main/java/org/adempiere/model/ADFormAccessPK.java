package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADFormAccess
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADFormAccessPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADFormAccess"); }
		catch(Exception e) {}
	}

	public Integer aDFormID;
	public Integer aDRoleID;

	public ADFormAccessPK() {
	}

	public ADFormAccessPK(String str) {
		fromString(str);
	}

	public Integer getADFormID() {
		return aDFormID;
	}

	public void setADFormID(Integer aDFormID) {
		this.aDFormID = aDFormID;
	}

	public Integer getADRoleID() {
		return aDRoleID;
	}

	public void setADRoleID(Integer aDRoleID) {
		this.aDRoleID = aDRoleID;
	}

	public String toString() {
		return String.valueOf(aDFormID)
			+ "::" + String.valueOf(aDRoleID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDFormID == null) ? 0 : aDFormID.hashCode());
		rs = rs * 37 + ((aDRoleID == null) ? 0 : aDRoleID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADFormAccessPK other = (ADFormAccessPK) obj;
		return ((aDFormID == null && other.aDFormID == null)
			|| (aDFormID != null && aDFormID.equals(other.aDFormID)))
			&& ((aDRoleID == null && other.aDRoleID == null)
			|| (aDRoleID != null && aDRoleID.equals(other.aDRoleID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDFormID = null;
		else
			aDFormID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDRoleID = null;
		else
			aDRoleID = new Integer(str);
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