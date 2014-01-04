package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CBpVendorAcct
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CBpVendorAcctPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CBpVendorAcct"); }
		catch(Exception e) {}
	}

	public Integer cAcctschemaId;
	public Integer cBpartnerId;

	public CBpVendorAcctPK() {
	}

	public CBpVendorAcctPK(String str) {
		fromString(str);
	}

	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	public String toString() {
		return String.valueOf(cAcctschemaId)
			+ "::" + String.valueOf(cBpartnerId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cAcctschemaId == null) ? 0 : cAcctschemaId.hashCode());
		rs = rs * 37 + ((cBpartnerId == null) ? 0 : cBpartnerId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CBpVendorAcctPK other = (CBpVendorAcctPK) obj;
		return ((cAcctschemaId == null && other.cAcctschemaId == null)
			|| (cAcctschemaId != null && cAcctschemaId.equals(other.cAcctschemaId)))
			&& ((cBpartnerId == null && other.cBpartnerId == null)
			|| (cBpartnerId != null && cBpartnerId.equals(other.cBpartnerId)));
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
			cBpartnerId = null;
		else
			cBpartnerId = new Integer(str);
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