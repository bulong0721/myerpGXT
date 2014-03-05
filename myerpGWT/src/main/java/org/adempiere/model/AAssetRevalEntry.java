package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_reval_entry")
public class AAssetRevalEntry extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetRevalEntryID;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String aEffectiveDate;
	private String aRevCode;
	private String aRevalCalMethod;
	private String aRevalEffectiveDate;
	private String aRevalMultiplier;
	private Boolean active;
	private Integer cAcctSchemaID;
	private Integer cCurrencyID;
	private Integer cDocTypeID;
	private Integer cPeriodID;
	private String created;
	private Integer createdBy;
	private String dateAcct;
	private String dateDoc;
	private String description;
	private String documentNo;
	private Integer gLCategoryID;
	private String postingType;
	private Boolean processed;
	private Boolean processing;
	private String updated;
	private Integer updatedBy;

	public AAssetRevalEntry() {
	}

	public AAssetRevalEntry(Integer aAssetRevalEntryID) {
		this.aAssetRevalEntryID = aAssetRevalEntryID;
	}

	@Id
	@Column(name="A_ASSET_REVAL_ENTRY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53139", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Asset_Reval_Entry", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53139")
	public Integer getAAssetRevalEntryID() {
		return aAssetRevalEntryID;
	}

	public void setAAssetRevalEntryID(Integer aAssetRevalEntryID) {
		this.aAssetRevalEntryID = aAssetRevalEntryID;
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
	@Column(name="A_EFFECTIVE_DATE", nullable=false)
	public String getAEffectiveDate() {
		return aEffectiveDate;
	}

	public void setAEffectiveDate(String aEffectiveDate) {
		this.aEffectiveDate = aEffectiveDate;
	}

	@Basic
	@Column(name="A_REV_CODE", nullable=false, length=3)
	public String getARevCode() {
		return aRevCode;
	}

	public void setARevCode(String aRevCode) {
		this.aRevCode = aRevCode;
	}

	@Basic
	@Column(name="A_REVAL_CAL_METHOD", nullable=false, length=3)
	public String getARevalCalMethod() {
		return aRevalCalMethod;
	}

	public void setARevalCalMethod(String aRevalCalMethod) {
		this.aRevalCalMethod = aRevalCalMethod;
	}

	@Basic
	@Column(name="A_REVAL_EFFECTIVE_DATE", nullable=false, length=2)
	public String getARevalEffectiveDate() {
		return aRevalEffectiveDate;
	}

	public void setARevalEffectiveDate(String aRevalEffectiveDate) {
		this.aRevalEffectiveDate = aRevalEffectiveDate;
	}

	@Basic
	@Column(name="A_REVAL_MULTIPLIER", nullable=false, length=3)
	public String getARevalMultiplier() {
		return aRevalMultiplier;
	}

	public void setARevalMultiplier(String aRevalMultiplier) {
		this.aRevalMultiplier = aRevalMultiplier;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
	}

	@Basic
	@Column(name="C_PERIOD_ID", columnDefinition="INT")
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
	public String getDateAcct() {
		return dateAcct;
	}

	public void setDateAcct(String dateAcct) {
		this.dateAcct = dateAcct;
	}

	@Basic
	public String getDateDoc() {
		return dateDoc;
	}

	public void setDateDoc(String dateDoc) {
		this.dateDoc = dateDoc;
	}

	@Basic
	@Column(nullable=false, length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	@Column(name="GL_CATEGORY_ID", columnDefinition="INT")
	public Integer getGLCategoryID() {
		return gLCategoryID;
	}

	public void setGLCategoryID(Integer gLCategoryID) {
		this.gLCategoryID = gLCategoryID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPostingType() {
		return postingType;
	}

	public void setPostingType(String postingType) {
		this.postingType = postingType;
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
	@Column(nullable=false)
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
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