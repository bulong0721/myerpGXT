package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdTableAccess
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdTableAccessPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdTableAccess"); }
		catch(Exception e) {}
	}

	public String accesstyperule;
	public Integer adRoleId;
	public Integer adTableId;

	public AdTableAccessPK() {
	}

	public AdTableAccessPK(String str) {
		fromString(str);
	}

	public String getAccesstyperule() {
		return accesstyperule;
	}

	public void setAccesstyperule(String accesstyperule) {
		this.accesstyperule = accesstyperule;
	}

	public Integer getAdRoleId() {
		return adRoleId;
	}

	public void setAdRoleId(Integer adRoleId) {
		this.adRoleId = adRoleId;
	}

	public Integer getAdTableId() {
		return adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	public String toString() {
		return accesstyperule
			+ "::" + String.valueOf(adRoleId)
			+ "::" + String.valueOf(adTableId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((accesstyperule == null) ? 0 : accesstyperule.hashCode());
		rs = rs * 37 + ((adRoleId == null) ? 0 : adRoleId.hashCode());
		rs = rs * 37 + ((adTableId == null) ? 0 : adTableId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdTableAccessPK other = (AdTableAccessPK) obj;
		return ((accesstyperule == null && other.accesstyperule == null)
			|| (accesstyperule != null && accesstyperule.equals(other.accesstyperule)))
			&& ((adRoleId == null && other.adRoleId == null)
			|| (adRoleId != null && adRoleId.equals(other.adRoleId)))
			&& ((adTableId == null && other.adTableId == null)
			|| (adTableId != null && adTableId.equals(other.adTableId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			accesstyperule = null;
		else
			accesstyperule = str;
		str = toke.nextToken();
		if("null".equals(str))
			adRoleId = null;
		else
			adRoleId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adTableId = null;
		else
			adTableId = new Integer(str);
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