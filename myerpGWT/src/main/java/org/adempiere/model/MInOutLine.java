package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_inoutline")
public class MInOutLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDOrgTrxID;
	private Boolean active;
	private Integer cActivityID;
	private Integer cCampaignID;
	private Integer cChargeID;
	private Integer cOrderLineID;
	private Integer cProjectID;
	private Integer cProjectPhaseID;
	private Integer cProjectTaskID;
	private Integer cUOMID;
	private BigDecimal confirmedQty;
	private String created;
	private Integer createdBy;
	private Boolean description;
	private Boolean invoiced;
	private Integer line;
	private Integer mAttributeSetInstanceID;
	private Integer mInOutID;
	private Integer mInOutLineID;
	private Integer mLocatorID;
	private Integer mProductID;
	private Integer mRMALineID;
	private BigDecimal movementQty;
	private BigDecimal pickedQty;
	private Boolean processed;
	private BigDecimal qtyEntered;
	private Integer refInOutLineID;
	private Integer reversalLineID;
	private BigDecimal scrappedQty;
	private BigDecimal targetQty;
	private String updated;
	private Integer updatedBy;
	private Integer user1ID;
	private Integer user2ID;

	public MInOutLine() {
	}

	public MInOutLine(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
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
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getADOrgTrxID() {
		return aDOrgTrxID;
	}

	public void setADOrgTrxID(Integer aDOrgTrxID) {
		this.aDOrgTrxID = aDOrgTrxID;
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
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityID() {
		return cActivityID;
	}

	public void setCActivityID(Integer cActivityID) {
		this.cActivityID = cActivityID;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignID() {
		return cCampaignID;
	}

	public void setCCampaignID(Integer cCampaignID) {
		this.cCampaignID = cCampaignID;
	}

	@Basic
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	public Integer getCChargeID() {
		return cChargeID;
	}

	public void setCChargeID(Integer cChargeID) {
		this.cChargeID = cChargeID;
	}

	@Basic
	@Column(name="C_ORDERLINE_ID", columnDefinition="INT")
	public Integer getCOrderLineID() {
		return cOrderLineID;
	}

	public void setCOrderLineID(Integer cOrderLineID) {
		this.cOrderLineID = cOrderLineID;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
	}

	@Basic
	@Column(name="C_PROJECTPHASE_ID", columnDefinition="INT")
	public Integer getCProjectPhaseID() {
		return cProjectPhaseID;
	}

	public void setCProjectPhaseID(Integer cProjectPhaseID) {
		this.cProjectPhaseID = cProjectPhaseID;
	}

	@Basic
	@Column(name="C_PROJECTTASK_ID", columnDefinition="INT")
	public Integer getCProjectTaskID() {
		return cProjectTaskID;
	}

	public void setCProjectTaskID(Integer cProjectTaskID) {
		this.cProjectTaskID = cProjectTaskID;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
	}

	@Basic
	public BigDecimal getConfirmedQty() {
		return confirmedQty;
	}

	public void setConfirmedQty(BigDecimal confirmedQty) {
		this.confirmedQty = confirmedQty;
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
	@Column(name="ISDESCRIPTION", nullable=false)
	public Boolean isDescription() {
		return description;
	}

	public void setDescription(Boolean description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISINVOICED", nullable=false)
	public Boolean isInvoiced() {
		return invoiced;
	}

	public void setInvoiced(Boolean invoiced) {
		this.invoiced = invoiced;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_INOUT_ID", columnDefinition="INT", nullable=false)
	public Integer getMInOutID() {
		return mInOutID;
	}

	public void setMInOutID(Integer mInOutID) {
		this.mInOutID = mInOutID;
	}

	@Id
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_257", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_InOutLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_257")
	public Integer getMInOutLineID() {
		return mInOutLineID;
	}

	public void setMInOutLineID(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT")
	public Integer getMLocatorID() {
		return mLocatorID;
	}

	public void setMLocatorID(Integer mLocatorID) {
		this.mLocatorID = mLocatorID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Basic
	@Column(name="M_RMALINE_ID", columnDefinition="INT")
	public Integer getMRMALineID() {
		return mRMALineID;
	}

	public void setMRMALineID(Integer mRMALineID) {
		this.mRMALineID = mRMALineID;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementQty() {
		return movementQty;
	}

	public void setMovementQty(BigDecimal movementQty) {
		this.movementQty = movementQty;
	}

	@Basic
	public BigDecimal getPickedQty() {
		return pickedQty;
	}

	public void setPickedQty(BigDecimal pickedQty) {
		this.pickedQty = pickedQty;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getQtyEntered() {
		return qtyEntered;
	}

	public void setQtyEntered(BigDecimal qtyEntered) {
		this.qtyEntered = qtyEntered;
	}

	@Basic
	@Column(name="REF_INOUTLINE_ID", columnDefinition="INT")
	public Integer getRefInOutLineID() {
		return refInOutLineID;
	}

	public void setRefInOutLineID(Integer refInOutLineID) {
		this.refInOutLineID = refInOutLineID;
	}

	@Basic
	@Column(name="REVERSALLINE_ID", columnDefinition="INT")
	public Integer getReversalLineID() {
		return reversalLineID;
	}

	public void setReversalLineID(Integer reversalLineID) {
		this.reversalLineID = reversalLineID;
	}

	@Basic
	public BigDecimal getScrappedQty() {
		return scrappedQty;
	}

	public void setScrappedQty(BigDecimal scrappedQty) {
		this.scrappedQty = scrappedQty;
	}

	@Basic
	public BigDecimal getTargetQty() {
		return targetQty;
	}

	public void setTargetQty(BigDecimal targetQty) {
		this.targetQty = targetQty;
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
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1ID() {
		return user1ID;
	}

	public void setUser1ID(Integer user1ID) {
		this.user1ID = user1ID;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2ID() {
		return user2ID;
	}

	public void setUser2ID(Integer user2ID) {
		this.user2ID = user2ID;
	}
}