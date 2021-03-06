package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CInvoiceTax
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CInvoiceTaxPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CInvoiceTax"); }
		catch(Exception e) {}
	}

	public Integer cInvoiceID;
	public Integer cTaxID;

	public CInvoiceTaxPK() {
	}

	public CInvoiceTaxPK(String str) {
		fromString(str);
	}

	public Integer getCInvoiceID() {
		return cInvoiceID;
	}

	public void setCInvoiceID(Integer cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
	}

	public Integer getCTaxID() {
		return cTaxID;
	}

	public void setCTaxID(Integer cTaxID) {
		this.cTaxID = cTaxID;
	}

	public String toString() {
		return String.valueOf(cInvoiceID)
			+ "::" + String.valueOf(cTaxID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cInvoiceID == null) ? 0 : cInvoiceID.hashCode());
		rs = rs * 37 + ((cTaxID == null) ? 0 : cTaxID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CInvoiceTaxPK other = (CInvoiceTaxPK) obj;
		return ((cInvoiceID == null && other.cInvoiceID == null)
			|| (cInvoiceID != null && cInvoiceID.equals(other.cInvoiceID)))
			&& ((cTaxID == null && other.cTaxID == null)
			|| (cTaxID != null && cTaxID.equals(other.cTaxID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cInvoiceID = null;
		else
			cInvoiceID = new Integer(str);
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