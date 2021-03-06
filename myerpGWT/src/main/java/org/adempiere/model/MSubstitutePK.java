package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MSubstitute
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MSubstitutePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MSubstitute"); }
		catch(Exception e) {}
	}

	public Integer mProductID;
	public Integer substituteID;

	public MSubstitutePK() {
	}

	public MSubstitutePK(String str) {
		fromString(str);
	}

	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	public Integer getSubstituteID() {
		return substituteID;
	}

	public void setSubstituteID(Integer substituteID) {
		this.substituteID = substituteID;
	}

	public String toString() {
		return String.valueOf(mProductID)
			+ "::" + String.valueOf(substituteID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mProductID == null) ? 0 : mProductID.hashCode());
		rs = rs * 37 + ((substituteID == null) ? 0 : substituteID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MSubstitutePK other = (MSubstitutePK) obj;
		return ((mProductID == null && other.mProductID == null)
			|| (mProductID != null && mProductID.equals(other.mProductID)))
			&& ((substituteID == null && other.substituteID == null)
			|| (substituteID != null && substituteID.equals(other.substituteID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mProductID = null;
		else
			mProductID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			substituteID = null;
		else
			substituteID = new Integer(str);
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