package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_product_bomline")
public class PPProductBOMLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private BigDecimal assay;
	private String backflushGroup;
	private Integer cUOMID;
	private String componentType;
	private BigDecimal costAllocationPerc;
	private String created;
	private Integer createdBy;
	private Boolean critical;
	private String description;
	private String feature;
	private BigDecimal forecast;
	private String help;
	private Integer leadTimeOffset;
	private Integer line;
	private Integer mAttributeSetInstanceID;
	private Integer mChangeNoticeID;
	private Integer mProductID;
	private Integer pPProductBOMID;
	private Integer pPProductBOMLineID;
	private BigDecimal qtyBOM;
	private BigDecimal qtyBatch;
	private Boolean qtyPercentage;
	private BigDecimal scrap;
	private String sueMethod;
	private String updated;
	private Integer updatedBy;
	private String validFrom;
	private String validTo;

	public PPProductBOMLine() {
	}

	public PPProductBOMLine(Integer pPProductBOMLineID) {
		this.pPProductBOMLineID = pPProductBOMLineID;
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
	public BigDecimal getAssay() {
		return assay;
	}

	public void setAssay(BigDecimal assay) {
		this.assay = assay;
	}

	@Basic
	@Column(length=20)
	public String getBackflushGroup() {
		return backflushGroup;
	}

	public void setBackflushGroup(String backflushGroup) {
		this.backflushGroup = backflushGroup;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
	}

	@Basic
	@Column(length=2)
	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	@Basic
	public BigDecimal getCostAllocationPerc() {
		return costAllocationPerc;
	}

	public void setCostAllocationPerc(BigDecimal costAllocationPerc) {
		this.costAllocationPerc = costAllocationPerc;
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
	@Column(name="ISCRITICAL")
	public Boolean isCritical() {
		return critical;
	}

	public void setCritical(Boolean critical) {
		this.critical = critical;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=30)
	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Basic
	public BigDecimal getForecast() {
		return forecast;
	}

	public void setForecast(BigDecimal forecast) {
		this.forecast = forecast;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLeadTimeOffset() {
		return leadTimeOffset;
	}

	public void setLeadTimeOffset(Integer leadTimeOffset) {
		this.leadTimeOffset = leadTimeOffset;
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
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_CHANGENOTICE_ID", columnDefinition="INT")
	public Integer getMChangeNoticeID() {
		return mChangeNoticeID;
	}

	public void setMChangeNoticeID(Integer mChangeNoticeID) {
		this.mChangeNoticeID = mChangeNoticeID;
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
	@Column(name="PP_PRODUCT_BOM_ID", columnDefinition="INT", nullable=false)
	public Integer getPPProductBOMID() {
		return pPProductBOMID;
	}

	public void setPPProductBOMID(Integer pPProductBOMID) {
		this.pPProductBOMID = pPProductBOMID;
	}

	@Id
	@Column(name="PP_PRODUCT_BOMLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53016", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PP_Product_BOMLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53016")
	public Integer getPPProductBOMLineID() {
		return pPProductBOMLineID;
	}

	public void setPPProductBOMLineID(Integer pPProductBOMLineID) {
		this.pPProductBOMLineID = pPProductBOMLineID;
	}

	@Basic
	public BigDecimal getQtyBOM() {
		return qtyBOM;
	}

	public void setQtyBOM(BigDecimal qtyBOM) {
		this.qtyBOM = qtyBOM;
	}

	@Basic
	public BigDecimal getQtyBatch() {
		return qtyBatch;
	}

	public void setQtyBatch(BigDecimal qtyBatch) {
		this.qtyBatch = qtyBatch;
	}

	@Basic
	@Column(name="ISQTYPERCENTAGE")
	public Boolean isQtyPercentage() {
		return qtyPercentage;
	}

	public void setQtyPercentage(Boolean qtyPercentage) {
		this.qtyPercentage = qtyPercentage;
	}

	@Basic
	public BigDecimal getScrap() {
		return scrap;
	}

	public void setScrap(BigDecimal scrap) {
		this.scrap = scrap;
	}

	@Basic
	@Column(name="ISSUEMETHOD", nullable=false, length=1)
	public String getSueMethod() {
		return sueMethod;
	}

	public void setSueMethod(String sueMethod) {
		this.sueMethod = sueMethod;
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

	@Basic
	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
}