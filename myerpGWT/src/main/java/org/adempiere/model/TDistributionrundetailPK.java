package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.TDistributionrundetail
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class TDistributionrundetailPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.TDistributionrundetail"); }
		catch(Exception e) {}
	}

	public Integer mDistributionlistId;
	public Integer mDistributionlistlineId;
	public Integer mDistributionrunId;
	public Integer mDistributionrunlineId;

	public TDistributionrundetailPK() {
	}

	public TDistributionrundetailPK(String str) {
		fromString(str);
	}

	public Integer getMDistributionlistId() {
		return mDistributionlistId;
	}

	public void setMDistributionlistId(Integer mDistributionlistId) {
		this.mDistributionlistId = mDistributionlistId;
	}

	public Integer getMDistributionlistlineId() {
		return mDistributionlistlineId;
	}

	public void setMDistributionlistlineId(Integer mDistributionlistlineId) {
		this.mDistributionlistlineId = mDistributionlistlineId;
	}

	public Integer getMDistributionrunId() {
		return mDistributionrunId;
	}

	public void setMDistributionrunId(Integer mDistributionrunId) {
		this.mDistributionrunId = mDistributionrunId;
	}

	public Integer getMDistributionrunlineId() {
		return mDistributionrunlineId;
	}

	public void setMDistributionrunlineId(Integer mDistributionrunlineId) {
		this.mDistributionrunlineId = mDistributionrunlineId;
	}

	public String toString() {
		return String.valueOf(mDistributionlistId)
			+ "::" + String.valueOf(mDistributionlistlineId)
			+ "::" + String.valueOf(mDistributionrunId)
			+ "::" + String.valueOf(mDistributionrunlineId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mDistributionlistId == null) ? 0 : mDistributionlistId.hashCode());
		rs = rs * 37 + ((mDistributionlistlineId == null) ? 0 : mDistributionlistlineId.hashCode());
		rs = rs * 37 + ((mDistributionrunId == null) ? 0 : mDistributionrunId.hashCode());
		rs = rs * 37 + ((mDistributionrunlineId == null) ? 0 : mDistributionrunlineId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		TDistributionrundetailPK other = (TDistributionrundetailPK) obj;
		return ((mDistributionlistId == null && other.mDistributionlistId == null)
			|| (mDistributionlistId != null && mDistributionlistId.equals(other.mDistributionlistId)))
			&& ((mDistributionlistlineId == null && other.mDistributionlistlineId == null)
			|| (mDistributionlistlineId != null && mDistributionlistlineId.equals(other.mDistributionlistlineId)))
			&& ((mDistributionrunId == null && other.mDistributionrunId == null)
			|| (mDistributionrunId != null && mDistributionrunId.equals(other.mDistributionrunId)))
			&& ((mDistributionrunlineId == null && other.mDistributionrunlineId == null)
			|| (mDistributionrunlineId != null && mDistributionrunlineId.equals(other.mDistributionrunlineId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mDistributionlistId = null;
		else
			mDistributionlistId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mDistributionlistlineId = null;
		else
			mDistributionlistlineId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mDistributionrunId = null;
		else
			mDistributionrunId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mDistributionrunlineId = null;
		else
			mDistributionrunlineId = new Integer(str);
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