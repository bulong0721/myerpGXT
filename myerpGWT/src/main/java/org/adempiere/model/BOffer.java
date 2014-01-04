package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="b_offer")
public class BOffer extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private Integer bOfferId;
	private Integer bSellerfundsId;
	private Integer bTopicId;
	private String created;
	private Integer createdby;
	private String isactive;
	private String iswillingtocommit;
	private String name;
	private String privatenote;
	private String textmsg;
	private String updated;
	private Integer updatedby;

	public BOffer() {
	}

	public BOffer(Integer bOfferId) {
		this.bOfferId = bOfferId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_USER_ID", nullable=false)
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Id
	@Column(name="B_OFFER_ID")
	public Integer getBOfferId() {
		return bOfferId;
	}

	public void setBOfferId(Integer bOfferId) {
		this.bOfferId = bOfferId;
	}

	@Basic
	@Column(name="B_SELLERFUNDS_ID", nullable=false)
	public Integer getBSellerfundsId() {
		return bSellerfundsId;
	}

	public void setBSellerfundsId(Integer bSellerfundsId) {
		this.bSellerfundsId = bSellerfundsId;
	}

	@Basic
	@Column(name="B_TOPIC_ID", nullable=false)
	public Integer getBTopicId() {
		return bTopicId;
	}

	public void setBTopicId(Integer bTopicId) {
		this.bTopicId = bTopicId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIswillingtocommit() {
		return iswillingtocommit;
	}

	public void setIswillingtocommit(String iswillingtocommit) {
		this.iswillingtocommit = iswillingtocommit;
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
	public String getPrivatenote() {
		return privatenote;
	}

	public void setPrivatenote(String privatenote) {
		this.privatenote = privatenote;
	}

	@Basic
	@Column(length=2000)
	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}