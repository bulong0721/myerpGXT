package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.AdTreenodecms
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class AdTreenodecmsPK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.AdTreenodecms"); }
		catch(Exception e) {}
	}

	public Integer adTreeId;
	public Integer nodeId;

	public AdTreenodecmsPK() {
	}

	public AdTreenodecmsPK(String str) {
		fromString(str);
	}

	public Integer getAdTreeId() {
		return adTreeId;
	}

	public void setAdTreeId(Integer adTreeId) {
		this.adTreeId = adTreeId;
	}

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public String toString() {
		return String.valueOf(adTreeId)
			+ "::" + String.valueOf(nodeId);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((adTreeId == null) ? 0 : adTreeId.hashCode());
		rs = rs * 37 + ((nodeId == null) ? 0 : nodeId.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		AdTreenodecmsPK other = (AdTreenodecmsPK) obj;
		return ((adTreeId == null && other.adTreeId == null)
			|| (adTreeId != null && adTreeId.equals(other.adTreeId)))
			&& ((nodeId == null && other.nodeId == null)
			|| (nodeId != null && nodeId.equals(other.nodeId)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			adTreeId = null;
		else
			adTreeId = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			nodeId = null;
		else
			nodeId = new Integer(str);
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