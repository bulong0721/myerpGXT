package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CBPGroupAcct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CBPGroupAcctPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CBPGroupAcct"); }
		catch(Exception e) {}
	}

	public Integer cAcctSchemaID;
	public Integer cBPGroupID;

	public CBPGroupAcctPK() {
	}

	public CBPGroupAcctPK(String str) {
		fromString(str);
	}

	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	public Integer getCBPGroupID() {
		return cBPGroupID;
	}

	public void setCBPGroupID(Integer cBPGroupID) {
		this.cBPGroupID = cBPGroupID;
	}

	public String toString() {
		return String.valueOf(cAcctSchemaID)
			+ "::" + String.valueOf(cBPGroupID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctSchemaID == null) ? 0 : cAcctSchemaID.hashCode());
		rs = rs * 37 + ((cBPGroupID == null) ? 0 : cBPGroupID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CBPGroupAcctPK other = (CBPGroupAcctPK) obj;
		return ((cAcctSchemaID == null && other.cAcctSchemaID == null)
			|| (cAcctSchemaID != null && cAcctSchemaID.equals(other.cAcctSchemaID)))
			&& ((cBPGroupID == null && other.cBPGroupID == null)
			|| (cBPGroupID != null && cBPGroupID.equals(other.cBPGroupID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctSchemaID = null;
		else
			cAcctSchemaID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cBPGroupID = null;
		else
			cBPGroupID = new Integer(str);
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