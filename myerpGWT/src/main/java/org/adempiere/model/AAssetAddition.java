package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_addition")
public class AAssetAddition extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetAdditionId;
	private Integer aAssetId;
	private String aCapvsexp;
	private BigDecimal aQtyCurrent;
	private String aSourcetype;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal assetvalueamt;
	private Integer cInvoiceId;
	private Integer cInvoicelineId;
	private String created;
	private Integer createdby;
	private String description;
	private String documentno;
	private Integer glJournalbatchId;
	private String isactive;
	private Integer line;
	private Integer mInoutlineId;
	private String postingtype;
	private String updated;
	private Integer updatedby;

	public AAssetAddition() {
	}

	public AAssetAddition(Integer aAssetAdditionId) {
		this.aAssetAdditionId = aAssetAdditionId;
	}

	@Id
	@Column(name="A_ASSET_ADDITION_ID")
	public Integer getAAssetAdditionId() {
		return aAssetAdditionId;
	}

	public void setAAssetAdditionId(Integer aAssetAdditionId) {
		this.aAssetAdditionId = aAssetAdditionId;
	}

	@Basic
	@Column(name="A_ASSET_ID", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
	}

	@Basic
	@Column(name="A_CAPVSEXP", length=3)
	public String getACapvsexp() {
		return aCapvsexp;
	}

	public void setACapvsexp(String aCapvsexp) {
		this.aCapvsexp = aCapvsexp;
	}

	@Basic
	@Column(name="A_QTY_CURRENT")
	public BigDecimal getAQtyCurrent() {
		return aQtyCurrent;
	}

	public void setAQtyCurrent(BigDecimal aQtyCurrent) {
		this.aQtyCurrent = aQtyCurrent;
	}

	@Basic
	@Column(name="A_SOURCETYPE", length=3)
	public String getASourcetype() {
		return aSourcetype;
	}

	public void setASourcetype(String aSourcetype) {
		this.aSourcetype = aSourcetype;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getAssetvalueamt() {
		return assetvalueamt;
	}

	public void setAssetvalueamt(BigDecimal assetvalueamt) {
		this.assetvalueamt = assetvalueamt;
	}

	@Basic
	@Column(name="C_INVOICE_ID")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID")
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=510)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=30)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	@Column(name="GL_JOURNALBATCH_ID")
	public Integer getGlJournalbatchId() {
		return glJournalbatchId;
	}

	public void setGlJournalbatchId(Integer glJournalbatchId) {
		this.glJournalbatchId = glJournalbatchId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID")
	public Integer getMInoutlineId() {
		return mInoutlineId;
	}

	public void setMInoutlineId(Integer mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}

	@Basic
	@Column(length=1)
	public String getPostingtype() {
		return postingtype;
	}

	public void setPostingtype(String postingtype) {
		this.postingtype = postingtype;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}