package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CAcctprocessorlog
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CAcctprocessorlogPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CAcctprocessorlog"); }
		catch(Exception e) {}
	}

	public Integer cAcctprocessorId;
	public Integer cAcctprocessorlogId;

	public CAcctprocessorlogPK() {
	}

	public CAcctprocessorlogPK(String str) {
		fromString(str);
	}

	public Integer getCAcctprocessorId() {
		return cAcctprocessorId;
	}

	public void setCAcctprocessorId(Integer cAcctprocessorId) {
		this.cAcctprocessorId = cAcctprocessorId;
	}

	public Integer getCAcctprocessorlogId() {
		return cAcctprocessorlogId;
	}

	public void setCAcctprocessorlogId(Integer cAcctprocessorlogId) {
		this.cAcctprocessorlogId = cAcctprocessorlogId;
	}

	public String toString() {
		return String.valueOf(cAcctprocessorId)
			+ "::" + String.valueOf(cAcctprocessorlogId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctprocessorId == null) ? 0 : cAcctprocessorId.hashCode());
		rs = rs * 37 + ((cAcctprocessorlogId == null) ? 0 : cAcctprocessorlogId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CAcctprocessorlogPK other = (CAcctprocessorlogPK) obj;
		return ((cAcctprocessorId == null && other.cAcctprocessorId == null)
			|| (cAcctprocessorId != null && cAcctprocessorId.equals(other.cAcctprocessorId)))
			&& ((cAcctprocessorlogId == null && other.cAcctprocessorlogId == null)
			|| (cAcctprocessorlogId != null && cAcctprocessorlogId.equals(other.cAcctprocessorlogId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctprocessorId = null;
		else
			cAcctprocessorId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctprocessorlogId = null;
		else
			cAcctprocessorlogId = new Integer(str);
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