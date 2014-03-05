package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="b_bidcomment")
@IdClass(org.adempiere.model.BBidCommentPK.class)
public class BBidComment extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Boolean active;
	private Integer bBidCommentID;
	private Integer bTopicID;
	private String created;
	private Integer createdBy;
	private String textMsg;
	private String updated;
	private Integer updatedBy;

	public BBidComment() {
	}

	public BBidComment(Integer bBidCommentID, Integer bTopicID) {
		this.bBidCommentID = bBidCommentID;
		this.bTopicID = bTopicID;
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
	@Column(name="B_BIDCOMMENT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_860", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "B_BidComment", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_860")
	public Integer getBBidCommentID() {
		return bBidCommentID;
	}

	public void setBBidCommentID(Integer bBidCommentID) {
		this.bBidCommentID = bBidCommentID;
	}

	@Id
	@Column(name="B_TOPIC_ID", columnDefinition="INT")
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
	@Column(nullable=false, length=2000)
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
}