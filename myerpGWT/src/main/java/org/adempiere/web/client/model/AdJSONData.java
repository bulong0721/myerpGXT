package org.adempiere.web.client.model;

import java.io.Serializable;

public class AdJSONData implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				data;
	private long				totalCount;
	private int					offset;

	public AdJSONData() {
	}

	public AdJSONData(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalLength) {
		this.totalCount = totalLength;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

}
