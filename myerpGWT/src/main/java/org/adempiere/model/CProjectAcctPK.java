package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CProjectAcct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CProjectAcctPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CProjectAcct"); }
		catch(Exception e) {}
	}

	public Integer cAcctschemaId;
	public Integer cProjectId;

	public CProjectAcctPK() {
	}

	public CProjectAcctPK(String str) {
		fromString(str);
	}

	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	public String toString() {
		return String.valueOf(cAcctschemaId)
			+ "::" + String.valueOf(cProjectId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctschemaId == null) ? 0 : cAcctschemaId.hashCode());
		rs = rs * 37 + ((cProjectId == null) ? 0 : cProjectId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CProjectAcctPK other = (CProjectAcctPK) obj;
		return ((cAcctschemaId == null && other.cAcctschemaId == null)
			|| (cAcctschemaId != null && cAcctschemaId.equals(other.cAcctschemaId)))
			&& ((cProjectId == null && other.cProjectId == null)
			|| (cProjectId != null && cProjectId.equals(other.cProjectId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cAcctschemaId = null;
		else
			cAcctschemaId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cProjectId = null;
		else
			cProjectId = new Integer(str);
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