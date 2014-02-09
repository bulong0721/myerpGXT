package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ARegistrationvalue
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ARegistrationvaluePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ARegistrationvalue"); }
		catch(Exception e) {}
	}

	public Integer aRegistrationId;
	public Integer aRegistrationattributeId;

	public ARegistrationvaluePK() {
	}

	public ARegistrationvaluePK(String str) {
		fromString(str);
	}

	public Integer getARegistrationId() {
		return aRegistrationId;
	}

	public void setARegistrationId(Integer aRegistrationId) {
		this.aRegistrationId = aRegistrationId;
	}

	public Integer getARegistrationattributeId() {
		return aRegistrationattributeId;
	}

	public void setARegistrationattributeId(Integer aRegistrationattributeId) {
		this.aRegistrationattributeId = aRegistrationattributeId;
	}

	public String toString() {
		return String.valueOf(aRegistrationId)
			+ "::" + String.valueOf(aRegistrationattributeId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aRegistrationId == null) ? 0 : aRegistrationId.hashCode());
		rs = rs * 37 + ((aRegistrationattributeId == null) ? 0 : aRegistrationattributeId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ARegistrationvaluePK other = (ARegistrationvaluePK) obj;
		return ((aRegistrationId == null && other.aRegistrationId == null)
			|| (aRegistrationId != null && aRegistrationId.equals(other.aRegistrationId)))
			&& ((aRegistrationattributeId == null && other.aRegistrationattributeId == null)
			|| (aRegistrationattributeId != null && aRegistrationattributeId.equals(other.aRegistrationattributeId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aRegistrationId = null;
		else
			aRegistrationId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aRegistrationattributeId = null;
		else
			aRegistrationattributeId = new Integer(str);
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