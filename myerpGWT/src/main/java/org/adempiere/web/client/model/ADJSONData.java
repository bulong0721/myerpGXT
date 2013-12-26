package org.adempiere.web.client.model;


public class ADJSONData implements IsADRPCModel {
	private String				data;
	private long				totalCount;
	private int					offset;

	public ADJSONData() {
	}

	public ADJSONData(String data) {
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
