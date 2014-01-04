package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pa_ratioelement")
public class PaRatioelement extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer accountId;
	private Integer adClientId;
	private Integer adOrgId;
	private BigDecimal constantvalue;
	private String created;
	private Integer createdby;
	private String description;
	private String isactive;
	private String name;
	private Integer paMeasurecalcId;
	private Integer paRatioId;
	private Integer paRatioelementId;
	private Integer paRatiousedId;
	private String postingtype;
	private String ratioelementtype;
	private String ratiooperand;
	private Integer seqno;
	private String updated;
	private Integer updatedby;

	public PaRatioelement() {
	}

	public PaRatioelement(Integer paRatioelementId) {
		this.paRatioelementId = paRatioelementId;
	}

	@Basic
	@Column(name="ACCOUNT_ID")
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
	public BigDecimal getConstantvalue() {
		return constantvalue;
	}

	public void setConstantvalue(BigDecimal constantvalue) {
		this.constantvalue = constantvalue;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name="PA_MEASURECALC_ID")
	public Integer getPaMeasurecalcId() {
		return paMeasurecalcId;
	}

	public void setPaMeasurecalcId(Integer paMeasurecalcId) {
		this.paMeasurecalcId = paMeasurecalcId;
	}

	@Basic
	@Column(name="PA_RATIO_ID", nullable=false)
	public Integer getPaRatioId() {
		return paRatioId;
	}

	public void setPaRatioId(Integer paRatioId) {
		this.paRatioId = paRatioId;
	}

	@Id
	@Column(name="PA_RATIOELEMENT_ID")
	public Integer getPaRatioelementId() {
		return paRatioelementId;
	}

	public void setPaRatioelementId(Integer paRatioelementId) {
		this.paRatioelementId = paRatioelementId;
	}

	@Basic
	@Column(name="PA_RATIOUSED_ID")
	public Integer getPaRatiousedId() {
		return paRatiousedId;
	}

	public void setPaRatiousedId(Integer paRatiousedId) {
		this.paRatiousedId = paRatiousedId;
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
	@Column(nullable=false, length=1)
	public String getRatioelementtype() {
		return ratioelementtype;
	}

	public void setRatioelementtype(String ratioelementtype) {
		this.ratioelementtype = ratioelementtype;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getRatiooperand() {
		return ratiooperand;
	}

	public void setRatiooperand(String ratiooperand) {
		this.ratiooperand = ratiooperand;
	}

	@Basic
	@Column(nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
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