package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_order_bom")
public class PPOrderBOM extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String bOMType;
	private String bOMUse;
	private Integer cUOMID;
	private Boolean copyFrom;
	private String created;
	private Integer createdBy;
	private String description;
	private String documentNo;
	private String help;
	private Integer mAttributeSetInstanceID;
	private Integer mChangeNoticeID;
	private Integer mProductID;
	private String name;
	private Integer pPOrderBOMID;
	private Integer pPOrderID;
	private Boolean processing;
	private String revision;
	private String updated;
	private Integer updatedBy;
	private String validFrom;
	private String validTo;
	private String value;

	public PPOrderBOM() {
	}

	public PPOrderBOM(Integer pPOrderBOMID) {
		this.pPOrderBOMID = pPOrderBOMID;
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
	@Column(length=1)
	public String getBOMType() {
		return bOMType;
	}

	public void setBOMType(String bOMType) {
		this.bOMType = bOMType;
	}

	@Basic
	@Column(length=1)
	public String getBOMUse() {
		return bOMUse;
	}

	public void setBOMUse(String bOMUse) {
		this.bOMUse = bOMUse;
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
	public Boolean isCopyFrom() {
		return copyFrom;
	}

	public void setCopyFrom(Boolean copyFrom) {
		this.copyFrom = copyFrom;
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
	@Column(length=20)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="PP_ORDER_BOM_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53023", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PP_Order_BOM", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53023")
	public Integer getPPOrderBOMID() {
		return pPOrderBOMID;
	}

	public void setPPOrderBOMID(Integer pPOrderBOMID) {
		this.pPOrderBOMID = pPOrderBOMID;
	}

	@Basic
	@Column(name="PP_ORDER_ID", columnDefinition="INT", nullable=false)
	public Integer getPPOrderID() {
		return pPOrderID;
	}

	public void setPPOrderID(Integer pPOrderID) {
		this.pPOrderID = pPOrderID;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(length=10)
	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
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

	@Basic
	@Column(nullable=false, length=80)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}