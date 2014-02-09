package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdTaskAccess
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdTaskAccessPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdTaskAccess"); }
		catch(Exception e) {}
	}

	public Integer adRoleId;
	public Integer adTaskId;

	public AdTaskAccessPK() {
	}

	public AdTaskAccessPK(String str) {
		fromString(str);
	}

	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	public Integer getAdTaskId() {
		return adTaskId;
	}

	public void setAdTaskId(Integer adTaskId) {
		this.adTaskId = adTaskId;
	}

	public String toString() {
		return String.valueOf(adRoleId)
			+ "::" + String.valueOf(adTaskId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((adRoleId == null) ? 0 : adRoleId.hashCode());
		rs = rs * 37 + ((adTaskId == null) ? 0 : adTaskId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdTaskAccessPK other = (AdTaskAccessPK) obj;
		return ((adRoleId == null && other.adRoleId == null)
			|| (adRoleId != null && adRoleId.equals(other.adRoleId)))
			&& ((adTaskId == null && other.adTaskId == null)
			|| (adTaskId != null && adTaskId.equals(other.adTaskId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adRoleId = null;
		else
			adRoleId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adTaskId = null;
		else
			adTaskId = new Integer(str);
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