package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.RContactInterest
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class RContactInterestPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.RContactInterest"); }
		catch(Exception e) {}
	}

	public Integer aDUserID;
	public Integer rInterestAreaID;

	public RContactInterestPK() {
	}

	public RContactInterestPK(String str) {
		fromString(str);
	}

	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	public Integer getRInterestAreaID() {
		return rInterestAreaID;
	}

	public void setRInterestAreaID(Integer rInterestAreaID) {
		this.rInterestAreaID = rInterestAreaID;
	}

	public String toString() {
		return String.valueOf(aDUserID)
			+ "::" + String.valueOf(rInterestAreaID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDUserID == null) ? 0 : aDUserID.hashCode());
		rs = rs * 37 + ((rInterestAreaID == null) ? 0 : rInterestAreaID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		RContactInterestPK other = (RContactInterestPK) obj;
		return ((aDUserID == null && other.aDUserID == null)
			|| (aDUserID != null && aDUserID.equals(other.aDUserID)))
			&& ((rInterestAreaID == null && other.rInterestAreaID == null)
			|| (rInterestAreaID != null && rInterestAreaID.equals(other.rInterestAreaID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDUserID = null;
		else
			aDUserID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			rInterestAreaID = null;
		else
			rInterestAreaID = new Integer(str);
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