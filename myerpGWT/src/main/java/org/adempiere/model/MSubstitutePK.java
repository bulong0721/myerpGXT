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

	public Integer mProductId;
	public Integer substituteId;

	public MSubstitutePK() {
	}

	public MSubstitutePK(String str) {
		fromString(str);
	}

	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	public Integer getSubstituteId() {
		return substituteId;
	}

	public void setSubstituteId(Integer substituteId) {
		this.substituteId = substituteId;
	}

	public String toString() {
		return String.valueOf(mProductId)
			+ "::" + String.valueOf(substituteId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mProductId == null) ? 0 : mProductId.hashCode());
		rs = rs * 37 + ((substituteId == null) ? 0 : substituteId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MSubstitutePK other = (MSubstitutePK) obj;
		return ((mProductId == null && other.mProductId == null)
			|| (mProductId != null && mProductId.equals(other.mProductId)))
			&& ((substituteId == null && other.substituteId == null)
			|| (substituteId != null && substituteId.equals(other.substituteId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mProductId = null;
		else
			mProductId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			substituteId = null;
		else
			substituteId = new Integer(str);
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