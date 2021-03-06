package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_charge")
public class CCharge extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPartnerID;
	private Integer cChargeID;
	private Integer cChargeTypeID;
	private Integer cTaxCategoryID;
	private BigDecimal chargeAmt;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private Boolean sameCurrency;
	private Boolean sameTax;
	private Boolean taxIncluded;
	private String updated;
	private Integer updatedBy;

	public CCharge() {
	}

	public CCharge(Integer cChargeID) {
		this.cChargeID = cChargeID;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Id
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_229", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Charge", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_229")
	public Integer getCChargeID() {
		return cChargeID;
	}

	public void setCChargeID(Integer cChargeID) {
		this.cChargeID = cChargeID;
	}

	@Basic
	@Column(name="C_CHARGETYPE_ID", columnDefinition="INT")
	public Integer getCChargeTypeID() {
		return cChargeTypeID;
	}

	public void setCChargeTypeID(Integer cChargeTypeID) {
		this.cChargeTypeID = cChargeTypeID;
	}

	@Basic
	@Column(name="C_TAXCATEGORY_ID", columnDefinition="INT")
	public Integer getCTaxCategoryID() {
		return cTaxCategoryID;
	}

	public void setCTaxCategoryID(Integer cTaxCategoryID) {
		this.cTaxCategoryID = cTaxCategoryID;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(BigDecimal chargeAmt) {
		this.chargeAmt = chargeAmt;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="ISSAMECURRENCY", nullable=false)
	public Boolean isSameCurrency() {
		return sameCurrency;
	}

	public void setSameCurrency(Boolean sameCurrency) {
		this.sameCurrency = sameCurrency;
	}

	@Basic
	@Column(name="ISSAMETAX", nullable=false)
	public Boolean isSameTax() {
		return sameTax;
	}

	public void setSameTax(Boolean sameTax) {
		this.sameTax = sameTax;
	}

	@Basic
	@Column(name="ISTAXINCLUDED", nullable=false)
	public Boolean isTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(Boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
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