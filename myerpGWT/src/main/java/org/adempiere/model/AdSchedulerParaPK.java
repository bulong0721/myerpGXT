package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdSchedulerPara
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdSchedulerParaPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdSchedulerPara"); }
		catch(Exception e) {}
	}

	public Integer adProcessParaId;
	public Integer adSchedulerId;

	public AdSchedulerParaPK() {
	}

	public AdSchedulerParaPK(String str) {
		fromString(str);
	}

	public Integer getAdProcessParaId() {
		return adProcessParaId;
	}

	public void setAdProcessParaId(Integer adProcessParaId) {
		this.adProcessParaId = adProcessParaId;
	}

	public Integer getAdSchedulerId() {
		return adSchedulerId;
	}

	public void setAdSchedulerId(Integer adSchedulerId) {
		this.adSchedulerId = adSchedulerId;
	}

	public String toString() {
		return String.valueOf(adProcessParaId)
			+ "::" + String.valueOf(adSchedulerId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((adProcessParaId == null) ? 0 : adProcessParaId.hashCode());
		rs = rs * 37 + ((adSchedulerId == null) ? 0 : adSchedulerId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdSchedulerParaPK other = (AdSchedulerParaPK) obj;
		return ((adProcessParaId == null && other.adProcessParaId == null)
			|| (adProcessParaId != null && adProcessParaId.equals(other.adProcessParaId)))
			&& ((adSchedulerId == null && other.adSchedulerId == null)
			|| (adSchedulerId != null && adSchedulerId.equals(other.adSchedulerId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adProcessParaId = null;
		else
			adProcessParaId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adSchedulerId = null;
		else
			adSchedulerId = new Integer(str);
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