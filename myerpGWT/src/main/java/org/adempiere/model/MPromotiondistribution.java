package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_promotiondistribution")
public class MPromotiondistribution extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String distributionsorting;
	private String distributiontype;
	private Boolean isactive;
	private Integer mPromotionId;
	private Integer mPromotiondistributionId;
	private Integer mPromotionlineId;
	private String operation;
	private BigDecimal qty;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public MPromotiondistribution() {
	}

	public MPromotiondistribution(Integer mPromotiondistributionId) {
		this.mPromotiondistributionId = mPromotiondistributionId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
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
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=1)
	public String getDistributionsorting() {
		return distributionsorting;
	}

	public void setDistributionsorting(String distributionsorting) {
		this.distributionsorting = distributionsorting;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDistributiontype() {
		return distributiontype;
	}

	public void setDistributiontype(String distributiontype) {
		this.distributiontype = distributiontype;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(name="M_PROMOTION_ID", columnDefinition="INT", nullable=false)
	public Integer getMPromotionId() {
		return mPromotionId;
	}

	public void setMPromotionId(Integer mPromotionId) {
		this.mPromotionId = mPromotionId;
	}

	@Id
	@Column(name="M_PROMOTIONDISTRIBUTION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53326", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_PromotionDistribution", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53326")
	public Integer getMPromotiondistributionId() {
		return mPromotiondistributionId;
	}

	public void setMPromotiondistributionId(Integer mPromotiondistributionId) {
		this.mPromotiondistributionId = mPromotiondistributionId;
	}

	@Basic
	@Column(name="M_PROMOTIONLINE_ID", columnDefinition="INT", nullable=false)
	public Integer getMPromotionlineId() {
		return mPromotionlineId;
	}

	public void setMPromotionlineId(Integer mPromotionlineId) {
		this.mPromotionlineId = mPromotionlineId;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}