package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.COrderTax
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class COrderTaxPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.COrderTax"); }
		catch(Exception e) {}
	}

	public Integer cOrderID;
	public Integer cTaxID;

	public COrderTaxPK() {
	}

	public COrderTaxPK(String str) {
		fromString(str);
	}

	public Integer getCOrderID() {
		return cOrderID;
	}

	public void setCOrderID(Integer cOrderID) {
		this.cOrderID = cOrderID;
	}

	public Integer getCTaxID() {
		return cTaxID;
	}

	public void setCTaxID(Integer cTaxID) {
		this.cTaxID = cTaxID;
	}

	public String toString() {
		return String.valueOf(cOrderID)
			+ "::" + String.valueOf(cTaxID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cOrderID == null) ? 0 : cOrderID.hashCode());
		rs = rs * 37 + ((cTaxID == null) ? 0 : cTaxID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		COrderTaxPK other = (COrderTaxPK) obj;
		return ((cOrderID == null && other.cOrderID == null)
			|| (cOrderID != null && cOrderID.equals(other.cOrderID)))
			&& ((cTaxID == null && other.cTaxID == null)
			|| (cTaxID != null && cTaxID.equals(other.cTaxID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cOrderID = null;
		else
			cOrderID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cTaxID = null;
		else
			cTaxID = new Integer(str);
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