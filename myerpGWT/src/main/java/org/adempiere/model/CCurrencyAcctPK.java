package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CCurrencyAcct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CCurrencyAcctPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CCurrencyAcct"); }
		catch(Exception e) {}
	}

	public Integer cAcctSchemaID;
	public Integer cCurrencyID;

	public CCurrencyAcctPK() {
	}

	public CCurrencyAcctPK(String str) {
		fromString(str);
	}

	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	public String toString() {
		return String.valueOf(cAcctSchemaID)
			+ "::" + String.valueOf(cCurrencyID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctSchemaID == null) ? 0 : cAcctSchemaID.hashCode());
		rs = rs * 37 + ((cCurrencyID == null) ? 0 : cCurrencyID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CCurrencyAcctPK other = (CCurrencyAcctPK) obj;
		return ((cAcctSchemaID == null && other.cAcctSchemaID == null)
			|| (cAcctSchemaID != null && cAcctSchemaID.equals(other.cAcctSchemaID)))
			&& ((cCurrencyID == null && other.cCurrencyID == null)
			|| (cCurrencyID != null && cCurrencyID.equals(other.cCurrencyID)));
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
			cCurrencyID = null;
		else
			cCurrencyID = new Integer(str);
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