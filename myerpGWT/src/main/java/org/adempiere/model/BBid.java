package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="b_bid")
public class BBid extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Boolean active;
	private Integer bBidID;
	private Integer bBuyerFundsID;
	private Integer bTopicID;
	private String created;
	private Integer createdBy;
	private String name;
	private String privateNote;
	private String textMsg;
	private String updated;
	private Integer updatedBy;
	private Boolean willingToCommit;

	public BBid() {
	}

	public BBid(Integer bBidID) {
		this.bBidID = bBidID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="AD_USER_ID", columnDefinition="INT", nullable=false)
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Id
	@Column(name="B_BID_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_861", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "B_Bid", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_861")
	public Integer getBBidID() {
		return bBidID;
	}

	public void setBBidID(Integer bBidID) {
		this.bBidID = bBidID;
	}

	@Basic
	@Column(name="B_BUYERFUNDS_ID", columnDefinition="INT", nullable=false)
	public Integer getBBuyerFundsID() {
		return bBuyerFundsID;
	}

	public void setBBuyerFundsID(Integer bBuyerFundsID) {
		this.bBuyerFundsID = bBuyerFundsID;
	}

	@Basic
	@Column(name="B_TOPIC_ID", columnDefinition="INT", nullable=false)
	public Integer getBTopicID() {
		return bTopicID;
	}

	public void setBTopicID(Integer bTopicID) {
		this.bTopicID = bTopicID;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=2000)
	public String getPrivateNote() {
		return privateNote;
	}

	public void setPrivateNote(String privateNote) {
		this.privateNote = privateNote;
	}

	@Basic
	@Column(length=2000)
	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Basic
	@Column(name="ISWILLINGTOCOMMIT", nullable=false)
	public Boolean isWillingToCommit() {
		return willingToCommit;
	}

	public void setWillingToCommit(Boolean willingToCommit) {
		this.willingToCommit = willingToCommit;
	}
}