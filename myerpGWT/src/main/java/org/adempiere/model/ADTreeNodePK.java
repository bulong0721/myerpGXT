package org.adempiere.model;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: org.adempiere.model.ADTreeNode
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class ADTreeNodePK implements Serializable {
	static {
		// register persistent class in JVM
		try { Class.forName("org.adempiere.model.ADTreeNode"); }
		catch(Exception e) {}
	}

	public Integer aDTreeID;
	public Integer nodeID;

	public ADTreeNodePK() {
	}

	public ADTreeNodePK(String str) {
		fromString(str);
	}

	public Integer getADTreeID() {
		return aDTreeID;
	}

	public void setADTreeID(Integer aDTreeID) {
		this.aDTreeID = aDTreeID;
	}

	public Integer getNodeID() {
		return nodeID;
	}

	public void setNodeID(Integer nodeID) {
		this.nodeID = nodeID;
	}

	public String toString() {
		return String.valueOf(aDTreeID)
			+ "::" + String.valueOf(nodeID);
	}

	public int hashCode() {
		int rs = 17;
		rs = rs * 37 + ((aDTreeID == null) ? 0 : aDTreeID.hashCode());
		rs = rs * 37 + ((nodeID == null) ? 0 : nodeID.hashCode());
		return rs;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;

		ADTreeNodePK other = (ADTreeNodePK) obj;
		return ((aDTreeID == null && other.aDTreeID == null)
			|| (aDTreeID != null && aDTreeID.equals(other.aDTreeID)))
			&& ((nodeID == null && other.nodeID == null)
			|| (nodeID != null && nodeID.equals(other.nodeID)));
	}

	private void fromString(String str) {
		Tokenizer toke = new Tokenizer(str);
		str = toke.nextToken();
		if("null".equals(str))
			aDTreeID = null;
		else
			aDTreeID = new Integer(str);
		str = toke.nextToken();
		if("null".equals(str))
			nodeID = null;
		else
			nodeID = new Integer(str);
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