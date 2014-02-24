package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_productionline")
public class MProductionline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private Integer line;
	private Integer mAttributesetinstanceId;
	private Integer mLocatorId;
	private Integer mProductId;
	private Integer mProductionlineId;
	private Integer mProductionplanId;
	private BigDecimal movementqty;
	private Boolean processed;
	private String updated;
	private Integer updatedby;

	public MProductionline() {
	}

	public MProductionline(Integer mProductionlineId) {
		this.mProductionlineId = mProductionlineId;
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
	@Column(columnDefinition="INT", nullable=false)
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
	@Column(name="M_LOCATOR_ID", columnDefinition="INT", nullable=false)
	public Integer getMLocatorId() {
		return mLocatorId;
	}

	public void setMLocatorId(Integer mLocatorId) {
		this.mLocatorId = mLocatorId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Id
	@Column(name="M_PRODUCTIONLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_249", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_ProductionLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_249")
	public Integer getMProductionlineId() {
		return mProductionlineId;
	}

	public void setMProductionlineId(Integer mProductionlineId) {
		this.mProductionlineId = mProductionlineId;
	}

	@Basic
	@Column(name="M_PRODUCTIONPLAN_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductionplanId() {
		return mProductionplanId;
	}

	public void setMProductionplanId(Integer mProductionplanId) {
		this.mProductionplanId = mProductionplanId;
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