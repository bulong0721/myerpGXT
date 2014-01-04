package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdRoleIncluded
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdRoleIncludedPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdRoleIncluded"); }
		catch(Exception e) {}
	}

	public Integer adRoleId;
	public Integer includedRoleId;

	public AdRoleIncludedPK() {
	}

	public AdRoleIncludedPK(String str) {
		fromString(str);
	}

	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	public Integer getIncludedRoleId() {
		return includedRoleId;
	}

	public void setIncludedRoleId(Integer includedRoleId) {
		this.includedRoleId = includedRoleId;
	}

	public String toString() {
		return String.valueOf(adRoleId)
			+ "::" + String.valueOf(includedRoleId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((adRoleId == null) ? 0 : adRoleId.hashCode());
		rs = rs * 37 + ((includedRoleId == null) ? 0 : includedRoleId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdRoleIncludedPK other = (AdRoleIncludedPK) obj;
		return ((adRoleId == null && other.adRoleId == null)
			|| (adRoleId != null && adRoleId.equals(other.adRoleId)))
			&& ((includedRoleId == null && other.includedRoleId == null)
			|| (includedRoleId != null && includedRoleId.equals(other.includedRoleId)));
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
			includedRoleId = null;
		else
			includedRoleId = new Integer(str);
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