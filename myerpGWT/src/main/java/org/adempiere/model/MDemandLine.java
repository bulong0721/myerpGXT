package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_demandline")
public class MDemandLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cPeriodID;
	private String created;
	private Integer createdBy;
	private Integer mDemandID;
	private Integer mDemandLineID;
	private Integer mProductID;
	private BigDecimal qty;
	private BigDecimal qtyCalculated;
	private String updated;
	private Integer updatedBy;

	public MDemandLine() {
	}

	public MDemandLine(Integer mDemandLineID) {
		this.mDemandLineID = mDemandLineID;
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
	@Column(name="C_PERIOD_ID", columnDefinition="INT", nullable=false)
	public Integer getCPeriodID() {
		return cPeriodID;
	}

	public void setCPeriodID(Integer cPeriodID) {
		this.cPeriodID = cPeriodID;
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
	@Column(name="M_DEMAND_ID", columnDefinition="INT", nullable=false)
	public Integer getMDemandID() {
		return mDemandID;
	}

	public void setMDemandID(Integer mDemandID) {
		this.mDemandID = mDemandID;
	}

	@Id
	@Column(name="M_DEMANDLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_946", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_DemandLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_946")
	public Integer getMDemandLineID() {
		return mDemandLineID;
	}

	public void setMDemandLineID(Integer mDemandLineID) {
		this.mDemandLineID = mDemandLineID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
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
	@Column(nullable=false)
	public BigDecimal getQtyCalculated() {
		return qtyCalculated;
	}

	public void setQtyCalculated(BigDecimal qtyCalculated) {
		this.qtyCalculated = qtyCalculated;
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