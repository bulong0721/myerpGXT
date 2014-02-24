package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_depreciation_entry")
public class ADepreciationEntry extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDepreciationEntryId;
	private String aEntryType;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private Integer cCurrencyId;
	private Integer cDoctypeId;
	private Integer cPeriodId;
	private String created;
	private Integer createdby;
	private String dateacct;
	private String datedoc;
	private String description;
	private String documentno;
	private Integer glCategoryId;
	private Boolean isactive;
	private String postingtype;
	private Boolean processed;
	private Boolean processing;
	private String updated;
	private Integer updatedby;

	public ADepreciationEntry() {
	}

	public ADepreciationEntry(Integer aDepreciationEntryId) {
		this.aDepreciationEntryId = aDepreciationEntryId;
	}

	@Id
	@Column(name="A_DEPRECIATION_ENTRY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53141", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Depreciation_Entry", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53141")
	public Integer getADepreciationEntryId() {
		return aDepreciationEntryId;
	}

	public void setADepreciationEntryId(Integer aDepreciationEntryId) {
		this.aDepreciationEntryId = aDepreciationEntryId;
	}

	@Basic
	@Column(name="A_ENTRY_TYPE", nullable=false, length=3)
	public String getAEntryType() {
		return aEntryType;
	}

	public void setAEntryType(String aEntryType) {
		this.aEntryType = aEntryType;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT", nullable=false)
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Basic
	@Column(name="C_PERIOD_ID", columnDefinition="INT", nullable=false)
	public Integer getCPeriodId() {
		return cPeriodId;
	}

	public void setCPeriodId(Integer cPeriodId) {
		this.cPeriodId = cPeriodId;
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
	@Column(nullable=false)
	public String getDateacct() {
		return dateacct;
	}

	public void setDateacct(String dateacct) {
		this.dateacct = dateacct;
	}

	@Basic
	@Column(nullable=false)
	public String getDatedoc() {
		return datedoc;
	}

	public void setDatedoc(String datedoc) {
		this.datedoc = datedoc;
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
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	@Column(name="GL_CATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getGlCategoryId() {
		return glCategoryId;
	}

	public void setGlCategoryId(Integer glCategoryId) {
		this.glCategoryId = glCategoryId;
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
	@Column(nullable=false, length=1)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
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
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}