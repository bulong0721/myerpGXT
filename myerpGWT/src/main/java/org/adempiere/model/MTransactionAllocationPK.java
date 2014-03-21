package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.MTransactionAllocation
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class MTransactionAllocationPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.MTransactionAllocation"); }
		catch(Exception e) {}
	}

	public String allocationStrategyType;
	public Integer mTransactionID;

	public MTransactionAllocationPK() {
	}

	public MTransactionAllocationPK(String str) {
		fromString(str);
	}

	public String getAllocationStrategyType() {
		return allocationStrategyType;
	}

	public void setAllocationStrategyType(String allocationStrategyType) {
		this.allocationStrategyType = allocationStrategyType;
	}

	public Integer getMTransactionID() {
		return mTransactionID;
	}

	public void setMTransactionID(Integer mTransactionID) {
		this.mTransactionID = mTransactionID;
	}

	public String toString() {
		return allocationStrategyType
			+ "::" + String.valueOf(mTransactionID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((allocationStrategyType == null) ? 0 : allocationStrategyType.hashCode());
		rs = rs * 37 + ((mTransactionID == null) ? 0 : mTransactionID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		MTransactionAllocationPK other = (MTransactionAllocationPK) obj;
		return ((allocationStrategyType == null && other.allocationStrategyType == null)
			|| (allocationStrategyType != null && allocationStrategyType.equals(other.allocationStrategyType)))
			&& ((mTransactionID == null && other.mTransactionID == null)
			|| (mTransactionID != null && mTransactionID.equals(other.mTransactionID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			allocationStrategyType = null;
		else
			allocationStrategyType = str;
		str = toke.nextToken();
		if("null".equals(str))
			mTransactionID = null;
		else
			mTransactionID = new Integer(str);
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