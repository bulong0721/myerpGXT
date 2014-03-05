package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MInOutLineMA
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MInOutLineMAPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MInOutLineMA"); }
		catch(Exception e) {}
	}

	public Integer mAttributeSetInstanceID;
	public Integer mInOutLineID;

	public MInOutLineMAPK() {
	}

	public MInOutLineMAPK(String str) {
		fromString(str);
	}

	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	public Integer getMInOutLineID() {
		return mInOutLineID;
	}

	public void setMInOutLineID(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
	}

	public String toString() {
		return String.valueOf(mAttributeSetInstanceID)
			+ "::" + String.valueOf(mInOutLineID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mAttributeSetInstanceID == null) ? 0 : mAttributeSetInstanceID.hashCode());
		rs = rs * 37 + ((mInOutLineID == null) ? 0 : mInOutLineID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MInOutLineMAPK other = (MInOutLineMAPK) obj;
		return ((mAttributeSetInstanceID == null && other.mAttributeSetInstanceID == null)
			|| (mAttributeSetInstanceID != null && mAttributeSetInstanceID.equals(other.mAttributeSetInstanceID)))
			&& ((mInOutLineID == null && other.mInOutLineID == null)
			|| (mInOutLineID != null && mInOutLineID.equals(other.mInOutLineID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mAttributeSetInstanceID = null;
		else
			mAttributeSetInstanceID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			mInOutLineID = null;
		else
			mInOutLineID = new Integer(str);
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