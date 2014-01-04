package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_promotionprecondition")
public class MPromotionprecondition extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cActivityId;
	private Integer cBpGroupId;
	private Integer cBpartnerId;
	private String created;
	private Integer createdby;
	private String enddate;
	private String isactive;
	private Integer mPricelistId;
	private Integer mPromotionId;
	private Integer mPromotionpreconditionId;
	private Integer mWarehouseId;
	private String promotioncode;
	private Integer promotioncounter;
	private Integer promotionusagelimit;
	private Integer seqno;
	private String startdate;
	private String updated;
	private Integer updatedby;

	public MPromotionprecondition() {
	}

	public MPromotionprecondition(Integer mPromotionpreconditionId) {
		this.mPromotionpreconditionId = mPromotionpreconditionId;
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
	@Column(name="C_ACTIVITY_ID")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BP_GROUP_ID")
	public Integer getCBpGroupId() {
		return cBpGroupId;
	}

	public void setCBpGroupId(Integer cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
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
	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
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
	@Column(name="M_PRICELIST_ID")
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Basic
	@Column(name="M_PROMOTION_ID", nullable=false)
	public Integer getMPromotionId() {
		return mPromotionId;
	}

	public void setMPromotionId(Integer mPromotionId) {
		this.mPromotionId = mPromotionId;
	}

	@Id
	@Column(name="M_PROMOTIONPRECONDITION_ID")
	public Integer getMPromotionpreconditionId() {
		return mPromotionpreconditionId;
	}

	public void setMPromotionpreconditionId(Integer mPromotionpreconditionId) {
		this.mPromotionpreconditionId = mPromotionpreconditionId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID")
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(length=30)
	public String getPromotioncode() {
		return promotioncode;
	}

	public void setPromotioncode(String promotioncode) {
		this.promotioncode = promotioncode;
	}

	@Basic
	public Integer getPromotioncounter() {
		return promotioncounter;
	}

	public void setPromotioncounter(Integer promotioncounter) {
		this.promotioncounter = promotioncounter;
	}

	@Basic
	public Integer getPromotionusagelimit() {
		return promotionusagelimit;
	}

	public void setPromotionusagelimit(Integer promotionusagelimit) {
		this.promotionusagelimit = promotionusagelimit;
	}

	@Basic
	@Column(nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(nullable=false)
	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
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