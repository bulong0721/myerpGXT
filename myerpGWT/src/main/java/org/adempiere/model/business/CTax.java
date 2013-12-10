package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_tax database table.
 * 
 */
@Entity
@Table(name="c_tax")
@NamedQuery(name="CTax.findAll", query="SELECT c FROM CTax c")
public class CTax extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cTaxId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adRuleId;
	private BigDecimal cCountryId;
	private BigDecimal cRegionId;
	private BigDecimal cTaxcategoryId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private String isdefault;
	private String isdocumentlevel;
	private String issalestax;
	private String issummary;
	private String istaxexempt;
	private String name;
	private BigDecimal parentTaxId;
	private BigDecimal rate;
	private String requirestaxcertificate;
	private String sopotype;
	private String taxindicator;
	private BigDecimal toCountryId;
	private BigDecimal toRegionId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private Date validfrom;

	public CTax() {
	}


	@Id
	@Column(name="C_TAX_ID")
	public long getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(long cTaxId) {
		this.cTaxId = cTaxId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_RULE_ID")
	public BigDecimal getAdRuleId() {
		return this.adRuleId;
	}

	public void setAdRuleId(BigDecimal adRuleId) {
		this.adRuleId = adRuleId;
	}


	@Column(name="C_COUNTRY_ID")
	public BigDecimal getCCountryId() {
		return this.cCountryId;
	}

	public void setCCountryId(BigDecimal cCountryId) {
		this.cCountryId = cCountryId;
	}


	@Column(name="C_REGION_ID")
	public BigDecimal getCRegionId() {
		return this.cRegionId;
	}

	public void setCRegionId(BigDecimal cRegionId) {
		this.cRegionId = cRegionId;
	}


	@Column(name="C_TAXCATEGORY_ID")
	public BigDecimal getCTaxcategoryId() {
		return this.cTaxcategoryId;
	}

	public void setCTaxcategoryId(BigDecimal cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIsdocumentlevel() {
		return this.isdocumentlevel;
	}

	public void setIsdocumentlevel(String isdocumentlevel) {
		this.isdocumentlevel = isdocumentlevel;
	}


	public String getIssalestax() {
		return this.issalestax;
	}

	public void setIssalestax(String issalestax) {
		this.issalestax = issalestax;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	public String getIstaxexempt() {
		return this.istaxexempt;
	}

	public void setIstaxexempt(String istaxexempt) {
		this.istaxexempt = istaxexempt;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PARENT_TAX_ID")
	public BigDecimal getParentTaxId() {
		return this.parentTaxId;
	}

	public void setParentTaxId(BigDecimal parentTaxId) {
		this.parentTaxId = parentTaxId;
	}


	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}


	public String getRequirestaxcertificate() {
		return this.requirestaxcertificate;
	}

	public void setRequirestaxcertificate(String requirestaxcertificate) {
		this.requirestaxcertificate = requirestaxcertificate;
	}


	public String getSopotype() {
		return this.sopotype;
	}

	public void setSopotype(String sopotype) {
		this.sopotype = sopotype;
	}


	public String getTaxindicator() {
		return this.taxindicator;
	}

	public void setTaxindicator(String taxindicator) {
		this.taxindicator = taxindicator;
	}


	@Column(name="TO_COUNTRY_ID")
	public BigDecimal getToCountryId() {
		return this.toCountryId;
	}

	public void setToCountryId(BigDecimal toCountryId) {
		this.toCountryId = toCountryId;
	}


	@Column(name="TO_REGION_ID")
	public BigDecimal getToRegionId() {
		return this.toRegionId;
	}

	public void setToRegionId(BigDecimal toRegionId) {
		this.toRegionId = toRegionId;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getValidfrom() {
		return this.validfrom;
	}

	public void setValidfrom(Date validfrom) {
		this.validfrom = validfrom;
	}

}