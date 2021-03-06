package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_discountschema")
public class MDiscountSchema extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Boolean bPartnerFlatDiscount;
	private String created;
	private Integer createdBy;
	private String cumulativeLevel;
	private String description;
	private String discountType;
	private BigDecimal flatDiscount;
	private Integer mDiscountSchemaID;
	private String name;
	private Boolean processing;
	private Boolean quantityBased;
	private String script;
	private String updated;
	private Integer updatedBy;
	private String validFrom;

	public MDiscountSchema() {
	}

	public MDiscountSchema(Integer mDiscountSchemaID) {
		this.mDiscountSchemaID = mDiscountSchemaID;
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
	@Column(name="ISBPARTNERFLATDISCOUNT", nullable=false)
	public Boolean isBPartnerFlatDiscount() {
		return bPartnerFlatDiscount;
	}

	public void setBPartnerFlatDiscount(Boolean bPartnerFlatDiscount) {
		this.bPartnerFlatDiscount = bPartnerFlatDiscount;
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
	@Column(length=1)
	public String getCumulativeLevel() {
		return cumulativeLevel;
	}

	public void setCumulativeLevel(String cumulativeLevel) {
		this.cumulativeLevel = cumulativeLevel;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	@Basic
	public BigDecimal getFlatDiscount() {
		return flatDiscount;
	}

	public void setFlatDiscount(BigDecimal flatDiscount) {
		this.flatDiscount = flatDiscount;
	}

	@Id
	@Column(name="M_DISCOUNTSCHEMA_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_529", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_DiscountSchema", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_529")
	public Integer getMDiscountSchemaID() {
		return mDiscountSchemaID;
	}

	public void setMDiscountSchemaID(Integer mDiscountSchemaID) {
		this.mDiscountSchemaID = mDiscountSchemaID;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="ISQUANTITYBASED", nullable=false)
	public Boolean isQuantityBased() {
		return quantityBased;
	}

	public void setQuantityBased(Boolean quantityBased) {
		this.quantityBased = quantityBased;
	}

	@Basic
	@Column(length=2000)
	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
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
	@Column(nullable=false)
	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
}