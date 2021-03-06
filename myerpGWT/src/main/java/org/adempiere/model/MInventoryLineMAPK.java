package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MInventoryLineMA
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MInventoryLineMAPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MInventoryLineMA"); }
		catch(Exception e) {}
	}

	public Integer mAttributeSetInstanceID;
	public Integer mInventoryLineID;

	public MInventoryLineMAPK() {
	}

	public MInventoryLineMAPK(String str) {
		fromString(str);
	}

	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	public Integer getMInventoryLineID() {
		return mInventoryLineID;
	}

	public void setMInventoryLineID(Integer mInventoryLineID) {
		this.mInventoryLineID = mInventoryLineID;
	}

	public String toString() {
		return String.valueOf(mAttributeSetInstanceID)
			+ "::" + String.valueOf(mInventoryLineID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mAttributeSetInstanceID == null) ? 0 : mAttributeSetInstanceID.hashCode());
		rs = rs * 37 + ((mInventoryLineID == null) ? 0 : mInventoryLineID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MInventoryLineMAPK other = (MInventoryLineMAPK) obj;
		return ((mAttributeSetInstanceID == null && other.mAttributeSetInstanceID == null)
			|| (mAttributeSetInstanceID != null && mAttributeSetInstanceID.equals(other.mAttributeSetInstanceID)))
			&& ((mInventoryLineID == null && other.mInventoryLineID == null)
			|| (mInventoryLineID != null && mInventoryLineID.equals(other.mInventoryLineID)));
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
			mInventoryLineID = null;
		else
			mInventoryLineID = new Integer(str);
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