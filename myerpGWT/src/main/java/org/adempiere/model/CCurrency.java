package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_currency")
public class CCurrency extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cCurrencyID;
	private Integer costingPrecision;
	private String created;
	private Integer createdBy;
	private String curSymbol;
	private String description;
	private String eMUEntryDate;
	private Integer eMUMember;
	private BigDecimal eMURate;
	private Boolean euro;
	private String iSOCode;
	private BigDecimal roundOffFactor;
	private Integer stdPrecision;
	private String updated;
	private Integer updatedBy;

	public CCurrency() {
	}

	public CCurrency(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
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

	@Id
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_41", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Currency", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_41")
	public Integer getCCurrencyID() {
		return cCurrencyID;
	}

	public void setCCurrencyID(Integer cCurrencyID) {
		this.cCurrencyID = cCurrencyID;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCostingPrecision() {
		return costingPrecision;
	}

	public void setCostingPrecision(Integer costingPrecision) {
		this.costingPrecision = costingPrecision;
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
	@Column(length=10)
	public String getCurSymbol() {
		return curSymbol;
	}

	public void setCurSymbol(String curSymbol) {
		this.curSymbol = curSymbol;
	}

	@Basic
	@Column(nullable=false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public String getEMUEntryDate() {
		return eMUEntryDate;
	}

	public void setEMUEntryDate(String eMUEntryDate) {
		this.eMUEntryDate = eMUEntryDate;
	}

	@Basic
	@Column(name="ISEMUMEMBER", columnDefinition="INT", nullable=false)
	public Integer getEMUMember() {
		return eMUMember;
	}

	public void setEMUMember(Integer eMUMember) {
		this.eMUMember = eMUMember;
	}

	@Basic
	public BigDecimal getEMURate() {
		return eMURate;
	}

	public void setEMURate(BigDecimal eMURate) {
		this.eMURate = eMURate;
	}

	@Basic
	@Column(name="ISEURO", nullable=false)
	public Boolean isEuro() {
		return euro;
	}

	public void setEuro(Boolean euro) {
		this.euro = euro;
	}

	@Basic
	@Column(name="ISO_CODE", nullable=false, length=3)
	public String getISOCode() {
		return iSOCode;
	}

	public void setISOCode(String iSOCode) {
		this.iSOCode = iSOCode;
	}

	@Basic
	public BigDecimal getRoundOffFactor() {
		return roundOffFactor;
	}

	public void setRoundOffFactor(BigDecimal roundOffFactor) {
		this.roundOffFactor = roundOffFactor;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getStdPrecision() {
		return stdPrecision;
	}

	public void setStdPrecision(Integer stdPrecision) {
		this.stdPrecision = stdPrecision;
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