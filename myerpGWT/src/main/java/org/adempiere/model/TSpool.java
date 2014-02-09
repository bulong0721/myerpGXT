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
	private Integer adPinstanceId;
	private String msgtext;
	private Integer seqno;

	public TSpool() {
	}

	public TSpool(Integer adPinstanceId, Integer seqno) {
		this.adPinstanceId = adPinstanceId;
		this.seqno = seqno;
	}

	@Id
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getMsgtext() {
		return msgtext;
	}

	public void setMsgtext(String msgtext) {
		this.msgtext = msgtext;
	}

	@Id
	@Column(columnDefinition="INT")
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}
}