package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CMChatTypeUpdate
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CMChatTypeUpdatePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CMChatTypeUpdate"); }
		catch(Exception e) {}
	}

	public Integer aDUserID;
	public Integer cMChatTypeID;

	public CMChatTypeUpdatePK() {
	}

	public CMChatTypeUpdatePK(String str) {
		fromString(str);
	}

	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	public Integer getCMChatTypeID() {
		return cMChatTypeID;
	}

	public void setCMChatTypeID(Integer cMChatTypeID) {
		this.cMChatTypeID = cMChatTypeID;
	}

	public String toString() {
		return String.valueOf(aDUserID)
			+ "::" + String.valueOf(cMChatTypeID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDUserID == null) ? 0 : aDUserID.hashCode());
		rs = rs * 37 + ((cMChatTypeID == null) ? 0 : cMChatTypeID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CMChatTypeUpdatePK other = (CMChatTypeUpdatePK) obj;
		return ((aDUserID == null && other.aDUserID == null)
			|| (aDUserID != null && aDUserID.equals(other.aDUserID)))
			&& ((cMChatTypeID == null && other.cMChatTypeID == null)
			|| (cMChatTypeID != null && cMChatTypeID.equals(other.cMChatTypeID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDUserID = null;
		else
			aDUserID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cMChatTypeID = null;
		else
			cMChatTypeID = new Integer(str);
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