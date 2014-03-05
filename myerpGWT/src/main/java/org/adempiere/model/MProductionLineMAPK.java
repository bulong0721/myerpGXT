package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MProductionLineMA
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MProductionLineMAPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MProductionLineMA"); }
		catch(Exception e) {}
	}

	public Integer mAttributeSetInstanceID;
	public Integer mProductionLineID;

	public MProductionLineMAPK() {
	}

	public MProductionLineMAPK(String str) {
		fromString(str);
	}

	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	public Integer getMProductionLineID() {
		return mProductionLineID;
	}

	public void setMProductionLineID(Integer mProductionLineID) {
		this.mProductionLineID = mProductionLineID;
	}

	public String toString() {
		return String.valueOf(mAttributeSetInstanceID)
			+ "::" + String.valueOf(mProductionLineID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((mAttributeSetInstanceID == null) ? 0 : mAttributeSetInstanceID.hashCode());
		rs = rs * 37 + ((mProductionLineID == null) ? 0 : mProductionLineID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MProductionLineMAPK other = (MProductionLineMAPK) obj;
		return ((mAttributeSetInstanceID == null && other.mAttributeSetInstanceID == null)
			|| (mAttributeSetInstanceID != null && mAttributeSetInstanceID.equals(other.mAttributeSetInstanceID)))
			&& ((mProductionLineID == null && other.mProductionLineID == null)
			|| (mProductionLineID != null && mProductionLineID.equals(other.mProductionLineID)));
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
			mProductionLineID = null;
		else
			mProductionLineID = new Integer(str);
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