package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_usermail")
public class ADUserMail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Integer aDUserMailID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String delivered;
	private String deliveryConfirmation;
	private String mailText;
	private String messageID;
	private Integer rMailTextID;
	private String subject;
	private String updated;
	private Integer updatedBy;
	private Integer wMailMsgID;

	public ADUserMail() {
	}

	public ADUserMail(Integer aDUserMailID) {
		this.aDUserMailID = aDUserMailID;
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

	@Id
	@Column(name="AD_USERMAIL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1116", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_UserMail", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1116")
	public Integer getADUserMailID() {
		return aDUserMailID;
	}

	public void setADUserMailID(Integer aDUserMailID) {
		this.aDUserMailID = aDUserMailID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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
	@Column(name="ISDELIVERED", length=1)
	public String getDelivered() {
		return delivered;
	}

	public void setDelivered(String delivered) {
		this.delivered = delivered;
	}

	@Basic
	@Column(length=120)
	public String getDeliveryConfirmation() {
		return deliveryConfirmation;
	}

	public void setDeliveryConfirmation(String deliveryConfirmation) {
		this.deliveryConfirmation = deliveryConfirmation;
	}

	@Basic
	@Column(length=2000)
	public String getMailText() {
		return mailText;
	}

	public void setMailText(String mailText) {
		this.mailText = mailText;
	}

	@Basic
	@Column(length=120)
	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	@Basic
	@Column(name="R_MAILTEXT_ID", columnDefinition="INT")
	public Integer getRMailTextID() {
		return rMailTextID;
	}

	public void setRMailTextID(Integer rMailTextID) {
		this.rMailTextID = rMailTextID;
	}

	@Basic
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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
	@Column(name="W_MAILMSG_ID", columnDefinition="INT")
	public Integer getWMailMsgID() {
		return wMailMsgID;
	}

	public void setWMailMsgID(Integer wMailMsgID) {
		this.wMailMsgID = wMailMsgID;
	}
}