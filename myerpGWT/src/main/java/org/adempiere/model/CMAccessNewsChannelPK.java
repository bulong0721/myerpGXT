package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CMAccessNewsChannel
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CMAccessNewsChannelPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CMAccessNewsChannel"); }
		catch(Exception e) {}
	}

	public Integer cMAccessProfileID;
	public Integer cMNewsChannelID;

	public CMAccessNewsChannelPK() {
	}

	public CMAccessNewsChannelPK(String str) {
		fromString(str);
	}

	public Integer getCMAccessProfileID() {
		return cMAccessProfileID;
	}

	public void setCMAccessProfileID(Integer cMAccessProfileID) {
		this.cMAccessProfileID = cMAccessProfileID;
	}

	public Integer getCMNewsChannelID() {
		return cMNewsChannelID;
	}

	public void setCMNewsChannelID(Integer cMNewsChannelID) {
		this.cMNewsChannelID = cMNewsChannelID;
	}

	public String toString() {
		return String.valueOf(cMAccessProfileID)
			+ "::" + String.valueOf(cMNewsChannelID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cMAccessProfileID == null) ? 0 : cMAccessProfileID.hashCode());
		rs = rs * 37 + ((cMNewsChannelID == null) ? 0 : cMNewsChannelID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CMAccessNewsChannelPK other = (CMAccessNewsChannelPK) obj;
		return ((cMAccessProfileID == null && other.cMAccessProfileID == null)
			|| (cMAccessProfileID != null && cMAccessProfileID.equals(other.cMAccessProfileID)))
			&& ((cMNewsChannelID == null && other.cMNewsChannelID == null)
			|| (cMNewsChannelID != null && cMNewsChannelID.equals(other.cMNewsChannelID)));
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
			cMNewsChannelID = null;
		else
			cMNewsChannelID = new Integer(str);
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