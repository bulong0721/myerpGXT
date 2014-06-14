package org.adempiere.web.client.model;

public class SequenceModel implements GwtSerializable {
	private String	name;
	private Integer	seqNo;
	private Integer	seqID;

	public SequenceModel() {
	}

	public SequenceModel(Integer seqID, String name, Integer seqNo) {
		this.seqID = seqID;
		this.name = name;
		this.seqNo = seqNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public Integer getSeqID() {
		return seqID;
	}

	public void setSeqID(Integer seqID) {
		this.seqID = seqID;
	}

}
