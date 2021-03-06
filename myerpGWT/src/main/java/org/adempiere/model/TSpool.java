package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_spool")
@IdClass(org.adempiere.model.TSpoolPK.class)
public class TSpool extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDPInstanceID;
	private String msgText;
	private Integer seqNo;

	public TSpool() {
	}

	public TSpool(Integer aDPInstanceID, Integer seqNo) {
		this.aDPInstanceID = aDPInstanceID;
		this.seqNo = seqNo;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getADPInstanceID() {
		return aDPInstanceID;
	}

	public void setADPInstanceID(Integer aDPInstanceID) {
		this.aDPInstanceID = aDPInstanceID;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getMsgText() {
		return msgText;
	}

	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	@Id
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
}