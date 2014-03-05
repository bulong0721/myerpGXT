package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_withholding")
public class CWithholding extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer beneficiary;
	private Integer cPaymentTermID;
	private Integer cWithholdingID;
	private String created;
	private Integer createdBy;
	private String description;
	private BigDecimal fixAmt;
	private BigDecimal maxAmt;
	private BigDecimal minAmt;
	private String name;
	private Boolean paidTo3Party;
	private BigDecimal percent;
	private Boolean percentWithholding;
	private Boolean taxProrated;
	private Boolean taxWithholding;
	private BigDecimal thresholdMax;
	private BigDecimal thresholdmin;
	private String updated;
	private Integer updatedBy;

	public CWithholding() {
	}

	public CWithholding(Integer cWithholdingID) {
		this.cWithholdingID = cWithholdingID;
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
	@Column(columnDefinition="INT")
	public Integer getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Integer beneficiary) {
		this.beneficiary = beneficiary;
	}

	@Basic
	@Column(name="C_PAYMENTTERM_ID", columnDefinition="INT", nullable=false)
	public Integer getCPaymentTermID() {
		return cPaymentTermID;
	}

	public void setCPaymentTermID(Integer cPaymentTermID) {
		this.cPaymentTermID = cPaymentTermID;
	}

	@Id
	@Column(name="C_WITHHOLDING_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_220", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Withholding", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_220")
	public Integer getCWithholdingID() {
		return cWithholdingID;
	}

	public void setCWithholdingID(Integer cWithholdingID) {
		this.cWithholdingID = cWithholdingID;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public BigDecimal getFixAmt() {
		return fixAmt;
	}

	public void setFixAmt(BigDecimal fixAmt) {
		this.fixAmt = fixAmt;
	}

	@Basic
	public BigDecimal getMaxAmt() {
		return maxAmt;
	}

	public void setMaxAmt(BigDecimal maxAmt) {
		this.maxAmt = maxAmt;
	}

	@Basic
	public BigDecimal getMinAmt() {
		return minAmt;
	}

	public void setMinAmt(BigDecimal minAmt) {
		this.minAmt = minAmt;
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
	@Column(name="ISPAIDTO3PARTY", nullable=false)
	public Boolean isPaidTo3Party() {
		return paidTo3Party;
	}

	public void setPaidTo3Party(Boolean paidTo3Party) {
		this.paidTo3Party = paidTo3Party;
	}

	@Basic
	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	@Basic
	@Column(name="ISPERCENTWITHHOLDING", nullable=false)
	public Boolean isPercentWithholding() {
		return percentWithholding;
	}

	public void setPercentWithholding(Boolean percentWithholding) {
		this.percentWithholding = percentWithholding;
	}

	@Basic
	@Column(name="ISTAXPRORATED", nullable=false)
	public Boolean isTaxProrated() {
		return taxProrated;
	}

	public void setTaxProrated(Boolean taxProrated) {
		this.taxProrated = taxProrated;
	}

	@Basic
	@Column(name="ISTAXWITHHOLDING", nullable=false)
	public Boolean isTaxWithholding() {
		return taxWithholding;
	}

	public void setTaxWithholding(Boolean taxWithholding) {
		this.taxWithholding = taxWithholding;
	}

	@Basic
	public BigDecimal getThresholdMax() {
		return thresholdMax;
	}

	public void setThresholdMax(BigDecimal thresholdMax) {
		this.thresholdMax = thresholdMax;
	}

	@Basic
	public BigDecimal getThresholdmin() {
		return thresholdmin;
	}

	public void setThresholdmin(BigDecimal thresholdmin) {
		this.thresholdmin = thresholdmin;
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