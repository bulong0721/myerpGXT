package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_movementline")
public class MMovementline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal confirmedqty;
	private String created;
	private Integer createdby;
	private Integer ddOrderlineId;
	private String description;
	private Boolean isactive;
	private Integer line;
	private Integer mAttributesetinstanceId;
	private Integer mAttributesetinstancetoId;
	private Integer mLocatorId;
	private Integer mLocatortoId;
	private Integer mMovementId;
	private Integer mMovementlineId;
	private Integer mProductId;
	private BigDecimal movementqty;
	private Boolean processed;
	private Integer reversallineId;
	private BigDecimal scrappedqty;
	private BigDecimal targetqty;
	private String updated;
	private Integer updatedby;

	public MMovementline() {
	}

	public MMovementline(Integer mMovementlineId) {
		this.mMovementlineId = mMovementlineId;
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
	public BigDecimal getConfirmedqty() {
		return confirmedqty;
	}

	public void setConfirmedqty(BigDecimal confirmedqty) {
		this.confirmedqty = confirmedqty;
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
	@Column(name="DD_ORDERLINE_ID", columnDefinition="INT")
	public Integer getDdOrderlineId() {
		return ddOrderlineId;
	}

	public void setDdOrderlineId(Integer ddOrderlineId) {
		this.ddOrderlineId = ddOrderlineId;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(columnDefinition="INT")
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCETO_ID", columnDefinition="INT")
	public Integer getMAttributesetinstancetoId() {
		return mAttributesetinstancetoId;
	}

	public void setMAttributesetinstancetoId(Integer mAttributesetinstancetoId) {
		this.mAttributesetinstancetoId = mAttributesetinstancetoId;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_LOCATORTO_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatortoId() {
		return mLocatortoId;
	}

	public void setMLocatortoId(Integer mLocatortoId) {
		this.mLocatortoId = mLocatortoId;
	}

	@Basic
	@Column(name="M_MOVEMENT_ID", columnDefinition="INT", nullable=false)
	public Integer getMMovementId() {
		return mMovementId;
	}

	public void setMMovementId(Integer mMovementId) {
		this.mMovementId = mMovementId;
	}

	@Id
	@Column(name="M_MOVEMENTLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_247", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_MovementLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_247")
	public Integer getMMovementlineId() {
		return mMovementlineId;
	}

	public void setMMovementlineId(Integer mMovementlineId) {
		this.mMovementlineId = mMovementlineId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementqty() {
		return movementqty;
	}

	public void setMovementqty(BigDecimal movementqty) {
		this.movementqty = movementqty;
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
	@Column(name="REVERSALLINE_ID", columnDefinition="INT")
	public Integer getReversallineId() {
		return reversallineId;
	}

	public void setReversallineId(Integer reversallineId) {
		this.reversallineId = reversallineId;
	}

	@Basic
	public BigDecimal getScrappedqty() {
		return scrappedqty;
	}

	public void setScrappedqty(BigDecimal scrappedqty) {
		this.scrappedqty = scrappedqty;
	}

	@Basic
	public BigDecimal getTargetqty() {
		return targetqty;
	}

	public void setTargetqty(BigDecimal targetqty) {
		this.targetqty = targetqty;
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