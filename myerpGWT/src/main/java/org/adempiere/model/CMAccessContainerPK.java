package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CMAccessContainer
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CMAccessContainerPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CMAccessContainer"); }
		catch(Exception e) {}
	}

	public Integer cMAccessProfileID;
	public Integer cMContainerID;

	public CMAccessContainerPK() {
	}

	public CMAccessContainerPK(String str) {
		fromString(str);
	}

	public Integer getCMAccessProfileID() {
		return cMAccessProfileID;
	}

	public void setCMAccessProfileID(Integer cMAccessProfileID) {
		this.cMAccessProfileID = cMAccessProfileID;
	}

	public Integer getCMContainerID() {
		return cMContainerID;
	}

	public void setCMContainerID(Integer cMContainerID) {
		this.cMContainerID = cMContainerID;
	}

	public String toString() {
		return String.valueOf(cMAccessProfileID)
			+ "::" + String.valueOf(cMContainerID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cMAccessProfileID == null) ? 0 : cMAccessProfileID.hashCode());
		rs = rs * 37 + ((cMContainerID == null) ? 0 : cMContainerID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CMAccessContainerPK other = (CMAccessContainerPK) obj;
		return ((cMAccessProfileID == null && other.cMAccessProfileID == null)
			|| (cMAccessProfileID != null && cMAccessProfileID.equals(other.cMAccessProfileID)))
			&& ((cMContainerID == null && other.cMContainerID == null)
			|| (cMContainerID != null && cMContainerID.equals(other.cMContainerID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cMAccessProfileID = null;
		else
			cMAccessProfileID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cMContainerID = null;
		else
			cMContainerID = new Integer(str);
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