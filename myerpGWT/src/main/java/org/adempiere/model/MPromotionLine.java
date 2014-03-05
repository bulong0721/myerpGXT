package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_promotionline")
public class MPromotionLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Integer mPromotionGroupID;
	private Integer mPromotionID;
	private Integer mPromotionLineID;
	private Boolean mandatoryPL;
	private BigDecimal minimumAmt;
	private String updated;
	private Integer updatedBy;

	public MPromotionLine() {
	}

	public MPromotionLine(Integer mPromotionLineID) {
		this.mPromotionLineID = mPromotionLineID;
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
	@Column(name="M_PROMOTIONGROUP_ID", columnDefinition="INT")
	public Integer getMPromotionGroupID() {
		return mPromotionGroupID;
	}

	public void setMPromotionGroupID(Integer mPromotionGroupID) {
		this.mPromotionGroupID = mPromotionGroupID;
	}

	@Basic
	@Column(name="M_PROMOTION_ID", columnDefinition="INT", nullable=false)
	public Integer getMPromotionID() {
		return mPromotionID;
	}

	public void setMPromotionID(Integer mPromotionID) {
		this.mPromotionID = mPromotionID;
	}

	@Id
	@Column(name="M_PROMOTIONLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53279", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_PromotionLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53279")
	public Integer getMPromotionLineID() {
		return mPromotionLineID;
	}

	public void setMPromotionLineID(Integer mPromotionLineID) {
		this.mPromotionLineID = mPromotionLineID;
	}

	@Basic
	@Column(name="ISMANDATORYPL", nullable=false)
	public Boolean isMandatoryPL() {
		return mandatoryPL;
	}

	public void setMandatoryPL(Boolean mandatoryPL) {
		this.mandatoryPL = mandatoryPL;
	}

	@Basic
	public BigDecimal getMinimumAmt() {
		return minimumAmt;
	}

	public void setMinimumAmt(BigDecimal minimumAmt) {
		this.minimumAmt = minimumAmt;
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