package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_uom_conversion")
public class CUOMConversion extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cUOMConversionID;
	private Integer cUOMID;
	private Integer cUOMToID;
	private String created;
	private Integer createdBy;
	private BigDecimal divideRate;
	private Integer mProductID;
	private BigDecimal multiplyRate;
	private String updated;
	private Integer updatedBy;

	public CUOMConversion() {
	}

	public CUOMConversion(Integer cUOMConversionID) {
		this.cUOMConversionID = cUOMConversionID;
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

	@Id
	@Column(name="C_UOM_CONVERSION_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_63", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_UOM_Conversion", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_63")
	public Integer getCUOMConversionID() {
		return cUOMConversionID;
	}

	public void setCUOMConversionID(Integer cUOMConversionID) {
		this.cUOMConversionID = cUOMConversionID;
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
	@Column(name="C_UOM_TO_ID", columnDefinition="INT", nullable=false)
	public Integer getCUOMToID() {
		return cUOMToID;
	}

	public void setCUOMToID(Integer cUOMToID) {
		this.cUOMToID = cUOMToID;
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
	public BigDecimal getDivideRate() {
		return divideRate;
	}

	public void setDivideRate(BigDecimal divideRate) {
		this.divideRate = divideRate;
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
	@Column(nullable=false)
	public BigDecimal getMultiplyRate() {
		return multiplyRate;
	}

	public void setMultiplyRate(BigDecimal multiplyRate) {
		this.multiplyRate = multiplyRate;
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