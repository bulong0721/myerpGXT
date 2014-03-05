package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_depreciation_table_detail")
public class ADepreciationTableDetail extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private BigDecimal aDepreciationRate;
	private String aDepreciationTableCode;
	private Integer aDepreciationTableDetailID;
	private Integer aPeriod;
	private String aTableRateType;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Boolean processed;
	private String updated;
	private Integer updatedBy;

	public ADepreciationTableDetail() {
	}

	public ADepreciationTableDetail(Integer aDepreciationTableDetailID) {
		this.aDepreciationTableDetailID = aDepreciationTableDetailID;
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
	@Column(name="A_DEPRECIATION_RATE", nullable=false)
	public BigDecimal getADepreciationRate() {
		return aDepreciationRate;
	}

	public void setADepreciationRate(BigDecimal aDepreciationRate) {
		this.aDepreciationRate = aDepreciationRate;
	}

	@Basic
	@Column(name="A_DEPRECIATION_TABLE_CODE", nullable=false, length=20)
	public String getADepreciationTableCode() {
		return aDepreciationTableCode;
	}

	public void setADepreciationTableCode(String aDepreciationTableCode) {
		this.aDepreciationTableCode = aDepreciationTableCode;
	}

	@Id
	@Column(name="A_DEPRECIATION_TABLE_DETAIL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53133", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Depreciation_Table_Detail", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53133")
	public Integer getADepreciationTableDetailID() {
		return aDepreciationTableDetailID;
	}

	public void setADepreciationTableDetailID(Integer aDepreciationTableDetailID) {
		this.aDepreciationTableDetailID = aDepreciationTableDetailID;
	}

	@Basic
	@Column(name="A_PERIOD", columnDefinition="INT", nullable=false)
	public Integer getAPeriod() {
		return aPeriod;
	}

	public void setAPeriod(Integer aPeriod) {
		this.aPeriod = aPeriod;
	}

	@Basic
	@Column(name="A_TABLE_RATE_TYPE", length=2)
	public String getATableRateType() {
		return aTableRateType;
	}

	public void setATableRateType(String aTableRateType) {
		this.aTableRateType = aTableRateType;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}