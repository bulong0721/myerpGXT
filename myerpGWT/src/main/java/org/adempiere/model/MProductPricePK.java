package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MProductPrice
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MProductPricePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MProductPrice"); }
		catch(Exception e) {}
	}

	public Integer mPriceListVersionID;
	public Integer mProductID;

	public MProductPricePK() {
	}

	public MProductPricePK(String str) {
		fromString(str);
	}

	public Integer getMPriceListVersionID() {
		return mPriceListVersionID;
	}

	public void setMPriceListVersionID(Integer mPriceListVersionID) {
		this.mPriceListVersionID = mPriceListVersionID;
	}

	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	public String toString() {
		return String.valueOf(mPriceListVersionID)
			+ "::" + String.valueOf(mProductID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mPriceListVersionID == null) ? 0 : mPriceListVersionID.hashCode());
		rs = rs * 37 + ((mProductID == null) ? 0 : mProductID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MProductPricePK other = (MProductPricePK) obj;
		return ((mPriceListVersionID == null && other.mPriceListVersionID == null)
			|| (mPriceListVersionID != null && mPriceListVersionID.equals(other.mPriceListVersionID)))
			&& ((mProductID == null && other.mProductID == null)
			|| (mProductID != null && mProductID.equals(other.mProductID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mPriceListVersionID = null;
		else
			mPriceListVersionID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mProductID = null;
		else
			mProductID = new Integer(str);
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