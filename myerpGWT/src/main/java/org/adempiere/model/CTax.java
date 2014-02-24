package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_tax")
public class CTax extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adRuleId;
	private Integer cCountryId;
	private Integer cRegionId;
	private Integer cTaxId;
	private Integer cTaxcategoryId;
	private String created;
	private Integer createdby;
	private String description;
	private Boolean isactive;
	private Boolean isdefault;
	private Boolean isdocumentlevel;
	private Boolean issalestax;
	private Boolean issummary;
	private Boolean istaxexempt;
	private String name;
	private Integer parentTaxId;
	private BigDecimal rate;
	private Boolean requirestaxcertificate;
	private String sopotype;
	private String taxindicator;
	private Integer toCountryId;
	private Integer toRegionId;
	private String updated;
	private Integer updatedby;
	private String validfrom;

	public CTax() {
	}

	public CTax(Integer cTaxId) {
		this.cTaxId = cTaxId;
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
	@Column(name="AD_RULE_ID", columnDefinition="INT")
	public Integer getAdRuleId() {
		return adRuleId;
	}

	public void setAdRuleId(Integer adRuleId) {
		this.adRuleId = adRuleId;
	}

	@Basic
	@Column(name="C_COUNTRY_ID", columnDefinition="INT")
	public Integer getCCountryId() {
		return cCountryId;
	}

	public void setCCountryId(Integer cCountryId) {
		this.cCountryId = cCountryId;
	}

	@Basic
	@Column(name="C_REGION_ID", columnDefinition="INT")
	public Integer getCRegionId() {
		return cRegionId;
	}

	public void setCRegionId(Integer cRegionId) {
		this.cRegionId = cRegionId;
	}

	@Id
	@Column(name="C_TAX_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_174", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Tax", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_174")
	public Integer getCTaxId() {
		return cTaxId;
	}

	public void setCTaxId(Integer cTaxId) {
		this.cTaxId = cTaxId;
	}

	@Basic
	@Column(name="C_TAXCATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxcategoryId() {
		return cTaxcategoryId;
	}

	public void setCTaxcategoryId(Integer cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
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
	@Column(nullable=false)
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdocumentlevel() {
		return isdocumentlevel;
	}

	public void setIsdocumentlevel(Boolean isdocumentlevel) {
		this.isdocumentlevel = isdocumentlevel;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssalestax() {
		return issalestax;
	}

	public void setIssalestax(Boolean issalestax) {
		this.issalestax = issalestax;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssummary() {
		return issummary;
	}

	public void setIssummary(Boolean issummary) {
		this.issummary = issummary;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIstaxexempt() {
		return istaxexempt;
	}

	public void setIstaxexempt(Boolean istaxexempt) {
		this.istaxexempt = istaxexempt;
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
	@Column(name="PARENT_TAX_ID", columnDefinition="INT")
	public Integer getParentTaxId() {
		return parentTaxId;
	}

	public void setParentTaxId(Integer parentTaxId) {
		this.parentTaxId = parentTaxId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isRequirestaxcertificate() {
		return requirestaxcertificate;
	}

	public void setRequirestaxcertificate(Boolean requirestaxcertificate) {
		this.requirestaxcertificate = requirestaxcertificate;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getSopotype() {
		return sopotype;
	}

	public void setSopotype(String sopotype) {
		this.sopotype = sopotype;
	}

	@Basic
	@Column(length=10)
	public String getTaxindicator() {
		return taxindicator;
	}

	public void setTaxindicator(String taxindicator) {
		this.taxindicator = taxindicator;
	}

	@Basic
	@Column(name="TO_COUNTRY_ID", columnDefinition="INT")
	public Integer getToCountryId() {
		return toCountryId;
	}

	public void setToCountryId(Integer toCountryId) {
		this.toCountryId = toCountryId;
	}

	@Basic
	@Column(name="TO_REGION_ID", columnDefinition="INT")
	public Integer getToRegionId() {
		return toRegionId;
	}

	public void setToRegionId(Integer toRegionId) {
		this.toRegionId = toRegionId;
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

	@Basic
	@Column(nullable=false)
	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
}