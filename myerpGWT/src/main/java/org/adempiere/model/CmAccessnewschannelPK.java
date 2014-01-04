package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.CmAccessnewschannel
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CmAccessnewschannelPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.CmAccessnewschannel"); }
		catch(Exception e) {}
	}

	public Integer cmAccessprofileId;
	public Integer cmNewschannelId;

	public CmAccessnewschannelPK() {
	}

	public CmAccessnewschannelPK(String str) {
		fromString(str);
	}

	public Integer getCmAccessprofileId() {
		return cmAccessprofileId;
	}

	public void setCmAccessprofileId(Integer cmAccessprofileId) {
		this.cmAccessprofileId = cmAccessprofileId;
	}

	public Integer getCmNewschannelId() {
		return cmNewschannelId;
	}

	public void setCmNewschannelId(Integer cmNewschannelId) {
		this.cmNewschannelId = cmNewschannelId;
	}

	public String toString() {
		return String.valueOf(cmAccessprofileId)
			+ "::" + String.valueOf(cmNewschannelId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((cmAccessprofileId == null) ? 0 : cmAccessprofileId.hashCode());
		rs = rs * 37 + ((cmNewschannelId == null) ? 0 : cmNewschannelId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		CmAccessnewschannelPK other = (CmAccessnewschannelPK) obj;
		return ((cmAccessprofileId == null && other.cmAccessprofileId == null)
			|| (cmAccessprofileId != null && cmAccessprofileId.equals(other.cmAccessprofileId)))
			&& ((cmNewschannelId == null && other.cmNewschannelId == null)
			|| (cmNewschannelId != null && cmNewschannelId.equals(other.cmNewschannelId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cmAccessprofileId = null;
		else
			cmAccessprofileId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			cmNewschannelId = null;
		else
			cmNewschannelId = new Integer(str);
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